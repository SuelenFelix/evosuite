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

public class DsnCreateInputData_getDataclass_8558327364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4874;

    public DsnCreateInputData_getDataclass_8558327364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4923 = new Integer(-1007160944);
        Integer term4925 = new Integer(1135664017);
        Integer term4927 = new Integer(590364439);
        Integer term4929 = new Integer(865208305);
        Integer term4943 = new Integer(-1275173084);
        Integer term4945 = new Integer(-244121226);
        term4874 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term4874, term4874.getClass(), "volser", "mfCpTPPQQm");
        setField(term4874, term4874.getClass(), "unit", "OcJCIDNIXA");
        setField(term4874, term4874.getClass(), "dsorg", "XfRABIFVEp");
        setField(term4874, term4874.getClass(), "alcunit", "MHGKyEnwKc");
        setField(term4874, term4874.getClass(), "primary", term4923);
        setField(term4874, term4874.getClass(), "secondary", term4925);
        setField(term4874, term4874.getClass(), "dirblk", term4927);
        setField(term4874, term4874.getClass(), "avgblk", term4929);
        setField(term4874, term4874.getClass(), "recfm", "ShIELyuULw");
        setField(term4874, term4874.getClass(), "blksize", term4943);
        setField(term4874, term4874.getClass(), "lrecl", term4945);
        setField(term4874, term4874.getClass(), "storclass", "IpQuOGMgmj");
        setField(term4874, term4874.getClass(), "mgntclass", "pJbnHTYrxn");
        setField(term4874, term4874.getClass(), "dataclass", "iIRsCSYqXH");
        setField(term4874, term4874.getClass(), "dsntype", "nghfqDXyCG");
        setBooleanField(term4874, term4874.getClass(), "showAttributes", true);
        setField(term4874, term4874.getClass(), "size", "WBAOTqErtm");
        setField(term4874, term4874.getClass(), "responseTimeout", "PqtVXXZMqK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataclass", argTypes, term4874, args);
    }

};


