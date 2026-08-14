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

public class JobStepData_getOwner_14122063964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4357;

    public JobStepData_getOwner_14122063964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4371 = new Long(-8654565919063661957L);
        term4357 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term4357, term4357.getClass(), "active", true);
        setField(term4357, term4357.getClass(), "smfid", "lFRJFUMVbx");
        setField(term4357, term4357.getClass(), "stepNumber", term4371);
        setField(term4357, term4357.getClass(), "owner", "sZdUNdggUW");
        setField(term4357, term4357.getClass(), "programName", "OqbwYQfvAe");
        setField(term4357, term4357.getClass(), "stepName", "tRxZafjqIx");
        setField(term4357, term4357.getClass(), "pathName", "DhjNLmRMCu");
        setField(term4357, term4357.getClass(), "procStepName", "PgPzMSEjjX");
        setField(term4357, term4357.getClass(), "completion", "wzsPSPcRdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobStepData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term4357, args);
    }

};


