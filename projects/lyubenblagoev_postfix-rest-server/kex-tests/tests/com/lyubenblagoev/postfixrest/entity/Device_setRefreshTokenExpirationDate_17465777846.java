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

public class Device_setRefreshTokenExpirationDate_17465777846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1531;
     Object term1647;

    public Device_setRefreshTokenExpirationDate_17465777846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1562 = new Long(-7268507582722666254L);
        Object term1561 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1561, term1561.getClass(), "name", null);
        setField(term1561, term1561.getClass(), "users", null);
        setField(term1561, term1561.getClass(), "id", term1562);
        setBooleanField(term1561, term1561.getClass(), "enabled", false);
        setField(term1561, term1561.getClass(), "created", null);
        setField(term1561, term1561.getClass(), "updated", null);
        Long term1566 = new Long(-4822736661741380518L);
        Object term1565 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1565, term1565.getClass(), "name", null);
        setField(term1565, term1565.getClass(), "users", null);
        setField(term1565, term1565.getClass(), "id", term1566);
        setBooleanField(term1565, term1565.getClass(), "enabled", true);
        setField(term1565, term1565.getClass(), "created", null);
        setField(term1565, term1565.getClass(), "updated", null);
        Object term1569 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1569, term1569.getClass(), "name", null);
        setField(term1569, term1569.getClass(), "users", null);
        setField(term1569, term1569.getClass(), "id", null);
        setBooleanField(term1569, term1569.getClass(), "enabled", false);
        setField(term1569, term1569.getClass(), "created", null);
        setField(term1569, term1569.getClass(), "updated", null);
        Object term1571 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1571, term1571.getClass(), "name", null);
        setField(term1571, term1571.getClass(), "users", null);
        setField(term1571, term1571.getClass(), "id", null);
        setBooleanField(term1571, term1571.getClass(), "enabled", false);
        setField(term1571, term1571.getClass(), "created", null);
        setField(term1571, term1571.getClass(), "updated", null);
        Object term1573 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1573, term1573.getClass(), "name", null);
        setField(term1573, term1573.getClass(), "users", null);
        setField(term1573, term1573.getClass(), "id", null);
        setBooleanField(term1573, term1573.getClass(), "enabled", false);
        setField(term1573, term1573.getClass(), "created", null);
        setField(term1573, term1573.getClass(), "updated", null);
        Object term1575 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1575, term1575.getClass(), "name", null);
        setField(term1575, term1575.getClass(), "users", null);
        setField(term1575, term1575.getClass(), "id", null);
        setBooleanField(term1575, term1575.getClass(), "enabled", false);
        setField(term1575, term1575.getClass(), "created", null);
        setField(term1575, term1575.getClass(), "updated", null);
        Long term1578 = new Long(-4924950707540628022L);
        Object term1577 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1577, term1577.getClass(), "name", null);
        setField(term1577, term1577.getClass(), "users", null);
        setField(term1577, term1577.getClass(), "id", term1578);
        setBooleanField(term1577, term1577.getClass(), "enabled", false);
        setField(term1577, term1577.getClass(), "created", null);
        setField(term1577, term1577.getClass(), "updated", null);
        ArrayList term1559 = new ArrayList();
        ((ArrayList) term1559).add(term1561);
        ((ArrayList) term1559).add(term1565);
        ((ArrayList) term1559).add(term1569);
        ((ArrayList) term1559).add(term1571);
        ((ArrayList) term1559).add(term1565);
        ((ArrayList) term1559).add(term1573);
        ((ArrayList) term1559).add(term1575);
        ((ArrayList) term1559).add(term1577);
        Long term1583 = new Long(5671808784468963649L);
        Long term1640 = new Long(2297097306706899827L);
        term1531 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term1532 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term1557 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term1586 = newInstance(Class.forName("java.util.Date"));
        Object term1588 = newInstance(Class.forName("java.util.Date"));
        Object term1602 = newInstance(Class.forName("java.util.Date"));
        Object term1643 = newInstance(Class.forName("java.util.Date"));
        Object term1645 = newInstance(Class.forName("java.util.Date"));
        setField(term1532, term1532.getClass(), "email", "iljANwuEjk");
        setField(term1532, term1532.getClass(), "password", "kNqaJKIATy");
        setIntField(term1557, term1557.getClass(), "modCount", 0);
        setField(term1532, term1532.getClass(), "devices", term1557);
        setField(term1532, term1532.getClass(), "roles", term1559);
        setField(term1532, term1532.getClass(), "id", term1583);
        setBooleanField(term1532, term1532.getClass(), "enabled", false);
        setLongField(term1586, term1586.getClass(), "fastTime", 1325981376062L);
        setField(term1586, term1586.getClass(), "cdate", null);
        setField(term1532, term1532.getClass(), "created", term1586);
        setLongField(term1588, term1588.getClass(), "fastTime", 1638331931856L);
        setField(term1588, term1588.getClass(), "cdate", null);
        setField(term1532, term1532.getClass(), "updated", term1588);
        setField(term1531, term1531.getClass(), "user", term1532);
        setField(term1531, term1531.getClass(), "refreshToken", "QduALnDSVo");
        setLongField(term1602, term1602.getClass(), "fastTime", 1891157798466L);
        setField(term1602, term1602.getClass(), "cdate", null);
        setField(term1531, term1531.getClass(), "refreshTokenExpirationDate", term1602);
        setField(term1531, term1531.getClass(), "remoteAddress", "izPpKDErnQ");
        setField(term1531, term1531.getClass(), "type", "NnpwZBUTvx");
        setField(term1531, term1531.getClass(), "os", "tlQSNgTkQX");
        setField(term1531, term1531.getClass(), "id", term1640);
        setBooleanField(term1531, term1531.getClass(), "enabled", false);
        setLongField(term1643, term1643.getClass(), "fastTime", 1460978610142L);
        setField(term1643, term1643.getClass(), "cdate", null);
        setField(term1531, term1531.getClass(), "created", term1643);
        setLongField(term1645, term1645.getClass(), "fastTime", 1418905725858L);
        setField(term1645, term1645.getClass(), "cdate", null);
        setField(term1531, term1531.getClass(), "updated", term1645);
        term1647 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1647, term1647.getClass(), "fastTime", 1837509436971L);
        setField(term1647, term1647.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term1647;
        callMethod(klass, "setRefreshTokenExpirationDate", argTypes, term1531, args);
    }

};


