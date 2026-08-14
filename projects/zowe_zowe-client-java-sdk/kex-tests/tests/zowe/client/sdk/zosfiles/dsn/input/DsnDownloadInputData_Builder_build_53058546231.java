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

public class DsnDownloadInputData_Builder_build_53058546231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15291;

    public DsnDownloadInputData_Builder_build_53058546231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15291 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        setField(term15291, term15291.getClass(), "file", null);
        setField(term15291, term15291.getClass(), "extension", null);
        setField(term15291, term15291.getClass(), "directory", null);
        setField(term15291, term15291.getClass(), "excludePatterns", null);
        setField(term15291, term15291.getClass(), "extensionMap", null);
        setField(term15291, term15291.getClass(), "maxConcurrentRequests", null);
        setBooleanField(term15291, term15291.getClass(), "returnEtag", false);
        setBooleanField(term15291, term15291.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term15291, term15291.getClass(), "failFast", false);
        setBooleanField(term15291, term15291.getClass(), "binary", false);
        setField(term15291, term15291.getClass(), "encoding", null);
        setField(term15291, term15291.getClass(), "volume", null);
        setField(term15291, term15291.getClass(), "task", null);
        setField(term15291, term15291.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term15291, args);
    }

};


