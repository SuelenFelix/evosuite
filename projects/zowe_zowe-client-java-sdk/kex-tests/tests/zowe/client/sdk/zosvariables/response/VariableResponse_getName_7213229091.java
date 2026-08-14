package zowe.client.sdk.zosvariables.response;

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
import static zowe.client.sdk.zosvariables.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VariableResponse_getName_7213229091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416;

    public VariableResponse_getName_7213229091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term416 = newInstance(Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse"));
        setField(term416, term416.getClass(), "name", "XqgfKFvPSD");
        setField(term416, term416.getClass(), "value", "JiVRgTZvKc");
        setField(term416, term416.getClass(), "description", "XPKmummaqg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.response.VariableResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term416, args);
    }

};


