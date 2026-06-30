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

public class AdmUserDTO_setCountry_211107847123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9888;

    public AdmUserDTO_setCountry_211107847123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9889 = new Long(1964822153944985001L);
        Boolean term9927 = new Boolean(false);
        Integer term9929 = new Integer(663292551);
        Boolean term9967 = new Boolean(false);
        Long term9984 = new Long(-955253666696787757L);
        ArrayList term9986 = new ArrayList();
        ArrayList term9989 = new ArrayList();
        ((ArrayList) term9989).add((Object)null);
        ((ArrayList) term9989).add((Object)null);
        ((ArrayList) term9989).add((Object)null);
        ((ArrayList) term9989).add((Object)null);
        ((ArrayList) term9989).add((Object)null);
        Object term9983 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term9983, term9983.getClass(), "id", term9984);
        setField(term9983, term9983.getClass(), "users", term9986);
        setField(term9983, term9983.getClass(), "privileges", term9989);
        setField(term9983, term9983.getClass(), "name", "");
        Long term9994 = new Long(-5367775625638780650L);
        ArrayList term9996 = new ArrayList();
        ((ArrayList) term9996).add((Object)null);
        ((ArrayList) term9996).add((Object)null);
        ArrayList term9999 = new ArrayList();
        ((ArrayList) term9999).add((Object)null);
        ((ArrayList) term9999).add((Object)null);
        ((ArrayList) term9999).add((Object)null);
        ((ArrayList) term9999).add((Object)null);
        ((ArrayList) term9999).add((Object)null);
        ((ArrayList) term9999).add((Object)null);
        ((ArrayList) term9999).add((Object)null);
        Object term9993 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term9993, term9993.getClass(), "id", term9994);
        setField(term9993, term9993.getClass(), "users", term9996);
        setField(term9993, term9993.getClass(), "privileges", term9999);
        setField(term9993, term9993.getClass(), "name", "");
        ArrayList term9981 = new ArrayList();
        ((ArrayList) term9981).add(term9983);
        ((ArrayList) term9981).add(term9993);
        term9888 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term10005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10010 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10015 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10016 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10020 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9888, term9888.getClass(), "id", term9889);
        setField(term9888, term9888.getClass(), "membername", "eZGxUfdoFn");
        setField(term9888, term9888.getClass(), "email", "yCWSlaOrSv");
        setField(term9888, term9888.getClass(), "password", "PFpWKxDIRz");
        setField(term9888, term9888.getClass(), "enabled", term9927);
        setField(term9888, term9888.getClass(), "age", term9929);
        setField(term9888, term9888.getClass(), "phoneNumber", "qePuOCwoCf");
        setField(term9888, term9888.getClass(), "country", "vJPujDInGq");
        setField(term9888, term9888.getClass(), "birthdate", "cHZGcMhatT");
        setField(term9888, term9888.getClass(), "isUsing2FA", term9967);
        setField(term9888, term9888.getClass(), "secret", "OZGyrUPedG");
        setField(term9888, term9888.getClass(), "roles", term9981);
        setIntField(term10006, term10006.getClass(), "year", 2017);
        setShortField(term10006, term10006.getClass(), "month", (short) 5);
        setShortField(term10006, term10006.getClass(), "day", (short) 2);
        setField(term10005, term10005.getClass(), "date", term10006);
        setByteField(term10010, term10010.getClass(), "hour", (byte) 7);
        setByteField(term10010, term10010.getClass(), "minute", (byte) 24);
        setByteField(term10010, term10010.getClass(), "second", (byte) 51);
        setIntField(term10010, term10010.getClass(), "nano", 706502334);
        setField(term10005, term10005.getClass(), "time", term10010);
        setField(term9888, term9888.getClass(), "regDate", term10005);
        setIntField(term10016, term10016.getClass(), "year", 2026);
        setShortField(term10016, term10016.getClass(), "month", (short) 11);
        setShortField(term10016, term10016.getClass(), "day", (short) 1);
        setField(term10015, term10015.getClass(), "date", term10016);
        setByteField(term10020, term10020.getClass(), "hour", (byte) 9);
        setByteField(term10020, term10020.getClass(), "minute", (byte) 4);
        setByteField(term10020, term10020.getClass(), "second", (byte) 25);
        setIntField(term10020, term10020.getClass(), "nano", 272299951);
        setField(term10015, term10015.getClass(), "time", term10020);
        setField(term9888, term9888.getClass(), "modDate", term10015);
        setField(term9888, term9888.getClass(), "date", "jaNVteZrZi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bMRkDiPUGu";
        callMethod(klass, "setCountry", argTypes, term9888, args);
    }

};


