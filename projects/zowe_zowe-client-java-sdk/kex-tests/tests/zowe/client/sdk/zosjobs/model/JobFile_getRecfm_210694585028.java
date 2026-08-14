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

public class JobFile_getRecfm_210694585028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3719;

    public JobFile_getRecfm_210694585028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3719 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term3719, term3719.getClass(), "jobId", null);
        setField(term3719, term3719.getClass(), "jobName", null);
        setField(term3719, term3719.getClass(), "recfm", null);
        setField(term3719, term3719.getClass(), "byteCount", null);
        setField(term3719, term3719.getClass(), "recordCount", null);
        setField(term3719, term3719.getClass(), "jobCorrelator", null);
        setField(term3719, term3719.getClass(), "classs", null);
        setField(term3719, term3719.getClass(), "id", null);
        setField(term3719, term3719.getClass(), "ddName", null);
        setField(term3719, term3719.getClass(), "recordsUrl", null);
        setField(term3719, term3719.getClass(), "lrecl", null);
        setField(term3719, term3719.getClass(), "subSystem", null);
        setField(term3719, term3719.getClass(), "stepName", null);
        setField(term3719, term3719.getClass(), "procStep", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecfm", argTypes, term3719, args);
    }

};


