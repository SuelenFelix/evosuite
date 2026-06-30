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

public class AuthorResponseDto_hashCode_116102382711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4644;

    public AuthorResponseDto_hashCode_116102382711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4645 = new Long(1233889271256172047L);
        ArrayList term4659 = new ArrayList();
        ((ArrayList) term4659).add("ZkMALXpEAZ");
        ((ArrayList) term4659).add("tXfQjSqDzN");
        ((ArrayList) term4659).add("BjugTaMcxJ");
        ((ArrayList) term4659).add("vGiuZVPJNH");
        ((ArrayList) term4659).add("tlzpzIjMib");
        ((ArrayList) term4659).add("AZdLeSugwv");
        ((ArrayList) term4659).add("RMsXuyzKJV");
        term4644 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto"));
        setField(term4644, term4644.getClass(), "id", term4645);
        setField(term4644, term4644.getClass(), "name", "nhoHrZfnIN");
        setField(term4644, term4644.getClass(), "bookNames", term4659);
        setField(term4644, term4644.getClass(), "zipcodeName", "FwPbDZcHmB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4644, args);
    }

};


