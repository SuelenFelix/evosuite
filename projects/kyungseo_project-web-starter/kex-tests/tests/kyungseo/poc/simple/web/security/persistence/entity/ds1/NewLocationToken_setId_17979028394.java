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

public class NewLocationToken_setId_17979028394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11365;
     Object term11512;

    public NewLocationToken_setId_17979028394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11366 = new Long(7016651719770171901L);
        Long term11381 = new Long(7777131569376571611L);
        Long term11397 = new Long(-2792969772767139843L);
        Boolean term11435 = new Boolean(true);
        Integer term11437 = new Integer(-1497710478);
        ArrayList term11475 = new ArrayList();
        ((ArrayList) term11475).add((Object)null);
        ((ArrayList) term11475).add((Object)null);
        term11365 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken"));
        Object term11380 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term11396 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term11492 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11493 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11497 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11507 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11365, term11365.getClass(), "id", term11366);
        setField(term11365, term11365.getClass(), "token", "HHAcgDPghN");
        setField(term11380, term11380.getClass(), "id", term11381);
        setField(term11380, term11380.getClass(), "country", "GzmFcFoYft");
        setBooleanField(term11380, term11380.getClass(), "enabled", true);
        setField(term11396, term11396.getClass(), "id", term11397);
        setField(term11396, term11396.getClass(), "membername", "LYRdIFgbgt");
        setField(term11396, term11396.getClass(), "email", "NiKeRXajei");
        setField(term11396, term11396.getClass(), "password", "fDNtdfDzQh");
        setField(term11396, term11396.getClass(), "enabled", term11435);
        setField(term11396, term11396.getClass(), "age", term11437);
        setField(term11396, term11396.getClass(), "phoneNumber", "VbIydgisyZ");
        setField(term11396, term11396.getClass(), "country", "vigaMWRpCA");
        setField(term11396, term11396.getClass(), "birthdate", "sgVVVUpnau");
        setField(term11396, term11396.getClass(), "roles", term11475);
        setBooleanField(term11396, term11396.getClass(), "isUsing2FA", false);
        setField(term11396, term11396.getClass(), "secret", "BPdcafiAQX");
        setIntField(term11493, term11493.getClass(), "year", 2015);
        setShortField(term11493, term11493.getClass(), "month", (short) 10);
        setShortField(term11493, term11493.getClass(), "day", (short) 4);
        setField(term11492, term11492.getClass(), "date", term11493);
        setByteField(term11497, term11497.getClass(), "hour", (byte) 4);
        setByteField(term11497, term11497.getClass(), "minute", (byte) 28);
        setByteField(term11497, term11497.getClass(), "second", (byte) 5);
        setIntField(term11497, term11497.getClass(), "nano", 457950228);
        setField(term11492, term11492.getClass(), "time", term11497);
        setField(term11396, term11396.getClass(), "regDate", term11492);
        setIntField(term11503, term11503.getClass(), "year", 2017);
        setShortField(term11503, term11503.getClass(), "month", (short) 2);
        setShortField(term11503, term11503.getClass(), "day", (short) 8);
        setField(term11502, term11502.getClass(), "date", term11503);
        setByteField(term11507, term11507.getClass(), "hour", (byte) 12);
        setByteField(term11507, term11507.getClass(), "minute", (byte) 5);
        setByteField(term11507, term11507.getClass(), "second", (byte) 46);
        setIntField(term11507, term11507.getClass(), "nano", 847487783);
        setField(term11502, term11502.getClass(), "time", term11507);
        setField(term11396, term11396.getClass(), "modDate", term11502);
        setField(term11380, term11380.getClass(), "user", term11396);
        setField(term11365, term11365.getClass(), "userLocation", term11380);
        term11512 = new Long(6174523862926526279L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term11512;
        callMethod(klass, "setId", argTypes, term11365, args);
    }

};


