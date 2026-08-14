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

public class DsnCreateInputData_Builder_primary_132858176730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31048;

    public DsnCreateInputData_Builder_primary_132858176730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31048 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term31048, term31048.getClass(), "volser", null);
        setField(term31048, term31048.getClass(), "unit", null);
        setField(term31048, term31048.getClass(), "dsorg", null);
        setField(term31048, term31048.getClass(), "alcunit", null);
        setField(term31048, term31048.getClass(), "primary", null);
        setField(term31048, term31048.getClass(), "secondary", null);
        setField(term31048, term31048.getClass(), "dirblk", null);
        setField(term31048, term31048.getClass(), "avgblk", null);
        setField(term31048, term31048.getClass(), "recfm", null);
        setField(term31048, term31048.getClass(), "blksize", null);
        setField(term31048, term31048.getClass(), "lrecl", null);
        setField(term31048, term31048.getClass(), "storclass", null);
        setField(term31048, term31048.getClass(), "mgntclass", null);
        setField(term31048, term31048.getClass(), "dataclass", null);
        setField(term31048, term31048.getClass(), "dsntype", null);
        setBooleanField(term31048, term31048.getClass(), "showAttributes", false);
        setField(term31048, term31048.getClass(), "size", null);
        setField(term31048, term31048.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "primary", argTypes, term31048, args);
    }

};


