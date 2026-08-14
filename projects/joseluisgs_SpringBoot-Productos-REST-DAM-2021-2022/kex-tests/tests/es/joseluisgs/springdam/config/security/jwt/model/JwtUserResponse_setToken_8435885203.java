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

public class JwtUserResponse_setToken_8435885203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;

    public JwtUserResponse_setToken_8435885203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term330 = new HashMap();
        Set<Object> term397 =  ((Map) term330).keySet();
        HashSet term329 = new HashSet((Collection<? extends Object>) term397);
        term268 = newInstance(Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse"));
        setField(term268, term268.getClass(), "token", "BYqFIqCKAV");
        setField(term268, term268.getClass(), "username", "vrQLuWIDJX");
        setField(term268, term268.getClass(), "avatar", "flxyYxBRtu");
        setField(term268, term268.getClass(), "fullName", "OclPbYPkcH");
        setField(term268, term268.getClass(), "email", "IoAlmYsBwc");
        setField(term268, term268.getClass(), "roles", term329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "setToken", argTypes, term268, args);
    }

};


