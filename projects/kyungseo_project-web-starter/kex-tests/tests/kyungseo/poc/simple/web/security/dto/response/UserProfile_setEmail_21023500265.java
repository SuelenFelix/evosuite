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

public class UserProfile_setEmail_21023500265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1606;

    public UserProfile_setEmail_21023500265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1607 = new Long(-4920224193275732920L);
        Boolean term1633 = new Boolean(true);
        term1606 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.response.UserProfile"));
        setField(term1606, term1606.getClass(), "id", term1607);
        setField(term1606, term1606.getClass(), "email", "dEnhdmILtU");
        setField(term1606, term1606.getClass(), "membername", "hoicvmsovO");
        setField(term1606, term1606.getClass(), "active", term1633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.response.UserProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eqJfYWRaEL";
        callMethod(klass, "setEmail", argTypes, term1606, args);
    }

};


