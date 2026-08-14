package zowe.client.sdk.zosjobs.response;

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
import static zowe.client.sdk.zosjobs.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Long;

public class CheckStatusResponse_init_10213593930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2686;
     Object term2688;

    public CheckStatusResponse_init_10213593930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2686 = new Boolean(false);
        Long term2800 = new Long(2442117782898005296L);
        Long term2888 = new Long(6375119433582206027L);
        Long term2976 = new Long(-8257434502486459194L);
        Long term3064 = new Long(-8400487765614892086L);
        Long term3152 = new Long(5270370404989704783L);
        Long term3262 = new Long(7411271909051562686L);
        term2688 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term2785 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 5);
        Object term2786 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term2874 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term2962 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term3050 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term3138 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term2688, term2688.getClass(), "jobId", "hCWPJQKpdc");
        setField(term2688, term2688.getClass(), "jobName", "WzMEhMXkKx");
        setField(term2688, term2688.getClass(), "subSystem", "XOiDvlDhdc");
        setField(term2688, term2688.getClass(), "owner", "AdxvLJhNLe");
        setField(term2688, term2688.getClass(), "status", "lHfTrWKMPk");
        setField(term2688, term2688.getClass(), "type", "JDaAnsVTGV");
        setField(term2688, term2688.getClass(), "classs", "mLUZFTfjle");
        setField(term2688, term2688.getClass(), "retCode", "xIeFjkHkOe");
        setBooleanField(term2786, term2786.getClass(), "active", false);
        setField(term2786, term2786.getClass(), "smfid", "SdCKLMIYnX");
        setField(term2786, term2786.getClass(), "stepNumber", term2800);
        setField(term2786, term2786.getClass(), "owner", "OJJtVNPyKZ");
        setField(term2786, term2786.getClass(), "programName", "AKNapTAfmD");
        setField(term2786, term2786.getClass(), "stepName", "xJgPlLxpgC");
        setField(term2786, term2786.getClass(), "pathName", "EYtfuJaxiM");
        setField(term2786, term2786.getClass(), "procStepName", "gCWtLVKVVe");
        setField(term2786, term2786.getClass(), "completion", "fWKJoSoCwE");
        setElement(term2785, 0, term2786);
        setBooleanField(term2874, term2874.getClass(), "active", false);
        setField(term2874, term2874.getClass(), "smfid", "wfaXBpWAUH");
        setField(term2874, term2874.getClass(), "stepNumber", term2888);
        setField(term2874, term2874.getClass(), "owner", "VMeAzAHwZj");
        setField(term2874, term2874.getClass(), "programName", "PznxWXsZME");
        setField(term2874, term2874.getClass(), "stepName", "ZzIujlwVsw");
        setField(term2874, term2874.getClass(), "pathName", "LWyEaeIyAo");
        setField(term2874, term2874.getClass(), "procStepName", "yVMkkQhvmN");
        setField(term2874, term2874.getClass(), "completion", "mvrkADEgpp");
        setElement(term2785, 1, term2874);
        setBooleanField(term2962, term2962.getClass(), "active", false);
        setField(term2962, term2962.getClass(), "smfid", "pXOkjyeIRb");
        setField(term2962, term2962.getClass(), "stepNumber", term2976);
        setField(term2962, term2962.getClass(), "owner", "GgZWSjxjyE");
        setField(term2962, term2962.getClass(), "programName", "EeBVbzjcCI");
        setField(term2962, term2962.getClass(), "stepName", "UfQtPRyWRC");
        setField(term2962, term2962.getClass(), "pathName", "FPvxVzzSvD");
        setField(term2962, term2962.getClass(), "procStepName", "WHcwFgsGFC");
        setField(term2962, term2962.getClass(), "completion", "HzqpegHiRq");
        setElement(term2785, 2, term2962);
        setBooleanField(term3050, term3050.getClass(), "active", true);
        setField(term3050, term3050.getClass(), "smfid", "jwsfVjMoJT");
        setField(term3050, term3050.getClass(), "stepNumber", term3064);
        setField(term3050, term3050.getClass(), "owner", "ZfdXfCCFDf");
        setField(term3050, term3050.getClass(), "programName", "MwwjNtdOFT");
        setField(term3050, term3050.getClass(), "stepName", "VYkqXKVlAJ");
        setField(term3050, term3050.getClass(), "pathName", "XkIoWJRNwN");
        setField(term3050, term3050.getClass(), "procStepName", "aNWLJdrZMq");
        setField(term3050, term3050.getClass(), "completion", "HHmNoYxIGj");
        setElement(term2785, 3, term3050);
        setBooleanField(term3138, term3138.getClass(), "active", true);
        setField(term3138, term3138.getClass(), "smfid", "PtirvZmsGt");
        setField(term3138, term3138.getClass(), "stepNumber", term3152);
        setField(term3138, term3138.getClass(), "owner", "HWkpTmtlrc");
        setField(term3138, term3138.getClass(), "programName", "hMmaoREuCK");
        setField(term3138, term3138.getClass(), "stepName", "VeDtgDzGAN");
        setField(term3138, term3138.getClass(), "pathName", "aWYOWZFyaX");
        setField(term3138, term3138.getClass(), "procStepName", "BRIVNtfUWU");
        setField(term3138, term3138.getClass(), "completion", "DbiCVtPPCT");
        setElement(term2785, 4, term3138);
        setField(term2688, term2688.getClass(), "stepData", term2785);
        setField(term2688, term2688.getClass(), "url", "WzFopsaDuG");
        setField(term2688, term2688.getClass(), "filesUrl", "PapWxkhEWe");
        setField(term2688, term2688.getClass(), "jobCorrelator", "smnHEqRFRx");
        setField(term2688, term2688.getClass(), "phase", term3262);
        setField(term2688, term2688.getClass(), "phaseName", "XYtryyobou");
        setField(term2688, term2688.getClass(), "execSystem", "OYbzXylRWW");
        setField(term2688, term2688.getClass(), "execMember", "DSNsTGYXDF");
        setField(term2688, term2688.getClass(), "execSubmitted", "sQvGcVjdEx");
        setField(term2688, term2688.getClass(), "execStarted", "rLHAoqXgPh");
        setField(term2688, term2688.getClass(), "execEnded", "zUlRdimJtU");
        setField(term2688, term2688.getClass(), "reasonNotRunning", "vwbEQQNQrx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.CheckStatusResponse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Object[] args = new Object[2];
        args[0] = term2686;
        args[1] = term2688;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


