package com.example.githubaction;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class People {
    String name;

    public People(String name) {
        this.name = name;
    }
}
