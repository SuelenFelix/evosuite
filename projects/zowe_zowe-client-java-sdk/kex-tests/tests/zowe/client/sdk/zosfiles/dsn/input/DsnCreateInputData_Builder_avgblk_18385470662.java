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

public class DsnCreateInputData_Builder_avgblk_18385470662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26188;
     Object term26334;

    public DsnCreateInputData_Builder_avgblk_18385470662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26237 = new Integer(-375014958);
        Integer term26239 = new Integer(1107176718);
        Integer term26241 = new Integer(480137250);
        Integer term26243 = new Integer(-341152642);
        Integer term26257 = new Integer(-2015854073);
        Integer term26259 = new Integer(538259104);
        term26188 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term26188, term26188.getClass(), "volser", "hSSCyNEhyH");
        setField(term26188, term26188.getClass(), "unit", "jDFNSuvZqm");
        setField(term26188, term26188.getClass(), "dsorg", "pLvkKHqNYX");
        setField(term26188, term26188.getClass(), "alcunit", "PwqnuJJwjR");
        setField(term26188, term26188.getClass(), "primary", term26237);
        setField(term26188, term26188.getClass(), "secondary", term26239);
        setField(term26188, term26188.getClass(), "dirblk", term26241);
        setField(term26188, term26188.getClass(), "avgblk", term26243);
        setField(term26188, term26188.getClass(), "recfm", "NFkbBiPeiw");
        setField(term26188, term26188.getClass(), "blksize", term26257);
        setField(term26188, term26188.getClass(), "lrecl", term26259);
        setField(term26188, term26188.getClass(), "storclass", "tlRvilQyjJ");
        setField(term26188, term26188.getClass(), "mgntclass", "gwTUlYNpjM");
        setField(term26188, term26188.getClass(), "dataclass", "uXYojRmxrM");
        setField(term26188, term26188.getClass(), "dsntype", "cxRwRcodud");
        setBooleanField(term26188, term26188.getClass(), "showAttributes", true);
        setField(term26188, term26188.getClass(), "size", "GDGBPlYeLn");
        setField(term26188, term26188.getClass(), "responseTimeout", "jdQANIXSTq");
        term26334 = new Integer(96566506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term26334;
        callMethod(klass, "avgblk", argTypes, term26188, args);
    }

};


