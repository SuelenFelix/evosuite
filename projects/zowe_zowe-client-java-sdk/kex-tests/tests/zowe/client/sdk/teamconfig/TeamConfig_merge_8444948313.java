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

public class TeamConfig_merge_8444948313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6747;

    public TeamConfig_merge_8444948313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6747 = newInstance(Class.forName("zowe.client.sdk.teamconfig.TeamConfig"));
        setField(term6747, term6747.getClass(), "teamConfigService", null);
        setField(term6747, term6747.getClass(), "keyTarService", null);
        setField(term6747, term6747.getClass(), "keyTarConfig", null);
        setField(term6747, term6747.getClass(), "teamConfig", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.TeamConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.teamconfig.model.Profile");
        argTypes[1] = Class.forName("zowe.client.sdk.teamconfig.model.Profile");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "merge", argTypes, term6747, args);
    }

};


