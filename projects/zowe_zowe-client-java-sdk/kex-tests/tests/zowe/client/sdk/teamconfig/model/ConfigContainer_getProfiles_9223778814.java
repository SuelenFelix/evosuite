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

public class ConfigContainer_getProfiles_9223778814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1472;

    public ConfigContainer_getProfiles_9223778814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1477 = new HashMap();
        ArrayList term1482 = new ArrayList();
        ((ArrayList) term1482).add((Object)null);
        ((ArrayList) term1482).add((Object)null);
        ((ArrayList) term1482).add((Object)null);
        ((ArrayList) term1482).add((Object)null);
        ((ArrayList) term1482).add((Object)null);
        ((ArrayList) term1482).add((Object)null);
        ((ArrayList) term1482).add((Object)null);
        Object term1475 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1475, term1475.getClass(), "name", "");
        setField(term1475, term1475.getClass(), "properties", term1477);
        setField(term1475, term1475.getClass(), "profiles", term1482);
        HashMap term1487 = new HashMap();
        ArrayList term1492 = new ArrayList();
        ((ArrayList) term1492).add((Object)null);
        Object term1485 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1485, term1485.getClass(), "name", "");
        setField(term1485, term1485.getClass(), "properties", term1487);
        setField(term1485, term1485.getClass(), "profiles", term1492);
        HashMap term1497 = new HashMap();
        ArrayList term1502 = new ArrayList();
        ((ArrayList) term1502).add((Object)null);
        ((ArrayList) term1502).add((Object)null);
        ((ArrayList) term1502).add((Object)null);
        ((ArrayList) term1502).add((Object)null);
        ((ArrayList) term1502).add((Object)null);
        Object term1495 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1495, term1495.getClass(), "name", "");
        setField(term1495, term1495.getClass(), "properties", term1497);
        setField(term1495, term1495.getClass(), "profiles", term1502);
        ArrayList term1473 = new ArrayList();
        ((ArrayList) term1473).add(term1475);
        ((ArrayList) term1473).add(term1485);
        ((ArrayList) term1473).add(term1495);
        HashMap term1524 = new HashMap();
        ArrayList term1529 = new ArrayList();
        ((ArrayList) term1529).add((Object)null);
        Object term1521 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1521, term1521.getClass(), "name", "");
        setField(term1521, term1521.getClass(), "type", "");
        setField(term1521, term1521.getClass(), "properties", term1524);
        setField(term1521, term1521.getClass(), "secure", term1529);
        HashMap term1535 = new HashMap();
        ArrayList term1540 = new ArrayList();
        ((ArrayList) term1540).add((Object)null);
        ((ArrayList) term1540).add((Object)null);
        ((ArrayList) term1540).add((Object)null);
        ((ArrayList) term1540).add((Object)null);
        ((ArrayList) term1540).add((Object)null);
        ((ArrayList) term1540).add((Object)null);
        ((ArrayList) term1540).add((Object)null);
        ((ArrayList) term1540).add((Object)null);
        Object term1532 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1532, term1532.getClass(), "name", "");
        setField(term1532, term1532.getClass(), "type", "");
        setField(term1532, term1532.getClass(), "properties", term1535);
        setField(term1532, term1532.getClass(), "secure", term1540);
        HashMap term1546 = new HashMap();
        ArrayList term1551 = new ArrayList();
        ((ArrayList) term1551).add((Object)null);
        ((ArrayList) term1551).add((Object)null);
        ((ArrayList) term1551).add((Object)null);
        ((ArrayList) term1551).add((Object)null);
        Object term1543 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1543, term1543.getClass(), "name", "");
        setField(term1543, term1543.getClass(), "type", "");
        setField(term1543, term1543.getClass(), "properties", term1546);
        setField(term1543, term1543.getClass(), "secure", term1551);
        HashMap term1557 = new HashMap();
        ArrayList term1562 = new ArrayList();
        Object term1554 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1554, term1554.getClass(), "name", "");
        setField(term1554, term1554.getClass(), "type", "");
        setField(term1554, term1554.getClass(), "properties", term1557);
        setField(term1554, term1554.getClass(), "secure", term1562);
        HashMap term1568 = new HashMap();
        ArrayList term1573 = new ArrayList();
        ((ArrayList) term1573).add((Object)null);
        ((ArrayList) term1573).add((Object)null);
        Object term1565 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1565, term1565.getClass(), "name", "");
        setField(term1565, term1565.getClass(), "type", "");
        setField(term1565, term1565.getClass(), "properties", term1568);
        setField(term1565, term1565.getClass(), "secure", term1573);
        HashMap term1579 = new HashMap();
        ArrayList term1584 = new ArrayList();
        ((ArrayList) term1584).add((Object)null);
        ((ArrayList) term1584).add((Object)null);
        ((ArrayList) term1584).add((Object)null);
        ((ArrayList) term1584).add((Object)null);
        ((ArrayList) term1584).add((Object)null);
        ((ArrayList) term1584).add((Object)null);
        ((ArrayList) term1584).add((Object)null);
        ((ArrayList) term1584).add((Object)null);
        Object term1576 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1576, term1576.getClass(), "name", "");
        setField(term1576, term1576.getClass(), "type", "");
        setField(term1576, term1576.getClass(), "properties", term1579);
        setField(term1576, term1576.getClass(), "secure", term1584);
        ArrayList term1519 = new ArrayList();
        ((ArrayList) term1519).add(term1521);
        ((ArrayList) term1519).add(term1532);
        ((ArrayList) term1519).add(term1543);
        ((ArrayList) term1519).add(term1543);
        ((ArrayList) term1519).add(term1554);
        ((ArrayList) term1519).add(term1565);
        ((ArrayList) term1519).add(term1565);
        ((ArrayList) term1519).add(term1576);
        HashMap term1589 = new HashMap();
        Boolean term1599 = new Boolean(true);
        term1472 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer"));
        setField(term1472, term1472.getClass(), "partitions", term1473);
        setField(term1472, term1472.getClass(), "schema", "NWldOLAbqk");
        setField(term1472, term1472.getClass(), "profiles", term1519);
        setField(term1472, term1472.getClass(), "defaults", term1589);
        setField(term1472, term1472.getClass(), "autoStore", term1599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfiles", argTypes, term1472, args);
    }

};


