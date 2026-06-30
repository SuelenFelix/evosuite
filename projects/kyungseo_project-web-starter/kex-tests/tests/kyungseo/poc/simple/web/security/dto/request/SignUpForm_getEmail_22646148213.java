package kyungseo.poc.simple.web.security.dto.request;

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
import static kyungseo.poc.simple.web.security.dto.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SignUpForm_getEmail_22646148213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1548;

    public SignUpForm_getEmail_22646148213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1548 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm"));
        setField(term1548, term1548.getClass(), "membername", null);
        setField(term1548, term1548.getClass(), "email", null);
        setField(term1548, term1548.getClass(), "role", null);
        setField(term1548, term1548.getClass(), "password", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1548, args);
    }

};


