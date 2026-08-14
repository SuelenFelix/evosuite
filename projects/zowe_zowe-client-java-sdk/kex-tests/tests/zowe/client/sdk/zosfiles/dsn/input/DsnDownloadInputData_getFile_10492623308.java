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

public class DsnDownloadInputData_getFile_10492623308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1899;

    public DsnDownloadInputData_getFile_10492623308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2021 = new HashMap();
        Long term2031 = new Long(-316468845751588286L);
        Long term2037 = new Long(5127676408959197577L);
        term1899 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term1936 = (Object[]) newArray("java.lang.String", 7);
        setField(term1899, term1899.getClass(), "file", "DfISiziTgG");
        setField(term1899, term1899.getClass(), "extension", "XqgfKFvPSD");
        setField(term1899, term1899.getClass(), "directory", "JiVRgTZvKc");
        setElement(term1936, 0, "XPKmummaqg");
        setElement(term1936, 1, "BKLfkLiZTH");
        setElement(term1936, 2, "SPpkrGcPRr");
        setElement(term1936, 3, "sEccwbJKYE");
        setElement(term1936, 4, "AWRooQKkdW");
        setElement(term1936, 5, "vjxIhXHxGR");
        setElement(term1936, 6, "QXzGXbEXMu");
        setField(term1899, term1899.getClass(), "excludePatterns", term1936);
        setField(term1899, term1899.getClass(), "extensionMap", term2021);
        setField(term1899, term1899.getClass(), "maxConcurrentRequests", term2031);
        setBooleanField(term1899, term1899.getClass(), "returnEtag", true);
        setBooleanField(term1899, term1899.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term1899, term1899.getClass(), "failFast", false);
        setBooleanField(term1899, term1899.getClass(), "binary", true);
        setField(term1899, term1899.getClass(), "encoding", term2037);
        setField(term1899, term1899.getClass(), "volume", "sEnIVFtZuQ");
        setField(term1899, term1899.getClass(), "task", "ZVecLZMLHF");
        setField(term1899, term1899.getClass(), "responseTimeout", "fztQhjqwdP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFile", argTypes, term1899, args);
    }

};


