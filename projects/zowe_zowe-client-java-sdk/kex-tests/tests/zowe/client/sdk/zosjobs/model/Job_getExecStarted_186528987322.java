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

public class Job_getExecStarted_186528987322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23927;

    public Job_getExecStarted_186528987322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24039 = new Long(-8471550651709805183L);
        Long term24127 = new Long(-948292411727204525L);
        Long term24215 = new Long(-8892586408602479513L);
        Long term24303 = new Long(4616440478358528406L);
        Long term24391 = new Long(3427570961451840069L);
        Long term24479 = new Long(4502292577098212311L);
        Long term24589 = new Long(-3730936709704460408L);
        term23927 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term24024 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 6);
        Object term24025 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term24113 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term24201 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term24289 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term24377 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term24465 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term23927, term23927.getClass(), "jobId", "dTGwgkfDVj");
        setField(term23927, term23927.getClass(), "jobName", "zHiuLPzYQM");
        setField(term23927, term23927.getClass(), "subSystem", "ioYxUYJBrh");
        setField(term23927, term23927.getClass(), "owner", "GXoLEdKEIe");
        setField(term23927, term23927.getClass(), "status", "EugWXkztim");
        setField(term23927, term23927.getClass(), "type", "DvRdOzzihn");
        setField(term23927, term23927.getClass(), "classs", "wIygCdQAKO");
        setField(term23927, term23927.getClass(), "retCode", "JsXroBYqwr");
        setBooleanField(term24025, term24025.getClass(), "active", true);
        setField(term24025, term24025.getClass(), "smfid", "YciMAObLwl");
        setField(term24025, term24025.getClass(), "stepNumber", term24039);
        setField(term24025, term24025.getClass(), "owner", "qAmVqwwdyf");
        setField(term24025, term24025.getClass(), "programName", "IXPaHQnEUy");
        setField(term24025, term24025.getClass(), "stepName", "zhcWVVrrjs");
        setField(term24025, term24025.getClass(), "pathName", "EAMaFLdmaG");
        setField(term24025, term24025.getClass(), "procStepName", "DYZSJMwbhX");
        setField(term24025, term24025.getClass(), "completion", "QGcshsIIWo");
        setElement(term24024, 0, term24025);
        setBooleanField(term24113, term24113.getClass(), "active", false);
        setField(term24113, term24113.getClass(), "smfid", "dPHtrzKWgf");
        setField(term24113, term24113.getClass(), "stepNumber", term24127);
        setField(term24113, term24113.getClass(), "owner", "olmFxfIVeh");
        setField(term24113, term24113.getClass(), "programName", "iSPirUEhXs");
        setField(term24113, term24113.getClass(), "stepName", "WWyLFmYpAy");
        setField(term24113, term24113.getClass(), "pathName", "vbSWeJWOQh");
        setField(term24113, term24113.getClass(), "procStepName", "hyvFdAvkOr");
        setField(term24113, term24113.getClass(), "completion", "ewbQRtustW");
        setElement(term24024, 1, term24113);
        setBooleanField(term24201, term24201.getClass(), "active", true);
        setField(term24201, term24201.getClass(), "smfid", "cABEHYBnys");
        setField(term24201, term24201.getClass(), "stepNumber", term24215);
        setField(term24201, term24201.getClass(), "owner", "EhlWSobaco");
        setField(term24201, term24201.getClass(), "programName", "hEuycunsSe");
        setField(term24201, term24201.getClass(), "stepName", "IMFzXhpNCx");
        setField(term24201, term24201.getClass(), "pathName", "xAtFmANjwD");
        setField(term24201, term24201.getClass(), "procStepName", "ICysuFllEZ");
        setField(term24201, term24201.getClass(), "completion", "cGQJTTxcXr");
        setElement(term24024, 2, term24201);
        setBooleanField(term24289, term24289.getClass(), "active", false);
        setField(term24289, term24289.getClass(), "smfid", "aKaqvssiby");
        setField(term24289, term24289.getClass(), "stepNumber", term24303);
        setField(term24289, term24289.getClass(), "owner", "tTVbtBVAfo");
        setField(term24289, term24289.getClass(), "programName", "cjaaJUnNCR");
        setField(term24289, term24289.getClass(), "stepName", "ETbxNuJLii");
        setField(term24289, term24289.getClass(), "pathName", "YJhnPtWtJR");
        setField(term24289, term24289.getClass(), "procStepName", "xzGnrvbExX");
        setField(term24289, term24289.getClass(), "completion", "LFZNDELxUZ");
        setElement(term24024, 3, term24289);
        setBooleanField(term24377, term24377.getClass(), "active", true);
        setField(term24377, term24377.getClass(), "smfid", "GNIVsSTglt");
        setField(term24377, term24377.getClass(), "stepNumber", term24391);
        setField(term24377, term24377.getClass(), "owner", "mzPebFiUSP");
        setField(term24377, term24377.getClass(), "programName", "HvbkjsQyDy");
        setField(term24377, term24377.getClass(), "stepName", "wzSukELQFL");
        setField(term24377, term24377.getClass(), "pathName", "VZyeaOWYEj");
        setField(term24377, term24377.getClass(), "procStepName", "PErxMBQSUv");
        setField(term24377, term24377.getClass(), "completion", "KZQwbvujui");
        setElement(term24024, 4, term24377);
        setBooleanField(term24465, term24465.getClass(), "active", false);
        setField(term24465, term24465.getClass(), "smfid", "JPUZuGxKlI");
        setField(term24465, term24465.getClass(), "stepNumber", term24479);
        setField(term24465, term24465.getClass(), "owner", "xqIbVsUspl");
        setField(term24465, term24465.getClass(), "programName", "GnjLRtJywq");
        setField(term24465, term24465.getClass(), "stepName", "TDaodpHTRK");
        setField(term24465, term24465.getClass(), "pathName", "JayazbYDLK");
        setField(term24465, term24465.getClass(), "procStepName", "ORDuSTrpNA");
        setField(term24465, term24465.getClass(), "completion", "hysThIPoEJ");
        setElement(term24024, 5, term24465);
        setField(term23927, term23927.getClass(), "stepData", term24024);
        setField(term23927, term23927.getClass(), "url", "dfZepHfGwh");
        setField(term23927, term23927.getClass(), "filesUrl", "zjfMxUERFZ");
        setField(term23927, term23927.getClass(), "jobCorrelator", "ooVlhmiOff");
        setField(term23927, term23927.getClass(), "phase", term24589);
        setField(term23927, term23927.getClass(), "phaseName", "dUNzDLXJcj");
        setField(term23927, term23927.getClass(), "execSystem", "OrVSjRJVwa");
        setField(term23927, term23927.getClass(), "execMember", "cdZEcINJAM");
        setField(term23927, term23927.getClass(), "execSubmitted", "qumYSwcWHz");
        setField(term23927, term23927.getClass(), "execStarted", "raNzcEorkV");
        setField(term23927, term23927.getClass(), "execEnded", "nEgozCeoUr");
        setField(term23927, term23927.getClass(), "reasonNotRunning", "EWGMzlcOnW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExecStarted", argTypes, term23927, args);
    }

};


