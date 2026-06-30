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

public class VerificationToken_hashCode_192598062512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19190;

    public VerificationToken_hashCode_192598062512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19191 = new Long(-5603191204578376681L);
        Long term19206 = new Long(-2371876403222577001L);
        Boolean term19244 = new Boolean(true);
        Integer term19246 = new Integer(-695279311);
        Long term19287 = new Long(-876052271222651071L);
        Object term19286 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19286, term19286.getClass(), "id", term19287);
        setField(term19286, term19286.getClass(), "users", null);
        setField(term19286, term19286.getClass(), "privileges", null);
        setField(term19286, term19286.getClass(), "name", null);
        Long term19290 = new Long(-239911533409145775L);
        Object term19289 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19289, term19289.getClass(), "id", term19290);
        setField(term19289, term19289.getClass(), "users", null);
        setField(term19289, term19289.getClass(), "privileges", null);
        setField(term19289, term19289.getClass(), "name", null);
        Object term19292 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19292, term19292.getClass(), "id", null);
        setField(term19292, term19292.getClass(), "users", null);
        setField(term19292, term19292.getClass(), "privileges", null);
        setField(term19292, term19292.getClass(), "name", null);
        Long term19294 = new Long(4137076813890606231L);
        Object term19293 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19293, term19293.getClass(), "id", term19294);
        setField(term19293, term19293.getClass(), "users", null);
        setField(term19293, term19293.getClass(), "privileges", null);
        setField(term19293, term19293.getClass(), "name", null);
        Object term19296 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19296, term19296.getClass(), "id", null);
        setField(term19296, term19296.getClass(), "users", null);
        setField(term19296, term19296.getClass(), "privileges", null);
        setField(term19296, term19296.getClass(), "name", null);
        ArrayList term19284 = new ArrayList();
        ((ArrayList) term19284).add(term19286);
        ((ArrayList) term19284).add(term19289);
        ((ArrayList) term19284).add(term19292);
        ((ArrayList) term19284).add(term19286);
        ((ArrayList) term19284).add(term19293);
        ((ArrayList) term19284).add(term19296);
        ((ArrayList) term19284).add(term19296);
        ((ArrayList) term19284).add(term19286);
        ((ArrayList) term19284).add(term19292);
        term19190 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken"));
        Object term19205 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term19312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19317 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19322 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19323 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19327 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19332 = newInstance(Class.forName("java.util.Date"));
        setField(term19190, term19190.getClass(), "id", term19191);
        setField(term19190, term19190.getClass(), "token", "DiWPwuubfu");
        setField(term19205, term19205.getClass(), "id", term19206);
        setField(term19205, term19205.getClass(), "membername", "vXgtAGmDaN");
        setField(term19205, term19205.getClass(), "email", "RAzeZQXqkC");
        setField(term19205, term19205.getClass(), "password", "NxfBiMaFGb");
        setField(term19205, term19205.getClass(), "enabled", term19244);
        setField(term19205, term19205.getClass(), "age", term19246);
        setField(term19205, term19205.getClass(), "phoneNumber", "xKDTKfQIei");
        setField(term19205, term19205.getClass(), "country", "QHAkxVuuIr");
        setField(term19205, term19205.getClass(), "birthdate", "OhJSELmFDf");
        setField(term19205, term19205.getClass(), "roles", term19284);
        setBooleanField(term19205, term19205.getClass(), "isUsing2FA", false);
        setField(term19205, term19205.getClass(), "secret", "SmpXEpmGyR");
        setIntField(term19313, term19313.getClass(), "year", 2025);
        setShortField(term19313, term19313.getClass(), "month", (short) 12);
        setShortField(term19313, term19313.getClass(), "day", (short) 14);
        setField(term19312, term19312.getClass(), "date", term19313);
        setByteField(term19317, term19317.getClass(), "hour", (byte) 1);
        setByteField(term19317, term19317.getClass(), "minute", (byte) 23);
        setByteField(term19317, term19317.getClass(), "second", (byte) 11);
        setIntField(term19317, term19317.getClass(), "nano", 960271904);
        setField(term19312, term19312.getClass(), "time", term19317);
        setField(term19205, term19205.getClass(), "regDate", term19312);
        setIntField(term19323, term19323.getClass(), "year", 2012);
        setShortField(term19323, term19323.getClass(), "month", (short) 7);
        setShortField(term19323, term19323.getClass(), "day", (short) 22);
        setField(term19322, term19322.getClass(), "date", term19323);
        setByteField(term19327, term19327.getClass(), "hour", (byte) 6);
        setByteField(term19327, term19327.getClass(), "minute", (byte) 13);
        setByteField(term19327, term19327.getClass(), "second", (byte) 54);
        setIntField(term19327, term19327.getClass(), "nano", 382913207);
        setField(term19322, term19322.getClass(), "time", term19327);
        setField(term19205, term19205.getClass(), "modDate", term19322);
        setField(term19190, term19190.getClass(), "user", term19205);
        setLongField(term19332, term19332.getClass(), "fastTime", 1311560117361L);
        setField(term19332, term19332.getClass(), "cdate", null);
        setField(term19190, term19190.getClass(), "expiryDate", term19332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term19190, args);
    }

};


