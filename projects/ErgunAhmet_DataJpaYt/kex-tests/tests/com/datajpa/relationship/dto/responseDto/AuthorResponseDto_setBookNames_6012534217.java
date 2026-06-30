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

public class AuthorResponseDto_setBookNames_6012534217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3971;
     Object term4026;

    public AuthorResponseDto_setBookNames_6012534217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3972 = new Long(-5892135042702373494L);
        ArrayList term3986 = new ArrayList();
        ((ArrayList) term3986).add("vwbEQQNQrx");
        ((ArrayList) term3986).add("xtftXXMbem");
        term3971 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto"));
        setField(term3971, term3971.getClass(), "id", term3972);
        setField(term3971, term3971.getClass(), "name", "zUlRdimJtU");
        setField(term3971, term3971.getClass(), "bookNames", term3986);
        setField(term3971, term3971.getClass(), "zipcodeName", "cudZvLMQon");
        term4026 = new LinkedList();
        ((LinkedList) term4026).add("lihXWlGDxk");
        ((LinkedList) term4026).add("JmcmxoGhIK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4026;
        callMethod(klass, "setBookNames", argTypes, term3971, args);
    }

};


