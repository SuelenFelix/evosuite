package zowe.client.sdk.zosfiles.uss.methods;

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
import static zowe.client.sdk.zosfiles.uss.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class UssList_getFiles_9919045802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4814;
     Object term4815;

    public UssList_getFiles_9919045802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4814 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssList"));
        setField(term4814, term4814.getClass(), "connection", null);
        setField(term4814, term4814.getClass(), "request", null);
        Integer term4828 = new Integer(-1955890973);
        Integer term4866 = new Integer(-2038273078);
        Class<? extends Object> term5079 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term5078 = ((Class) term5079).getDeclaredField((String) "DIRECTORY");
        ((Field) term5078).setAccessible(true);
        Object enum11 = ((Field) term5078).get((Object) null);
        Integer term4908 = new Integer(1227103734);
        term4815 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term4815, term4815.getClass(), "path", "hoicvmsovO");
        setField(term4815, term4815.getClass(), "maxLength", term4828);
        setField(term4815, term4815.getClass(), "group", "eqJfYWRaEL");
        setField(term4815, term4815.getClass(), "user", "fhkbdRViHi");
        setField(term4815, term4815.getClass(), "mtime", "uWHnvSvaPl");
        setField(term4815, term4815.getClass(), "size", term4866);
        setField(term4815, term4815.getClass(), "name", "kBdSllIBVz");
        setField(term4815, term4815.getClass(), "perm", "TJmVBGfTML");
        setField(term4815, term4815.getClass(), "type", enum11);
        setField(term4815, term4815.getClass(), "depth", term4908);
        setBooleanField(term4815, term4815.getClass(), "filesys", true);
        setBooleanField(term4815, term4815.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Object[] args = new Object[1];
        args[0] = term4815;
        callMethod(klass, "getFiles", argTypes, term4814, args);
    }

};


