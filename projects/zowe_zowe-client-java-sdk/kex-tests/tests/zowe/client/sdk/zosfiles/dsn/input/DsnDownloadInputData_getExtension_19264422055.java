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

public class DsnDownloadInputData_getExtension_19264422055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1135;

    public DsnDownloadInputData_getExtension_19264422055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1245 = new HashMap();
        Long term1255 = new Long(-2813493605142626659L);
        Long term1261 = new Long(-8885298608300233488L);
        term1135 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term1172 = (Object[]) newArray("java.lang.String", 6);
        setField(term1135, term1135.getClass(), "file", "MLqYREekMl");
        setField(term1135, term1135.getClass(), "extension", "ytSBIKXogI");
        setField(term1135, term1135.getClass(), "directory", "nHXjMycHlU");
        setElement(term1172, 0, "ieCtQFdkii");
        setElement(term1172, 1, "dEnhdmILtU");
        setElement(term1172, 2, "hoicvmsovO");
        setElement(term1172, 3, "eqJfYWRaEL");
        setElement(term1172, 4, "fhkbdRViHi");
        setElement(term1172, 5, "uWHnvSvaPl");
        setField(term1135, term1135.getClass(), "excludePatterns", term1172);
        setField(term1135, term1135.getClass(), "extensionMap", term1245);
        setField(term1135, term1135.getClass(), "maxConcurrentRequests", term1255);
        setBooleanField(term1135, term1135.getClass(), "returnEtag", true);
        setBooleanField(term1135, term1135.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term1135, term1135.getClass(), "failFast", true);
        setBooleanField(term1135, term1135.getClass(), "binary", true);
        setField(term1135, term1135.getClass(), "encoding", term1261);
        setField(term1135, term1135.getClass(), "volume", "tPlsykYBqO");
        setField(term1135, term1135.getClass(), "task", "bLPjGVBhlX");
        setField(term1135, term1135.getClass(), "responseTimeout", "whBvTVIIlC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtension", argTypes, term1135, args);
    }

};


