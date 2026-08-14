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

public class GetUsuarioDTO_setRoles_56971222710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2232;
     Object term2290;

    public GetUsuarioDTO_setRoles_56971222710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2282 = new HashMap();
        Set<Object> term2336 =  ((Map) term2282).keySet();
        HashSet term2281 = new HashSet((Collection<? extends Object>) term2336);
        term2232 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO"));
        setField(term2232, term2232.getClass(), "username", "xJgPlLxpgC");
        setField(term2232, term2232.getClass(), "avatar", "EYtfuJaxiM");
        setField(term2232, term2232.getClass(), "fullName", "gCWtLVKVVe");
        setField(term2232, term2232.getClass(), "email", "fWKJoSoCwE");
        setField(term2232, term2232.getClass(), "roles", term2281);
        HashMap term2291 = new HashMap();
        Set<Object> term2337 =  ((Map) term2291).keySet();
        term2290 = new HashSet((Collection<? extends Object>) term2337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term2290;
        callMethod(klass, "setRoles", argTypes, term2232, args);
    }

};


