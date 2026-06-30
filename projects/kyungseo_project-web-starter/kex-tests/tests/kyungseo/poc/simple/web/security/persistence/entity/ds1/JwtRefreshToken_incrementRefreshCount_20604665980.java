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

public class JwtRefreshToken_incrementRefreshCount_20604665980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26703;

    public JwtRefreshToken_incrementRefreshCount_20604665980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26704 = new Long(3056037435259866024L);
        Long term26719 = new Long(1372923762481191417L);
        Long term26722 = new Long(4307370135092659893L);
        Boolean term26760 = new Boolean(true);
        Integer term26762 = new Integer(2145528170);
        ArrayList term26800 = new ArrayList();
        ((ArrayList) term26800).add((Object)null);
        ((ArrayList) term26800).add((Object)null);
        ((ArrayList) term26800).add((Object)null);
        ((ArrayList) term26800).add((Object)null);
        ((ArrayList) term26800).add((Object)null);
        ((ArrayList) term26800).add((Object)null);
        ((ArrayList) term26800).add((Object)null);
        Long term26862 = new Long(1868058982770066711L);
        Long term26877 = new Long(-2110401611920536569L);
        Long term26880 = new Long(-7772427422426260409L);
        Boolean term26882 = new Boolean(false);
        Integer term26884 = new Integer(-1631048635);
        Long term26890 = new Long(9177575941340536961L);
        Long term26892 = new Long(-7528632195747779L);
        Boolean term26894 = new Boolean(false);
        Long term26896 = new Long(-4184249863979858011L);
        Boolean term26901 = new Boolean(false);
        Long term26903 = new Long(-3524527156552491025L);
        term26703 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term26718 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term26721 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term26817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26822 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26861 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term26876 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term26879 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term26889 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term26898 = newInstance(Class.forName("java.time.Instant"));
        Object term26905 = newInstance(Class.forName("java.time.Instant"));
        setField(term26703, term26703.getClass(), "id", term26704);
        setField(term26703, term26703.getClass(), "token", "YFKtymjreZ");
        setField(term26718, term26718.getClass(), "id", term26719);
        setField(term26721, term26721.getClass(), "id", term26722);
        setField(term26721, term26721.getClass(), "membername", "vnWFBfVdIg");
        setField(term26721, term26721.getClass(), "email", "AiFTACwPhj");
        setField(term26721, term26721.getClass(), "password", "OArCBGiKUA");
        setField(term26721, term26721.getClass(), "enabled", term26760);
        setField(term26721, term26721.getClass(), "age", term26762);
        setField(term26721, term26721.getClass(), "phoneNumber", "TtyfHrKviO");
        setField(term26721, term26721.getClass(), "country", "EUVfrPCqms");
        setField(term26721, term26721.getClass(), "birthdate", "RCugJMrPXR");
        setField(term26721, term26721.getClass(), "roles", term26800);
        setBooleanField(term26721, term26721.getClass(), "isUsing2FA", true);
        setField(term26721, term26721.getClass(), "secret", "agvoIJPMlI");
        setIntField(term26818, term26818.getClass(), "year", 2014);
        setShortField(term26818, term26818.getClass(), "month", (short) 6);
        setShortField(term26818, term26818.getClass(), "day", (short) 4);
        setField(term26817, term26817.getClass(), "date", term26818);
        setByteField(term26822, term26822.getClass(), "hour", (byte) 11);
        setByteField(term26822, term26822.getClass(), "minute", (byte) 47);
        setByteField(term26822, term26822.getClass(), "second", (byte) 18);
        setIntField(term26822, term26822.getClass(), "nano", 119506475);
        setField(term26817, term26817.getClass(), "time", term26822);
        setField(term26721, term26721.getClass(), "regDate", term26817);
        setIntField(term26828, term26828.getClass(), "year", 2016);
        setShortField(term26828, term26828.getClass(), "month", (short) 2);
        setShortField(term26828, term26828.getClass(), "day", (short) 16);
        setField(term26827, term26827.getClass(), "date", term26828);
        setByteField(term26832, term26832.getClass(), "hour", (byte) 4);
        setByteField(term26832, term26832.getClass(), "minute", (byte) 2);
        setByteField(term26832, term26832.getClass(), "second", (byte) 16);
        setIntField(term26832, term26832.getClass(), "nano", 644071727);
        setField(term26827, term26827.getClass(), "time", term26832);
        setField(term26721, term26721.getClass(), "modDate", term26827);
        setField(term26718, term26718.getClass(), "user", term26721);
        setField(term26718, term26718.getClass(), "deviceType", "SKgoTYVFbm");
        setField(term26718, term26718.getClass(), "deviceId", "YjsottiyXZ");
        setField(term26861, term26861.getClass(), "id", term26862);
        setField(term26861, term26861.getClass(), "token", "anZowJfgfR");
        setField(term26876, term26876.getClass(), "id", term26877);
        setField(term26879, term26879.getClass(), "id", term26880);
        setField(term26879, term26879.getClass(), "membername", null);
        setField(term26879, term26879.getClass(), "email", null);
        setField(term26879, term26879.getClass(), "password", null);
        setField(term26879, term26879.getClass(), "enabled", term26882);
        setField(term26879, term26879.getClass(), "age", term26884);
        setField(term26879, term26879.getClass(), "phoneNumber", null);
        setField(term26879, term26879.getClass(), "country", null);
        setField(term26879, term26879.getClass(), "birthdate", null);
        setField(term26879, term26879.getClass(), "roles", null);
        setBooleanField(term26879, term26879.getClass(), "isUsing2FA", true);
        setField(term26879, term26879.getClass(), "secret", null);
        setField(term26879, term26879.getClass(), "regDate", null);
        setField(term26879, term26879.getClass(), "modDate", null);
        setField(term26876, term26876.getClass(), "user", term26879);
        setField(term26876, term26876.getClass(), "deviceType", "");
        setField(term26876, term26876.getClass(), "deviceId", "");
        setField(term26889, term26889.getClass(), "id", term26890);
        setField(term26889, term26889.getClass(), "token", null);
        setField(term26889, term26889.getClass(), "userDevice", null);
        setField(term26889, term26889.getClass(), "refreshCount", term26892);
        setField(term26889, term26889.getClass(), "expiryDate", null);
        setField(term26876, term26876.getClass(), "refreshToken", term26889);
        setField(term26876, term26876.getClass(), "isRefreshActive", term26894);
        setField(term26861, term26861.getClass(), "userDevice", term26876);
        setField(term26861, term26861.getClass(), "refreshCount", term26896);
        setLongField(term26898, term26898.getClass(), "seconds", 1603905786L);
        setIntField(term26898, term26898.getClass(), "nanos", 801000000);
        setField(term26861, term26861.getClass(), "expiryDate", term26898);
        setField(term26718, term26718.getClass(), "refreshToken", term26861);
        setField(term26718, term26718.getClass(), "isRefreshActive", term26901);
        setField(term26703, term26703.getClass(), "userDevice", term26718);
        setField(term26703, term26703.getClass(), "refreshCount", term26903);
        setLongField(term26905, term26905.getClass(), "seconds", 1369539267L);
        setIntField(term26905, term26905.getClass(), "nanos", 611000000);
        setField(term26703, term26703.getClass(), "expiryDate", term26905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "incrementRefreshCount", argTypes, term26703, args);
    }

};


