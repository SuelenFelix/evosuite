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

public class SessionScopeModel_getRole_10352887773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1885;

    public SessionScopeModel_getRole_10352887773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1885 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.SessionScopeModel"));
        setField(term1885, term1885.getClass(), "membername", "MvRIxilFMJ");
        setField(term1885, term1885.getClass(), "password", "iNwOJRBEjp");
        setField(term1885, term1885.getClass(), "role", "XylxrMBraH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.SessionScopeModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term1885, args);
    }

};


