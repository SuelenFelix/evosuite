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

public class DsnDownloadInputData_getResponseTimeout_195119443411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2663;

    public DsnDownloadInputData_getResponseTimeout_195119443411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2761 = new HashMap();
        Long term2771 = new Long(8059786003080744426L);
        Long term2777 = new Long(-4365849114644724155L);
        term2663 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term2700 = (Object[]) newArray("java.lang.String", 5);
        setField(term2663, term2663.getClass(), "file", "EYtfuJaxiM");
        setField(term2663, term2663.getClass(), "extension", "gCWtLVKVVe");
        setField(term2663, term2663.getClass(), "directory", "fWKJoSoCwE");
        setElement(term2700, 0, "wfaXBpWAUH");
        setElement(term2700, 1, "VMeAzAHwZj");
        setElement(term2700, 2, "PznxWXsZME");
        setElement(term2700, 3, "ZzIujlwVsw");
        setElement(term2700, 4, "LWyEaeIyAo");
        setField(term2663, term2663.getClass(), "excludePatterns", term2700);
        setField(term2663, term2663.getClass(), "extensionMap", term2761);
        setField(term2663, term2663.getClass(), "maxConcurrentRequests", term2771);
        setBooleanField(term2663, term2663.getClass(), "returnEtag", false);
        setBooleanField(term2663, term2663.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term2663, term2663.getClass(), "failFast", true);
        setBooleanField(term2663, term2663.getClass(), "binary", true);
        setField(term2663, term2663.getClass(), "encoding", term2777);
        setField(term2663, term2663.getClass(), "volume", "pXOkjyeIRb");
        setField(term2663, term2663.getClass(), "task", "GgZWSjxjyE");
        setField(term2663, term2663.getClass(), "responseTimeout", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponseTimeout", argTypes, term2663, args);
    }

};


