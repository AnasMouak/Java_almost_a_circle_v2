package models;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Base {
    private static int nb_objects = 0;
    protected int id;

    public Base() {
        this(null); // Calls the constructor with id set to null
    }

    public Base(Integer id) {
        if (id != null) {
            this.id = id;
        } else {
            nb_objects++;
            this.id = nb_objects;
        }
    }

    public Integer getId() {
        return id;
    }

    public static String toJsonString(List<?> listDictionaries) {
        ObjectMapper objectMapper = new ObjectMapper();
        
        if (listDictionaries == null || listDictionaries.isEmpty()) {
            return "[]";
        }
        
        try {
            return objectMapper.writeValueAsString(listDictionaries);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void saveToFile(List<? extends Base> listObjs) {
        // If listObjs is null, initialize it as an empty list
        if (listObjs == null) {
            listObjs = List.of();
        }

        ObjectMapper mapper = new ObjectMapper();
        String filename = listObjs.isEmpty() ? "Base.json" : listObjs.get(0).getClass().getSimpleName() + ".json";

        // Convert each object to a dictionary using toDictionary() method
        List<Map<String, Object>> listOfDicts = listObjs.stream()
            .map(obj -> ((Rectangle) obj).toDict())
            .collect(Collectors.toList());

        try {
            // Write the list of dictionaries to a JSON file
            mapper.writeValue(new File(filename), listOfDicts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Map<String, Object>> FromJsonString(String json) {

        if (json == null || json.isEmpty()) {
            return Collections.emptyList();
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, new TypeReference<List<Map<String, Object>>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}