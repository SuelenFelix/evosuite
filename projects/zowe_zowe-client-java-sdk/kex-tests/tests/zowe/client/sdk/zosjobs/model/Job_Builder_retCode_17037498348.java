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

public class Job_Builder_retCode_17037498348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36248;

    public Job_Builder_retCode_17037498348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36360 = new Long(-8019730974733786399L);
        Long term36448 = new Long(394960377236392159L);
        Long term36536 = new Long(-2955854401507097864L);
        Long term36624 = new Long(329213208496958131L);
        Long term36712 = new Long(8107921244631636572L);
        Long term36800 = new Long(-7904053112604879960L);
        Long term36910 = new Long(-6602460430714339690L);
        term36248 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term36345 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 6);
        Object term36346 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term36434 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term36522 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term36610 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term36698 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term36786 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term36248, term36248.getClass(), "jobId", "HnLeZhnLzz");
        setField(term36248, term36248.getClass(), "jobName", "ziYEsRkZmD");
        setField(term36248, term36248.getClass(), "subSystem", "RFbJNwiLtv");
        setField(term36248, term36248.getClass(), "owner", "eCxWMOpomA");
        setField(term36248, term36248.getClass(), "status", "pkQawlBtEF");
        setField(term36248, term36248.getClass(), "type", "rdKTcvHHnV");
        setField(term36248, term36248.getClass(), "classs", "ELfUfLbXZf");
        setField(term36248, term36248.getClass(), "retCode", "SAglaHkagn");
        setBooleanField(term36346, term36346.getClass(), "active", false);
        setField(term36346, term36346.getClass(), "smfid", "eZGxUfdoFn");
        setField(term36346, term36346.getClass(), "stepNumber", term36360);
        setField(term36346, term36346.getClass(), "owner", "yCWSlaOrSv");
        setField(term36346, term36346.getClass(), "programName", "PFpWKxDIRz");
        setField(term36346, term36346.getClass(), "stepName", "qePuOCwoCf");
        setField(term36346, term36346.getClass(), "pathName", "vJPujDInGq");
        setField(term36346, term36346.getClass(), "procStepName", "cHZGcMhatT");
        setField(term36346, term36346.getClass(), "completion", "OZGyrUPedG");
        setElement(term36345, 0, term36346);
        setBooleanField(term36434, term36434.getClass(), "active", false);
        setField(term36434, term36434.getClass(), "smfid", "GAxMzRqmXU");
        setField(term36434, term36434.getClass(), "stepNumber", term36448);
        setField(term36434, term36434.getClass(), "owner", "XMhUDGKSWO");
        setField(term36434, term36434.getClass(), "programName", "jLgzxtuvVo");
        setField(term36434, term36434.getClass(), "stepName", "wmmxjOkPnH");
        setField(term36434, term36434.getClass(), "pathName", "jgRohUQWxJ");
        setField(term36434, term36434.getClass(), "procStepName", "CJlAiZDIQO");
        setField(term36434, term36434.getClass(), "completion", "osgWaTBVoE");
        setElement(term36345, 1, term36434);
        setBooleanField(term36522, term36522.getClass(), "active", true);
        setField(term36522, term36522.getClass(), "smfid", "mvkMYcgAod");
        setField(term36522, term36522.getClass(), "stepNumber", term36536);
        setField(term36522, term36522.getClass(), "owner", "esbhDGQDgF");
        setField(term36522, term36522.getClass(), "programName", "tKlyiBloWu");
        setField(term36522, term36522.getClass(), "stepName", "uIgRFcwqLd");
        setField(term36522, term36522.getClass(), "pathName", "AvdsiEyCve");
        setField(term36522, term36522.getClass(), "procStepName", "XMArCaVAEc");
        setField(term36522, term36522.getClass(), "completion", "URWnZtbrQH");
        setElement(term36345, 2, term36522);
        setBooleanField(term36610, term36610.getClass(), "active", false);
        setField(term36610, term36610.getClass(), "smfid", "hpTAdtnQku");
        setField(term36610, term36610.getClass(), "stepNumber", term36624);
        setField(term36610, term36610.getClass(), "owner", "GdMAXFBAtl");
        setField(term36610, term36610.getClass(), "programName", "KWVRAlcIqd");
        setField(term36610, term36610.getClass(), "stepName", "GeVOqtDiGv");
        setField(term36610, term36610.getClass(), "pathName", "vbRAJCwftU");
        setField(term36610, term36610.getClass(), "procStepName", "baJbjUImxp");
        setField(term36610, term36610.getClass(), "completion", "lPERFqPpGz");
        setElement(term36345, 3, term36610);
        setBooleanField(term36698, term36698.getClass(), "active", true);
        setField(term36698, term36698.getClass(), "smfid", "jleFBTYSNb");
        setField(term36698, term36698.getClass(), "stepNumber", term36712);
        setField(term36698, term36698.getClass(), "owner", "WmSSWHEELj");
        setField(term36698, term36698.getClass(), "programName", "ggFhMyQvdw");
        setField(term36698, term36698.getClass(), "stepName", "vZpMxQNHKu");
        setField(term36698, term36698.getClass(), "pathName", "QLMSDWYwBC");
        setField(term36698, term36698.getClass(), "procStepName", "feyxNWUenU");
        setField(term36698, term36698.getClass(), "completion", "qvqwmSUIiP");
        setElement(term36345, 4, term36698);
        setBooleanField(term36786, term36786.getClass(), "active", false);
        setField(term36786, term36786.getClass(), "smfid", "eNOEXYoAtV");
        setField(term36786, term36786.getClass(), "stepNumber", term36800);
        setField(term36786, term36786.getClass(), "owner", "SNqwfZGLFh");
        setField(term36786, term36786.getClass(), "programName", "sMqpXbgEga");
        setField(term36786, term36786.getClass(), "stepName", "nYJlDpoMcL");
        setField(term36786, term36786.getClass(), "pathName", "SQnbnBmbcf");
        setField(term36786, term36786.getClass(), "procStepName", "jaNVteZrZi");
        setField(term36786, term36786.getClass(), "completion", "bMRkDiPUGu");
        setElement(term36345, 5, term36786);
        setField(term36248, term36248.getClass(), "stepData", term36345);
        setField(term36248, term36248.getClass(), "url", "xjKxECGyLT");
        setField(term36248, term36248.getClass(), "filesUrl", "ffKeJGEXBT");
        setField(term36248, term36248.getClass(), "jobCorrelator", "rsnXTpfhqf");
        setField(term36248, term36248.getClass(), "phase", term36910);
        setField(term36248, term36248.getClass(), "phaseName", "gzvlGZVfnZ");
        setField(term36248, term36248.getClass(), "execSystem", "rmSqCaXWHi");
        setField(term36248, term36248.getClass(), "execMember", "ScztqspySK");
        setField(term36248, term36248.getClass(), "execSubmitted", "IvYxGwWoVu");
        setField(term36248, term36248.getClass(), "execStarted", "XnZHOhTfxL");
        setField(term36248, term36248.getClass(), "execEnded", "oFBhNamtAs");
        setField(term36248, term36248.getClass(), "reasonNotRunning", "YURcpRjwSt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SXMdNSGPog";
        callMethod(klass, "retCode", argTypes, term36248, args);
    }

};


