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

public class UssListInputData_Builder_size_8109945306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42653;
     Object term42750;

    public UssListInputData_Builder_size_8109945306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term42666 = new Integer(-226514366);
        Integer term42704 = new Integer(1193880199);
        Class<? extends Object> term42813 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term42812 = ((Class) term42813).getDeclaredField((String) "DIRECTORY");
        ((Field) term42812).setAccessible(true);
        Object enum131 = ((Field) term42812).get((Object) null);
        Integer term42746 = new Integer(-1087774327);
        term42653 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term42653, term42653.getClass(), "path", "vOuMEpOQAg");
        setField(term42653, term42653.getClass(), "maxLength", term42666);
        setField(term42653, term42653.getClass(), "group", "SIODFGaQhr");
        setField(term42653, term42653.getClass(), "user", "qYzsiuXOgS");
        setField(term42653, term42653.getClass(), "mtime", "bxrCBbrrct");
        setField(term42653, term42653.getClass(), "size", term42704);
        setField(term42653, term42653.getClass(), "name", "CKWpJaaaxX");
        setField(term42653, term42653.getClass(), "perm", "UBRmXJmfrt");
        setField(term42653, term42653.getClass(), "type", enum131);
        setField(term42653, term42653.getClass(), "depth", term42746);
        setBooleanField(term42653, term42653.getClass(), "filesys", true);
        setBooleanField(term42653, term42653.getClass(), "symlinks", false);
        term42750 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term42750;
        callMethod(klass, "size", argTypes, term42653, args);
    }

};


