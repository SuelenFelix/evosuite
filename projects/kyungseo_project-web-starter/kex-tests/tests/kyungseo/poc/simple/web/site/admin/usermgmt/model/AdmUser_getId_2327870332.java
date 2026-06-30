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

public class AdmUser_getId_2327870332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AdmUser_getId_2327870332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Integer term40 = new Integer(568599855);
        Boolean term78 = new Boolean(false);
        Long term83 = new Long(6375119433582206027L);
        ArrayList term85 = new ArrayList();
        ((ArrayList) term85).add((Object)null);
        ((ArrayList) term85).add((Object)null);
        ((ArrayList) term85).add((Object)null);
        ((ArrayList) term85).add((Object)null);
        ArrayList term88 = new ArrayList();
        ((ArrayList) term88).add((Object)null);
        ((ArrayList) term88).add((Object)null);
        ((ArrayList) term88).add((Object)null);
        ((ArrayList) term88).add((Object)null);
        ((ArrayList) term88).add((Object)null);
        Object term82 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term82, term82.getClass(), "id", term83);
        setField(term82, term82.getClass(), "users", term85);
        setField(term82, term82.getClass(), "privileges", term88);
        setField(term82, term82.getClass(), "name", "");
        Long term93 = new Long(6811161968424632369L);
        ArrayList term95 = new ArrayList();
        ((ArrayList) term95).add((Object)null);
        ((ArrayList) term95).add((Object)null);
        ((ArrayList) term95).add((Object)null);
        ((ArrayList) term95).add((Object)null);
        ((ArrayList) term95).add((Object)null);
        ((ArrayList) term95).add((Object)null);
        ArrayList term98 = new ArrayList();
        ((ArrayList) term98).add((Object)null);
        Object term92 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term92, term92.getClass(), "id", term93);
        setField(term92, term92.getClass(), "users", term95);
        setField(term92, term92.getClass(), "privileges", term98);
        setField(term92, term92.getClass(), "name", "");
        Long term103 = new Long(-8400487765614892086L);
        ArrayList term105 = new ArrayList();
        ((ArrayList) term105).add((Object)null);
        ((ArrayList) term105).add((Object)null);
        ((ArrayList) term105).add((Object)null);
        ((ArrayList) term105).add((Object)null);
        ArrayList term108 = new ArrayList();
        ((ArrayList) term108).add((Object)null);
        ((ArrayList) term108).add((Object)null);
        ((ArrayList) term108).add((Object)null);
        Object term102 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term102, term102.getClass(), "id", term103);
        setField(term102, term102.getClass(), "users", term105);
        setField(term102, term102.getClass(), "privileges", term108);
        setField(term102, term102.getClass(), "name", "");
        Long term113 = new Long(2535595959091595249L);
        ArrayList term115 = new ArrayList();
        ((ArrayList) term115).add((Object)null);
        ((ArrayList) term115).add((Object)null);
        ArrayList term118 = new ArrayList();
        ((ArrayList) term118).add((Object)null);
        ((ArrayList) term118).add((Object)null);
        ((ArrayList) term118).add((Object)null);
        ((ArrayList) term118).add((Object)null);
        ((ArrayList) term118).add((Object)null);
        ((ArrayList) term118).add((Object)null);
        ((ArrayList) term118).add((Object)null);
        ((ArrayList) term118).add((Object)null);
        Object term112 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term112, term112.getClass(), "id", term113);
        setField(term112, term112.getClass(), "users", term115);
        setField(term112, term112.getClass(), "privileges", term118);
        setField(term112, term112.getClass(), "name", "");
        Long term123 = new Long(6967924379644551255L);
        ArrayList term125 = new ArrayList();
        ((ArrayList) term125).add((Object)null);
        ArrayList term128 = new ArrayList();
        ((ArrayList) term128).add((Object)null);
        ((ArrayList) term128).add((Object)null);
        ((ArrayList) term128).add((Object)null);
        ((ArrayList) term128).add((Object)null);
        ((ArrayList) term128).add((Object)null);
        ((ArrayList) term128).add((Object)null);
        Object term122 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term122, term122.getClass(), "id", term123);
        setField(term122, term122.getClass(), "users", term125);
        setField(term122, term122.getClass(), "privileges", term128);
        setField(term122, term122.getClass(), "name", "");
        ArrayList term80 = new ArrayList();
        ((ArrayList) term80).add(term82);
        ((ArrayList) term80).add(term92);
        ((ArrayList) term80).add(term102);
        ((ArrayList) term80).add(term112);
        ((ArrayList) term80).add(term122);
        Boolean term134 = new Boolean(true);
        term1 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term153 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "membername", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "email", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "password", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "age", term40);
        setField(term1, term1.getClass(), "phoneNumber", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "country", "jJCZpVmanW");
        setField(term1, term1.getClass(), "birthdate", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "enabled", term78);
        setField(term1, term1.getClass(), "roles", term80);
        setField(term1, term1.getClass(), "isUsing2FA", term134);
        setField(term1, term1.getClass(), "secret", "BndsHwAFMv");
        setIntField(term149, term149.getClass(), "year", 2029);
        setShortField(term149, term149.getClass(), "month", (short) 8);
        setShortField(term149, term149.getClass(), "day", (short) 29);
        setField(term148, term148.getClass(), "date", term149);
        setByteField(term153, term153.getClass(), "hour", (byte) 15);
        setByteField(term153, term153.getClass(), "minute", (byte) 50);
        setByteField(term153, term153.getClass(), "second", (byte) 1);
        setIntField(term153, term153.getClass(), "nano", 277971904);
        setField(term148, term148.getClass(), "time", term153);
        setField(term1, term1.getClass(), "regDate", term148);
        setIntField(term159, term159.getClass(), "year", 2022);
        setShortField(term159, term159.getClass(), "month", (short) 11);
        setShortField(term159, term159.getClass(), "day", (short) 16);
        setField(term158, term158.getClass(), "date", term159);
        setByteField(term163, term163.getClass(), "hour", (byte) 15);
        setByteField(term163, term163.getClass(), "minute", (byte) 54);
        setByteField(term163, term163.getClass(), "second", (byte) 2);
        setIntField(term163, term163.getClass(), "nano", 733274103);
        setField(term158, term158.getClass(), "time", term163);
        setField(term1, term1.getClass(), "modDate", term158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


