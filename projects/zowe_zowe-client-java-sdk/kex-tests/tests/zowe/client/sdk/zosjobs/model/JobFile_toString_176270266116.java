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

public class JobFile_toString_176270266116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3481;

    public JobFile_toString_176270266116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3518 = new Long(7994303628307559416L);
        Long term3520 = new Long(2443640364875054177L);
        Long term3546 = new Long(-1610676979013636850L);
        Long term3572 = new Long(2062173786000223358L);
        term3481 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term3481, term3481.getClass(), "jobId", "MwwjNtdOFT");
        setField(term3481, term3481.getClass(), "jobName", "VYkqXKVlAJ");
        setField(term3481, term3481.getClass(), "recfm", "XkIoWJRNwN");
        setField(term3481, term3481.getClass(), "byteCount", term3518);
        setField(term3481, term3481.getClass(), "recordCount", term3520);
        setField(term3481, term3481.getClass(), "jobCorrelator", "aNWLJdrZMq");
        setField(term3481, term3481.getClass(), "classs", "HHmNoYxIGj");
        setField(term3481, term3481.getClass(), "id", term3546);
        setField(term3481, term3481.getClass(), "ddName", "PtirvZmsGt");
        setField(term3481, term3481.getClass(), "recordsUrl", "HWkpTmtlrc");
        setField(term3481, term3481.getClass(), "lrecl", term3572);
        setField(term3481, term3481.getClass(), "subSystem", "hMmaoREuCK");
        setField(term3481, term3481.getClass(), "stepName", "VeDtgDzGAN");
        setField(term3481, term3481.getClass(), "procStep", "aWYOWZFyaX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3481, args);
    }

};


