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
import java.lang.Object;
import java.lang.Long;

public class Job_Builder_execSystem_13998688415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44375;

    public Job_Builder_execSystem_13998688415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term44509 = new Long(7271112616766426991L);
        term44375 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term44472 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 0);
        setField(term44375, term44375.getClass(), "jobId", "bOZSTccXbt");
        setField(term44375, term44375.getClass(), "jobName", "MBSsxxeNUU");
        setField(term44375, term44375.getClass(), "subSystem", "NmUhmPLSgG");
        setField(term44375, term44375.getClass(), "owner", "WJosrfBMfA");
        setField(term44375, term44375.getClass(), "status", "ttlGywalKc");
        setField(term44375, term44375.getClass(), "type", "rQFBspqBzf");
        setField(term44375, term44375.getClass(), "classs", "FmWhAOGAMI");
        setField(term44375, term44375.getClass(), "retCode", "GdjCkRsIrS");
        setField(term44375, term44375.getClass(), "stepData", term44472);
        setField(term44375, term44375.getClass(), "url", "MJNyYzLhkh");
        setField(term44375, term44375.getClass(), "filesUrl", "DEugGJIaYt");
        setField(term44375, term44375.getClass(), "jobCorrelator", "lzZIObOJmC");
        setField(term44375, term44375.getClass(), "phase", term44509);
        setField(term44375, term44375.getClass(), "phaseName", "RFmGKwvSgz");
        setField(term44375, term44375.getClass(), "execSystem", "EUEUhZglna");
        setField(term44375, term44375.getClass(), "execMember", "znDPtjpZrG");
        setField(term44375, term44375.getClass(), "execSubmitted", "uodLjxczjr");
        setField(term44375, term44375.getClass(), "execStarted", "HJLVBQAtGs");
        setField(term44375, term44375.getClass(), "execEnded", "dxAxECMYEm");
        setField(term44375, term44375.getClass(), "reasonNotRunning", "ylGHeywyhx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SqMpUczXhg";
        callMethod(klass, "execSystem", argTypes, term44375, args);
    }

};


