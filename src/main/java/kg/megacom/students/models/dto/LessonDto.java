package kg.megacom.students.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class LessonDto {
    Long id;
    String day;
    GroupDto group;
}
