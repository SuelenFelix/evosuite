package kyungseo.poc.simple.web.site.admin.usermgmt.web.dto;

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
import static kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class AdmUserDTO_getAge_7816420876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5471;

    public AdmUserDTO_getAge_7816420876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5472 = new Long(768144790810175653L);
        Boolean term5510 = new Boolean(false);
        Integer term5512 = new Integer(683666002);
        Boolean term5550 = new Boolean(true);
        Long term5567 = new Long(-1497280900081695731L);
        ArrayList term5569 = new ArrayList();
        ArrayList term5572 = new ArrayList();
        ((ArrayList) term5572).add((Object)null);
        ((ArrayList) term5572).add((Object)null);
        ((ArrayList) term5572).add((Object)null);
        ((ArrayList) term5572).add((Object)null);
        ((ArrayList) term5572).add((Object)null);
        ((ArrayList) term5572).add((Object)null);
        Object term5566 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5566, term5566.getClass(), "id", term5567);
        setField(term5566, term5566.getClass(), "users", term5569);
        setField(term5566, term5566.getClass(), "privileges", term5572);
        setField(term5566, term5566.getClass(), "name", "");
        Long term5577 = new Long(4139034517298316285L);
        ArrayList term5579 = new ArrayList();
        ((ArrayList) term5579).add((Object)null);
        ((ArrayList) term5579).add((Object)null);
        ((ArrayList) term5579).add((Object)null);
        ((ArrayList) term5579).add((Object)null);
        ((ArrayList) term5579).add((Object)null);
        ((ArrayList) term5579).add((Object)null);
        ((ArrayList) term5579).add((Object)null);
        ((ArrayList) term5579).add((Object)null);
        ArrayList term5582 = new ArrayList();
        ((ArrayList) term5582).add((Object)null);
        ((ArrayList) term5582).add((Object)null);
        ((ArrayList) term5582).add((Object)null);
        ((ArrayList) term5582).add((Object)null);
        Object term5576 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5576, term5576.getClass(), "id", term5577);
        setField(term5576, term5576.getClass(), "users", term5579);
        setField(term5576, term5576.getClass(), "privileges", term5582);
        setField(term5576, term5576.getClass(), "name", "");
        Long term5587 = new Long(5319740127125920367L);
        ArrayList term5589 = new ArrayList();
        ((ArrayList) term5589).add((Object)null);
        ((ArrayList) term5589).add((Object)null);
        ((ArrayList) term5589).add((Object)null);
        ArrayList term5592 = new ArrayList();
        ((ArrayList) term5592).add((Object)null);
        ((ArrayList) term5592).add((Object)null);
        ((ArrayList) term5592).add((Object)null);
        ((ArrayList) term5592).add((Object)null);
        ((ArrayList) term5592).add((Object)null);
        Object term5586 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5586, term5586.getClass(), "id", term5587);
        setField(term5586, term5586.getClass(), "users", term5589);
        setField(term5586, term5586.getClass(), "privileges", term5592);
        setField(term5586, term5586.getClass(), "name", "");
        ArrayList term5564 = new ArrayList();
        ((ArrayList) term5564).add(term5566);
        ((ArrayList) term5564).add(term5576);
        ((ArrayList) term5564).add(term5586);
        ((ArrayList) term5564).add(term5586);
        term5471 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term5598 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5599 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5603 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5613 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5471, term5471.getClass(), "id", term5472);
        setField(term5471, term5471.getClass(), "membername", "KoasxTJGpx");
        setField(term5471, term5471.getClass(), "email", "ceGeARYMoa");
        setField(term5471, term5471.getClass(), "password", "fFWllaiFvh");
        setField(term5471, term5471.getClass(), "enabled", term5510);
        setField(term5471, term5471.getClass(), "age", term5512);
        setField(term5471, term5471.getClass(), "phoneNumber", "PFTdEDSbvZ");
        setField(term5471, term5471.getClass(), "country", "TbiwoiebNe");
        setField(term5471, term5471.getClass(), "birthdate", "laTITSWZuc");
        setField(term5471, term5471.getClass(), "isUsing2FA", term5550);
        setField(term5471, term5471.getClass(), "secret", "fkzRpxlAqS");
        setField(term5471, term5471.getClass(), "roles", term5564);
        setIntField(term5599, term5599.getClass(), "year", 2028);
        setShortField(term5599, term5599.getClass(), "month", (short) 2);
        setShortField(term5599, term5599.getClass(), "day", (short) 8);
        setField(term5598, term5598.getClass(), "date", term5599);
        setByteField(term5603, term5603.getClass(), "hour", (byte) 16);
        setByteField(term5603, term5603.getClass(), "minute", (byte) 14);
        setByteField(term5603, term5603.getClass(), "second", (byte) 31);
        setIntField(term5603, term5603.getClass(), "nano", 824823232);
        setField(term5598, term5598.getClass(), "time", term5603);
        setField(term5471, term5471.getClass(), "regDate", term5598);
        setIntField(term5609, term5609.getClass(), "year", 2018);
        setShortField(term5609, term5609.getClass(), "month", (short) 9);
        setShortField(term5609, term5609.getClass(), "day", (short) 8);
        setField(term5608, term5608.getClass(), "date", term5609);
        setByteField(term5613, term5613.getClass(), "hour", (byte) 14);
        setByteField(term5613, term5613.getClass(), "minute", (byte) 21);
        setByteField(term5613, term5613.getClass(), "second", (byte) 23);
        setIntField(term5613, term5613.getClass(), "nano", 316911941);
        setField(term5608, term5608.getClass(), "time", term5613);
        setField(term5471, term5471.getClass(), "modDate", term5608);
        setField(term5471, term5471.getClass(), "date", "bOUAgAptAI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAge", argTypes, term5471, args);
    }

};


