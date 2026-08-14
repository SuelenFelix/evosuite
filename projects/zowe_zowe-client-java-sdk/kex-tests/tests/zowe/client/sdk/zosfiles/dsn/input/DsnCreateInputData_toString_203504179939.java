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

public class DsnCreateInputData_toString_203504179939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9006;

    public DsnCreateInputData_toString_203504179939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9006 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term9006, term9006.getClass(), "volser", null);
        setField(term9006, term9006.getClass(), "unit", null);
        setField(term9006, term9006.getClass(), "dsorg", null);
        setField(term9006, term9006.getClass(), "alcunit", null);
        setField(term9006, term9006.getClass(), "primary", null);
        setField(term9006, term9006.getClass(), "secondary", null);
        setField(term9006, term9006.getClass(), "dirblk", null);
        setField(term9006, term9006.getClass(), "avgblk", null);
        setField(term9006, term9006.getClass(), "recfm", null);
        setField(term9006, term9006.getClass(), "blksize", null);
        setField(term9006, term9006.getClass(), "lrecl", null);
        setField(term9006, term9006.getClass(), "storclass", null);
        setField(term9006, term9006.getClass(), "mgntclass", null);
        setField(term9006, term9006.getClass(), "dataclass", null);
        setField(term9006, term9006.getClass(), "dsntype", null);
        setBooleanField(term9006, term9006.getClass(), "showAttributes", false);
        setField(term9006, term9006.getClass(), "size", null);
        setField(term9006, term9006.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9006, args);
    }

};


