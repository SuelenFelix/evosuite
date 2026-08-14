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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class GetUsuarioDTO_getFullName_4635135073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1415;

    public GetUsuarioDTO_getFullName_4635135073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1465 = new HashMap();
        Set<Object> term1517 =  ((Map) term1465).keySet();
        HashSet term1464 = new HashSet((Collection<? extends Object>) term1517);
        term1415 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO"));
        setField(term1415, term1415.getClass(), "username", "IgRJUzaCwW");
        setField(term1415, term1415.getClass(), "avatar", "JUmudUmaaV");
        setField(term1415, term1415.getClass(), "fullName", "KoyGrUJeJW");
        setField(term1415, term1415.getClass(), "email", "HqBOwkVqjD");
        setField(term1415, term1415.getClass(), "roles", term1464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullName", argTypes, term1415, args);
    }

};


