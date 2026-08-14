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
import java.lang.Boolean;

public class DsnDownloadInputData_Builder_failFast_13598817017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12891;
     Object term12995;

    public DsnDownloadInputData_Builder_failFast_13598817017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12941 = new HashMap();
        Long term12951 = new Long(-7612550318181586304L);
        Long term12957 = new Long(-2170847986967241072L);
        term12891 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term12928 = (Object[]) newArray("java.lang.String", 1);
        setField(term12891, term12891.getClass(), "file", "vqnBkkxoIa");
        setField(term12891, term12891.getClass(), "extension", "bycpZjxXFn");
        setField(term12891, term12891.getClass(), "directory", "jQWttOAiwL");
        setElement(term12928, 0, "DzKFxEuEEC");
        setField(term12891, term12891.getClass(), "excludePatterns", term12928);
        setField(term12891, term12891.getClass(), "extensionMap", term12941);
        setField(term12891, term12891.getClass(), "maxConcurrentRequests", term12951);
        setBooleanField(term12891, term12891.getClass(), "returnEtag", true);
        setBooleanField(term12891, term12891.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term12891, term12891.getClass(), "failFast", false);
        setBooleanField(term12891, term12891.getClass(), "binary", true);
        setField(term12891, term12891.getClass(), "encoding", term12957);
        setField(term12891, term12891.getClass(), "volume", "cmuaUiHMVL");
        setField(term12891, term12891.getClass(), "task", "xjoSGPWUgu");
        setField(term12891, term12891.getClass(), "responseTimeout", "uzmqjnOUXu");
        term12995 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term12995;
        callMethod(klass, "failFast", argTypes, term12891, args);
    }

};


