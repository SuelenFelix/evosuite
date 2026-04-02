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

public class Usuario_equals_214198433111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793;
     Object term835;

    public Usuario_equals_214198433111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term793 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term831 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term793, term793.getClass(), "id", -522618178);
        setField(term793, term793.getClass(), "nome", "SbAoxhfrkn");
        setField(term793, term793.getClass(), "cpf", "kuTXqwMtDB");
        setField(term793, term793.getClass(), "celular", "Ghbwtircqb");
        setIntField(term831, term831.getClass(), "year", 2020);
        setShortField(term831, term831.getClass(), "month", (short) 5);
        setShortField(term831, term831.getClass(), "day", (short) 14);
        setField(term793, term793.getClass(), "dataNascimento", term831);
        term835 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term835;
        callMethod(klass, "equals", argTypes, term793, args);
    }

};


