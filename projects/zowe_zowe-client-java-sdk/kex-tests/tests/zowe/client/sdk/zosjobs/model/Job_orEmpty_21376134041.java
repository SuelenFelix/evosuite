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

public class Job_orEmpty_21376134041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5507;

    public Job_orEmpty_21376134041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5522 = new Long(-5963439350418910964L);
        Long term5610 = new Long(9013624480170062917L);
        Long term5698 = new Long(7862575738391801707L);
        Long term5786 = new Long(50358265865610362L);
        Long term5874 = new Long(5510783420697225605L);
        term5507 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 5);
        Object term5508 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term5596 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term5684 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term5772 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term5860 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term5508, term5508.getClass(), "active", true);
        setField(term5508, term5508.getClass(), "smfid", "iIRsCSYqXH");
        setField(term5508, term5508.getClass(), "stepNumber", term5522);
        setField(term5508, term5508.getClass(), "owner", "nghfqDXyCG");
        setField(term5508, term5508.getClass(), "programName", "WBAOTqErtm");
        setField(term5508, term5508.getClass(), "stepName", "PqtVXXZMqK");
        setField(term5508, term5508.getClass(), "pathName", "rYbtIDVdnd");
        setField(term5508, term5508.getClass(), "procStepName", "UKAReurpHG");
        setField(term5508, term5508.getClass(), "completion", "WVRMUmrljA");
        setElement(term5507, 0, term5508);
        setBooleanField(term5596, term5596.getClass(), "active", false);
        setField(term5596, term5596.getClass(), "smfid", "NTlKJDDWlk");
        setField(term5596, term5596.getClass(), "stepNumber", term5610);
        setField(term5596, term5596.getClass(), "owner", "vOuMEpOQAg");
        setField(term5596, term5596.getClass(), "programName", "SIODFGaQhr");
        setField(term5596, term5596.getClass(), "stepName", "qYzsiuXOgS");
        setField(term5596, term5596.getClass(), "pathName", "bxrCBbrrct");
        setField(term5596, term5596.getClass(), "procStepName", "CKWpJaaaxX");
        setField(term5596, term5596.getClass(), "completion", "UBRmXJmfrt");
        setElement(term5507, 1, term5596);
        setBooleanField(term5684, term5684.getClass(), "active", true);
        setField(term5684, term5684.getClass(), "smfid", "WZzvmIHhzZ");
        setField(term5684, term5684.getClass(), "stepNumber", term5698);
        setField(term5684, term5684.getClass(), "owner", "doQLHkjpNm");
        setField(term5684, term5684.getClass(), "programName", "lCyLIcSuom");
        setField(term5684, term5684.getClass(), "stepName", "CGOpQSZZwI");
        setField(term5684, term5684.getClass(), "pathName", "ypEdrstygY");
        setField(term5684, term5684.getClass(), "procStepName", "sNQFlATEeQ");
        setField(term5684, term5684.getClass(), "completion", "ZKMLioamsY");
        setElement(term5507, 2, term5684);
        setBooleanField(term5772, term5772.getClass(), "active", false);
        setField(term5772, term5772.getClass(), "smfid", "WVbxuoDBcn");
        setField(term5772, term5772.getClass(), "stepNumber", term5786);
        setField(term5772, term5772.getClass(), "owner", "pvDEABOxLt");
        setField(term5772, term5772.getClass(), "programName", "beAMpkroCQ");
        setField(term5772, term5772.getClass(), "stepName", "uSUvKAyuvd");
        setField(term5772, term5772.getClass(), "pathName", "onQLVONGuf");
        setField(term5772, term5772.getClass(), "procStepName", "SOrEHbcbmn");
        setField(term5772, term5772.getClass(), "completion", "bnsyeQXFdu");
        setElement(term5507, 3, term5772);
        setBooleanField(term5860, term5860.getClass(), "active", false);
        setField(term5860, term5860.getClass(), "smfid", "BwtdjiefJn");
        setField(term5860, term5860.getClass(), "stepNumber", term5874);
        setField(term5860, term5860.getClass(), "owner", "jDmhBrIoDa");
        setField(term5860, term5860.getClass(), "programName", "SPtPatHeOm");
        setField(term5860, term5860.getClass(), "stepName", "ywmcuThdfL");
        setField(term5860, term5860.getClass(), "pathName", "GBOEuByOfr");
        setField(term5860, term5860.getClass(), "procStepName", "NHbOFFjyVK");
        setField(term5860, term5860.getClass(), "completion", "zaloBqlrSo");
        setElement(term5507, 4, term5860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5507;
        callMethod(klass, "orEmpty", argTypes, null, args);
    }

};


