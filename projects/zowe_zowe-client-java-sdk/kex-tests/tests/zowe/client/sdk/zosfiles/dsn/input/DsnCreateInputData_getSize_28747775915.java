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

public class DsnCreateInputData_getSize_28747775915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7690;

    public DsnCreateInputData_getSize_28747775915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7739 = new Integer(-1772434990);
        Integer term7741 = new Integer(-1845499264);
        Integer term7743 = new Integer(-505439934);
        Integer term7745 = new Integer(-344842608);
        Integer term7759 = new Integer(941650513);
        Integer term7761 = new Integer(444029505);
        term7690 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term7690, term7690.getClass(), "volser", "MeTmRZXErV");
        setField(term7690, term7690.getClass(), "unit", "jNxbVmoZgq");
        setField(term7690, term7690.getClass(), "dsorg", "PvmBHIXaMY");
        setField(term7690, term7690.getClass(), "alcunit", "hulYxtowxw");
        setField(term7690, term7690.getClass(), "primary", term7739);
        setField(term7690, term7690.getClass(), "secondary", term7741);
        setField(term7690, term7690.getClass(), "dirblk", term7743);
        setField(term7690, term7690.getClass(), "avgblk", term7745);
        setField(term7690, term7690.getClass(), "recfm", "GNEmuHPNcU");
        setField(term7690, term7690.getClass(), "blksize", term7759);
        setField(term7690, term7690.getClass(), "lrecl", term7761);
        setField(term7690, term7690.getClass(), "storclass", "IoSfuKDFRe");
        setField(term7690, term7690.getClass(), "mgntclass", "AWYyZiNfsm");
        setField(term7690, term7690.getClass(), "dataclass", "ITRRYiuDwH");
        setField(term7690, term7690.getClass(), "dsntype", "llRfwANcVF");
        setBooleanField(term7690, term7690.getClass(), "showAttributes", true);
        setField(term7690, term7690.getClass(), "size", "sUEeHQTWkA");
        setField(term7690, term7690.getClass(), "responseTimeout", "BDIRCxAWLA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term7690, args);
    }

};


