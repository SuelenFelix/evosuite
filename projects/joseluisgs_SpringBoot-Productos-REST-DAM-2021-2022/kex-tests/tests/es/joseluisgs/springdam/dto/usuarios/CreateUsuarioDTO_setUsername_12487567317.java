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

public class CreateUsuarioDTO_setUsername_12487567317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3242;

    public CreateUsuarioDTO_setUsername_12487567317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3242 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO"));
        setField(term3242, term3242.getClass(), "username", "JmcmxoGhIK");
        setField(term3242, term3242.getClass(), "avatar", "jXzmYyrnnT");
        setField(term3242, term3242.getClass(), "fullname", "igCAtimmYB");
        setField(term3242, term3242.getClass(), "email", "DyiXbeYIaN");
        setField(term3242, term3242.getClass(), "password", "VGizxZnyHX");
        setField(term3242, term3242.getClass(), "password2", "kVEZMHmRtR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ekxGuOYIwi";
        callMethod(klass, "setUsername", argTypes, term3242, args);
    }

};


