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

public class ConfigContainer_getProfiles_92237788111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1883;

    public ConfigContainer_getProfiles_92237788111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1883 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer"));
        setField(term1883, term1883.getClass(), "partitions", null);
        setField(term1883, term1883.getClass(), "schema", null);
        setField(term1883, term1883.getClass(), "profiles", null);
        setField(term1883, term1883.getClass(), "defaults", null);
        setField(term1883, term1883.getClass(), "autoStore", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfiles", argTypes, term1883, args);
    }

};


