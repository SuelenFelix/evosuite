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

public class JobGet_getSpoolContent_173267545911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6141;
     Object term6154;

    public JobGet_getSpoolContent_173267545911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6141 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobGet"));
        setField(term6141, term6141.getClass(), "connection", null);
        setField(term6141, term6141.getClass(), "request", null);
        setField(term6141, term6141.getClass(), "url", "NHbOFFjyVK");
        Long term6191 = new Long(8059786003080744426L);
        Long term6193 = new Long(-4365849114644724155L);
        Long term6219 = new Long(2486810210675247493L);
        Long term6245 = new Long(7009926388951271268L);
        term6154 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term6154, term6154.getClass(), "jobId", "zaloBqlrSo");
        setField(term6154, term6154.getClass(), "jobName", "vvoLrMGCoN");
        setField(term6154, term6154.getClass(), "recfm", "pXdglvyrQe");
        setField(term6154, term6154.getClass(), "byteCount", term6191);
        setField(term6154, term6154.getClass(), "recordCount", term6193);
        setField(term6154, term6154.getClass(), "jobCorrelator", "OcfNzHYdki");
        setField(term6154, term6154.getClass(), "classs", "uPuCVuZYOI");
        setField(term6154, term6154.getClass(), "id", term6219);
        setField(term6154, term6154.getClass(), "ddName", "TweMFhxNdj");
        setField(term6154, term6154.getClass(), "recordsUrl", "NBrvVzvQHe");
        setField(term6154, term6154.getClass(), "lrecl", term6245);
        setField(term6154, term6154.getClass(), "subSystem", "FjOiNAfBOc");
        setField(term6154, term6154.getClass(), "stepName", "iCCsaLHohG");
        setField(term6154, term6154.getClass(), "procStep", "NJhGgctbdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobGet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Object[] args = new Object[1];
        args[0] = term6154;
        callMethod(klass, "getSpoolContent", argTypes, term6141, args);
    }

};


