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

public class TeamConfig_getDefaultProfile_203304058610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6744;

    public TeamConfig_getDefaultProfile_203304058610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6744 = newInstance(Class.forName("zowe.client.sdk.teamconfig.TeamConfig"));
        setField(term6744, term6744.getClass(), "teamConfigService", null);
        setField(term6744, term6744.getClass(), "keyTarService", null);
        setField(term6744, term6744.getClass(), "keyTarConfig", null);
        setField(term6744, term6744.getClass(), "teamConfig", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.TeamConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getDefaultProfile", argTypes, term6744, args);
    }

};


