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

public class DsnDownloadInputData_getNaxConcurrentRequests_7001376269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2205;

    public DsnDownloadInputData_getNaxConcurrentRequests_7001376269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2255 = new HashMap();
        Long term2265 = new Long(-6573104506744284592L);
        Long term2271 = new Long(-4920224193275732920L);
        term2205 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term2242 = (Object[]) newArray("java.lang.String", 1);
        setField(term2205, term2205.getClass(), "file", "eVpkWxjuki");
        setField(term2205, term2205.getClass(), "extension", "SJiQaLvSKv");
        setField(term2205, term2205.getClass(), "directory", "OEXDRUKcFl");
        setElement(term2242, 0, "RYdKCNNMBR");
        setField(term2205, term2205.getClass(), "excludePatterns", term2242);
        setField(term2205, term2205.getClass(), "extensionMap", term2255);
        setField(term2205, term2205.getClass(), "maxConcurrentRequests", term2265);
        setBooleanField(term2205, term2205.getClass(), "returnEtag", true);
        setBooleanField(term2205, term2205.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term2205, term2205.getClass(), "failFast", true);
        setBooleanField(term2205, term2205.getClass(), "binary", false);
        setField(term2205, term2205.getClass(), "encoding", term2271);
        setField(term2205, term2205.getClass(), "volume", "iNwOJRBEjp");
        setField(term2205, term2205.getClass(), "task", "XylxrMBraH");
        setField(term2205, term2205.getClass(), "responseTimeout", "pORebkoRdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNaxConcurrentRequests", argTypes, term2205, args);
    }

};


