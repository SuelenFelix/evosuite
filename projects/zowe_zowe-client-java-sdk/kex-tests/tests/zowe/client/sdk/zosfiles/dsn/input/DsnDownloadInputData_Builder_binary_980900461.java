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

public class DsnDownloadInputData_Builder_binary_980900461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11255;
     Object term11347;

    public DsnDownloadInputData_Builder_binary_980900461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11293 = new HashMap();
        Long term11303 = new Long(5262507301787091109L);
        Long term11309 = new Long(-6823727938421990489L);
        term11255 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term11292 = (Object[]) newArray("java.lang.String", 0);
        setField(term11255, term11255.getClass(), "file", "XjDhvToxJy");
        setField(term11255, term11255.getClass(), "extension", "nxSTJflLQy");
        setField(term11255, term11255.getClass(), "directory", "FlHzxEfFzI");
        setField(term11255, term11255.getClass(), "excludePatterns", term11292);
        setField(term11255, term11255.getClass(), "extensionMap", term11293);
        setField(term11255, term11255.getClass(), "maxConcurrentRequests", term11303);
        setBooleanField(term11255, term11255.getClass(), "returnEtag", true);
        setBooleanField(term11255, term11255.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term11255, term11255.getClass(), "failFast", true);
        setBooleanField(term11255, term11255.getClass(), "binary", false);
        setField(term11255, term11255.getClass(), "encoding", term11309);
        setField(term11255, term11255.getClass(), "volume", "ubodzJoMGW");
        setField(term11255, term11255.getClass(), "task", "weddIktxOA");
        setField(term11255, term11255.getClass(), "responseTimeout", "uSlMeISsDD");
        term11347 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term11347;
        callMethod(klass, "binary", argTypes, term11255, args);
    }

};


