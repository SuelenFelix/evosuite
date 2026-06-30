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

public class SessionScopeModel_getRole_103528877711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2288;

    public SessionScopeModel_getRole_103528877711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2288 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.SessionScopeModel"));
        setField(term2288, term2288.getClass(), "membername", null);
        setField(term2288, term2288.getClass(), "password", null);
        setField(term2288, term2288.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.SessionScopeModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term2288, args);
    }

};


