package zowe.client.sdk.teamconfig.model;

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
import static zowe.client.sdk.teamconfig.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Profile_toString_125610612811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term909;

    public Profile_toString_125610612811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term909 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term909, term909.getClass(), "name", null);
        setField(term909, term909.getClass(), "type", null);
        setField(term909, term909.getClass(), "properties", null);
        setField(term909, term909.getClass(), "secure", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.Profile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term909, args);
    }

};


