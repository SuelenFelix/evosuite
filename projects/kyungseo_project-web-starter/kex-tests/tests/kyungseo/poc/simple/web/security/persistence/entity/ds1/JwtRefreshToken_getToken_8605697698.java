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

public class JwtRefreshToken_getToken_8605697698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28970;

    public JwtRefreshToken_getToken_8605697698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28971 = new Long(-4221717002257817742L);
        Long term28986 = new Long(-4465503610042466187L);
        Long term28989 = new Long(-4715213274903499549L);
        Boolean term29027 = new Boolean(true);
        Integer term29029 = new Integer(-1150062870);
        ArrayList term29067 = new ArrayList();
        ((ArrayList) term29067).add((Object)null);
        ((ArrayList) term29067).add((Object)null);
        ((ArrayList) term29067).add((Object)null);
        ((ArrayList) term29067).add((Object)null);
        ((ArrayList) term29067).add((Object)null);
        ((ArrayList) term29067).add((Object)null);
        ((ArrayList) term29067).add((Object)null);
        ((ArrayList) term29067).add((Object)null);
        ((ArrayList) term29067).add((Object)null);
        Long term29129 = new Long(-6466670514888869637L);
        Long term29144 = new Long(1092970910177761761L);
        Long term29151 = new Long(4106733769705635532L);
        Long term29153 = new Long(-4945539086208200375L);
        Boolean term29155 = new Boolean(false);
        Long term29157 = new Long(-1244149061151367736L);
        Boolean term29162 = new Boolean(true);
        Long term29164 = new Long(985346718698079792L);
        term28970 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term28985 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term28988 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term29084 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29085 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29089 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29099 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29128 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term29143 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term29146 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term29150 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term29159 = newInstance(Class.forName("java.time.Instant"));
        Object term29166 = newInstance(Class.forName("java.time.Instant"));
        setField(term28970, term28970.getClass(), "id", term28971);
        setField(term28970, term28970.getClass(), "token", "ppbAxYzNBY");
        setField(term28985, term28985.getClass(), "id", term28986);
        setField(term28988, term28988.getClass(), "id", term28989);
        setField(term28988, term28988.getClass(), "membername", "ihHWIriTVZ");
        setField(term28988, term28988.getClass(), "email", "WgbseiBPrC");
        setField(term28988, term28988.getClass(), "password", "wkAwDQlAAy");
        setField(term28988, term28988.getClass(), "enabled", term29027);
        setField(term28988, term28988.getClass(), "age", term29029);
        setField(term28988, term28988.getClass(), "phoneNumber", "IySCafOscV");
        setField(term28988, term28988.getClass(), "country", "HAoImTYIbE");
        setField(term28988, term28988.getClass(), "birthdate", "qXdrzsJrNt");
        setField(term28988, term28988.getClass(), "roles", term29067);
        setBooleanField(term28988, term28988.getClass(), "isUsing2FA", false);
        setField(term28988, term28988.getClass(), "secret", "shKYNJlwYH");
        setIntField(term29085, term29085.getClass(), "year", 2011);
        setShortField(term29085, term29085.getClass(), "month", (short) 2);
        setShortField(term29085, term29085.getClass(), "day", (short) 3);
        setField(term29084, term29084.getClass(), "date", term29085);
        setByteField(term29089, term29089.getClass(), "hour", (byte) 3);
        setByteField(term29089, term29089.getClass(), "minute", (byte) 24);
        setByteField(term29089, term29089.getClass(), "second", (byte) 44);
        setIntField(term29089, term29089.getClass(), "nano", 410664773);
        setField(term29084, term29084.getClass(), "time", term29089);
        setField(term28988, term28988.getClass(), "regDate", term29084);
        setIntField(term29095, term29095.getClass(), "year", 2013);
        setShortField(term29095, term29095.getClass(), "month", (short) 6);
        setShortField(term29095, term29095.getClass(), "day", (short) 11);
        setField(term29094, term29094.getClass(), "date", term29095);
        setByteField(term29099, term29099.getClass(), "hour", (byte) 13);
        setByteField(term29099, term29099.getClass(), "minute", (byte) 9);
        setByteField(term29099, term29099.getClass(), "second", (byte) 50);
        setIntField(term29099, term29099.getClass(), "nano", 866463029);
        setField(term29094, term29094.getClass(), "time", term29099);
        setField(term28988, term28988.getClass(), "modDate", term29094);
        setField(term28985, term28985.getClass(), "user", term28988);
        setField(term28985, term28985.getClass(), "deviceType", "CZFEFCSdMd");
        setField(term28985, term28985.getClass(), "deviceId", "NEpKgrSAsV");
        setField(term29128, term29128.getClass(), "id", term29129);
        setField(term29128, term29128.getClass(), "token", "gCyzKQjTct");
        setField(term29143, term29143.getClass(), "id", term29144);
        setField(term29146, term29146.getClass(), "id", null);
        setField(term29146, term29146.getClass(), "membername", null);
        setField(term29146, term29146.getClass(), "email", null);
        setField(term29146, term29146.getClass(), "password", null);
        setField(term29146, term29146.getClass(), "enabled", null);
        setField(term29146, term29146.getClass(), "age", null);
        setField(term29146, term29146.getClass(), "phoneNumber", null);
        setField(term29146, term29146.getClass(), "country", null);
        setField(term29146, term29146.getClass(), "birthdate", null);
        setField(term29146, term29146.getClass(), "roles", null);
        setBooleanField(term29146, term29146.getClass(), "isUsing2FA", false);
        setField(term29146, term29146.getClass(), "secret", null);
        setField(term29146, term29146.getClass(), "regDate", null);
        setField(term29146, term29146.getClass(), "modDate", null);
        setField(term29143, term29143.getClass(), "user", term29146);
        setField(term29143, term29143.getClass(), "deviceType", "");
        setField(term29143, term29143.getClass(), "deviceId", "");
        setField(term29150, term29150.getClass(), "id", term29151);
        setField(term29150, term29150.getClass(), "token", null);
        setField(term29150, term29150.getClass(), "userDevice", null);
        setField(term29150, term29150.getClass(), "refreshCount", term29153);
        setField(term29150, term29150.getClass(), "expiryDate", null);
        setField(term29143, term29143.getClass(), "refreshToken", term29150);
        setField(term29143, term29143.getClass(), "isRefreshActive", term29155);
        setField(term29128, term29128.getClass(), "userDevice", term29143);
        setField(term29128, term29128.getClass(), "refreshCount", term29157);
        setLongField(term29159, term29159.getClass(), "seconds", 1673375951L);
        setIntField(term29159, term29159.getClass(), "nanos", 909000000);
        setField(term29128, term29128.getClass(), "expiryDate", term29159);
        setField(term28985, term28985.getClass(), "refreshToken", term29128);
        setField(term28985, term28985.getClass(), "isRefreshActive", term29162);
        setField(term28970, term28970.getClass(), "userDevice", term28985);
        setField(term28970, term28970.getClass(), "refreshCount", term29164);
        setLongField(term29166, term29166.getClass(), "seconds", 1816279347L);
        setIntField(term29166, term29166.getClass(), "nanos", 222000000);
        setField(term28970, term28970.getClass(), "expiryDate", term29166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term28970, args);
    }

};


