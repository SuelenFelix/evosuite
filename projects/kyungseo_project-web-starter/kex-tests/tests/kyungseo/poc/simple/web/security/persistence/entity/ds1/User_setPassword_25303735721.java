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
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class User_setPassword_25303735721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5365;

    public User_setPassword_25303735721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5366 = new Long(-6609679920238945303L);
        Boolean term5404 = new Boolean(true);
        Integer term5406 = new Integer(-556405712);
        Long term5447 = new Long(-7296330380944173376L);
        ArrayList term5449 = new ArrayList();
        ((ArrayList) term5449).add((Object)null);
        ((ArrayList) term5449).add((Object)null);
        ((ArrayList) term5449).add((Object)null);
        ((ArrayList) term5449).add((Object)null);
        ((ArrayList) term5449).add((Object)null);
        ArrayList term5452 = new ArrayList();
        ((ArrayList) term5452).add((Object)null);
        ((ArrayList) term5452).add((Object)null);
        ((ArrayList) term5452).add((Object)null);
        ((ArrayList) term5452).add((Object)null);
        ((ArrayList) term5452).add((Object)null);
        ((ArrayList) term5452).add((Object)null);
        Object term5446 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5446, term5446.getClass(), "id", term5447);
        setField(term5446, term5446.getClass(), "users", term5449);
        setField(term5446, term5446.getClass(), "privileges", term5452);
        setField(term5446, term5446.getClass(), "name", "");
        Long term5457 = new Long(-5951743062322506095L);
        ArrayList term5459 = new ArrayList();
        ((ArrayList) term5459).add((Object)null);
        ((ArrayList) term5459).add((Object)null);
        ((ArrayList) term5459).add((Object)null);
        ((ArrayList) term5459).add((Object)null);
        ArrayList term5462 = new ArrayList();
        ((ArrayList) term5462).add((Object)null);
        Object term5456 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5456, term5456.getClass(), "id", term5457);
        setField(term5456, term5456.getClass(), "users", term5459);
        setField(term5456, term5456.getClass(), "privileges", term5462);
        setField(term5456, term5456.getClass(), "name", "");
        Long term5467 = new Long(468487103823886117L);
        ArrayList term5469 = new ArrayList();
        ((ArrayList) term5469).add((Object)null);
        ((ArrayList) term5469).add((Object)null);
        ((ArrayList) term5469).add((Object)null);
        ArrayList term5472 = new ArrayList();
        ((ArrayList) term5472).add((Object)null);
        ((ArrayList) term5472).add((Object)null);
        ((ArrayList) term5472).add((Object)null);
        ((ArrayList) term5472).add((Object)null);
        ((ArrayList) term5472).add((Object)null);
        ((ArrayList) term5472).add((Object)null);
        ((ArrayList) term5472).add((Object)null);
        ((ArrayList) term5472).add((Object)null);
        ((ArrayList) term5472).add((Object)null);
        Object term5466 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5466, term5466.getClass(), "id", term5467);
        setField(term5466, term5466.getClass(), "users", term5469);
        setField(term5466, term5466.getClass(), "privileges", term5472);
        setField(term5466, term5466.getClass(), "name", "");
        ArrayList term5444 = new ArrayList();
        ((ArrayList) term5444).add(term5446);
        ((ArrayList) term5444).add(term5456);
        ((ArrayList) term5444).add(term5466);
        ((ArrayList) term5444).add(term5446);
        term5365 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term5491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5496 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5501 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5502 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5506 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5365, term5365.getClass(), "id", term5366);
        setField(term5365, term5365.getClass(), "membername", "gwTUlYNpjM");
        setField(term5365, term5365.getClass(), "email", "uXYojRmxrM");
        setField(term5365, term5365.getClass(), "password", "cxRwRcodud");
        setField(term5365, term5365.getClass(), "enabled", term5404);
        setField(term5365, term5365.getClass(), "age", term5406);
        setField(term5365, term5365.getClass(), "phoneNumber", "GDGBPlYeLn");
        setField(term5365, term5365.getClass(), "country", "jdQANIXSTq");
        setField(term5365, term5365.getClass(), "birthdate", "stVcZLTNpu");
        setField(term5365, term5365.getClass(), "roles", term5444);
        setBooleanField(term5365, term5365.getClass(), "isUsing2FA", false);
        setField(term5365, term5365.getClass(), "secret", "oOnRVGqFmy");
        setIntField(term5492, term5492.getClass(), "year", 2020);
        setShortField(term5492, term5492.getClass(), "month", (short) 12);
        setShortField(term5492, term5492.getClass(), "day", (short) 30);
        setField(term5491, term5491.getClass(), "date", term5492);
        setByteField(term5496, term5496.getClass(), "hour", (byte) 2);
        setByteField(term5496, term5496.getClass(), "minute", (byte) 11);
        setByteField(term5496, term5496.getClass(), "second", (byte) 8);
        setIntField(term5496, term5496.getClass(), "nano", 528799251);
        setField(term5491, term5491.getClass(), "time", term5496);
        setField(term5365, term5365.getClass(), "regDate", term5491);
        setIntField(term5502, term5502.getClass(), "year", 2027);
        setShortField(term5502, term5502.getClass(), "month", (short) 9);
        setShortField(term5502, term5502.getClass(), "day", (short) 29);
        setField(term5501, term5501.getClass(), "date", term5502);
        setByteField(term5506, term5506.getClass(), "hour", (byte) 19);
        setByteField(term5506, term5506.getClass(), "minute", (byte) 13);
        setByteField(term5506, term5506.getClass(), "second", (byte) 31);
        setIntField(term5506, term5506.getClass(), "nano", 854066575);
        setField(term5501, term5501.getClass(), "time", term5506);
        setField(term5365, term5365.getClass(), "modDate", term5501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LaXzFIlWMk";
        callMethod(klass, "setPassword", argTypes, term5365, args);
    }

};


