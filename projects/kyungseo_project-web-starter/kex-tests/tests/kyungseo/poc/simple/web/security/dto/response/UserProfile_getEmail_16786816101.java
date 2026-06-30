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
import java.lang.Long;
import java.lang.Boolean;

public class UserProfile_getEmail_16786816101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1408;

    public UserProfile_getEmail_16786816101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1409 = new Long(-5476826692763582090L);
        Boolean term1435 = new Boolean(true);
        term1408 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.response.UserProfile"));
        setField(term1408, term1408.getClass(), "id", term1409);
        setField(term1408, term1408.getClass(), "email", "JDswTTCZHV");
        setField(term1408, term1408.getClass(), "membername", "onpbIeEKoi");
        setField(term1408, term1408.getClass(), "active", term1435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.response.UserProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1408, args);
    }

};


