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

public class DsnCreateInputData_getPrimary_12473046730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8988;

    public DsnCreateInputData_getPrimary_12473046730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8988 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term8988, term8988.getClass(), "volser", null);
        setField(term8988, term8988.getClass(), "unit", null);
        setField(term8988, term8988.getClass(), "dsorg", null);
        setField(term8988, term8988.getClass(), "alcunit", null);
        setField(term8988, term8988.getClass(), "primary", null);
        setField(term8988, term8988.getClass(), "secondary", null);
        setField(term8988, term8988.getClass(), "dirblk", null);
        setField(term8988, term8988.getClass(), "avgblk", null);
        setField(term8988, term8988.getClass(), "recfm", null);
        setField(term8988, term8988.getClass(), "blksize", null);
        setField(term8988, term8988.getClass(), "lrecl", null);
        setField(term8988, term8988.getClass(), "storclass", null);
        setField(term8988, term8988.getClass(), "mgntclass", null);
        setField(term8988, term8988.getClass(), "dataclass", null);
        setField(term8988, term8988.getClass(), "dsntype", null);
        setBooleanField(term8988, term8988.getClass(), "showAttributes", false);
        setField(term8988, term8988.getClass(), "size", null);
        setField(term8988, term8988.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrimary", argTypes, term8988, args);
    }

};


