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

public class DsnDownloadInputData_getEncoding_3392745673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term721;

    public DsnDownloadInputData_getEncoding_3392745673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term807 = new HashMap();
        Long term817 = new Long(4872422362414183754L);
        Long term823 = new Long(6811161968424632369L);
        term721 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term758 = (Object[]) newArray("java.lang.String", 4);
        setField(term721, term721.getClass(), "file", "xrwlQZdwCp");
        setField(term721, term721.getClass(), "extension", "IDCWpPLRkE");
        setField(term721, term721.getClass(), "directory", "nyiiPDVjAc");
        setElement(term758, 0, "aKnKipADSo");
        setElement(term758, 1, "wSQxaModmm");
        setElement(term758, 2, "UlajhuVLaP");
        setElement(term758, 3, "gGSMzuGICf");
        setField(term721, term721.getClass(), "excludePatterns", term758);
        setField(term721, term721.getClass(), "extensionMap", term807);
        setField(term721, term721.getClass(), "maxConcurrentRequests", term817);
        setBooleanField(term721, term721.getClass(), "returnEtag", false);
        setBooleanField(term721, term721.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term721, term721.getClass(), "failFast", false);
        setBooleanField(term721, term721.getClass(), "binary", false);
        setField(term721, term721.getClass(), "encoding", term823);
        setField(term721, term721.getClass(), "volume", "GzFkzHGYFt");
        setField(term721, term721.getClass(), "task", "tShwQLRGNe");
        setField(term721, term721.getClass(), "responseTimeout", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEncoding", argTypes, term721, args);
    }

};


