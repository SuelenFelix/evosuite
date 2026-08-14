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

public class DsnCreateInputData_Builder_dsorg_3293056477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27518;

    public DsnCreateInputData_Builder_dsorg_3293056477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27567 = new Integer(1953277050);
        Integer term27569 = new Integer(1283079251);
        Integer term27571 = new Integer(-523949691);
        Integer term27573 = new Integer(1398204340);
        Integer term27587 = new Integer(229204365);
        Integer term27589 = new Integer(-461771056);
        term27518 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term27518, term27518.getClass(), "volser", "oOnRVGqFmy");
        setField(term27518, term27518.getClass(), "unit", "LaXzFIlWMk");
        setField(term27518, term27518.getClass(), "dsorg", "GuVQjhBxma");
        setField(term27518, term27518.getClass(), "alcunit", "WAVMPPbIfL");
        setField(term27518, term27518.getClass(), "primary", term27567);
        setField(term27518, term27518.getClass(), "secondary", term27569);
        setField(term27518, term27518.getClass(), "dirblk", term27571);
        setField(term27518, term27518.getClass(), "avgblk", term27573);
        setField(term27518, term27518.getClass(), "recfm", "GISHLsgALf");
        setField(term27518, term27518.getClass(), "blksize", term27587);
        setField(term27518, term27518.getClass(), "lrecl", term27589);
        setField(term27518, term27518.getClass(), "storclass", "PVykkUSgBq");
        setField(term27518, term27518.getClass(), "mgntclass", "tnKbZaCsuj");
        setField(term27518, term27518.getClass(), "dataclass", "ZFpcYBgLNC");
        setField(term27518, term27518.getClass(), "dsntype", "VAGkRppBem");
        setBooleanField(term27518, term27518.getClass(), "showAttributes", false);
        setField(term27518, term27518.getClass(), "size", "eKcEJRxNSu");
        setField(term27518, term27518.getClass(), "responseTimeout", "NTXQPWFYSA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fOuOhBpldm";
        callMethod(klass, "dsorg", argTypes, term27518, args);
    }

};


