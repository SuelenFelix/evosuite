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

public class UssListInputData_Builder_user_7246198794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41733;

    public UssListInputData_Builder_user_7246198794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41746 = new Integer(865208305);
        Integer term41784 = new Integer(-1275173084);
        Class<? extends Object> term41900 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term41899 = ((Class) term41900).getDeclaredField((String) "SOCKET");
        ((Field) term41899).setAccessible(true);
        Object enum129 = ((Field) term41899).get((Object) null);
        Integer term41823 = new Integer(-244121226);
        term41733 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term41733, term41733.getClass(), "path", "OcJCIDNIXA");
        setField(term41733, term41733.getClass(), "maxLength", term41746);
        setField(term41733, term41733.getClass(), "group", "XfRABIFVEp");
        setField(term41733, term41733.getClass(), "user", "MHGKyEnwKc");
        setField(term41733, term41733.getClass(), "mtime", "ShIELyuULw");
        setField(term41733, term41733.getClass(), "size", term41784);
        setField(term41733, term41733.getClass(), "name", "IpQuOGMgmj");
        setField(term41733, term41733.getClass(), "perm", "pJbnHTYrxn");
        setField(term41733, term41733.getClass(), "type", enum129);
        setField(term41733, term41733.getClass(), "depth", term41823);
        setBooleanField(term41733, term41733.getClass(), "filesys", true);
        setBooleanField(term41733, term41733.getClass(), "symlinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iIRsCSYqXH";
        callMethod(klass, "user", argTypes, term41733, args);
    }

};


