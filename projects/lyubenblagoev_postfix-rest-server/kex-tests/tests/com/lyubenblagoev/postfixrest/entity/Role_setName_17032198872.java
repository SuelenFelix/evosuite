package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class Role_setName_17032198872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5843;

    public Role_setName_17032198872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5863 = new ArrayList();
        ((ArrayList) term5863).add((Object)null);
        ((ArrayList) term5863).add((Object)null);
        Long term5866 = new Long(-1486519351300660432L);
        Object term5858 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term5861 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term5869 = newInstance(Class.forName("java.util.Date"));
        Object term5871 = newInstance(Class.forName("java.util.Date"));
        setField(term5858, term5858.getClass(), "email", "");
        setField(term5858, term5858.getClass(), "password", "");
        setIntField(term5861, term5861.getClass(), "modCount", 0);
        setField(term5858, term5858.getClass(), "devices", term5861);
        setField(term5858, term5858.getClass(), "roles", term5863);
        setField(term5858, term5858.getClass(), "id", term5866);
        setBooleanField(term5858, term5858.getClass(), "enabled", false);
        setLongField(term5869, term5869.getClass(), "fastTime", 1404569058247L);
        setField(term5869, term5869.getClass(), "cdate", null);
        setField(term5858, term5858.getClass(), "created", term5869);
        setLongField(term5871, term5871.getClass(), "fastTime", 1658420376731L);
        setField(term5871, term5871.getClass(), "cdate", null);
        setField(term5858, term5858.getClass(), "updated", term5871);
        ArrayList term5876 = new ArrayList();
        ((ArrayList) term5876).add((Object)null);
        ((ArrayList) term5876).add((Object)null);
        ((ArrayList) term5876).add((Object)null);
        ((ArrayList) term5876).add((Object)null);
        ((ArrayList) term5876).add((Object)null);
        Long term5879 = new Long(493557348274366095L);
        Object term5873 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term5882 = newInstance(Class.forName("java.util.Date"));
        Object term5884 = newInstance(Class.forName("java.util.Date"));
        setField(term5873, term5873.getClass(), "email", "");
        setField(term5873, term5873.getClass(), "password", "");
        setField(term5873, term5873.getClass(), "devices", term5861);
        setField(term5873, term5873.getClass(), "roles", term5876);
        setField(term5873, term5873.getClass(), "id", term5879);
        setBooleanField(term5873, term5873.getClass(), "enabled", true);
        setLongField(term5882, term5882.getClass(), "fastTime", 1677198471522L);
        setField(term5882, term5882.getClass(), "cdate", null);
        setField(term5873, term5873.getClass(), "created", term5882);
        setLongField(term5884, term5884.getClass(), "fastTime", 1308772851118L);
        setField(term5884, term5884.getClass(), "cdate", null);
        setField(term5873, term5873.getClass(), "updated", term5884);
        ArrayList term5889 = new ArrayList();
        ((ArrayList) term5889).add((Object)null);
        ((ArrayList) term5889).add((Object)null);
        ((ArrayList) term5889).add((Object)null);
        ((ArrayList) term5889).add((Object)null);
        Long term5892 = new Long(4947643967691976731L);
        Object term5886 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term5895 = newInstance(Class.forName("java.util.Date"));
        Object term5897 = newInstance(Class.forName("java.util.Date"));
        setField(term5886, term5886.getClass(), "email", "");
        setField(term5886, term5886.getClass(), "password", "");
        setField(term5886, term5886.getClass(), "devices", term5861);
        setField(term5886, term5886.getClass(), "roles", term5889);
        setField(term5886, term5886.getClass(), "id", term5892);
        setBooleanField(term5886, term5886.getClass(), "enabled", false);
        setLongField(term5895, term5895.getClass(), "fastTime", 1395127942374L);
        setField(term5895, term5895.getClass(), "cdate", null);
        setField(term5886, term5886.getClass(), "created", term5895);
        setLongField(term5897, term5897.getClass(), "fastTime", 1426727846699L);
        setField(term5897, term5897.getClass(), "cdate", null);
        setField(term5886, term5886.getClass(), "updated", term5897);
        ArrayList term5902 = new ArrayList();
        ((ArrayList) term5902).add((Object)null);
        ((ArrayList) term5902).add((Object)null);
        ((ArrayList) term5902).add((Object)null);
        ((ArrayList) term5902).add((Object)null);
        ((ArrayList) term5902).add((Object)null);
        ((ArrayList) term5902).add((Object)null);
        Long term5905 = new Long(8261619652909874476L);
        Object term5899 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term5908 = newInstance(Class.forName("java.util.Date"));
        Object term5910 = newInstance(Class.forName("java.util.Date"));
        setField(term5899, term5899.getClass(), "email", "");
        setField(term5899, term5899.getClass(), "password", "");
        setField(term5899, term5899.getClass(), "devices", term5861);
        setField(term5899, term5899.getClass(), "roles", term5902);
        setField(term5899, term5899.getClass(), "id", term5905);
        setBooleanField(term5899, term5899.getClass(), "enabled", true);
        setLongField(term5908, term5908.getClass(), "fastTime", 1323527464497L);
        setField(term5908, term5908.getClass(), "cdate", null);
        setField(term5899, term5899.getClass(), "created", term5908);
        setLongField(term5910, term5910.getClass(), "fastTime", 1661593993379L);
        setField(term5910, term5910.getClass(), "cdate", null);
        setField(term5899, term5899.getClass(), "updated", term5910);
        ArrayList term5915 = new ArrayList();
        ((ArrayList) term5915).add((Object)null);
        ((ArrayList) term5915).add((Object)null);
        ((ArrayList) term5915).add((Object)null);
        ((ArrayList) term5915).add((Object)null);
        Long term5918 = new Long(-590890905395927244L);
        Object term5912 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term5921 = newInstance(Class.forName("java.util.Date"));
        Object term5923 = newInstance(Class.forName("java.util.Date"));
        setField(term5912, term5912.getClass(), "email", "");
        setField(term5912, term5912.getClass(), "password", "");
        setField(term5912, term5912.getClass(), "devices", term5861);
        setField(term5912, term5912.getClass(), "roles", term5915);
        setField(term5912, term5912.getClass(), "id", term5918);
        setBooleanField(term5912, term5912.getClass(), "enabled", false);
        setLongField(term5921, term5921.getClass(), "fastTime", 1319659478725L);
        setField(term5921, term5921.getClass(), "cdate", null);
        setField(term5912, term5912.getClass(), "created", term5921);
        setLongField(term5923, term5923.getClass(), "fastTime", 1555818930692L);
        setField(term5923, term5923.getClass(), "cdate", null);
        setField(term5912, term5912.getClass(), "updated", term5923);
        ArrayList term5856 = new ArrayList();
        ((ArrayList) term5856).add(term5858);
        ((ArrayList) term5856).add(term5873);
        ((ArrayList) term5856).add(term5886);
        ((ArrayList) term5856).add(term5899);
        ((ArrayList) term5856).add(term5912);
        ((ArrayList) term5856).add(term5886);
        Long term5927 = new Long(4777103307547199454L);
        term5843 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        Object term5930 = newInstance(Class.forName("java.util.Date"));
        Object term5932 = newInstance(Class.forName("java.util.Date"));
        setField(term5843, term5843.getClass(), "name", "douzkltmiI");
        setField(term5843, term5843.getClass(), "users", term5856);
        setField(term5843, term5843.getClass(), "id", term5927);
        setBooleanField(term5843, term5843.getClass(), "enabled", false);
        setLongField(term5930, term5930.getClass(), "fastTime", 1847680683423L);
        setField(term5930, term5930.getClass(), "cdate", null);
        setField(term5843, term5843.getClass(), "created", term5930);
        setLongField(term5932, term5932.getClass(), "fastTime", 1386150521117L);
        setField(term5932, term5932.getClass(), "cdate", null);
        setField(term5843, term5843.getClass(), "updated", term5932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nsofCJqJOR";
        callMethod(klass, "setName", argTypes, term5843, args);
    }

};


