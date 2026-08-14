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

public class JobStepData_getProgramName_62443346416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5473;

    public JobStepData_getProgramName_62443346416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5473 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term5473, term5473.getClass(), "active", false);
        setField(term5473, term5473.getClass(), "smfid", null);
        setField(term5473, term5473.getClass(), "stepNumber", null);
        setField(term5473, term5473.getClass(), "owner", null);
        setField(term5473, term5473.getClass(), "programName", null);
        setField(term5473, term5473.getClass(), "stepName", null);
        setField(term5473, term5473.getClass(), "pathName", null);
        setField(term5473, term5473.getClass(), "procStepName", null);
        setField(term5473, term5473.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobStepData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProgramName", argTypes, term5473, args);
    }

};


