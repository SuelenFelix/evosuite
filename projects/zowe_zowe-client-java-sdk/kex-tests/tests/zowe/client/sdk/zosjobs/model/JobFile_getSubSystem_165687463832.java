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

public class JobFile_getSubSystem_165687463832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3723;

    public JobFile_getSubSystem_165687463832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3723 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term3723, term3723.getClass(), "jobId", null);
        setField(term3723, term3723.getClass(), "jobName", null);
        setField(term3723, term3723.getClass(), "recfm", null);
        setField(term3723, term3723.getClass(), "byteCount", null);
        setField(term3723, term3723.getClass(), "recordCount", null);
        setField(term3723, term3723.getClass(), "jobCorrelator", null);
        setField(term3723, term3723.getClass(), "classs", null);
        setField(term3723, term3723.getClass(), "id", null);
        setField(term3723, term3723.getClass(), "ddName", null);
        setField(term3723, term3723.getClass(), "recordsUrl", null);
        setField(term3723, term3723.getClass(), "lrecl", null);
        setField(term3723, term3723.getClass(), "subSystem", null);
        setField(term3723, term3723.getClass(), "stepName", null);
        setField(term3723, term3723.getClass(), "procStep", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubSystem", argTypes, term3723, args);
    }

};


