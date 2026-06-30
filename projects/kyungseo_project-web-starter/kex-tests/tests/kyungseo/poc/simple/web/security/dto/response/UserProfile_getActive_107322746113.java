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

public class UserProfile_getActive_107322746113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1850;

    public UserProfile_getActive_107322746113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1850 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.response.UserProfile"));
        setField(term1850, term1850.getClass(), "id", null);
        setField(term1850, term1850.getClass(), "email", null);
        setField(term1850, term1850.getClass(), "membername", null);
        setField(term1850, term1850.getClass(), "active", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.response.UserProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActive", argTypes, term1850, args);
    }

};


