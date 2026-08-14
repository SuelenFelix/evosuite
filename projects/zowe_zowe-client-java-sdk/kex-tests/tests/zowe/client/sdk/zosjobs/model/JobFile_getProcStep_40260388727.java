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

public class JobFile_getProcStep_40260388727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3718;

    public JobFile_getProcStep_40260388727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3718 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term3718, term3718.getClass(), "jobId", null);
        setField(term3718, term3718.getClass(), "jobName", null);
        setField(term3718, term3718.getClass(), "recfm", null);
        setField(term3718, term3718.getClass(), "byteCount", null);
        setField(term3718, term3718.getClass(), "recordCount", null);
        setField(term3718, term3718.getClass(), "jobCorrelator", null);
        setField(term3718, term3718.getClass(), "classs", null);
        setField(term3718, term3718.getClass(), "id", null);
        setField(term3718, term3718.getClass(), "ddName", null);
        setField(term3718, term3718.getClass(), "recordsUrl", null);
        setField(term3718, term3718.getClass(), "lrecl", null);
        setField(term3718, term3718.getClass(), "subSystem", null);
        setField(term3718, term3718.getClass(), "stepName", null);
        setField(term3718, term3718.getClass(), "procStep", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProcStep", argTypes, term3718, args);
    }

};


