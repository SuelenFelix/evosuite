package zowe.client.sdk.zostso.response;

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
import static zowe.client.sdk.zostso.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class TsoCommonResponse_getServletKey_16331645341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289;

    public TsoCommonResponse_getServletKey_16331645341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term314 = new Boolean(false);
        Boolean term316 = new Boolean(false);
        term289 = newInstance(Class.forName("zowe.client.sdk.zostso.response.TsoCommonResponse"));
        setField(term289, term289.getClass(), "servletKey", "MxlszYVzRf");
        setField(term289, term289.getClass(), "ver", "LQFpaHEwXR");
        setField(term289, term289.getClass(), "timeout", term314);
        setField(term289, term289.getClass(), "reused", term316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.response.TsoCommonResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getServletKey", argTypes, term289, args);
    }

};


