package programmerzamannow.spring.core;

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
import static programmerzamannow.spring.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DependencyInjectionConfiguration_fooBar_7306198714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456;
     Object term457;
     Object term458;

    public DependencyInjectionConfiguration_fooBar_7306198714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term456 = newInstance(Class.forName("programmerzamannow.spring.core.DependencyInjectionConfiguration"));
        term457 = newInstance(Class.forName("programmerzamannow.spring.core.data.Foo"));
        term458 = newInstance(Class.forName("programmerzamannow.spring.core.data.Bar"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.DependencyInjectionConfiguration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("programmerzamannow.spring.core.data.Foo");
        argTypes[1] = Class.forName("programmerzamannow.spring.core.data.Bar");
        Object[] args = new Object[2];
        args[0] = term457;
        args[1] = term458;
        callMethod(klass, "fooBar", argTypes, term456, args);
    }

};


