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

public class DsnDownloadInputData_Builder_task_206884713529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15281;

    public DsnDownloadInputData_Builder_task_206884713529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15281 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        setField(term15281, term15281.getClass(), "file", null);
        setField(term15281, term15281.getClass(), "extension", null);
        setField(term15281, term15281.getClass(), "directory", null);
        setField(term15281, term15281.getClass(), "excludePatterns", null);
        setField(term15281, term15281.getClass(), "extensionMap", null);
        setField(term15281, term15281.getClass(), "maxConcurrentRequests", null);
        setBooleanField(term15281, term15281.getClass(), "returnEtag", false);
        setBooleanField(term15281, term15281.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term15281, term15281.getClass(), "failFast", false);
        setBooleanField(term15281, term15281.getClass(), "binary", false);
        setField(term15281, term15281.getClass(), "encoding", null);
        setField(term15281, term15281.getClass(), "volume", null);
        setField(term15281, term15281.getClass(), "task", null);
        setField(term15281, term15281.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "task", argTypes, term15281, args);
    }

};


