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

public class DsnDownloadInputData_isBinary_17483220151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263;

    public DsnDownloadInputData_isBinary_17483220151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term349 = new HashMap();
        Long term359 = new Long(-8257434502486459194L);
        Long term365 = new Long(-8400487765614892086L);
        term263 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term300 = (Object[]) newArray("java.lang.String", 4);
        setField(term263, term263.getClass(), "file", "LQFpaHEwXR");
        setField(term263, term263.getClass(), "extension", "oVcInYnLWB");
        setField(term263, term263.getClass(), "directory", "aJlieCFVtF");
        setElement(term300, 0, "ZiaGIbnzTs");
        setElement(term300, 1, "tbcdzjIfER");
        setElement(term300, 2, "HyxfbSQYBe");
        setElement(term300, 3, "pCTimMblYc");
        setField(term263, term263.getClass(), "excludePatterns", term300);
        setField(term263, term263.getClass(), "extensionMap", term349);
        setField(term263, term263.getClass(), "maxConcurrentRequests", term359);
        setBooleanField(term263, term263.getClass(), "returnEtag", true);
        setBooleanField(term263, term263.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term263, term263.getClass(), "failFast", true);
        setBooleanField(term263, term263.getClass(), "binary", true);
        setField(term263, term263.getClass(), "encoding", term365);
        setField(term263, term263.getClass(), "volume", "xOEqzGAmDU");
        setField(term263, term263.getClass(), "task", "eZFUvlxvGV");
        setField(term263, term263.getClass(), "responseTimeout", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBinary", argTypes, term263, args);
    }

};


