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
import java.lang.Integer;

public class DsnCreateInputData_Builder_dsntype_18034948276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27240;

    public DsnCreateInputData_Builder_dsntype_18034948276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27289 = new Integer(-1498296052);
        Integer term27291 = new Integer(2098647989);
        Integer term27293 = new Integer(1598895173);
        Integer term27295 = new Integer(1830648570);
        Integer term27309 = new Integer(-227365013);
        Integer term27311 = new Integer(11724947);
        term27240 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term27240, term27240.getClass(), "volser", "kTbFMpVWqx");
        setField(term27240, term27240.getClass(), "unit", "HegRNsidFg");
        setField(term27240, term27240.getClass(), "dsorg", "udRdJkgXmH");
        setField(term27240, term27240.getClass(), "alcunit", "FBCXbjHVXO");
        setField(term27240, term27240.getClass(), "primary", term27289);
        setField(term27240, term27240.getClass(), "secondary", term27291);
        setField(term27240, term27240.getClass(), "dirblk", term27293);
        setField(term27240, term27240.getClass(), "avgblk", term27295);
        setField(term27240, term27240.getClass(), "recfm", "dIWAnvmLiC");
        setField(term27240, term27240.getClass(), "blksize", term27309);
        setField(term27240, term27240.getClass(), "lrecl", term27311);
        setField(term27240, term27240.getClass(), "storclass", "CuWebzZQjZ");
        setField(term27240, term27240.getClass(), "mgntclass", "wRVaaJxKYI");
        setField(term27240, term27240.getClass(), "dataclass", "yOQuJXRvOo");
        setField(term27240, term27240.getClass(), "dsntype", "XmLHcnVsch");
        setBooleanField(term27240, term27240.getClass(), "showAttributes", true);
        setField(term27240, term27240.getClass(), "size", "Yrvtdcltri");
        setField(term27240, term27240.getClass(), "responseTimeout", "RxrsjXRVcT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cfRimmJxqA";
        callMethod(klass, "dsntype", argTypes, term27240, args);
    }

};


