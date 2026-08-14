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

public class JobDelete_deleteByJob_8682832163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3959;
     Object term3960;

    public JobDelete_deleteByJob_8682832163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3959 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobDelete"));
        setField(term3959, term3959.getClass(), "connection", null);
        setField(term3959, term3959.getClass(), "request", null);
        Long term4072 = new Long(-872011222785455006L);
        Long term4160 = new Long(-316468845751588286L);
        Long term4248 = new Long(5127676408959197577L);
        Long term4336 = new Long(-6573104506744284592L);
        Long term4446 = new Long(-4920224193275732920L);
        term3960 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term4057 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 4);
        Object term4058 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term4146 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term4234 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term4322 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term3960, term3960.getClass(), "jobId", "lihXWlGDxk");
        setField(term3960, term3960.getClass(), "jobName", "JmcmxoGhIK");
        setField(term3960, term3960.getClass(), "subSystem", "jXzmYyrnnT");
        setField(term3960, term3960.getClass(), "owner", "igCAtimmYB");
        setField(term3960, term3960.getClass(), "status", "DyiXbeYIaN");
        setField(term3960, term3960.getClass(), "type", "VGizxZnyHX");
        setField(term3960, term3960.getClass(), "classs", "kVEZMHmRtR");
        setField(term3960, term3960.getClass(), "retCode", "ekxGuOYIwi");
        setBooleanField(term4058, term4058.getClass(), "active", false);
        setField(term4058, term4058.getClass(), "smfid", "RbVQXSpxXy");
        setField(term4058, term4058.getClass(), "stepNumber", term4072);
        setField(term4058, term4058.getClass(), "owner", "YpJbIgJWWv");
        setField(term4058, term4058.getClass(), "programName", "JppkknKVOw");
        setField(term4058, term4058.getClass(), "stepName", "iljANwuEjk");
        setField(term4058, term4058.getClass(), "pathName", "kNqaJKIATy");
        setField(term4058, term4058.getClass(), "procStepName", "vKQukfbJUd");
        setField(term4058, term4058.getClass(), "completion", "lFRJFUMVbx");
        setElement(term4057, 0, term4058);
        setBooleanField(term4146, term4146.getClass(), "active", true);
        setField(term4146, term4146.getClass(), "smfid", "sZdUNdggUW");
        setField(term4146, term4146.getClass(), "stepNumber", term4160);
        setField(term4146, term4146.getClass(), "owner", "OqbwYQfvAe");
        setField(term4146, term4146.getClass(), "programName", "tRxZafjqIx");
        setField(term4146, term4146.getClass(), "stepName", "DhjNLmRMCu");
        setField(term4146, term4146.getClass(), "pathName", "PgPzMSEjjX");
        setField(term4146, term4146.getClass(), "procStepName", "wzsPSPcRdj");
        setField(term4146, term4146.getClass(), "completion", "kGMQdqJYyB");
        setElement(term4057, 1, term4146);
        setBooleanField(term4234, term4234.getClass(), "active", false);
        setField(term4234, term4234.getClass(), "smfid", "XJJNClzHRf");
        setField(term4234, term4234.getClass(), "stepNumber", term4248);
        setField(term4234, term4234.getClass(), "owner", "HDaezxQfQR");
        setField(term4234, term4234.getClass(), "programName", "iikZEapDlu");
        setField(term4234, term4234.getClass(), "stepName", "nhoHrZfnIN");
        setField(term4234, term4234.getClass(), "pathName", "ZkMALXpEAZ");
        setField(term4234, term4234.getClass(), "procStepName", "tXfQjSqDzN");
        setField(term4234, term4234.getClass(), "completion", "BjugTaMcxJ");
        setElement(term4057, 2, term4234);
        setBooleanField(term4322, term4322.getClass(), "active", false);
        setField(term4322, term4322.getClass(), "smfid", "vGiuZVPJNH");
        setField(term4322, term4322.getClass(), "stepNumber", term4336);
        setField(term4322, term4322.getClass(), "owner", "tlzpzIjMib");
        setField(term4322, term4322.getClass(), "programName", "AZdLeSugwv");
        setField(term4322, term4322.getClass(), "stepName", "RMsXuyzKJV");
        setField(term4322, term4322.getClass(), "pathName", "FwPbDZcHmB");
        setField(term4322, term4322.getClass(), "procStepName", "hOncybyCAH");
        setField(term4322, term4322.getClass(), "completion", "QduALnDSVo");
        setElement(term4057, 3, term4322);
        setField(term3960, term3960.getClass(), "stepData", term4057);
        setField(term3960, term3960.getClass(), "url", "izPpKDErnQ");
        setField(term3960, term3960.getClass(), "filesUrl", "NnpwZBUTvx");
        setField(term3960, term3960.getClass(), "jobCorrelator", "tlQSNgTkQX");
        setField(term3960, term3960.getClass(), "phase", term4446);
        setField(term3960, term3960.getClass(), "phaseName", "PCipZnmBOF");
        setField(term3960, term3960.getClass(), "execSystem", "zcorEihhLK");
        setField(term3960, term3960.getClass(), "execMember", "GrqozDKFOk");
        setField(term3960, term3960.getClass(), "execSubmitted", "CFyoseFGLF");
        setField(term3960, term3960.getClass(), "execStarted", "SFqCrhEWLm");
        setField(term3960, term3960.getClass(), "execEnded", "GZdcJyZntS");
        setField(term3960, term3960.getClass(), "reasonNotRunning", "OIHoJeysUi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobDelete");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3960;
        args[1] = "WXMWFDGcLB";
        callMethod(klass, "deleteByJob", argTypes, term3959, args);
    }

};


