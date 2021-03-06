package com.jyami.springsecuritypolling.payload.response;

import lombok.*;

/**
 * Created by jyami on 2020/07/31
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class ChoiceResponse {
    private long id;
    private String text;
    private long voteCount;
}
