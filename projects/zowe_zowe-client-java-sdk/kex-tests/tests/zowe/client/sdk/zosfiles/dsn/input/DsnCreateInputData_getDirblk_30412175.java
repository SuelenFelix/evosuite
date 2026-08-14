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

public class DsnCreateInputData_getDirblk_30412175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5130;

    public DsnCreateInputData_getDirblk_30412175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5179 = new Integer(-203030934);
        Integer term5181 = new Integer(-1179120542);
        Integer term5183 = new Integer(-73683645);
        Integer term5185 = new Integer(-226514366);
        Integer term5199 = new Integer(1193880199);
        Integer term5201 = new Integer(-1087774327);
        term5130 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term5130, term5130.getClass(), "volser", "rYbtIDVdnd");
        setField(term5130, term5130.getClass(), "unit", "UKAReurpHG");
        setField(term5130, term5130.getClass(), "dsorg", "WVRMUmrljA");
        setField(term5130, term5130.getClass(), "alcunit", "NTlKJDDWlk");
        setField(term5130, term5130.getClass(), "primary", term5179);
        setField(term5130, term5130.getClass(), "secondary", term5181);
        setField(term5130, term5130.getClass(), "dirblk", term5183);
        setField(term5130, term5130.getClass(), "avgblk", term5185);
        setField(term5130, term5130.getClass(), "recfm", "vOuMEpOQAg");
        setField(term5130, term5130.getClass(), "blksize", term5199);
        setField(term5130, term5130.getClass(), "lrecl", term5201);
        setField(term5130, term5130.getClass(), "storclass", "SIODFGaQhr");
        setField(term5130, term5130.getClass(), "mgntclass", "qYzsiuXOgS");
        setField(term5130, term5130.getClass(), "dataclass", "bxrCBbrrct");
        setField(term5130, term5130.getClass(), "dsntype", "CKWpJaaaxX");
        setBooleanField(term5130, term5130.getClass(), "showAttributes", false);
        setField(term5130, term5130.getClass(), "size", "UBRmXJmfrt");
        setField(term5130, term5130.getClass(), "responseTimeout", "WZzvmIHhzZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDirblk", argTypes, term5130, args);
    }

};


