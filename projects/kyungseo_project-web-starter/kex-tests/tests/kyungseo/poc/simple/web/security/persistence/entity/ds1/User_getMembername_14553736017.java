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

public class User_getMembername_14553736017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2115;

    public User_getMembername_14553736017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2116 = new Long(2297097306706899827L);
        Boolean term2154 = new Boolean(true);
        Integer term2156 = new Integer(-203030934);
        Long term2197 = new Long(-900457279156388404L);
        ArrayList term2199 = new ArrayList();
        ((ArrayList) term2199).add((Object)null);
        ((ArrayList) term2199).add((Object)null);
        ((ArrayList) term2199).add((Object)null);
        ((ArrayList) term2199).add((Object)null);
        ((ArrayList) term2199).add((Object)null);
        ((ArrayList) term2199).add((Object)null);
        ((ArrayList) term2199).add((Object)null);
        ((ArrayList) term2199).add((Object)null);
        ArrayList term2202 = new ArrayList();
        Object term2196 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term2196, term2196.getClass(), "id", term2197);
        setField(term2196, term2196.getClass(), "users", term2199);
        setField(term2196, term2196.getClass(), "privileges", term2202);
        setField(term2196, term2196.getClass(), "name", "");
        Long term2207 = new Long(-2255965562447970862L);
        ArrayList term2209 = new ArrayList();
        ((ArrayList) term2209).add((Object)null);
        ((ArrayList) term2209).add((Object)null);
        ((ArrayList) term2209).add((Object)null);
        ArrayList term2212 = new ArrayList();
        ((ArrayList) term2212).add((Object)null);
        ((ArrayList) term2212).add((Object)null);
        ((ArrayList) term2212).add((Object)null);
        ((ArrayList) term2212).add((Object)null);
        Object term2206 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term2206, term2206.getClass(), "id", term2207);
        setField(term2206, term2206.getClass(), "users", term2209);
        setField(term2206, term2206.getClass(), "privileges", term2212);
        setField(term2206, term2206.getClass(), "name", "");
        Long term2217 = new Long(-4023935540989049732L);
        ArrayList term2219 = new ArrayList();
        ((ArrayList) term2219).add((Object)null);
        ((ArrayList) term2219).add((Object)null);
        ArrayList term2222 = new ArrayList();
        ((ArrayList) term2222).add((Object)null);
        ((ArrayList) term2222).add((Object)null);
        ((ArrayList) term2222).add((Object)null);
        ((ArrayList) term2222).add((Object)null);
        Object term2216 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term2216, term2216.getClass(), "id", term2217);
        setField(term2216, term2216.getClass(), "users", term2219);
        setField(term2216, term2216.getClass(), "privileges", term2222);
        setField(term2216, term2216.getClass(), "name", "");
        Long term2227 = new Long(7489064039921396098L);
        ArrayList term2229 = new ArrayList();
        ((ArrayList) term2229).add((Object)null);
        ((ArrayList) term2229).add((Object)null);
        ArrayList term2232 = new ArrayList();
        Object term2226 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term2226, term2226.getClass(), "id", term2227);
        setField(term2226, term2226.getClass(), "users", term2229);
        setField(term2226, term2226.getClass(), "privileges", term2232);
        setField(term2226, term2226.getClass(), "name", "");
        ArrayList term2194 = new ArrayList();
        ((ArrayList) term2194).add(term2196);
        ((ArrayList) term2194).add(term2206);
        ((ArrayList) term2194).add(term2216);
        ((ArrayList) term2194).add(term2206);
        ((ArrayList) term2194).add(term2226);
        ((ArrayList) term2194).add(term2226);
        term2115 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term2251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2266 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2115, term2115.getClass(), "id", term2116);
        setField(term2115, term2115.getClass(), "membername", "qnvxzwuGKX");
        setField(term2115, term2115.getClass(), "email", "EdPAvpluZg");
        setField(term2115, term2115.getClass(), "password", "DzHVBMqWtE");
        setField(term2115, term2115.getClass(), "enabled", term2154);
        setField(term2115, term2115.getClass(), "age", term2156);
        setField(term2115, term2115.getClass(), "phoneNumber", "THZSpzBRYP");
        setField(term2115, term2115.getClass(), "country", "ZfBIVGBQOE");
        setField(term2115, term2115.getClass(), "birthdate", "QSrDQfEsTR");
        setField(term2115, term2115.getClass(), "roles", term2194);
        setBooleanField(term2115, term2115.getClass(), "isUsing2FA", false);
        setField(term2115, term2115.getClass(), "secret", "JkgoRtImdE");
        setIntField(term2252, term2252.getClass(), "year", 2028);
        setShortField(term2252, term2252.getClass(), "month", (short) 4);
        setShortField(term2252, term2252.getClass(), "day", (short) 1);
        setField(term2251, term2251.getClass(), "date", term2252);
        setByteField(term2256, term2256.getClass(), "hour", (byte) 16);
        setByteField(term2256, term2256.getClass(), "minute", (byte) 22);
        setByteField(term2256, term2256.getClass(), "second", (byte) 32);
        setIntField(term2256, term2256.getClass(), "nano", 406353763);
        setField(term2251, term2251.getClass(), "time", term2256);
        setField(term2115, term2115.getClass(), "regDate", term2251);
        setIntField(term2262, term2262.getClass(), "year", 2019);
        setShortField(term2262, term2262.getClass(), "month", (short) 7);
        setShortField(term2262, term2262.getClass(), "day", (short) 19);
        setField(term2261, term2261.getClass(), "date", term2262);
        setByteField(term2266, term2266.getClass(), "hour", (byte) 10);
        setByteField(term2266, term2266.getClass(), "minute", (byte) 54);
        setByteField(term2266, term2266.getClass(), "second", (byte) 55);
        setIntField(term2266, term2266.getClass(), "nano", 244650454);
        setField(term2261, term2261.getClass(), "time", term2266);
        setField(term2115, term2115.getClass(), "modDate", term2261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMembername", argTypes, term2115, args);
    }

};


