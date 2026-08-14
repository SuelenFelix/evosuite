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
import java.lang.Boolean;

public class DsnDownloadInputData_Builder_preserveOriginalLetterCase_179752554826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15262;
     Object term15267;

    public DsnDownloadInputData_Builder_preserveOriginalLetterCase_179752554826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15262 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        setField(term15262, term15262.getClass(), "file", null);
        setField(term15262, term15262.getClass(), "extension", null);
        setField(term15262, term15262.getClass(), "directory", null);
        setField(term15262, term15262.getClass(), "excludePatterns", null);
        setField(term15262, term15262.getClass(), "extensionMap", null);
        setField(term15262, term15262.getClass(), "maxConcurrentRequests", null);
        setBooleanField(term15262, term15262.getClass(), "returnEtag", false);
        setBooleanField(term15262, term15262.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term15262, term15262.getClass(), "failFast", false);
        setBooleanField(term15262, term15262.getClass(), "binary", false);
        setField(term15262, term15262.getClass(), "encoding", null);
        setField(term15262, term15262.getClass(), "volume", null);
        setField(term15262, term15262.getClass(), "task", null);
        setField(term15262, term15262.getClass(), "responseTimeout", null);
        term15267 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term15267;
        callMethod(klass, "preserveOriginalLetterCase", argTypes, term15262, args);
    }

};


