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

public class UssListInputData_getPath_4473252631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56248;

    public UssListInputData_getPath_4473252631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term56261 = new Integer(-1310015129);
        Integer term56299 = new Integer(-2104981311);
        Class<? extends Object> term56412 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term56411 = ((Class) term56412).getDeclaredField((String) "FIFO_NAMED_PIPE");
        ((Field) term56411).setAccessible(true);
        Object enum157 = ((Field) term56411).get((Object) null);
        Integer term56347 = new Integer(-571169753);
        term56248 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term56248, term56248.getClass(), "path", "CNqMxLvtcJ");
        setField(term56248, term56248.getClass(), "maxLength", term56261);
        setField(term56248, term56248.getClass(), "group", "ktbqerIaKW");
        setField(term56248, term56248.getClass(), "user", "VoghngXfsK");
        setField(term56248, term56248.getClass(), "mtime", "GbahCBMvct");
        setField(term56248, term56248.getClass(), "size", term56299);
        setField(term56248, term56248.getClass(), "name", "iiHBhsNFgk");
        setField(term56248, term56248.getClass(), "perm", "HknsTajwxJ");
        setField(term56248, term56248.getClass(), "type", enum157);
        setField(term56248, term56248.getClass(), "depth", term56347);
        setBooleanField(term56248, term56248.getClass(), "filesys", true);
        setBooleanField(term56248, term56248.getClass(), "symlinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term56248, args);
    }

};


