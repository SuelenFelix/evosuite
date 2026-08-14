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

public class DsnDownloadInputData_Builder_volume_123722296614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14689;

    public DsnDownloadInputData_Builder_volume_123722296614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14739 = new HashMap();
        Long term14749 = new Long(5953383087795962419L);
        Long term14755 = new Long(7994303628307559416L);
        term14689 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term14726 = (Object[]) newArray("java.lang.String", 1);
        setField(term14689, term14689.getClass(), "file", "GSzQdbHLHw");
        setField(term14689, term14689.getClass(), "extension", "IkfarsYNJO");
        setField(term14689, term14689.getClass(), "directory", "aZKOWhHMEh");
        setElement(term14726, 0, "YfkhviKZwl");
        setField(term14689, term14689.getClass(), "excludePatterns", term14726);
        setField(term14689, term14689.getClass(), "extensionMap", term14739);
        setField(term14689, term14689.getClass(), "maxConcurrentRequests", term14749);
        setBooleanField(term14689, term14689.getClass(), "returnEtag", true);
        setBooleanField(term14689, term14689.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term14689, term14689.getClass(), "failFast", true);
        setBooleanField(term14689, term14689.getClass(), "binary", false);
        setField(term14689, term14689.getClass(), "encoding", term14755);
        setField(term14689, term14689.getClass(), "volume", "xmzSoVgiED");
        setField(term14689, term14689.getClass(), "task", "pdSvedKgPq");
        setField(term14689, term14689.getClass(), "responseTimeout", "epPTwvcoyb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UBPHmOICBs";
        callMethod(klass, "volume", argTypes, term14689, args);
    }

};


