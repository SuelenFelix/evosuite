package kyungseo.poc.simple.web.security.service;

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
import static kyungseo.poc.simple.web.security.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;

public class JwtUserDeviceService_verifyRefreshAvailability_12148539774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1328;

    public JwtUserDeviceService_verifyRefreshAvailability_12148539774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1329 = new Long(2297097306706899827L);
        Long term1344 = new Long(-900457279156388404L);
        Long term1347 = new Long(1084801489398441516L);
        Boolean term1385 = new Boolean(true);
        Integer term1387 = new Integer(-1685132342);
        ArrayList term1425 = new ArrayList();
        ((ArrayList) term1425).add((Object)null);
        ((ArrayList) term1425).add((Object)null);
        ((ArrayList) term1425).add((Object)null);
        Long term1487 = new Long(7495904023107549024L);
        Long term1502 = new Long(8802866251294305945L);
        Long term1509 = new Long(4513004407927379358L);
        Long term1511 = new Long(-4598158870068953328L);
        Boolean term1513 = new Boolean(false);
        Long term1515 = new Long(138235087558060686L);
        Boolean term1520 = new Boolean(true);
        Long term1522 = new Long(5381386339318883012L);
        term1328 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term1343 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term1346 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term1442 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1443 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1447 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1457 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1486 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term1501 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term1504 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term1508 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term1517 = newInstance(Class.forName("java.time.Instant"));
        Object term1524 = newInstance(Class.forName("java.time.Instant"));
        setField(term1328, term1328.getClass(), "id", term1329);
        setField(term1328, term1328.getClass(), "token", "CFyoseFGLF");
        setField(term1343, term1343.getClass(), "id", term1344);
        setField(term1346, term1346.getClass(), "id", term1347);
        setField(term1346, term1346.getClass(), "membername", "SFqCrhEWLm");
        setField(term1346, term1346.getClass(), "email", "GZdcJyZntS");
        setField(term1346, term1346.getClass(), "password", "OIHoJeysUi");
        setField(term1346, term1346.getClass(), "enabled", term1385);
        setField(term1346, term1346.getClass(), "age", term1387);
        setField(term1346, term1346.getClass(), "phoneNumber", "WXMWFDGcLB");
        setField(term1346, term1346.getClass(), "country", "wKWbJssZuG");
        setField(term1346, term1346.getClass(), "birthdate", "NzBMMhkhpT");
        setField(term1346, term1346.getClass(), "roles", term1425);
        setBooleanField(term1346, term1346.getClass(), "isUsing2FA", true);
        setField(term1346, term1346.getClass(), "secret", "rYbtIDVdnd");
        setIntField(term1443, term1443.getClass(), "year", 2010);
        setShortField(term1443, term1443.getClass(), "month", (short) 5);
        setShortField(term1443, term1443.getClass(), "day", (short) 2);
        setField(term1442, term1442.getClass(), "date", term1443);
        setByteField(term1447, term1447.getClass(), "hour", (byte) 2);
        setByteField(term1447, term1447.getClass(), "minute", (byte) 22);
        setByteField(term1447, term1447.getClass(), "second", (byte) 33);
        setIntField(term1447, term1447.getClass(), "nano", 530835039);
        setField(term1442, term1442.getClass(), "time", term1447);
        setField(term1346, term1346.getClass(), "regDate", term1442);
        setIntField(term1453, term1453.getClass(), "year", 2024);
        setShortField(term1453, term1453.getClass(), "month", (short) 4);
        setShortField(term1453, term1453.getClass(), "day", (short) 24);
        setField(term1452, term1452.getClass(), "date", term1453);
        setByteField(term1457, term1457.getClass(), "hour", (byte) 7);
        setByteField(term1457, term1457.getClass(), "minute", (byte) 2);
        setByteField(term1457, term1457.getClass(), "second", (byte) 51);
        setIntField(term1457, term1457.getClass(), "nano", 635502964);
        setField(term1452, term1452.getClass(), "time", term1457);
        setField(term1346, term1346.getClass(), "modDate", term1452);
        setField(term1343, term1343.getClass(), "user", term1346);
        setField(term1343, term1343.getClass(), "deviceType", "UKAReurpHG");
        setField(term1343, term1343.getClass(), "deviceId", "WVRMUmrljA");
        setField(term1486, term1486.getClass(), "id", term1487);
        setField(term1486, term1486.getClass(), "token", "NTlKJDDWlk");
        setField(term1501, term1501.getClass(), "id", term1502);
        setField(term1504, term1504.getClass(), "id", null);
        setField(term1504, term1504.getClass(), "membername", null);
        setField(term1504, term1504.getClass(), "email", null);
        setField(term1504, term1504.getClass(), "password", null);
        setField(term1504, term1504.getClass(), "enabled", null);
        setField(term1504, term1504.getClass(), "age", null);
        setField(term1504, term1504.getClass(), "phoneNumber", null);
        setField(term1504, term1504.getClass(), "country", null);
        setField(term1504, term1504.getClass(), "birthdate", null);
        setField(term1504, term1504.getClass(), "roles", null);
        setBooleanField(term1504, term1504.getClass(), "isUsing2FA", false);
        setField(term1504, term1504.getClass(), "secret", null);
        setField(term1504, term1504.getClass(), "regDate", null);
        setField(term1504, term1504.getClass(), "modDate", null);
        setField(term1501, term1501.getClass(), "user", term1504);
        setField(term1501, term1501.getClass(), "deviceType", "");
        setField(term1501, term1501.getClass(), "deviceId", "");
        setField(term1508, term1508.getClass(), "id", term1509);
        setField(term1508, term1508.getClass(), "token", null);
        setField(term1508, term1508.getClass(), "userDevice", null);
        setField(term1508, term1508.getClass(), "refreshCount", term1511);
        setField(term1508, term1508.getClass(), "expiryDate", null);
        setField(term1501, term1501.getClass(), "refreshToken", term1508);
        setField(term1501, term1501.getClass(), "isRefreshActive", term1513);
        setField(term1486, term1486.getClass(), "userDevice", term1501);
        setField(term1486, term1486.getClass(), "refreshCount", term1515);
        setLongField(term1517, term1517.getClass(), "seconds", 1744090065L);
        setIntField(term1517, term1517.getClass(), "nanos", 937000000);
        setField(term1486, term1486.getClass(), "expiryDate", term1517);
        setField(term1343, term1343.getClass(), "refreshToken", term1486);
        setField(term1343, term1343.getClass(), "isRefreshActive", term1520);
        setField(term1328, term1328.getClass(), "userDevice", term1343);
        setField(term1328, term1328.getClass(), "refreshCount", term1522);
        setLongField(term1524, term1524.getClass(), "seconds", 1347400561L);
        setIntField(term1524, term1524.getClass(), "nanos", 385000000);
        setField(term1328, term1328.getClass(), "expiryDate", term1524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.service.JwtUserDeviceService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Object[] args = new Object[1];
        args[0] = term1328;
        callMethod(klass, "verifyRefreshAvailability", argTypes, null, args);
    }

};


