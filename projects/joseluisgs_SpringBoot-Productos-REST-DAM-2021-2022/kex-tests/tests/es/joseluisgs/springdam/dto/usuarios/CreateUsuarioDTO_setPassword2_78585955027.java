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

public class CreateUsuarioDTO_setPassword2_78585955027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4316;

    public CreateUsuarioDTO_setPassword2_78585955027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4316 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO"));
        setField(term4316, term4316.getClass(), "username", null);
        setField(term4316, term4316.getClass(), "avatar", null);
        setField(term4316, term4316.getClass(), "fullname", null);
        setField(term4316, term4316.getClass(), "email", null);
        setField(term4316, term4316.getClass(), "password", null);
        setField(term4316, term4316.getClass(), "password2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPassword2", argTypes, term4316, args);
    }

};


