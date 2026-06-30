package kyungseo.poc.simple.web.security.persistence.entity.ds1;

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
import static kyungseo.poc.simple.web.security.persistence.entity.ds1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;

public class UserLocation_toString_100440582912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10622;

    public UserLocation_toString_100440582912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10623 = new Long(3550928874058758597L);
        Long term10639 = new Long(987797117310260031L);
        Boolean term10677 = new Boolean(false);
        Integer term10679 = new Integer(1045547089);
        Long term10720 = new Long(-4703513086610650698L);
        Object term10719 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10719, term10719.getClass(), "id", term10720);
        setField(term10719, term10719.getClass(), "users", null);
        setField(term10719, term10719.getClass(), "privileges", null);
        setField(term10719, term10719.getClass(), "name", null);
        Long term10723 = new Long(-8123300791906968552L);
        Object term10722 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10722, term10722.getClass(), "id", term10723);
        setField(term10722, term10722.getClass(), "users", null);
        setField(term10722, term10722.getClass(), "privileges", null);
        setField(term10722, term10722.getClass(), "name", null);
        ArrayList term10717 = new ArrayList();
        ((ArrayList) term10717).add(term10719);
        ((ArrayList) term10717).add(term10722);
        term10622 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term10638 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term10740 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10741 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10745 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10750 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10751 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10755 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10622, term10622.getClass(), "id", term10623);
        setField(term10622, term10622.getClass(), "country", "JvKKIGdUWh");
        setBooleanField(term10622, term10622.getClass(), "enabled", true);
        setField(term10638, term10638.getClass(), "id", term10639);
        setField(term10638, term10638.getClass(), "membername", "DInvDrzBtt");
        setField(term10638, term10638.getClass(), "email", "igZJubDPuK");
        setField(term10638, term10638.getClass(), "password", "qxBdFhLbAN");
        setField(term10638, term10638.getClass(), "enabled", term10677);
        setField(term10638, term10638.getClass(), "age", term10679);
        setField(term10638, term10638.getClass(), "phoneNumber", "KyUmXHRrED");
        setField(term10638, term10638.getClass(), "country", "eOMBFVrNcf");
        setField(term10638, term10638.getClass(), "birthdate", "gOwOIsocMB");
        setField(term10638, term10638.getClass(), "roles", term10717);
        setBooleanField(term10638, term10638.getClass(), "isUsing2FA", true);
        setField(term10638, term10638.getClass(), "secret", "DRdgywxCcP");
        setIntField(term10741, term10741.getClass(), "year", 2026);
        setShortField(term10741, term10741.getClass(), "month", (short) 2);
        setShortField(term10741, term10741.getClass(), "day", (short) 5);
        setField(term10740, term10740.getClass(), "date", term10741);
        setByteField(term10745, term10745.getClass(), "hour", (byte) 8);
        setByteField(term10745, term10745.getClass(), "minute", (byte) 6);
        setByteField(term10745, term10745.getClass(), "second", (byte) 3);
        setIntField(term10745, term10745.getClass(), "nano", 107243113);
        setField(term10740, term10740.getClass(), "time", term10745);
        setField(term10638, term10638.getClass(), "regDate", term10740);
        setIntField(term10751, term10751.getClass(), "year", 2013);
        setShortField(term10751, term10751.getClass(), "month", (short) 3);
        setShortField(term10751, term10751.getClass(), "day", (short) 17);
        setField(term10750, term10750.getClass(), "date", term10751);
        setByteField(term10755, term10755.getClass(), "hour", (byte) 6);
        setByteField(term10755, term10755.getClass(), "minute", (byte) 13);
        setByteField(term10755, term10755.getClass(), "second", (byte) 20);
        setIntField(term10755, term10755.getClass(), "nano", 748150546);
        setField(term10750, term10750.getClass(), "time", term10755);
        setField(term10638, term10638.getClass(), "modDate", term10750);
        setField(term10622, term10622.getClass(), "user", term10638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10622, args);
    }

};


