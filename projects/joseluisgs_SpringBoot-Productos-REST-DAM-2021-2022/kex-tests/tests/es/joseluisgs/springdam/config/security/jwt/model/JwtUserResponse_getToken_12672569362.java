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

public class JwtUserResponse_getToken_12672569362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public JwtUserResponse_getToken_12672569362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term197 = new HashMap();
        Set<Object> term267 =  ((Map) term197).keySet();
        HashSet term196 = new HashSet((Collection<? extends Object>) term267);
        term135 = newInstance(Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse"));
        setField(term135, term135.getClass(), "token", "NRdvgJlhkX");
        setField(term135, term135.getClass(), "username", "uuaPigETmJ");
        setField(term135, term135.getClass(), "avatar", "MxlszYVzRf");
        setField(term135, term135.getClass(), "fullName", "LQFpaHEwXR");
        setField(term135, term135.getClass(), "email", "oVcInYnLWB");
        setField(term135, term135.getClass(), "roles", term196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term135, args);
    }

};


