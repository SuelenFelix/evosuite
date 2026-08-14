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

public class DsnCreateInputData_getPrimary_12473046710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6410;

    public DsnCreateInputData_getPrimary_12473046710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6459 = new Integer(1596070772);
        Integer term6461 = new Integer(97029295);
        Integer term6463 = new Integer(-1371869594);
        Integer term6465 = new Integer(-2095575670);
        Integer term6479 = new Integer(1225272962);
        Integer term6481 = new Integer(1324040357);
        term6410 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term6410, term6410.getClass(), "volser", "PXdVZyoJyC");
        setField(term6410, term6410.getClass(), "unit", "vLerpqavFM");
        setField(term6410, term6410.getClass(), "dsorg", "qnvxzwuGKX");
        setField(term6410, term6410.getClass(), "alcunit", "EdPAvpluZg");
        setField(term6410, term6410.getClass(), "primary", term6459);
        setField(term6410, term6410.getClass(), "secondary", term6461);
        setField(term6410, term6410.getClass(), "dirblk", term6463);
        setField(term6410, term6410.getClass(), "avgblk", term6465);
        setField(term6410, term6410.getClass(), "recfm", "DzHVBMqWtE");
        setField(term6410, term6410.getClass(), "blksize", term6479);
        setField(term6410, term6410.getClass(), "lrecl", term6481);
        setField(term6410, term6410.getClass(), "storclass", "THZSpzBRYP");
        setField(term6410, term6410.getClass(), "mgntclass", "ZfBIVGBQOE");
        setField(term6410, term6410.getClass(), "dataclass", "QSrDQfEsTR");
        setField(term6410, term6410.getClass(), "dsntype", "PsqusYmejD");
        setBooleanField(term6410, term6410.getClass(), "showAttributes", false);
        setField(term6410, term6410.getClass(), "size", "NTWMiBEaDF");
        setField(term6410, term6410.getClass(), "responseTimeout", "SPBstwKFVr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrimary", argTypes, term6410, args);
    }

};


