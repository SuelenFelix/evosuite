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

public class Job_getStatus_11787024999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11143;

    public Job_getStatus_11787024999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11255 = new Long(-5786861555969446503L);
        Long term11343 = new Long(2354625302846375590L);
        Long term11453 = new Long(7276637106827860087L);
        term11143 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term11240 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 2);
        Object term11241 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term11329 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term11143, term11143.getClass(), "jobId", "jiCGTTzKGB");
        setField(term11143, term11143.getClass(), "jobName", "MqICFYzDJj");
        setField(term11143, term11143.getClass(), "subSystem", "YgQvdcBQKw");
        setField(term11143, term11143.getClass(), "owner", "FiYYLuailz");
        setField(term11143, term11143.getClass(), "status", "XebAeSnCKZ");
        setField(term11143, term11143.getClass(), "type", "GeddnXjHGy");
        setField(term11143, term11143.getClass(), "classs", "vLTbaoAxBm");
        setField(term11143, term11143.getClass(), "retCode", "BXTjEyEZxD");
        setBooleanField(term11241, term11241.getClass(), "active", false);
        setField(term11241, term11241.getClass(), "smfid", "oKhVzOKUFW");
        setField(term11241, term11241.getClass(), "stepNumber", term11255);
        setField(term11241, term11241.getClass(), "owner", "mNHyqmOAFy");
        setField(term11241, term11241.getClass(), "programName", "UxgSdhxPCH");
        setField(term11241, term11241.getClass(), "stepName", "DAujxZPHJC");
        setField(term11241, term11241.getClass(), "pathName", "IlBhdrCvHq");
        setField(term11241, term11241.getClass(), "procStepName", "OirVUQhauU");
        setField(term11241, term11241.getClass(), "completion", "GLbyDfbNZI");
        setElement(term11240, 0, term11241);
        setBooleanField(term11329, term11329.getClass(), "active", true);
        setField(term11329, term11329.getClass(), "smfid", "oNLcCYDAsO");
        setField(term11329, term11329.getClass(), "stepNumber", term11343);
        setField(term11329, term11329.getClass(), "owner", "CNqMxLvtcJ");
        setField(term11329, term11329.getClass(), "programName", "ktbqerIaKW");
        setField(term11329, term11329.getClass(), "stepName", "VoghngXfsK");
        setField(term11329, term11329.getClass(), "pathName", "GbahCBMvct");
        setField(term11329, term11329.getClass(), "procStepName", "iiHBhsNFgk");
        setField(term11329, term11329.getClass(), "completion", "HknsTajwxJ");
        setElement(term11240, 1, term11329);
        setField(term11143, term11143.getClass(), "stepData", term11240);
        setField(term11143, term11143.getClass(), "url", "XtiurrVYKw");
        setField(term11143, term11143.getClass(), "filesUrl", "rsumfoDNHa");
        setField(term11143, term11143.getClass(), "jobCorrelator", "ceCWHUTQUM");
        setField(term11143, term11143.getClass(), "phase", term11453);
        setField(term11143, term11143.getClass(), "phaseName", "LrqwfrKKtS");
        setField(term11143, term11143.getClass(), "execSystem", "ZUdnQXfzCI");
        setField(term11143, term11143.getClass(), "execMember", "EULDrUNQvw");
        setField(term11143, term11143.getClass(), "execSubmitted", "BtvAvsJSei");
        setField(term11143, term11143.getClass(), "execStarted", "vqnBkkxoIa");
        setField(term11143, term11143.getClass(), "execEnded", "bycpZjxXFn");
        setField(term11143, term11143.getClass(), "reasonNotRunning", "jQWttOAiwL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term11143, args);
    }

};


