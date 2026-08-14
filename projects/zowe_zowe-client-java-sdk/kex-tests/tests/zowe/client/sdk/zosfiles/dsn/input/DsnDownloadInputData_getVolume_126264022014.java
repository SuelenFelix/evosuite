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

public class DsnDownloadInputData_getVolume_126264022014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3383;

    public DsnDownloadInputData_getVolume_126264022014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3457 = new HashMap();
        Long term3467 = new Long(1967728129628047933L);
        Long term3473 = new Long(2120084523938730454L);
        term3383 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term3420 = (Object[]) newArray("java.lang.String", 3);
        setField(term3383, term3383.getClass(), "file", "DSNsTGYXDF");
        setField(term3383, term3383.getClass(), "extension", "sQvGcVjdEx");
        setField(term3383, term3383.getClass(), "directory", "rLHAoqXgPh");
        setElement(term3420, 0, "zUlRdimJtU");
        setElement(term3420, 1, "vwbEQQNQrx");
        setElement(term3420, 2, "xtftXXMbem");
        setField(term3383, term3383.getClass(), "excludePatterns", term3420);
        setField(term3383, term3383.getClass(), "extensionMap", term3457);
        setField(term3383, term3383.getClass(), "maxConcurrentRequests", term3467);
        setBooleanField(term3383, term3383.getClass(), "returnEtag", false);
        setBooleanField(term3383, term3383.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term3383, term3383.getClass(), "failFast", false);
        setBooleanField(term3383, term3383.getClass(), "binary", false);
        setField(term3383, term3383.getClass(), "encoding", term3473);
        setField(term3383, term3383.getClass(), "volume", "JmcmxoGhIK");
        setField(term3383, term3383.getClass(), "task", "jXzmYyrnnT");
        setField(term3383, term3383.getClass(), "responseTimeout", "igCAtimmYB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolume", argTypes, term3383, args);
    }

};


