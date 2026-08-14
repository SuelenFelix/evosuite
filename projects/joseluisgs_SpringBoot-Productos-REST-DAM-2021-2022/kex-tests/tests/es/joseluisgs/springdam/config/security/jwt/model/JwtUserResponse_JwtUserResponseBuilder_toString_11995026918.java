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

public class JwtUserResponse_JwtUserResponseBuilder_toString_11995026918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1425;

    public JwtUserResponse_JwtUserResponseBuilder_toString_11995026918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1475 = new HashMap();
        Set<Object> term1543 =  ((Map) term1475).keySet();
        HashSet term1474 = new HashSet((Collection<? extends Object>) term1543);
        term1425 = newInstance(Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse$JwtUserResponseBuilder"));
        setField(term1425, term1425.getClass(), "username", "qxSDVejjiY");
        setField(term1425, term1425.getClass(), "avatar", "xBsXSDjXYK");
        setField(term1425, term1425.getClass(), "fullName", "sEnIVFtZuQ");
        setField(term1425, term1425.getClass(), "email", "ZVecLZMLHF");
        setField(term1425, term1425.getClass(), "roles", term1474);
        setField(term1425, term1425.getClass(), "token", "MvRIxilFMJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse$JwtUserResponseBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1425, args);
    }

};


