package kyungseo.poc.simple.web.security.components;

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
import static kyungseo.poc.simple.web.security.components.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ActiveUserStore_getUsers_8291564764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481;

    public ActiveUserStore_getUsers_8291564764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481 = newInstance(Class.forName("kyungseo.poc.simple.web.security.components.ActiveUserStore"));
        setField(term481, term481.getClass(), "users", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.components.ActiveUserStore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsers", argTypes, term481, args);
    }

};


