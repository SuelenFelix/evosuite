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

public class JwtRefreshToken_getExpiryDate_179487902211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29903;

    public JwtRefreshToken_getExpiryDate_179487902211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29904 = new Long(3710266125279855888L);
        Long term29919 = new Long(-2390242218450551640L);
        Long term29922 = new Long(6410411768623434810L);
        Boolean term29960 = new Boolean(true);
        Integer term29962 = new Integer(-1541981599);
        ArrayList term30000 = new ArrayList();
        ((ArrayList) term30000).add((Object)null);
        ((ArrayList) term30000).add((Object)null);
        ((ArrayList) term30000).add((Object)null);
        ((ArrayList) term30000).add((Object)null);
        Long term30062 = new Long(6113018989695983183L);
        Long term30077 = new Long(7008972996434680296L);
        Long term30084 = new Long(678000773176130475L);
        Long term30086 = new Long(4016618299857011653L);
        Boolean term30088 = new Boolean(true);
        Long term30090 = new Long(-8830414189681727376L);
        Boolean term30095 = new Boolean(true);
        Long term30097 = new Long(3804733307680394319L);
        term29903 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term29918 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term29921 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term30017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30032 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30061 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term30076 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term30079 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term30083 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term30092 = newInstance(Class.forName("java.time.Instant"));
        Object term30099 = newInstance(Class.forName("java.time.Instant"));
        setField(term29903, term29903.getClass(), "id", term29904);
        setField(term29903, term29903.getClass(), "token", "bnnAetbkOZ");
        setField(term29918, term29918.getClass(), "id", term29919);
        setField(term29921, term29921.getClass(), "id", term29922);
        setField(term29921, term29921.getClass(), "membername", "wMjxNGGfFZ");
        setField(term29921, term29921.getClass(), "email", "wsirPqRrlc");
        setField(term29921, term29921.getClass(), "password", "gkEkytWJJj");
        setField(term29921, term29921.getClass(), "enabled", term29960);
        setField(term29921, term29921.getClass(), "age", term29962);
        setField(term29921, term29921.getClass(), "phoneNumber", "KQaBgHpPTE");
        setField(term29921, term29921.getClass(), "country", "ftWAuQBFQb");
        setField(term29921, term29921.getClass(), "birthdate", "GDIImTLJuG");
        setField(term29921, term29921.getClass(), "roles", term30000);
        setBooleanField(term29921, term29921.getClass(), "isUsing2FA", false);
        setField(term29921, term29921.getClass(), "secret", "SZgtAalZXH");
        setIntField(term30018, term30018.getClass(), "year", 2021);
        setShortField(term30018, term30018.getClass(), "month", (short) 8);
        setShortField(term30018, term30018.getClass(), "day", (short) 11);
        setField(term30017, term30017.getClass(), "date", term30018);
        setByteField(term30022, term30022.getClass(), "hour", (byte) 17);
        setByteField(term30022, term30022.getClass(), "minute", (byte) 23);
        setByteField(term30022, term30022.getClass(), "second", (byte) 44);
        setIntField(term30022, term30022.getClass(), "nano", 259629307);
        setField(term30017, term30017.getClass(), "time", term30022);
        setField(term29921, term29921.getClass(), "regDate", term30017);
        setIntField(term30028, term30028.getClass(), "year", 2015);
        setShortField(term30028, term30028.getClass(), "month", (short) 7);
        setShortField(term30028, term30028.getClass(), "day", (short) 18);
        setField(term30027, term30027.getClass(), "date", term30028);
        setByteField(term30032, term30032.getClass(), "hour", (byte) 12);
        setByteField(term30032, term30032.getClass(), "minute", (byte) 57);
        setByteField(term30032, term30032.getClass(), "second", (byte) 55);
        setIntField(term30032, term30032.getClass(), "nano", 807129715);
        setField(term30027, term30027.getClass(), "time", term30032);
        setField(term29921, term29921.getClass(), "modDate", term30027);
        setField(term29918, term29918.getClass(), "user", term29921);
        setField(term29918, term29918.getClass(), "deviceType", "yRAXrykXQM");
        setField(term29918, term29918.getClass(), "deviceId", "XHZWMGtcXo");
        setField(term30061, term30061.getClass(), "id", term30062);
        setField(term30061, term30061.getClass(), "token", "ofKwawJquL");
        setField(term30076, term30076.getClass(), "id", term30077);
        setField(term30079, term30079.getClass(), "id", null);
        setField(term30079, term30079.getClass(), "membername", null);
        setField(term30079, term30079.getClass(), "email", null);
        setField(term30079, term30079.getClass(), "password", null);
        setField(term30079, term30079.getClass(), "enabled", null);
        setField(term30079, term30079.getClass(), "age", null);
        setField(term30079, term30079.getClass(), "phoneNumber", null);
        setField(term30079, term30079.getClass(), "country", null);
        setField(term30079, term30079.getClass(), "birthdate", null);
        setField(term30079, term30079.getClass(), "roles", null);
        setBooleanField(term30079, term30079.getClass(), "isUsing2FA", false);
        setField(term30079, term30079.getClass(), "secret", null);
        setField(term30079, term30079.getClass(), "regDate", null);
        setField(term30079, term30079.getClass(), "modDate", null);
        setField(term30076, term30076.getClass(), "user", term30079);
        setField(term30076, term30076.getClass(), "deviceType", "");
        setField(term30076, term30076.getClass(), "deviceId", "");
        setField(term30083, term30083.getClass(), "id", term30084);
        setField(term30083, term30083.getClass(), "token", null);
        setField(term30083, term30083.getClass(), "userDevice", null);
        setField(term30083, term30083.getClass(), "refreshCount", term30086);
        setField(term30083, term30083.getClass(), "expiryDate", null);
        setField(term30076, term30076.getClass(), "refreshToken", term30083);
        setField(term30076, term30076.getClass(), "isRefreshActive", term30088);
        setField(term30061, term30061.getClass(), "userDevice", term30076);
        setField(term30061, term30061.getClass(), "refreshCount", term30090);
        setLongField(term30092, term30092.getClass(), "seconds", 1668066172L);
        setIntField(term30092, term30092.getClass(), "nanos", 11000000);
        setField(term30061, term30061.getClass(), "expiryDate", term30092);
        setField(term29918, term29918.getClass(), "refreshToken", term30061);
        setField(term29918, term29918.getClass(), "isRefreshActive", term30095);
        setField(term29903, term29903.getClass(), "userDevice", term29918);
        setField(term29903, term29903.getClass(), "refreshCount", term30097);
        setLongField(term30099, term30099.getClass(), "seconds", 1677875735L);
        setIntField(term30099, term30099.getClass(), "nanos", 410000000);
        setField(term29903, term29903.getClass(), "expiryDate", term30099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiryDate", argTypes, term29903, args);
    }

};


