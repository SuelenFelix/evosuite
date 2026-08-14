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

public class JobFile_getByteCount_16306710512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;

    public JobFile_getByteCount_16306710512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term312 = new Long(7411271909051562686L);
        Long term314 = new Long(4872422362414183754L);
        Long term340 = new Long(6811161968424632369L);
        Long term366 = new Long(-7237588299778557629L);
        term275 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term275, term275.getClass(), "jobId", "MxlszYVzRf");
        setField(term275, term275.getClass(), "jobName", "LQFpaHEwXR");
        setField(term275, term275.getClass(), "recfm", "oVcInYnLWB");
        setField(term275, term275.getClass(), "byteCount", term312);
        setField(term275, term275.getClass(), "recordCount", term314);
        setField(term275, term275.getClass(), "jobCorrelator", "aJlieCFVtF");
        setField(term275, term275.getClass(), "classs", "ZiaGIbnzTs");
        setField(term275, term275.getClass(), "id", term340);
        setField(term275, term275.getClass(), "ddName", "tbcdzjIfER");
        setField(term275, term275.getClass(), "recordsUrl", "HyxfbSQYBe");
        setField(term275, term275.getClass(), "lrecl", term366);
        setField(term275, term275.getClass(), "subSystem", "pCTimMblYc");
        setField(term275, term275.getClass(), "stepName", "hNxWaHcfhY");
        setField(term275, term275.getClass(), "procStep", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getByteCount", argTypes, term275, args);
    }

};


