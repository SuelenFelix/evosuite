package kyungseo.poc.simple.web.appcore.exception;

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
import static kyungseo.poc.simple.web.appcore.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class ErrorResponse_init_16330151810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object term23442;

    public ErrorResponse_init_16330151810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24115 = Class.forName((String) "kyungseo.poc.simple.web.appcore.exception.ErrorCode");
        Field term24114 = ((Class) term24115).getDeclaredField((String) "NO_AUTHORITY");
        ((Field) term24114).setAccessible(true);
        enum0 = ((Field) term24114).get((Object) null);
        Object term23445 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.exception.ErrorResponse$FieldError"));
        setField(term23445, term23445.getClass(), "field", "HyxfbSQYBe");
        setField(term23445, term23445.getClass(), "value", "pCTimMblYc");
        setField(term23445, term23445.getClass(), "reason", "hNxWaHcfhY");
        term23442 = new LinkedList();
        ((LinkedList) term23442).add(term23445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.exception.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.appcore.exception.ErrorCode");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = enum0;
        args[1] = term23442;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


