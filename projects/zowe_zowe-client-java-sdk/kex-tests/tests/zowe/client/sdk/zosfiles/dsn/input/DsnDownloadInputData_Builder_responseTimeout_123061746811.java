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

public class DsnDownloadInputData_Builder_responseTimeout_123061746811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13747;

    public DsnDownloadInputData_Builder_responseTimeout_123061746811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13893 = new HashMap();
        Long term13903 = new Long(-2644215923136513282L);
        Long term13909 = new Long(-1468719814009985452L);
        term13747 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term13784 = (Object[]) newArray("java.lang.String", 9);
        setField(term13747, term13747.getClass(), "file", "WaEcyVlcIx");
        setField(term13747, term13747.getClass(), "extension", "ONcbPCQnHd");
        setField(term13747, term13747.getClass(), "directory", "AobDaplFLl");
        setElement(term13784, 0, "pDkMNnAGgv");
        setElement(term13784, 1, "PaCpFXGzdX");
        setElement(term13784, 2, "FftYCNbnks");
        setElement(term13784, 3, "lJoltmsadS");
        setElement(term13784, 4, "mvfDtZNEHr");
        setElement(term13784, 5, "bvSgmFUDOU");
        setElement(term13784, 6, "XMHwbfiHRl");
        setElement(term13784, 7, "bucTnYicnp");
        setElement(term13784, 8, "EkgprvqZlM");
        setField(term13747, term13747.getClass(), "excludePatterns", term13784);
        setField(term13747, term13747.getClass(), "extensionMap", term13893);
        setField(term13747, term13747.getClass(), "maxConcurrentRequests", term13903);
        setBooleanField(term13747, term13747.getClass(), "returnEtag", false);
        setBooleanField(term13747, term13747.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term13747, term13747.getClass(), "failFast", true);
        setBooleanField(term13747, term13747.getClass(), "binary", true);
        setField(term13747, term13747.getClass(), "encoding", term13909);
        setField(term13747, term13747.getClass(), "volume", "ZwjARhAtHC");
        setField(term13747, term13747.getClass(), "task", "XXvscsYBWv");
        setField(term13747, term13747.getClass(), "responseTimeout", "uePedtiAfL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AdSHvysxQB";
        callMethod(klass, "responseTimeout", argTypes, term13747, args);
    }

};


