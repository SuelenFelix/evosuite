package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Member_getPfUrl_57722996218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12469;

    public Member_getPfUrl_57722996218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12469 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term12469, term12469.getClass(), "memberNum", -430151637);
        setField(term12469, term12469.getClass(), "memberNumHash", "zMsSLTfGhl");
        setField(term12469, term12469.getClass(), "email", "bEmHScVZaQ");
        setField(term12469, term12469.getClass(), "pwd", "TcuXODkzBV");
        setField(term12469, term12469.getClass(), "nickName", "coJPjrBZNe");
        setField(term12469, term12469.getClass(), "countryCode", "vMsWjuPTnO");
        setIntField(term12469, term12469.getClass(), "age", -1697741339);
        setField(term12469, term12469.getClass(), "gender", "zHvfKaOstO");
        setField(term12469, term12469.getClass(), "pfUrl", "tOszriqETr");
        setIntField(term12469, term12469.getClass(), "mg", 98922530);
        setIntField(term12469, term12469.getClass(), "status", -1388471422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPfUrl", argTypes, term12469, args);
    }

};


