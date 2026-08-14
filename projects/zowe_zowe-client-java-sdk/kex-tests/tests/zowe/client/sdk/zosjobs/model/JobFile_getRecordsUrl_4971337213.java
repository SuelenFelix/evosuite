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

public class JobFile_getRecordsUrl_4971337213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2794;

    public JobFile_getRecordsUrl_4971337213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2831 = new Long(-3842548265506930260L);
        Long term2833 = new Long(-5788180182343976541L);
        Long term2859 = new Long(2936323121573284007L);
        Long term2885 = new Long(-1154553077993834885L);
        term2794 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term2794, term2794.getClass(), "jobId", "WzMEhMXkKx");
        setField(term2794, term2794.getClass(), "jobName", "XOiDvlDhdc");
        setField(term2794, term2794.getClass(), "recfm", "AdxvLJhNLe");
        setField(term2794, term2794.getClass(), "byteCount", term2831);
        setField(term2794, term2794.getClass(), "recordCount", term2833);
        setField(term2794, term2794.getClass(), "jobCorrelator", "lHfTrWKMPk");
        setField(term2794, term2794.getClass(), "classs", "JDaAnsVTGV");
        setField(term2794, term2794.getClass(), "id", term2859);
        setField(term2794, term2794.getClass(), "ddName", "mLUZFTfjle");
        setField(term2794, term2794.getClass(), "recordsUrl", "xIeFjkHkOe");
        setField(term2794, term2794.getClass(), "lrecl", term2885);
        setField(term2794, term2794.getClass(), "subSystem", "SdCKLMIYnX");
        setField(term2794, term2794.getClass(), "stepName", "OJJtVNPyKZ");
        setField(term2794, term2794.getClass(), "procStep", "AKNapTAfmD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecordsUrl", argTypes, term2794, args);
    }

};


