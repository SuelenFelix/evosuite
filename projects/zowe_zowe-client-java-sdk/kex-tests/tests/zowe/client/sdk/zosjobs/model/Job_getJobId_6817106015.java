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

public class Job_getJobId_6817106015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7331;

    public Job_getJobId_6817106015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7443 = new Long(2848819812340321742L);
        Long term7531 = new Long(-8876856890348836498L);
        Long term7619 = new Long(846579494941632714L);
        Long term7729 = new Long(6689117472719450333L);
        term7331 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term7428 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 3);
        Object term7429 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term7517 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term7605 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term7331, term7331.getClass(), "jobId", "BbNeQJpYPr");
        setField(term7331, term7331.getClass(), "jobName", "riMtzCoxNj");
        setField(term7331, term7331.getClass(), "subSystem", "YAXkVjQZcV");
        setField(term7331, term7331.getClass(), "owner", "pumvwBWvpy");
        setField(term7331, term7331.getClass(), "status", "HwLHeGLyhe");
        setField(term7331, term7331.getClass(), "type", "RDnkgWkcbz");
        setField(term7331, term7331.getClass(), "classs", "IBpaxltauX");
        setField(term7331, term7331.getClass(), "retCode", "hePqROaplw");
        setBooleanField(term7429, term7429.getClass(), "active", true);
        setField(term7429, term7429.getClass(), "smfid", "PJcSNDruWd");
        setField(term7429, term7429.getClass(), "stepNumber", term7443);
        setField(term7429, term7429.getClass(), "owner", "VVNNlAePXF");
        setField(term7429, term7429.getClass(), "programName", "jnwVnmKAFv");
        setField(term7429, term7429.getClass(), "stepName", "TXyHhqeCjR");
        setField(term7429, term7429.getClass(), "pathName", "lZIgPZPgTu");
        setField(term7429, term7429.getClass(), "procStepName", "iuCxnHGMoW");
        setField(term7429, term7429.getClass(), "completion", "GPSEWEDSTo");
        setElement(term7428, 0, term7429);
        setBooleanField(term7517, term7517.getClass(), "active", true);
        setField(term7517, term7517.getClass(), "smfid", "RCOqfVsRHt");
        setField(term7517, term7517.getClass(), "stepNumber", term7531);
        setField(term7517, term7517.getClass(), "owner", "TSyCeEZPaT");
        setField(term7517, term7517.getClass(), "programName", "JeZFtaqkzW");
        setField(term7517, term7517.getClass(), "stepName", "vOVuNSCCLe");
        setField(term7517, term7517.getClass(), "pathName", "fzeqPnzpnt");
        setField(term7517, term7517.getClass(), "procStepName", "RxbhrFBjkO");
        setField(term7517, term7517.getClass(), "completion", "aanyiAOJCl");
        setElement(term7428, 1, term7517);
        setBooleanField(term7605, term7605.getClass(), "active", true);
        setField(term7605, term7605.getClass(), "smfid", "VDokbsCuqq");
        setField(term7605, term7605.getClass(), "stepNumber", term7619);
        setField(term7605, term7605.getClass(), "owner", "xClUIcPECX");
        setField(term7605, term7605.getClass(), "programName", "avhRaGZaBF");
        setField(term7605, term7605.getClass(), "stepName", "JkgoRtImdE");
        setField(term7605, term7605.getClass(), "pathName", "qFGKIJjlmV");
        setField(term7605, term7605.getClass(), "procStepName", "IHqvyhMtuM");
        setField(term7605, term7605.getClass(), "completion", "dAldIGYAXV");
        setElement(term7428, 2, term7605);
        setField(term7331, term7331.getClass(), "stepData", term7428);
        setField(term7331, term7331.getClass(), "url", "mLwibAPEsa");
        setField(term7331, term7331.getClass(), "filesUrl", "zsWKWiTFuo");
        setField(term7331, term7331.getClass(), "jobCorrelator", "UPUbwyHQKN");
        setField(term7331, term7331.getClass(), "phase", term7729);
        setField(term7331, term7331.getClass(), "phaseName", "lgQkrXANyI");
        setField(term7331, term7331.getClass(), "execSystem", "MeTmRZXErV");
        setField(term7331, term7331.getClass(), "execMember", "jNxbVmoZgq");
        setField(term7331, term7331.getClass(), "execSubmitted", "PvmBHIXaMY");
        setField(term7331, term7331.getClass(), "execStarted", "hulYxtowxw");
        setField(term7331, term7331.getClass(), "execEnded", "GNEmuHPNcU");
        setField(term7331, term7331.getClass(), "reasonNotRunning", "IoSfuKDFRe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobId", argTypes, term7331, args);
    }

};


