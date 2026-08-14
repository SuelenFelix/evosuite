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
import java.lang.Boolean;

public class ZosLogInputData_Builder_processResponses_75462957212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3547;
     Object term3550;

    public ZosLogInputData_Builder_processResponses_75462957212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3547 = newInstance(Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder"));
        setField(term3547, term3547.getClass(), "startTime", null);
        setField(term3547, term3547.getClass(), "hardCopy", null);
        setField(term3547, term3547.getClass(), "direction", null);
        setField(term3547, term3547.getClass(), "timeRange", null);
        setBooleanField(term3547, term3547.getClass(), "processResponses", false);
        setIntField(term3547, term3547.getClass(), "queryCount", 0);
        term3550 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.input.ZosLogInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3550;
        callMethod(klass, "processResponses", argTypes, term3547, args);
    }

};


