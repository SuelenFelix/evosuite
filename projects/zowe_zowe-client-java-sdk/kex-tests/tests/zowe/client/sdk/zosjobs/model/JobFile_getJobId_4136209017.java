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

public class JobFile_getJobId_4136209017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1420;

    public JobFile_getJobId_4136209017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1457 = new Long(7009926388951271268L);
        Long term1459 = new Long(-7672528020740371001L);
        Long term1485 = new Long(-4502405999831680926L);
        Long term1511 = new Long(1967728129628047933L);
        term1420 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term1420, term1420.getClass(), "jobId", "hoicvmsovO");
        setField(term1420, term1420.getClass(), "jobName", "eqJfYWRaEL");
        setField(term1420, term1420.getClass(), "recfm", "fhkbdRViHi");
        setField(term1420, term1420.getClass(), "byteCount", term1457);
        setField(term1420, term1420.getClass(), "recordCount", term1459);
        setField(term1420, term1420.getClass(), "jobCorrelator", "uWHnvSvaPl");
        setField(term1420, term1420.getClass(), "classs", "kBdSllIBVz");
        setField(term1420, term1420.getClass(), "id", term1485);
        setField(term1420, term1420.getClass(), "ddName", "TJmVBGfTML");
        setField(term1420, term1420.getClass(), "recordsUrl", "tPlsykYBqO");
        setField(term1420, term1420.getClass(), "lrecl", term1511);
        setField(term1420, term1420.getClass(), "subSystem", "bLPjGVBhlX");
        setField(term1420, term1420.getClass(), "stepName", "whBvTVIIlC");
        setField(term1420, term1420.getClass(), "procStep", "IgRJUzaCwW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobId", argTypes, term1420, args);
    }

};


