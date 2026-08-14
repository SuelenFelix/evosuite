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

public class JwtUserResponse_JwtUserResponseBuilder_username_11190810421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411;

    public JwtUserResponse_JwtUserResponseBuilder_username_11190810421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term461 = new HashMap();
        Set<Object> term539 =  ((Map) term461).keySet();
        HashSet term460 = new HashSet((Collection<? extends Object>) term539);
        term411 = newInstance(Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse$JwtUserResponseBuilder"));
        setField(term411, term411.getClass(), "username", "OWDIEULEFu");
        setField(term411, term411.getClass(), "avatar", "dWRymuLBtr");
        setField(term411, term411.getClass(), "fullName", "AijpHYOFuy");
        setField(term411, term411.getClass(), "email", "SbAoxhfrkn");
        setField(term411, term411.getClass(), "roles", term460);
        setField(term411, term411.getClass(), "token", "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse$JwtUserResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aKnKipADSo";
        callMethod(klass, "username", argTypes, term411, args);
    }

};


