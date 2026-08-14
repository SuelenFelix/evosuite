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

public class JobFile_getSubSystem_165687463815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3252;

    public JobFile_getSubSystem_165687463815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3289 = new Long(3825396310311739952L);
        Long term3291 = new Long(-3838084482494604218L);
        Long term3317 = new Long(3892018155439224435L);
        Long term3343 = new Long(5953383087795962419L);
        term3252 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term3252, term3252.getClass(), "jobId", "mvrkADEgpp");
        setField(term3252, term3252.getClass(), "jobName", "pXOkjyeIRb");
        setField(term3252, term3252.getClass(), "recfm", "GgZWSjxjyE");
        setField(term3252, term3252.getClass(), "byteCount", term3289);
        setField(term3252, term3252.getClass(), "recordCount", term3291);
        setField(term3252, term3252.getClass(), "jobCorrelator", "EeBVbzjcCI");
        setField(term3252, term3252.getClass(), "classs", "UfQtPRyWRC");
        setField(term3252, term3252.getClass(), "id", term3317);
        setField(term3252, term3252.getClass(), "ddName", "FPvxVzzSvD");
        setField(term3252, term3252.getClass(), "recordsUrl", "WHcwFgsGFC");
        setField(term3252, term3252.getClass(), "lrecl", term3343);
        setField(term3252, term3252.getClass(), "subSystem", "HzqpegHiRq");
        setField(term3252, term3252.getClass(), "stepName", "jwsfVjMoJT");
        setField(term3252, term3252.getClass(), "procStep", "ZfdXfCCFDf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubSystem", argTypes, term3252, args);
    }

};


