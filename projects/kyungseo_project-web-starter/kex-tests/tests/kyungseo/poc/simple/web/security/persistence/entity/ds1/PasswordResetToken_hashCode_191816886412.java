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

public class PasswordResetToken_hashCode_191816886412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15993;

    public PasswordResetToken_hashCode_191816886412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15994 = new Long(-5957491491329394218L);
        Long term16009 = new Long(280552269591781447L);
        Boolean term16047 = new Boolean(false);
        Integer term16049 = new Integer(2063762142);
        Long term16090 = new Long(1721306000453653222L);
        Object term16089 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16089, term16089.getClass(), "id", term16090);
        setField(term16089, term16089.getClass(), "users", null);
        setField(term16089, term16089.getClass(), "privileges", null);
        setField(term16089, term16089.getClass(), "name", null);
        Object term16092 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16092, term16092.getClass(), "id", null);
        setField(term16092, term16092.getClass(), "users", null);
        setField(term16092, term16092.getClass(), "privileges", null);
        setField(term16092, term16092.getClass(), "name", null);
        Object term16093 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16093, term16093.getClass(), "id", null);
        setField(term16093, term16093.getClass(), "users", null);
        setField(term16093, term16093.getClass(), "privileges", null);
        setField(term16093, term16093.getClass(), "name", null);
        Object term16094 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16094, term16094.getClass(), "id", null);
        setField(term16094, term16094.getClass(), "users", null);
        setField(term16094, term16094.getClass(), "privileges", null);
        setField(term16094, term16094.getClass(), "name", null);
        Object term16095 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16095, term16095.getClass(), "id", null);
        setField(term16095, term16095.getClass(), "users", null);
        setField(term16095, term16095.getClass(), "privileges", null);
        setField(term16095, term16095.getClass(), "name", null);
        Object term16096 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16096, term16096.getClass(), "id", null);
        setField(term16096, term16096.getClass(), "users", null);
        setField(term16096, term16096.getClass(), "privileges", null);
        setField(term16096, term16096.getClass(), "name", null);
        ArrayList term16087 = new ArrayList();
        ((ArrayList) term16087).add(term16089);
        ((ArrayList) term16087).add(term16092);
        ((ArrayList) term16087).add(term16093);
        ((ArrayList) term16087).add(term16094);
        ((ArrayList) term16087).add(term16095);
        ((ArrayList) term16087).add(term16096);
        term15993 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term16008 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term16112 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16113 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16117 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16127 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16132 = newInstance(Class.forName("java.util.Date"));
        setField(term15993, term15993.getClass(), "id", term15994);
        setField(term15993, term15993.getClass(), "token", "tiGVUUaQMv");
        setField(term16008, term16008.getClass(), "id", term16009);
        setField(term16008, term16008.getClass(), "membername", "NzoNAsaJqr");
        setField(term16008, term16008.getClass(), "email", "VRKEuPftph");
        setField(term16008, term16008.getClass(), "password", "DkRegMkIWt");
        setField(term16008, term16008.getClass(), "enabled", term16047);
        setField(term16008, term16008.getClass(), "age", term16049);
        setField(term16008, term16008.getClass(), "phoneNumber", "IIOFAGjcXe");
        setField(term16008, term16008.getClass(), "country", "XsAUdWVfqM");
        setField(term16008, term16008.getClass(), "birthdate", "WRKAHqtTqT");
        setField(term16008, term16008.getClass(), "roles", term16087);
        setBooleanField(term16008, term16008.getClass(), "isUsing2FA", true);
        setField(term16008, term16008.getClass(), "secret", "WToYKUjMGj");
        setIntField(term16113, term16113.getClass(), "year", 2025);
        setShortField(term16113, term16113.getClass(), "month", (short) 8);
        setShortField(term16113, term16113.getClass(), "day", (short) 27);
        setField(term16112, term16112.getClass(), "date", term16113);
        setByteField(term16117, term16117.getClass(), "hour", (byte) 17);
        setByteField(term16117, term16117.getClass(), "minute", (byte) 10);
        setByteField(term16117, term16117.getClass(), "second", (byte) 17);
        setIntField(term16117, term16117.getClass(), "nano", 43520203);
        setField(term16112, term16112.getClass(), "time", term16117);
        setField(term16008, term16008.getClass(), "regDate", term16112);
        setIntField(term16123, term16123.getClass(), "year", 2029);
        setShortField(term16123, term16123.getClass(), "month", (short) 4);
        setShortField(term16123, term16123.getClass(), "day", (short) 4);
        setField(term16122, term16122.getClass(), "date", term16123);
        setByteField(term16127, term16127.getClass(), "hour", (byte) 21);
        setByteField(term16127, term16127.getClass(), "minute", (byte) 28);
        setByteField(term16127, term16127.getClass(), "second", (byte) 58);
        setIntField(term16127, term16127.getClass(), "nano", 639031577);
        setField(term16122, term16122.getClass(), "time", term16127);
        setField(term16008, term16008.getClass(), "modDate", term16122);
        setField(term15993, term15993.getClass(), "user", term16008);
        setLongField(term16132, term16132.getClass(), "fastTime", 1347400561385L);
        setField(term16132, term16132.getClass(), "cdate", null);
        setField(term15993, term15993.getClass(), "expiryDate", term16132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term15993, args);
    }

};


