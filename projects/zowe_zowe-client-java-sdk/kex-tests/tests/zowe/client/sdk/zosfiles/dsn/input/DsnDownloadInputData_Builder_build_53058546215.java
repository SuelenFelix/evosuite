package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;

public class DsnDownloadInputData_Builder_build_53058546215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14885;

    public DsnDownloadInputData_Builder_build_53058546215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15019 = new HashMap();
        Long term15029 = new Long(2443640364875054177L);
        Long term15035 = new Long(-1610676979013636850L);
        term14885 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term14922 = (Object[]) newArray("java.lang.String", 8);
        setField(term14885, term14885.getClass(), "file", "IDJUVPgUJf");
        setField(term14885, term14885.getClass(), "extension", "JmnWRJUxGr");
        setField(term14885, term14885.getClass(), "directory", "wgRGBNrTGP");
        setElement(term14922, 0, "FIdNVptZpW");
        setElement(term14922, 1, "rQjxAhisjm");
        setElement(term14922, 2, "ZDhASPHjDG");
        setElement(term14922, 3, "HNVOAXYNEZ");
        setElement(term14922, 4, "gbbYBYyfvr");
        setElement(term14922, 5, "SrWMUlbtWV");
        setElement(term14922, 6, "VePIumgrrU");
        setElement(term14922, 7, "DPwIqlszZo");
        setField(term14885, term14885.getClass(), "excludePatterns", term14922);
        setField(term14885, term14885.getClass(), "extensionMap", term15019);
        setField(term14885, term14885.getClass(), "maxConcurrentRequests", term15029);
        setBooleanField(term14885, term14885.getClass(), "returnEtag", false);
        setBooleanField(term14885, term14885.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term14885, term14885.getClass(), "failFast", false);
        setBooleanField(term14885, term14885.getClass(), "binary", false);
        setField(term14885, term14885.getClass(), "encoding", term15035);
        setField(term14885, term14885.getClass(), "volume", "iVOvTzOxwt");
        setField(term14885, term14885.getClass(), "task", "BjZQdecXvB");
        setField(term14885, term14885.getClass(), "responseTimeout", "iUkOOQhEkw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term14885, args);
    }

};


