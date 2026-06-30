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

public class CategoryResponseDto_canEqual_20857046708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term800;
     Object term927;

    public CategoryResponseDto_canEqual_20857046708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term801 = new Long(-7237588299778557629L);
        ArrayList term815 = new ArrayList();
        ((ArrayList) term815).add("IDCWpPLRkE");
        ((ArrayList) term815).add("nyiiPDVjAc");
        ((ArrayList) term815).add("aKnKipADSo");
        ((ArrayList) term815).add("wSQxaModmm");
        ((ArrayList) term815).add("UlajhuVLaP");
        ((ArrayList) term815).add("gGSMzuGICf");
        ((ArrayList) term815).add("hxCBltsObl");
        ((ArrayList) term815).add("BndsHwAFMv");
        ((ArrayList) term815).add("GzFkzHGYFt");
        term800 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.CategoryResponseDto"));
        setField(term800, term800.getClass(), "id", term801);
        setField(term800, term800.getClass(), "name", "xrwlQZdwCp");
        setField(term800, term800.getClass(), "bookNames", term815);
        term927 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.CategoryResponseDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term927;
        callMethod(klass, "canEqual", argTypes, term800, args);
    }

};


