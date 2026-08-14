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

public class DsnCreateInputData_Builder_alcunit_11451987921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25910;

    public DsnCreateInputData_Builder_alcunit_11451987921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25959 = new Integer(1386130016);
        Integer term25961 = new Integer(1072005683);
        Integer term25963 = new Integer(1861318859);
        Integer term25965 = new Integer(1474524152);
        Integer term25979 = new Integer(568954359);
        Integer term25981 = new Integer(53410913);
        term25910 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term25910, term25910.getClass(), "volser", "kucsxnvbES");
        setField(term25910, term25910.getClass(), "unit", "IdGzDFfcZf");
        setField(term25910, term25910.getClass(), "dsorg", "KDdRNhZmnU");
        setField(term25910, term25910.getClass(), "alcunit", "iMsqJaKlDC");
        setField(term25910, term25910.getClass(), "primary", term25959);
        setField(term25910, term25910.getClass(), "secondary", term25961);
        setField(term25910, term25910.getClass(), "dirblk", term25963);
        setField(term25910, term25910.getClass(), "avgblk", term25965);
        setField(term25910, term25910.getClass(), "recfm", "aPkGHbZyjj");
        setField(term25910, term25910.getClass(), "blksize", term25979);
        setField(term25910, term25910.getClass(), "lrecl", term25981);
        setField(term25910, term25910.getClass(), "storclass", "nSWdsVyJRI");
        setField(term25910, term25910.getClass(), "mgntclass", "JBOPGgGKnc");
        setField(term25910, term25910.getClass(), "dataclass", "GlPTiCMCGP");
        setField(term25910, term25910.getClass(), "dsntype", "jlcBpLoWfd");
        setBooleanField(term25910, term25910.getClass(), "showAttributes", false);
        setField(term25910, term25910.getClass(), "size", "oYymmLqbfJ");
        setField(term25910, term25910.getClass(), "responseTimeout", "YaDWphDOSz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nnnmCgFBLw";
        callMethod(klass, "alcunit", argTypes, term25910, args);
    }

};


