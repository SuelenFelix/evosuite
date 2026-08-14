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

public class UssListInputData_getMaxLength_3686880892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56708;

    public UssListInputData_getMaxLength_3686880892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term56721 = new Integer(318591690);
        Integer term56759 = new Integer(-165587447);
        Class<? extends Object> term56866 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term56865 = ((Class) term56866).getDeclaredField((String) "DIRECTORY");
        ((Field) term56865).setAccessible(true);
        Object enum158 = ((Field) term56865).get((Object) null);
        Integer term56801 = new Integer(-1347358701);
        term56708 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term56708, term56708.getClass(), "path", "XtiurrVYKw");
        setField(term56708, term56708.getClass(), "maxLength", term56721);
        setField(term56708, term56708.getClass(), "group", "rsumfoDNHa");
        setField(term56708, term56708.getClass(), "user", "ceCWHUTQUM");
        setField(term56708, term56708.getClass(), "mtime", "LrqwfrKKtS");
        setField(term56708, term56708.getClass(), "size", term56759);
        setField(term56708, term56708.getClass(), "name", "ZUdnQXfzCI");
        setField(term56708, term56708.getClass(), "perm", "EULDrUNQvw");
        setField(term56708, term56708.getClass(), "type", enum158);
        setField(term56708, term56708.getClass(), "depth", term56801);
        setBooleanField(term56708, term56708.getClass(), "filesys", true);
        setBooleanField(term56708, term56708.getClass(), "symlinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLength", argTypes, term56708, args);
    }

};


