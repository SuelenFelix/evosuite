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

public class JobFeedback_getJobId_7495801502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243;

    public JobFeedback_getJobId_7495801502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback"));
        setField(term243, term243.getClass(), "jobId", "uuaPigETmJ");
        setField(term243, term243.getClass(), "jobName", "MxlszYVzRf");
        setField(term243, term243.getClass(), "originalJobId", "LQFpaHEwXR");
        setField(term243, term243.getClass(), "owner", "oVcInYnLWB");
        setField(term243, term243.getClass(), "member", "aJlieCFVtF");
        setField(term243, term243.getClass(), "sysname", "ZiaGIbnzTs");
        setField(term243, term243.getClass(), "jobCorrelator", "tbcdzjIfER");
        setField(term243, term243.getClass(), "status", "HyxfbSQYBe");
        setField(term243, term243.getClass(), "internalCode", "pCTimMblYc");
        setField(term243, term243.getClass(), "message", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobId", argTypes, term243, args);
    }

};


