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

public class AuthorResponseDto_toString_65026413712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4849;

    public AuthorResponseDto_toString_65026413712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4850 = new Long(6617340557564669657L);
        ArrayList term4864 = new ArrayList();
        ((ArrayList) term4864).add("QduALnDSVo");
        ((ArrayList) term4864).add("izPpKDErnQ");
        term4849 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto"));
        setField(term4849, term4849.getClass(), "id", term4850);
        setField(term4849, term4849.getClass(), "name", "hOncybyCAH");
        setField(term4849, term4849.getClass(), "bookNames", term4864);
        setField(term4849, term4849.getClass(), "zipcodeName", "NnpwZBUTvx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4849, args);
    }

};


