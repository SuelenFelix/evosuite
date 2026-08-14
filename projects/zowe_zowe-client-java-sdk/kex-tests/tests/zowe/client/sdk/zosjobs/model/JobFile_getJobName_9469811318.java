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

public class JobFile_getJobName_9469811318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1649;

    public JobFile_getJobName_9469811318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1686 = new Long(2120084523938730454L);
        Long term1688 = new Long(6855071767938501807L);
        Long term1714 = new Long(-5892135042702373494L);
        Long term1740 = new Long(5262507301787091109L);
        term1649 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term1649, term1649.getClass(), "jobId", "JUmudUmaaV");
        setField(term1649, term1649.getClass(), "jobName", "KoyGrUJeJW");
        setField(term1649, term1649.getClass(), "recfm", "HqBOwkVqjD");
        setField(term1649, term1649.getClass(), "byteCount", term1686);
        setField(term1649, term1649.getClass(), "recordCount", term1688);
        setField(term1649, term1649.getClass(), "jobCorrelator", "MAcUBcBckh");
        setField(term1649, term1649.getClass(), "classs", "oVgzLbrsFr");
        setField(term1649, term1649.getClass(), "id", term1714);
        setField(term1649, term1649.getClass(), "ddName", "vQVyKLdtaz");
        setField(term1649, term1649.getClass(), "recordsUrl", "OWKQODBLzb");
        setField(term1649, term1649.getClass(), "lrecl", term1740);
        setField(term1649, term1649.getClass(), "subSystem", "wGmYcqUkgE");
        setField(term1649, term1649.getClass(), "stepName", "idgaQsnJpQ");
        setField(term1649, term1649.getClass(), "procStep", "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobName", argTypes, term1649, args);
    }

};


