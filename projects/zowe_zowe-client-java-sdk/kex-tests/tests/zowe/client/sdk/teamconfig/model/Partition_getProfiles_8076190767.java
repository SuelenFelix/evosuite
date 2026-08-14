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

public class Partition_getProfiles_8076190767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3691;

    public Partition_getProfiles_8076190767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3691 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term3691, term3691.getClass(), "name", null);
        setField(term3691, term3691.getClass(), "properties", null);
        setField(term3691, term3691.getClass(), "profiles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.Partition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfiles", argTypes, term3691, args);
    }

};


