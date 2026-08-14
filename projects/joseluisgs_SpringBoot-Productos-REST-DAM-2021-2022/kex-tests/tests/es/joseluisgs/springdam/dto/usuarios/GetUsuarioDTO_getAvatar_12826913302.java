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

public class GetUsuarioDTO_getAvatar_12826913302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1312;

    public GetUsuarioDTO_getAvatar_12826913302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1362 = new HashMap();
        Set<Object> term1414 =  ((Map) term1362).keySet();
        HashSet term1361 = new HashSet((Collection<? extends Object>) term1414);
        term1312 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO"));
        setField(term1312, term1312.getClass(), "username", "eqJfYWRaEL");
        setField(term1312, term1312.getClass(), "avatar", "fhkbdRViHi");
        setField(term1312, term1312.getClass(), "fullName", "uWHnvSvaPl");
        setField(term1312, term1312.getClass(), "email", "kBdSllIBVz");
        setField(term1312, term1312.getClass(), "roles", term1361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatar", argTypes, term1312, args);
    }

};


