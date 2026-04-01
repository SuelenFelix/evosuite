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

public class NewLocationToken_setUserLocation_11240633838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12337;
     Object term12484;

    public NewLocationToken_setUserLocation_11240633838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12338 = new Long(854087753192360238L);
        Long term12353 = new Long(-6246278604466261475L);
        Long term12369 = new Long(9113614356317836741L);
        Boolean term12407 = new Boolean(false);
        Integer term12409 = new Integer(2009020256);
        ArrayList term12447 = new ArrayList();
        ((ArrayList) term12447).add((Object)null);
        ((ArrayList) term12447).add((Object)null);
        ((ArrayList) term12447).add((Object)null);
        term12337 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken"));
        Object term12352 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term12368 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term12464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12469 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12479 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12337, term12337.getClass(), "id", term12338);
        setField(term12337, term12337.getClass(), "token", "PzUzEwZhUT");
        setField(term12352, term12352.getClass(), "id", term12353);
        setField(term12352, term12352.getClass(), "country", "bJKvwEFeLG");
        setBooleanField(term12352, term12352.getClass(), "enabled", false);
        setField(term12368, term12368.getClass(), "id", term12369);
        setField(term12368, term12368.getClass(), "membername", "MQzXbKeQIa");
        setField(term12368, term12368.getClass(), "email", "YHDwlXeRTi");
        setField(term12368, term12368.getClass(), "password", "WIJiLZqEqc");
        setField(term12368, term12368.getClass(), "enabled", term12407);
        setField(term12368, term12368.getClass(), "age", term12409);
        setField(term12368, term12368.getClass(), "phoneNumber", "OuZMVgPpoE");
        setField(term12368, term12368.getClass(), "country", "nDUyFfanYp");
        setField(term12368, term12368.getClass(), "birthdate", "hYmQxPxTFd");
        setField(term12368, term12368.getClass(), "roles", term12447);
        setBooleanField(term12368, term12368.getClass(), "isUsing2FA", false);
        setField(term12368, term12368.getClass(), "secret", "DNkENYBesD");
        setIntField(term12465, term12465.getClass(), "year", 2022);
        setShortField(term12465, term12465.getClass(), "month", (short) 9);
        setShortField(term12465, term12465.getClass(), "day", (short) 13);
        setField(term12464, term12464.getClass(), "date", term12465);
        setByteField(term12469, term12469.getClass(), "hour", (byte) 3);
        setByteField(term12469, term12469.getClass(), "minute", (byte) 50);
        setByteField(term12469, term12469.getClass(), "second", (byte) 35);
        setIntField(term12469, term12469.getClass(), "nano", 260929854);
        setField(term12464, term12464.getClass(), "time", term12469);
        setField(term12368, term12368.getClass(), "regDate", term12464);
        setIntField(term12475, term12475.getClass(), "year", 2022);
        setShortField(term12475, term12475.getClass(), "month", (short) 4);
        setShortField(term12475, term12475.getClass(), "day", (short) 7);
        setField(term12474, term12474.getClass(), "date", term12475);
        setByteField(term12479, term12479.getClass(), "hour", (byte) 8);
        setByteField(term12479, term12479.getClass(), "minute", (byte) 56);
        setByteField(term12479, term12479.getClass(), "second", (byte) 3);
        setIntField(term12479, term12479.getClass(), "nano", 496160001);
        setField(term12474, term12474.getClass(), "time", term12479);
        setField(term12368, term12368.getClass(), "modDate", term12474);
        setField(term12352, term12352.getClass(), "user", term12368);
        setField(term12337, term12337.getClass(), "userLocation", term12352);
        Long term12485 = new Long(7190487627244901799L);
        Long term12501 = new Long(-5577824208081701355L);
        Boolean term12539 = new Boolean(true);
        Integer term12541 = new Integer(-1656687479);
        ArrayList term12579 = new ArrayList();
        term12484 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term12500 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term12596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12601 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12606 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12607 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12611 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12484, term12484.getClass(), "id", term12485);
        setField(term12484, term12484.getClass(), "country", "TSogTVVlxc");
        setBooleanField(term12484, term12484.getClass(), "enabled", false);
        setField(term12500, term12500.getClass(), "id", term12501);
        setField(term12500, term12500.getClass(), "membername", "kWEJlReukq");
        setField(term12500, term12500.getClass(), "email", "jkCUxevJxb");
        setField(term12500, term12500.getClass(), "password", "WqobQIRpLc");
        setField(term12500, term12500.getClass(), "enabled", term12539);
        setField(term12500, term12500.getClass(), "age", term12541);
        setField(term12500, term12500.getClass(), "phoneNumber", "jesZbitPYU");
        setField(term12500, term12500.getClass(), "country", "oIbEvXxpda");
        setField(term12500, term12500.getClass(), "birthdate", "QyHVDeaOqb");
        setField(term12500, term12500.getClass(), "roles", term12579);
        setBooleanField(term12500, term12500.getClass(), "isUsing2FA", true);
        setField(term12500, term12500.getClass(), "secret", "ZwnEWySrcE");
        setIntField(term12597, term12597.getClass(), "year", 2013);
        setShortField(term12597, term12597.getClass(), "month", (short) 1);
        setShortField(term12597, term12597.getClass(), "day", (short) 25);
        setField(term12596, term12596.getClass(), "date", term12597);
        setByteField(term12601, term12601.getClass(), "hour", (byte) 11);
        setByteField(term12601, term12601.getClass(), "minute", (byte) 5);
        setByteField(term12601, term12601.getClass(), "second", (byte) 35);
        setIntField(term12601, term12601.getClass(), "nano", 914812579);
        setField(term12596, term12596.getClass(), "time", term12601);
        setField(term12500, term12500.getClass(), "regDate", term12596);
        setIntField(term12607, term12607.getClass(), "year", 2020);
        setShortField(term12607, term12607.getClass(), "month", (short) 11);
        setShortField(term12607, term12607.getClass(), "day", (short) 6);
        setField(term12606, term12606.getClass(), "date", term12607);
        setByteField(term12611, term12611.getClass(), "hour", (byte) 20);
        setByteField(term12611, term12611.getClass(), "minute", (byte) 26);
        setByteField(term12611, term12611.getClass(), "second", (byte) 26);
        setIntField(term12611, term12611.getClass(), "nano", 961202696);
        setField(term12606, term12606.getClass(), "time", term12611);
        setField(term12500, term12500.getClass(), "modDate", term12606);
        setField(term12484, term12484.getClass(), "user", term12500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Object[] args = new Object[1];
        args[0] = term12484;
        callMethod(klass, "setUserLocation", argTypes, term12337, args);
    }

};


