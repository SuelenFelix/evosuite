package zowe.client.sdk.zosfiles.dsn.methods;

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
import static zowe.client.sdk.zosfiles.dsn.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;

public class DsnGet_get_7389685603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2446;
     Object term2459;

    public DsnGet_get_7389685603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2446 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnGet"));
        setField(term2446, term2446.getClass(), "connection", null);
        setField(term2446, term2446.getClass(), "request", null);
        HashMap term2533 = new HashMap();
        Long term2543 = new Long(2442117782898005296L);
        Long term2549 = new Long(6375119433582206027L);
        term2459 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term2496 = (Object[]) newArray("java.lang.String", 3);
        setField(term2459, term2459.getClass(), "file", "ieCtQFdkii");
        setField(term2459, term2459.getClass(), "extension", "dEnhdmILtU");
        setField(term2459, term2459.getClass(), "directory", "hoicvmsovO");
        setElement(term2496, 0, "eqJfYWRaEL");
        setElement(term2496, 1, "fhkbdRViHi");
        setElement(term2496, 2, "uWHnvSvaPl");
        setField(term2459, term2459.getClass(), "excludePatterns", term2496);
        setField(term2459, term2459.getClass(), "extensionMap", term2533);
        setField(term2459, term2459.getClass(), "maxConcurrentRequests", term2543);
        setBooleanField(term2459, term2459.getClass(), "returnEtag", true);
        setBooleanField(term2459, term2459.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term2459, term2459.getClass(), "failFast", true);
        setBooleanField(term2459, term2459.getClass(), "binary", false);
        setField(term2459, term2459.getClass(), "encoding", term2549);
        setField(term2459, term2459.getClass(), "volume", "tPlsykYBqO");
        setField(term2459, term2459.getClass(), "task", "bLPjGVBhlX");
        setField(term2459, term2459.getClass(), "responseTimeout", "whBvTVIIlC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnGet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Object[] args = new Object[2];
        args[0] = "nHXjMycHlU";
        args[1] = term2459;
        callMethod(klass, "get", argTypes, term2446, args);
    }

};


