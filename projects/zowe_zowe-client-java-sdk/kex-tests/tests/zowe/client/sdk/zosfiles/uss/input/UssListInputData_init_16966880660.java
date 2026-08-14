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

public class UssListInputData_init_16966880660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55832;

    public UssListInputData_init_16966880660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term55845 = new Integer(-426764678);
        Integer term55883 = new Integer(-1222614956);
        Class<? extends Object> term55985 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term55984 = ((Class) term55985).getDeclaredField((String) "FILE");
        ((Field) term55984).setAccessible(true);
        Object enum156 = ((Field) term55984).get((Object) null);
        Integer term55920 = new Integer(-1870495012);
        term55832 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term55832, term55832.getClass(), "path", "UxgSdhxPCH");
        setField(term55832, term55832.getClass(), "maxLength", term55845);
        setField(term55832, term55832.getClass(), "group", "DAujxZPHJC");
        setField(term55832, term55832.getClass(), "user", "IlBhdrCvHq");
        setField(term55832, term55832.getClass(), "mtime", "OirVUQhauU");
        setField(term55832, term55832.getClass(), "size", term55883);
        setField(term55832, term55832.getClass(), "name", "GLbyDfbNZI");
        setField(term55832, term55832.getClass(), "perm", "oNLcCYDAsO");
        setField(term55832, term55832.getClass(), "type", enum156);
        setField(term55832, term55832.getClass(), "depth", term55920);
        setBooleanField(term55832, term55832.getClass(), "filesys", false);
        setBooleanField(term55832, term55832.getClass(), "symlinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term55832;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


