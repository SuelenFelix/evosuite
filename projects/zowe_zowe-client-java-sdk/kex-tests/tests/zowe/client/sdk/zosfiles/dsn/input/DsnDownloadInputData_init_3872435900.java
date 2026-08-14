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

public class DsnDownloadInputData_init_3872435900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public DsnDownloadInputData_init_3872435900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term99 = new HashMap();
        Long term109 = new Long(2442117782898005296L);
        Long term115 = new Long(6375119433582206027L);
        term1 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term38 = (Object[]) newArray("java.lang.String", 5);
        setField(term1, term1.getClass(), "file", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "extension", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "directory", "MuLcgQHgqz");
        setElement(term38, 0, "xxtlPwDYFs");
        setElement(term38, 1, "jJCZpVmanW");
        setElement(term38, 2, "EGtDIRbSSb");
        setElement(term38, 3, "SzjVpOQTyS");
        setElement(term38, 4, "MjGYSRKTNF");
        setField(term1, term1.getClass(), "excludePatterns", term38);
        setField(term1, term1.getClass(), "extensionMap", term99);
        setField(term1, term1.getClass(), "maxConcurrentRequests", term109);
        setBooleanField(term1, term1.getClass(), "returnEtag", false);
        setBooleanField(term1, term1.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term1, term1.getClass(), "failFast", false);
        setBooleanField(term1, term1.getClass(), "binary", false);
        setField(term1, term1.getClass(), "encoding", term115);
        setField(term1, term1.getClass(), "volume", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "task", "uuaPigETmJ");
        setField(term1, term1.getClass(), "responseTimeout", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


