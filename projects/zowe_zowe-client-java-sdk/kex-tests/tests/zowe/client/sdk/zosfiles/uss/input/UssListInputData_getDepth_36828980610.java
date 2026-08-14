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

public class UssListInputData_getDepth_36828980610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60324;

    public UssListInputData_getDepth_36828980610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term60337 = new Integer(-1022990421);
        Integer term60375 = new Integer(1045547089);
        Class<? extends Object> term60488 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term60487 = ((Class) term60488).getDeclaredField((String) "FIFO_NAMED_PIPE");
        ((Field) term60487).setAccessible(true);
        Object enum166 = ((Field) term60487).get((Object) null);
        Integer term60423 = new Integer(-1122880881);
        term60324 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term60324, term60324.getClass(), "path", "CgleElJNje");
        setField(term60324, term60324.getClass(), "maxLength", term60337);
        setField(term60324, term60324.getClass(), "group", "ZrchvNGMtd");
        setField(term60324, term60324.getClass(), "user", "WaEcyVlcIx");
        setField(term60324, term60324.getClass(), "mtime", "ONcbPCQnHd");
        setField(term60324, term60324.getClass(), "size", term60375);
        setField(term60324, term60324.getClass(), "name", "AobDaplFLl");
        setField(term60324, term60324.getClass(), "perm", "pDkMNnAGgv");
        setField(term60324, term60324.getClass(), "type", enum166);
        setField(term60324, term60324.getClass(), "depth", term60423);
        setBooleanField(term60324, term60324.getClass(), "filesys", false);
        setBooleanField(term60324, term60324.getClass(), "symlinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDepth", argTypes, term60324, args);
    }

};


