package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DsnListInputData_init_17583539460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22274;

    public DsnListInputData_init_17583539460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22368 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term22367 = ((Class) term22368).getDeclaredField((String) "MEMBER");
        ((Field) term22367).setAccessible(true);
        Object enum20 = ((Field) term22367).get((Object) null);
        term22274 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder"));
        setField(term22274, term22274.getClass(), "volume", "LLegSTfqJt");
        setField(term22274, term22274.getClass(), "attribute", enum20);
        setField(term22274, term22274.getClass(), "maxLength", "XQfmqLbqHS");
        setField(term22274, term22274.getClass(), "start", "jLVLqQSjqg");
        setField(term22274, term22274.getClass(), "recall", "JKGueoHesL");
        setField(term22274, term22274.getClass(), "pattern", "CRAUqtVBkU");
        setField(term22274, term22274.getClass(), "responseTimeout", "DddqUYfomL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term22274;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


