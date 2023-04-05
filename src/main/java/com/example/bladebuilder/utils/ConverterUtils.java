package com.example.bladebuilder.utils;

import org.springframework.core.convert.converter.Converter;

import java.util.List;
import java.util.stream.Collectors;

public class ConverterUtils {

    public static <A, B, C extends Converter<A, B>> List<B> convertList(List<A> list, C converter){
      return list.stream()
                .map(converter::convert).collect(Collectors.toList());
    }

}
