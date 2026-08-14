package es.joseluisgs.springdam.config.security.jwt.model;

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
import static es.joseluisgs.springdam.config.security.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JwtUserResponse_JwtUserResponseBuilder_roles_1712586525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1002;
     Object term1069;

    public JwtUserResponse_JwtUserResponseBuilder_roles_1712586525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1052 = new HashMap();
        Set<Object> term1139 =  ((Map) term1052).keySet();
        HashSet term1051 = new HashSet((Collection<? extends Object>) term1139);
        term1002 = newInstance(Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse$JwtUserResponseBuilder"));
        setField(term1002, term1002.getClass(), "username", "JUmudUmaaV");
        setField(term1002, term1002.getClass(), "avatar", "KoyGrUJeJW");
        setField(term1002, term1002.getClass(), "fullName", "HqBOwkVqjD");
        setField(term1002, term1002.getClass(), "email", "MAcUBcBckh");
        setField(term1002, term1002.getClass(), "roles", term1051);
        setField(term1002, term1002.getClass(), "token", "oVgzLbrsFr");
        HashMap term1070 = new HashMap();
        Set<Object> term1150 =  ((Map) term1070).keySet();
        term1069 = new HashSet((Collection<? extends Object>) term1150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse$JwtUserResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1069;
        callMethod(klass, "roles", argTypes, term1002, args);
    }

};


