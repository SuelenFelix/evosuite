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

public class CreateUsuarioDTO_setAvatar_2959461688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3397;

    public CreateUsuarioDTO_setAvatar_2959461688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3397 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO"));
        setField(term3397, term3397.getClass(), "username", "RbVQXSpxXy");
        setField(term3397, term3397.getClass(), "avatar", "YpJbIgJWWv");
        setField(term3397, term3397.getClass(), "fullname", "JppkknKVOw");
        setField(term3397, term3397.getClass(), "email", "iljANwuEjk");
        setField(term3397, term3397.getClass(), "password", "kNqaJKIATy");
        setField(term3397, term3397.getClass(), "password2", "vKQukfbJUd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lFRJFUMVbx";
        callMethod(klass, "setAvatar", argTypes, term3397, args);
    }

};


