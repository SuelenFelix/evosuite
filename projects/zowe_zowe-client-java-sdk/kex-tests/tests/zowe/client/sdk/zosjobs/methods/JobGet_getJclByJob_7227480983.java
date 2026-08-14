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

public class JobGet_getJclByJob_7227480983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5174;
     Object term5187;

    public JobGet_getJclByJob_7227480983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5174 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobGet"));
        setField(term5174, term5174.getClass(), "connection", null);
        setField(term5174, term5174.getClass(), "request", null);
        setField(term5174, term5174.getClass(), "url", "aSkmSwTnEw");
        Long term5299 = new Long(8428634514691209827L);
        Long term5409 = new Long(-2585684163342970173L);
        term5187 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term5284 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 1);
        Object term5285 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term5187, term5187.getClass(), "jobId", "xvkbvaEGYd");
        setField(term5187, term5187.getClass(), "jobName", "HBGNxdNURv");
        setField(term5187, term5187.getClass(), "subSystem", "mfCpTPPQQm");
        setField(term5187, term5187.getClass(), "owner", "OcJCIDNIXA");
        setField(term5187, term5187.getClass(), "status", "XfRABIFVEp");
        setField(term5187, term5187.getClass(), "type", "MHGKyEnwKc");
        setField(term5187, term5187.getClass(), "classs", "ShIELyuULw");
        setField(term5187, term5187.getClass(), "retCode", "IpQuOGMgmj");
        setBooleanField(term5285, term5285.getClass(), "active", true);
        setField(term5285, term5285.getClass(), "smfid", "pJbnHTYrxn");
        setField(term5285, term5285.getClass(), "stepNumber", term5299);
        setField(term5285, term5285.getClass(), "owner", "iIRsCSYqXH");
        setField(term5285, term5285.getClass(), "programName", "nghfqDXyCG");
        setField(term5285, term5285.getClass(), "stepName", "WBAOTqErtm");
        setField(term5285, term5285.getClass(), "pathName", "PqtVXXZMqK");
        setField(term5285, term5285.getClass(), "procStepName", "rYbtIDVdnd");
        setField(term5285, term5285.getClass(), "completion", "UKAReurpHG");
        setElement(term5284, 0, term5285);
        setField(term5187, term5187.getClass(), "stepData", term5284);
        setField(term5187, term5187.getClass(), "url", "WVRMUmrljA");
        setField(term5187, term5187.getClass(), "filesUrl", "NTlKJDDWlk");
        setField(term5187, term5187.getClass(), "jobCorrelator", "vOuMEpOQAg");
        setField(term5187, term5187.getClass(), "phase", term5409);
        setField(term5187, term5187.getClass(), "phaseName", "SIODFGaQhr");
        setField(term5187, term5187.getClass(), "execSystem", "qYzsiuXOgS");
        setField(term5187, term5187.getClass(), "execMember", "bxrCBbrrct");
        setField(term5187, term5187.getClass(), "execSubmitted", "CKWpJaaaxX");
        setField(term5187, term5187.getClass(), "execStarted", "UBRmXJmfrt");
        setField(term5187, term5187.getClass(), "execEnded", "WZzvmIHhzZ");
        setField(term5187, term5187.getClass(), "reasonNotRunning", "doQLHkjpNm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobGet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Object[] args = new Object[1];
        args[0] = term5187;
        callMethod(klass, "getJclByJob", argTypes, term5174, args);
    }

};


