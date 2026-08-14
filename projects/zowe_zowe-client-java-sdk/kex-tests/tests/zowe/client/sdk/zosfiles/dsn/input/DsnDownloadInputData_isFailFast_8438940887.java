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

public class DsnDownloadInputData_isFailFast_8438940887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1615;

    public DsnDownloadInputData_isFailFast_8438940887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1725 = new HashMap();
        Long term1735 = new Long(-5476826692763582090L);
        Long term1741 = new Long(-872011222785455006L);
        term1615 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term1652 = (Object[]) newArray("java.lang.String", 6);
        setField(term1615, term1615.getClass(), "file", "VgZnGoIFwQ");
        setField(term1615, term1615.getClass(), "extension", "jUbSRrkrYZ");
        setField(term1615, term1615.getClass(), "directory", "bWWfajKbEX");
        setElement(term1652, 0, "cAPeiZHKGJ");
        setElement(term1652, 1, "LvJFtLBaxj");
        setElement(term1652, 2, "PHvxnGHptP");
        setElement(term1652, 3, "TimdotUuNC");
        setElement(term1652, 4, "PkWMRdJcBb");
        setElement(term1652, 5, "jSpAteRute");
        setField(term1615, term1615.getClass(), "excludePatterns", term1652);
        setField(term1615, term1615.getClass(), "extensionMap", term1725);
        setField(term1615, term1615.getClass(), "maxConcurrentRequests", term1735);
        setBooleanField(term1615, term1615.getClass(), "returnEtag", true);
        setBooleanField(term1615, term1615.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term1615, term1615.getClass(), "failFast", true);
        setBooleanField(term1615, term1615.getClass(), "binary", true);
        setField(term1615, term1615.getClass(), "encoding", term1741);
        setField(term1615, term1615.getClass(), "volume", "GVizqqzXpy");
        setField(term1615, term1615.getClass(), "task", "JqXGgAhZPl");
        setField(term1615, term1615.getClass(), "responseTimeout", "jiKYgYHqIS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFailFast", argTypes, term1615, args);
    }

};


