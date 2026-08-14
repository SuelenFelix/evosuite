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

public class DsnCreateInputData_Builder_unit_117071862417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30218;

    public DsnCreateInputData_Builder_unit_117071862417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30267 = new Integer(-159494544);
        Integer term30269 = new Integer(-75206835);
        Integer term30271 = new Integer(-1618206977);
        Integer term30273 = new Integer(-1747406163);
        Integer term30287 = new Integer(388157121);
        Integer term30289 = new Integer(1684998508);
        term30218 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term30218, term30218.getClass(), "volser", "ZiyMvLArWJ");
        setField(term30218, term30218.getClass(), "unit", "MaeokjEfWD");
        setField(term30218, term30218.getClass(), "dsorg", "ocZcumnXEz");
        setField(term30218, term30218.getClass(), "alcunit", "rNNwyactDR");
        setField(term30218, term30218.getClass(), "primary", term30267);
        setField(term30218, term30218.getClass(), "secondary", term30269);
        setField(term30218, term30218.getClass(), "dirblk", term30271);
        setField(term30218, term30218.getClass(), "avgblk", term30273);
        setField(term30218, term30218.getClass(), "recfm", "QJrTMTdxyh");
        setField(term30218, term30218.getClass(), "blksize", term30287);
        setField(term30218, term30218.getClass(), "lrecl", term30289);
        setField(term30218, term30218.getClass(), "storclass", "rgZSPplPSs");
        setField(term30218, term30218.getClass(), "mgntclass", "NPUSTXlEKx");
        setField(term30218, term30218.getClass(), "dataclass", "KKFprGoNpl");
        setField(term30218, term30218.getClass(), "dsntype", "tWVISJlxKZ");
        setBooleanField(term30218, term30218.getClass(), "showAttributes", false);
        setField(term30218, term30218.getClass(), "size", "rOZkUKEoaf");
        setField(term30218, term30218.getClass(), "responseTimeout", "yLnzGqyHGL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IjprPXBDuY";
        callMethod(klass, "unit", argTypes, term30218, args);
    }

};


