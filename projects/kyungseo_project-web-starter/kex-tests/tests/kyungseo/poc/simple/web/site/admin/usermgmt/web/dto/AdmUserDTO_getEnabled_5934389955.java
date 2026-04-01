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

public class AdmUserDTO_getEnabled_5934389955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5232;

    public AdmUserDTO_getEnabled_5934389955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5233 = new Long(-7709317346333670618L);
        Boolean term5271 = new Boolean(false);
        Integer term5273 = new Integer(-1034506028);
        Boolean term5311 = new Boolean(false);
        Long term5328 = new Long(-1964501434345816975L);
        ArrayList term5330 = new ArrayList();
        ((ArrayList) term5330).add((Object)null);
        ((ArrayList) term5330).add((Object)null);
        ((ArrayList) term5330).add((Object)null);
        ((ArrayList) term5330).add((Object)null);
        ((ArrayList) term5330).add((Object)null);
        ArrayList term5333 = new ArrayList();
        ((ArrayList) term5333).add((Object)null);
        ((ArrayList) term5333).add((Object)null);
        ((ArrayList) term5333).add((Object)null);
        ((ArrayList) term5333).add((Object)null);
        ((ArrayList) term5333).add((Object)null);
        ((ArrayList) term5333).add((Object)null);
        ((ArrayList) term5333).add((Object)null);
        ((ArrayList) term5333).add((Object)null);
        Object term5327 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5327, term5327.getClass(), "id", term5328);
        setField(term5327, term5327.getClass(), "users", term5330);
        setField(term5327, term5327.getClass(), "privileges", term5333);
        setField(term5327, term5327.getClass(), "name", "");
        Long term5338 = new Long(-6609679920238945303L);
        ArrayList term5340 = new ArrayList();
        ((ArrayList) term5340).add((Object)null);
        ArrayList term5343 = new ArrayList();
        ((ArrayList) term5343).add((Object)null);
        Object term5337 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5337, term5337.getClass(), "id", term5338);
        setField(term5337, term5337.getClass(), "users", term5340);
        setField(term5337, term5337.getClass(), "privileges", term5343);
        setField(term5337, term5337.getClass(), "name", "");
        Long term5348 = new Long(-3033337370154155851L);
        ArrayList term5350 = new ArrayList();
        ((ArrayList) term5350).add((Object)null);
        ((ArrayList) term5350).add((Object)null);
        ((ArrayList) term5350).add((Object)null);
        ((ArrayList) term5350).add((Object)null);
        ((ArrayList) term5350).add((Object)null);
        ((ArrayList) term5350).add((Object)null);
        ((ArrayList) term5350).add((Object)null);
        ((ArrayList) term5350).add((Object)null);
        ArrayList term5353 = new ArrayList();
        ((ArrayList) term5353).add((Object)null);
        ((ArrayList) term5353).add((Object)null);
        ((ArrayList) term5353).add((Object)null);
        Object term5347 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5347, term5347.getClass(), "id", term5348);
        setField(term5347, term5347.getClass(), "users", term5350);
        setField(term5347, term5347.getClass(), "privileges", term5353);
        setField(term5347, term5347.getClass(), "name", "");
        ArrayList term5325 = new ArrayList();
        ((ArrayList) term5325).add(term5327);
        ((ArrayList) term5325).add(term5337);
        ((ArrayList) term5325).add(term5347);
        term5232 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term5359 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5360 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5364 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5369 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5370 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5374 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5232, term5232.getClass(), "id", term5233);
        setField(term5232, term5232.getClass(), "membername", "oOnRVGqFmy");
        setField(term5232, term5232.getClass(), "email", "LaXzFIlWMk");
        setField(term5232, term5232.getClass(), "password", "GuVQjhBxma");
        setField(term5232, term5232.getClass(), "enabled", term5271);
        setField(term5232, term5232.getClass(), "age", term5273);
        setField(term5232, term5232.getClass(), "phoneNumber", "WAVMPPbIfL");
        setField(term5232, term5232.getClass(), "country", "GISHLsgALf");
        setField(term5232, term5232.getClass(), "birthdate", "PVykkUSgBq");
        setField(term5232, term5232.getClass(), "isUsing2FA", term5311);
        setField(term5232, term5232.getClass(), "secret", "tnKbZaCsuj");
        setField(term5232, term5232.getClass(), "roles", term5325);
        setIntField(term5360, term5360.getClass(), "year", 2013);
        setShortField(term5360, term5360.getClass(), "month", (short) 1);
        setShortField(term5360, term5360.getClass(), "day", (short) 17);
        setField(term5359, term5359.getClass(), "date", term5360);
        setByteField(term5364, term5364.getClass(), "hour", (byte) 19);
        setByteField(term5364, term5364.getClass(), "minute", (byte) 49);
        setByteField(term5364, term5364.getClass(), "second", (byte) 53);
        setIntField(term5364, term5364.getClass(), "nano", 217542739);
        setField(term5359, term5359.getClass(), "time", term5364);
        setField(term5232, term5232.getClass(), "regDate", term5359);
        setIntField(term5370, term5370.getClass(), "year", 2025);
        setShortField(term5370, term5370.getClass(), "month", (short) 8);
        setShortField(term5370, term5370.getClass(), "day", (short) 8);
        setField(term5369, term5369.getClass(), "date", term5370);
        setByteField(term5374, term5374.getClass(), "hour", (byte) 12);
        setByteField(term5374, term5374.getClass(), "minute", (byte) 29);
        setByteField(term5374, term5374.getClass(), "second", (byte) 36);
        setIntField(term5374, term5374.getClass(), "nano", 329488602);
        setField(term5369, term5369.getClass(), "time", term5374);
        setField(term5232, term5232.getClass(), "modDate", term5369);
        setField(term5232, term5232.getClass(), "date", "TuLgwTZsPP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnabled", argTypes, term5232, args);
    }

};


