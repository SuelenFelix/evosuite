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

public class UssListInputData_getType_3107662029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59864;

    public UssListInputData_getType_3107662029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term59877 = new Integer(1270666529);
        Integer term59915 = new Integer(-1146679443);
        Class<? extends Object> term60028 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term60027 = ((Class) term60028).getDeclaredField((String) "FIFO_NAMED_PIPE");
        ((Field) term60027).setAccessible(true);
        Object enum165 = ((Field) term60027).get((Object) null);
        Integer term59963 = new Integer(-860131894);
        term59864 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term59864, term59864.getClass(), "path", "QpYltHAdyY");
        setField(term59864, term59864.getClass(), "maxLength", term59877);
        setField(term59864, term59864.getClass(), "group", "lbmSGBwIiV");
        setField(term59864, term59864.getClass(), "user", "DAxyHoTLzZ");
        setField(term59864, term59864.getClass(), "mtime", "fhZgTouhCC");
        setField(term59864, term59864.getClass(), "size", term59915);
        setField(term59864, term59864.getClass(), "name", "wrikqJwXvL");
        setField(term59864, term59864.getClass(), "perm", "UiWhvbypdr");
        setField(term59864, term59864.getClass(), "type", enum165);
        setField(term59864, term59864.getClass(), "depth", term59963);
        setBooleanField(term59864, term59864.getClass(), "filesys", false);
        setBooleanField(term59864, term59864.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term59864, args);
    }

};


