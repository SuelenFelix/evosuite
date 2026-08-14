package zowe.client.sdk.teamconfig;

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
import static zowe.client.sdk.teamconfig.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TeamConfig_getDefaultProfileFromPartition_21141735911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6745;

    public TeamConfig_getDefaultProfileFromPartition_21141735911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6745 = newInstance(Class.forName("zowe.client.sdk.teamconfig.TeamConfig"));
        setField(term6745, term6745.getClass(), "teamConfigService", null);
        setField(term6745, term6745.getClass(), "keyTarService", null);
        setField(term6745, term6745.getClass(), "keyTarConfig", null);
        setField(term6745, term6745.getClass(), "teamConfig", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.TeamConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getDefaultProfileFromPartition", argTypes, term6745, args);
    }

};


