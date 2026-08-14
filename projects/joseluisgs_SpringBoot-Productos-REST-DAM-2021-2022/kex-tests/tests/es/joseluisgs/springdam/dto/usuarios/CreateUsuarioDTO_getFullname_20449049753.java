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

public class CreateUsuarioDTO_getFullname_20449049753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2710;

    public CreateUsuarioDTO_getFullname_20449049753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2710 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO"));
        setField(term2710, term2710.getClass(), "username", "VYkqXKVlAJ");
        setField(term2710, term2710.getClass(), "avatar", "XkIoWJRNwN");
        setField(term2710, term2710.getClass(), "fullname", "aNWLJdrZMq");
        setField(term2710, term2710.getClass(), "email", "HHmNoYxIGj");
        setField(term2710, term2710.getClass(), "password", "PtirvZmsGt");
        setField(term2710, term2710.getClass(), "password2", "HWkpTmtlrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullname", argTypes, term2710, args);
    }

};


