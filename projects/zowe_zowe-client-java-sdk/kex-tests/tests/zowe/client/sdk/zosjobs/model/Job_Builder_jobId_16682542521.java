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

public class Job_Builder_jobId_16682542521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28396;

    public Job_Builder_jobId_16682542521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28508 = new Long(-8327432141027603933L);
        Long term28596 = new Long(-433040798405298080L);
        Long term28684 = new Long(-1505191021111100819L);
        Long term28794 = new Long(-1000830646340880796L);
        term28396 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term28493 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 3);
        Object term28494 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term28582 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term28670 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term28396, term28396.getClass(), "jobId", "SiwcigIrfD");
        setField(term28396, term28396.getClass(), "jobName", "MFIdGVLoDo");
        setField(term28396, term28396.getClass(), "subSystem", "kbxgTcnXyU");
        setField(term28396, term28396.getClass(), "owner", "lnJvDbbuwo");
        setField(term28396, term28396.getClass(), "status", "KExnWkKGvF");
        setField(term28396, term28396.getClass(), "type", "luGUNfvmKk");
        setField(term28396, term28396.getClass(), "classs", "oOUHomyJff");
        setField(term28396, term28396.getClass(), "retCode", "KnnoLMOuur");
        setBooleanField(term28494, term28494.getClass(), "active", true);
        setField(term28494, term28494.getClass(), "smfid", "buRpVghIvt");
        setField(term28494, term28494.getClass(), "stepNumber", term28508);
        setField(term28494, term28494.getClass(), "owner", "oTGxFdiaIW");
        setField(term28494, term28494.getClass(), "programName", "jlyFvaZlmv");
        setField(term28494, term28494.getClass(), "stepName", "sofyLEfomV");
        setField(term28494, term28494.getClass(), "pathName", "zHcDSJHKAb");
        setField(term28494, term28494.getClass(), "procStepName", "WRIQkTdeMl");
        setField(term28494, term28494.getClass(), "completion", "rLSEheWsHd");
        setElement(term28493, 0, term28494);
        setBooleanField(term28582, term28582.getClass(), "active", true);
        setField(term28582, term28582.getClass(), "smfid", "DoUKDhlGCY");
        setField(term28582, term28582.getClass(), "stepNumber", term28596);
        setField(term28582, term28582.getClass(), "owner", "IeoToWsQWU");
        setField(term28582, term28582.getClass(), "programName", "QxiiHtQAzN");
        setField(term28582, term28582.getClass(), "stepName", "gQgTBlRIvX");
        setField(term28582, term28582.getClass(), "pathName", "ulKaKnANzj");
        setField(term28582, term28582.getClass(), "procStepName", "ABwhdjjeJi");
        setField(term28582, term28582.getClass(), "completion", "KKEcpYXNZV");
        setElement(term28493, 1, term28582);
        setBooleanField(term28670, term28670.getClass(), "active", false);
        setField(term28670, term28670.getClass(), "smfid", "shLHFznysy");
        setField(term28670, term28670.getClass(), "stepNumber", term28684);
        setField(term28670, term28670.getClass(), "owner", "YCKIloBHLj");
        setField(term28670, term28670.getClass(), "programName", "qUWDhAeFJY");
        setField(term28670, term28670.getClass(), "stepName", "wboNBMhRjP");
        setField(term28670, term28670.getClass(), "pathName", "HZODpafOGe");
        setField(term28670, term28670.getClass(), "procStepName", "dUTYEKtTfQ");
        setField(term28670, term28670.getClass(), "completion", "HUtbHklGel");
        setElement(term28493, 2, term28670);
        setField(term28396, term28396.getClass(), "stepData", term28493);
        setField(term28396, term28396.getClass(), "url", "QbfKDAwhSB");
        setField(term28396, term28396.getClass(), "filesUrl", "ckTRHEIcCK");
        setField(term28396, term28396.getClass(), "jobCorrelator", "NYSBqIpNlD");
        setField(term28396, term28396.getClass(), "phase", term28794);
        setField(term28396, term28396.getClass(), "phaseName", "OWglDUWQYb");
        setField(term28396, term28396.getClass(), "execSystem", "FiqETbKjpv");
        setField(term28396, term28396.getClass(), "execMember", "FxXtdhhXyS");
        setField(term28396, term28396.getClass(), "execSubmitted", "HxCEzaCcgj");
        setField(term28396, term28396.getClass(), "execStarted", "PDYPOQncAB");
        setField(term28396, term28396.getClass(), "execEnded", "cHqLMqZSmc");
        setField(term28396, term28396.getClass(), "reasonNotRunning", "hkWmAkXSOW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DwQmZEKeOp";
        callMethod(klass, "jobId", argTypes, term28396, args);
    }

};


