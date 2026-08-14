package zowe.client.sdk.zoslogs.input;

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
import static zowe.client.sdk.zoslogs.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ZosLogInputData_getTimeRange_213602473511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7531;

    public ZosLogInputData_getTimeRange_213602473511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7531 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData"));
        setField(term7531, term7531.getClass(), "startTime", null);
        setField(term7531, term7531.getClass(), "hardCopy", null);
        setField(term7531, term7531.getClass(), "direction", null);
        setField(term7531, term7531.getClass(), "timeRange", null);
        setBooleanField(term7531, term7531.getClass(), "processResponses", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeRange", argTypes, term7531, args);
    }

};


