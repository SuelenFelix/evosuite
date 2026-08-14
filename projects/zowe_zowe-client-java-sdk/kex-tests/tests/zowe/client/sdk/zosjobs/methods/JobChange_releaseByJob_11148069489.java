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

public class JobChange_releaseByJob_11148069489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2694;
     Object term2695;

    public JobChange_releaseByJob_11148069489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2694 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobChange"));
        setField(term2694, term2694.getClass(), "connection", null);
        setField(term2694, term2694.getClass(), "request", null);
        Long term2807 = new Long(-8885298608300233488L);
        Long term2895 = new Long(-4325723315152823407L);
        Long term2983 = new Long(2535595959091595249L);
        Long term3093 = new Long(-5476826692763582090L);
        term2695 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term2792 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 3);
        Object term2793 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term2881 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term2969 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term2695, term2695.getClass(), "jobId", "dpNsDgfPso");
        setField(term2695, term2695.getClass(), "jobName", "hCWPJQKpdc");
        setField(term2695, term2695.getClass(), "subSystem", "WzMEhMXkKx");
        setField(term2695, term2695.getClass(), "owner", "XOiDvlDhdc");
        setField(term2695, term2695.getClass(), "status", "AdxvLJhNLe");
        setField(term2695, term2695.getClass(), "type", "lHfTrWKMPk");
        setField(term2695, term2695.getClass(), "classs", "JDaAnsVTGV");
        setField(term2695, term2695.getClass(), "retCode", "mLUZFTfjle");
        setBooleanField(term2793, term2793.getClass(), "active", true);
        setField(term2793, term2793.getClass(), "smfid", "xIeFjkHkOe");
        setField(term2793, term2793.getClass(), "stepNumber", term2807);
        setField(term2793, term2793.getClass(), "owner", "SdCKLMIYnX");
        setField(term2793, term2793.getClass(), "programName", "OJJtVNPyKZ");
        setField(term2793, term2793.getClass(), "stepName", "AKNapTAfmD");
        setField(term2793, term2793.getClass(), "pathName", "xJgPlLxpgC");
        setField(term2793, term2793.getClass(), "procStepName", "EYtfuJaxiM");
        setField(term2793, term2793.getClass(), "completion", "gCWtLVKVVe");
        setElement(term2792, 0, term2793);
        setBooleanField(term2881, term2881.getClass(), "active", false);
        setField(term2881, term2881.getClass(), "smfid", "fWKJoSoCwE");
        setField(term2881, term2881.getClass(), "stepNumber", term2895);
        setField(term2881, term2881.getClass(), "owner", "wfaXBpWAUH");
        setField(term2881, term2881.getClass(), "programName", "VMeAzAHwZj");
        setField(term2881, term2881.getClass(), "stepName", "PznxWXsZME");
        setField(term2881, term2881.getClass(), "pathName", "ZzIujlwVsw");
        setField(term2881, term2881.getClass(), "procStepName", "LWyEaeIyAo");
        setField(term2881, term2881.getClass(), "completion", "yVMkkQhvmN");
        setElement(term2792, 1, term2881);
        setBooleanField(term2969, term2969.getClass(), "active", true);
        setField(term2969, term2969.getClass(), "smfid", "mvrkADEgpp");
        setField(term2969, term2969.getClass(), "stepNumber", term2983);
        setField(term2969, term2969.getClass(), "owner", "pXOkjyeIRb");
        setField(term2969, term2969.getClass(), "programName", "GgZWSjxjyE");
        setField(term2969, term2969.getClass(), "stepName", "EeBVbzjcCI");
        setField(term2969, term2969.getClass(), "pathName", "UfQtPRyWRC");
        setField(term2969, term2969.getClass(), "procStepName", "FPvxVzzSvD");
        setField(term2969, term2969.getClass(), "completion", "WHcwFgsGFC");
        setElement(term2792, 2, term2969);
        setField(term2695, term2695.getClass(), "stepData", term2792);
        setField(term2695, term2695.getClass(), "url", "HzqpegHiRq");
        setField(term2695, term2695.getClass(), "filesUrl", "jwsfVjMoJT");
        setField(term2695, term2695.getClass(), "jobCorrelator", "ZfdXfCCFDf");
        setField(term2695, term2695.getClass(), "phase", term3093);
        setField(term2695, term2695.getClass(), "phaseName", "MwwjNtdOFT");
        setField(term2695, term2695.getClass(), "execSystem", "VYkqXKVlAJ");
        setField(term2695, term2695.getClass(), "execMember", "XkIoWJRNwN");
        setField(term2695, term2695.getClass(), "execSubmitted", "aNWLJdrZMq");
        setField(term2695, term2695.getClass(), "execStarted", "HHmNoYxIGj");
        setField(term2695, term2695.getClass(), "execEnded", "PtirvZmsGt");
        setField(term2695, term2695.getClass(), "reasonNotRunning", "HWkpTmtlrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobChange");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2695;
        args[1] = "hMmaoREuCK";
        callMethod(klass, "releaseByJob", argTypes, term2694, args);
    }

};


