package com.codex.aposta.model.dto;

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
import static com.codex.aposta.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ApostasOut_setNumeroAposta_16778527680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;

    public ApostasOut_setNumeroAposta_16778527680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term150 = new Long(2442117782898005296L);
        term137 = newInstance(Class.forName("com.codex.aposta.model.dto.ApostasOut"));
        setField(term137, term137.getClass(), "numeroAposta", "SzjVpOQTyS");
        setField(term137, term137.getClass(), "idApostador", term150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codex.aposta.model.dto.ApostasOut");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        callMethod(klass, "setNumeroAposta", argTypes, term137, args);
    }

};


