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

public class JobFile_getJobCorrelator_13297134316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1191;

    public JobFile_getJobCorrelator_13297134316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1228 = new Long(-2585684163342970173L);
        Long term1230 = new Long(8059786003080744426L);
        Long term1256 = new Long(-4365849114644724155L);
        Long term1282 = new Long(2486810210675247493L);
        term1191 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term1191, term1191.getClass(), "jobId", "UoYtihxVaS");
        setField(term1191, term1191.getClass(), "jobName", "JDswTTCZHV");
        setField(term1191, term1191.getClass(), "recfm", "onpbIeEKoi");
        setField(term1191, term1191.getClass(), "byteCount", term1228);
        setField(term1191, term1191.getClass(), "recordCount", term1230);
        setField(term1191, term1191.getClass(), "jobCorrelator", "YRHGsAkhxb");
        setField(term1191, term1191.getClass(), "classs", "ffYhPOzlUs");
        setField(term1191, term1191.getClass(), "id", term1256);
        setField(term1191, term1191.getClass(), "ddName", "MLqYREekMl");
        setField(term1191, term1191.getClass(), "recordsUrl", "ytSBIKXogI");
        setField(term1191, term1191.getClass(), "lrecl", term1282);
        setField(term1191, term1191.getClass(), "subSystem", "nHXjMycHlU");
        setField(term1191, term1191.getClass(), "stepName", "ieCtQFdkii");
        setField(term1191, term1191.getClass(), "procStep", "dEnhdmILtU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobCorrelator", argTypes, term1191, args);
    }

};


