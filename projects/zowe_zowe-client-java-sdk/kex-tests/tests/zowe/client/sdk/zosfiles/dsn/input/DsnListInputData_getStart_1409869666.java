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

public class DsnListInputData_getStart_1409869666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24694;

    public DsnListInputData_getStart_1409869666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24786 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term24785 = ((Class) term24786).getDeclaredField((String) "BASE");
        ((Field) term24785).setAccessible(true);
        Object enum26 = ((Field) term24785).get((Object) null);
        term24694 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term24694, term24694.getClass(), "volume", "AxfSZmaiyA");
        setField(term24694, term24694.getClass(), "attribute", enum26);
        setField(term24694, term24694.getClass(), "maxLength", "lBpveIKbea");
        setField(term24694, term24694.getClass(), "start", "uyLBVQYcOV");
        setField(term24694, term24694.getClass(), "recall", "PoTZjDuBHa");
        setField(term24694, term24694.getClass(), "pattern", "MIwvgVrhzP");
        setField(term24694, term24694.getClass(), "responseTimeout", "HcUUieXdep");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart", argTypes, term24694, args);
    }

};


