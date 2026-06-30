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

public class BookResponseDto_toString_9368106312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2742;

    public BookResponseDto_toString_9368106312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2743 = new Long(-4365849114644724155L);
        ArrayList term2757 = new ArrayList();
        ((ArrayList) term2757).add("dpNsDgfPso");
        ((ArrayList) term2757).add("hCWPJQKpdc");
        ((ArrayList) term2757).add("WzMEhMXkKx");
        ((ArrayList) term2757).add("XOiDvlDhdc");
        ((ArrayList) term2757).add("AdxvLJhNLe");
        ((ArrayList) term2757).add("lHfTrWKMPk");
        ((ArrayList) term2757).add("JDaAnsVTGV");
        ((ArrayList) term2757).add("mLUZFTfjle");
        ((ArrayList) term2757).add("xIeFjkHkOe");
        term2742 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto"));
        setField(term2742, term2742.getClass(), "id", term2743);
        setField(term2742, term2742.getClass(), "name", "mXGCWJDOqA");
        setField(term2742, term2742.getClass(), "authorNames", term2757);
        setField(term2742, term2742.getClass(), "categoryName", "SdCKLMIYnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.BookResponseDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2742, args);
    }

};


