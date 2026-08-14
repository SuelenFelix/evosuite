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

public class DsnDownloadInputData_Builder_encoding_48064003619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15225;

    public DsnDownloadInputData_Builder_encoding_48064003619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15225 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        setField(term15225, term15225.getClass(), "file", null);
        setField(term15225, term15225.getClass(), "extension", null);
        setField(term15225, term15225.getClass(), "directory", null);
        setField(term15225, term15225.getClass(), "excludePatterns", null);
        setField(term15225, term15225.getClass(), "extensionMap", null);
        setField(term15225, term15225.getClass(), "maxConcurrentRequests", null);
        setBooleanField(term15225, term15225.getClass(), "returnEtag", false);
        setBooleanField(term15225, term15225.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term15225, term15225.getClass(), "failFast", false);
        setBooleanField(term15225, term15225.getClass(), "binary", false);
        setField(term15225, term15225.getClass(), "encoding", null);
        setField(term15225, term15225.getClass(), "volume", null);
        setField(term15225, term15225.getClass(), "task", null);
        setField(term15225, term15225.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "encoding", argTypes, term15225, args);
    }

};


