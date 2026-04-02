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

public class Device_getRemoteAddress_10748450407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1709;

    public Device_getRemoteAddress_10748450407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1740 = new Long(1084801489398441516L);
        Object term1739 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1739, term1739.getClass(), "name", null);
        setField(term1739, term1739.getClass(), "users", null);
        setField(term1739, term1739.getClass(), "id", term1740);
        setBooleanField(term1739, term1739.getClass(), "enabled", false);
        setField(term1739, term1739.getClass(), "created", null);
        setField(term1739, term1739.getClass(), "updated", null);
        Long term1744 = new Long(855932984568615096L);
        Object term1743 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1743, term1743.getClass(), "name", null);
        setField(term1743, term1743.getClass(), "users", null);
        setField(term1743, term1743.getClass(), "id", term1744);
        setBooleanField(term1743, term1743.getClass(), "enabled", true);
        setField(term1743, term1743.getClass(), "created", null);
        setField(term1743, term1743.getClass(), "updated", null);
        Object term1747 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1747, term1747.getClass(), "name", null);
        setField(term1747, term1747.getClass(), "users", null);
        setField(term1747, term1747.getClass(), "id", null);
        setBooleanField(term1747, term1747.getClass(), "enabled", false);
        setField(term1747, term1747.getClass(), "created", null);
        setField(term1747, term1747.getClass(), "updated", null);
        Object term1749 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1749, term1749.getClass(), "name", null);
        setField(term1749, term1749.getClass(), "users", null);
        setField(term1749, term1749.getClass(), "id", null);
        setBooleanField(term1749, term1749.getClass(), "enabled", false);
        setField(term1749, term1749.getClass(), "created", null);
        setField(term1749, term1749.getClass(), "updated", null);
        ArrayList term1737 = new ArrayList();
        ((ArrayList) term1737).add(term1739);
        ((ArrayList) term1737).add(term1743);
        ((ArrayList) term1737).add(term1747);
        ((ArrayList) term1737).add(term1749);
        Long term1753 = new Long(-1616722610139554082L);
        Long term1810 = new Long(7495904023107549024L);
        term1709 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term1710 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term1735 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term1756 = newInstance(Class.forName("java.util.Date"));
        Object term1758 = newInstance(Class.forName("java.util.Date"));
        Object term1772 = newInstance(Class.forName("java.util.Date"));
        Object term1813 = newInstance(Class.forName("java.util.Date"));
        Object term1815 = newInstance(Class.forName("java.util.Date"));
        setField(term1710, term1710.getClass(), "email", "PCipZnmBOF");
        setField(term1710, term1710.getClass(), "password", "zcorEihhLK");
        setIntField(term1735, term1735.getClass(), "modCount", 0);
        setField(term1710, term1710.getClass(), "devices", term1735);
        setField(term1710, term1710.getClass(), "roles", term1737);
        setField(term1710, term1710.getClass(), "id", term1753);
        setBooleanField(term1710, term1710.getClass(), "enabled", false);
        setLongField(term1756, term1756.getClass(), "fastTime", 1379465144272L);
        setField(term1756, term1756.getClass(), "cdate", null);
        setField(term1710, term1710.getClass(), "created", term1756);
        setLongField(term1758, term1758.getClass(), "fastTime", 1873152234138L);
        setField(term1758, term1758.getClass(), "cdate", null);
        setField(term1710, term1710.getClass(), "updated", term1758);
        setField(term1709, term1709.getClass(), "user", term1710);
        setField(term1709, term1709.getClass(), "refreshToken", "iIRsCSYqXH");
        setLongField(term1772, term1772.getClass(), "fastTime", 1469019341287L);
        setField(term1772, term1772.getClass(), "cdate", null);
        setField(term1709, term1709.getClass(), "refreshTokenExpirationDate", term1772);
        setField(term1709, term1709.getClass(), "remoteAddress", "nghfqDXyCG");
        setField(term1709, term1709.getClass(), "type", "WBAOTqErtm");
        setField(term1709, term1709.getClass(), "os", "PqtVXXZMqK");
        setField(term1709, term1709.getClass(), "id", term1810);
        setBooleanField(term1709, term1709.getClass(), "enabled", false);
        setLongField(term1813, term1813.getClass(), "fastTime", 1349082575966L);
        setField(term1813, term1813.getClass(), "cdate", null);
        setField(term1709, term1709.getClass(), "created", term1813);
        setLongField(term1815, term1815.getClass(), "fastTime", 1713532939227L);
        setField(term1815, term1815.getClass(), "cdate", null);
        setField(term1709, term1709.getClass(), "updated", term1815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRemoteAddress", argTypes, term1709, args);
    }

};


