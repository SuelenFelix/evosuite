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

public class ErrorResponse_init_5097525411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1;

    public ErrorResponse_init_5097525411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24476 = Class.forName((String) "kyungseo.poc.simple.web.appcore.exception.ErrorCode");
        Field term24475 = ((Class) term24476).getDeclaredField((String) "NEED_LOGIN");
        ((Field) term24475).setAccessible(true);
        enum1 = ((Field) term24475).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.exception.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.appcore.exception.ErrorCode");
        Object[] args = new Object[1];
        args[0] = enum1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


