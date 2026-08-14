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

public class JwtUserResponse_JwtUserResponseBuilder_token_19226477336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1151;

    public JwtUserResponse_JwtUserResponseBuilder_token_19226477336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1201 = new HashMap();
        Set<Object> term1283 =  ((Map) term1201).keySet();
        HashSet term1200 = new HashSet((Collection<? extends Object>) term1283);
        term1151 = newInstance(Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse$JwtUserResponseBuilder"));
        setField(term1151, term1151.getClass(), "username", "PHvxnGHptP");
        setField(term1151, term1151.getClass(), "avatar", "TimdotUuNC");
        setField(term1151, term1151.getClass(), "fullName", "PkWMRdJcBb");
        setField(term1151, term1151.getClass(), "email", "jSpAteRute");
        setField(term1151, term1151.getClass(), "roles", term1200);
        setField(term1151, term1151.getClass(), "token", "JiVRgTZvKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse$JwtUserResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XPKmummaqg";
        callMethod(klass, "token", argTypes, term1151, args);
    }

};


