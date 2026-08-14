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

public class JobStepData_getProgramName_6244334645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4515;

    public JobStepData_getProgramName_6244334645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4529 = new Long(-5248475803419977214L);
        term4515 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term4515, term4515.getClass(), "active", true);
        setField(term4515, term4515.getClass(), "smfid", "kGMQdqJYyB");
        setField(term4515, term4515.getClass(), "stepNumber", term4529);
        setField(term4515, term4515.getClass(), "owner", "XJJNClzHRf");
        setField(term4515, term4515.getClass(), "programName", "HDaezxQfQR");
        setField(term4515, term4515.getClass(), "stepName", "iikZEapDlu");
        setField(term4515, term4515.getClass(), "pathName", "nhoHrZfnIN");
        setField(term4515, term4515.getClass(), "procStepName", "ZkMALXpEAZ");
        setField(term4515, term4515.getClass(), "completion", "tXfQjSqDzN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobStepData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProgramName", argTypes, term4515, args);
    }

};


