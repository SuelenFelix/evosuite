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

public class DsnDownloadInputData_getExtensionMap_17250273536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1419;

    public DsnDownloadInputData_getExtensionMap_17250273536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1481 = new HashMap();
        Long term1491 = new Long(-4325723315152823407L);
        Long term1497 = new Long(2535595959091595249L);
        term1419 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term1456 = (Object[]) newArray("java.lang.String", 2);
        setField(term1419, term1419.getClass(), "file", "IgRJUzaCwW");
        setField(term1419, term1419.getClass(), "extension", "JUmudUmaaV");
        setField(term1419, term1419.getClass(), "directory", "KoyGrUJeJW");
        setElement(term1456, 0, "HqBOwkVqjD");
        setElement(term1456, 1, "MAcUBcBckh");
        setField(term1419, term1419.getClass(), "excludePatterns", term1456);
        setField(term1419, term1419.getClass(), "extensionMap", term1481);
        setField(term1419, term1419.getClass(), "maxConcurrentRequests", term1491);
        setBooleanField(term1419, term1419.getClass(), "returnEtag", true);
        setBooleanField(term1419, term1419.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term1419, term1419.getClass(), "failFast", false);
        setBooleanField(term1419, term1419.getClass(), "binary", false);
        setField(term1419, term1419.getClass(), "encoding", term1497);
        setField(term1419, term1419.getClass(), "volume", "OWKQODBLzb");
        setField(term1419, term1419.getClass(), "task", "wGmYcqUkgE");
        setField(term1419, term1419.getClass(), "responseTimeout", "idgaQsnJpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtensionMap", argTypes, term1419, args);
    }

};


