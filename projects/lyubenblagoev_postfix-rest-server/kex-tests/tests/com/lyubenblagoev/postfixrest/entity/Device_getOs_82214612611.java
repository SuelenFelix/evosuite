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

public class Device_getOs_82214612611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2409;

    public Device_getOs_82214612611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2440 = new Long(4795660804170399986L);
        Object term2439 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2439, term2439.getClass(), "name", null);
        setField(term2439, term2439.getClass(), "users", null);
        setField(term2439, term2439.getClass(), "id", term2440);
        setBooleanField(term2439, term2439.getClass(), "enabled", false);
        setField(term2439, term2439.getClass(), "created", null);
        setField(term2439, term2439.getClass(), "updated", null);
        Object term2443 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2443, term2443.getClass(), "name", null);
        setField(term2443, term2443.getClass(), "users", null);
        setField(term2443, term2443.getClass(), "id", null);
        setBooleanField(term2443, term2443.getClass(), "enabled", false);
        setField(term2443, term2443.getClass(), "created", null);
        setField(term2443, term2443.getClass(), "updated", null);
        Long term2446 = new Long(3090901538358721367L);
        Object term2445 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2445, term2445.getClass(), "name", null);
        setField(term2445, term2445.getClass(), "users", null);
        setField(term2445, term2445.getClass(), "id", term2446);
        setBooleanField(term2445, term2445.getClass(), "enabled", false);
        setField(term2445, term2445.getClass(), "created", null);
        setField(term2445, term2445.getClass(), "updated", null);
        Object term2449 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2449, term2449.getClass(), "name", null);
        setField(term2449, term2449.getClass(), "users", null);
        setField(term2449, term2449.getClass(), "id", null);
        setBooleanField(term2449, term2449.getClass(), "enabled", false);
        setField(term2449, term2449.getClass(), "created", null);
        setField(term2449, term2449.getClass(), "updated", null);
        Object term2451 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2451, term2451.getClass(), "name", null);
        setField(term2451, term2451.getClass(), "users", null);
        setField(term2451, term2451.getClass(), "id", null);
        setBooleanField(term2451, term2451.getClass(), "enabled", false);
        setField(term2451, term2451.getClass(), "created", null);
        setField(term2451, term2451.getClass(), "updated", null);
        ArrayList term2437 = new ArrayList();
        ((ArrayList) term2437).add(term2439);
        ((ArrayList) term2437).add(term2443);
        ((ArrayList) term2437).add(term2445);
        ((ArrayList) term2437).add(term2449);
        ((ArrayList) term2437).add(term2451);
        ((ArrayList) term2437).add(term2445);
        Long term2455 = new Long(-4030863184426321096L);
        Long term2512 = new Long(-8010214112439224349L);
        term2409 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term2410 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term2435 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term2458 = newInstance(Class.forName("java.util.Date"));
        Object term2460 = newInstance(Class.forName("java.util.Date"));
        Object term2474 = newInstance(Class.forName("java.util.Date"));
        Object term2515 = newInstance(Class.forName("java.util.Date"));
        Object term2517 = newInstance(Class.forName("java.util.Date"));
        setField(term2410, term2410.getClass(), "email", "NTWMiBEaDF");
        setField(term2410, term2410.getClass(), "password", "SPBstwKFVr");
        setIntField(term2435, term2435.getClass(), "modCount", 0);
        setField(term2410, term2410.getClass(), "devices", term2435);
        setField(term2410, term2410.getClass(), "roles", term2437);
        setField(term2410, term2410.getClass(), "id", term2455);
        setBooleanField(term2410, term2410.getClass(), "enabled", false);
        setLongField(term2458, term2458.getClass(), "fastTime", 1596067505466L);
        setField(term2458, term2458.getClass(), "cdate", null);
        setField(term2410, term2410.getClass(), "created", term2458);
        setLongField(term2460, term2460.getClass(), "fastTime", 1822179371499L);
        setField(term2460, term2460.getClass(), "cdate", null);
        setField(term2410, term2410.getClass(), "updated", term2460);
        setField(term2409, term2409.getClass(), "user", term2410);
        setField(term2409, term2409.getClass(), "refreshToken", "TXyHhqeCjR");
        setLongField(term2474, term2474.getClass(), "fastTime", 1801360627918L);
        setField(term2474, term2474.getClass(), "cdate", null);
        setField(term2409, term2409.getClass(), "refreshTokenExpirationDate", term2474);
        setField(term2409, term2409.getClass(), "remoteAddress", "lZIgPZPgTu");
        setField(term2409, term2409.getClass(), "type", "iuCxnHGMoW");
        setField(term2409, term2409.getClass(), "os", "GPSEWEDSTo");
        setField(term2409, term2409.getClass(), "id", term2512);
        setBooleanField(term2409, term2409.getClass(), "enabled", true);
        setLongField(term2515, term2515.getClass(), "fastTime", 1763238284550L);
        setField(term2515, term2515.getClass(), "cdate", null);
        setField(term2409, term2409.getClass(), "created", term2515);
        setLongField(term2517, term2517.getClass(), "fastTime", 1704114395126L);
        setField(term2517, term2517.getClass(), "cdate", null);
        setField(term2409, term2409.getClass(), "updated", term2517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOs", argTypes, term2409, args);
    }

};


