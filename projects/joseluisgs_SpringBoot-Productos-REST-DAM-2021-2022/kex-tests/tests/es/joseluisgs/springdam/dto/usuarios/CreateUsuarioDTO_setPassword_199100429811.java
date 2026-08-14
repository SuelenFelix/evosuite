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

public class CreateUsuarioDTO_setPassword_199100429811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3862;

    public CreateUsuarioDTO_setPassword_199100429811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3862 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO"));
        setField(term3862, term3862.getClass(), "username", "vGiuZVPJNH");
        setField(term3862, term3862.getClass(), "avatar", "tlzpzIjMib");
        setField(term3862, term3862.getClass(), "fullname", "AZdLeSugwv");
        setField(term3862, term3862.getClass(), "email", "RMsXuyzKJV");
        setField(term3862, term3862.getClass(), "password", "FwPbDZcHmB");
        setField(term3862, term3862.getClass(), "password2", "hOncybyCAH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QduALnDSVo";
        callMethod(klass, "setPassword", argTypes, term3862, args);
    }

};


