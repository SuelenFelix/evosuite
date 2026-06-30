package kyungseo.poc.simple.web.security.dto;

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
import static kyungseo.poc.simple.web.security.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SessionScopeModel_setMembername_8096427684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1952;

    public SessionScopeModel_setMembername_8096427684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1952 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.SessionScopeModel"));
        setField(term1952, term1952.getClass(), "membername", "pORebkoRdD");
        setField(term1952, term1952.getClass(), "password", "mXGCWJDOqA");
        setField(term1952, term1952.getClass(), "role", "dpNsDgfPso");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.SessionScopeModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hCWPJQKpdc";
        callMethod(klass, "setMembername", argTypes, term1952, args);
    }

};


