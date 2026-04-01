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

public class NewLocationToken_equals_84434554810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13023;
     Object term13170;

    public NewLocationToken_equals_84434554810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13024 = new Long(2124275424075254005L);
        Long term13039 = new Long(-6616339196088014666L);
        Long term13055 = new Long(-1437596366836021966L);
        Boolean term13093 = new Boolean(true);
        Integer term13095 = new Integer(-916335264);
        ArrayList term13133 = new ArrayList();
        ((ArrayList) term13133).add((Object)null);
        ((ArrayList) term13133).add((Object)null);
        ((ArrayList) term13133).add((Object)null);
        ((ArrayList) term13133).add((Object)null);
        ((ArrayList) term13133).add((Object)null);
        ((ArrayList) term13133).add((Object)null);
        ((ArrayList) term13133).add((Object)null);
        term13023 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken"));
        Object term13038 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term13054 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term13150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13155 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13165 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13023, term13023.getClass(), "id", term13024);
        setField(term13023, term13023.getClass(), "token", "fkBfmixBEh");
        setField(term13038, term13038.getClass(), "id", term13039);
        setField(term13038, term13038.getClass(), "country", "SWbairdDKL");
        setBooleanField(term13038, term13038.getClass(), "enabled", false);
        setField(term13054, term13054.getClass(), "id", term13055);
        setField(term13054, term13054.getClass(), "membername", "AibUFEALwF");
        setField(term13054, term13054.getClass(), "email", "eXOUrXTrdW");
        setField(term13054, term13054.getClass(), "password", "aomDEETHep");
        setField(term13054, term13054.getClass(), "enabled", term13093);
        setField(term13054, term13054.getClass(), "age", term13095);
        setField(term13054, term13054.getClass(), "phoneNumber", "GTMrlIYfIM");
        setField(term13054, term13054.getClass(), "country", "eiDqCOWbLE");
        setField(term13054, term13054.getClass(), "birthdate", "OBbbsrFNxC");
        setField(term13054, term13054.getClass(), "roles", term13133);
        setBooleanField(term13054, term13054.getClass(), "isUsing2FA", true);
        setField(term13054, term13054.getClass(), "secret", "SRYeqWJJkR");
        setIntField(term13151, term13151.getClass(), "year", 2019);
        setShortField(term13151, term13151.getClass(), "month", (short) 7);
        setShortField(term13151, term13151.getClass(), "day", (short) 9);
        setField(term13150, term13150.getClass(), "date", term13151);
        setByteField(term13155, term13155.getClass(), "hour", (byte) 21);
        setByteField(term13155, term13155.getClass(), "minute", (byte) 37);
        setByteField(term13155, term13155.getClass(), "second", (byte) 42);
        setIntField(term13155, term13155.getClass(), "nano", 399935883);
        setField(term13150, term13150.getClass(), "time", term13155);
        setField(term13054, term13054.getClass(), "regDate", term13150);
        setIntField(term13161, term13161.getClass(), "year", 2013);
        setShortField(term13161, term13161.getClass(), "month", (short) 9);
        setShortField(term13161, term13161.getClass(), "day", (short) 23);
        setField(term13160, term13160.getClass(), "date", term13161);
        setByteField(term13165, term13165.getClass(), "hour", (byte) 14);
        setByteField(term13165, term13165.getClass(), "minute", (byte) 21);
        setByteField(term13165, term13165.getClass(), "second", (byte) 30);
        setIntField(term13165, term13165.getClass(), "nano", 871245576);
        setField(term13160, term13160.getClass(), "time", term13165);
        setField(term13054, term13054.getClass(), "modDate", term13160);
        setField(term13038, term13038.getClass(), "user", term13054);
        setField(term13023, term13023.getClass(), "userLocation", term13038);
        term13170 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13170;
        callMethod(klass, "equals", argTypes, term13023, args);
    }

};


