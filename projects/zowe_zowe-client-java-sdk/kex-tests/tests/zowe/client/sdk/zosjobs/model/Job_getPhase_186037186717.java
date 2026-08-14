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

public class Job_getPhase_186037186717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19715;

    public Job_getPhase_186037186717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19827 = new Long(-4598158870068953328L);
        Long term19915 = new Long(138235087558060686L);
        Long term20003 = new Long(5381386339318883012L);
        Long term20113 = new Long(-1333707622307134180L);
        term19715 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term19812 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 3);
        Object term19813 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term19901 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term19989 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term19715, term19715.getClass(), "jobId", "wIuJvIvEMb");
        setField(term19715, term19715.getClass(), "jobName", "EyojsbSjWT");
        setField(term19715, term19715.getClass(), "subSystem", "szGicGyWDL");
        setField(term19715, term19715.getClass(), "owner", "lkdvUiYwRq");
        setField(term19715, term19715.getClass(), "status", "XuxkPrpfND");
        setField(term19715, term19715.getClass(), "type", "OxNXeKMDje");
        setField(term19715, term19715.getClass(), "classs", "hGTqHomrbc");
        setField(term19715, term19715.getClass(), "retCode", "NNMBrIWEBw");
        setBooleanField(term19813, term19813.getClass(), "active", true);
        setField(term19813, term19813.getClass(), "smfid", "GrTaccOQzl");
        setField(term19813, term19813.getClass(), "stepNumber", term19827);
        setField(term19813, term19813.getClass(), "owner", "uuSYOUCVHU");
        setField(term19813, term19813.getClass(), "programName", "DfWwbodtVw");
        setField(term19813, term19813.getClass(), "stepName", "kTbFMpVWqx");
        setField(term19813, term19813.getClass(), "pathName", "HegRNsidFg");
        setField(term19813, term19813.getClass(), "procStepName", "udRdJkgXmH");
        setField(term19813, term19813.getClass(), "completion", "FBCXbjHVXO");
        setElement(term19812, 0, term19813);
        setBooleanField(term19901, term19901.getClass(), "active", false);
        setField(term19901, term19901.getClass(), "smfid", "dIWAnvmLiC");
        setField(term19901, term19901.getClass(), "stepNumber", term19915);
        setField(term19901, term19901.getClass(), "owner", "CuWebzZQjZ");
        setField(term19901, term19901.getClass(), "programName", "wRVaaJxKYI");
        setField(term19901, term19901.getClass(), "stepName", "yOQuJXRvOo");
        setField(term19901, term19901.getClass(), "pathName", "XmLHcnVsch");
        setField(term19901, term19901.getClass(), "procStepName", "Yrvtdcltri");
        setField(term19901, term19901.getClass(), "completion", "RxrsjXRVcT");
        setElement(term19812, 1, term19901);
        setBooleanField(term19989, term19989.getClass(), "active", false);
        setField(term19989, term19989.getClass(), "smfid", "cfRimmJxqA");
        setField(term19989, term19989.getClass(), "stepNumber", term20003);
        setField(term19989, term19989.getClass(), "owner", "oOnRVGqFmy");
        setField(term19989, term19989.getClass(), "programName", "LaXzFIlWMk");
        setField(term19989, term19989.getClass(), "stepName", "GuVQjhBxma");
        setField(term19989, term19989.getClass(), "pathName", "WAVMPPbIfL");
        setField(term19989, term19989.getClass(), "procStepName", "GISHLsgALf");
        setField(term19989, term19989.getClass(), "completion", "PVykkUSgBq");
        setElement(term19812, 2, term19989);
        setField(term19715, term19715.getClass(), "stepData", term19812);
        setField(term19715, term19715.getClass(), "url", "tnKbZaCsuj");
        setField(term19715, term19715.getClass(), "filesUrl", "ZFpcYBgLNC");
        setField(term19715, term19715.getClass(), "jobCorrelator", "VAGkRppBem");
        setField(term19715, term19715.getClass(), "phase", term20113);
        setField(term19715, term19715.getClass(), "phaseName", "eKcEJRxNSu");
        setField(term19715, term19715.getClass(), "execSystem", "NTXQPWFYSA");
        setField(term19715, term19715.getClass(), "execMember", "fOuOhBpldm");
        setField(term19715, term19715.getClass(), "execSubmitted", "qQQRKGPyIM");
        setField(term19715, term19715.getClass(), "execStarted", "lzcwhvjdFg");
        setField(term19715, term19715.getClass(), "execEnded", "dfzWTjcjnI");
        setField(term19715, term19715.getClass(), "reasonNotRunning", "bsnZXGEvFv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhase", argTypes, term19715, args);
    }

};


