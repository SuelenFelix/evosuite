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

public class DsnDownloadInputData_Builder_maxConcurrentRequests_78281905625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15257;

    public DsnDownloadInputData_Builder_maxConcurrentRequests_78281905625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15257 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        setField(term15257, term15257.getClass(), "file", null);
        setField(term15257, term15257.getClass(), "extension", null);
        setField(term15257, term15257.getClass(), "directory", null);
        setField(term15257, term15257.getClass(), "excludePatterns", null);
        setField(term15257, term15257.getClass(), "extensionMap", null);
        setField(term15257, term15257.getClass(), "maxConcurrentRequests", null);
        setBooleanField(term15257, term15257.getClass(), "returnEtag", false);
        setBooleanField(term15257, term15257.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term15257, term15257.getClass(), "failFast", false);
        setBooleanField(term15257, term15257.getClass(), "binary", false);
        setField(term15257, term15257.getClass(), "encoding", null);
        setField(term15257, term15257.getClass(), "volume", null);
        setField(term15257, term15257.getClass(), "task", null);
        setField(term15257, term15257.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "maxConcurrentRequests", argTypes, term15257, args);
    }

};


