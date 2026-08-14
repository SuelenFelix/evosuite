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

public class ZosLogInputData_Builder_hardCopy_10631054709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3538;

    public ZosLogInputData_Builder_hardCopy_10631054709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3538 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder"));
        setField(term3538, term3538.getClass(), "startTime", null);
        setField(term3538, term3538.getClass(), "hardCopy", null);
        setField(term3538, term3538.getClass(), "direction", null);
        setField(term3538, term3538.getClass(), "timeRange", null);
        setBooleanField(term3538, term3538.getClass(), "processResponses", false);
        setIntField(term3538, term3538.getClass(), "queryCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zoslogs.types.HardCopyType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hardCopy", argTypes, term3538, args);
    }

};


