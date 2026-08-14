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
import java.lang.String;

public class JobMonitor_waitByStatus_59152353215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15989;
     Object term15993;
     Object enum6;

    public JobMonitor_waitByStatus_59152353215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15989 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term15989, term15989.getClass(), "connection", null);
        setIntField(term15989, term15989.getClass(), "attempts", 679763016);
        setIntField(term15989, term15989.getClass(), "watchDelay", 1962444399);
        setIntField(term15989, term15989.getClass(), "lineLimit", 767834723);
        Long term16105 = new Long(7994303628307559416L);
        Long term16215 = new Long(2443640364875054177L);
        term15993 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term16090 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 1);
        Object term16091 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term15993, term15993.getClass(), "jobId", "PtIjKpiSix");
        setField(term15993, term15993.getClass(), "jobName", "NZdTuwSCIM");
        setField(term15993, term15993.getClass(), "subSystem", "dDHcmzPAmP");
        setField(term15993, term15993.getClass(), "owner", "HEaTkWYBgv");
        setField(term15993, term15993.getClass(), "status", "MpJsPKLTIU");
        setField(term15993, term15993.getClass(), "type", "IiNCZfdouL");
        setField(term15993, term15993.getClass(), "classs", "AhOHzCsHKW");
        setField(term15993, term15993.getClass(), "retCode", "UqgLPaaAHi");
        setBooleanField(term16091, term16091.getClass(), "active", true);
        setField(term16091, term16091.getClass(), "smfid", "xypryEkUPF");
        setField(term16091, term16091.getClass(), "stepNumber", term16105);
        setField(term16091, term16091.getClass(), "owner", "zyZTzHNjQr");
        setField(term16091, term16091.getClass(), "programName", "YSrFKQQwXE");
        setField(term16091, term16091.getClass(), "stepName", "qxhOsmyyjm");
        setField(term16091, term16091.getClass(), "pathName", "DuKcNfVVYR");
        setField(term16091, term16091.getClass(), "procStepName", "fRujHWvXjJ");
        setField(term16091, term16091.getClass(), "completion", "EAIAAStlTz");
        setElement(term16090, 0, term16091);
        setField(term15993, term15993.getClass(), "stepData", term16090);
        setField(term15993, term15993.getClass(), "url", "yIWXcOQTgy");
        setField(term15993, term15993.getClass(), "filesUrl", "xAWekqanqc");
        setField(term15993, term15993.getClass(), "jobCorrelator", "GSOWFHMlbF");
        setField(term15993, term15993.getClass(), "phase", term16215);
        setField(term15993, term15993.getClass(), "phaseName", "vpZIqpFbKM");
        setField(term15993, term15993.getClass(), "execSystem", "dAbwpJCDif");
        setField(term15993, term15993.getClass(), "execMember", "ATSXJPySio");
        setField(term15993, term15993.getClass(), "execSubmitted", "XZkOUcbfFg");
        setField(term15993, term15993.getClass(), "execStarted", "TGiJfagfky");
        setField(term15993, term15993.getClass(), "execEnded", "BJklinBmhN");
        setField(term15993, term15993.getClass(), "reasonNotRunning", "IOddzvEWcl");
        Class<? extends Object> term16562 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term16561 = ((Class) term16562).getDeclaredField((String) "OUTPUT");
        ((Field) term16561).setAccessible(true);
        enum6 = ((Field) term16561).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        argTypes[1] = Class.forName("zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Object[] args = new Object[2];
        args[0] = term15993;
        args[1] = enum6;
        callMethod(klass, "waitByStatus", argTypes, term15989, args);
    }

};


