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

public class DsnCreateInputData_getUnit_34886163417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8202;

    public DsnCreateInputData_getUnit_34886163417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8251 = new Integer(683666002);
        Integer term8253 = new Integer(1596213415);
        Integer term8255 = new Integer(-268815336);
        Integer term8257 = new Integer(-1210583429);
        Integer term8271 = new Integer(-663691365);
        Integer term8273 = new Integer(339854490);
        term8202 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term8202, term8202.getClass(), "volser", "bdyhHbDAmJ");
        setField(term8202, term8202.getClass(), "unit", "BBXiTNHqGE");
        setField(term8202, term8202.getClass(), "dsorg", "IEYhJmgCVd");
        setField(term8202, term8202.getClass(), "alcunit", "KSJeYkkvpk");
        setField(term8202, term8202.getClass(), "primary", term8251);
        setField(term8202, term8202.getClass(), "secondary", term8253);
        setField(term8202, term8202.getClass(), "dirblk", term8255);
        setField(term8202, term8202.getClass(), "avgblk", term8257);
        setField(term8202, term8202.getClass(), "recfm", "qUtkFGMNUV");
        setField(term8202, term8202.getClass(), "blksize", term8271);
        setField(term8202, term8202.getClass(), "lrecl", term8273);
        setField(term8202, term8202.getClass(), "storclass", "mGRiYhnMcR");
        setField(term8202, term8202.getClass(), "mgntclass", "NFlvfJCVPO");
        setField(term8202, term8202.getClass(), "dataclass", "KarbTXFmUU");
        setField(term8202, term8202.getClass(), "dsntype", "jiUSjqwSIQ");
        setBooleanField(term8202, term8202.getClass(), "showAttributes", false);
        setField(term8202, term8202.getClass(), "size", "MgLCedQfoj");
        setField(term8202, term8202.getClass(), "responseTimeout", "zgKiINdgNu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnit", argTypes, term8202, args);
    }

};


