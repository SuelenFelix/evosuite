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

public class JobFile_getLrecl_55781393026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3717;

    public JobFile_getLrecl_55781393026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3717 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term3717, term3717.getClass(), "jobId", null);
        setField(term3717, term3717.getClass(), "jobName", null);
        setField(term3717, term3717.getClass(), "recfm", null);
        setField(term3717, term3717.getClass(), "byteCount", null);
        setField(term3717, term3717.getClass(), "recordCount", null);
        setField(term3717, term3717.getClass(), "jobCorrelator", null);
        setField(term3717, term3717.getClass(), "classs", null);
        setField(term3717, term3717.getClass(), "id", null);
        setField(term3717, term3717.getClass(), "ddName", null);
        setField(term3717, term3717.getClass(), "recordsUrl", null);
        setField(term3717, term3717.getClass(), "lrecl", null);
        setField(term3717, term3717.getClass(), "subSystem", null);
        setField(term3717, term3717.getClass(), "stepName", null);
        setField(term3717, term3717.getClass(), "procStep", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLrecl", argTypes, term3717, args);
    }

};


