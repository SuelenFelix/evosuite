package zowe.client.sdk.zosjobs.methods;

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
import static zowe.client.sdk.zosjobs.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class JobMonitor_waitByOutputStatus_84497366613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15537;
     Object term15541;

    public JobMonitor_waitByOutputStatus_84497366613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15537 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term15537, term15537.getClass(), "connection", null);
        setIntField(term15537, term15537.getClass(), "attempts", -226514366);
        setIntField(term15537, term15537.getClass(), "watchDelay", 1193880199);
        setIntField(term15537, term15537.getClass(), "lineLimit", -1087774327);
        Long term15675 = new Long(5953383087795962419L);
        term15541 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term15638 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 0);
        setField(term15541, term15541.getClass(), "jobId", "pDqgDbJoFw");
        setField(term15541, term15541.getClass(), "jobName", "iVOvTzOxwt");
        setField(term15541, term15541.getClass(), "subSystem", "BjZQdecXvB");
        setField(term15541, term15541.getClass(), "owner", "iUkOOQhEkw");
        setField(term15541, term15541.getClass(), "status", "wmVoFoUVmU");
        setField(term15541, term15541.getClass(), "type", "lLiSiPCciB");
        setField(term15541, term15541.getClass(), "classs", "PsMKIIEwdR");
        setField(term15541, term15541.getClass(), "retCode", "RbQmXqfXAT");
        setField(term15541, term15541.getClass(), "stepData", term15638);
        setField(term15541, term15541.getClass(), "url", "fcCAsvfBbe");
        setField(term15541, term15541.getClass(), "filesUrl", "mUNcKUxghj");
        setField(term15541, term15541.getClass(), "jobCorrelator", "lnvLKbtveE");
        setField(term15541, term15541.getClass(), "phase", term15675);
        setField(term15541, term15541.getClass(), "phaseName", "FfrrEhTHzQ");
        setField(term15541, term15541.getClass(), "execSystem", "LXnDNrMsqT");
        setField(term15541, term15541.getClass(), "execMember", "ZLQamJFBmu");
        setField(term15541, term15541.getClass(), "execSubmitted", "ZWcOCwKNvd");
        setField(term15541, term15541.getClass(), "execStarted", "GTmoNrziyc");
        setField(term15541, term15541.getClass(), "execEnded", "LvztehSlhM");
        setField(term15541, term15541.getClass(), "reasonNotRunning", "njvnWFTMxN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Object[] args = new Object[1];
        args[0] = term15541;
        callMethod(klass, "waitByOutputStatus", argTypes, term15537, args);
    }

};


