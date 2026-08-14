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

public class Job_getRetCode_164382833312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14713;

    public Job_getRetCode_164382833312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14825 = new Long(1084801489398441516L);
        Long term14935 = new Long(6273754186658578034L);
        term14713 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term14810 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 1);
        Object term14811 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term14713, term14713.getClass(), "jobId", "EBYHwsuWAU");
        setField(term14713, term14713.getClass(), "jobName", "PtIjKpiSix");
        setField(term14713, term14713.getClass(), "subSystem", "NZdTuwSCIM");
        setField(term14713, term14713.getClass(), "owner", "dDHcmzPAmP");
        setField(term14713, term14713.getClass(), "status", "HEaTkWYBgv");
        setField(term14713, term14713.getClass(), "type", "MpJsPKLTIU");
        setField(term14713, term14713.getClass(), "classs", "IiNCZfdouL");
        setField(term14713, term14713.getClass(), "retCode", "AhOHzCsHKW");
        setBooleanField(term14811, term14811.getClass(), "active", true);
        setField(term14811, term14811.getClass(), "smfid", "UqgLPaaAHi");
        setField(term14811, term14811.getClass(), "stepNumber", term14825);
        setField(term14811, term14811.getClass(), "owner", "xypryEkUPF");
        setField(term14811, term14811.getClass(), "programName", "zyZTzHNjQr");
        setField(term14811, term14811.getClass(), "stepName", "YSrFKQQwXE");
        setField(term14811, term14811.getClass(), "pathName", "qxhOsmyyjm");
        setField(term14811, term14811.getClass(), "procStepName", "DuKcNfVVYR");
        setField(term14811, term14811.getClass(), "completion", "fRujHWvXjJ");
        setElement(term14810, 0, term14811);
        setField(term14713, term14713.getClass(), "stepData", term14810);
        setField(term14713, term14713.getClass(), "url", "EAIAAStlTz");
        setField(term14713, term14713.getClass(), "filesUrl", "yIWXcOQTgy");
        setField(term14713, term14713.getClass(), "jobCorrelator", "xAWekqanqc");
        setField(term14713, term14713.getClass(), "phase", term14935);
        setField(term14713, term14713.getClass(), "phaseName", "GSOWFHMlbF");
        setField(term14713, term14713.getClass(), "execSystem", "vpZIqpFbKM");
        setField(term14713, term14713.getClass(), "execMember", "dAbwpJCDif");
        setField(term14713, term14713.getClass(), "execSubmitted", "ATSXJPySio");
        setField(term14713, term14713.getClass(), "execStarted", "XZkOUcbfFg");
        setField(term14713, term14713.getClass(), "execEnded", "TGiJfagfky");
        setField(term14713, term14713.getClass(), "reasonNotRunning", "BJklinBmhN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRetCode", argTypes, term14713, args);
    }

};


