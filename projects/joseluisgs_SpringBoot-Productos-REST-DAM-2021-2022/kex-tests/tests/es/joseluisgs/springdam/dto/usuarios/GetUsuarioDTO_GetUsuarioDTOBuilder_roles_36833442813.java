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

public class GetUsuarioDTO_GetUsuarioDTOBuilder_roles_36833442813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5135;

    public GetUsuarioDTO_GetUsuarioDTOBuilder_roles_36833442813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5135 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO$GetUsuarioDTOBuilder"));
        setField(term5135, term5135.getClass(), "username", null);
        setField(term5135, term5135.getClass(), "avatar", null);
        setField(term5135, term5135.getClass(), "fullName", null);
        setField(term5135, term5135.getClass(), "email", null);
        setField(term5135, term5135.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO$GetUsuarioDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "roles", argTypes, term5135, args);
    }

};


