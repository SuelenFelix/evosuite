package in.cubestack.apps.blog.core.resource;

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
import static in.cubestack.apps.blog.core.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class PersonCandidate_from_14939182992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term767;

    public PersonCandidate_from_14939182992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term973 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term972 = ((Class) term973).getDeclaredField((String) "ACTIVE");
        ((Field) term972).setAccessible(true);
        Object enum1 = ((Field) term972).get((Object) null);
        ArrayList term886 = new ArrayList();
        Long term890 = new Long(6967924379644551255L);
        term767 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term892 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term893 = newInstance(Class.forName("java.time.LocalDate"));
        Object term897 = newInstance(Class.forName("java.time.LocalTime"));
        Object term902 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term903 = newInstance(Class.forName("java.time.LocalDate"));
        Object term907 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term767, term767.getClass(), "firstName", "HyxfbSQYBe");
        setField(term767, term767.getClass(), "lastName", "pCTimMblYc");
        setField(term767, term767.getClass(), "email", "hNxWaHcfhY");
        setField(term767, term767.getClass(), "username", "RkybSrpybU");
        setField(term767, term767.getClass(), "password", "xOEqzGAmDU");
        setField(term767, term767.getClass(), "profileImage", "eZFUvlxvGV");
        setField(term767, term767.getClass(), "status", enum1);
        setField(term767, term767.getClass(), "phone", "BYqFIqCKAV");
        setField(term767, term767.getClass(), "countryCode", "vrQLuWIDJX");
        setField(term767, term767.getClass(), "salt", "flxyYxBRtu");
        setField(term767, term767.getClass(), "personRoles", term886);
        setField(term767, term767.getClass(), "id", term890);
        setIntField(term893, term893.getClass(), "year", 2015);
        setShortField(term893, term893.getClass(), "month", (short) 9);
        setShortField(term893, term893.getClass(), "day", (short) 19);
        setField(term892, term892.getClass(), "date", term893);
        setByteField(term897, term897.getClass(), "hour", (byte) 9);
        setByteField(term897, term897.getClass(), "minute", (byte) 4);
        setByteField(term897, term897.getClass(), "second", (byte) 10);
        setIntField(term897, term897.getClass(), "nano", 401765865);
        setField(term892, term892.getClass(), "time", term897);
        setField(term767, term767.getClass(), "createdAt", term892);
        setIntField(term903, term903.getClass(), "year", 2015);
        setShortField(term903, term903.getClass(), "month", (short) 4);
        setShortField(term903, term903.getClass(), "day", (short) 14);
        setField(term902, term902.getClass(), "date", term903);
        setByteField(term907, term907.getClass(), "hour", (byte) 18);
        setByteField(term907, term907.getClass(), "minute", (byte) 24);
        setByteField(term907, term907.getClass(), "second", (byte) 32);
        setIntField(term907, term907.getClass(), "nano", 369233818);
        setField(term902, term902.getClass(), "time", term907);
        setField(term767, term767.getClass(), "updatedAt", term902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Object[] args = new Object[1];
        args[0] = term767;
        callMethod(klass, "from", argTypes, null, args);
    }

};


