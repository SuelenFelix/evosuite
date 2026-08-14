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

public class UssListInputData_getMtime_12638340745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58048;

    public UssListInputData_getMtime_12638340745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term58061 = new Integer(-2131181468);
        Integer term58099 = new Integer(282916351);
        Class<? extends Object> term58206 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term58205 = ((Class) term58206).getDeclaredField((String) "DIRECTORY");
        ((Field) term58205).setAccessible(true);
        Object enum161 = ((Field) term58205).get((Object) null);
        Integer term58141 = new Integer(880977281);
        term58048 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term58048, term58048.getClass(), "path", "lQFkjJUPAR");
        setField(term58048, term58048.getClass(), "maxLength", term58061);
        setField(term58048, term58048.getClass(), "group", "BsuVlGUUjV");
        setField(term58048, term58048.getClass(), "user", "bHHjfDCntT");
        setField(term58048, term58048.getClass(), "mtime", "sEphiduvkv");
        setField(term58048, term58048.getClass(), "size", term58099);
        setField(term58048, term58048.getClass(), "name", "PbLgCSAHce");
        setField(term58048, term58048.getClass(), "perm", "NWldOLAbqk");
        setField(term58048, term58048.getClass(), "type", enum161);
        setField(term58048, term58048.getClass(), "depth", term58141);
        setBooleanField(term58048, term58048.getClass(), "filesys", false);
        setBooleanField(term58048, term58048.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMtime", argTypes, term58048, args);
    }

};


