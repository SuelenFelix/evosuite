package com.codex.aposta.service;

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
import static com.codex.aposta.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ApostadorService_salvaApostador_14521304430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ApostadorService_salvaApostador_14521304430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.codex.aposta.model.dto.ApostadorIn"));
        setField(term1, term1.getClass(), "nome", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "email", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codex.aposta.service.ApostadorService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.codex.aposta.model.dto.ApostadorIn");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "salvaApostador", argTypes, null, args);
    }

};


