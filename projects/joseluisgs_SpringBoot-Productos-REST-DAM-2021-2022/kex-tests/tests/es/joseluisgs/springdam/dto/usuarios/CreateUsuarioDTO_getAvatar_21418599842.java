package es.joseluisgs.springdam.dto.usuarios;

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
import static es.joseluisgs.springdam.dto.usuarios.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateUsuarioDTO_getAvatar_21418599842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2577;

    public CreateUsuarioDTO_getAvatar_21418599842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2577 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO"));
        setField(term2577, term2577.getClass(), "username", "FPvxVzzSvD");
        setField(term2577, term2577.getClass(), "avatar", "WHcwFgsGFC");
        setField(term2577, term2577.getClass(), "fullname", "HzqpegHiRq");
        setField(term2577, term2577.getClass(), "email", "jwsfVjMoJT");
        setField(term2577, term2577.getClass(), "password", "ZfdXfCCFDf");
        setField(term2577, term2577.getClass(), "password2", "MwwjNtdOFT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatar", argTypes, term2577, args);
    }

};


