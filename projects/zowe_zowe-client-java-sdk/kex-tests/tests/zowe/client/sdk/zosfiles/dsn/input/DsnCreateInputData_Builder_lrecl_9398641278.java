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

public class DsnCreateInputData_Builder_lrecl_9398641278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27796;
     Object term27942;

    public DsnCreateInputData_Builder_lrecl_9398641278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27845 = new Integer(-243422082);
        Integer term27847 = new Integer(1384592638);
        Integer term27849 = new Integer(-1002370457);
        Integer term27851 = new Integer(-2014576105);
        Integer term27865 = new Integer(1296895584);
        Integer term27867 = new Integer(628918458);
        term27796 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term27796, term27796.getClass(), "volser", "qQQRKGPyIM");
        setField(term27796, term27796.getClass(), "unit", "lzcwhvjdFg");
        setField(term27796, term27796.getClass(), "dsorg", "dfzWTjcjnI");
        setField(term27796, term27796.getClass(), "alcunit", "bsnZXGEvFv");
        setField(term27796, term27796.getClass(), "primary", term27845);
        setField(term27796, term27796.getClass(), "secondary", term27847);
        setField(term27796, term27796.getClass(), "dirblk", term27849);
        setField(term27796, term27796.getClass(), "avgblk", term27851);
        setField(term27796, term27796.getClass(), "recfm", "osFrHWYeRy");
        setField(term27796, term27796.getClass(), "blksize", term27865);
        setField(term27796, term27796.getClass(), "lrecl", term27867);
        setField(term27796, term27796.getClass(), "storclass", "scpIQUfPKw");
        setField(term27796, term27796.getClass(), "mgntclass", "QKYBpCjuYt");
        setField(term27796, term27796.getClass(), "dataclass", "vjiRfoGdkl");
        setField(term27796, term27796.getClass(), "dsntype", "TwaxeSHvnR");
        setBooleanField(term27796, term27796.getClass(), "showAttributes", true);
        setField(term27796, term27796.getClass(), "size", "paPzDETzIq");
        setField(term27796, term27796.getClass(), "responseTimeout", "fufeuGfwpN");
        term27942 = new Integer(-1274456137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term27942;
        callMethod(klass, "lrecl", argTypes, term27796, args);
    }

};


