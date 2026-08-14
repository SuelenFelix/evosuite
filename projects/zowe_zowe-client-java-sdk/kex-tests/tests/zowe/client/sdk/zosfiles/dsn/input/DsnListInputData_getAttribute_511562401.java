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

public class DsnListInputData_getAttribute_511562401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22682;

    public DsnListInputData_getAttribute_511562401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22774 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term22773 = ((Class) term22774).getDeclaredField((String) "BASE");
        ((Field) term22773).setAccessible(true);
        Object enum21 = ((Field) term22773).get((Object) null);
        term22682 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term22682, term22682.getClass(), "volume", "YQwoogpPyi");
        setField(term22682, term22682.getClass(), "attribute", enum21);
        setField(term22682, term22682.getClass(), "maxLength", "rnPhHoorxj");
        setField(term22682, term22682.getClass(), "start", "GuwJLKquuI");
        setField(term22682, term22682.getClass(), "recall", "vYMCjgnztg");
        setField(term22682, term22682.getClass(), "pattern", "YupgKTSEiI");
        setField(term22682, term22682.getClass(), "responseTimeout", "HuOUlaFmvJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttribute", argTypes, term22682, args);
    }

};


