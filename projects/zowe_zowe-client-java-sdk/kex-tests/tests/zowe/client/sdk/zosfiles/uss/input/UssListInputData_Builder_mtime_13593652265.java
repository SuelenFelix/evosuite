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

public class UssListInputData_Builder_mtime_13593652265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42179;

    public UssListInputData_Builder_mtime_13593652265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term42192 = new Integer(-203030934);
        Integer term42230 = new Integer(-1179120542);
        Class<? extends Object> term42353 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term42352 = ((Class) term42353).getDeclaredField((String) "SYMBOLIC_LINK");
        ((Field) term42352).setAccessible(true);
        Object enum130 = ((Field) term42352).get((Object) null);
        Integer term42276 = new Integer(-73683645);
        term42179 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term42179, term42179.getClass(), "path", "nghfqDXyCG");
        setField(term42179, term42179.getClass(), "maxLength", term42192);
        setField(term42179, term42179.getClass(), "group", "WBAOTqErtm");
        setField(term42179, term42179.getClass(), "user", "PqtVXXZMqK");
        setField(term42179, term42179.getClass(), "mtime", "rYbtIDVdnd");
        setField(term42179, term42179.getClass(), "size", term42230);
        setField(term42179, term42179.getClass(), "name", "UKAReurpHG");
        setField(term42179, term42179.getClass(), "perm", "WVRMUmrljA");
        setField(term42179, term42179.getClass(), "type", enum130);
        setField(term42179, term42179.getClass(), "depth", term42276);
        setBooleanField(term42179, term42179.getClass(), "filesys", true);
        setBooleanField(term42179, term42179.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NTlKJDDWlk";
        callMethod(klass, "mtime", argTypes, term42179, args);
    }

};


