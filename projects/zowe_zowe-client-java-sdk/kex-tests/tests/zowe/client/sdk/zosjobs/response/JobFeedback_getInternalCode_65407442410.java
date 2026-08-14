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

public class JobFeedback_getInternalCode_65407442410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2011;

    public JobFeedback_getInternalCode_65407442410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2011 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback"));
        setField(term2011, term2011.getClass(), "jobId", "xOcJIiQQDu");
        setField(term2011, term2011.getClass(), "jobName", "GVizqqzXpy");
        setField(term2011, term2011.getClass(), "originalJobId", "JqXGgAhZPl");
        setField(term2011, term2011.getClass(), "owner", "jiKYgYHqIS");
        setField(term2011, term2011.getClass(), "member", "DfISiziTgG");
        setField(term2011, term2011.getClass(), "sysname", "XqgfKFvPSD");
        setField(term2011, term2011.getClass(), "jobCorrelator", "JiVRgTZvKc");
        setField(term2011, term2011.getClass(), "status", "XPKmummaqg");
        setField(term2011, term2011.getClass(), "internalCode", "BKLfkLiZTH");
        setField(term2011, term2011.getClass(), "message", "SPpkrGcPRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInternalCode", argTypes, term2011, args);
    }

};


