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

public class DsnCreateInputData_Builder_volser_13940288918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30496;

    public DsnCreateInputData_Builder_volser_13940288918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30545 = new Integer(-1476644457);
        Integer term30547 = new Integer(1270666529);
        Integer term30549 = new Integer(-1146679443);
        Integer term30551 = new Integer(-860131894);
        Integer term30565 = new Integer(-1022990421);
        Integer term30567 = new Integer(1045547089);
        term30496 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term30496, term30496.getClass(), "volser", "wkqPmmFDAa");
        setField(term30496, term30496.getClass(), "unit", "rLTDtNqLyW");
        setField(term30496, term30496.getClass(), "dsorg", "CLsbWobdgS");
        setField(term30496, term30496.getClass(), "alcunit", "TbYrjEyFPc");
        setField(term30496, term30496.getClass(), "primary", term30545);
        setField(term30496, term30496.getClass(), "secondary", term30547);
        setField(term30496, term30496.getClass(), "dirblk", term30549);
        setField(term30496, term30496.getClass(), "avgblk", term30551);
        setField(term30496, term30496.getClass(), "recfm", "muefchpJiZ");
        setField(term30496, term30496.getClass(), "blksize", term30565);
        setField(term30496, term30496.getClass(), "lrecl", term30567);
        setField(term30496, term30496.getClass(), "storclass", "tuYaAqvYrh");
        setField(term30496, term30496.getClass(), "mgntclass", "CIbhheukbR");
        setField(term30496, term30496.getClass(), "dataclass", "VOHPpErtan");
        setField(term30496, term30496.getClass(), "dsntype", "GDMUlolTNs");
        setBooleanField(term30496, term30496.getClass(), "showAttributes", false);
        setField(term30496, term30496.getClass(), "size", "xpLvWisjzN");
        setField(term30496, term30496.getClass(), "responseTimeout", "IKfozyyKEj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "thCjwQjRBL";
        callMethod(klass, "volser", argTypes, term30496, args);
    }

};


