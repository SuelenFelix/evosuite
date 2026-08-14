package zowe.client.sdk.zosjobs.response;

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
import static zowe.client.sdk.zosjobs.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JobFeedback_toString_142674341225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2685;

    public JobFeedback_toString_142674341225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2685 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback"));
        setField(term2685, term2685.getClass(), "jobId", null);
        setField(term2685, term2685.getClass(), "jobName", null);
        setField(term2685, term2685.getClass(), "originalJobId", null);
        setField(term2685, term2685.getClass(), "owner", null);
        setField(term2685, term2685.getClass(), "member", null);
        setField(term2685, term2685.getClass(), "sysname", null);
        setField(term2685, term2685.getClass(), "jobCorrelator", null);
        setField(term2685, term2685.getClass(), "status", null);
        setField(term2685, term2685.getClass(), "internalCode", null);
        setField(term2685, term2685.getClass(), "message", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2685, args);
    }

};


