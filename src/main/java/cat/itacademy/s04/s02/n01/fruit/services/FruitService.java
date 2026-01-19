package cat.itacademy.s04.s02.n01.fruit.services;

import cat.itacademy.s04.s02.n01.fruit.dto.FruitDTO;
import cat.itacademy.s04.s02.n01.fruit.dto.FruitResponseDTO;
import cat.itacademy.s04.s02.n01.fruit.model.Fruit;

import java.util.List;

public interface FruitService {

    FruitResponseDTO createFruit(FruitDTO fruitDTO);

    FruitResponseDTO updateFruit(Long id, FruitDTO fruitDTO);

    void removeFruit(Long id);

    FruitResponseDTO getFruitById(Long id);

    List<FruitResponseDTO> getAllFruits();
}
