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

public class DsnCreateInputData_getUnit_34886163437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9002;

    public DsnCreateInputData_getUnit_34886163437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9002 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term9002, term9002.getClass(), "volser", null);
        setField(term9002, term9002.getClass(), "unit", null);
        setField(term9002, term9002.getClass(), "dsorg", null);
        setField(term9002, term9002.getClass(), "alcunit", null);
        setField(term9002, term9002.getClass(), "primary", null);
        setField(term9002, term9002.getClass(), "secondary", null);
        setField(term9002, term9002.getClass(), "dirblk", null);
        setField(term9002, term9002.getClass(), "avgblk", null);
        setField(term9002, term9002.getClass(), "recfm", null);
        setField(term9002, term9002.getClass(), "blksize", null);
        setField(term9002, term9002.getClass(), "lrecl", null);
        setField(term9002, term9002.getClass(), "storclass", null);
        setField(term9002, term9002.getClass(), "mgntclass", null);
        setField(term9002, term9002.getClass(), "dataclass", null);
        setField(term9002, term9002.getClass(), "dsntype", null);
        setBooleanField(term9002, term9002.getClass(), "showAttributes", false);
        setField(term9002, term9002.getClass(), "size", null);
        setField(term9002, term9002.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnit", argTypes, term9002, args);
    }

};


