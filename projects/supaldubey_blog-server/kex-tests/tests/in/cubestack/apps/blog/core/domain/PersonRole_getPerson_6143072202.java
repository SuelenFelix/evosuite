package in.cubestack.apps.blog.core.domain;

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
import static in.cubestack.apps.blog.core.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Long;

public class PersonRole_getPerson_6143072202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1862;

    public PersonRole_getPerson_6143072202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2126 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term2125 = ((Class) term2126).getDeclaredField((String) "ACTIVE");
        ((Field) term2125).setAccessible(true);
        Object enum5 = ((Field) term2125).get((Object) null);
        ArrayList term1982 = new ArrayList();
        Long term1986 = new Long(5270370404989704783L);
        Long term2021 = new Long(7411271909051562686L);
        Long term2043 = new Long(4872422362414183754L);
        term1862 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.PersonRole"));
        Object term1863 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term1988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1993 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2003 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2008 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Role"));
        Object term2023 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2028 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2033 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2034 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2038 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2045 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2046 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2050 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2060 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1863, term1863.getClass(), "firstName", "ZiaGIbnzTs");
        setField(term1863, term1863.getClass(), "lastName", "tbcdzjIfER");
        setField(term1863, term1863.getClass(), "email", "HyxfbSQYBe");
        setField(term1863, term1863.getClass(), "username", "pCTimMblYc");
        setField(term1863, term1863.getClass(), "password", "hNxWaHcfhY");
        setField(term1863, term1863.getClass(), "profileImage", "RkybSrpybU");
        setField(term1863, term1863.getClass(), "status", enum5);
        setField(term1863, term1863.getClass(), "phone", "xOEqzGAmDU");
        setField(term1863, term1863.getClass(), "countryCode", "eZFUvlxvGV");
        setField(term1863, term1863.getClass(), "salt", "BYqFIqCKAV");
        setField(term1863, term1863.getClass(), "personRoles", term1982);
        setField(term1863, term1863.getClass(), "id", term1986);
        setIntField(term1989, term1989.getClass(), "year", 2029);
        setShortField(term1989, term1989.getClass(), "month", (short) 8);
        setShortField(term1989, term1989.getClass(), "day", (short) 29);
        setField(term1988, term1988.getClass(), "date", term1989);
        setByteField(term1993, term1993.getClass(), "hour", (byte) 15);
        setByteField(term1993, term1993.getClass(), "minute", (byte) 50);
        setByteField(term1993, term1993.getClass(), "second", (byte) 1);
        setIntField(term1993, term1993.getClass(), "nano", 277971904);
        setField(term1988, term1988.getClass(), "time", term1993);
        setField(term1863, term1863.getClass(), "createdAt", term1988);
        setIntField(term1999, term1999.getClass(), "year", 2022);
        setShortField(term1999, term1999.getClass(), "month", (short) 11);
        setShortField(term1999, term1999.getClass(), "day", (short) 16);
        setField(term1998, term1998.getClass(), "date", term1999);
        setByteField(term2003, term2003.getClass(), "hour", (byte) 15);
        setByteField(term2003, term2003.getClass(), "minute", (byte) 54);
        setByteField(term2003, term2003.getClass(), "second", (byte) 2);
        setIntField(term2003, term2003.getClass(), "nano", 733274103);
        setField(term1998, term1998.getClass(), "time", term2003);
        setField(term1863, term1863.getClass(), "updatedAt", term1998);
        setField(term1862, term1862.getClass(), "person", term1863);
        setField(term2008, term2008.getClass(), "roleName", "vrQLuWIDJX");
        setField(term2008, term2008.getClass(), "id", term2021);
        setIntField(term2024, term2024.getClass(), "year", 2019);
        setShortField(term2024, term2024.getClass(), "month", (short) 2);
        setShortField(term2024, term2024.getClass(), "day", (short) 21);
        setField(term2023, term2023.getClass(), "date", term2024);
        setByteField(term2028, term2028.getClass(), "hour", (byte) 5);
        setByteField(term2028, term2028.getClass(), "minute", (byte) 41);
        setByteField(term2028, term2028.getClass(), "second", (byte) 11);
        setIntField(term2028, term2028.getClass(), "nano", 859829782);
        setField(term2023, term2023.getClass(), "time", term2028);
        setField(term2008, term2008.getClass(), "createdAt", term2023);
        setIntField(term2034, term2034.getClass(), "year", 2018);
        setShortField(term2034, term2034.getClass(), "month", (short) 9);
        setShortField(term2034, term2034.getClass(), "day", (short) 28);
        setField(term2033, term2033.getClass(), "date", term2034);
        setByteField(term2038, term2038.getClass(), "hour", (byte) 3);
        setByteField(term2038, term2038.getClass(), "minute", (byte) 37);
        setByteField(term2038, term2038.getClass(), "second", (byte) 46);
        setIntField(term2038, term2038.getClass(), "nano", 763326845);
        setField(term2033, term2033.getClass(), "time", term2038);
        setField(term2008, term2008.getClass(), "updatedAt", term2033);
        setField(term1862, term1862.getClass(), "role", term2008);
        setField(term1862, term1862.getClass(), "id", term2043);
        setIntField(term2046, term2046.getClass(), "year", 2012);
        setShortField(term2046, term2046.getClass(), "month", (short) 9);
        setShortField(term2046, term2046.getClass(), "day", (short) 11);
        setField(term2045, term2045.getClass(), "date", term2046);
        setByteField(term2050, term2050.getClass(), "hour", (byte) 22);
        setByteField(term2050, term2050.getClass(), "minute", (byte) 10);
        setByteField(term2050, term2050.getClass(), "second", (byte) 8);
        setIntField(term2050, term2050.getClass(), "nano", 380008862);
        setField(term2045, term2045.getClass(), "time", term2050);
        setField(term1862, term1862.getClass(), "createdAt", term2045);
        setIntField(term2056, term2056.getClass(), "year", 2021);
        setShortField(term2056, term2056.getClass(), "month", (short) 9);
        setShortField(term2056, term2056.getClass(), "day", (short) 7);
        setField(term2055, term2055.getClass(), "date", term2056);
        setByteField(term2060, term2060.getClass(), "hour", (byte) 5);
        setByteField(term2060, term2060.getClass(), "minute", (byte) 25);
        setByteField(term2060, term2060.getClass(), "second", (byte) 7);
        setIntField(term2060, term2060.getClass(), "nano", 755924076);
        setField(term2055, term2055.getClass(), "time", term2060);
        setField(term1862, term1862.getClass(), "updatedAt", term2055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.PersonRole");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerson", argTypes, term1862, args);
    }

};


