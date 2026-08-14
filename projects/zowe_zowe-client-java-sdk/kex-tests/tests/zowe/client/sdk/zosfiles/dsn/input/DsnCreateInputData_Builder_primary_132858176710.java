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

public class DsnCreateInputData_Builder_primary_132858176710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28332;
     Object term28478;

    public DsnCreateInputData_Builder_primary_132858176710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28381 = new Integer(197109649);
        Integer term28383 = new Integer(-1239406390);
        Integer term28385 = new Integer(1557431527);
        Integer term28387 = new Integer(-1504890659);
        Integer term28401 = new Integer(1358829571);
        Integer term28403 = new Integer(991356662);
        term28332 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term28332, term28332.getClass(), "volser", "IHsXSAFYKi");
        setField(term28332, term28332.getClass(), "unit", "KyGbLglqbW");
        setField(term28332, term28332.getClass(), "dsorg", "ZKVeStsSNT");
        setField(term28332, term28332.getClass(), "alcunit", "cqCXYaAnFB");
        setField(term28332, term28332.getClass(), "primary", term28381);
        setField(term28332, term28332.getClass(), "secondary", term28383);
        setField(term28332, term28332.getClass(), "dirblk", term28385);
        setField(term28332, term28332.getClass(), "avgblk", term28387);
        setField(term28332, term28332.getClass(), "recfm", "UPLNFZHXjw");
        setField(term28332, term28332.getClass(), "blksize", term28401);
        setField(term28332, term28332.getClass(), "lrecl", term28403);
        setField(term28332, term28332.getClass(), "storclass", "CwrrJlrGmg");
        setField(term28332, term28332.getClass(), "mgntclass", "HejzvyejjG");
        setField(term28332, term28332.getClass(), "dataclass", "pbqJjeooBM");
        setField(term28332, term28332.getClass(), "dsntype", "ccnotFfPXt");
        setBooleanField(term28332, term28332.getClass(), "showAttributes", true);
        setField(term28332, term28332.getClass(), "size", "plWlgdgIhn");
        setField(term28332, term28332.getClass(), "responseTimeout", "RZaKVKWtND");
        term28478 = new Integer(-506958186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term28478;
        callMethod(klass, "primary", argTypes, term28332, args);
    }

};


