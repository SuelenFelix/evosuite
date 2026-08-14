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

public class GetUsuarioDTO_setFullName_11228289338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1972;

    public GetUsuarioDTO_setFullName_11228289338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2022 = new HashMap();
        Set<Object> term2090 =  ((Map) term2022).keySet();
        HashSet term2021 = new HashSet((Collection<? extends Object>) term2090);
        term1972 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO"));
        setField(term1972, term1972.getClass(), "username", "fztQhjqwdP");
        setField(term1972, term1972.getClass(), "avatar", "eVpkWxjuki");
        setField(term1972, term1972.getClass(), "fullName", "SJiQaLvSKv");
        setField(term1972, term1972.getClass(), "email", "OEXDRUKcFl");
        setField(term1972, term1972.getClass(), "roles", term2021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mXGCWJDOqA";
        callMethod(klass, "setFullName", argTypes, term1972, args);
    }

};


