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
import java.lang.Object;
import java.lang.Long;

public class CheckStatusResponse_getJob_6834996801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3878;

    public CheckStatusResponse_getJob_6834996801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3981 = new Long(4872422362414183754L);
        Long term3992 = new Long(6811161968424632369L);
        Long term4003 = new Long(-7237588299778557629L);
        Long term4014 = new Long(6967924379644551255L);
        Long term4058 = new Long(-2813493605142626659L);
        term3878 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.CheckStatusResponse"));
        Object term3880 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term3977 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 4);
        Object term3978 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term3989 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term4000 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term4011 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term3878, term3878.getClass(), "statusFound", true);
        setField(term3880, term3880.getClass(), "jobId", "xtftXXMbem");
        setField(term3880, term3880.getClass(), "jobName", "cudZvLMQon");
        setField(term3880, term3880.getClass(), "subSystem", "lihXWlGDxk");
        setField(term3880, term3880.getClass(), "owner", "JmcmxoGhIK");
        setField(term3880, term3880.getClass(), "status", "jXzmYyrnnT");
        setField(term3880, term3880.getClass(), "type", "igCAtimmYB");
        setField(term3880, term3880.getClass(), "classs", "DyiXbeYIaN");
        setField(term3880, term3880.getClass(), "retCode", "VGizxZnyHX");
        setBooleanField(term3978, term3978.getClass(), "active", true);
        setField(term3978, term3978.getClass(), "smfid", "");
        setField(term3978, term3978.getClass(), "stepNumber", term3981);
        setField(term3978, term3978.getClass(), "owner", "");
        setField(term3978, term3978.getClass(), "programName", "");
        setField(term3978, term3978.getClass(), "stepName", "");
        setField(term3978, term3978.getClass(), "pathName", "");
        setField(term3978, term3978.getClass(), "procStepName", "");
        setField(term3978, term3978.getClass(), "completion", "");
        setElement(term3977, 0, term3978);
        setBooleanField(term3989, term3989.getClass(), "active", false);
        setField(term3989, term3989.getClass(), "smfid", "");
        setField(term3989, term3989.getClass(), "stepNumber", term3992);
        setField(term3989, term3989.getClass(), "owner", "");
        setField(term3989, term3989.getClass(), "programName", "");
        setField(term3989, term3989.getClass(), "stepName", "");
        setField(term3989, term3989.getClass(), "pathName", "");
        setField(term3989, term3989.getClass(), "procStepName", "");
        setField(term3989, term3989.getClass(), "completion", "");
        setElement(term3977, 1, term3989);
        setBooleanField(term4000, term4000.getClass(), "active", true);
        setField(term4000, term4000.getClass(), "smfid", "");
        setField(term4000, term4000.getClass(), "stepNumber", term4003);
        setField(term4000, term4000.getClass(), "owner", "");
        setField(term4000, term4000.getClass(), "programName", "");
        setField(term4000, term4000.getClass(), "stepName", "");
        setField(term4000, term4000.getClass(), "pathName", "");
        setField(term4000, term4000.getClass(), "procStepName", "");
        setField(term4000, term4000.getClass(), "completion", "");
        setElement(term3977, 2, term4000);
        setBooleanField(term4011, term4011.getClass(), "active", false);
        setField(term4011, term4011.getClass(), "smfid", "");
        setField(term4011, term4011.getClass(), "stepNumber", term4014);
        setField(term4011, term4011.getClass(), "owner", "");
        setField(term4011, term4011.getClass(), "programName", "");
        setField(term4011, term4011.getClass(), "stepName", "");
        setField(term4011, term4011.getClass(), "pathName", "");
        setField(term4011, term4011.getClass(), "procStepName", "");
        setField(term4011, term4011.getClass(), "completion", "");
        setElement(term3977, 3, term4011);
        setField(term3880, term3880.getClass(), "stepData", term3977);
        setField(term3880, term3880.getClass(), "url", "hOncybyCAH");
        setField(term3880, term3880.getClass(), "filesUrl", "QduALnDSVo");
        setField(term3880, term3880.getClass(), "jobCorrelator", "izPpKDErnQ");
        setField(term3880, term3880.getClass(), "phase", term4058);
        setField(term3880, term3880.getClass(), "phaseName", "NnpwZBUTvx");
        setField(term3880, term3880.getClass(), "execSystem", "tlQSNgTkQX");
        setField(term3880, term3880.getClass(), "execMember", "PCipZnmBOF");
        setField(term3880, term3880.getClass(), "execSubmitted", "zcorEihhLK");
        setField(term3880, term3880.getClass(), "execStarted", "GrqozDKFOk");
        setField(term3880, term3880.getClass(), "execEnded", "CFyoseFGLF");
        setField(term3880, term3880.getClass(), "reasonNotRunning", "SFqCrhEWLm");
        setField(term3878, term3878.getClass(), "job", term3880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.CheckStatusResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJob", argTypes, term3878, args);
    }

};


