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

public class DsnCreateInputData_getLrecl_8553257838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5898;

    public DsnCreateInputData_getLrecl_8553257838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5947 = new Integer(579005622);
        Integer term5949 = new Integer(-14890619);
        Integer term5951 = new Integer(1632125673);
        Integer term5953 = new Integer(454281060);
        Integer term5967 = new Integer(-1786399638);
        Integer term5969 = new Integer(2055867847);
        term5898 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term5898, term5898.getClass(), "volser", "OcfNzHYdki");
        setField(term5898, term5898.getClass(), "unit", "uPuCVuZYOI");
        setField(term5898, term5898.getClass(), "dsorg", "TweMFhxNdj");
        setField(term5898, term5898.getClass(), "alcunit", "NBrvVzvQHe");
        setField(term5898, term5898.getClass(), "primary", term5947);
        setField(term5898, term5898.getClass(), "secondary", term5949);
        setField(term5898, term5898.getClass(), "dirblk", term5951);
        setField(term5898, term5898.getClass(), "avgblk", term5953);
        setField(term5898, term5898.getClass(), "recfm", "FjOiNAfBOc");
        setField(term5898, term5898.getClass(), "blksize", term5967);
        setField(term5898, term5898.getClass(), "lrecl", term5969);
        setField(term5898, term5898.getClass(), "storclass", "iCCsaLHohG");
        setField(term5898, term5898.getClass(), "mgntclass", "NJhGgctbdj");
        setField(term5898, term5898.getClass(), "dataclass", "MYWYUeLGOp");
        setField(term5898, term5898.getClass(), "dsntype", "tsTGdgQYUL");
        setBooleanField(term5898, term5898.getClass(), "showAttributes", false);
        setField(term5898, term5898.getClass(), "size", "TtGbVmKcnX");
        setField(term5898, term5898.getClass(), "responseTimeout", "GJVkUrCVdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLrecl", argTypes, term5898, args);
    }

};


