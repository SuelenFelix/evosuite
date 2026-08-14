package zowe.client.sdk.rest;

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
import static zowe.client.sdk.rest.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RestConstant_1_checkClientTrusted_10130342971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9314;
     Object term9315;

    public RestConstant_1_checkClientTrusted_10130342971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9314 = newInstance(Class.forName("zowe.client.sdk.rest.RestConstant$1"));
        term9315 = (Object[]) newArray("java.security.cert.X509Certificate", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.rest.RestConstant$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term9315;
        args[1] = "xOEqzGAmDU";
        callMethod(klass, "checkClientTrusted", argTypes, term9314, args);
    }

};


