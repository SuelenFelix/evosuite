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

public class DsnCreateInputData_getDsorg_18103173697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5642;

    public DsnCreateInputData_getDsorg_18103173697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5691 = new Integer(-602026508);
        Integer term5693 = new Integer(-157887805);
        Integer term5695 = new Integer(1876565163);
        Integer term5697 = new Integer(-817164822);
        Integer term5711 = new Integer(-1016503459);
        Integer term5713 = new Integer(-1968847291);
        term5642 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term5642, term5642.getClass(), "volser", "SOrEHbcbmn");
        setField(term5642, term5642.getClass(), "unit", "bnsyeQXFdu");
        setField(term5642, term5642.getClass(), "dsorg", "BwtdjiefJn");
        setField(term5642, term5642.getClass(), "alcunit", "jDmhBrIoDa");
        setField(term5642, term5642.getClass(), "primary", term5691);
        setField(term5642, term5642.getClass(), "secondary", term5693);
        setField(term5642, term5642.getClass(), "dirblk", term5695);
        setField(term5642, term5642.getClass(), "avgblk", term5697);
        setField(term5642, term5642.getClass(), "recfm", "SPtPatHeOm");
        setField(term5642, term5642.getClass(), "blksize", term5711);
        setField(term5642, term5642.getClass(), "lrecl", term5713);
        setField(term5642, term5642.getClass(), "storclass", "ywmcuThdfL");
        setField(term5642, term5642.getClass(), "mgntclass", "GBOEuByOfr");
        setField(term5642, term5642.getClass(), "dataclass", "NHbOFFjyVK");
        setField(term5642, term5642.getClass(), "dsntype", "zaloBqlrSo");
        setBooleanField(term5642, term5642.getClass(), "showAttributes", false);
        setField(term5642, term5642.getClass(), "size", "vvoLrMGCoN");
        setField(term5642, term5642.getClass(), "responseTimeout", "pXdglvyrQe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDsorg", argTypes, term5642, args);
    }

};


