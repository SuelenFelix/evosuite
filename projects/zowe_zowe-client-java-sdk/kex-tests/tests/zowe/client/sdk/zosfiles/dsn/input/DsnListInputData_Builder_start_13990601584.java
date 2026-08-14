package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DsnListInputData_Builder_start_13990601584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20158;

    public DsnListInputData_Builder_start_13990601584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20264 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term20263 = ((Class) term20264).getDeclaredField((String) "MEMBER");
        ((Field) term20263).setAccessible(true);
        Object enum15 = ((Field) term20263).get((Object) null);
        term20158 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder"));
        setField(term20158, term20158.getClass(), "volume", "QXyFXBjFde");
        setField(term20158, term20158.getClass(), "attribute", enum15);
        setField(term20158, term20158.getClass(), "maxLength", "xVFgeyYxZS");
        setField(term20158, term20158.getClass(), "start", "iQiGTulJiH");
        setField(term20158, term20158.getClass(), "recall", "utCuuVCKqE");
        setField(term20158, term20158.getClass(), "pattern", "zSfoqzJbPT");
        setField(term20158, term20158.getClass(), "responseTimeout", "QUymMnsCIj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ikTtOgdVYS";
        callMethod(klass, "start", argTypes, term20158, args);
    }

};


