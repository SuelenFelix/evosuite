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

public class PasswordResetToken_updateToken_61434447411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15746;

    public PasswordResetToken_updateToken_61434447411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15747 = new Long(3757985447600693853L);
        Long term15762 = new Long(7118424169978013558L);
        Boolean term15800 = new Boolean(true);
        Integer term15802 = new Integer(-233024044);
        Long term15843 = new Long(1145539328952774873L);
        Object term15842 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15842, term15842.getClass(), "id", term15843);
        setField(term15842, term15842.getClass(), "users", null);
        setField(term15842, term15842.getClass(), "privileges", null);
        setField(term15842, term15842.getClass(), "name", null);
        Long term15846 = new Long(-2253606887164749750L);
        Object term15845 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15845, term15845.getClass(), "id", term15846);
        setField(term15845, term15845.getClass(), "users", null);
        setField(term15845, term15845.getClass(), "privileges", null);
        setField(term15845, term15845.getClass(), "name", null);
        Object term15848 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15848, term15848.getClass(), "id", null);
        setField(term15848, term15848.getClass(), "users", null);
        setField(term15848, term15848.getClass(), "privileges", null);
        setField(term15848, term15848.getClass(), "name", null);
        Object term15849 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15849, term15849.getClass(), "id", null);
        setField(term15849, term15849.getClass(), "users", null);
        setField(term15849, term15849.getClass(), "privileges", null);
        setField(term15849, term15849.getClass(), "name", null);
        Object term15850 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15850, term15850.getClass(), "id", null);
        setField(term15850, term15850.getClass(), "users", null);
        setField(term15850, term15850.getClass(), "privileges", null);
        setField(term15850, term15850.getClass(), "name", null);
        Long term15852 = new Long(-8538697616110187183L);
        Object term15851 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15851, term15851.getClass(), "id", term15852);
        setField(term15851, term15851.getClass(), "users", null);
        setField(term15851, term15851.getClass(), "privileges", null);
        setField(term15851, term15851.getClass(), "name", null);
        ArrayList term15840 = new ArrayList();
        ((ArrayList) term15840).add(term15842);
        ((ArrayList) term15840).add(term15845);
        ((ArrayList) term15840).add(term15848);
        ((ArrayList) term15840).add(term15849);
        ((ArrayList) term15840).add(term15850);
        ((ArrayList) term15840).add(term15851);
        term15746 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term15761 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term15869 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15870 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15874 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15889 = newInstance(Class.forName("java.util.Date"));
        setField(term15746, term15746.getClass(), "id", term15747);
        setField(term15746, term15746.getClass(), "token", "cAfXSAOdaf");
        setField(term15761, term15761.getClass(), "id", term15762);
        setField(term15761, term15761.getClass(), "membername", "gFWxmEVAsk");
        setField(term15761, term15761.getClass(), "email", "LmtyEJAnHW");
        setField(term15761, term15761.getClass(), "password", "KPFNRywlFG");
        setField(term15761, term15761.getClass(), "enabled", term15800);
        setField(term15761, term15761.getClass(), "age", term15802);
        setField(term15761, term15761.getClass(), "phoneNumber", "EeSPJPLqrn");
        setField(term15761, term15761.getClass(), "country", "ixVPsPApNw");
        setField(term15761, term15761.getClass(), "birthdate", "xBABghJWNo");
        setField(term15761, term15761.getClass(), "roles", term15840);
        setBooleanField(term15761, term15761.getClass(), "isUsing2FA", false);
        setField(term15761, term15761.getClass(), "secret", "OzwvrniiKl");
        setIntField(term15870, term15870.getClass(), "year", 2019);
        setShortField(term15870, term15870.getClass(), "month", (short) 3);
        setShortField(term15870, term15870.getClass(), "day", (short) 15);
        setField(term15869, term15869.getClass(), "date", term15870);
        setByteField(term15874, term15874.getClass(), "hour", (byte) 19);
        setByteField(term15874, term15874.getClass(), "minute", (byte) 20);
        setByteField(term15874, term15874.getClass(), "second", (byte) 17);
        setIntField(term15874, term15874.getClass(), "nano", 872983779);
        setField(term15869, term15869.getClass(), "time", term15874);
        setField(term15761, term15761.getClass(), "regDate", term15869);
        setIntField(term15880, term15880.getClass(), "year", 2028);
        setShortField(term15880, term15880.getClass(), "month", (short) 10);
        setShortField(term15880, term15880.getClass(), "day", (short) 1);
        setField(term15879, term15879.getClass(), "date", term15880);
        setByteField(term15884, term15884.getClass(), "hour", (byte) 12);
        setByteField(term15884, term15884.getClass(), "minute", (byte) 47);
        setByteField(term15884, term15884.getClass(), "second", (byte) 33);
        setIntField(term15884, term15884.getClass(), "nano", 170475636);
        setField(term15879, term15879.getClass(), "time", term15884);
        setField(term15761, term15761.getClass(), "modDate", term15879);
        setField(term15746, term15746.getClass(), "user", term15761);
        setLongField(term15889, term15889.getClass(), "fastTime", 1744090065937L);
        setField(term15889, term15889.getClass(), "cdate", null);
        setField(term15746, term15746.getClass(), "expiryDate", term15889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "beAkHVBeEQ";
        callMethod(klass, "updateToken", argTypes, term15746, args);
    }

};


