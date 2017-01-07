package school.thoughtworks;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import school.thoughtworks.bean.Item;
import school.thoughtworks.mapper.ItemMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        String resource = "mybites/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        ItemMapper mapper = session.getMapper(ItemMapper.class);
        List<Item> items = mapper.findAll();

        items.stream().forEach(item -> {
            System.out.println(items.get(0).toString());
        });
    }
}
