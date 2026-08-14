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

public class JobGet_getStatusByJob_135028374318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8288;
     Object term8301;

    public JobGet_getStatusByJob_135028374318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8288 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobGet"));
        setField(term8288, term8288.getClass(), "connection", null);
        setField(term8288, term8288.getClass(), "request", null);
        setField(term8288, term8288.getClass(), "url", "RSaoipUlsg");
        Long term8413 = new Long(-8708192233349544946L);
        Long term8501 = new Long(5907001541142728739L);
        Long term8611 = new Long(4178434741742309755L);
        term8301 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term8398 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 2);
        Object term8399 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term8487 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term8301, term8301.getClass(), "jobId", "cSHGbqKqlN");
        setField(term8301, term8301.getClass(), "jobName", "pFAfANnxup");
        setField(term8301, term8301.getClass(), "subSystem", "FbSIUZyBXZ");
        setField(term8301, term8301.getClass(), "owner", "mhQDwIyrRi");
        setField(term8301, term8301.getClass(), "status", "HpZXWDPhlg");
        setField(term8301, term8301.getClass(), "type", "lBOokzEPfe");
        setField(term8301, term8301.getClass(), "classs", "dtGZCsKXbW");
        setField(term8301, term8301.getClass(), "retCode", "bdyhHbDAmJ");
        setBooleanField(term8399, term8399.getClass(), "active", false);
        setField(term8399, term8399.getClass(), "smfid", "BBXiTNHqGE");
        setField(term8399, term8399.getClass(), "stepNumber", term8413);
        setField(term8399, term8399.getClass(), "owner", "IEYhJmgCVd");
        setField(term8399, term8399.getClass(), "programName", "KSJeYkkvpk");
        setField(term8399, term8399.getClass(), "stepName", "qUtkFGMNUV");
        setField(term8399, term8399.getClass(), "pathName", "mGRiYhnMcR");
        setField(term8399, term8399.getClass(), "procStepName", "NFlvfJCVPO");
        setField(term8399, term8399.getClass(), "completion", "KarbTXFmUU");
        setElement(term8398, 0, term8399);
        setBooleanField(term8487, term8487.getClass(), "active", false);
        setField(term8487, term8487.getClass(), "smfid", "jiUSjqwSIQ");
        setField(term8487, term8487.getClass(), "stepNumber", term8501);
        setField(term8487, term8487.getClass(), "owner", "MgLCedQfoj");
        setField(term8487, term8487.getClass(), "programName", "zgKiINdgNu");
        setField(term8487, term8487.getClass(), "stepName", "zLMTXDQHYH");
        setField(term8487, term8487.getClass(), "pathName", "PqywFWJlpE");
        setField(term8487, term8487.getClass(), "procStepName", "OzXRsFGTIp");
        setField(term8487, term8487.getClass(), "completion", "TjWpyghUWN");
        setElement(term8398, 1, term8487);
        setField(term8301, term8301.getClass(), "stepData", term8398);
        setField(term8301, term8301.getClass(), "url", "dkZFDZxcde");
        setField(term8301, term8301.getClass(), "filesUrl", "WXcZEtUKlI");
        setField(term8301, term8301.getClass(), "jobCorrelator", "IkpjUOuWQU");
        setField(term8301, term8301.getClass(), "phase", term8611);
        setField(term8301, term8301.getClass(), "phaseName", "boSSpezHeU");
        setField(term8301, term8301.getClass(), "execSystem", "OUeBWNTQDh");
        setField(term8301, term8301.getClass(), "execMember", "gltJarNuUk");
        setField(term8301, term8301.getClass(), "execSubmitted", "ZwZIDwYcSW");
        setField(term8301, term8301.getClass(), "execStarted", "sOdkipUKRu");
        setField(term8301, term8301.getClass(), "execEnded", "oKwCDqywym");
        setField(term8301, term8301.getClass(), "reasonNotRunning", "zjZYTddemL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobGet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Object[] args = new Object[1];
        args[0] = term8301;
        callMethod(klass, "getStatusByJob", argTypes, term8288, args);
    }

};


