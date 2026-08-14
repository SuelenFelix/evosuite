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

public class ApostaOut_getNumeroAposta_4990634511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355;

    public ApostaOut_getNumeroAposta_4990634511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355 = newInstance(Class.forName("com.codex.aposta.model.dto.ApostaOut"));
        setField(term355, term355.getClass(), "numeroAposta", "aJlieCFVtF");
        setField(term355, term355.getClass(), "nomeApostador", "ZiaGIbnzTs");
        setField(term355, term355.getClass(), "emailApostador", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codex.aposta.model.dto.ApostaOut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumeroAposta", argTypes, term355, args);
    }

};


