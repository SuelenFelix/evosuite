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

public class User_removeDevice_11256686389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4054;
     Object term4128;

    public User_removeDevice_11256686389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4085 = new ArrayList();
        ((ArrayList) term4085).add((Object)null);
        ((ArrayList) term4085).add((Object)null);
        ((ArrayList) term4085).add((Object)null);
        ((ArrayList) term4085).add((Object)null);
        ((ArrayList) term4085).add((Object)null);
        ((ArrayList) term4085).add((Object)null);
        ((ArrayList) term4085).add((Object)null);
        ((ArrayList) term4085).add((Object)null);
        Long term4088 = new Long(185544001230120339L);
        Object term4083 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        Object term4091 = newInstance(Class.forName("java.util.Date"));
        Object term4093 = newInstance(Class.forName("java.util.Date"));
        setField(term4083, term4083.getClass(), "name", "");
        setField(term4083, term4083.getClass(), "users", term4085);
        setField(term4083, term4083.getClass(), "id", term4088);
        setBooleanField(term4083, term4083.getClass(), "enabled", true);
        setLongField(term4091, term4091.getClass(), "fastTime", 1498874198903L);
        setField(term4091, term4091.getClass(), "cdate", null);
        setField(term4083, term4083.getClass(), "created", term4091);
        setLongField(term4093, term4093.getClass(), "fastTime", 1624086760716L);
        setField(term4093, term4093.getClass(), "cdate", null);
        setField(term4083, term4083.getClass(), "updated", term4093);
        ArrayList term4097 = new ArrayList();
        ((ArrayList) term4097).add((Object)null);
        ((ArrayList) term4097).add((Object)null);
        ((ArrayList) term4097).add((Object)null);
        ((ArrayList) term4097).add((Object)null);
        ((ArrayList) term4097).add((Object)null);
        Long term4100 = new Long(3423155413133381764L);
        Object term4095 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        Object term4103 = newInstance(Class.forName("java.util.Date"));
        Object term4105 = newInstance(Class.forName("java.util.Date"));
        setField(term4095, term4095.getClass(), "name", "");
        setField(term4095, term4095.getClass(), "users", term4097);
        setField(term4095, term4095.getClass(), "id", term4100);
        setBooleanField(term4095, term4095.getClass(), "enabled", false);
        setLongField(term4103, term4103.getClass(), "fastTime", 1730158389728L);
        setField(term4103, term4103.getClass(), "cdate", null);
        setField(term4095, term4095.getClass(), "created", term4103);
        setLongField(term4105, term4105.getClass(), "fastTime", 1427083903522L);
        setField(term4105, term4105.getClass(), "cdate", null);
        setField(term4095, term4095.getClass(), "updated", term4105);
        ArrayList term4109 = new ArrayList();
        ((ArrayList) term4109).add((Object)null);
        ((ArrayList) term4109).add((Object)null);
        ((ArrayList) term4109).add((Object)null);
        ((ArrayList) term4109).add((Object)null);
        ((ArrayList) term4109).add((Object)null);
        ((ArrayList) term4109).add((Object)null);
        ((ArrayList) term4109).add((Object)null);
        Long term4112 = new Long(-1223573843683081410L);
        Object term4107 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        Object term4115 = newInstance(Class.forName("java.util.Date"));
        Object term4117 = newInstance(Class.forName("java.util.Date"));
        setField(term4107, term4107.getClass(), "name", "");
        setField(term4107, term4107.getClass(), "users", term4109);
        setField(term4107, term4107.getClass(), "id", term4112);
        setBooleanField(term4107, term4107.getClass(), "enabled", false);
        setLongField(term4115, term4115.getClass(), "fastTime", 1489209832550L);
        setField(term4115, term4115.getClass(), "cdate", null);
        setField(term4107, term4107.getClass(), "created", term4115);
        setLongField(term4117, term4117.getClass(), "fastTime", 1833133725157L);
        setField(term4117, term4117.getClass(), "cdate", null);
        setField(term4107, term4107.getClass(), "updated", term4117);
        ArrayList term4081 = new ArrayList();
        ((ArrayList) term4081).add(term4083);
        ((ArrayList) term4081).add(term4095);
        ((ArrayList) term4081).add(term4107);
        Long term4121 = new Long(4096288569907305445L);
        term4054 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term4079 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term4124 = newInstance(Class.forName("java.util.Date"));
        Object term4126 = newInstance(Class.forName("java.util.Date"));
        setField(term4054, term4054.getClass(), "email", "xVFgeyYxZS");
        setField(term4054, term4054.getClass(), "password", "iQiGTulJiH");
        setIntField(term4079, term4079.getClass(), "modCount", 0);
        setField(term4054, term4054.getClass(), "devices", term4079);
        setField(term4054, term4054.getClass(), "roles", term4081);
        setField(term4054, term4054.getClass(), "id", term4121);
        setBooleanField(term4054, term4054.getClass(), "enabled", true);
        setLongField(term4124, term4124.getClass(), "fastTime", 1738143558794L);
        setField(term4124, term4124.getClass(), "cdate", null);
        setField(term4054, term4054.getClass(), "created", term4124);
        setLongField(term4126, term4126.getClass(), "fastTime", 1274973892501L);
        setField(term4126, term4126.getClass(), "cdate", null);
        setField(term4054, term4054.getClass(), "updated", term4126);
        Long term4157 = new Long(2990264647913003810L);
        Object term4156 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term4156, term4156.getClass(), "name", null);
        setField(term4156, term4156.getClass(), "users", null);
        setField(term4156, term4156.getClass(), "id", term4157);
        setBooleanField(term4156, term4156.getClass(), "enabled", false);
        setField(term4156, term4156.getClass(), "created", null);
        setField(term4156, term4156.getClass(), "updated", null);
        Object term4160 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term4160, term4160.getClass(), "name", null);
        setField(term4160, term4160.getClass(), "users", null);
        setField(term4160, term4160.getClass(), "id", null);
        setBooleanField(term4160, term4160.getClass(), "enabled", false);
        setField(term4160, term4160.getClass(), "created", null);
        setField(term4160, term4160.getClass(), "updated", null);
        Long term4163 = new Long(-2614906266506360948L);
        Object term4162 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term4162, term4162.getClass(), "name", null);
        setField(term4162, term4162.getClass(), "users", null);
        setField(term4162, term4162.getClass(), "id", term4163);
        setBooleanField(term4162, term4162.getClass(), "enabled", false);
        setField(term4162, term4162.getClass(), "created", null);
        setField(term4162, term4162.getClass(), "updated", null);
        ArrayList term4154 = new ArrayList();
        ((ArrayList) term4154).add(term4156);
        ((ArrayList) term4154).add(term4160);
        ((ArrayList) term4154).add(term4162);
        Long term4168 = new Long(-2195794659127490022L);
        Long term4225 = new Long(6142089107139955834L);
        term4128 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term4129 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term4171 = newInstance(Class.forName("java.util.Date"));
        Object term4173 = newInstance(Class.forName("java.util.Date"));
        Object term4187 = newInstance(Class.forName("java.util.Date"));
        Object term4228 = newInstance(Class.forName("java.util.Date"));
        Object term4230 = newInstance(Class.forName("java.util.Date"));
        setField(term4129, term4129.getClass(), "email", "HUgzMgrpsK");
        setField(term4129, term4129.getClass(), "password", "ubaBUfLolu");
        setField(term4129, term4129.getClass(), "devices", term4079);
        setField(term4129, term4129.getClass(), "roles", term4154);
        setField(term4129, term4129.getClass(), "id", term4168);
        setBooleanField(term4129, term4129.getClass(), "enabled", true);
        setLongField(term4171, term4171.getClass(), "fastTime", 1652071222567L);
        setField(term4171, term4171.getClass(), "cdate", null);
        setField(term4129, term4129.getClass(), "created", term4171);
        setLongField(term4173, term4173.getClass(), "fastTime", 1574394047330L);
        setField(term4173, term4173.getClass(), "cdate", null);
        setField(term4129, term4129.getClass(), "updated", term4173);
        setField(term4128, term4128.getClass(), "user", term4129);
        setField(term4128, term4128.getClass(), "refreshToken", "eWnrMSbYbT");
        setLongField(term4187, term4187.getClass(), "fastTime", 1799305601257L);
        setField(term4187, term4187.getClass(), "cdate", null);
        setField(term4128, term4128.getClass(), "refreshTokenExpirationDate", term4187);
        setField(term4128, term4128.getClass(), "remoteAddress", "AjoFvDFyCY");
        setField(term4128, term4128.getClass(), "type", "OFTJwdPiTG");
        setField(term4128, term4128.getClass(), "os", "QiUprSEluR");
        setField(term4128, term4128.getClass(), "id", term4225);
        setBooleanField(term4128, term4128.getClass(), "enabled", false);
        setLongField(term4228, term4228.getClass(), "fastTime", 1731869376318L);
        setField(term4228, term4228.getClass(), "cdate", null);
        setField(term4128, term4128.getClass(), "created", term4228);
        setLongField(term4230, term4230.getClass(), "fastTime", 1598891337893L);
        setField(term4230, term4230.getClass(), "cdate", null);
        setField(term4128, term4128.getClass(), "updated", term4230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Object[] args = new Object[1];
        args[0] = term4128;
        callMethod(klass, "removeDevice", argTypes, term4054, args);
    }

};


