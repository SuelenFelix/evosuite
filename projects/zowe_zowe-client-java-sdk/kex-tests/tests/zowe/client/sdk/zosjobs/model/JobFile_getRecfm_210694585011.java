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

public class JobFile_getRecfm_210694585011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2336;

    public JobFile_getRecfm_210694585011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2373 = new Long(-2068172595987555756L);
        Long term2375 = new Long(-6292278961887936280L);
        Long term2401 = new Long(-6645965768855543712L);
        Long term2427 = new Long(4784595517102746672L);
        term2336 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term2336, term2336.getClass(), "jobId", "AWRooQKkdW");
        setField(term2336, term2336.getClass(), "jobName", "vjxIhXHxGR");
        setField(term2336, term2336.getClass(), "recfm", "QXzGXbEXMu");
        setField(term2336, term2336.getClass(), "byteCount", term2373);
        setField(term2336, term2336.getClass(), "recordCount", term2375);
        setField(term2336, term2336.getClass(), "jobCorrelator", "qxSDVejjiY");
        setField(term2336, term2336.getClass(), "classs", "xBsXSDjXYK");
        setField(term2336, term2336.getClass(), "id", term2401);
        setField(term2336, term2336.getClass(), "ddName", "sEnIVFtZuQ");
        setField(term2336, term2336.getClass(), "recordsUrl", "ZVecLZMLHF");
        setField(term2336, term2336.getClass(), "lrecl", term2427);
        setField(term2336, term2336.getClass(), "subSystem", "fztQhjqwdP");
        setField(term2336, term2336.getClass(), "stepName", "eVpkWxjuki");
        setField(term2336, term2336.getClass(), "procStep", "SJiQaLvSKv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecfm", argTypes, term2336, args);
    }

};


