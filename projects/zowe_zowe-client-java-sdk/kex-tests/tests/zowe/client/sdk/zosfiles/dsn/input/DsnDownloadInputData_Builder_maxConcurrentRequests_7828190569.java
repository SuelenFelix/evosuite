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

public class DsnDownloadInputData_Builder_maxConcurrentRequests_7828190569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13285;
     Object term13413;

    public DsnDownloadInputData_Builder_maxConcurrentRequests_7828190569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13359 = new HashMap();
        Long term13369 = new Long(-3842548265506930260L);
        Long term13375 = new Long(-5788180182343976541L);
        term13285 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term13322 = (Object[]) newArray("java.lang.String", 3);
        setField(term13285, term13285.getClass(), "file", "zMsSLTfGhl");
        setField(term13285, term13285.getClass(), "extension", "bEmHScVZaQ");
        setField(term13285, term13285.getClass(), "directory", "TcuXODkzBV");
        setElement(term13322, 0, "coJPjrBZNe");
        setElement(term13322, 1, "vMsWjuPTnO");
        setElement(term13322, 2, "zHvfKaOstO");
        setField(term13285, term13285.getClass(), "excludePatterns", term13322);
        setField(term13285, term13285.getClass(), "extensionMap", term13359);
        setField(term13285, term13285.getClass(), "maxConcurrentRequests", term13369);
        setBooleanField(term13285, term13285.getClass(), "returnEtag", false);
        setBooleanField(term13285, term13285.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term13285, term13285.getClass(), "failFast", false);
        setBooleanField(term13285, term13285.getClass(), "binary", false);
        setField(term13285, term13285.getClass(), "encoding", term13375);
        setField(term13285, term13285.getClass(), "volume", "jcWKHRWhyj");
        setField(term13285, term13285.getClass(), "task", "nrQjODRMLD");
        setField(term13285, term13285.getClass(), "responseTimeout", "PNoWXrsFic");
        term13413 = new Long(2936323121573284007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term13413;
        callMethod(klass, "maxConcurrentRequests", argTypes, term13285, args);
    }

};


