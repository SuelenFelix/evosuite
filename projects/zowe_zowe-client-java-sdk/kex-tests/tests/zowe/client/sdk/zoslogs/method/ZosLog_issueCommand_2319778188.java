package zowe.client.sdk.zoslogs.method;

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
import static zowe.client.sdk.zoslogs.method.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ZosLog_issueCommand_2319778188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1812;

    public ZosLog_issueCommand_2319778188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1812 = newInstance(Class.forName("zowe.client.sdk.zoslogs.method.ZosLog"));
        setField(term1812, term1812.getClass(), "connection", null);
        setField(term1812, term1812.getClass(), "request", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.method.ZosLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "issueCommand", argTypes, term1812, args);
    }

};


