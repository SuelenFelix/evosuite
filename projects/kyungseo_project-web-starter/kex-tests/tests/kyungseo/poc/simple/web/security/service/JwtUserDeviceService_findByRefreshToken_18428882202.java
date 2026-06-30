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

public class JwtUserDeviceService_findByRefreshToken_18428882202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term974;

    public JwtUserDeviceService_findByRefreshToken_18428882202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term975 = new Long(5836128569274066678L);
        Long term990 = new Long(-2177368829816872572L);
        Long term993 = new Long(-8463029266761149071L);
        Boolean term1031 = new Boolean(true);
        Integer term1033 = new Integer(-883034806);
        ArrayList term1071 = new ArrayList();
        ((ArrayList) term1071).add((Object)null);
        ((ArrayList) term1071).add((Object)null);
        ((ArrayList) term1071).add((Object)null);
        ((ArrayList) term1071).add((Object)null);
        Long term1133 = new Long(-3936701866695933852L);
        Long term1148 = new Long(1215116475929634177L);
        Long term1155 = new Long(1597484336218508869L);
        Long term1157 = new Long(-5386201758403679145L);
        Boolean term1159 = new Boolean(false);
        Long term1161 = new Long(-7268507582722666254L);
        Boolean term1166 = new Boolean(true);
        Long term1168 = new Long(5671808784468963649L);
        term974 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term989 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term992 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term1088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1093 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1103 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1132 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term1147 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term1150 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term1154 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term1163 = newInstance(Class.forName("java.time.Instant"));
        Object term1170 = newInstance(Class.forName("java.time.Instant"));
        setField(term974, term974.getClass(), "id", term975);
        setField(term974, term974.getClass(), "token", "OYbzXylRWW");
        setField(term989, term989.getClass(), "id", term990);
        setField(term992, term992.getClass(), "id", term993);
        setField(term992, term992.getClass(), "membername", "DSNsTGYXDF");
        setField(term992, term992.getClass(), "email", "sQvGcVjdEx");
        setField(term992, term992.getClass(), "password", "rLHAoqXgPh");
        setField(term992, term992.getClass(), "enabled", term1031);
        setField(term992, term992.getClass(), "age", term1033);
        setField(term992, term992.getClass(), "phoneNumber", "zUlRdimJtU");
        setField(term992, term992.getClass(), "country", "vwbEQQNQrx");
        setField(term992, term992.getClass(), "birthdate", "xtftXXMbem");
        setField(term992, term992.getClass(), "roles", term1071);
        setBooleanField(term992, term992.getClass(), "isUsing2FA", false);
        setField(term992, term992.getClass(), "secret", "nhoHrZfnIN");
        setIntField(term1089, term1089.getClass(), "year", 2016);
        setShortField(term1089, term1089.getClass(), "month", (short) 6);
        setShortField(term1089, term1089.getClass(), "day", (short) 15);
        setField(term1088, term1088.getClass(), "date", term1089);
        setByteField(term1093, term1093.getClass(), "hour", (byte) 21);
        setByteField(term1093, term1093.getClass(), "minute", (byte) 23);
        setByteField(term1093, term1093.getClass(), "second", (byte) 23);
        setIntField(term1093, term1093.getClass(), "nano", 433372070);
        setField(term1088, term1088.getClass(), "time", term1093);
        setField(term992, term992.getClass(), "regDate", term1088);
        setIntField(term1099, term1099.getClass(), "year", 2012);
        setShortField(term1099, term1099.getClass(), "month", (short) 8);
        setShortField(term1099, term1099.getClass(), "day", (short) 25);
        setField(term1098, term1098.getClass(), "date", term1099);
        setByteField(term1103, term1103.getClass(), "hour", (byte) 19);
        setByteField(term1103, term1103.getClass(), "minute", (byte) 49);
        setByteField(term1103, term1103.getClass(), "second", (byte) 8);
        setIntField(term1103, term1103.getClass(), "nano", 912685024);
        setField(term1098, term1098.getClass(), "time", term1103);
        setField(term992, term992.getClass(), "modDate", term1098);
        setField(term989, term989.getClass(), "user", term992);
        setField(term989, term989.getClass(), "deviceType", "ZkMALXpEAZ");
        setField(term989, term989.getClass(), "deviceId", "tXfQjSqDzN");
        setField(term1132, term1132.getClass(), "id", term1133);
        setField(term1132, term1132.getClass(), "token", "BjugTaMcxJ");
        setField(term1147, term1147.getClass(), "id", term1148);
        setField(term1150, term1150.getClass(), "id", null);
        setField(term1150, term1150.getClass(), "membername", null);
        setField(term1150, term1150.getClass(), "email", null);
        setField(term1150, term1150.getClass(), "password", null);
        setField(term1150, term1150.getClass(), "enabled", null);
        setField(term1150, term1150.getClass(), "age", null);
        setField(term1150, term1150.getClass(), "phoneNumber", null);
        setField(term1150, term1150.getClass(), "country", null);
        setField(term1150, term1150.getClass(), "birthdate", null);
        setField(term1150, term1150.getClass(), "roles", null);
        setBooleanField(term1150, term1150.getClass(), "isUsing2FA", false);
        setField(term1150, term1150.getClass(), "secret", null);
        setField(term1150, term1150.getClass(), "regDate", null);
        setField(term1150, term1150.getClass(), "modDate", null);
        setField(term1147, term1147.getClass(), "user", term1150);
        setField(term1147, term1147.getClass(), "deviceType", "");
        setField(term1147, term1147.getClass(), "deviceId", "");
        setField(term1154, term1154.getClass(), "id", term1155);
        setField(term1154, term1154.getClass(), "token", null);
        setField(term1154, term1154.getClass(), "userDevice", null);
        setField(term1154, term1154.getClass(), "refreshCount", term1157);
        setField(term1154, term1154.getClass(), "expiryDate", null);
        setField(term1147, term1147.getClass(), "refreshToken", term1154);
        setField(term1147, term1147.getClass(), "isRefreshActive", term1159);
        setField(term1132, term1132.getClass(), "userDevice", term1147);
        setField(term1132, term1132.getClass(), "refreshCount", term1161);
        setLongField(term1163, term1163.getClass(), "seconds", 1668569229L);
        setIntField(term1163, term1163.getClass(), "nanos", 825000000);
        setField(term1132, term1132.getClass(), "expiryDate", term1163);
        setField(term989, term989.getClass(), "refreshToken", term1132);
        setField(term989, term989.getClass(), "isRefreshActive", term1166);
        setField(term974, term974.getClass(), "userDevice", term989);
        setField(term974, term974.getClass(), "refreshCount", term1168);
        setLongField(term1170, term1170.getClass(), "seconds", 1725122217L);
        setIntField(term1170, term1170.getClass(), "nanos", 647000000);
        setField(term974, term974.getClass(), "expiryDate", term1170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.service.JwtUserDeviceService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Object[] args = new Object[1];
        args[0] = term974;
        callMethod(klass, "findByRefreshToken", argTypes, null, args);
    }

};


