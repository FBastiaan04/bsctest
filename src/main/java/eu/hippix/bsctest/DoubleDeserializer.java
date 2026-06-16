package eu.hippix.bsctest;

import com.google.gson.*;
import java.lang.reflect.Type;

public class DoubleDeserializer implements JsonDeserializer<Double> {
    @Override
    public Double deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        String value = json.getAsString();

        // Check for empty string
        if (value == null || value.isEmpty()) {
            return -1.0;
        }

        // Otherwise parse normally
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new JsonParseException("Unable to parse double: " + value, e);
        }
    }
}