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

public class DsnListInputData_Builder_maxLength_13249900103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19740;

    public DsnListInputData_Builder_maxLength_13249900103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19843 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term19842 = ((Class) term19843).getDeclaredField((String) "VOL");
        ((Field) term19842).setAccessible(true);
        Object enum14 = ((Field) term19842).get((Object) null);
        term19740 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder"));
        setField(term19740, term19740.getClass(), "volume", "FlxVmiMYKP");
        setField(term19740, term19740.getClass(), "attribute", enum14);
        setField(term19740, term19740.getClass(), "maxLength", "fgOpAWlGYN");
        setField(term19740, term19740.getClass(), "start", "PNzNzzjSXM");
        setField(term19740, term19740.getClass(), "recall", "ktKcSZiuGM");
        setField(term19740, term19740.getClass(), "pattern", "PSOttyUeqv");
        setField(term19740, term19740.getClass(), "responseTimeout", "HmEvTlmzXo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BMMonTIZgJ";
        callMethod(klass, "maxLength", argTypes, term19740, args);
    }

};


