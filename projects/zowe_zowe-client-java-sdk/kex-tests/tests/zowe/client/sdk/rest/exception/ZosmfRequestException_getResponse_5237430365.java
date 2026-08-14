package zowe.client.sdk.rest.exception;

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
import static zowe.client.sdk.rest.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ZosmfRequestException_getResponse_5237430365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8436;

    public ZosmfRequestException_getResponse_5237430365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8436 = newInstance(Class.forName("zowe.client.sdk.rest.exception.ZosmfRequestException"));
        setField(term8436, term8436.getClass(), "response", null);
        setField(term8436, term8436.getClass(), "backtrace", null);
        setField(term8436, term8436.getClass(), "detailMessage", null);
        setField(term8436, term8436.getClass(), "cause", null);
        setField(term8436, term8436.getClass(), "stackTrace", null);
        setIntField(term8436, term8436.getClass(), "depth", 0);
        setField(term8436, term8436.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.rest.exception.ZosmfRequestException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponse", argTypes, term8436, args);
    }

};


