package kyungseo.poc.simple.web.security.dto.response;

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
import static kyungseo.poc.simple.web.security.dto.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserProfile_setMembername_53257375716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1853;

    public UserProfile_setMembername_53257375716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1853 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.response.UserProfile"));
        setField(term1853, term1853.getClass(), "id", null);
        setField(term1853, term1853.getClass(), "email", null);
        setField(term1853, term1853.getClass(), "membername", null);
        setField(term1853, term1853.getClass(), "active", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.response.UserProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMembername", argTypes, term1853, args);
    }

};


