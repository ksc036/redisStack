package com.redis.om.skeleton.models;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;
import lombok.*;
import org.springframework.data.annotation.Id;

@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Document
public class User {
    @Id
    @Indexed
    private String id;

    @Indexed @NonNull
    private Integer age;

    @Indexed @NonNull
    private String name;

//    @Override
//    public String toString() {
//        return "User{" +
//                "id='" + id + '\'' +
//                ", age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
}

