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

public class GetUsuarioDTO_setRoles_56971222723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2443;

    public GetUsuarioDTO_setRoles_56971222723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2443 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO"));
        setField(term2443, term2443.getClass(), "username", null);
        setField(term2443, term2443.getClass(), "avatar", null);
        setField(term2443, term2443.getClass(), "fullName", null);
        setField(term2443, term2443.getClass(), "email", null);
        setField(term2443, term2443.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRoles", argTypes, term2443, args);
    }

};


