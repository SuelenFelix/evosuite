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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class UssGetAclInputData_Builder_usecommas_6196806983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50811;
     Object term50839;

    public UssGetAclInputData_Builder_usecommas_6196806983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50842 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.GetAclType");
        Field term50841 = ((Class) term50842).getDeclaredField((String) "DIR");
        ((Field) term50841).setAccessible(true);
        Object enum147 = ((Field) term50841).get((Object) null);
        term50811 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder"));
        setField(term50811, term50811.getClass(), "type", enum147);
        setField(term50811, term50811.getClass(), "user", "OUeBWNTQDh");
        setBooleanField(term50811, term50811.getClass(), "usecommas", false);
        setBooleanField(term50811, term50811.getClass(), "suppressheader", true);
        setBooleanField(term50811, term50811.getClass(), "suppressbaseacl", false);
        term50839 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term50839;
        callMethod(klass, "usecommas", argTypes, term50811, args);
    }

};


