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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Boolean;

public class TeamConfig_config_15924014212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5530;

    public TeamConfig_config_15924014212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5584 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5584, term5584.getClass(), "name", null);
        setField(term5584, term5584.getClass(), "properties", null);
        setField(term5584, term5584.getClass(), "profiles", null);
        Object term5585 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term5585, term5585.getClass(), "name", null);
        setField(term5585, term5585.getClass(), "properties", null);
        setField(term5585, term5585.getClass(), "profiles", null);
        ArrayList term5582 = new ArrayList();
        ((ArrayList) term5582).add(term5584);
        ((ArrayList) term5582).add(term5585);
        Object term5602 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5602, term5602.getClass(), "name", null);
        setField(term5602, term5602.getClass(), "type", null);
        setField(term5602, term5602.getClass(), "properties", null);
        setField(term5602, term5602.getClass(), "secure", null);
        Object term5603 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5603, term5603.getClass(), "name", null);
        setField(term5603, term5603.getClass(), "type", null);
        setField(term5603, term5603.getClass(), "properties", null);
        setField(term5603, term5603.getClass(), "secure", null);
        Object term5604 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term5604, term5604.getClass(), "name", null);
        setField(term5604, term5604.getClass(), "type", null);
        setField(term5604, term5604.getClass(), "properties", null);
        setField(term5604, term5604.getClass(), "secure", null);
        ArrayList term5600 = new ArrayList();
        ((ArrayList) term5600).add(term5602);
        ((ArrayList) term5600).add(term5603);
        ((ArrayList) term5600).add(term5604);
        HashMap term5607 = new HashMap();
        Boolean term5615 = new Boolean(false);
        term5530 = newInstance(Class.forName("zowe.client.sdk.teamconfig.TeamConfig"));
        Object term5531 = newInstance(Class.forName("zowe.client.sdk.teamconfig.service.KeyTarService"));
        Object term5532 = newInstance(Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig"));
        Object term5581 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer"));
        setField(term5530, term5530.getClass(), "teamConfigService", null);
        setField(term5531, term5531.getClass(), "keyTar", null);
        setField(term5530, term5530.getClass(), "keyTarService", term5531);
        setField(term5532, term5532.getClass(), "location", "JqXGgAhZPl");
        setField(term5532, term5532.getClass(), "userName", "jiKYgYHqIS");
        setField(term5532, term5532.getClass(), "password", "DfISiziTgG");
        setField(term5532, term5532.getClass(), "storeName", "XqgfKFvPSD");
        setField(term5530, term5530.getClass(), "keyTarConfig", term5532);
        setField(term5581, term5581.getClass(), "partitions", term5582);
        setField(term5581, term5581.getClass(), "schema", "GgZWSjxjyE");
        setField(term5581, term5581.getClass(), "profiles", term5600);
        setField(term5581, term5581.getClass(), "defaults", term5607);
        setField(term5581, term5581.getClass(), "autoStore", term5615);
        setField(term5530, term5530.getClass(), "teamConfig", term5581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.TeamConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "config", argTypes, term5530, args);
    }

};


