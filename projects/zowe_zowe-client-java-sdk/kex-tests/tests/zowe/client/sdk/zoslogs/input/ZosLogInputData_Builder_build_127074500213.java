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

public class ZosLogInputData_Builder_build_127074500213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3552;

    public ZosLogInputData_Builder_build_127074500213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3552 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder"));
        setField(term3552, term3552.getClass(), "startTime", null);
        setField(term3552, term3552.getClass(), "hardCopy", null);
        setField(term3552, term3552.getClass(), "direction", null);
        setField(term3552, term3552.getClass(), "timeRange", null);
        setBooleanField(term3552, term3552.getClass(), "processResponses", false);
        setIntField(term3552, term3552.getClass(), "queryCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3552, args);
    }

};


