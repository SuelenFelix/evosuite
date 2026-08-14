package zowe.client.sdk.zosjobs.model;

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
import static zowe.client.sdk.zosjobs.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class JobFile_getLrecl_5578139309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1878;

    public JobFile_getLrecl_5578139309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1915 = new Long(-6823727938421990489L);
        Long term1917 = new Long(-484994522244390100L);
        Long term1943 = new Long(1233889271256172047L);
        Long term1969 = new Long(6617340557564669657L);
        term1878 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term1878, term1878.getClass(), "jobId", "jUbSRrkrYZ");
        setField(term1878, term1878.getClass(), "jobName", "bWWfajKbEX");
        setField(term1878, term1878.getClass(), "recfm", "cAPeiZHKGJ");
        setField(term1878, term1878.getClass(), "byteCount", term1915);
        setField(term1878, term1878.getClass(), "recordCount", term1917);
        setField(term1878, term1878.getClass(), "jobCorrelator", "LvJFtLBaxj");
        setField(term1878, term1878.getClass(), "classs", "PHvxnGHptP");
        setField(term1878, term1878.getClass(), "id", term1943);
        setField(term1878, term1878.getClass(), "ddName", "TimdotUuNC");
        setField(term1878, term1878.getClass(), "recordsUrl", "PkWMRdJcBb");
        setField(term1878, term1878.getClass(), "lrecl", term1969);
        setField(term1878, term1878.getClass(), "subSystem", "jSpAteRute");
        setField(term1878, term1878.getClass(), "stepName", "swZVeJAxjt");
        setField(term1878, term1878.getClass(), "procStep", "xOcJIiQQDu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLrecl", argTypes, term1878, args);
    }

};


