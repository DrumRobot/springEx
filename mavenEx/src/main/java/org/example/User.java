package org.example;

import lombok.*;

/* lombok의 Getter와 Setter 어노테이션을 사용하면
 * 모든 필드에 대한 getter와 setter를 자동 생성 */
@Getter
@Setter
@ToString
public class User {
    private String name;
}
