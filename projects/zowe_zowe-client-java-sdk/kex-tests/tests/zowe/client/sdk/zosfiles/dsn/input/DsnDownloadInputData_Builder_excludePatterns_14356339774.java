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

public class DsnDownloadInputData_Builder_excludePatterns_14356339774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11957;
     Object term12121;

    public DsnDownloadInputData_Builder_excludePatterns_14356339774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12067 = new HashMap();
        Long term12077 = new Long(5907001541142728739L);
        Long term12083 = new Long(4178434741742309755L);
        term11957 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term11994 = (Object[]) newArray("java.lang.String", 6);
        setField(term11957, term11957.getClass(), "file", "lRORwXipuk");
        setField(term11957, term11957.getClass(), "extension", "fVdTcjgHdw");
        setField(term11957, term11957.getClass(), "directory", "wwAwLLcLPp");
        setElement(term11994, 0, "nHpMKOmlpQ");
        setElement(term11994, 1, "fKhrQsJToZ");
        setElement(term11994, 2, "wsysQLGFnl");
        setElement(term11994, 3, "ckQLZGFjMX");
        setElement(term11994, 4, "qphdrqUtNx");
        setElement(term11994, 5, "bwlLFAfNWx");
        setField(term11957, term11957.getClass(), "excludePatterns", term11994);
        setField(term11957, term11957.getClass(), "extensionMap", term12067);
        setField(term11957, term11957.getClass(), "maxConcurrentRequests", term12077);
        setBooleanField(term11957, term11957.getClass(), "returnEtag", true);
        setBooleanField(term11957, term11957.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term11957, term11957.getClass(), "failFast", false);
        setBooleanField(term11957, term11957.getClass(), "binary", true);
        setField(term11957, term11957.getClass(), "encoding", term12083);
        setField(term11957, term11957.getClass(), "volume", "goAoCMhKBu");
        setField(term11957, term11957.getClass(), "task", "BWxJSgKHRT");
        setField(term11957, term11957.getClass(), "responseTimeout", "AGXoIndFnm");
        term12121 = (Object[]) newArray("java.lang.String", 2);
        setElement(term12121, 0, "mwmFMNEzkK");
        setElement(term12121, 1, "kVAmKknVln");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term12121;
        callMethod(klass, "excludePatterns", argTypes, term11957, args);
    }

};


