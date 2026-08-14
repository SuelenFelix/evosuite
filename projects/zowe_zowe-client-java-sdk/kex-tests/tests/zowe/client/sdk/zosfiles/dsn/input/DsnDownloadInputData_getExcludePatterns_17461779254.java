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

public class DsnDownloadInputData_getExcludePatterns_17461779254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term961;

    public DsnDownloadInputData_getExcludePatterns_17461779254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1011 = new HashMap();
        Long term1021 = new Long(-7237588299778557629L);
        Long term1027 = new Long(6967924379644551255L);
        term961 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term998 = (Object[]) newArray("java.lang.String", 1);
        setField(term961, term961.getClass(), "file", "xLbjWUgOIL");
        setField(term961, term961.getClass(), "extension", "jDtqGUpnZN");
        setField(term961, term961.getClass(), "directory", "nGKItKLYNC");
        setElement(term998, 0, "UiUYnPrcCi");
        setField(term961, term961.getClass(), "excludePatterns", term998);
        setField(term961, term961.getClass(), "extensionMap", term1011);
        setField(term961, term961.getClass(), "maxConcurrentRequests", term1021);
        setBooleanField(term961, term961.getClass(), "returnEtag", true);
        setBooleanField(term961, term961.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term961, term961.getClass(), "failFast", false);
        setBooleanField(term961, term961.getClass(), "binary", false);
        setField(term961, term961.getClass(), "encoding", term1027);
        setField(term961, term961.getClass(), "volume", "onpbIeEKoi");
        setField(term961, term961.getClass(), "task", "YRHGsAkhxb");
        setField(term961, term961.getClass(), "responseTimeout", "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcludePatterns", argTypes, term961, args);
    }

};


