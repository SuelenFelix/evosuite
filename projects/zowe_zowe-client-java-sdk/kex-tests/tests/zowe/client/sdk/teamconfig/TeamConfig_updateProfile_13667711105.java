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
import java.util.LinkedHashMap;

public class TeamConfig_updateProfile_13667711105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6020;
     Object term6124;

    public TeamConfig_updateProfile_13667711105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6074 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6074, term6074.getClass(), "name", null);
        setField(term6074, term6074.getClass(), "properties", null);
        setField(term6074, term6074.getClass(), "profiles", null);
        Object term6075 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6075, term6075.getClass(), "name", null);
        setField(term6075, term6075.getClass(), "properties", null);
        setField(term6075, term6075.getClass(), "profiles", null);
        Object term6076 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6076, term6076.getClass(), "name", null);
        setField(term6076, term6076.getClass(), "properties", null);
        setField(term6076, term6076.getClass(), "profiles", null);
        Object term6077 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6077, term6077.getClass(), "name", null);
        setField(term6077, term6077.getClass(), "properties", null);
        setField(term6077, term6077.getClass(), "profiles", null);
        Object term6078 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term6078, term6078.getClass(), "name", null);
        setField(term6078, term6078.getClass(), "properties", null);
        setField(term6078, term6078.getClass(), "profiles", null);
        ArrayList term6072 = new ArrayList();
        ((ArrayList) term6072).add(term6074);
        ((ArrayList) term6072).add(term6075);
        ((ArrayList) term6072).add(term6076);
        ((ArrayList) term6072).add(term6077);
        ((ArrayList) term6072).add(term6078);
        Object term6095 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term6095, term6095.getClass(), "name", null);
        setField(term6095, term6095.getClass(), "type", null);
        setField(term6095, term6095.getClass(), "properties", null);
        setField(term6095, term6095.getClass(), "secure", null);
        Object term6096 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term6096, term6096.getClass(), "name", null);
        setField(term6096, term6096.getClass(), "type", null);
        setField(term6096, term6096.getClass(), "properties", null);
        setField(term6096, term6096.getClass(), "secure", null);
        Object term6097 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term6097, term6097.getClass(), "name", null);
        setField(term6097, term6097.getClass(), "type", null);
        setField(term6097, term6097.getClass(), "properties", null);
        setField(term6097, term6097.getClass(), "secure", null);
        Object term6098 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term6098, term6098.getClass(), "name", null);
        setField(term6098, term6098.getClass(), "type", null);
        setField(term6098, term6098.getClass(), "properties", null);
        setField(term6098, term6098.getClass(), "secure", null);
        Object term6099 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term6099, term6099.getClass(), "name", null);
        setField(term6099, term6099.getClass(), "type", null);
        setField(term6099, term6099.getClass(), "properties", null);
        setField(term6099, term6099.getClass(), "secure", null);
        ArrayList term6093 = new ArrayList();
        ((ArrayList) term6093).add(term6095);
        ((ArrayList) term6093).add(term6096);
        ((ArrayList) term6093).add(term6097);
        ((ArrayList) term6093).add(term6098);
        ((ArrayList) term6093).add(term6098);
        ((ArrayList) term6093).add(term6099);
        HashMap term6102 = new HashMap();
        Boolean term6110 = new Boolean(false);
        term6020 = newInstance(Class.forName("zowe.client.sdk.teamconfig.TeamConfig"));
        Object term6021 = newInstance(Class.forName("zowe.client.sdk.teamconfig.service.KeyTarService"));
        Object term6022 = newInstance(Class.forName("zowe.client.sdk.teamconfig.keytar.KeyTarConfig"));
        Object term6071 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer"));
        setField(term6020, term6020.getClass(), "teamConfigService", null);
        setField(term6021, term6021.getClass(), "keyTar", null);
        setField(term6020, term6020.getClass(), "keyTarService", term6021);
        setField(term6022, term6022.getClass(), "location", "GsWxOwXvSu");
        setField(term6022, term6022.getClass(), "userName", "bKBSncrMEZ");
        setField(term6022, term6022.getClass(), "password", "yeSXGqQExb");
        setField(term6022, term6022.getClass(), "storeName", "uXYcXVYJZM");
        setField(term6020, term6020.getClass(), "keyTarConfig", term6022);
        setField(term6071, term6071.getClass(), "partitions", term6072);
        setField(term6071, term6071.getClass(), "schema", "FiYYLuailz");
        setField(term6071, term6071.getClass(), "profiles", term6093);
        setField(term6071, term6071.getClass(), "defaults", term6102);
        setField(term6071, term6071.getClass(), "autoStore", term6110);
        setField(term6020, term6020.getClass(), "teamConfig", term6071);
        term6124 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.TeamConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = "vLTbaoAxBm";
        args[1] = term6124;
        callMethod(klass, "updateProfile", argTypes, term6020, args);
    }

};


