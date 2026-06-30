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

public class AdmUserDTO_setRegDate_110593568728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10863;
     Object term11022;

    public AdmUserDTO_setRegDate_110593568728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10864 = new Long(-7181112149072926893L);
        Boolean term10902 = new Boolean(false);
        Integer term10904 = new Integer(-1945706126);
        Boolean term10942 = new Boolean(true);
        Long term10959 = new Long(-5850316381591949820L);
        ArrayList term10961 = new ArrayList();
        ((ArrayList) term10961).add((Object)null);
        ((ArrayList) term10961).add((Object)null);
        ((ArrayList) term10961).add((Object)null);
        ((ArrayList) term10961).add((Object)null);
        ((ArrayList) term10961).add((Object)null);
        ((ArrayList) term10961).add((Object)null);
        ArrayList term10964 = new ArrayList();
        ((ArrayList) term10964).add((Object)null);
        ((ArrayList) term10964).add((Object)null);
        ((ArrayList) term10964).add((Object)null);
        ((ArrayList) term10964).add((Object)null);
        ((ArrayList) term10964).add((Object)null);
        ((ArrayList) term10964).add((Object)null);
        Object term10958 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10958, term10958.getClass(), "id", term10959);
        setField(term10958, term10958.getClass(), "users", term10961);
        setField(term10958, term10958.getClass(), "privileges", term10964);
        setField(term10958, term10958.getClass(), "name", "");
        Long term10969 = new Long(-5304831679802174866L);
        ArrayList term10971 = new ArrayList();
        ((ArrayList) term10971).add((Object)null);
        ((ArrayList) term10971).add((Object)null);
        ((ArrayList) term10971).add((Object)null);
        ((ArrayList) term10971).add((Object)null);
        ((ArrayList) term10971).add((Object)null);
        ((ArrayList) term10971).add((Object)null);
        ((ArrayList) term10971).add((Object)null);
        ((ArrayList) term10971).add((Object)null);
        ArrayList term10974 = new ArrayList();
        ((ArrayList) term10974).add((Object)null);
        ((ArrayList) term10974).add((Object)null);
        ((ArrayList) term10974).add((Object)null);
        Object term10968 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10968, term10968.getClass(), "id", term10969);
        setField(term10968, term10968.getClass(), "users", term10971);
        setField(term10968, term10968.getClass(), "privileges", term10974);
        setField(term10968, term10968.getClass(), "name", "");
        Long term10979 = new Long(3660520943100987842L);
        ArrayList term10981 = new ArrayList();
        ((ArrayList) term10981).add((Object)null);
        ((ArrayList) term10981).add((Object)null);
        ((ArrayList) term10981).add((Object)null);
        ((ArrayList) term10981).add((Object)null);
        ((ArrayList) term10981).add((Object)null);
        ((ArrayList) term10981).add((Object)null);
        ((ArrayList) term10981).add((Object)null);
        ArrayList term10984 = new ArrayList();
        ((ArrayList) term10984).add((Object)null);
        ((ArrayList) term10984).add((Object)null);
        ((ArrayList) term10984).add((Object)null);
        ((ArrayList) term10984).add((Object)null);
        ((ArrayList) term10984).add((Object)null);
        ((ArrayList) term10984).add((Object)null);
        ((ArrayList) term10984).add((Object)null);
        Object term10978 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10978, term10978.getClass(), "id", term10979);
        setField(term10978, term10978.getClass(), "users", term10981);
        setField(term10978, term10978.getClass(), "privileges", term10984);
        setField(term10978, term10978.getClass(), "name", "");
        ArrayList term10956 = new ArrayList();
        ((ArrayList) term10956).add(term10958);
        ((ArrayList) term10956).add(term10968);
        ((ArrayList) term10956).add(term10978);
        term10863 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term10990 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10991 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10995 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11000 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11001 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11005 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10863, term10863.getClass(), "id", term10864);
        setField(term10863, term10863.getClass(), "membername", "zSMUNzRRyM");
        setField(term10863, term10863.getClass(), "email", "aKwJiIZSjJ");
        setField(term10863, term10863.getClass(), "password", "lYbeaINKud");
        setField(term10863, term10863.getClass(), "enabled", term10902);
        setField(term10863, term10863.getClass(), "age", term10904);
        setField(term10863, term10863.getClass(), "phoneNumber", "BrwuUkkatt");
        setField(term10863, term10863.getClass(), "country", "NjmSJhbVEM");
        setField(term10863, term10863.getClass(), "birthdate", "aftnGRjhKN");
        setField(term10863, term10863.getClass(), "isUsing2FA", term10942);
        setField(term10863, term10863.getClass(), "secret", "TirWkyiCHh");
        setField(term10863, term10863.getClass(), "roles", term10956);
        setIntField(term10991, term10991.getClass(), "year", 2010);
        setShortField(term10991, term10991.getClass(), "month", (short) 2);
        setShortField(term10991, term10991.getClass(), "day", (short) 22);
        setField(term10990, term10990.getClass(), "date", term10991);
        setByteField(term10995, term10995.getClass(), "hour", (byte) 10);
        setByteField(term10995, term10995.getClass(), "minute", (byte) 57);
        setByteField(term10995, term10995.getClass(), "second", (byte) 47);
        setIntField(term10995, term10995.getClass(), "nano", 236871229);
        setField(term10990, term10990.getClass(), "time", term10995);
        setField(term10863, term10863.getClass(), "regDate", term10990);
        setIntField(term11001, term11001.getClass(), "year", 2028);
        setShortField(term11001, term11001.getClass(), "month", (short) 10);
        setShortField(term11001, term11001.getClass(), "day", (short) 4);
        setField(term11000, term11000.getClass(), "date", term11001);
        setByteField(term11005, term11005.getClass(), "hour", (byte) 7);
        setByteField(term11005, term11005.getClass(), "minute", (byte) 45);
        setByteField(term11005, term11005.getClass(), "second", (byte) 52);
        setIntField(term11005, term11005.getClass(), "nano", 886309979);
        setField(term11000, term11000.getClass(), "time", term11005);
        setField(term10863, term10863.getClass(), "modDate", term11000);
        setField(term10863, term10863.getClass(), "date", "fpyUFzdCwQ");
        term11022 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11023 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11027 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11023, term11023.getClass(), "year", 2026);
        setShortField(term11023, term11023.getClass(), "month", (short) 9);
        setShortField(term11023, term11023.getClass(), "day", (short) 22);
        setField(term11022, term11022.getClass(), "date", term11023);
        setByteField(term11027, term11027.getClass(), "hour", (byte) 22);
        setByteField(term11027, term11027.getClass(), "minute", (byte) 25);
        setByteField(term11027, term11027.getClass(), "second", (byte) 25);
        setIntField(term11027, term11027.getClass(), "nano", 526433618);
        setField(term11022, term11022.getClass(), "time", term11027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term11022;
        callMethod(klass, "setRegDate", argTypes, term10863, args);
    }

};


