package com.example.githubaction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {
    @Test
    void test() {
        //when
        People people = new People("TEST");
        //then
        assertThat(people.getName()).isEqualTo("TEST");
    }
}