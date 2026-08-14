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

public class UssListInputData_getName_5047949857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58944;

    public UssListInputData_getName_5047949857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term58957 = new Integer(-75206835);
        Integer term58995 = new Integer(-1618206977);
        Class<? extends Object> term59110 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term59109 = ((Class) term59110).getDeclaredField((String) "CHAR_SPECIAL_FILE");
        ((Field) term59109).setAccessible(true);
        Object enum163 = ((Field) term59109).get((Object) null);
        Integer term59045 = new Integer(-1747406163);
        term58944 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term58944, term58944.getClass(), "path", "coJPjrBZNe");
        setField(term58944, term58944.getClass(), "maxLength", term58957);
        setField(term58944, term58944.getClass(), "group", "vMsWjuPTnO");
        setField(term58944, term58944.getClass(), "user", "zHvfKaOstO");
        setField(term58944, term58944.getClass(), "mtime", "tOszriqETr");
        setField(term58944, term58944.getClass(), "size", term58995);
        setField(term58944, term58944.getClass(), "name", "ncSPTkhKjO");
        setField(term58944, term58944.getClass(), "perm", "jcWKHRWhyj");
        setField(term58944, term58944.getClass(), "type", enum163);
        setField(term58944, term58944.getClass(), "depth", term59045);
        setBooleanField(term58944, term58944.getClass(), "filesys", false);
        setBooleanField(term58944, term58944.getClass(), "symlinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term58944, args);
    }

};


