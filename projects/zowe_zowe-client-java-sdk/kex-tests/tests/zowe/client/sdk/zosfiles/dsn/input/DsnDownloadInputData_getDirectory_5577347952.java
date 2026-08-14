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

public class DsnDownloadInputData_getDirectory_5577347952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503;

    public DsnDownloadInputData_getDirectory_5577347952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term577 = new HashMap();
        Long term587 = new Long(5270370404989704783L);
        Long term593 = new Long(7411271909051562686L);
        term503 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term540 = (Object[]) newArray("java.lang.String", 3);
        setField(term503, term503.getClass(), "file", "vrQLuWIDJX");
        setField(term503, term503.getClass(), "extension", "flxyYxBRtu");
        setField(term503, term503.getClass(), "directory", "OclPbYPkcH");
        setElement(term540, 0, "IoAlmYsBwc");
        setElement(term540, 1, "TEParAifyi");
        setElement(term540, 2, "OWDIEULEFu");
        setField(term503, term503.getClass(), "excludePatterns", term540);
        setField(term503, term503.getClass(), "extensionMap", term577);
        setField(term503, term503.getClass(), "maxConcurrentRequests", term587);
        setBooleanField(term503, term503.getClass(), "returnEtag", false);
        setBooleanField(term503, term503.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term503, term503.getClass(), "failFast", false);
        setBooleanField(term503, term503.getClass(), "binary", true);
        setField(term503, term503.getClass(), "encoding", term593);
        setField(term503, term503.getClass(), "volume", "SbAoxhfrkn");
        setField(term503, term503.getClass(), "task", "kuTXqwMtDB");
        setField(term503, term503.getClass(), "responseTimeout", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDirectory", argTypes, term503, args);
    }

};


