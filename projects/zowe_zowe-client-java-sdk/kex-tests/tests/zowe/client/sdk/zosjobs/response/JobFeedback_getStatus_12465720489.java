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

public class JobFeedback_getStatus_12465720489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1790;

    public JobFeedback_getStatus_12465720489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1790 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback"));
        setField(term1790, term1790.getClass(), "jobId", "VgZnGoIFwQ");
        setField(term1790, term1790.getClass(), "jobName", "jUbSRrkrYZ");
        setField(term1790, term1790.getClass(), "originalJobId", "bWWfajKbEX");
        setField(term1790, term1790.getClass(), "owner", "cAPeiZHKGJ");
        setField(term1790, term1790.getClass(), "member", "LvJFtLBaxj");
        setField(term1790, term1790.getClass(), "sysname", "PHvxnGHptP");
        setField(term1790, term1790.getClass(), "jobCorrelator", "TimdotUuNC");
        setField(term1790, term1790.getClass(), "status", "PkWMRdJcBb");
        setField(term1790, term1790.getClass(), "internalCode", "jSpAteRute");
        setField(term1790, term1790.getClass(), "message", "swZVeJAxjt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term1790, args);
    }

};


