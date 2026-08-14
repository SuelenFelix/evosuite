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

public class TsoCommonResponse_toString_169747697411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term538;

    public TsoCommonResponse_toString_169747697411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term538 = newInstance(Class.forName("zowe.client.sdk.zostso.response.TsoCommonResponse"));
        setField(term538, term538.getClass(), "servletKey", null);
        setField(term538, term538.getClass(), "ver", null);
        setField(term538, term538.getClass(), "timeout", null);
        setField(term538, term538.getClass(), "reused", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.response.TsoCommonResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term538, args);
    }

};


