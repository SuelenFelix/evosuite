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

public class JobStepData_getCompletion_16438925279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5147;

    public JobStepData_getCompletion_16438925279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5161 = new Long(682356318767179819L);
        term5147 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term5147, term5147.getClass(), "active", true);
        setField(term5147, term5147.getClass(), "smfid", "qCpEbQDHdF");
        setField(term5147, term5147.getClass(), "stepNumber", term5161);
        setField(term5147, term5147.getClass(), "owner", "AHbZyFOmlo");
        setField(term5147, term5147.getClass(), "programName", "TwfWVQGiIj");
        setField(term5147, term5147.getClass(), "stepName", "gUvcueTURF");
        setField(term5147, term5147.getClass(), "pathName", "EwQBhZjCIT");
        setField(term5147, term5147.getClass(), "procStepName", "aSkmSwTnEw");
        setField(term5147, term5147.getClass(), "completion", "xvkbvaEGYd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobStepData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCompletion", argTypes, term5147, args);
    }

};


