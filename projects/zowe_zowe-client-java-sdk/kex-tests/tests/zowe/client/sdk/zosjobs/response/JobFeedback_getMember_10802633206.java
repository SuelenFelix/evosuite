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

public class JobFeedback_getMember_10802633206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1127;

    public JobFeedback_getMember_10802633206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1127 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback"));
        setField(term1127, term1127.getClass(), "jobId", "UiUYnPrcCi");
        setField(term1127, term1127.getClass(), "jobName", "UoYtihxVaS");
        setField(term1127, term1127.getClass(), "originalJobId", "JDswTTCZHV");
        setField(term1127, term1127.getClass(), "owner", "onpbIeEKoi");
        setField(term1127, term1127.getClass(), "member", "YRHGsAkhxb");
        setField(term1127, term1127.getClass(), "sysname", "ffYhPOzlUs");
        setField(term1127, term1127.getClass(), "jobCorrelator", "MLqYREekMl");
        setField(term1127, term1127.getClass(), "status", "ytSBIKXogI");
        setField(term1127, term1127.getClass(), "internalCode", "nHXjMycHlU");
        setField(term1127, term1127.getClass(), "message", "ieCtQFdkii");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMember", argTypes, term1127, args);
    }

};


