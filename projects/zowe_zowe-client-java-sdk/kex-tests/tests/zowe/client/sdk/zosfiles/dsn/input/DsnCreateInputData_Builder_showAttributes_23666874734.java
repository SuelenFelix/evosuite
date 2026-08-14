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
import java.lang.Boolean;

public class DsnCreateInputData_Builder_showAttributes_23666874734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31056;
     Object term31058;

    public DsnCreateInputData_Builder_showAttributes_23666874734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31056 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term31056, term31056.getClass(), "volser", null);
        setField(term31056, term31056.getClass(), "unit", null);
        setField(term31056, term31056.getClass(), "dsorg", null);
        setField(term31056, term31056.getClass(), "alcunit", null);
        setField(term31056, term31056.getClass(), "primary", null);
        setField(term31056, term31056.getClass(), "secondary", null);
        setField(term31056, term31056.getClass(), "dirblk", null);
        setField(term31056, term31056.getClass(), "avgblk", null);
        setField(term31056, term31056.getClass(), "recfm", null);
        setField(term31056, term31056.getClass(), "blksize", null);
        setField(term31056, term31056.getClass(), "lrecl", null);
        setField(term31056, term31056.getClass(), "storclass", null);
        setField(term31056, term31056.getClass(), "mgntclass", null);
        setField(term31056, term31056.getClass(), "dataclass", null);
        setField(term31056, term31056.getClass(), "dsntype", null);
        setBooleanField(term31056, term31056.getClass(), "showAttributes", false);
        setField(term31056, term31056.getClass(), "size", null);
        setField(term31056, term31056.getClass(), "responseTimeout", null);
        term31058 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term31058;
        callMethod(klass, "showAttributes", argTypes, term31056, args);
    }

};


