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

public class CheckStatusResponse_isStatusFound_3476895522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4324;

    public CheckStatusResponse_isStatusFound_3476895522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4427 = new Long(-8885298608300233488L);
        Long term4438 = new Long(-4325723315152823407L);
        Long term4449 = new Long(2535595959091595249L);
        Long term4493 = new Long(-5476826692763582090L);
        term4324 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.CheckStatusResponse"));
        Object term4326 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term4423 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 3);
        Object term4424 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term4435 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term4446 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term4324, term4324.getClass(), "statusFound", true);
        setField(term4326, term4326.getClass(), "jobId", "GZdcJyZntS");
        setField(term4326, term4326.getClass(), "jobName", "OIHoJeysUi");
        setField(term4326, term4326.getClass(), "subSystem", "WXMWFDGcLB");
        setField(term4326, term4326.getClass(), "owner", "wKWbJssZuG");
        setField(term4326, term4326.getClass(), "status", "NzBMMhkhpT");
        setField(term4326, term4326.getClass(), "type", "qCpEbQDHdF");
        setField(term4326, term4326.getClass(), "classs", "AHbZyFOmlo");
        setField(term4326, term4326.getClass(), "retCode", "TwfWVQGiIj");
        setBooleanField(term4424, term4424.getClass(), "active", false);
        setField(term4424, term4424.getClass(), "smfid", "");
        setField(term4424, term4424.getClass(), "stepNumber", term4427);
        setField(term4424, term4424.getClass(), "owner", "");
        setField(term4424, term4424.getClass(), "programName", "");
        setField(term4424, term4424.getClass(), "stepName", "");
        setField(term4424, term4424.getClass(), "pathName", "");
        setField(term4424, term4424.getClass(), "procStepName", "");
        setField(term4424, term4424.getClass(), "completion", "");
        setElement(term4423, 0, term4424);
        setBooleanField(term4435, term4435.getClass(), "active", true);
        setField(term4435, term4435.getClass(), "smfid", "");
        setField(term4435, term4435.getClass(), "stepNumber", term4438);
        setField(term4435, term4435.getClass(), "owner", "");
        setField(term4435, term4435.getClass(), "programName", "");
        setField(term4435, term4435.getClass(), "stepName", "");
        setField(term4435, term4435.getClass(), "pathName", "");
        setField(term4435, term4435.getClass(), "procStepName", "");
        setField(term4435, term4435.getClass(), "completion", "");
        setElement(term4423, 1, term4435);
        setBooleanField(term4446, term4446.getClass(), "active", false);
        setField(term4446, term4446.getClass(), "smfid", "");
        setField(term4446, term4446.getClass(), "stepNumber", term4449);
        setField(term4446, term4446.getClass(), "owner", "");
        setField(term4446, term4446.getClass(), "programName", "");
        setField(term4446, term4446.getClass(), "stepName", "");
        setField(term4446, term4446.getClass(), "pathName", "");
        setField(term4446, term4446.getClass(), "procStepName", "");
        setField(term4446, term4446.getClass(), "completion", "");
        setElement(term4423, 2, term4446);
        setField(term4326, term4326.getClass(), "stepData", term4423);
        setField(term4326, term4326.getClass(), "url", "SIODFGaQhr");
        setField(term4326, term4326.getClass(), "filesUrl", "qYzsiuXOgS");
        setField(term4326, term4326.getClass(), "jobCorrelator", "bxrCBbrrct");
        setField(term4326, term4326.getClass(), "phase", term4493);
        setField(term4326, term4326.getClass(), "phaseName", "CKWpJaaaxX");
        setField(term4326, term4326.getClass(), "execSystem", "UBRmXJmfrt");
        setField(term4326, term4326.getClass(), "execMember", "WZzvmIHhzZ");
        setField(term4326, term4326.getClass(), "execSubmitted", "doQLHkjpNm");
        setField(term4326, term4326.getClass(), "execStarted", "lCyLIcSuom");
        setField(term4326, term4326.getClass(), "execEnded", "CGOpQSZZwI");
        setField(term4326, term4326.getClass(), "reasonNotRunning", "ypEdrstygY");
        setField(term4324, term4324.getClass(), "job", term4326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.CheckStatusResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStatusFound", argTypes, term4324, args);
    }

};


