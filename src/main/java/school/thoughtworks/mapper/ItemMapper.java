package school.thoughtworks.mapper;

import school.thoughtworks.bean.Item;

import java.util.List;

public interface ItemMapper {
    List<Item> findAll();
}