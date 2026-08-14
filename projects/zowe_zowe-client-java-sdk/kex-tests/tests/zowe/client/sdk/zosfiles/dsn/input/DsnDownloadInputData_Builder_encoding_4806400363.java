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

public class DsnDownloadInputData_Builder_encoding_4806400363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11627;
     Object term11815;

    public DsnDownloadInputData_Builder_encoding_4806400363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11761 = new HashMap();
        Long term11771 = new Long(6617340557564669657L);
        Long term11777 = new Long(1439298019805881866L);
        term11627 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term11664 = (Object[]) newArray("java.lang.String", 8);
        setField(term11627, term11627.getClass(), "file", "UDlkdccCRn");
        setField(term11627, term11627.getClass(), "extension", "McpzErOcYb");
        setField(term11627, term11627.getClass(), "directory", "jqrVEUvYEz");
        setElement(term11664, 0, "QITgiBrmfj");
        setElement(term11664, 1, "pXxkiXgQnq");
        setElement(term11664, 2, "tKmrUDURku");
        setElement(term11664, 3, "JeZbrwZmsP");
        setElement(term11664, 4, "bxyfeicqrK");
        setElement(term11664, 5, "vBnWPlsZMk");
        setElement(term11664, 6, "fIZsWucfXz");
        setElement(term11664, 7, "IApvtmfhnq");
        setField(term11627, term11627.getClass(), "excludePatterns", term11664);
        setField(term11627, term11627.getClass(), "extensionMap", term11761);
        setField(term11627, term11627.getClass(), "maxConcurrentRequests", term11771);
        setBooleanField(term11627, term11627.getClass(), "returnEtag", true);
        setBooleanField(term11627, term11627.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term11627, term11627.getClass(), "failFast", false);
        setBooleanField(term11627, term11627.getClass(), "binary", true);
        setField(term11627, term11627.getClass(), "encoding", term11777);
        setField(term11627, term11627.getClass(), "volume", "hIYsRyOZxk");
        setField(term11627, term11627.getClass(), "task", "RjNoEywJbC");
        setField(term11627, term11627.getClass(), "responseTimeout", "RTTvrwwhou");
        term11815 = new Long(-8708192233349544946L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term11815;
        callMethod(klass, "encoding", argTypes, term11627, args);
    }

};


