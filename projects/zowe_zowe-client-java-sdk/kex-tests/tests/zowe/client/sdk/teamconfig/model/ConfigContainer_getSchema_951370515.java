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

public class ConfigContainer_getSchema_951370515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1611;

    public ConfigContainer_getSchema_951370515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1616 = new HashMap();
        ArrayList term1621 = new ArrayList();
        ((ArrayList) term1621).add((Object)null);
        ((ArrayList) term1621).add((Object)null);
        ((ArrayList) term1621).add((Object)null);
        ((ArrayList) term1621).add((Object)null);
        ((ArrayList) term1621).add((Object)null);
        ((ArrayList) term1621).add((Object)null);
        ((ArrayList) term1621).add((Object)null);
        Object term1614 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1614, term1614.getClass(), "name", "");
        setField(term1614, term1614.getClass(), "properties", term1616);
        setField(term1614, term1614.getClass(), "profiles", term1621);
        HashMap term1626 = new HashMap();
        ArrayList term1631 = new ArrayList();
        ((ArrayList) term1631).add((Object)null);
        ((ArrayList) term1631).add((Object)null);
        ((ArrayList) term1631).add((Object)null);
        ((ArrayList) term1631).add((Object)null);
        ((ArrayList) term1631).add((Object)null);
        Object term1624 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1624, term1624.getClass(), "name", "");
        setField(term1624, term1624.getClass(), "properties", term1626);
        setField(term1624, term1624.getClass(), "profiles", term1631);
        HashMap term1636 = new HashMap();
        ArrayList term1641 = new ArrayList();
        ((ArrayList) term1641).add((Object)null);
        ((ArrayList) term1641).add((Object)null);
        Object term1634 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1634, term1634.getClass(), "name", "");
        setField(term1634, term1634.getClass(), "properties", term1636);
        setField(term1634, term1634.getClass(), "profiles", term1641);
        HashMap term1646 = new HashMap();
        ArrayList term1651 = new ArrayList();
        ((ArrayList) term1651).add((Object)null);
        ((ArrayList) term1651).add((Object)null);
        Object term1644 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1644, term1644.getClass(), "name", "");
        setField(term1644, term1644.getClass(), "properties", term1646);
        setField(term1644, term1644.getClass(), "profiles", term1651);
        HashMap term1656 = new HashMap();
        ArrayList term1661 = new ArrayList();
        ((ArrayList) term1661).add((Object)null);
        ((ArrayList) term1661).add((Object)null);
        ((ArrayList) term1661).add((Object)null);
        ((ArrayList) term1661).add((Object)null);
        ((ArrayList) term1661).add((Object)null);
        Object term1654 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1654, term1654.getClass(), "name", "");
        setField(term1654, term1654.getClass(), "properties", term1656);
        setField(term1654, term1654.getClass(), "profiles", term1661);
        HashMap term1666 = new HashMap();
        ArrayList term1671 = new ArrayList();
        Object term1664 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1664, term1664.getClass(), "name", "");
        setField(term1664, term1664.getClass(), "properties", term1666);
        setField(term1664, term1664.getClass(), "profiles", term1671);
        HashMap term1676 = new HashMap();
        ArrayList term1681 = new ArrayList();
        ((ArrayList) term1681).add((Object)null);
        Object term1674 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1674, term1674.getClass(), "name", "");
        setField(term1674, term1674.getClass(), "properties", term1676);
        setField(term1674, term1674.getClass(), "profiles", term1681);
        HashMap term1686 = new HashMap();
        ArrayList term1691 = new ArrayList();
        ((ArrayList) term1691).add((Object)null);
        ((ArrayList) term1691).add((Object)null);
        ((ArrayList) term1691).add((Object)null);
        ((ArrayList) term1691).add((Object)null);
        ((ArrayList) term1691).add((Object)null);
        Object term1684 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1684, term1684.getClass(), "name", "");
        setField(term1684, term1684.getClass(), "properties", term1686);
        setField(term1684, term1684.getClass(), "profiles", term1691);
        HashMap term1696 = new HashMap();
        ArrayList term1701 = new ArrayList();
        ((ArrayList) term1701).add((Object)null);
        ((ArrayList) term1701).add((Object)null);
        ((ArrayList) term1701).add((Object)null);
        ((ArrayList) term1701).add((Object)null);
        ((ArrayList) term1701).add((Object)null);
        ((ArrayList) term1701).add((Object)null);
        Object term1694 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1694, term1694.getClass(), "name", "");
        setField(term1694, term1694.getClass(), "properties", term1696);
        setField(term1694, term1694.getClass(), "profiles", term1701);
        ArrayList term1612 = new ArrayList();
        ((ArrayList) term1612).add(term1614);
        ((ArrayList) term1612).add(term1624);
        ((ArrayList) term1612).add(term1634);
        ((ArrayList) term1612).add(term1644);
        ((ArrayList) term1612).add(term1654);
        ((ArrayList) term1612).add(term1664);
        ((ArrayList) term1612).add(term1674);
        ((ArrayList) term1612).add(term1684);
        ((ArrayList) term1612).add(term1694);
        HashMap term1723 = new HashMap();
        ArrayList term1728 = new ArrayList();
        ((ArrayList) term1728).add((Object)null);
        ((ArrayList) term1728).add((Object)null);
        ((ArrayList) term1728).add((Object)null);
        ((ArrayList) term1728).add((Object)null);
        ((ArrayList) term1728).add((Object)null);
        ((ArrayList) term1728).add((Object)null);
        ((ArrayList) term1728).add((Object)null);
        ((ArrayList) term1728).add((Object)null);
        Object term1720 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1720, term1720.getClass(), "name", "");
        setField(term1720, term1720.getClass(), "type", "");
        setField(term1720, term1720.getClass(), "properties", term1723);
        setField(term1720, term1720.getClass(), "secure", term1728);
        HashMap term1734 = new HashMap();
        ArrayList term1739 = new ArrayList();
        ((ArrayList) term1739).add((Object)null);
        ((ArrayList) term1739).add((Object)null);
        ((ArrayList) term1739).add((Object)null);
        ((ArrayList) term1739).add((Object)null);
        ((ArrayList) term1739).add((Object)null);
        ((ArrayList) term1739).add((Object)null);
        ((ArrayList) term1739).add((Object)null);
        Object term1731 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1731, term1731.getClass(), "name", "");
        setField(term1731, term1731.getClass(), "type", "");
        setField(term1731, term1731.getClass(), "properties", term1734);
        setField(term1731, term1731.getClass(), "secure", term1739);
        ArrayList term1718 = new ArrayList();
        ((ArrayList) term1718).add(term1720);
        ((ArrayList) term1718).add(term1720);
        ((ArrayList) term1718).add(term1731);
        HashMap term1744 = new HashMap();
        Boolean term1754 = new Boolean(true);
        term1611 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer"));
        setField(term1611, term1611.getClass(), "partitions", term1612);
        setField(term1611, term1611.getClass(), "schema", "TGiJfagfky");
        setField(term1611, term1611.getClass(), "profiles", term1718);
        setField(term1611, term1611.getClass(), "defaults", term1744);
        setField(term1611, term1611.getClass(), "autoStore", term1754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSchema", argTypes, term1611, args);
    }

};


