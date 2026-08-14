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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class ConfigContainer_getDefaults_20928721412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1204;

    public ConfigContainer_getDefaults_20928721412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1205 = new ArrayList();
        HashMap term1226 = new HashMap();
        ArrayList term1231 = new ArrayList();
        ((ArrayList) term1231).add((Object)null);
        ((ArrayList) term1231).add((Object)null);
        Object term1223 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1223, term1223.getClass(), "name", "");
        setField(term1223, term1223.getClass(), "type", "");
        setField(term1223, term1223.getClass(), "properties", term1226);
        setField(term1223, term1223.getClass(), "secure", term1231);
        HashMap term1237 = new HashMap();
        ArrayList term1242 = new ArrayList();
        ((ArrayList) term1242).add((Object)null);
        Object term1234 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1234, term1234.getClass(), "name", "");
        setField(term1234, term1234.getClass(), "type", "");
        setField(term1234, term1234.getClass(), "properties", term1237);
        setField(term1234, term1234.getClass(), "secure", term1242);
        HashMap term1248 = new HashMap();
        ArrayList term1253 = new ArrayList();
        ((ArrayList) term1253).add((Object)null);
        ((ArrayList) term1253).add((Object)null);
        ((ArrayList) term1253).add((Object)null);
        ((ArrayList) term1253).add((Object)null);
        ((ArrayList) term1253).add((Object)null);
        ((ArrayList) term1253).add((Object)null);
        Object term1245 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1245, term1245.getClass(), "name", "");
        setField(term1245, term1245.getClass(), "type", "");
        setField(term1245, term1245.getClass(), "properties", term1248);
        setField(term1245, term1245.getClass(), "secure", term1253);
        HashMap term1259 = new HashMap();
        ArrayList term1264 = new ArrayList();
        ((ArrayList) term1264).add((Object)null);
        Object term1256 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1256, term1256.getClass(), "name", "");
        setField(term1256, term1256.getClass(), "type", "");
        setField(term1256, term1256.getClass(), "properties", term1259);
        setField(term1256, term1256.getClass(), "secure", term1264);
        HashMap term1270 = new HashMap();
        ArrayList term1275 = new ArrayList();
        ((ArrayList) term1275).add((Object)null);
        ((ArrayList) term1275).add((Object)null);
        ((ArrayList) term1275).add((Object)null);
        ((ArrayList) term1275).add((Object)null);
        ((ArrayList) term1275).add((Object)null);
        ((ArrayList) term1275).add((Object)null);
        ((ArrayList) term1275).add((Object)null);
        Object term1267 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1267, term1267.getClass(), "name", "");
        setField(term1267, term1267.getClass(), "type", "");
        setField(term1267, term1267.getClass(), "properties", term1270);
        setField(term1267, term1267.getClass(), "secure", term1275);
        HashMap term1281 = new HashMap();
        ArrayList term1286 = new ArrayList();
        ((ArrayList) term1286).add((Object)null);
        ((ArrayList) term1286).add((Object)null);
        ((ArrayList) term1286).add((Object)null);
        ((ArrayList) term1286).add((Object)null);
        ((ArrayList) term1286).add((Object)null);
        ((ArrayList) term1286).add((Object)null);
        ((ArrayList) term1286).add((Object)null);
        Object term1278 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1278, term1278.getClass(), "name", "");
        setField(term1278, term1278.getClass(), "type", "");
        setField(term1278, term1278.getClass(), "properties", term1281);
        setField(term1278, term1278.getClass(), "secure", term1286);
        HashMap term1292 = new HashMap();
        ArrayList term1297 = new ArrayList();
        ((ArrayList) term1297).add((Object)null);
        Object term1289 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1289, term1289.getClass(), "name", "");
        setField(term1289, term1289.getClass(), "type", "");
        setField(term1289, term1289.getClass(), "properties", term1292);
        setField(term1289, term1289.getClass(), "secure", term1297);
        ArrayList term1221 = new ArrayList();
        ((ArrayList) term1221).add(term1223);
        ((ArrayList) term1221).add(term1234);
        ((ArrayList) term1221).add(term1245);
        ((ArrayList) term1221).add(term1256);
        ((ArrayList) term1221).add(term1267);
        ((ArrayList) term1221).add(term1278);
        ((ArrayList) term1221).add(term1289);
        HashMap term1302 = new HashMap();
        Boolean term1312 = new Boolean(false);
        term1204 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer"));
        setField(term1204, term1204.getClass(), "partitions", term1205);
        setField(term1204, term1204.getClass(), "schema", "FjOiNAfBOc");
        setField(term1204, term1204.getClass(), "profiles", term1221);
        setField(term1204, term1204.getClass(), "defaults", term1302);
        setField(term1204, term1204.getClass(), "autoStore", term1312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaults", argTypes, term1204, args);
    }

};


