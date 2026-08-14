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

public class DsnDownloadInputData_getTask_65562808113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3187;

    public DsnDownloadInputData_getTask_65562808113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3249 = new HashMap();
        Long term3259 = new Long(-7672528020740371001L);
        Long term3265 = new Long(-4502405999831680926L);
        term3187 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term3224 = (Object[]) newArray("java.lang.String", 2);
        setField(term3187, term3187.getClass(), "file", "hMmaoREuCK");
        setField(term3187, term3187.getClass(), "extension", "VeDtgDzGAN");
        setField(term3187, term3187.getClass(), "directory", "aWYOWZFyaX");
        setElement(term3224, 0, "BRIVNtfUWU");
        setElement(term3224, 1, "DbiCVtPPCT");
        setField(term3187, term3187.getClass(), "excludePatterns", term3224);
        setField(term3187, term3187.getClass(), "extensionMap", term3249);
        setField(term3187, term3187.getClass(), "maxConcurrentRequests", term3259);
        setBooleanField(term3187, term3187.getClass(), "returnEtag", true);
        setBooleanField(term3187, term3187.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term3187, term3187.getClass(), "failFast", true);
        setBooleanField(term3187, term3187.getClass(), "binary", false);
        setField(term3187, term3187.getClass(), "encoding", term3265);
        setField(term3187, term3187.getClass(), "volume", "smnHEqRFRx");
        setField(term3187, term3187.getClass(), "task", "XYtryyobou");
        setField(term3187, term3187.getClass(), "responseTimeout", "OYbzXylRWW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTask", argTypes, term3187, args);
    }

};


