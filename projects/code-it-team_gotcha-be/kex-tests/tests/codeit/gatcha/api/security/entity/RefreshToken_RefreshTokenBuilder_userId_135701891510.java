package codeit.gatcha.api.security.entity;

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
import static codeit.gatcha.api.security.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RefreshToken_RefreshTokenBuilder_userId_135701891510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1936;

    public RefreshToken_RefreshTokenBuilder_userId_135701891510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1936 = newInstance(Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder"));
        setField(term1936, term1936.getClass(), "id", null);
        setField(term1936, term1936.getClass(), "value", null);
        setField(term1936, term1936.getClass(), "userId", null);
        setField(term1936, term1936.getClass(), "creationDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "userId", argTypes, term1936, args);
    }

};


