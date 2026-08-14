package zowe.client.sdk.zosfiles.dsn.methods;

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
import static zowe.client.sdk.zosfiles.dsn.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DsnCreate_create_16905395392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2143;
     Object term2156;

    public DsnCreate_create_16905395392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2143 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnCreate"));
        setField(term2143, term2143.getClass(), "connection", null);
        setField(term2143, term2143.getClass(), "request", null);
        Integer term2205 = new Integer(568599855);
        Integer term2207 = new Integer(1162663216);
        Integer term2209 = new Integer(1484323161);
        Integer term2211 = new Integer(391863371);
        Integer term2225 = new Integer(-1922583790);
        Integer term2227 = new Integer(-616727354);
        term2156 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term2156, term2156.getClass(), "volser", "LvtrsXUliU");
        setField(term2156, term2156.getClass(), "unit", "xLbjWUgOIL");
        setField(term2156, term2156.getClass(), "dsorg", "jDtqGUpnZN");
        setField(term2156, term2156.getClass(), "alcunit", "nGKItKLYNC");
        setField(term2156, term2156.getClass(), "primary", term2205);
        setField(term2156, term2156.getClass(), "secondary", term2207);
        setField(term2156, term2156.getClass(), "dirblk", term2209);
        setField(term2156, term2156.getClass(), "avgblk", term2211);
        setField(term2156, term2156.getClass(), "recfm", "UiUYnPrcCi");
        setField(term2156, term2156.getClass(), "blksize", term2225);
        setField(term2156, term2156.getClass(), "lrecl", term2227);
        setField(term2156, term2156.getClass(), "storclass", "UoYtihxVaS");
        setField(term2156, term2156.getClass(), "mgntclass", "JDswTTCZHV");
        setField(term2156, term2156.getClass(), "dataclass", "onpbIeEKoi");
        setField(term2156, term2156.getClass(), "dsntype", "YRHGsAkhxb");
        setBooleanField(term2156, term2156.getClass(), "showAttributes", false);
        setField(term2156, term2156.getClass(), "size", "ffYhPOzlUs");
        setField(term2156, term2156.getClass(), "responseTimeout", "MLqYREekMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnCreate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Object[] args = new Object[2];
        args[0] = "tShwQLRGNe";
        args[1] = term2156;
        callMethod(klass, "create", argTypes, term2143, args);
    }

};


