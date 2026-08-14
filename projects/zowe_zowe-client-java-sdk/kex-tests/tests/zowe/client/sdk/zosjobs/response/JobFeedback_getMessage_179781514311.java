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

public class JobFeedback_getMessage_179781514311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2232;

    public JobFeedback_getMessage_179781514311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2232 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback"));
        setField(term2232, term2232.getClass(), "jobId", "sEccwbJKYE");
        setField(term2232, term2232.getClass(), "jobName", "AWRooQKkdW");
        setField(term2232, term2232.getClass(), "originalJobId", "vjxIhXHxGR");
        setField(term2232, term2232.getClass(), "owner", "QXzGXbEXMu");
        setField(term2232, term2232.getClass(), "member", "qxSDVejjiY");
        setField(term2232, term2232.getClass(), "sysname", "xBsXSDjXYK");
        setField(term2232, term2232.getClass(), "jobCorrelator", "sEnIVFtZuQ");
        setField(term2232, term2232.getClass(), "status", "ZVecLZMLHF");
        setField(term2232, term2232.getClass(), "internalCode", "fztQhjqwdP");
        setField(term2232, term2232.getClass(), "message", "eVpkWxjuki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term2232, args);
    }

};


