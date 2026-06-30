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

public class AdmUserDTO_setIsUsing2FA_87248756325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10380;
     Object term10519;

    public AdmUserDTO_setIsUsing2FA_87248756325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10381 = new Long(800893933628130392L);
        Boolean term10419 = new Boolean(true);
        Integer term10421 = new Integer(991356662);
        Boolean term10459 = new Boolean(false);
        Long term10476 = new Long(-6983938899150831997L);
        ArrayList term10478 = new ArrayList();
        ((ArrayList) term10478).add((Object)null);
        ((ArrayList) term10478).add((Object)null);
        ((ArrayList) term10478).add((Object)null);
        ((ArrayList) term10478).add((Object)null);
        ArrayList term10481 = new ArrayList();
        ((ArrayList) term10481).add((Object)null);
        ((ArrayList) term10481).add((Object)null);
        ((ArrayList) term10481).add((Object)null);
        ((ArrayList) term10481).add((Object)null);
        ((ArrayList) term10481).add((Object)null);
        ((ArrayList) term10481).add((Object)null);
        Object term10475 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10475, term10475.getClass(), "id", term10476);
        setField(term10475, term10475.getClass(), "users", term10478);
        setField(term10475, term10475.getClass(), "privileges", term10481);
        setField(term10475, term10475.getClass(), "name", "");
        ArrayList term10473 = new ArrayList();
        ((ArrayList) term10473).add(term10475);
        term10380 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term10487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10492 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10497 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10498 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10502 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10380, term10380.getClass(), "id", term10381);
        setField(term10380, term10380.getClass(), "membername", "FCovVZHqPx");
        setField(term10380, term10380.getClass(), "email", "jSTBfkWjge");
        setField(term10380, term10380.getClass(), "password", "uKYhZULSHp");
        setField(term10380, term10380.getClass(), "enabled", term10419);
        setField(term10380, term10380.getClass(), "age", term10421);
        setField(term10380, term10380.getClass(), "phoneNumber", "xdYuLllgpn");
        setField(term10380, term10380.getClass(), "country", "ayonlqalLA");
        setField(term10380, term10380.getClass(), "birthdate", "fzzIOVxKdF");
        setField(term10380, term10380.getClass(), "isUsing2FA", term10459);
        setField(term10380, term10380.getClass(), "secret", "cdvmxZaBEK");
        setField(term10380, term10380.getClass(), "roles", term10473);
        setIntField(term10488, term10488.getClass(), "year", 2026);
        setShortField(term10488, term10488.getClass(), "month", (short) 2);
        setShortField(term10488, term10488.getClass(), "day", (short) 26);
        setField(term10487, term10487.getClass(), "date", term10488);
        setByteField(term10492, term10492.getClass(), "hour", (byte) 12);
        setByteField(term10492, term10492.getClass(), "minute", (byte) 23);
        setByteField(term10492, term10492.getClass(), "second", (byte) 14);
        setIntField(term10492, term10492.getClass(), "nano", 86303611);
        setField(term10487, term10487.getClass(), "time", term10492);
        setField(term10380, term10380.getClass(), "regDate", term10487);
        setIntField(term10498, term10498.getClass(), "year", 2014);
        setShortField(term10498, term10498.getClass(), "month", (short) 6);
        setShortField(term10498, term10498.getClass(), "day", (short) 12);
        setField(term10497, term10497.getClass(), "date", term10498);
        setByteField(term10502, term10502.getClass(), "hour", (byte) 5);
        setByteField(term10502, term10502.getClass(), "minute", (byte) 4);
        setByteField(term10502, term10502.getClass(), "second", (byte) 20);
        setIntField(term10502, term10502.getClass(), "nano", 169602296);
        setField(term10497, term10497.getClass(), "time", term10502);
        setField(term10380, term10380.getClass(), "modDate", term10497);
        setField(term10380, term10380.getClass(), "date", "OCCDQbndDE");
        term10519 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term10519;
        callMethod(klass, "setIsUsing2FA", argTypes, term10380, args);
    }

};


