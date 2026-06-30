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

public class JwtRefreshToken_getUserDevice_1660638799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29279;

    public JwtRefreshToken_getUserDevice_1660638799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29280 = new Long(4787080389628135236L);
        Long term29295 = new Long(-8904293163264570294L);
        Long term29298 = new Long(-9146144965408025864L);
        Boolean term29336 = new Boolean(true);
        Integer term29338 = new Integer(1092038167);
        ArrayList term29376 = new ArrayList();
        ((ArrayList) term29376).add((Object)null);
        ((ArrayList) term29376).add((Object)null);
        ((ArrayList) term29376).add((Object)null);
        ((ArrayList) term29376).add((Object)null);
        ((ArrayList) term29376).add((Object)null);
        Long term29438 = new Long(-6335495755419361090L);
        Long term29453 = new Long(3290227196375641723L);
        Long term29460 = new Long(1801519101190376402L);
        Long term29462 = new Long(792163591827266376L);
        Boolean term29464 = new Boolean(false);
        Long term29466 = new Long(-4750734247445918143L);
        Boolean term29471 = new Boolean(true);
        Long term29473 = new Long(-6408813588921610323L);
        term29279 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term29294 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term29297 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term29393 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29394 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29398 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29408 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29437 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term29452 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term29455 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term29459 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term29468 = newInstance(Class.forName("java.time.Instant"));
        Object term29475 = newInstance(Class.forName("java.time.Instant"));
        setField(term29279, term29279.getClass(), "id", term29280);
        setField(term29279, term29279.getClass(), "token", "EKjLEMismY");
        setField(term29294, term29294.getClass(), "id", term29295);
        setField(term29297, term29297.getClass(), "id", term29298);
        setField(term29297, term29297.getClass(), "membername", "izJjfCpyvk");
        setField(term29297, term29297.getClass(), "email", "twYgiufVKW");
        setField(term29297, term29297.getClass(), "password", "GUllDkCfSj");
        setField(term29297, term29297.getClass(), "enabled", term29336);
        setField(term29297, term29297.getClass(), "age", term29338);
        setField(term29297, term29297.getClass(), "phoneNumber", "mqvlpDaexC");
        setField(term29297, term29297.getClass(), "country", "mhBCscYMix");
        setField(term29297, term29297.getClass(), "birthdate", "fRCOtyFEqt");
        setField(term29297, term29297.getClass(), "roles", term29376);
        setBooleanField(term29297, term29297.getClass(), "isUsing2FA", false);
        setField(term29297, term29297.getClass(), "secret", "nIusisDwZi");
        setIntField(term29394, term29394.getClass(), "year", 2025);
        setShortField(term29394, term29394.getClass(), "month", (short) 11);
        setShortField(term29394, term29394.getClass(), "day", (short) 23);
        setField(term29393, term29393.getClass(), "date", term29394);
        setByteField(term29398, term29398.getClass(), "hour", (byte) 21);
        setByteField(term29398, term29398.getClass(), "minute", (byte) 5);
        setByteField(term29398, term29398.getClass(), "second", (byte) 32);
        setIntField(term29398, term29398.getClass(), "nano", 194920811);
        setField(term29393, term29393.getClass(), "time", term29398);
        setField(term29297, term29297.getClass(), "regDate", term29393);
        setIntField(term29404, term29404.getClass(), "year", 2023);
        setShortField(term29404, term29404.getClass(), "month", (short) 8);
        setShortField(term29404, term29404.getClass(), "day", (short) 14);
        setField(term29403, term29403.getClass(), "date", term29404);
        setByteField(term29408, term29408.getClass(), "hour", (byte) 0);
        setByteField(term29408, term29408.getClass(), "minute", (byte) 21);
        setByteField(term29408, term29408.getClass(), "second", (byte) 6);
        setIntField(term29408, term29408.getClass(), "nano", 18253801);
        setField(term29403, term29403.getClass(), "time", term29408);
        setField(term29297, term29297.getClass(), "modDate", term29403);
        setField(term29294, term29294.getClass(), "user", term29297);
        setField(term29294, term29294.getClass(), "deviceType", "WFndbCMNJf");
        setField(term29294, term29294.getClass(), "deviceId", "EWuRDOuoGG");
        setField(term29437, term29437.getClass(), "id", term29438);
        setField(term29437, term29437.getClass(), "token", "BmwRvtFFJx");
        setField(term29452, term29452.getClass(), "id", term29453);
        setField(term29455, term29455.getClass(), "id", null);
        setField(term29455, term29455.getClass(), "membername", null);
        setField(term29455, term29455.getClass(), "email", null);
        setField(term29455, term29455.getClass(), "password", null);
        setField(term29455, term29455.getClass(), "enabled", null);
        setField(term29455, term29455.getClass(), "age", null);
        setField(term29455, term29455.getClass(), "phoneNumber", null);
        setField(term29455, term29455.getClass(), "country", null);
        setField(term29455, term29455.getClass(), "birthdate", null);
        setField(term29455, term29455.getClass(), "roles", null);
        setBooleanField(term29455, term29455.getClass(), "isUsing2FA", false);
        setField(term29455, term29455.getClass(), "secret", null);
        setField(term29455, term29455.getClass(), "regDate", null);
        setField(term29455, term29455.getClass(), "modDate", null);
        setField(term29452, term29452.getClass(), "user", term29455);
        setField(term29452, term29452.getClass(), "deviceType", "");
        setField(term29452, term29452.getClass(), "deviceId", "");
        setField(term29459, term29459.getClass(), "id", term29460);
        setField(term29459, term29459.getClass(), "token", null);
        setField(term29459, term29459.getClass(), "userDevice", null);
        setField(term29459, term29459.getClass(), "refreshCount", term29462);
        setField(term29459, term29459.getClass(), "expiryDate", null);
        setField(term29452, term29452.getClass(), "refreshToken", term29459);
        setField(term29452, term29452.getClass(), "isRefreshActive", term29464);
        setField(term29437, term29437.getClass(), "userDevice", term29452);
        setField(term29437, term29437.getClass(), "refreshCount", term29466);
        setLongField(term29468, term29468.getClass(), "seconds", 1755788577L);
        setIntField(term29468, term29468.getClass(), "nanos", 674000000);
        setField(term29437, term29437.getClass(), "expiryDate", term29468);
        setField(term29294, term29294.getClass(), "refreshToken", term29437);
        setField(term29294, term29294.getClass(), "isRefreshActive", term29471);
        setField(term29279, term29279.getClass(), "userDevice", term29294);
        setField(term29279, term29279.getClass(), "refreshCount", term29473);
        setLongField(term29475, term29475.getClass(), "seconds", 1291600397L);
        setIntField(term29475, term29475.getClass(), "nanos", 937000000);
        setField(term29279, term29279.getClass(), "expiryDate", term29475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserDevice", argTypes, term29279, args);
    }

};


