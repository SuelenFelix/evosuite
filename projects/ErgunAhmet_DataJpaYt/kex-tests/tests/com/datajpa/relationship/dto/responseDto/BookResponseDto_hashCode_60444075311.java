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

public class BookResponseDto_hashCode_60444075311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2669;

    public BookResponseDto_hashCode_60444075311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2670 = new Long(8059786003080744426L);
        ArrayList term2684 = new ArrayList();
        ((ArrayList) term2684).add("XylxrMBraH");
        term2669 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto"));
        setField(term2669, term2669.getClass(), "id", term2670);
        setField(term2669, term2669.getClass(), "name", "iNwOJRBEjp");
        setField(term2669, term2669.getClass(), "authorNames", term2684);
        setField(term2669, term2669.getClass(), "categoryName", "pORebkoRdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2669, args);
    }

};


