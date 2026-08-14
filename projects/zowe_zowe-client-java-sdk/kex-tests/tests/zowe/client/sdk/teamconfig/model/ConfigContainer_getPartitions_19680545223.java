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

public class ConfigContainer_getPartitions_19680545223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1324;

    public ConfigContainer_getPartitions_19680545223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1329 = new HashMap();
        ArrayList term1334 = new ArrayList();
        ((ArrayList) term1334).add((Object)null);
        Object term1327 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1327, term1327.getClass(), "name", "");
        setField(term1327, term1327.getClass(), "properties", term1329);
        setField(term1327, term1327.getClass(), "profiles", term1334);
        HashMap term1339 = new HashMap();
        ArrayList term1344 = new ArrayList();
        Object term1337 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1337, term1337.getClass(), "name", "");
        setField(term1337, term1337.getClass(), "properties", term1339);
        setField(term1337, term1337.getClass(), "profiles", term1344);
        HashMap term1349 = new HashMap();
        ArrayList term1354 = new ArrayList();
        ((ArrayList) term1354).add((Object)null);
        ((ArrayList) term1354).add((Object)null);
        ((ArrayList) term1354).add((Object)null);
        ((ArrayList) term1354).add((Object)null);
        Object term1347 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1347, term1347.getClass(), "name", "");
        setField(term1347, term1347.getClass(), "properties", term1349);
        setField(term1347, term1347.getClass(), "profiles", term1354);
        HashMap term1359 = new HashMap();
        ArrayList term1364 = new ArrayList();
        Object term1357 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1357, term1357.getClass(), "name", "");
        setField(term1357, term1357.getClass(), "properties", term1359);
        setField(term1357, term1357.getClass(), "profiles", term1364);
        HashMap term1369 = new HashMap();
        ArrayList term1374 = new ArrayList();
        ((ArrayList) term1374).add((Object)null);
        ((ArrayList) term1374).add((Object)null);
        ((ArrayList) term1374).add((Object)null);
        ((ArrayList) term1374).add((Object)null);
        ((ArrayList) term1374).add((Object)null);
        ((ArrayList) term1374).add((Object)null);
        ((ArrayList) term1374).add((Object)null);
        ((ArrayList) term1374).add((Object)null);
        ((ArrayList) term1374).add((Object)null);
        Object term1367 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1367, term1367.getClass(), "name", "");
        setField(term1367, term1367.getClass(), "properties", term1369);
        setField(term1367, term1367.getClass(), "profiles", term1374);
        ArrayList term1325 = new ArrayList();
        ((ArrayList) term1325).add(term1327);
        ((ArrayList) term1325).add(term1337);
        ((ArrayList) term1325).add(term1347);
        ((ArrayList) term1325).add(term1357);
        ((ArrayList) term1325).add(term1367);
        HashMap term1396 = new HashMap();
        ArrayList term1401 = new ArrayList();
        ((ArrayList) term1401).add((Object)null);
        ((ArrayList) term1401).add((Object)null);
        ((ArrayList) term1401).add((Object)null);
        ((ArrayList) term1401).add((Object)null);
        Object term1393 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1393, term1393.getClass(), "name", "");
        setField(term1393, term1393.getClass(), "type", "");
        setField(term1393, term1393.getClass(), "properties", term1396);
        setField(term1393, term1393.getClass(), "secure", term1401);
        HashMap term1407 = new HashMap();
        ArrayList term1412 = new ArrayList();
        Object term1404 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1404, term1404.getClass(), "name", "");
        setField(term1404, term1404.getClass(), "type", "");
        setField(term1404, term1404.getClass(), "properties", term1407);
        setField(term1404, term1404.getClass(), "secure", term1412);
        HashMap term1418 = new HashMap();
        ArrayList term1423 = new ArrayList();
        ((ArrayList) term1423).add((Object)null);
        ((ArrayList) term1423).add((Object)null);
        Object term1415 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1415, term1415.getClass(), "name", "");
        setField(term1415, term1415.getClass(), "type", "");
        setField(term1415, term1415.getClass(), "properties", term1418);
        setField(term1415, term1415.getClass(), "secure", term1423);
        HashMap term1429 = new HashMap();
        ArrayList term1434 = new ArrayList();
        Object term1426 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1426, term1426.getClass(), "name", "");
        setField(term1426, term1426.getClass(), "type", "");
        setField(term1426, term1426.getClass(), "properties", term1429);
        setField(term1426, term1426.getClass(), "secure", term1434);
        HashMap term1440 = new HashMap();
        ArrayList term1445 = new ArrayList();
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        Object term1437 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1437, term1437.getClass(), "name", "");
        setField(term1437, term1437.getClass(), "type", "");
        setField(term1437, term1437.getClass(), "properties", term1440);
        setField(term1437, term1437.getClass(), "secure", term1445);
        ArrayList term1391 = new ArrayList();
        ((ArrayList) term1391).add(term1393);
        ((ArrayList) term1391).add(term1404);
        ((ArrayList) term1391).add(term1404);
        ((ArrayList) term1391).add(term1415);
        ((ArrayList) term1391).add(term1426);
        ((ArrayList) term1391).add(term1426);
        ((ArrayList) term1391).add(term1437);
        ((ArrayList) term1391).add(term1415);
        ((ArrayList) term1391).add(term1426);
        HashMap term1450 = new HashMap();
        Boolean term1460 = new Boolean(false);
        term1324 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer"));
        setField(term1324, term1324.getClass(), "partitions", term1325);
        setField(term1324, term1324.getClass(), "schema", "NxgmYPzWCI");
        setField(term1324, term1324.getClass(), "profiles", term1391);
        setField(term1324, term1324.getClass(), "defaults", term1450);
        setField(term1324, term1324.getClass(), "autoStore", term1460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPartitions", argTypes, term1324, args);
    }

};


