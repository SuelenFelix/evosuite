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
import java.lang.Boolean;

public class UssListInputData_Builder_symlinks_209489422712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45379;
     Object term45476;

    public UssListInputData_Builder_symlinks_209489422712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45392 = new Integer(454281060);
        Integer term45430 = new Integer(-1786399638);
        Class<? extends Object> term45539 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term45538 = ((Class) term45539).getDeclaredField((String) "DIRECTORY");
        ((Field) term45538).setAccessible(true);
        Object enum137 = ((Field) term45538).get((Object) null);
        Integer term45472 = new Integer(2055867847);
        term45379 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term45379, term45379.getClass(), "path", "TtGbVmKcnX");
        setField(term45379, term45379.getClass(), "maxLength", term45392);
        setField(term45379, term45379.getClass(), "group", "GJVkUrCVdD");
        setField(term45379, term45379.getClass(), "user", "zNdorvdUgu");
        setField(term45379, term45379.getClass(), "mtime", "oPxuZbkYio");
        setField(term45379, term45379.getClass(), "size", term45430);
        setField(term45379, term45379.getClass(), "name", "vKitydDVnM");
        setField(term45379, term45379.getClass(), "perm", "urCiQnUFBM");
        setField(term45379, term45379.getClass(), "type", enum137);
        setField(term45379, term45379.getClass(), "depth", term45472);
        setBooleanField(term45379, term45379.getClass(), "filesys", false);
        setBooleanField(term45379, term45379.getClass(), "symlinks", false);
        term45476 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term45476;
        callMethod(klass, "symlinks", argTypes, term45379, args);
    }

};


