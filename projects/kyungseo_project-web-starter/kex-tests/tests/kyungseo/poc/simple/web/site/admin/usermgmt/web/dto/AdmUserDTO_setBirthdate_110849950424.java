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

public class AdmUserDTO_setBirthdate_110849950424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10139;

    public AdmUserDTO_setBirthdate_110849950424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10140 = new Long(6545086285386938562L);
        Boolean term10178 = new Boolean(false);
        Integer term10180 = new Integer(197109649);
        Boolean term10218 = new Boolean(false);
        Long term10235 = new Long(3951346165629352117L);
        ArrayList term10237 = new ArrayList();
        ((ArrayList) term10237).add((Object)null);
        ((ArrayList) term10237).add((Object)null);
        ((ArrayList) term10237).add((Object)null);
        ((ArrayList) term10237).add((Object)null);
        ((ArrayList) term10237).add((Object)null);
        ((ArrayList) term10237).add((Object)null);
        ArrayList term10240 = new ArrayList();
        ((ArrayList) term10240).add((Object)null);
        ((ArrayList) term10240).add((Object)null);
        ((ArrayList) term10240).add((Object)null);
        ((ArrayList) term10240).add((Object)null);
        ((ArrayList) term10240).add((Object)null);
        ((ArrayList) term10240).add((Object)null);
        Object term10234 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10234, term10234.getClass(), "id", term10235);
        setField(term10234, term10234.getClass(), "users", term10237);
        setField(term10234, term10234.getClass(), "privileges", term10240);
        setField(term10234, term10234.getClass(), "name", "");
        ArrayList term10232 = new ArrayList();
        ((ArrayList) term10232).add(term10234);
        term10139 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term10246 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10247 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10251 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10261 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10139, term10139.getClass(), "id", term10140);
        setField(term10139, term10139.getClass(), "membername", "xjKxECGyLT");
        setField(term10139, term10139.getClass(), "email", "ffKeJGEXBT");
        setField(term10139, term10139.getClass(), "password", "rsnXTpfhqf");
        setField(term10139, term10139.getClass(), "enabled", term10178);
        setField(term10139, term10139.getClass(), "age", term10180);
        setField(term10139, term10139.getClass(), "phoneNumber", "gzvlGZVfnZ");
        setField(term10139, term10139.getClass(), "country", "rmSqCaXWHi");
        setField(term10139, term10139.getClass(), "birthdate", "ScztqspySK");
        setField(term10139, term10139.getClass(), "isUsing2FA", term10218);
        setField(term10139, term10139.getClass(), "secret", "IvYxGwWoVu");
        setField(term10139, term10139.getClass(), "roles", term10232);
        setIntField(term10247, term10247.getClass(), "year", 2024);
        setShortField(term10247, term10247.getClass(), "month", (short) 11);
        setShortField(term10247, term10247.getClass(), "day", (short) 16);
        setField(term10246, term10246.getClass(), "date", term10247);
        setByteField(term10251, term10251.getClass(), "hour", (byte) 23);
        setByteField(term10251, term10251.getClass(), "minute", (byte) 40);
        setByteField(term10251, term10251.getClass(), "second", (byte) 40);
        setIntField(term10251, term10251.getClass(), "nano", 810133212);
        setField(term10246, term10246.getClass(), "time", term10251);
        setField(term10139, term10139.getClass(), "regDate", term10246);
        setIntField(term10257, term10257.getClass(), "year", 2018);
        setShortField(term10257, term10257.getClass(), "month", (short) 5);
        setShortField(term10257, term10257.getClass(), "day", (short) 15);
        setField(term10256, term10256.getClass(), "date", term10257);
        setByteField(term10261, term10261.getClass(), "hour", (byte) 17);
        setByteField(term10261, term10261.getClass(), "minute", (byte) 19);
        setByteField(term10261, term10261.getClass(), "second", (byte) 28);
        setIntField(term10261, term10261.getClass(), "nano", 153049369);
        setField(term10256, term10256.getClass(), "time", term10261);
        setField(term10139, term10139.getClass(), "modDate", term10256);
        setField(term10139, term10139.getClass(), "date", "rvYqMRgiPA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qOZXeUUmdz";
        callMethod(klass, "setBirthdate", argTypes, term10139, args);
    }

};


