package io.zenwave360.jsonrefparser;

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
import static io.zenwave360.jsonrefparser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AuthenticationValue_withUrlPattern_2124984296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14715;

    public AuthenticationValue_withUrlPattern_2124984296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14789 = Class.forName((String) "io.zenwave360.jsonrefparser.AuthenticationValue$AuthenticationType");
        Field term14788 = ((Class) term14789).getDeclaredField((String) "HEADER");
        ((Field) term14788).setAccessible(true);
        Object enum34 = ((Field) term14788).get((Object) null);
        term14715 = newInstance(Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue"));
        Object term14750 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term14751 = (Object[]) newArray("java.lang.String", 1);
        setField(term14715, term14715.getClass(), "key", "UoYtihxVaS");
        setField(term14715, term14715.getClass(), "value", "JDswTTCZHV");
        setField(term14715, term14715.getClass(), "type", enum34);
        setElement(term14751, 0, "*");
        setField(term14750, term14750.getClass(), "a", term14751);
        setIntField(term14750, term14750.getClass(), "modCount", 0);
        setField(term14715, term14715.getClass(), "urlPatterns", term14750);
        setField(term14715, term14715.getClass(), "urlMatcher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.AuthenticationValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onpbIeEKoi";
        callMethod(klass, "withUrlPattern", argTypes, term14715, args);
    }

};


