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
import java.lang.Long;

public class JobStepData_getSmfid_3736798562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4041;

    public JobStepData_getSmfid_3736798562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4055 = new Long(463622836963501975L);
        term4041 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term4041, term4041.getClass(), "active", false);
        setField(term4041, term4041.getClass(), "smfid", "lihXWlGDxk");
        setField(term4041, term4041.getClass(), "stepNumber", term4055);
        setField(term4041, term4041.getClass(), "owner", "JmcmxoGhIK");
        setField(term4041, term4041.getClass(), "programName", "jXzmYyrnnT");
        setField(term4041, term4041.getClass(), "stepName", "igCAtimmYB");
        setField(term4041, term4041.getClass(), "pathName", "DyiXbeYIaN");
        setField(term4041, term4041.getClass(), "procStepName", "VGizxZnyHX");
        setField(term4041, term4041.getClass(), "completion", "kVEZMHmRtR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobStepData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSmfid", argTypes, term4041, args);
    }

};


