package zowe.client.sdk.zosvariables.model;

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
import static zowe.client.sdk.zosvariables.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SystemVariable_getDescription_12851304484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245;

    public SystemVariable_getDescription_12851304484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245 = newInstance(Class.forName("zowe.client.sdk.zosvariables.model.SystemVariable"));
        setField(term245, term245.getClass(), "name", "uuaPigETmJ");
        setField(term245, term245.getClass(), "value", "MxlszYVzRf");
        setField(term245, term245.getClass(), "description", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.model.SystemVariable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term245, args);
    }

};


