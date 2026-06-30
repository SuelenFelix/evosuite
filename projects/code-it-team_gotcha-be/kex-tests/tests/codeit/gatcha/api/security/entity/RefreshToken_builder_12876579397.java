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

public class RefreshToken_builder_12876579397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1671;

    public RefreshToken_builder_12876579397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1671 = newInstance(Class.forName("codeit.gatcha.api.security.entity.RefreshToken"));
        setField(term1671, term1671.getClass(), "id", null);
        setField(term1671, term1671.getClass(), "value", null);
        setField(term1671, term1671.getClass(), "userId", null);
        setField(term1671, term1671.getClass(), "creationDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "builder", argTypes, term1671, args);
    }

};


