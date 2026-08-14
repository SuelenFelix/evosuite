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

public class UssListInputData_Builder_perm_5689273088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43537;

    public UssListInputData_Builder_perm_5689273088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term43550 = new Integer(679763016);
        Integer term43588 = new Integer(1962444399);
        Class<? extends Object> term43711 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term43710 = ((Class) term43711).getDeclaredField((String) "SYMBOLIC_LINK");
        ((Field) term43710).setAccessible(true);
        Object enum133 = ((Field) term43710).get((Object) null);
        Integer term43634 = new Integer(767834723);
        term43537 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term43537, term43537.getClass(), "path", "WVbxuoDBcn");
        setField(term43537, term43537.getClass(), "maxLength", term43550);
        setField(term43537, term43537.getClass(), "group", "pvDEABOxLt");
        setField(term43537, term43537.getClass(), "user", "beAMpkroCQ");
        setField(term43537, term43537.getClass(), "mtime", "uSUvKAyuvd");
        setField(term43537, term43537.getClass(), "size", term43588);
        setField(term43537, term43537.getClass(), "name", "onQLVONGuf");
        setField(term43537, term43537.getClass(), "perm", "SOrEHbcbmn");
        setField(term43537, term43537.getClass(), "type", enum133);
        setField(term43537, term43537.getClass(), "depth", term43634);
        setBooleanField(term43537, term43537.getClass(), "filesys", false);
        setBooleanField(term43537, term43537.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bnsyeQXFdu";
        callMethod(klass, "perm", argTypes, term43537, args);
    }

};


