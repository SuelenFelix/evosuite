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

public class UssListInputData_getGroup_1823110073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57144;

    public UssListInputData_getGroup_1823110073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term57157 = new Integer(806595993);
        Integer term57195 = new Integer(548228925);
        Class<? extends Object> term57306 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term57305 = ((Class) term57306).getDeclaredField((String) "SYMBOLIC_LINK");
        ((Field) term57305).setAccessible(true);
        Object enum159 = ((Field) term57305).get((Object) null);
        Integer term57241 = new Integer(-749861210);
        term57144 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term57144, term57144.getClass(), "path", "BtvAvsJSei");
        setField(term57144, term57144.getClass(), "maxLength", term57157);
        setField(term57144, term57144.getClass(), "group", "vqnBkkxoIa");
        setField(term57144, term57144.getClass(), "user", "bycpZjxXFn");
        setField(term57144, term57144.getClass(), "mtime", "jQWttOAiwL");
        setField(term57144, term57144.getClass(), "size", term57195);
        setField(term57144, term57144.getClass(), "name", "DzKFxEuEEC");
        setField(term57144, term57144.getClass(), "perm", "CAMnvfDLJL");
        setField(term57144, term57144.getClass(), "type", enum159);
        setField(term57144, term57144.getClass(), "depth", term57241);
        setBooleanField(term57144, term57144.getClass(), "filesys", true);
        setBooleanField(term57144, term57144.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroup", argTypes, term57144, args);
    }

};


