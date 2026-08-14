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

public class TsoCommonResponse_getTimeout_4467953283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387;

    public TsoCommonResponse_getTimeout_4467953283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term412 = new Boolean(true);
        Boolean term414 = new Boolean(true);
        term387 = newInstance(Class.forName("zowe.client.sdk.zostso.response.TsoCommonResponse"));
        setField(term387, term387.getClass(), "servletKey", "ZiaGIbnzTs");
        setField(term387, term387.getClass(), "ver", "tbcdzjIfER");
        setField(term387, term387.getClass(), "timeout", term412);
        setField(term387, term387.getClass(), "reused", term414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.response.TsoCommonResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeout", argTypes, term387, args);
    }

};


