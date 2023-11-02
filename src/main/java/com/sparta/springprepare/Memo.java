package com.sparta.springprepare;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Memo {

    private final String username;
    private String contents;
}

class Main {

    public static void main(String[] args) {
        Memo memo = new Memo("funold");
        System.out.println(memo.getUsername());
    }
}