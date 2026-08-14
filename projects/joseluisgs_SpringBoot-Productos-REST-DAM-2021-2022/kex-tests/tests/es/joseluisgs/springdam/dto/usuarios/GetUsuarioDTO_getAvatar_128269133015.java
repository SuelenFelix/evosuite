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

public class GetUsuarioDTO_getAvatar_128269133015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2435;

    public GetUsuarioDTO_getAvatar_128269133015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2435 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO"));
        setField(term2435, term2435.getClass(), "username", null);
        setField(term2435, term2435.getClass(), "avatar", null);
        setField(term2435, term2435.getClass(), "fullName", null);
        setField(term2435, term2435.getClass(), "email", null);
        setField(term2435, term2435.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatar", argTypes, term2435, args);
    }

};


