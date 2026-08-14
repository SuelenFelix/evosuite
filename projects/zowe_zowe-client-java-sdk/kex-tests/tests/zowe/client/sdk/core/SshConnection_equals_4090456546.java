package zowe.client.sdk.core;

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
import static zowe.client.sdk.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SshConnection_equals_4090456546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;
     Object term447;

    public SshConnection_equals_4090456546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409 = newInstance(Class.forName("zowe.client.sdk.core.SshConnection"));
        setField(term409, term409.getClass(), "host", "HyxfbSQYBe");
        setIntField(term409, term409.getClass(), "port", -1955890973);
        setField(term409, term409.getClass(), "user", "pCTimMblYc");
        setField(term409, term409.getClass(), "password", "hNxWaHcfhY");
        term447 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.core.SshConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term447;
        callMethod(klass, "equals", argTypes, term409, args);
    }

};


