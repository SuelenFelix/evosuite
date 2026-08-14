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

public class JobFeedback_toString_142674341212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2453;

    public JobFeedback_toString_142674341212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2453 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback"));
        setField(term2453, term2453.getClass(), "jobId", "SJiQaLvSKv");
        setField(term2453, term2453.getClass(), "jobName", "OEXDRUKcFl");
        setField(term2453, term2453.getClass(), "originalJobId", "RYdKCNNMBR");
        setField(term2453, term2453.getClass(), "owner", "yGtHPyvYiQ");
        setField(term2453, term2453.getClass(), "member", "MvRIxilFMJ");
        setField(term2453, term2453.getClass(), "sysname", "iNwOJRBEjp");
        setField(term2453, term2453.getClass(), "jobCorrelator", "XylxrMBraH");
        setField(term2453, term2453.getClass(), "status", "pORebkoRdD");
        setField(term2453, term2453.getClass(), "internalCode", "mXGCWJDOqA");
        setField(term2453, term2453.getClass(), "message", "dpNsDgfPso");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2453, args);
    }

};


