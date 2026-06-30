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

public class BookResponseDto_getId_5296118951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1360;

    public BookResponseDto_getId_5296118951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1361 = new Long(-8885298608300233488L);
        ArrayList term1375 = new ArrayList();
        ((ArrayList) term1375).add("dEnhdmILtU");
        ((ArrayList) term1375).add("hoicvmsovO");
        ((ArrayList) term1375).add("eqJfYWRaEL");
        ((ArrayList) term1375).add("fhkbdRViHi");
        ((ArrayList) term1375).add("uWHnvSvaPl");
        ((ArrayList) term1375).add("kBdSllIBVz");
        ((ArrayList) term1375).add("TJmVBGfTML");
        term1360 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto"));
        setField(term1360, term1360.getClass(), "id", term1361);
        setField(term1360, term1360.getClass(), "name", "ieCtQFdkii");
        setField(term1360, term1360.getClass(), "authorNames", term1375);
        setField(term1360, term1360.getClass(), "categoryName", "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1360, args);
    }

};


