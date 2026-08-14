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

public class JobFile_getId_20963338035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term962;

    public JobFile_getId_20963338035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term999 = new Long(5127676408959197577L);
        Long term1001 = new Long(-6573104506744284592L);
        Long term1027 = new Long(-4920224193275732920L);
        Long term1053 = new Long(8428634514691209827L);
        term962 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term962, term962.getClass(), "jobId", "gGSMzuGICf");
        setField(term962, term962.getClass(), "jobName", "hxCBltsObl");
        setField(term962, term962.getClass(), "recfm", "BndsHwAFMv");
        setField(term962, term962.getClass(), "byteCount", term999);
        setField(term962, term962.getClass(), "recordCount", term1001);
        setField(term962, term962.getClass(), "jobCorrelator", "GzFkzHGYFt");
        setField(term962, term962.getClass(), "classs", "tShwQLRGNe");
        setField(term962, term962.getClass(), "id", term1027);
        setField(term962, term962.getClass(), "ddName", "LvtrsXUliU");
        setField(term962, term962.getClass(), "recordsUrl", "xLbjWUgOIL");
        setField(term962, term962.getClass(), "lrecl", term1053);
        setField(term962, term962.getClass(), "subSystem", "jDtqGUpnZN");
        setField(term962, term962.getClass(), "stepName", "nGKItKLYNC");
        setField(term962, term962.getClass(), "procStep", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term962, args);
    }

};


