package kyungseo.poc.simple.web.site.admin.usermgmt.web.dto;

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
import static kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class AdmUserDTO_equals_9174243431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11672;
     Object term11831;

    public AdmUserDTO_equals_9174243431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11673 = new Long(1731335447688885587L);
        Boolean term11711 = new Boolean(true);
        Integer term11713 = new Integer(-916584829);
        Boolean term11751 = new Boolean(false);
        Long term11768 = new Long(-6206610574921547811L);
        ArrayList term11770 = new ArrayList();
        ((ArrayList) term11770).add((Object)null);
        ((ArrayList) term11770).add((Object)null);
        ArrayList term11773 = new ArrayList();
        ((ArrayList) term11773).add((Object)null);
        ((ArrayList) term11773).add((Object)null);
        ((ArrayList) term11773).add((Object)null);
        Object term11767 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term11767, term11767.getClass(), "id", term11768);
        setField(term11767, term11767.getClass(), "users", term11770);
        setField(term11767, term11767.getClass(), "privileges", term11773);
        setField(term11767, term11767.getClass(), "name", "");
        Long term11778 = new Long(8408467837292297525L);
        ArrayList term11780 = new ArrayList();
        ((ArrayList) term11780).add((Object)null);
        ((ArrayList) term11780).add((Object)null);
        ((ArrayList) term11780).add((Object)null);
        ((ArrayList) term11780).add((Object)null);
        ((ArrayList) term11780).add((Object)null);
        ((ArrayList) term11780).add((Object)null);
        ((ArrayList) term11780).add((Object)null);
        ArrayList term11783 = new ArrayList();
        ((ArrayList) term11783).add((Object)null);
        ((ArrayList) term11783).add((Object)null);
        ((ArrayList) term11783).add((Object)null);
        Object term11777 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term11777, term11777.getClass(), "id", term11778);
        setField(term11777, term11777.getClass(), "users", term11780);
        setField(term11777, term11777.getClass(), "privileges", term11783);
        setField(term11777, term11777.getClass(), "name", "");
        Long term11788 = new Long(-5717327658642389548L);
        ArrayList term11790 = new ArrayList();
        ((ArrayList) term11790).add((Object)null);
        ((ArrayList) term11790).add((Object)null);
        ((ArrayList) term11790).add((Object)null);
        ((ArrayList) term11790).add((Object)null);
        ArrayList term11793 = new ArrayList();
        ((ArrayList) term11793).add((Object)null);
        ((ArrayList) term11793).add((Object)null);
        Object term11787 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term11787, term11787.getClass(), "id", term11788);
        setField(term11787, term11787.getClass(), "users", term11790);
        setField(term11787, term11787.getClass(), "privileges", term11793);
        setField(term11787, term11787.getClass(), "name", "");
        ArrayList term11765 = new ArrayList();
        ((ArrayList) term11765).add(term11767);
        ((ArrayList) term11765).add(term11777);
        ((ArrayList) term11765).add(term11777);
        ((ArrayList) term11765).add(term11787);
        ((ArrayList) term11765).add(term11767);
        term11672 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term11799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11804 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11814 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11672, term11672.getClass(), "id", term11673);
        setField(term11672, term11672.getClass(), "membername", "AQbnQoJwOO");
        setField(term11672, term11672.getClass(), "email", "NnicBPzNzw");
        setField(term11672, term11672.getClass(), "password", "WADNPbexnT");
        setField(term11672, term11672.getClass(), "enabled", term11711);
        setField(term11672, term11672.getClass(), "age", term11713);
        setField(term11672, term11672.getClass(), "phoneNumber", "rMbsSfMKvX");
        setField(term11672, term11672.getClass(), "country", "oCsqRJXMBc");
        setField(term11672, term11672.getClass(), "birthdate", "npPxKNoqdS");
        setField(term11672, term11672.getClass(), "isUsing2FA", term11751);
        setField(term11672, term11672.getClass(), "secret", "tGgCtmAQPu");
        setField(term11672, term11672.getClass(), "roles", term11765);
        setIntField(term11800, term11800.getClass(), "year", 2012);
        setShortField(term11800, term11800.getClass(), "month", (short) 6);
        setShortField(term11800, term11800.getClass(), "day", (short) 7);
        setField(term11799, term11799.getClass(), "date", term11800);
        setByteField(term11804, term11804.getClass(), "hour", (byte) 19);
        setByteField(term11804, term11804.getClass(), "minute", (byte) 20);
        setByteField(term11804, term11804.getClass(), "second", (byte) 29);
        setIntField(term11804, term11804.getClass(), "nano", 953959934);
        setField(term11799, term11799.getClass(), "time", term11804);
        setField(term11672, term11672.getClass(), "regDate", term11799);
        setIntField(term11810, term11810.getClass(), "year", 2024);
        setShortField(term11810, term11810.getClass(), "month", (short) 3);
        setShortField(term11810, term11810.getClass(), "day", (short) 21);
        setField(term11809, term11809.getClass(), "date", term11810);
        setByteField(term11814, term11814.getClass(), "hour", (byte) 1);
        setByteField(term11814, term11814.getClass(), "minute", (byte) 21);
        setByteField(term11814, term11814.getClass(), "second", (byte) 2);
        setIntField(term11814, term11814.getClass(), "nano", 692012262);
        setField(term11809, term11809.getClass(), "time", term11814);
        setField(term11672, term11672.getClass(), "modDate", term11809);
        setField(term11672, term11672.getClass(), "date", "bANxpqKESI");
        term11831 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11831;
        callMethod(klass, "equals", argTypes, term11672, args);
    }

};


