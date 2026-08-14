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

public class DsnDownloadInputData_Builder_file_18324859128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13067;

    public DsnDownloadInputData_Builder_file_18324859128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13129 = new HashMap();
        Long term13139 = new Long(4044358158040652353L);
        Long term13145 = new Long(-4443169559037975007L);
        term13067 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term13104 = (Object[]) newArray("java.lang.String", 2);
        setField(term13067, term13067.getClass(), "file", "xeyjTOCOJb");
        setField(term13067, term13067.getClass(), "extension", "DGRqjjdhzy");
        setField(term13067, term13067.getClass(), "directory", "lQFkjJUPAR");
        setElement(term13104, 0, "BsuVlGUUjV");
        setElement(term13104, 1, "bHHjfDCntT");
        setField(term13067, term13067.getClass(), "excludePatterns", term13104);
        setField(term13067, term13067.getClass(), "extensionMap", term13129);
        setField(term13067, term13067.getClass(), "maxConcurrentRequests", term13139);
        setBooleanField(term13067, term13067.getClass(), "returnEtag", false);
        setBooleanField(term13067, term13067.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term13067, term13067.getClass(), "failFast", true);
        setBooleanField(term13067, term13067.getClass(), "binary", true);
        setField(term13067, term13067.getClass(), "encoding", term13145);
        setField(term13067, term13067.getClass(), "volume", "NWldOLAbqk");
        setField(term13067, term13067.getClass(), "task", "qnYaYSpDwO");
        setField(term13067, term13067.getClass(), "responseTimeout", "dgbFDCdHtj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EKpdCBubDE";
        callMethod(klass, "file", argTypes, term13067, args);
    }

};


