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

public class Usuario_setCpf_15632974358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529;

    public Usuario_setCpf_15632974358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term529 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term567 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term529, term529.getClass(), "id", 1227103734);
        setField(term529, term529.getClass(), "nome", "xOEqzGAmDU");
        setField(term529, term529.getClass(), "cpf", "eZFUvlxvGV");
        setField(term529, term529.getClass(), "celular", "BYqFIqCKAV");
        setIntField(term567, term567.getClass(), "year", 2017);
        setShortField(term567, term567.getClass(), "month", (short) 5);
        setShortField(term567, term567.getClass(), "day", (short) 21);
        setField(term529, term529.getClass(), "dataNascimento", term567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        callMethod(klass, "setCpf", argTypes, term529, args);
    }

};


