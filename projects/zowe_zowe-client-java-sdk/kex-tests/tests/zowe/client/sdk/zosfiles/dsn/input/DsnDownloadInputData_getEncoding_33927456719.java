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

public class DsnDownloadInputData_getEncoding_33927456719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3785;

    public DsnDownloadInputData_getEncoding_33927456719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3785 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        setField(term3785, term3785.getClass(), "file", null);
        setField(term3785, term3785.getClass(), "extension", null);
        setField(term3785, term3785.getClass(), "directory", null);
        setField(term3785, term3785.getClass(), "excludePatterns", null);
        setField(term3785, term3785.getClass(), "extensionMap", null);
        setField(term3785, term3785.getClass(), "maxConcurrentRequests", null);
        setBooleanField(term3785, term3785.getClass(), "returnEtag", false);
        setBooleanField(term3785, term3785.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term3785, term3785.getClass(), "failFast", false);
        setBooleanField(term3785, term3785.getClass(), "binary", false);
        setField(term3785, term3785.getClass(), "encoding", null);
        setField(term3785, term3785.getClass(), "volume", null);
        setField(term3785, term3785.getClass(), "task", null);
        setField(term3785, term3785.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEncoding", argTypes, term3785, args);
    }

};


