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

public class AdmUser_setEnabled_33697565524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5191;
     Object term5338;

    public AdmUser_setEnabled_33697565524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5192 = new Long(768144790810175653L);
        Integer term5230 = new Integer(683666002);
        Boolean term5268 = new Boolean(false);
        Long term5273 = new Long(-1497280900081695731L);
        ArrayList term5275 = new ArrayList();
        ArrayList term5278 = new ArrayList();
        ((ArrayList) term5278).add((Object)null);
        ((ArrayList) term5278).add((Object)null);
        ((ArrayList) term5278).add((Object)null);
        ((ArrayList) term5278).add((Object)null);
        ((ArrayList) term5278).add((Object)null);
        ((ArrayList) term5278).add((Object)null);
        Object term5272 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5272, term5272.getClass(), "id", term5273);
        setField(term5272, term5272.getClass(), "users", term5275);
        setField(term5272, term5272.getClass(), "privileges", term5278);
        setField(term5272, term5272.getClass(), "name", "");
        Long term5283 = new Long(4139034517298316285L);
        ArrayList term5285 = new ArrayList();
        ((ArrayList) term5285).add((Object)null);
        ((ArrayList) term5285).add((Object)null);
        ((ArrayList) term5285).add((Object)null);
        ((ArrayList) term5285).add((Object)null);
        ((ArrayList) term5285).add((Object)null);
        ((ArrayList) term5285).add((Object)null);
        ((ArrayList) term5285).add((Object)null);
        ((ArrayList) term5285).add((Object)null);
        ArrayList term5288 = new ArrayList();
        ((ArrayList) term5288).add((Object)null);
        ((ArrayList) term5288).add((Object)null);
        ((ArrayList) term5288).add((Object)null);
        ((ArrayList) term5288).add((Object)null);
        Object term5282 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5282, term5282.getClass(), "id", term5283);
        setField(term5282, term5282.getClass(), "users", term5285);
        setField(term5282, term5282.getClass(), "privileges", term5288);
        setField(term5282, term5282.getClass(), "name", "");
        Long term5293 = new Long(5319740127125920367L);
        ArrayList term5295 = new ArrayList();
        ((ArrayList) term5295).add((Object)null);
        ((ArrayList) term5295).add((Object)null);
        ((ArrayList) term5295).add((Object)null);
        ArrayList term5298 = new ArrayList();
        ((ArrayList) term5298).add((Object)null);
        ((ArrayList) term5298).add((Object)null);
        ((ArrayList) term5298).add((Object)null);
        ((ArrayList) term5298).add((Object)null);
        ((ArrayList) term5298).add((Object)null);
        Object term5292 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5292, term5292.getClass(), "id", term5293);
        setField(term5292, term5292.getClass(), "users", term5295);
        setField(term5292, term5292.getClass(), "privileges", term5298);
        setField(term5292, term5292.getClass(), "name", "");
        ArrayList term5270 = new ArrayList();
        ((ArrayList) term5270).add(term5272);
        ((ArrayList) term5270).add(term5282);
        ((ArrayList) term5270).add(term5292);
        ((ArrayList) term5270).add(term5292);
        Boolean term5304 = new Boolean(false);
        term5191 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term5318 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5319 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5323 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5328 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5329 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5333 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5191, term5191.getClass(), "id", term5192);
        setField(term5191, term5191.getClass(), "membername", "ZdNcodHERG");
        setField(term5191, term5191.getClass(), "email", "CLHomjAqIM");
        setField(term5191, term5191.getClass(), "password", "mzCFLzFuSj");
        setField(term5191, term5191.getClass(), "age", term5230);
        setField(term5191, term5191.getClass(), "phoneNumber", "WQnMpDlSfA");
        setField(term5191, term5191.getClass(), "country", "aOIvTQtXiv");
        setField(term5191, term5191.getClass(), "birthdate", "IyjDiknqhA");
        setField(term5191, term5191.getClass(), "enabled", term5268);
        setField(term5191, term5191.getClass(), "roles", term5270);
        setField(term5191, term5191.getClass(), "isUsing2FA", term5304);
        setField(term5191, term5191.getClass(), "secret", "fFhdWuJbdC");
        setIntField(term5319, term5319.getClass(), "year", 2020);
        setShortField(term5319, term5319.getClass(), "month", (short) 4);
        setShortField(term5319, term5319.getClass(), "day", (short) 2);
        setField(term5318, term5318.getClass(), "date", term5319);
        setByteField(term5323, term5323.getClass(), "hour", (byte) 11);
        setByteField(term5323, term5323.getClass(), "minute", (byte) 26);
        setByteField(term5323, term5323.getClass(), "second", (byte) 22);
        setIntField(term5323, term5323.getClass(), "nano", 168224721);
        setField(term5318, term5318.getClass(), "time", term5323);
        setField(term5191, term5191.getClass(), "regDate", term5318);
        setIntField(term5329, term5329.getClass(), "year", 2010);
        setShortField(term5329, term5329.getClass(), "month", (short) 10);
        setShortField(term5329, term5329.getClass(), "day", (short) 26);
        setField(term5328, term5328.getClass(), "date", term5329);
        setByteField(term5333, term5333.getClass(), "hour", (byte) 6);
        setByteField(term5333, term5333.getClass(), "minute", (byte) 28);
        setByteField(term5333, term5333.getClass(), "second", (byte) 52);
        setIntField(term5333, term5333.getClass(), "nano", 197540216);
        setField(term5328, term5328.getClass(), "time", term5333);
        setField(term5191, term5191.getClass(), "modDate", term5328);
        term5338 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term5338;
        callMethod(klass, "setEnabled", argTypes, term5191, args);
    }

};


