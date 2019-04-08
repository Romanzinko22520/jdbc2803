package ua.com.owu;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults (level = AccessLevel.PRIVATE)
public class Contact {

    int id;
    String name;
    String email;
}
