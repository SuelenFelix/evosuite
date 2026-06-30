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

public class SessionScopeModel_toString_20396304097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2219;

    public SessionScopeModel_toString_20396304097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2219 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.SessionScopeModel"));
        setField(term2219, term2219.getClass(), "membername", "OJJtVNPyKZ");
        setField(term2219, term2219.getClass(), "password", "AKNapTAfmD");
        setField(term2219, term2219.getClass(), "role", "xJgPlLxpgC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.SessionScopeModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2219, args);
    }

};


