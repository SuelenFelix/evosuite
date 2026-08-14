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

public class CheckStatusResponse_toString_2360108853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4759;

    public CheckStatusResponse_toString_2360108853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4862 = new Long(-872011222785455006L);
        Long term4873 = new Long(-316468845751588286L);
        Long term4884 = new Long(5127676408959197577L);
        Long term4895 = new Long(-6573104506744284592L);
        Long term4939 = new Long(-4920224193275732920L);
        term4759 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.CheckStatusResponse"));
        Object term4761 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term4858 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 4);
        Object term4859 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term4870 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term4881 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term4892 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term4759, term4759.getClass(), "statusFound", false);
        setField(term4761, term4761.getClass(), "jobId", "sNQFlATEeQ");
        setField(term4761, term4761.getClass(), "jobName", "ZKMLioamsY");
        setField(term4761, term4761.getClass(), "subSystem", "WVbxuoDBcn");
        setField(term4761, term4761.getClass(), "owner", "pvDEABOxLt");
        setField(term4761, term4761.getClass(), "status", "beAMpkroCQ");
        setField(term4761, term4761.getClass(), "type", "uSUvKAyuvd");
        setField(term4761, term4761.getClass(), "classs", "onQLVONGuf");
        setField(term4761, term4761.getClass(), "retCode", "SOrEHbcbmn");
        setBooleanField(term4859, term4859.getClass(), "active", true);
        setField(term4859, term4859.getClass(), "smfid", "");
        setField(term4859, term4859.getClass(), "stepNumber", term4862);
        setField(term4859, term4859.getClass(), "owner", "");
        setField(term4859, term4859.getClass(), "programName", "");
        setField(term4859, term4859.getClass(), "stepName", "");
        setField(term4859, term4859.getClass(), "pathName", "");
        setField(term4859, term4859.getClass(), "procStepName", "");
        setField(term4859, term4859.getClass(), "completion", "");
        setElement(term4858, 0, term4859);
        setBooleanField(term4870, term4870.getClass(), "active", true);
        setField(term4870, term4870.getClass(), "smfid", "");
        setField(term4870, term4870.getClass(), "stepNumber", term4873);
        setField(term4870, term4870.getClass(), "owner", "");
        setField(term4870, term4870.getClass(), "programName", "");
        setField(term4870, term4870.getClass(), "stepName", "");
        setField(term4870, term4870.getClass(), "pathName", "");
        setField(term4870, term4870.getClass(), "procStepName", "");
        setField(term4870, term4870.getClass(), "completion", "");
        setElement(term4858, 1, term4870);
        setBooleanField(term4881, term4881.getClass(), "active", false);
        setField(term4881, term4881.getClass(), "smfid", "");
        setField(term4881, term4881.getClass(), "stepNumber", term4884);
        setField(term4881, term4881.getClass(), "owner", "");
        setField(term4881, term4881.getClass(), "programName", "");
        setField(term4881, term4881.getClass(), "stepName", "");
        setField(term4881, term4881.getClass(), "pathName", "");
        setField(term4881, term4881.getClass(), "procStepName", "");
        setField(term4881, term4881.getClass(), "completion", "");
        setElement(term4858, 2, term4881);
        setBooleanField(term4892, term4892.getClass(), "active", false);
        setField(term4892, term4892.getClass(), "smfid", "");
        setField(term4892, term4892.getClass(), "stepNumber", term4895);
        setField(term4892, term4892.getClass(), "owner", "");
        setField(term4892, term4892.getClass(), "programName", "");
        setField(term4892, term4892.getClass(), "stepName", "");
        setField(term4892, term4892.getClass(), "pathName", "");
        setField(term4892, term4892.getClass(), "procStepName", "");
        setField(term4892, term4892.getClass(), "completion", "");
        setElement(term4858, 3, term4892);
        setField(term4761, term4761.getClass(), "stepData", term4858);
        setField(term4761, term4761.getClass(), "url", "dJGPlmSRnz");
        setField(term4761, term4761.getClass(), "filesUrl", "DPskuFUobI");
        setField(term4761, term4761.getClass(), "jobCorrelator", "wBGfLpNNiZ");
        setField(term4761, term4761.getClass(), "phase", term4939);
        setField(term4761, term4761.getClass(), "phaseName", "yUGCjlqgJE");
        setField(term4761, term4761.getClass(), "execSystem", "PXdVZyoJyC");
        setField(term4761, term4761.getClass(), "execMember", "vLerpqavFM");
        setField(term4761, term4761.getClass(), "execSubmitted", "qnvxzwuGKX");
        setField(term4761, term4761.getClass(), "execStarted", "EdPAvpluZg");
        setField(term4761, term4761.getClass(), "execEnded", "DzHVBMqWtE");
        setField(term4761, term4761.getClass(), "reasonNotRunning", "THZSpzBRYP");
        setField(term4759, term4759.getClass(), "job", term4761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.CheckStatusResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4759, args);
    }

};


