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

public class UssListInputData_isSymlinks_18504952212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61252;

    public UssListInputData_isSymlinks_18504952212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term61265 = new Integer(-1692331299);
        Integer term61303 = new Integer(479531250);
        Class<? extends Object> term61414 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term61413 = ((Class) term61414).getDeclaredField((String) "SYMBOLIC_LINK");
        ((Field) term61413).setAccessible(true);
        Object enum168 = ((Field) term61413).get((Object) null);
        Integer term61349 = new Integer(1320570890);
        term61252 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term61252, term61252.getClass(), "path", "bucTnYicnp");
        setField(term61252, term61252.getClass(), "maxLength", term61265);
        setField(term61252, term61252.getClass(), "group", "EkgprvqZlM");
        setField(term61252, term61252.getClass(), "user", "fbnKvthhOz");
        setField(term61252, term61252.getClass(), "mtime", "PGfCDJTBek");
        setField(term61252, term61252.getClass(), "size", term61303);
        setField(term61252, term61252.getClass(), "name", "ZwjARhAtHC");
        setField(term61252, term61252.getClass(), "perm", "XXvscsYBWv");
        setField(term61252, term61252.getClass(), "type", enum168);
        setField(term61252, term61252.getClass(), "depth", term61349);
        setBooleanField(term61252, term61252.getClass(), "filesys", true);
        setBooleanField(term61252, term61252.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSymlinks", argTypes, term61252, args);
    }

};


