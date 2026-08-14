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
import java.util.LinkedHashMap;

public class DsnDownloadInputData_Builder_extensionMap_4492974246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12482;
     Object term12682;

    public DsnDownloadInputData_Builder_extensionMap_4492974246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12628 = new HashMap();
        Long term12638 = new Long(-6645965768855543712L);
        Long term12644 = new Long(4784595517102746672L);
        term12482 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term12519 = (Object[]) newArray("java.lang.String", 9);
        setField(term12482, term12482.getClass(), "file", "oKhVzOKUFW");
        setField(term12482, term12482.getClass(), "extension", "mNHyqmOAFy");
        setField(term12482, term12482.getClass(), "directory", "UxgSdhxPCH");
        setElement(term12519, 0, "DAujxZPHJC");
        setElement(term12519, 1, "IlBhdrCvHq");
        setElement(term12519, 2, "OirVUQhauU");
        setElement(term12519, 3, "GLbyDfbNZI");
        setElement(term12519, 4, "oNLcCYDAsO");
        setElement(term12519, 5, "CNqMxLvtcJ");
        setElement(term12519, 6, "ktbqerIaKW");
        setElement(term12519, 7, "VoghngXfsK");
        setElement(term12519, 8, "GbahCBMvct");
        setField(term12482, term12482.getClass(), "excludePatterns", term12519);
        setField(term12482, term12482.getClass(), "extensionMap", term12628);
        setField(term12482, term12482.getClass(), "maxConcurrentRequests", term12638);
        setBooleanField(term12482, term12482.getClass(), "returnEtag", true);
        setBooleanField(term12482, term12482.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term12482, term12482.getClass(), "failFast", false);
        setBooleanField(term12482, term12482.getClass(), "binary", true);
        setField(term12482, term12482.getClass(), "encoding", term12644);
        setField(term12482, term12482.getClass(), "volume", "XtiurrVYKw");
        setField(term12482, term12482.getClass(), "task", "rsumfoDNHa");
        setField(term12482, term12482.getClass(), "responseTimeout", "ceCWHUTQUM");
        term12682 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.HashMap");
        Object[] args = new Object[1];
        args[0] = term12682;
        callMethod(klass, "extensionMap", argTypes, term12482, args);
    }

};


