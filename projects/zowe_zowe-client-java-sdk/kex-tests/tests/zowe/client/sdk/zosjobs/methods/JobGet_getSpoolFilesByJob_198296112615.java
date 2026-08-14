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

public class JobGet_getSpoolFilesByJob_198296112615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6781;
     Object term6794;

    public JobGet_getSpoolFilesByJob_198296112615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6781 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobGet"));
        setField(term6781, term6781.getClass(), "connection", null);
        setField(term6781, term6781.getClass(), "request", null);
        setField(term6781, term6781.getClass(), "url", "qnvxzwuGKX");
        Long term6906 = new Long(-5892135042702373494L);
        Long term6994 = new Long(5262507301787091109L);
        Long term7082 = new Long(-6823727938421990489L);
        Long term7170 = new Long(-484994522244390100L);
        Long term7258 = new Long(1233889271256172047L);
        Long term7346 = new Long(6617340557564669657L);
        Long term7456 = new Long(1439298019805881866L);
        term6794 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term6891 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 6);
        Object term6892 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term6980 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term7068 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term7156 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term7244 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term7332 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term6794, term6794.getClass(), "jobId", "EdPAvpluZg");
        setField(term6794, term6794.getClass(), "jobName", "DzHVBMqWtE");
        setField(term6794, term6794.getClass(), "subSystem", "THZSpzBRYP");
        setField(term6794, term6794.getClass(), "owner", "ZfBIVGBQOE");
        setField(term6794, term6794.getClass(), "status", "QSrDQfEsTR");
        setField(term6794, term6794.getClass(), "type", "PsqusYmejD");
        setField(term6794, term6794.getClass(), "classs", "NTWMiBEaDF");
        setField(term6794, term6794.getClass(), "retCode", "SPBstwKFVr");
        setBooleanField(term6892, term6892.getClass(), "active", false);
        setField(term6892, term6892.getClass(), "smfid", "WxYUTuqmIq");
        setField(term6892, term6892.getClass(), "stepNumber", term6906);
        setField(term6892, term6892.getClass(), "owner", "OeQLvhVERT");
        setField(term6892, term6892.getClass(), "programName", "IlvgFINwIa");
        setField(term6892, term6892.getClass(), "stepName", "GEJABPlHSI");
        setField(term6892, term6892.getClass(), "pathName", "aQFUvuaYxd");
        setField(term6892, term6892.getClass(), "procStepName", "zNFLXMifnS");
        setField(term6892, term6892.getClass(), "completion", "HHQcYMSBVc");
        setElement(term6891, 0, term6892);
        setBooleanField(term6980, term6980.getClass(), "active", false);
        setField(term6980, term6980.getClass(), "smfid", "wdoqITnaAP");
        setField(term6980, term6980.getClass(), "stepNumber", term6994);
        setField(term6980, term6980.getClass(), "owner", "rIPMBcrNqB");
        setField(term6980, term6980.getClass(), "programName", "UDaboHZHhz");
        setField(term6980, term6980.getClass(), "stepName", "nRvKihUSPj");
        setField(term6980, term6980.getClass(), "pathName", "BbNeQJpYPr");
        setField(term6980, term6980.getClass(), "procStepName", "riMtzCoxNj");
        setField(term6980, term6980.getClass(), "completion", "YAXkVjQZcV");
        setElement(term6891, 1, term6980);
        setBooleanField(term7068, term7068.getClass(), "active", true);
        setField(term7068, term7068.getClass(), "smfid", "pumvwBWvpy");
        setField(term7068, term7068.getClass(), "stepNumber", term7082);
        setField(term7068, term7068.getClass(), "owner", "HwLHeGLyhe");
        setField(term7068, term7068.getClass(), "programName", "RDnkgWkcbz");
        setField(term7068, term7068.getClass(), "stepName", "IBpaxltauX");
        setField(term7068, term7068.getClass(), "pathName", "hePqROaplw");
        setField(term7068, term7068.getClass(), "procStepName", "PJcSNDruWd");
        setField(term7068, term7068.getClass(), "completion", "VVNNlAePXF");
        setElement(term6891, 2, term7068);
        setBooleanField(term7156, term7156.getClass(), "active", true);
        setField(term7156, term7156.getClass(), "smfid", "jnwVnmKAFv");
        setField(term7156, term7156.getClass(), "stepNumber", term7170);
        setField(term7156, term7156.getClass(), "owner", "TXyHhqeCjR");
        setField(term7156, term7156.getClass(), "programName", "lZIgPZPgTu");
        setField(term7156, term7156.getClass(), "stepName", "iuCxnHGMoW");
        setField(term7156, term7156.getClass(), "pathName", "GPSEWEDSTo");
        setField(term7156, term7156.getClass(), "procStepName", "RCOqfVsRHt");
        setField(term7156, term7156.getClass(), "completion", "TSyCeEZPaT");
        setElement(term6891, 3, term7156);
        setBooleanField(term7244, term7244.getClass(), "active", true);
        setField(term7244, term7244.getClass(), "smfid", "JeZFtaqkzW");
        setField(term7244, term7244.getClass(), "stepNumber", term7258);
        setField(term7244, term7244.getClass(), "owner", "vOVuNSCCLe");
        setField(term7244, term7244.getClass(), "programName", "fzeqPnzpnt");
        setField(term7244, term7244.getClass(), "stepName", "RxbhrFBjkO");
        setField(term7244, term7244.getClass(), "pathName", "aanyiAOJCl");
        setField(term7244, term7244.getClass(), "procStepName", "VDokbsCuqq");
        setField(term7244, term7244.getClass(), "completion", "xClUIcPECX");
        setElement(term6891, 4, term7244);
        setBooleanField(term7332, term7332.getClass(), "active", true);
        setField(term7332, term7332.getClass(), "smfid", "avhRaGZaBF");
        setField(term7332, term7332.getClass(), "stepNumber", term7346);
        setField(term7332, term7332.getClass(), "owner", "JkgoRtImdE");
        setField(term7332, term7332.getClass(), "programName", "qFGKIJjlmV");
        setField(term7332, term7332.getClass(), "stepName", "IHqvyhMtuM");
        setField(term7332, term7332.getClass(), "pathName", "dAldIGYAXV");
        setField(term7332, term7332.getClass(), "procStepName", "mLwibAPEsa");
        setField(term7332, term7332.getClass(), "completion", "zsWKWiTFuo");
        setElement(term6891, 5, term7332);
        setField(term6794, term6794.getClass(), "stepData", term6891);
        setField(term6794, term6794.getClass(), "url", "UPUbwyHQKN");
        setField(term6794, term6794.getClass(), "filesUrl", "lgQkrXANyI");
        setField(term6794, term6794.getClass(), "jobCorrelator", "MeTmRZXErV");
        setField(term6794, term6794.getClass(), "phase", term7456);
        setField(term6794, term6794.getClass(), "phaseName", "jNxbVmoZgq");
        setField(term6794, term6794.getClass(), "execSystem", "PvmBHIXaMY");
        setField(term6794, term6794.getClass(), "execMember", "hulYxtowxw");
        setField(term6794, term6794.getClass(), "execSubmitted", "GNEmuHPNcU");
        setField(term6794, term6794.getClass(), "execStarted", "IoSfuKDFRe");
        setField(term6794, term6794.getClass(), "execEnded", "AWYyZiNfsm");
        setField(term6794, term6794.getClass(), "reasonNotRunning", "ITRRYiuDwH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobGet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Object[] args = new Object[1];
        args[0] = term6794;
        callMethod(klass, "getSpoolFilesByJob", argTypes, term6781, args);
    }

};


