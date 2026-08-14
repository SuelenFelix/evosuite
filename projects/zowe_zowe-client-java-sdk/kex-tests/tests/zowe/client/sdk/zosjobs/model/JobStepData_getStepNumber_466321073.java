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

public class JobStepData_getStepNumber_466321073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199;

    public JobStepData_getStepNumber_466321073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4213 = new Long(305759998609888272L);
        term4199 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term4199, term4199.getClass(), "active", false);
        setField(term4199, term4199.getClass(), "smfid", "ekxGuOYIwi");
        setField(term4199, term4199.getClass(), "stepNumber", term4213);
        setField(term4199, term4199.getClass(), "owner", "RbVQXSpxXy");
        setField(term4199, term4199.getClass(), "programName", "YpJbIgJWWv");
        setField(term4199, term4199.getClass(), "stepName", "JppkknKVOw");
        setField(term4199, term4199.getClass(), "pathName", "iljANwuEjk");
        setField(term4199, term4199.getClass(), "procStepName", "kNqaJKIATy");
        setField(term4199, term4199.getClass(), "completion", "vKQukfbJUd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobStepData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStepNumber", argTypes, term4199, args);
    }

};


