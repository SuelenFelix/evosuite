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

public class DsnDownloadInputData_toString_129578144515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3601;

    public DsnDownloadInputData_toString_129578144515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3651 = new HashMap();
        Long term3661 = new Long(6855071767938501807L);
        Long term3667 = new Long(-5892135042702373494L);
        term3601 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term3638 = (Object[]) newArray("java.lang.String", 1);
        setField(term3601, term3601.getClass(), "file", "DyiXbeYIaN");
        setField(term3601, term3601.getClass(), "extension", "VGizxZnyHX");
        setField(term3601, term3601.getClass(), "directory", "kVEZMHmRtR");
        setElement(term3638, 0, "ekxGuOYIwi");
        setField(term3601, term3601.getClass(), "excludePatterns", term3638);
        setField(term3601, term3601.getClass(), "extensionMap", term3651);
        setField(term3601, term3601.getClass(), "maxConcurrentRequests", term3661);
        setBooleanField(term3601, term3601.getClass(), "returnEtag", false);
        setBooleanField(term3601, term3601.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term3601, term3601.getClass(), "failFast", true);
        setBooleanField(term3601, term3601.getClass(), "binary", true);
        setField(term3601, term3601.getClass(), "encoding", term3667);
        setField(term3601, term3601.getClass(), "volume", "JppkknKVOw");
        setField(term3601, term3601.getClass(), "task", "iljANwuEjk");
        setField(term3601, term3601.getClass(), "responseTimeout", "kNqaJKIATy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3601, args);
    }

};


