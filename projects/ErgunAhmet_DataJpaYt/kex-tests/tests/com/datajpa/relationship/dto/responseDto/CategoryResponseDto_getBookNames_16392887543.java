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

public class CategoryResponseDto_getBookNames_16392887543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257;

    public CategoryResponseDto_getBookNames_16392887543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term258 = new Long(-8257434502486459194L);
        ArrayList term272 = new ArrayList();
        ((ArrayList) term272).add("MxlszYVzRf");
        ((ArrayList) term272).add("LQFpaHEwXR");
        ((ArrayList) term272).add("oVcInYnLWB");
        term257 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.CategoryResponseDto"));
        setField(term257, term257.getClass(), "id", term258);
        setField(term257, term257.getClass(), "name", "uuaPigETmJ");
        setField(term257, term257.getClass(), "bookNames", term272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.CategoryResponseDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBookNames", argTypes, term257, args);
    }

};


