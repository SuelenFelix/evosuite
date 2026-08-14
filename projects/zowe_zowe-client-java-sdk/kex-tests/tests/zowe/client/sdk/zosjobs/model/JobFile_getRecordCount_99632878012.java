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

public class JobFile_getRecordCount_99632878012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2565;

    public JobFile_getRecordCount_99632878012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2602 = new Long(-7612550318181586304L);
        Long term2604 = new Long(-2170847986967241072L);
        Long term2630 = new Long(4044358158040652353L);
        Long term2656 = new Long(-4443169559037975007L);
        term2565 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term2565, term2565.getClass(), "jobId", "OEXDRUKcFl");
        setField(term2565, term2565.getClass(), "jobName", "RYdKCNNMBR");
        setField(term2565, term2565.getClass(), "recfm", "yGtHPyvYiQ");
        setField(term2565, term2565.getClass(), "byteCount", term2602);
        setField(term2565, term2565.getClass(), "recordCount", term2604);
        setField(term2565, term2565.getClass(), "jobCorrelator", "MvRIxilFMJ");
        setField(term2565, term2565.getClass(), "classs", "iNwOJRBEjp");
        setField(term2565, term2565.getClass(), "id", term2630);
        setField(term2565, term2565.getClass(), "ddName", "XylxrMBraH");
        setField(term2565, term2565.getClass(), "recordsUrl", "pORebkoRdD");
        setField(term2565, term2565.getClass(), "lrecl", term2656);
        setField(term2565, term2565.getClass(), "subSystem", "mXGCWJDOqA");
        setField(term2565, term2565.getClass(), "stepName", "dpNsDgfPso");
        setField(term2565, term2565.getClass(), "procStep", "hCWPJQKpdc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecordCount", argTypes, term2565, args);
    }

};


