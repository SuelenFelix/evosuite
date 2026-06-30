package com.datajpa.relationship.dto;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.datajpa.relationship.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class mapper_bookToBookResponseDto_9950673651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5424;

    public mapper_bookToBookResponseDto_9950673651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5425 = new Long(-1468719814009985452L);
        ArrayList term5439 = new ArrayList();
        Long term5444 = new Long(-7738503207562305297L);
        ArrayList term5458 = new ArrayList();
        term5424 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term5443 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term5424, term5424.getClass(), "id", term5425);
        setField(term5424, term5424.getClass(), "name", "HBGNxdNURv");
        setField(term5424, term5424.getClass(), "authors", term5439);
        setField(term5443, term5443.getClass(), "id", term5444);
        setField(term5443, term5443.getClass(), "name", "mfCpTPPQQm");
        setField(term5443, term5443.getClass(), "books", term5458);
        setField(term5424, term5424.getClass(), "category", term5443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.mapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.model.Book");
        Object[] args = new Object[1];
        args[0] = term5424;
        callMethod(klass, "bookToBookResponseDto", argTypes, null, args);
    }

};


