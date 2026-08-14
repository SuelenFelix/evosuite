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

public class DsnCreateInputData_Builder_alcunit_114519879221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31030;

    public DsnCreateInputData_Builder_alcunit_114519879221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31030 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term31030, term31030.getClass(), "volser", null);
        setField(term31030, term31030.getClass(), "unit", null);
        setField(term31030, term31030.getClass(), "dsorg", null);
        setField(term31030, term31030.getClass(), "alcunit", null);
        setField(term31030, term31030.getClass(), "primary", null);
        setField(term31030, term31030.getClass(), "secondary", null);
        setField(term31030, term31030.getClass(), "dirblk", null);
        setField(term31030, term31030.getClass(), "avgblk", null);
        setField(term31030, term31030.getClass(), "recfm", null);
        setField(term31030, term31030.getClass(), "blksize", null);
        setField(term31030, term31030.getClass(), "lrecl", null);
        setField(term31030, term31030.getClass(), "storclass", null);
        setField(term31030, term31030.getClass(), "mgntclass", null);
        setField(term31030, term31030.getClass(), "dataclass", null);
        setField(term31030, term31030.getClass(), "dsntype", null);
        setBooleanField(term31030, term31030.getClass(), "showAttributes", false);
        setField(term31030, term31030.getClass(), "size", null);
        setField(term31030, term31030.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "alcunit", argTypes, term31030, args);
    }

};


