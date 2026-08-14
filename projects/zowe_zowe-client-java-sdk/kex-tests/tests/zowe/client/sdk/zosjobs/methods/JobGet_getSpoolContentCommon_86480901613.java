package zowe.client.sdk.zosjobs.methods;

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
import static zowe.client.sdk.zosjobs.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class JobGet_getSpoolContentCommon_86480901613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6462;
     Object term6475;

    public JobGet_getSpoolContentCommon_86480901613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6462 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobGet"));
        setField(term6462, term6462.getClass(), "connection", null);
        setField(term6462, term6462.getClass(), "request", null);
        setField(term6462, term6462.getClass(), "url", "GJVkUrCVdD");
        Long term6512 = new Long(-4502405999831680926L);
        Long term6514 = new Long(1967728129628047933L);
        Long term6540 = new Long(2120084523938730454L);
        Long term6566 = new Long(6855071767938501807L);
        term6475 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term6475, term6475.getClass(), "jobId", "zNdorvdUgu");
        setField(term6475, term6475.getClass(), "jobName", "oPxuZbkYio");
        setField(term6475, term6475.getClass(), "recfm", "vKitydDVnM");
        setField(term6475, term6475.getClass(), "byteCount", term6512);
        setField(term6475, term6475.getClass(), "recordCount", term6514);
        setField(term6475, term6475.getClass(), "jobCorrelator", "urCiQnUFBM");
        setField(term6475, term6475.getClass(), "classs", "EKjQdtKxAM");
        setField(term6475, term6475.getClass(), "id", term6540);
        setField(term6475, term6475.getClass(), "ddName", "TXZAIPQJHt");
        setField(term6475, term6475.getClass(), "recordsUrl", "DIbeDHICho");
        setField(term6475, term6475.getClass(), "lrecl", term6566);
        setField(term6475, term6475.getClass(), "subSystem", "dJGPlmSRnz");
        setField(term6475, term6475.getClass(), "stepName", "DPskuFUobI");
        setField(term6475, term6475.getClass(), "procStep", "wBGfLpNNiZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobGet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Object[] args = new Object[1];
        args[0] = term6475;
        callMethod(klass, "getSpoolContentCommon", argTypes, term6462, args);
    }

};


