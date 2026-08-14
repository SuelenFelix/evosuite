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

public class JobFeedback_getJobCorrelator_16656726808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1569;

    public JobFeedback_getJobCorrelator_16656726808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1569 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback"));
        setField(term1569, term1569.getClass(), "jobId", "IgRJUzaCwW");
        setField(term1569, term1569.getClass(), "jobName", "JUmudUmaaV");
        setField(term1569, term1569.getClass(), "originalJobId", "KoyGrUJeJW");
        setField(term1569, term1569.getClass(), "owner", "HqBOwkVqjD");
        setField(term1569, term1569.getClass(), "member", "MAcUBcBckh");
        setField(term1569, term1569.getClass(), "sysname", "oVgzLbrsFr");
        setField(term1569, term1569.getClass(), "jobCorrelator", "vQVyKLdtaz");
        setField(term1569, term1569.getClass(), "status", "OWKQODBLzb");
        setField(term1569, term1569.getClass(), "internalCode", "wGmYcqUkgE");
        setField(term1569, term1569.getClass(), "message", "idgaQsnJpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobCorrelator", argTypes, term1569, args);
    }

};


