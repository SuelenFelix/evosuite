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

public class JobFeedback_getOriginalJobId_15858707134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685;

    public JobFeedback_getOriginalJobId_15858707134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term685 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback"));
        setField(term685, term685.getClass(), "jobId", "dWRymuLBtr");
        setField(term685, term685.getClass(), "jobName", "AijpHYOFuy");
        setField(term685, term685.getClass(), "originalJobId", "SbAoxhfrkn");
        setField(term685, term685.getClass(), "owner", "kuTXqwMtDB");
        setField(term685, term685.getClass(), "member", "Ghbwtircqb");
        setField(term685, term685.getClass(), "sysname", "xrwlQZdwCp");
        setField(term685, term685.getClass(), "jobCorrelator", "IDCWpPLRkE");
        setField(term685, term685.getClass(), "status", "nyiiPDVjAc");
        setField(term685, term685.getClass(), "internalCode", "aKnKipADSo");
        setField(term685, term685.getClass(), "message", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOriginalJobId", argTypes, term685, args);
    }

};


