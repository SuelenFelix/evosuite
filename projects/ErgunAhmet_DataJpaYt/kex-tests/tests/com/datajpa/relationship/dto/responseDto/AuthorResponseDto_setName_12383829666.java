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

public class AuthorResponseDto_setName_12383829666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3744;

    public AuthorResponseDto_setName_12383829666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3745 = new Long(6855071767938501807L);
        ArrayList term3759 = new ArrayList();
        ((ArrayList) term3759).add("DbiCVtPPCT");
        ((ArrayList) term3759).add("WzFopsaDuG");
        ((ArrayList) term3759).add("PapWxkhEWe");
        ((ArrayList) term3759).add("smnHEqRFRx");
        ((ArrayList) term3759).add("XYtryyobou");
        ((ArrayList) term3759).add("OYbzXylRWW");
        ((ArrayList) term3759).add("DSNsTGYXDF");
        term3744 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto"));
        setField(term3744, term3744.getClass(), "id", term3745);
        setField(term3744, term3744.getClass(), "name", "BRIVNtfUWU");
        setField(term3744, term3744.getClass(), "bookNames", term3759);
        setField(term3744, term3744.getClass(), "zipcodeName", "sQvGcVjdEx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rLHAoqXgPh";
        callMethod(klass, "setName", argTypes, term3744, args);
    }

};


