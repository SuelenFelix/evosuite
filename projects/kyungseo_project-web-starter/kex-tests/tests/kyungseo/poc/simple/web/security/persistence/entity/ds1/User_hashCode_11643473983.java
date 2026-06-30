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

public class User_hashCode_11643473983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1200;

    public User_hashCode_11643473983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1201 = new Long(-3838084482494604218L);
        Boolean term1239 = new Boolean(false);
        Integer term1241 = new Integer(1725571209);
        Long term1282 = new Long(3892018155439224435L);
        ArrayList term1284 = new ArrayList();
        ((ArrayList) term1284).add((Object)null);
        ((ArrayList) term1284).add((Object)null);
        ((ArrayList) term1284).add((Object)null);
        ((ArrayList) term1284).add((Object)null);
        ArrayList term1287 = new ArrayList();
        ((ArrayList) term1287).add((Object)null);
        Object term1281 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term1281, term1281.getClass(), "id", term1282);
        setField(term1281, term1281.getClass(), "users", term1284);
        setField(term1281, term1281.getClass(), "privileges", term1287);
        setField(term1281, term1281.getClass(), "name", "");
        Long term1292 = new Long(-8654565919063661957L);
        ArrayList term1294 = new ArrayList();
        ((ArrayList) term1294).add((Object)null);
        ((ArrayList) term1294).add((Object)null);
        ((ArrayList) term1294).add((Object)null);
        ((ArrayList) term1294).add((Object)null);
        ((ArrayList) term1294).add((Object)null);
        ((ArrayList) term1294).add((Object)null);
        ((ArrayList) term1294).add((Object)null);
        ((ArrayList) term1294).add((Object)null);
        ((ArrayList) term1294).add((Object)null);
        ArrayList term1297 = new ArrayList();
        ((ArrayList) term1297).add((Object)null);
        ((ArrayList) term1297).add((Object)null);
        ((ArrayList) term1297).add((Object)null);
        ((ArrayList) term1297).add((Object)null);
        ((ArrayList) term1297).add((Object)null);
        ((ArrayList) term1297).add((Object)null);
        ((ArrayList) term1297).add((Object)null);
        Object term1291 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term1291, term1291.getClass(), "id", term1292);
        setField(term1291, term1291.getClass(), "users", term1294);
        setField(term1291, term1291.getClass(), "privileges", term1297);
        setField(term1291, term1291.getClass(), "name", "");
        Long term1302 = new Long(-6723783499250797216L);
        ArrayList term1304 = new ArrayList();
        ArrayList term1307 = new ArrayList();
        ((ArrayList) term1307).add((Object)null);
        ((ArrayList) term1307).add((Object)null);
        ((ArrayList) term1307).add((Object)null);
        ((ArrayList) term1307).add((Object)null);
        ((ArrayList) term1307).add((Object)null);
        ((ArrayList) term1307).add((Object)null);
        Object term1301 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term1301, term1301.getClass(), "id", term1302);
        setField(term1301, term1301.getClass(), "users", term1304);
        setField(term1301, term1301.getClass(), "privileges", term1307);
        setField(term1301, term1301.getClass(), "name", "");
        ArrayList term1279 = new ArrayList();
        ((ArrayList) term1279).add(term1281);
        ((ArrayList) term1279).add(term1291);
        ((ArrayList) term1279).add(term1301);
        term1200 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term1326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1331 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1341 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1200, term1200.getClass(), "id", term1201);
        setField(term1200, term1200.getClass(), "membername", "pORebkoRdD");
        setField(term1200, term1200.getClass(), "email", "mXGCWJDOqA");
        setField(term1200, term1200.getClass(), "password", "dpNsDgfPso");
        setField(term1200, term1200.getClass(), "enabled", term1239);
        setField(term1200, term1200.getClass(), "age", term1241);
        setField(term1200, term1200.getClass(), "phoneNumber", "hCWPJQKpdc");
        setField(term1200, term1200.getClass(), "country", "WzMEhMXkKx");
        setField(term1200, term1200.getClass(), "birthdate", "XOiDvlDhdc");
        setField(term1200, term1200.getClass(), "roles", term1279);
        setBooleanField(term1200, term1200.getClass(), "isUsing2FA", false);
        setField(term1200, term1200.getClass(), "secret", "DSNsTGYXDF");
        setIntField(term1327, term1327.getClass(), "year", 2016);
        setShortField(term1327, term1327.getClass(), "month", (short) 6);
        setShortField(term1327, term1327.getClass(), "day", (short) 15);
        setField(term1326, term1326.getClass(), "date", term1327);
        setByteField(term1331, term1331.getClass(), "hour", (byte) 21);
        setByteField(term1331, term1331.getClass(), "minute", (byte) 23);
        setByteField(term1331, term1331.getClass(), "second", (byte) 23);
        setIntField(term1331, term1331.getClass(), "nano", 433372070);
        setField(term1326, term1326.getClass(), "time", term1331);
        setField(term1200, term1200.getClass(), "regDate", term1326);
        setIntField(term1337, term1337.getClass(), "year", 2012);
        setShortField(term1337, term1337.getClass(), "month", (short) 8);
        setShortField(term1337, term1337.getClass(), "day", (short) 25);
        setField(term1336, term1336.getClass(), "date", term1337);
        setByteField(term1341, term1341.getClass(), "hour", (byte) 19);
        setByteField(term1341, term1341.getClass(), "minute", (byte) 49);
        setByteField(term1341, term1341.getClass(), "second", (byte) 8);
        setIntField(term1341, term1341.getClass(), "nano", 912685024);
        setField(term1336, term1336.getClass(), "time", term1341);
        setField(term1200, term1200.getClass(), "modDate", term1336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1200, args);
    }

};


