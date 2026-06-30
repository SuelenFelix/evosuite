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

public class PasswordResetToken_getId_19929977223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13747;

    public PasswordResetToken_getId_19929977223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13748 = new Long(8628710602325472259L);
        Long term13763 = new Long(-6397802456253967096L);
        Boolean term13801 = new Boolean(false);
        Integer term13803 = new Integer(574481092);
        Long term13844 = new Long(-5097855288490086692L);
        Object term13843 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term13843, term13843.getClass(), "id", term13844);
        setField(term13843, term13843.getClass(), "users", null);
        setField(term13843, term13843.getClass(), "privileges", null);
        setField(term13843, term13843.getClass(), "name", null);
        Object term13846 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term13846, term13846.getClass(), "id", null);
        setField(term13846, term13846.getClass(), "users", null);
        setField(term13846, term13846.getClass(), "privileges", null);
        setField(term13846, term13846.getClass(), "name", null);
        Object term13847 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term13847, term13847.getClass(), "id", null);
        setField(term13847, term13847.getClass(), "users", null);
        setField(term13847, term13847.getClass(), "privileges", null);
        setField(term13847, term13847.getClass(), "name", null);
        Long term13849 = new Long(-5055043026089632641L);
        Object term13848 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term13848, term13848.getClass(), "id", term13849);
        setField(term13848, term13848.getClass(), "users", null);
        setField(term13848, term13848.getClass(), "privileges", null);
        setField(term13848, term13848.getClass(), "name", null);
        Long term13852 = new Long(-2213998544405629464L);
        Object term13851 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term13851, term13851.getClass(), "id", term13852);
        setField(term13851, term13851.getClass(), "users", null);
        setField(term13851, term13851.getClass(), "privileges", null);
        setField(term13851, term13851.getClass(), "name", null);
        ArrayList term13841 = new ArrayList();
        ((ArrayList) term13841).add(term13843);
        ((ArrayList) term13841).add(term13846);
        ((ArrayList) term13841).add(term13847);
        ((ArrayList) term13841).add(term13843);
        ((ArrayList) term13841).add(term13843);
        ((ArrayList) term13841).add(term13848);
        ((ArrayList) term13841).add(term13851);
        ((ArrayList) term13841).add(term13846);
        ((ArrayList) term13841).add(term13851);
        term13747 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term13762 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term13869 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13870 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13874 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13889 = newInstance(Class.forName("java.util.Date"));
        setField(term13747, term13747.getClass(), "id", term13748);
        setField(term13747, term13747.getClass(), "token", "PxscjEhxGk");
        setField(term13762, term13762.getClass(), "id", term13763);
        setField(term13762, term13762.getClass(), "membername", "ePFnljQSHU");
        setField(term13762, term13762.getClass(), "email", "wedLWAuOOY");
        setField(term13762, term13762.getClass(), "password", "oZDNpnQlCv");
        setField(term13762, term13762.getClass(), "enabled", term13801);
        setField(term13762, term13762.getClass(), "age", term13803);
        setField(term13762, term13762.getClass(), "phoneNumber", "NdPeQAHWKN");
        setField(term13762, term13762.getClass(), "country", "giGQTpcQuV");
        setField(term13762, term13762.getClass(), "birthdate", "IWCccrYFQd");
        setField(term13762, term13762.getClass(), "roles", term13841);
        setBooleanField(term13762, term13762.getClass(), "isUsing2FA", true);
        setField(term13762, term13762.getClass(), "secret", "TwXzbEYFtG");
        setIntField(term13870, term13870.getClass(), "year", 2014);
        setShortField(term13870, term13870.getClass(), "month", (short) 7);
        setShortField(term13870, term13870.getClass(), "day", (short) 5);
        setField(term13869, term13869.getClass(), "date", term13870);
        setByteField(term13874, term13874.getClass(), "hour", (byte) 16);
        setByteField(term13874, term13874.getClass(), "minute", (byte) 28);
        setByteField(term13874, term13874.getClass(), "second", (byte) 51);
        setIntField(term13874, term13874.getClass(), "nano", 627591414);
        setField(term13869, term13869.getClass(), "time", term13874);
        setField(term13762, term13762.getClass(), "regDate", term13869);
        setIntField(term13880, term13880.getClass(), "year", 2028);
        setShortField(term13880, term13880.getClass(), "month", (short) 7);
        setShortField(term13880, term13880.getClass(), "day", (short) 20);
        setField(term13879, term13879.getClass(), "date", term13880);
        setByteField(term13884, term13884.getClass(), "hour", (byte) 23);
        setByteField(term13884, term13884.getClass(), "minute", (byte) 53);
        setByteField(term13884, term13884.getClass(), "second", (byte) 34);
        setIntField(term13884, term13884.getClass(), "nano", 196205860);
        setField(term13879, term13879.getClass(), "time", term13884);
        setField(term13762, term13762.getClass(), "modDate", term13879);
        setField(term13747, term13747.getClass(), "user", term13762);
        setLongField(term13889, term13889.getClass(), "fastTime", 1706078172457L);
        setField(term13889, term13889.getClass(), "cdate", null);
        setField(term13747, term13747.getClass(), "expiryDate", term13889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13747, args);
    }

};


