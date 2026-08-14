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

public class JobFile_getStepName_206813913014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3023;

    public JobFile_getStepName_206813913014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3060 = new Long(-2850532706972744550L);
        Long term3062 = new Long(-2644215923136513282L);
        Long term3088 = new Long(-1468719814009985452L);
        Long term3114 = new Long(-7738503207562305297L);
        term3023 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term3023, term3023.getClass(), "jobId", "xJgPlLxpgC");
        setField(term3023, term3023.getClass(), "jobName", "EYtfuJaxiM");
        setField(term3023, term3023.getClass(), "recfm", "gCWtLVKVVe");
        setField(term3023, term3023.getClass(), "byteCount", term3060);
        setField(term3023, term3023.getClass(), "recordCount", term3062);
        setField(term3023, term3023.getClass(), "jobCorrelator", "fWKJoSoCwE");
        setField(term3023, term3023.getClass(), "classs", "wfaXBpWAUH");
        setField(term3023, term3023.getClass(), "id", term3088);
        setField(term3023, term3023.getClass(), "ddName", "VMeAzAHwZj");
        setField(term3023, term3023.getClass(), "recordsUrl", "PznxWXsZME");
        setField(term3023, term3023.getClass(), "lrecl", term3114);
        setField(term3023, term3023.getClass(), "subSystem", "ZzIujlwVsw");
        setField(term3023, term3023.getClass(), "stepName", "LWyEaeIyAo");
        setField(term3023, term3023.getClass(), "procStep", "yVMkkQhvmN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStepName", argTypes, term3023, args);
    }

};


