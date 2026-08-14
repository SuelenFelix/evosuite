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

public class JobFeedback_getOwner_3660659795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906;

    public JobFeedback_getOwner_3660659795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term906 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback"));
        setField(term906, term906.getClass(), "jobId", "UlajhuVLaP");
        setField(term906, term906.getClass(), "jobName", "gGSMzuGICf");
        setField(term906, term906.getClass(), "originalJobId", "hxCBltsObl");
        setField(term906, term906.getClass(), "owner", "BndsHwAFMv");
        setField(term906, term906.getClass(), "member", "GzFkzHGYFt");
        setField(term906, term906.getClass(), "sysname", "tShwQLRGNe");
        setField(term906, term906.getClass(), "jobCorrelator", "LvtrsXUliU");
        setField(term906, term906.getClass(), "status", "xLbjWUgOIL");
        setField(term906, term906.getClass(), "internalCode", "jDtqGUpnZN");
        setField(term906, term906.getClass(), "message", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term906, args);
    }

};


