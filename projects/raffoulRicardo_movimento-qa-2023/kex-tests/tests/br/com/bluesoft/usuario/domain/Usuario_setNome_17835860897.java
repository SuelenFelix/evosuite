package br.com.bluesoft.usuario.domain;

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
import static br.com.bluesoft.usuario.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Usuario_setNome_17835860897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435;

    public Usuario_setNome_17835860897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term435 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term473 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term435, term435.getClass(), "id", -2038273078);
        setField(term435, term435.getClass(), "nome", "HyxfbSQYBe");
        setField(term435, term435.getClass(), "cpf", "pCTimMblYc");
        setField(term435, term435.getClass(), "celular", "hNxWaHcfhY");
        setIntField(term473, term473.getClass(), "year", 2015);
        setShortField(term473, term473.getClass(), "month", (short) 4);
        setShortField(term473, term473.getClass(), "day", (short) 14);
        setField(term435, term435.getClass(), "dataNascimento", term473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        callMethod(klass, "setNome", argTypes, term435, args);
    }

};


