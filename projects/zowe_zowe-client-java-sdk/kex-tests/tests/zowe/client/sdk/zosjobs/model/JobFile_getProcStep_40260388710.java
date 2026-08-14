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

public class JobFile_getProcStep_40260388710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2107;

    public JobFile_getProcStep_40260388710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2144 = new Long(1439298019805881866L);
        Long term2146 = new Long(-8708192233349544946L);
        Long term2172 = new Long(5907001541142728739L);
        Long term2198 = new Long(4178434741742309755L);
        term2107 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term2107, term2107.getClass(), "jobId", "GVizqqzXpy");
        setField(term2107, term2107.getClass(), "jobName", "JqXGgAhZPl");
        setField(term2107, term2107.getClass(), "recfm", "jiKYgYHqIS");
        setField(term2107, term2107.getClass(), "byteCount", term2144);
        setField(term2107, term2107.getClass(), "recordCount", term2146);
        setField(term2107, term2107.getClass(), "jobCorrelator", "DfISiziTgG");
        setField(term2107, term2107.getClass(), "classs", "XqgfKFvPSD");
        setField(term2107, term2107.getClass(), "id", term2172);
        setField(term2107, term2107.getClass(), "ddName", "JiVRgTZvKc");
        setField(term2107, term2107.getClass(), "recordsUrl", "XPKmummaqg");
        setField(term2107, term2107.getClass(), "lrecl", term2198);
        setField(term2107, term2107.getClass(), "subSystem", "BKLfkLiZTH");
        setField(term2107, term2107.getClass(), "stepName", "SPpkrGcPRr");
        setField(term2107, term2107.getClass(), "procStep", "sEccwbJKYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProcStep", argTypes, term2107, args);
    }

};


