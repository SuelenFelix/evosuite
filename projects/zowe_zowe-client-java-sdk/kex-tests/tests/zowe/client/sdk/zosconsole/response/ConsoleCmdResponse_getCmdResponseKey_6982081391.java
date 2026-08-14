package zowe.client.sdk.zosconsole.response;

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
import static zowe.client.sdk.zosconsole.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ConsoleCmdResponse_getCmdResponseKey_6982081391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;

    public ConsoleCmdResponse_getCmdResponseKey_6982081391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111 = newInstance(Class.forName("zowe.client.sdk.zosconsole.response.ConsoleCmdResponse"));
        setField(term111, term111.getClass(), "cmdResponseKey", "EGtDIRbSSb");
        setField(term111, term111.getClass(), "cmdResponseUrl", "SzjVpOQTyS");
        setField(term111, term111.getClass(), "cmdResponseUri", "MjGYSRKTNF");
        setField(term111, term111.getClass(), "cmdResponse", "hRNSzYYIrc");
        setField(term111, term111.getClass(), "solKeyDetected", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosconsole.response.ConsoleCmdResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmdResponseKey", argTypes, term111, args);
    }

};


