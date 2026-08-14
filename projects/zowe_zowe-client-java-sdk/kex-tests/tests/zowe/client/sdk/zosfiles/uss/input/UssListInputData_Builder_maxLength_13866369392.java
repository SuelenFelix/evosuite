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

public class UssListInputData_Builder_maxLength_13866369392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40833;
     Object term40925;

    public UssListInputData_Builder_maxLength_13866369392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40846 = new Integer(-6029667);
        Integer term40884 = new Integer(-2068769794);
        Class<? extends Object> term40988 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term40987 = ((Class) term40988).getDeclaredField((String) "FILE");
        ((Field) term40987).setAccessible(true);
        Object enum127 = ((Field) term40987).get((Object) null);
        Integer term40921 = new Integer(-117576464);
        term40833 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term40833, term40833.getClass(), "path", "OIHoJeysUi");
        setField(term40833, term40833.getClass(), "maxLength", term40846);
        setField(term40833, term40833.getClass(), "group", "WXMWFDGcLB");
        setField(term40833, term40833.getClass(), "user", "wKWbJssZuG");
        setField(term40833, term40833.getClass(), "mtime", "NzBMMhkhpT");
        setField(term40833, term40833.getClass(), "size", term40884);
        setField(term40833, term40833.getClass(), "name", "qCpEbQDHdF");
        setField(term40833, term40833.getClass(), "perm", "AHbZyFOmlo");
        setField(term40833, term40833.getClass(), "type", enum127);
        setField(term40833, term40833.getClass(), "depth", term40921);
        setBooleanField(term40833, term40833.getClass(), "filesys", false);
        setBooleanField(term40833, term40833.getClass(), "symlinks", true);
        term40925 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term40925;
        callMethod(klass, "maxLength", argTypes, term40833, args);
    }

};


