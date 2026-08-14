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

public class JobFile_getDdName_11350936904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733;

    public JobFile_getDdName_11350936904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term770 = new Long(2535595959091595249L);
        Long term772 = new Long(-5476826692763582090L);
        Long term798 = new Long(-872011222785455006L);
        Long term824 = new Long(-316468845751588286L);
        term733 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term733, term733.getClass(), "jobId", "AijpHYOFuy");
        setField(term733, term733.getClass(), "jobName", "SbAoxhfrkn");
        setField(term733, term733.getClass(), "recfm", "kuTXqwMtDB");
        setField(term733, term733.getClass(), "byteCount", term770);
        setField(term733, term733.getClass(), "recordCount", term772);
        setField(term733, term733.getClass(), "jobCorrelator", "Ghbwtircqb");
        setField(term733, term733.getClass(), "classs", "xrwlQZdwCp");
        setField(term733, term733.getClass(), "id", term798);
        setField(term733, term733.getClass(), "ddName", "IDCWpPLRkE");
        setField(term733, term733.getClass(), "recordsUrl", "nyiiPDVjAc");
        setField(term733, term733.getClass(), "lrecl", term824);
        setField(term733, term733.getClass(), "subSystem", "aKnKipADSo");
        setField(term733, term733.getClass(), "stepName", "wSQxaModmm");
        setField(term733, term733.getClass(), "procStep", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDdName", argTypes, term733, args);
    }

};


