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

public class DsnCreateInputData_getSize_28747775935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8998;

    public DsnCreateInputData_getSize_28747775935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8998 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term8998, term8998.getClass(), "volser", null);
        setField(term8998, term8998.getClass(), "unit", null);
        setField(term8998, term8998.getClass(), "dsorg", null);
        setField(term8998, term8998.getClass(), "alcunit", null);
        setField(term8998, term8998.getClass(), "primary", null);
        setField(term8998, term8998.getClass(), "secondary", null);
        setField(term8998, term8998.getClass(), "dirblk", null);
        setField(term8998, term8998.getClass(), "avgblk", null);
        setField(term8998, term8998.getClass(), "recfm", null);
        setField(term8998, term8998.getClass(), "blksize", null);
        setField(term8998, term8998.getClass(), "lrecl", null);
        setField(term8998, term8998.getClass(), "storclass", null);
        setField(term8998, term8998.getClass(), "mgntclass", null);
        setField(term8998, term8998.getClass(), "dataclass", null);
        setField(term8998, term8998.getClass(), "dsntype", null);
        setBooleanField(term8998, term8998.getClass(), "showAttributes", false);
        setField(term8998, term8998.getClass(), "size", null);
        setField(term8998, term8998.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term8998, args);
    }

};


