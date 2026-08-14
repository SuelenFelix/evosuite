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

public class DsnDownloadInputData_Builder_returnEtag_60958690612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14119;
     Object term14259;

    public DsnDownloadInputData_Builder_returnEtag_60958690612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14205 = new HashMap();
        Long term14215 = new Long(-7738503207562305297L);
        Long term14221 = new Long(3825396310311739952L);
        term14119 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term14156 = (Object[]) newArray("java.lang.String", 4);
        setField(term14119, term14119.getClass(), "file", "jlraKkBWFA");
        setField(term14119, term14119.getClass(), "extension", "mRBtFTxVdE");
        setField(term14119, term14119.getClass(), "directory", "IVacFDAZcj");
        setElement(term14156, 0, "EEYmuwyVDP");
        setElement(term14156, 1, "EWFbEDAVrE");
        setElement(term14156, 2, "EMiMtYgfvr");
        setElement(term14156, 3, "OyYyYYnJuF");
        setField(term14119, term14119.getClass(), "excludePatterns", term14156);
        setField(term14119, term14119.getClass(), "extensionMap", term14205);
        setField(term14119, term14119.getClass(), "maxConcurrentRequests", term14215);
        setBooleanField(term14119, term14119.getClass(), "returnEtag", false);
        setBooleanField(term14119, term14119.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term14119, term14119.getClass(), "failFast", true);
        setBooleanField(term14119, term14119.getClass(), "binary", false);
        setField(term14119, term14119.getClass(), "encoding", term14221);
        setField(term14119, term14119.getClass(), "volume", "KHtaDOIcJZ");
        setField(term14119, term14119.getClass(), "task", "vgdwrCZczl");
        setField(term14119, term14119.getClass(), "responseTimeout", "gKMNrpKBpu");
        term14259 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term14259;
        callMethod(klass, "returnEtag", argTypes, term14119, args);
    }

};


