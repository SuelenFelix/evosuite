package com.datajpa.relationship.dto.responseDto;

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
import static com.datajpa.relationship.dto.responseDto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;

public class CategoryResponseDto_setBookNames_2730849606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544;
     Object term635;

    public CategoryResponseDto_setBookNames_2730849606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term545 = new Long(4872422362414183754L);
        ArrayList term559 = new ArrayList();
        ((ArrayList) term559).add("BYqFIqCKAV");
        ((ArrayList) term559).add("vrQLuWIDJX");
        ((ArrayList) term559).add("flxyYxBRtu");
        ((ArrayList) term559).add("OclPbYPkcH");
        ((ArrayList) term559).add("IoAlmYsBwc");
        ((ArrayList) term559).add("TEParAifyi");
        term544 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.CategoryResponseDto"));
        setField(term544, term544.getClass(), "id", term545);
        setField(term544, term544.getClass(), "name", "eZFUvlxvGV");
        setField(term544, term544.getClass(), "bookNames", term559);
        term635 = new LinkedList();
        ((LinkedList) term635).add("OWDIEULEFu");
        ((LinkedList) term635).add("dWRymuLBtr");
        ((LinkedList) term635).add("");
        ((LinkedList) term635).add((Object)null);
        ((LinkedList) term635).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.CategoryResponseDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term635;
        callMethod(klass, "setBookNames", argTypes, term544, args);
    }

};


