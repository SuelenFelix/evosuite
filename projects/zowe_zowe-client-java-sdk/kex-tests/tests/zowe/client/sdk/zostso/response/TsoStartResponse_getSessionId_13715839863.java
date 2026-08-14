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

public class TsoStartResponse_getSessionId_13715839863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public TsoStartResponse_getSessionId_13715839863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139 = newInstance(Class.forName("zowe.client.sdk.zostso.response.TsoStartResponse"));
        setBooleanField(term139, term139.getClass(), "success", false);
        setField(term139, term139.getClass(), "sessionId", "SzjVpOQTyS");
        setField(term139, term139.getClass(), "response", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.response.TsoStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSessionId", argTypes, term139, args);
    }

};


