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

public class DsnCreateInputData_getAvgblk_17022701082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4362;

    public DsnCreateInputData_getAvgblk_17022701082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4411 = new Integer(1134449235);
        Integer term4413 = new Integer(-883034806);
        Integer term4415 = new Integer(1585847225);
        Integer term4417 = new Integer(597278769);
        Integer term4431 = new Integer(-1685132342);
        Integer term4433 = new Integer(-1456670397);
        term4362 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term4362, term4362.getClass(), "volser", "QduALnDSVo");
        setField(term4362, term4362.getClass(), "unit", "izPpKDErnQ");
        setField(term4362, term4362.getClass(), "dsorg", "NnpwZBUTvx");
        setField(term4362, term4362.getClass(), "alcunit", "tlQSNgTkQX");
        setField(term4362, term4362.getClass(), "primary", term4411);
        setField(term4362, term4362.getClass(), "secondary", term4413);
        setField(term4362, term4362.getClass(), "dirblk", term4415);
        setField(term4362, term4362.getClass(), "avgblk", term4417);
        setField(term4362, term4362.getClass(), "recfm", "PCipZnmBOF");
        setField(term4362, term4362.getClass(), "blksize", term4431);
        setField(term4362, term4362.getClass(), "lrecl", term4433);
        setField(term4362, term4362.getClass(), "storclass", "zcorEihhLK");
        setField(term4362, term4362.getClass(), "mgntclass", "GrqozDKFOk");
        setField(term4362, term4362.getClass(), "dataclass", "CFyoseFGLF");
        setField(term4362, term4362.getClass(), "dsntype", "SFqCrhEWLm");
        setBooleanField(term4362, term4362.getClass(), "showAttributes", true);
        setField(term4362, term4362.getClass(), "size", "GZdcJyZntS");
        setField(term4362, term4362.getClass(), "responseTimeout", "OIHoJeysUi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvgblk", argTypes, term4362, args);
    }

};


