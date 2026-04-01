package kyungseo.poc.simple.web.site.admin.usermgmt.model;

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
import static kyungseo.poc.simple.web.site.admin.usermgmt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class AdmUser_setBirthdate_90951343823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4952;

    public AdmUser_setBirthdate_90951343823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4953 = new Long(-7709317346333670618L);
        Integer term4991 = new Integer(-1034506028);
        Boolean term5029 = new Boolean(true);
        Long term5034 = new Long(-1964501434345816975L);
        ArrayList term5036 = new ArrayList();
        ((ArrayList) term5036).add((Object)null);
        ((ArrayList) term5036).add((Object)null);
        ((ArrayList) term5036).add((Object)null);
        ((ArrayList) term5036).add((Object)null);
        ((ArrayList) term5036).add((Object)null);
        ArrayList term5039 = new ArrayList();
        ((ArrayList) term5039).add((Object)null);
        ((ArrayList) term5039).add((Object)null);
        ((ArrayList) term5039).add((Object)null);
        ((ArrayList) term5039).add((Object)null);
        ((ArrayList) term5039).add((Object)null);
        ((ArrayList) term5039).add((Object)null);
        ((ArrayList) term5039).add((Object)null);
        ((ArrayList) term5039).add((Object)null);
        Object term5033 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5033, term5033.getClass(), "id", term5034);
        setField(term5033, term5033.getClass(), "users", term5036);
        setField(term5033, term5033.getClass(), "privileges", term5039);
        setField(term5033, term5033.getClass(), "name", "");
        Long term5044 = new Long(-6609679920238945303L);
        ArrayList term5046 = new ArrayList();
        ((ArrayList) term5046).add((Object)null);
        ArrayList term5049 = new ArrayList();
        ((ArrayList) term5049).add((Object)null);
        Object term5043 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5043, term5043.getClass(), "id", term5044);
        setField(term5043, term5043.getClass(), "users", term5046);
        setField(term5043, term5043.getClass(), "privileges", term5049);
        setField(term5043, term5043.getClass(), "name", "");
        Long term5054 = new Long(-3033337370154155851L);
        ArrayList term5056 = new ArrayList();
        ((ArrayList) term5056).add((Object)null);
        ((ArrayList) term5056).add((Object)null);
        ((ArrayList) term5056).add((Object)null);
        ((ArrayList) term5056).add((Object)null);
        ((ArrayList) term5056).add((Object)null);
        ((ArrayList) term5056).add((Object)null);
        ((ArrayList) term5056).add((Object)null);
        ((ArrayList) term5056).add((Object)null);
        ArrayList term5059 = new ArrayList();
        ((ArrayList) term5059).add((Object)null);
        ((ArrayList) term5059).add((Object)null);
        ((ArrayList) term5059).add((Object)null);
        Object term5053 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5053, term5053.getClass(), "id", term5054);
        setField(term5053, term5053.getClass(), "users", term5056);
        setField(term5053, term5053.getClass(), "privileges", term5059);
        setField(term5053, term5053.getClass(), "name", "");
        ArrayList term5031 = new ArrayList();
        ((ArrayList) term5031).add(term5033);
        ((ArrayList) term5031).add(term5043);
        ((ArrayList) term5031).add(term5053);
        Boolean term5065 = new Boolean(false);
        term4952 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term5079 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5080 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5084 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5089 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5090 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5094 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4952, term4952.getClass(), "id", term4953);
        setField(term4952, term4952.getClass(), "membername", "VZwkkQktrm");
        setField(term4952, term4952.getClass(), "email", "wIuJvIvEMb");
        setField(term4952, term4952.getClass(), "password", "EyojsbSjWT");
        setField(term4952, term4952.getClass(), "age", term4991);
        setField(term4952, term4952.getClass(), "phoneNumber", "szGicGyWDL");
        setField(term4952, term4952.getClass(), "country", "lkdvUiYwRq");
        setField(term4952, term4952.getClass(), "birthdate", "XuxkPrpfND");
        setField(term4952, term4952.getClass(), "enabled", term5029);
        setField(term4952, term4952.getClass(), "roles", term5031);
        setField(term4952, term4952.getClass(), "isUsing2FA", term5065);
        setField(term4952, term4952.getClass(), "secret", "YVLRenzuoR");
        setIntField(term5080, term5080.getClass(), "year", 2017);
        setShortField(term5080, term5080.getClass(), "month", (short) 8);
        setShortField(term5080, term5080.getClass(), "day", (short) 6);
        setField(term5079, term5079.getClass(), "date", term5080);
        setByteField(term5084, term5084.getClass(), "hour", (byte) 22);
        setByteField(term5084, term5084.getClass(), "minute", (byte) 46);
        setByteField(term5084, term5084.getClass(), "second", (byte) 47);
        setIntField(term5084, term5084.getClass(), "nano", 782967389);
        setField(term5079, term5079.getClass(), "time", term5084);
        setField(term4952, term4952.getClass(), "regDate", term5079);
        setIntField(term5090, term5090.getClass(), "year", 2029);
        setShortField(term5090, term5090.getClass(), "month", (short) 3);
        setShortField(term5090, term5090.getClass(), "day", (short) 3);
        setField(term5089, term5089.getClass(), "date", term5090);
        setByteField(term5094, term5094.getClass(), "hour", (byte) 2);
        setByteField(term5094, term5094.getClass(), "minute", (byte) 29);
        setByteField(term5094, term5094.getClass(), "second", (byte) 54);
        setIntField(term5094, term5094.getClass(), "nano", 846675209);
        setField(term5089, term5089.getClass(), "time", term5094);
        setField(term4952, term4952.getClass(), "modDate", term5089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JukEMhPWql";
        callMethod(klass, "setBirthdate", argTypes, term4952, args);
    }

};


