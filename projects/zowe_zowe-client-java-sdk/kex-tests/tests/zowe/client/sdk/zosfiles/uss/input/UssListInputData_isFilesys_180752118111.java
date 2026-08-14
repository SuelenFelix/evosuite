package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class UssListInputData_isFilesys_180752118111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60784;

    public UssListInputData_isFilesys_180752118111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term60797 = new Integer(-542712742);
        Integer term60835 = new Integer(-1254072822);
        Class<? extends Object> term60950 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term60949 = ((Class) term60950).getDeclaredField((String) "CHAR_SPECIAL_FILE");
        ((Field) term60949).setAccessible(true);
        Object enum167 = ((Field) term60949).get((Object) null);
        Integer term60885 = new Integer(-1111249833);
        term60784 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term60784, term60784.getClass(), "path", "PaCpFXGzdX");
        setField(term60784, term60784.getClass(), "maxLength", term60797);
        setField(term60784, term60784.getClass(), "group", "FftYCNbnks");
        setField(term60784, term60784.getClass(), "user", "lJoltmsadS");
        setField(term60784, term60784.getClass(), "mtime", "mvfDtZNEHr");
        setField(term60784, term60784.getClass(), "size", term60835);
        setField(term60784, term60784.getClass(), "name", "bvSgmFUDOU");
        setField(term60784, term60784.getClass(), "perm", "XMHwbfiHRl");
        setField(term60784, term60784.getClass(), "type", enum167);
        setField(term60784, term60784.getClass(), "depth", term60885);
        setBooleanField(term60784, term60784.getClass(), "filesys", true);
        setBooleanField(term60784, term60784.getClass(), "symlinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFilesys", argTypes, term60784, args);
    }

};


