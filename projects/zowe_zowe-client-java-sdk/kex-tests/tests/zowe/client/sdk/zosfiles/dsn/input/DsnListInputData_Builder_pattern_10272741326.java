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

public class DsnListInputData_Builder_pattern_10272741326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21010;

    public DsnListInputData_Builder_pattern_10272741326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21113 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term21112 = ((Class) term21113).getDeclaredField((String) "VOL");
        ((Field) term21112).setAccessible(true);
        Object enum17 = ((Field) term21112).get((Object) null);
        term21010 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder"));
        setField(term21010, term21010.getClass(), "volume", "mxVLTgCwki");
        setField(term21010, term21010.getClass(), "attribute", enum17);
        setField(term21010, term21010.getClass(), "maxLength", "wCurppnDSA");
        setField(term21010, term21010.getClass(), "start", "JydxSNTMYt");
        setField(term21010, term21010.getClass(), "recall", "KpurAcrHYT");
        setField(term21010, term21010.getClass(), "pattern", "QjvDwgKJGz");
        setField(term21010, term21010.getClass(), "responseTimeout", "ngYxiXTZrk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YTxBqWRAlo";
        callMethod(klass, "pattern", argTypes, term21010, args);
    }

};


