package zowe.client.sdk.zoslogs.response;

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
import static zowe.client.sdk.zoslogs.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ZosLogResponse_getTimeZone_19862571928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930;

    public ZosLogResponse_getTimeZone_19862571928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term930 = newInstance(Class.forName("zowe.client.sdk.zoslogs.response.ZosLogResponse"));
        setLongField(term930, term930.getClass(), "timeZone", 0L);
        setLongField(term930, term930.getClass(), "nextTimeStamp", 0L);
        setField(term930, term930.getClass(), "source", null);
        setLongField(term930, term930.getClass(), "totalItems", 0L);
        setField(term930, term930.getClass(), "items", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.response.ZosLogResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeZone", argTypes, term930, args);
    }

};


