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

public class DsnCreateInputData_Builder_volser_13940288938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31066;

    public DsnCreateInputData_Builder_volser_13940288938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31066 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term31066, term31066.getClass(), "volser", null);
        setField(term31066, term31066.getClass(), "unit", null);
        setField(term31066, term31066.getClass(), "dsorg", null);
        setField(term31066, term31066.getClass(), "alcunit", null);
        setField(term31066, term31066.getClass(), "primary", null);
        setField(term31066, term31066.getClass(), "secondary", null);
        setField(term31066, term31066.getClass(), "dirblk", null);
        setField(term31066, term31066.getClass(), "avgblk", null);
        setField(term31066, term31066.getClass(), "recfm", null);
        setField(term31066, term31066.getClass(), "blksize", null);
        setField(term31066, term31066.getClass(), "lrecl", null);
        setField(term31066, term31066.getClass(), "storclass", null);
        setField(term31066, term31066.getClass(), "mgntclass", null);
        setField(term31066, term31066.getClass(), "dataclass", null);
        setField(term31066, term31066.getClass(), "dsntype", null);
        setBooleanField(term31066, term31066.getClass(), "showAttributes", false);
        setField(term31066, term31066.getClass(), "size", null);
        setField(term31066, term31066.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "volser", argTypes, term31066, args);
    }

};


