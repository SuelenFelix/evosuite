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

public class DsnCreateInputData_getSecondary_160355963733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8994;

    public DsnCreateInputData_getSecondary_160355963733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8994 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term8994, term8994.getClass(), "volser", null);
        setField(term8994, term8994.getClass(), "unit", null);
        setField(term8994, term8994.getClass(), "dsorg", null);
        setField(term8994, term8994.getClass(), "alcunit", null);
        setField(term8994, term8994.getClass(), "primary", null);
        setField(term8994, term8994.getClass(), "secondary", null);
        setField(term8994, term8994.getClass(), "dirblk", null);
        setField(term8994, term8994.getClass(), "avgblk", null);
        setField(term8994, term8994.getClass(), "recfm", null);
        setField(term8994, term8994.getClass(), "blksize", null);
        setField(term8994, term8994.getClass(), "lrecl", null);
        setField(term8994, term8994.getClass(), "storclass", null);
        setField(term8994, term8994.getClass(), "mgntclass", null);
        setField(term8994, term8994.getClass(), "dataclass", null);
        setField(term8994, term8994.getClass(), "dsntype", null);
        setBooleanField(term8994, term8994.getClass(), "showAttributes", false);
        setField(term8994, term8994.getClass(), "size", null);
        setField(term8994, term8994.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecondary", argTypes, term8994, args);
    }

};


