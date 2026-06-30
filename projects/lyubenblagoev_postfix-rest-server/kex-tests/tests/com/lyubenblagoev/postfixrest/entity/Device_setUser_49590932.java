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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class Device_setUser_49590932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761;
     Object term865;

    public Device_setUser_49590932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term792 = new Long(2120084523938730454L);
        Object term791 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term791, term791.getClass(), "name", null);
        setField(term791, term791.getClass(), "users", null);
        setField(term791, term791.getClass(), "id", term792);
        setBooleanField(term791, term791.getClass(), "enabled", true);
        setField(term791, term791.getClass(), "created", null);
        setField(term791, term791.getClass(), "updated", null);
        Long term796 = new Long(-2068172595987555756L);
        Object term795 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term795, term795.getClass(), "name", null);
        setField(term795, term795.getClass(), "users", null);
        setField(term795, term795.getClass(), "id", term796);
        setBooleanField(term795, term795.getClass(), "enabled", false);
        setField(term795, term795.getClass(), "created", null);
        setField(term795, term795.getClass(), "updated", null);
        ArrayList term789 = new ArrayList();
        ((ArrayList) term789).add(term791);
        ((ArrayList) term789).add(term795);
        ((ArrayList) term789).add(term795);
        Long term801 = new Long(-6292278961887936280L);
        Long term858 = new Long(-6645965768855543712L);
        term761 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term762 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term787 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term804 = newInstance(Class.forName("java.util.Date"));
        Object term806 = newInstance(Class.forName("java.util.Date"));
        Object term820 = newInstance(Class.forName("java.util.Date"));
        Object term861 = newInstance(Class.forName("java.util.Date"));
        Object term863 = newInstance(Class.forName("java.util.Date"));
        setField(term762, term762.getClass(), "email", "jDtqGUpnZN");
        setField(term762, term762.getClass(), "password", "nGKItKLYNC");
        setIntField(term787, term787.getClass(), "modCount", 0);
        setField(term762, term762.getClass(), "devices", term787);
        setField(term762, term762.getClass(), "roles", term789);
        setField(term762, term762.getClass(), "id", term801);
        setBooleanField(term762, term762.getClass(), "enabled", true);
        setLongField(term804, term804.getClass(), "fastTime", 1354735325477L);
        setField(term804, term804.getClass(), "cdate", null);
        setField(term762, term762.getClass(), "created", term804);
        setLongField(term806, term806.getClass(), "fastTime", 1415426053422L);
        setField(term806, term806.getClass(), "cdate", null);
        setField(term762, term762.getClass(), "updated", term806);
        setField(term761, term761.getClass(), "user", term762);
        setField(term761, term761.getClass(), "refreshToken", "HqBOwkVqjD");
        setLongField(term820, term820.getClass(), "fastTime", 1359786657069L);
        setField(term820, term820.getClass(), "cdate", null);
        setField(term761, term761.getClass(), "refreshTokenExpirationDate", term820);
        setField(term761, term761.getClass(), "remoteAddress", "MAcUBcBckh");
        setField(term761, term761.getClass(), "type", "oVgzLbrsFr");
        setField(term761, term761.getClass(), "os", "vQVyKLdtaz");
        setField(term761, term761.getClass(), "id", term858);
        setBooleanField(term761, term761.getClass(), "enabled", true);
        setLongField(term861, term861.getClass(), "fastTime", 1589746751309L);
        setField(term861, term861.getClass(), "cdate", null);
        setField(term761, term761.getClass(), "created", term861);
        setLongField(term863, term863.getClass(), "fastTime", 1291280367982L);
        setField(term863, term863.getClass(), "cdate", null);
        setField(term761, term761.getClass(), "updated", term863);
        ArrayList term894 = new ArrayList();
        ((ArrayList) term894).add((Object)null);
        ((ArrayList) term894).add((Object)null);
        ((ArrayList) term894).add((Object)null);
        ((ArrayList) term894).add((Object)null);
        ((ArrayList) term894).add((Object)null);
        ((ArrayList) term894).add((Object)null);
        Long term897 = new Long(-3838084482494604218L);
        Object term892 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        Object term900 = newInstance(Class.forName("java.util.Date"));
        Object term902 = newInstance(Class.forName("java.util.Date"));
        setField(term892, term892.getClass(), "name", "");
        setField(term892, term892.getClass(), "users", term894);
        setField(term892, term892.getClass(), "id", term897);
        setBooleanField(term892, term892.getClass(), "enabled", false);
        setLongField(term900, term900.getClass(), "fastTime", 1709178890088L);
        setField(term900, term900.getClass(), "cdate", null);
        setField(term892, term892.getClass(), "created", term900);
        setLongField(term902, term902.getClass(), "fastTime", 1644776129220L);
        setField(term902, term902.getClass(), "cdate", null);
        setField(term892, term892.getClass(), "updated", term902);
        ArrayList term906 = new ArrayList();
        ((ArrayList) term906).add((Object)null);
        ((ArrayList) term906).add((Object)null);
        ((ArrayList) term906).add((Object)null);
        ((ArrayList) term906).add((Object)null);
        ((ArrayList) term906).add((Object)null);
        ((ArrayList) term906).add((Object)null);
        ((ArrayList) term906).add((Object)null);
        ((ArrayList) term906).add((Object)null);
        Long term909 = new Long(-5788180182343976541L);
        Object term904 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        Object term912 = newInstance(Class.forName("java.util.Date"));
        Object term914 = newInstance(Class.forName("java.util.Date"));
        setField(term904, term904.getClass(), "name", "");
        setField(term904, term904.getClass(), "users", term906);
        setField(term904, term904.getClass(), "id", term909);
        setBooleanField(term904, term904.getClass(), "enabled", false);
        setLongField(term912, term912.getClass(), "fastTime", 1618594705278L);
        setField(term912, term912.getClass(), "cdate", null);
        setField(term904, term904.getClass(), "created", term912);
        setLongField(term914, term914.getClass(), "fastTime", 1584136591305L);
        setField(term914, term914.getClass(), "cdate", null);
        setField(term904, term904.getClass(), "updated", term914);
        ArrayList term890 = new ArrayList();
        ((ArrayList) term890).add(term892);
        ((ArrayList) term890).add(term904);
        Long term918 = new Long(3892018155439224435L);
        term865 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term921 = newInstance(Class.forName("java.util.Date"));
        Object term923 = newInstance(Class.forName("java.util.Date"));
        setField(term865, term865.getClass(), "email", "OWKQODBLzb");
        setField(term865, term865.getClass(), "password", "wGmYcqUkgE");
        setField(term865, term865.getClass(), "devices", term787);
        setField(term865, term865.getClass(), "roles", term890);
        setField(term865, term865.getClass(), "id", term918);
        setBooleanField(term865, term865.getClass(), "enabled", false);
        setLongField(term921, term921.getClass(), "fastTime", 1456374715658L);
        setField(term921, term921.getClass(), "cdate", null);
        setField(term865, term865.getClass(), "created", term921);
        setLongField(term923, term923.getClass(), "fastTime", 1340909568660L);
        setField(term923, term923.getClass(), "cdate", null);
        setField(term865, term865.getClass(), "updated", term923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.entity.User");
        Object[] args = new Object[1];
        args[0] = term865;
        callMethod(klass, "setUser", argTypes, term761, args);
    }

};


