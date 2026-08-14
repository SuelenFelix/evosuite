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

public class JobStepData_getStepName_6258260046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4673;

    public JobStepData_getStepName_6258260046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4687 = new Long(-6723783499250797216L);
        term4673 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term4673, term4673.getClass(), "active", true);
        setField(term4673, term4673.getClass(), "smfid", "BjugTaMcxJ");
        setField(term4673, term4673.getClass(), "stepNumber", term4687);
        setField(term4673, term4673.getClass(), "owner", "vGiuZVPJNH");
        setField(term4673, term4673.getClass(), "programName", "tlzpzIjMib");
        setField(term4673, term4673.getClass(), "stepName", "AZdLeSugwv");
        setField(term4673, term4673.getClass(), "pathName", "RMsXuyzKJV");
        setField(term4673, term4673.getClass(), "procStepName", "FwPbDZcHmB");
        setField(term4673, term4673.getClass(), "completion", "hOncybyCAH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobStepData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStepName", argTypes, term4673, args);
    }

};


