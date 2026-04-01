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

public class User_setAge_162567727223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5821;
     Object term5967;

    public User_setAge_162567727223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5822 = new Long(-2195061939206930224L);
        Boolean term5860 = new Boolean(false);
        Integer term5862 = new Integer(-1888585309);
        Long term5903 = new Long(4525924047960478347L);
        ArrayList term5905 = new ArrayList();
        ArrayList term5908 = new ArrayList();
        ((ArrayList) term5908).add((Object)null);
        ((ArrayList) term5908).add((Object)null);
        ((ArrayList) term5908).add((Object)null);
        ((ArrayList) term5908).add((Object)null);
        ((ArrayList) term5908).add((Object)null);
        ((ArrayList) term5908).add((Object)null);
        Object term5902 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5902, term5902.getClass(), "id", term5903);
        setField(term5902, term5902.getClass(), "users", term5905);
        setField(term5902, term5902.getClass(), "privileges", term5908);
        setField(term5902, term5902.getClass(), "name", "");
        Long term5913 = new Long(-3850323135468805420L);
        ArrayList term5915 = new ArrayList();
        ((ArrayList) term5915).add((Object)null);
        ((ArrayList) term5915).add((Object)null);
        ((ArrayList) term5915).add((Object)null);
        ArrayList term5918 = new ArrayList();
        ((ArrayList) term5918).add((Object)null);
        ((ArrayList) term5918).add((Object)null);
        ((ArrayList) term5918).add((Object)null);
        ((ArrayList) term5918).add((Object)null);
        ((ArrayList) term5918).add((Object)null);
        Object term5912 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5912, term5912.getClass(), "id", term5913);
        setField(term5912, term5912.getClass(), "users", term5915);
        setField(term5912, term5912.getClass(), "privileges", term5918);
        setField(term5912, term5912.getClass(), "name", "");
        Long term5923 = new Long(4552367707739103094L);
        ArrayList term5925 = new ArrayList();
        ((ArrayList) term5925).add((Object)null);
        ((ArrayList) term5925).add((Object)null);
        ((ArrayList) term5925).add((Object)null);
        ((ArrayList) term5925).add((Object)null);
        ArrayList term5928 = new ArrayList();
        ((ArrayList) term5928).add((Object)null);
        ((ArrayList) term5928).add((Object)null);
        ((ArrayList) term5928).add((Object)null);
        ((ArrayList) term5928).add((Object)null);
        Object term5922 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5922, term5922.getClass(), "id", term5923);
        setField(term5922, term5922.getClass(), "users", term5925);
        setField(term5922, term5922.getClass(), "privileges", term5928);
        setField(term5922, term5922.getClass(), "name", "");
        ArrayList term5900 = new ArrayList();
        ((ArrayList) term5900).add(term5902);
        ((ArrayList) term5900).add(term5912);
        ((ArrayList) term5900).add(term5912);
        ((ArrayList) term5900).add(term5922);
        term5821 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term5947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5952 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5962 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5821, term5821.getClass(), "id", term5822);
        setField(term5821, term5821.getClass(), "membername", "ceGeARYMoa");
        setField(term5821, term5821.getClass(), "email", "fFWllaiFvh");
        setField(term5821, term5821.getClass(), "password", "PFTdEDSbvZ");
        setField(term5821, term5821.getClass(), "enabled", term5860);
        setField(term5821, term5821.getClass(), "age", term5862);
        setField(term5821, term5821.getClass(), "phoneNumber", "TbiwoiebNe");
        setField(term5821, term5821.getClass(), "country", "laTITSWZuc");
        setField(term5821, term5821.getClass(), "birthdate", "fkzRpxlAqS");
        setField(term5821, term5821.getClass(), "roles", term5900);
        setBooleanField(term5821, term5821.getClass(), "isUsing2FA", true);
        setField(term5821, term5821.getClass(), "secret", "bOUAgAptAI");
        setIntField(term5948, term5948.getClass(), "year", 2020);
        setShortField(term5948, term5948.getClass(), "month", (short) 4);
        setShortField(term5948, term5948.getClass(), "day", (short) 2);
        setField(term5947, term5947.getClass(), "date", term5948);
        setByteField(term5952, term5952.getClass(), "hour", (byte) 11);
        setByteField(term5952, term5952.getClass(), "minute", (byte) 26);
        setByteField(term5952, term5952.getClass(), "second", (byte) 22);
        setIntField(term5952, term5952.getClass(), "nano", 168224721);
        setField(term5947, term5947.getClass(), "time", term5952);
        setField(term5821, term5821.getClass(), "regDate", term5947);
        setIntField(term5958, term5958.getClass(), "year", 2010);
        setShortField(term5958, term5958.getClass(), "month", (short) 10);
        setShortField(term5958, term5958.getClass(), "day", (short) 26);
        setField(term5957, term5957.getClass(), "date", term5958);
        setByteField(term5962, term5962.getClass(), "hour", (byte) 6);
        setByteField(term5962, term5962.getClass(), "minute", (byte) 28);
        setByteField(term5962, term5962.getClass(), "second", (byte) 52);
        setIntField(term5962, term5962.getClass(), "nano", 197540216);
        setField(term5957, term5957.getClass(), "time", term5962);
        setField(term5821, term5821.getClass(), "modDate", term5957);
        term5967 = new Integer(-1210583429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5967;
        callMethod(klass, "setAge", argTypes, term5821, args);
    }

};


