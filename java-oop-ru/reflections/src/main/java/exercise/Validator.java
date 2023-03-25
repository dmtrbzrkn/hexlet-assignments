package exercise;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static List<String> validate(Object object) {
        List<String> failedValidationList = new ArrayList<>();
        for (Field field : object.getClass().getDeclaredFields()) {
            NotNull notNull = field.getAnnotation(NotNull.class);
            if (notNull != null) {
                field.setAccessible(true);
                try {
                    Object value = field.get(object);
                    if (value == null) {
                        failedValidationList.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return failedValidationList;
    }
}
// END
