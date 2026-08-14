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

public class DsnCreateInputData_getBlksize_25324870123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8974;

    public DsnCreateInputData_getBlksize_25324870123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8974 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term8974, term8974.getClass(), "volser", null);
        setField(term8974, term8974.getClass(), "unit", null);
        setField(term8974, term8974.getClass(), "dsorg", null);
        setField(term8974, term8974.getClass(), "alcunit", null);
        setField(term8974, term8974.getClass(), "primary", null);
        setField(term8974, term8974.getClass(), "secondary", null);
        setField(term8974, term8974.getClass(), "dirblk", null);
        setField(term8974, term8974.getClass(), "avgblk", null);
        setField(term8974, term8974.getClass(), "recfm", null);
        setField(term8974, term8974.getClass(), "blksize", null);
        setField(term8974, term8974.getClass(), "lrecl", null);
        setField(term8974, term8974.getClass(), "storclass", null);
        setField(term8974, term8974.getClass(), "mgntclass", null);
        setField(term8974, term8974.getClass(), "dataclass", null);
        setField(term8974, term8974.getClass(), "dsntype", null);
        setBooleanField(term8974, term8974.getClass(), "showAttributes", false);
        setField(term8974, term8974.getClass(), "size", null);
        setField(term8974, term8974.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlksize", argTypes, term8974, args);
    }

};


