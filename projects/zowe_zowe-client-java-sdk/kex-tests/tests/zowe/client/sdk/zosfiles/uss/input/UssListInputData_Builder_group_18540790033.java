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

public class UssListInputData_Builder_group_18540790033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41251;

    public UssListInputData_Builder_group_18540790033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41264 = new Integer(-1007160944);
        Integer term41302 = new Integer(1135664017);
        Class<? extends Object> term41427 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term41426 = ((Class) term41427).getDeclaredField((String) "FIFO_NAMED_PIPE");
        ((Field) term41426).setAccessible(true);
        Object enum128 = ((Field) term41426).get((Object) null);
        Integer term41350 = new Integer(590364439);
        term41251 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term41251, term41251.getClass(), "path", "TwfWVQGiIj");
        setField(term41251, term41251.getClass(), "maxLength", term41264);
        setField(term41251, term41251.getClass(), "group", "gUvcueTURF");
        setField(term41251, term41251.getClass(), "user", "EwQBhZjCIT");
        setField(term41251, term41251.getClass(), "mtime", "aSkmSwTnEw");
        setField(term41251, term41251.getClass(), "size", term41302);
        setField(term41251, term41251.getClass(), "name", "xvkbvaEGYd");
        setField(term41251, term41251.getClass(), "perm", "HBGNxdNURv");
        setField(term41251, term41251.getClass(), "type", enum128);
        setField(term41251, term41251.getClass(), "depth", term41350);
        setBooleanField(term41251, term41251.getClass(), "filesys", false);
        setBooleanField(term41251, term41251.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mfCpTPPQQm";
        callMethod(klass, "group", argTypes, term41251, args);
    }

};


