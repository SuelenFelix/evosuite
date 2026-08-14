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

public class DsnCreateInputData_getBlksize_2532487013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4618;

    public DsnCreateInputData_getBlksize_2532487013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4667 = new Integer(1622346318);
        Integer term4669 = new Integer(1048535127);
        Integer term4671 = new Integer(-655067527);
        Integer term4673 = new Integer(-6029667);
        Integer term4687 = new Integer(-2068769794);
        Integer term4689 = new Integer(-117576464);
        term4618 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term4618, term4618.getClass(), "volser", "WXMWFDGcLB");
        setField(term4618, term4618.getClass(), "unit", "wKWbJssZuG");
        setField(term4618, term4618.getClass(), "dsorg", "NzBMMhkhpT");
        setField(term4618, term4618.getClass(), "alcunit", "qCpEbQDHdF");
        setField(term4618, term4618.getClass(), "primary", term4667);
        setField(term4618, term4618.getClass(), "secondary", term4669);
        setField(term4618, term4618.getClass(), "dirblk", term4671);
        setField(term4618, term4618.getClass(), "avgblk", term4673);
        setField(term4618, term4618.getClass(), "recfm", "AHbZyFOmlo");
        setField(term4618, term4618.getClass(), "blksize", term4687);
        setField(term4618, term4618.getClass(), "lrecl", term4689);
        setField(term4618, term4618.getClass(), "storclass", "TwfWVQGiIj");
        setField(term4618, term4618.getClass(), "mgntclass", "gUvcueTURF");
        setField(term4618, term4618.getClass(), "dataclass", "EwQBhZjCIT");
        setField(term4618, term4618.getClass(), "dsntype", "aSkmSwTnEw");
        setBooleanField(term4618, term4618.getClass(), "showAttributes", true);
        setField(term4618, term4618.getClass(), "size", "xvkbvaEGYd");
        setField(term4618, term4618.getClass(), "responseTimeout", "HBGNxdNURv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlksize", argTypes, term4618, args);
    }

};


