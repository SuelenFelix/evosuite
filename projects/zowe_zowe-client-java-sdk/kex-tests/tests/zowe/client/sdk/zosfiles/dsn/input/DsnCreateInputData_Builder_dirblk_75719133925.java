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

public class DsnCreateInputData_Builder_dirblk_75719133925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31038;

    public DsnCreateInputData_Builder_dirblk_75719133925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31038 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term31038, term31038.getClass(), "volser", null);
        setField(term31038, term31038.getClass(), "unit", null);
        setField(term31038, term31038.getClass(), "dsorg", null);
        setField(term31038, term31038.getClass(), "alcunit", null);
        setField(term31038, term31038.getClass(), "primary", null);
        setField(term31038, term31038.getClass(), "secondary", null);
        setField(term31038, term31038.getClass(), "dirblk", null);
        setField(term31038, term31038.getClass(), "avgblk", null);
        setField(term31038, term31038.getClass(), "recfm", null);
        setField(term31038, term31038.getClass(), "blksize", null);
        setField(term31038, term31038.getClass(), "lrecl", null);
        setField(term31038, term31038.getClass(), "storclass", null);
        setField(term31038, term31038.getClass(), "mgntclass", null);
        setField(term31038, term31038.getClass(), "dataclass", null);
        setField(term31038, term31038.getClass(), "dsntype", null);
        setBooleanField(term31038, term31038.getClass(), "showAttributes", false);
        setField(term31038, term31038.getClass(), "size", null);
        setField(term31038, term31038.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "dirblk", argTypes, term31038, args);
    }

};


