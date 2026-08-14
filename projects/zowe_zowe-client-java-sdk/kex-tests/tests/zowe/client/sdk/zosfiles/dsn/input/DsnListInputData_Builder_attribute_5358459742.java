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

public class DsnListInputData_Builder_attribute_5358459742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19077;
     Object enum13;

    public DsnListInputData_Builder_attribute_5358459742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19176 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term19175 = ((Class) term19176).getDeclaredField((String) "VOL");
        ((Field) term19175).setAccessible(true);
        Object enum12 = ((Field) term19175).get((Object) null);
        term19077 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder"));
        setField(term19077, term19077.getClass(), "volume", "gXFNBHJSey");
        setField(term19077, term19077.getClass(), "attribute", enum12);
        setField(term19077, term19077.getClass(), "maxLength", "wUcSfItZgv");
        setField(term19077, term19077.getClass(), "start", "rOfPCPHmtJ");
        setField(term19077, term19077.getClass(), "recall", "EnmiAvfpJv");
        setField(term19077, term19077.getClass(), "pattern", "AdYzLPMcwe");
        setField(term19077, term19077.getClass(), "responseTimeout", "FrTZLybkKk");
        Class<? extends Object> term19482 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term19481 = ((Class) term19482).getDeclaredField((String) "BASE");
        ((Field) term19481).setAccessible(true);
        enum13 = ((Field) term19481).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Object[] args = new Object[1];
        args[0] = enum13;
        callMethod(klass, "attribute", argTypes, term19077, args);
    }

};


