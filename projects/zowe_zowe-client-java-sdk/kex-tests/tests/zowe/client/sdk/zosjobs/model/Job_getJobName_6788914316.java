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

public class Job_getJobName_6788914316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8205;

    public Job_getJobName_6788914316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8317 = new Long(5836128569274066678L);
        Long term8405 = new Long(-2177368829816872572L);
        Long term8493 = new Long(-8463029266761149071L);
        Long term8581 = new Long(3133860696238261492L);
        Long term8691 = new Long(7247160664318067468L);
        term8205 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term8302 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 4);
        Object term8303 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term8391 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term8479 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term8567 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term8205, term8205.getClass(), "jobId", "AWYyZiNfsm");
        setField(term8205, term8205.getClass(), "jobName", "ITRRYiuDwH");
        setField(term8205, term8205.getClass(), "subSystem", "llRfwANcVF");
        setField(term8205, term8205.getClass(), "owner", "sUEeHQTWkA");
        setField(term8205, term8205.getClass(), "status", "BDIRCxAWLA");
        setField(term8205, term8205.getClass(), "type", "eOJfbiZLnb");
        setField(term8205, term8205.getClass(), "classs", "nKZKnxWYCK");
        setField(term8205, term8205.getClass(), "retCode", "JOqQxuzRuZ");
        setBooleanField(term8303, term8303.getClass(), "active", true);
        setField(term8303, term8303.getClass(), "smfid", "RSaoipUlsg");
        setField(term8303, term8303.getClass(), "stepNumber", term8317);
        setField(term8303, term8303.getClass(), "owner", "cSHGbqKqlN");
        setField(term8303, term8303.getClass(), "programName", "pFAfANnxup");
        setField(term8303, term8303.getClass(), "stepName", "FbSIUZyBXZ");
        setField(term8303, term8303.getClass(), "pathName", "mhQDwIyrRi");
        setField(term8303, term8303.getClass(), "procStepName", "HpZXWDPhlg");
        setField(term8303, term8303.getClass(), "completion", "lBOokzEPfe");
        setElement(term8302, 0, term8303);
        setBooleanField(term8391, term8391.getClass(), "active", true);
        setField(term8391, term8391.getClass(), "smfid", "dtGZCsKXbW");
        setField(term8391, term8391.getClass(), "stepNumber", term8405);
        setField(term8391, term8391.getClass(), "owner", "bdyhHbDAmJ");
        setField(term8391, term8391.getClass(), "programName", "BBXiTNHqGE");
        setField(term8391, term8391.getClass(), "stepName", "IEYhJmgCVd");
        setField(term8391, term8391.getClass(), "pathName", "KSJeYkkvpk");
        setField(term8391, term8391.getClass(), "procStepName", "qUtkFGMNUV");
        setField(term8391, term8391.getClass(), "completion", "mGRiYhnMcR");
        setElement(term8302, 1, term8391);
        setBooleanField(term8479, term8479.getClass(), "active", false);
        setField(term8479, term8479.getClass(), "smfid", "NFlvfJCVPO");
        setField(term8479, term8479.getClass(), "stepNumber", term8493);
        setField(term8479, term8479.getClass(), "owner", "KarbTXFmUU");
        setField(term8479, term8479.getClass(), "programName", "jiUSjqwSIQ");
        setField(term8479, term8479.getClass(), "stepName", "MgLCedQfoj");
        setField(term8479, term8479.getClass(), "pathName", "zgKiINdgNu");
        setField(term8479, term8479.getClass(), "procStepName", "zLMTXDQHYH");
        setField(term8479, term8479.getClass(), "completion", "PqywFWJlpE");
        setElement(term8302, 2, term8479);
        setBooleanField(term8567, term8567.getClass(), "active", false);
        setField(term8567, term8567.getClass(), "smfid", "OzXRsFGTIp");
        setField(term8567, term8567.getClass(), "stepNumber", term8581);
        setField(term8567, term8567.getClass(), "owner", "TjWpyghUWN");
        setField(term8567, term8567.getClass(), "programName", "dkZFDZxcde");
        setField(term8567, term8567.getClass(), "stepName", "WXcZEtUKlI");
        setField(term8567, term8567.getClass(), "pathName", "IkpjUOuWQU");
        setField(term8567, term8567.getClass(), "procStepName", "boSSpezHeU");
        setField(term8567, term8567.getClass(), "completion", "OUeBWNTQDh");
        setElement(term8302, 3, term8567);
        setField(term8205, term8205.getClass(), "stepData", term8302);
        setField(term8205, term8205.getClass(), "url", "gltJarNuUk");
        setField(term8205, term8205.getClass(), "filesUrl", "ZwZIDwYcSW");
        setField(term8205, term8205.getClass(), "jobCorrelator", "sOdkipUKRu");
        setField(term8205, term8205.getClass(), "phase", term8691);
        setField(term8205, term8205.getClass(), "phaseName", "oKwCDqywym");
        setField(term8205, term8205.getClass(), "execSystem", "zjZYTddemL");
        setField(term8205, term8205.getClass(), "execMember", "QtrylgCLiF");
        setField(term8205, term8205.getClass(), "execSubmitted", "orEuhCStGM");
        setField(term8205, term8205.getClass(), "execStarted", "HhEaSXWvrY");
        setField(term8205, term8205.getClass(), "execEnded", "CVRGEomOth");
        setField(term8205, term8205.getClass(), "reasonNotRunning", "vSeruUyNWX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobName", argTypes, term8205, args);
    }

};


