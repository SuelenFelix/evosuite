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

public class DsnDownloadInputData_isPreserveOriginalLetterCase_30569831910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2379;

    public DsnDownloadInputData_isPreserveOriginalLetterCase_30569831910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2489 = new HashMap();
        Long term2499 = new Long(8428634514691209827L);
        Long term2505 = new Long(-2585684163342970173L);
        term2379 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term2416 = (Object[]) newArray("java.lang.String", 6);
        setField(term2379, term2379.getClass(), "file", "mXGCWJDOqA");
        setField(term2379, term2379.getClass(), "extension", "dpNsDgfPso");
        setField(term2379, term2379.getClass(), "directory", "hCWPJQKpdc");
        setElement(term2416, 0, "WzMEhMXkKx");
        setElement(term2416, 1, "XOiDvlDhdc");
        setElement(term2416, 2, "AdxvLJhNLe");
        setElement(term2416, 3, "lHfTrWKMPk");
        setElement(term2416, 4, "JDaAnsVTGV");
        setElement(term2416, 5, "mLUZFTfjle");
        setField(term2379, term2379.getClass(), "excludePatterns", term2416);
        setField(term2379, term2379.getClass(), "extensionMap", term2489);
        setField(term2379, term2379.getClass(), "maxConcurrentRequests", term2499);
        setBooleanField(term2379, term2379.getClass(), "returnEtag", false);
        setBooleanField(term2379, term2379.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term2379, term2379.getClass(), "failFast", true);
        setBooleanField(term2379, term2379.getClass(), "binary", true);
        setField(term2379, term2379.getClass(), "encoding", term2505);
        setField(term2379, term2379.getClass(), "volume", "OJJtVNPyKZ");
        setField(term2379, term2379.getClass(), "task", "AKNapTAfmD");
        setField(term2379, term2379.getClass(), "responseTimeout", "xJgPlLxpgC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPreserveOriginalLetterCase", argTypes, term2379, args);
    }

};


