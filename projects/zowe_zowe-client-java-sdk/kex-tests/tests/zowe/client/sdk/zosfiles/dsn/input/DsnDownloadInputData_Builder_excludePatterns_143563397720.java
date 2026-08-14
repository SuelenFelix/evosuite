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

public class DsnDownloadInputData_Builder_excludePatterns_143563397720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15230;

    public DsnDownloadInputData_Builder_excludePatterns_143563397720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15230 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        setField(term15230, term15230.getClass(), "file", null);
        setField(term15230, term15230.getClass(), "extension", null);
        setField(term15230, term15230.getClass(), "directory", null);
        setField(term15230, term15230.getClass(), "excludePatterns", null);
        setField(term15230, term15230.getClass(), "extensionMap", null);
        setField(term15230, term15230.getClass(), "maxConcurrentRequests", null);
        setBooleanField(term15230, term15230.getClass(), "returnEtag", false);
        setBooleanField(term15230, term15230.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term15230, term15230.getClass(), "failFast", false);
        setBooleanField(term15230, term15230.getClass(), "binary", false);
        setField(term15230, term15230.getClass(), "encoding", null);
        setField(term15230, term15230.getClass(), "volume", null);
        setField(term15230, term15230.getClass(), "task", null);
        setField(term15230, term15230.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "excludePatterns", argTypes, term15230, args);
    }

};


