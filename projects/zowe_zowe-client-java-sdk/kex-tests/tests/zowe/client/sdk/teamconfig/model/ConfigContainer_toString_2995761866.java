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

public class ConfigContainer_toString_2995761866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1766;

    public ConfigContainer_toString_2995761866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1771 = new HashMap();
        ArrayList term1776 = new ArrayList();
        ((ArrayList) term1776).add((Object)null);
        ((ArrayList) term1776).add((Object)null);
        ((ArrayList) term1776).add((Object)null);
        ((ArrayList) term1776).add((Object)null);
        ((ArrayList) term1776).add((Object)null);
        ((ArrayList) term1776).add((Object)null);
        ((ArrayList) term1776).add((Object)null);
        ((ArrayList) term1776).add((Object)null);
        ((ArrayList) term1776).add((Object)null);
        Object term1769 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1769, term1769.getClass(), "name", "");
        setField(term1769, term1769.getClass(), "properties", term1771);
        setField(term1769, term1769.getClass(), "profiles", term1776);
        HashMap term1781 = new HashMap();
        ArrayList term1786 = new ArrayList();
        ((ArrayList) term1786).add((Object)null);
        ((ArrayList) term1786).add((Object)null);
        ((ArrayList) term1786).add((Object)null);
        ((ArrayList) term1786).add((Object)null);
        ((ArrayList) term1786).add((Object)null);
        ((ArrayList) term1786).add((Object)null);
        ((ArrayList) term1786).add((Object)null);
        ((ArrayList) term1786).add((Object)null);
        ((ArrayList) term1786).add((Object)null);
        Object term1779 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1779, term1779.getClass(), "name", "");
        setField(term1779, term1779.getClass(), "properties", term1781);
        setField(term1779, term1779.getClass(), "profiles", term1786);
        HashMap term1791 = new HashMap();
        ArrayList term1796 = new ArrayList();
        ((ArrayList) term1796).add((Object)null);
        ((ArrayList) term1796).add((Object)null);
        ((ArrayList) term1796).add((Object)null);
        ((ArrayList) term1796).add((Object)null);
        ((ArrayList) term1796).add((Object)null);
        ((ArrayList) term1796).add((Object)null);
        Object term1789 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1789, term1789.getClass(), "name", "");
        setField(term1789, term1789.getClass(), "properties", term1791);
        setField(term1789, term1789.getClass(), "profiles", term1796);
        HashMap term1801 = new HashMap();
        ArrayList term1806 = new ArrayList();
        ((ArrayList) term1806).add((Object)null);
        ((ArrayList) term1806).add((Object)null);
        ((ArrayList) term1806).add((Object)null);
        ((ArrayList) term1806).add((Object)null);
        ((ArrayList) term1806).add((Object)null);
        ((ArrayList) term1806).add((Object)null);
        ((ArrayList) term1806).add((Object)null);
        ((ArrayList) term1806).add((Object)null);
        ((ArrayList) term1806).add((Object)null);
        Object term1799 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1799, term1799.getClass(), "name", "");
        setField(term1799, term1799.getClass(), "properties", term1801);
        setField(term1799, term1799.getClass(), "profiles", term1806);
        HashMap term1811 = new HashMap();
        ArrayList term1816 = new ArrayList();
        ((ArrayList) term1816).add((Object)null);
        ((ArrayList) term1816).add((Object)null);
        ((ArrayList) term1816).add((Object)null);
        ((ArrayList) term1816).add((Object)null);
        ((ArrayList) term1816).add((Object)null);
        ((ArrayList) term1816).add((Object)null);
        Object term1809 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1809, term1809.getClass(), "name", "");
        setField(term1809, term1809.getClass(), "properties", term1811);
        setField(term1809, term1809.getClass(), "profiles", term1816);
        HashMap term1821 = new HashMap();
        ArrayList term1826 = new ArrayList();
        ((ArrayList) term1826).add((Object)null);
        Object term1819 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term1819, term1819.getClass(), "name", "");
        setField(term1819, term1819.getClass(), "properties", term1821);
        setField(term1819, term1819.getClass(), "profiles", term1826);
        ArrayList term1767 = new ArrayList();
        ((ArrayList) term1767).add(term1769);
        ((ArrayList) term1767).add(term1779);
        ((ArrayList) term1767).add(term1789);
        ((ArrayList) term1767).add(term1799);
        ((ArrayList) term1767).add(term1809);
        ((ArrayList) term1767).add(term1819);
        HashMap term1848 = new HashMap();
        ArrayList term1853 = new ArrayList();
        ((ArrayList) term1853).add((Object)null);
        ((ArrayList) term1853).add((Object)null);
        ((ArrayList) term1853).add((Object)null);
        ((ArrayList) term1853).add((Object)null);
        Object term1845 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term1845, term1845.getClass(), "name", "");
        setField(term1845, term1845.getClass(), "type", "");
        setField(term1845, term1845.getClass(), "properties", term1848);
        setField(term1845, term1845.getClass(), "secure", term1853);
        ArrayList term1843 = new ArrayList();
        ((ArrayList) term1843).add(term1845);
        HashMap term1858 = new HashMap();
        Boolean term1868 = new Boolean(true);
        term1766 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer"));
        setField(term1766, term1766.getClass(), "partitions", term1767);
        setField(term1766, term1766.getClass(), "schema", "rnPhHoorxj");
        setField(term1766, term1766.getClass(), "profiles", term1843);
        setField(term1766, term1766.getClass(), "defaults", term1858);
        setField(term1766, term1766.getClass(), "autoStore", term1868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1766, args);
    }

};


