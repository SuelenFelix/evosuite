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

public class AuthorResponseDto_setId_6561532115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3625;
     Object term3692;

    public AuthorResponseDto_setId_6561532115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3626 = new Long(1967728129628047933L);
        ArrayList term3640 = new ArrayList();
        ((ArrayList) term3640).add("HWkpTmtlrc");
        ((ArrayList) term3640).add("hMmaoREuCK");
        ((ArrayList) term3640).add("VeDtgDzGAN");
        term3625 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto"));
        setField(term3625, term3625.getClass(), "id", term3626);
        setField(term3625, term3625.getClass(), "name", "PtirvZmsGt");
        setField(term3625, term3625.getClass(), "bookNames", term3640);
        setField(term3625, term3625.getClass(), "zipcodeName", "aWYOWZFyaX");
        term3692 = new Long(2120084523938730454L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3692;
        callMethod(klass, "setId", argTypes, term3625, args);
    }

};


