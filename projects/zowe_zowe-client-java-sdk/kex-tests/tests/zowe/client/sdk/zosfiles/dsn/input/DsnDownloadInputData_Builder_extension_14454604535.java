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

public class DsnDownloadInputData_Builder_extension_14454604535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12286;

    public DsnDownloadInputData_Builder_extension_14454604535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12336 = new HashMap();
        Long term12346 = new Long(-2068172595987555756L);
        Long term12352 = new Long(-6292278961887936280L);
        term12286 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term12323 = (Object[]) newArray("java.lang.String", 1);
        setField(term12286, term12286.getClass(), "file", "MRFLbEGYKG");
        setField(term12286, term12286.getClass(), "extension", "BYrGukTyof");
        setField(term12286, term12286.getClass(), "directory", "jiCGTTzKGB");
        setElement(term12323, 0, "MqICFYzDJj");
        setField(term12286, term12286.getClass(), "excludePatterns", term12323);
        setField(term12286, term12286.getClass(), "extensionMap", term12336);
        setField(term12286, term12286.getClass(), "maxConcurrentRequests", term12346);
        setBooleanField(term12286, term12286.getClass(), "returnEtag", true);
        setBooleanField(term12286, term12286.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term12286, term12286.getClass(), "failFast", false);
        setBooleanField(term12286, term12286.getClass(), "binary", true);
        setField(term12286, term12286.getClass(), "encoding", term12352);
        setField(term12286, term12286.getClass(), "volume", "XebAeSnCKZ");
        setField(term12286, term12286.getClass(), "task", "GeddnXjHGy");
        setField(term12286, term12286.getClass(), "responseTimeout", "vLTbaoAxBm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BXTjEyEZxD";
        callMethod(klass, "extension", argTypes, term12286, args);
    }

};


