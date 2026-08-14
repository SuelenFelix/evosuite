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
import java.lang.Boolean;

public class DsnCreateInputData_Builder_showAttributes_23666874714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29404;
     Object term29550;

    public DsnCreateInputData_Builder_showAttributes_23666874714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29453 = new Integer(-1870495012);
        Integer term29455 = new Integer(-1310015129);
        Integer term29457 = new Integer(-2104981311);
        Integer term29459 = new Integer(-571169753);
        Integer term29473 = new Integer(318591690);
        Integer term29475 = new Integer(-165587447);
        term29404 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term29404, term29404.getClass(), "volser", "vQJUCtuYpK");
        setField(term29404, term29404.getClass(), "unit", "GHtOeztAdz");
        setField(term29404, term29404.getClass(), "dsorg", "gSAtqakaLY");
        setField(term29404, term29404.getClass(), "alcunit", "taPBiMFNEZ");
        setField(term29404, term29404.getClass(), "primary", term29453);
        setField(term29404, term29404.getClass(), "secondary", term29455);
        setField(term29404, term29404.getClass(), "dirblk", term29457);
        setField(term29404, term29404.getClass(), "avgblk", term29459);
        setField(term29404, term29404.getClass(), "recfm", "NoAFAfGyYL");
        setField(term29404, term29404.getClass(), "blksize", term29473);
        setField(term29404, term29404.getClass(), "lrecl", term29475);
        setField(term29404, term29404.getClass(), "storclass", "MFtfkBMyOD");
        setField(term29404, term29404.getClass(), "mgntclass", "rdiIyXfRtL");
        setField(term29404, term29404.getClass(), "dataclass", "douzkltmiI");
        setField(term29404, term29404.getClass(), "dsntype", "MFKjhvLtpe");
        setBooleanField(term29404, term29404.getClass(), "showAttributes", true);
        setField(term29404, term29404.getClass(), "size", "xpbLKEsput");
        setField(term29404, term29404.getClass(), "responseTimeout", "urlyLwPBVn");
        term29550 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term29550;
        callMethod(klass, "showAttributes", argTypes, term29404, args);
    }

};


