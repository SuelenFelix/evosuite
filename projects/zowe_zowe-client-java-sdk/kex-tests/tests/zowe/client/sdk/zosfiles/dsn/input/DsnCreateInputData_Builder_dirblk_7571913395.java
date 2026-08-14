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

public class DsnCreateInputData_Builder_dirblk_7571913395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26982;
     Object term27128;

    public DsnCreateInputData_Builder_dirblk_7571913395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27031 = new Integer(1555897383);
        Integer term27033 = new Integer(202001407);
        Integer term27035 = new Integer(158873461);
        Integer term27037 = new Integer(-430151637);
        Integer term27051 = new Integer(-1697741339);
        Integer term27053 = new Integer(98922530);
        term26982 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term26982, term26982.getClass(), "volser", "wIuJvIvEMb");
        setField(term26982, term26982.getClass(), "unit", "EyojsbSjWT");
        setField(term26982, term26982.getClass(), "dsorg", "szGicGyWDL");
        setField(term26982, term26982.getClass(), "alcunit", "lkdvUiYwRq");
        setField(term26982, term26982.getClass(), "primary", term27031);
        setField(term26982, term26982.getClass(), "secondary", term27033);
        setField(term26982, term26982.getClass(), "dirblk", term27035);
        setField(term26982, term26982.getClass(), "avgblk", term27037);
        setField(term26982, term26982.getClass(), "recfm", "XuxkPrpfND");
        setField(term26982, term26982.getClass(), "blksize", term27051);
        setField(term26982, term26982.getClass(), "lrecl", term27053);
        setField(term26982, term26982.getClass(), "storclass", "OxNXeKMDje");
        setField(term26982, term26982.getClass(), "mgntclass", "hGTqHomrbc");
        setField(term26982, term26982.getClass(), "dataclass", "NNMBrIWEBw");
        setField(term26982, term26982.getClass(), "dsntype", "GrTaccOQzl");
        setBooleanField(term26982, term26982.getClass(), "showAttributes", true);
        setField(term26982, term26982.getClass(), "size", "uuSYOUCVHU");
        setField(term26982, term26982.getClass(), "responseTimeout", "DfWwbodtVw");
        term27128 = new Integer(-1388471422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term27128;
        callMethod(klass, "dirblk", argTypes, term26982, args);
    }

};


