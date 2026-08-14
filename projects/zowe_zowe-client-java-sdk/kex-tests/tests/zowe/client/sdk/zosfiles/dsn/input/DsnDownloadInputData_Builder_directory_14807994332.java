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

public class DsnDownloadInputData_Builder_directory_14807994332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11409;

    public DsnDownloadInputData_Builder_directory_14807994332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11471 = new HashMap();
        Long term11481 = new Long(-484994522244390100L);
        Long term11487 = new Long(1233889271256172047L);
        term11409 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term11446 = (Object[]) newArray("java.lang.String", 2);
        setField(term11409, term11409.getClass(), "file", "WdCiTDUKqn");
        setField(term11409, term11409.getClass(), "extension", "PSizQDoxxe");
        setField(term11409, term11409.getClass(), "directory", "mKaHyMybrK");
        setElement(term11446, 0, "AyrEXuGrEj");
        setElement(term11446, 1, "yevIIoVYHq");
        setField(term11409, term11409.getClass(), "excludePatterns", term11446);
        setField(term11409, term11409.getClass(), "extensionMap", term11471);
        setField(term11409, term11409.getClass(), "maxConcurrentRequests", term11481);
        setBooleanField(term11409, term11409.getClass(), "returnEtag", true);
        setBooleanField(term11409, term11409.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term11409, term11409.getClass(), "failFast", true);
        setBooleanField(term11409, term11409.getClass(), "binary", true);
        setField(term11409, term11409.getClass(), "encoding", term11487);
        setField(term11409, term11409.getClass(), "volume", "sHMXNUzNeM");
        setField(term11409, term11409.getClass(), "task", "gPzGDOEPPw");
        setField(term11409, term11409.getClass(), "responseTimeout", "rwKoAngzCu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VUkRVwROTl";
        callMethod(klass, "directory", argTypes, term11409, args);
    }

};


