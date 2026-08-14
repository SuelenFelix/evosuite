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

public class DsnCreateInputData_Builder_build_147397914619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30774;

    public DsnCreateInputData_Builder_build_147397914619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30823 = new Integer(-1122880881);
        Integer term30825 = new Integer(-542712742);
        Integer term30827 = new Integer(-1254072822);
        Integer term30829 = new Integer(-1111249833);
        Integer term30843 = new Integer(-1692331299);
        Integer term30845 = new Integer(479531250);
        term30774 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term30774, term30774.getClass(), "volser", "ojLrjltndD");
        setField(term30774, term30774.getClass(), "unit", "VJtFSexKat");
        setField(term30774, term30774.getClass(), "dsorg", "xPVddlPSQR");
        setField(term30774, term30774.getClass(), "alcunit", "MxrhCLTMTH");
        setField(term30774, term30774.getClass(), "primary", term30823);
        setField(term30774, term30774.getClass(), "secondary", term30825);
        setField(term30774, term30774.getClass(), "dirblk", term30827);
        setField(term30774, term30774.getClass(), "avgblk", term30829);
        setField(term30774, term30774.getClass(), "recfm", "kEehLMZcOU");
        setField(term30774, term30774.getClass(), "blksize", term30843);
        setField(term30774, term30774.getClass(), "lrecl", term30845);
        setField(term30774, term30774.getClass(), "storclass", "RhLliqMiOF");
        setField(term30774, term30774.getClass(), "mgntclass", "jlhonEGrJH");
        setField(term30774, term30774.getClass(), "dataclass", "RKcKwlEYZb");
        setField(term30774, term30774.getClass(), "dsntype", "acPRDlpsid");
        setBooleanField(term30774, term30774.getClass(), "showAttributes", false);
        setField(term30774, term30774.getClass(), "size", "YyojIzvxLZ");
        setField(term30774, term30774.getClass(), "responseTimeout", "fxapaYlZea");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term30774, args);
    }

};


