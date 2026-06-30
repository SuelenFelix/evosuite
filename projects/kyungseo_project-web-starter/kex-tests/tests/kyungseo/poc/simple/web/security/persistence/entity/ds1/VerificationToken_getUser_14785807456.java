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

public class VerificationToken_getUser_14785807456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17631;

    public VerificationToken_getUser_14785807456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17632 = new Long(-2143540634259970953L);
        Long term17647 = new Long(-6779665610828821838L);
        Boolean term17685 = new Boolean(false);
        Integer term17687 = new Integer(76650923);
        Long term17728 = new Long(7026184159827656720L);
        Object term17727 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term17727, term17727.getClass(), "id", term17728);
        setField(term17727, term17727.getClass(), "users", null);
        setField(term17727, term17727.getClass(), "privileges", null);
        setField(term17727, term17727.getClass(), "name", null);
        Object term17730 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term17730, term17730.getClass(), "id", null);
        setField(term17730, term17730.getClass(), "users", null);
        setField(term17730, term17730.getClass(), "privileges", null);
        setField(term17730, term17730.getClass(), "name", null);
        Long term17732 = new Long(-2791473406557466846L);
        Object term17731 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term17731, term17731.getClass(), "id", term17732);
        setField(term17731, term17731.getClass(), "users", null);
        setField(term17731, term17731.getClass(), "privileges", null);
        setField(term17731, term17731.getClass(), "name", null);
        Long term17735 = new Long(-2991029806121048772L);
        Object term17734 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term17734, term17734.getClass(), "id", term17735);
        setField(term17734, term17734.getClass(), "users", null);
        setField(term17734, term17734.getClass(), "privileges", null);
        setField(term17734, term17734.getClass(), "name", null);
        Object term17737 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term17737, term17737.getClass(), "id", null);
        setField(term17737, term17737.getClass(), "users", null);
        setField(term17737, term17737.getClass(), "privileges", null);
        setField(term17737, term17737.getClass(), "name", null);
        ArrayList term17725 = new ArrayList();
        ((ArrayList) term17725).add(term17727);
        ((ArrayList) term17725).add(term17730);
        ((ArrayList) term17725).add(term17731);
        ((ArrayList) term17725).add(term17734);
        ((ArrayList) term17725).add(term17737);
        term17631 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken"));
        Object term17646 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term17753 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17754 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17758 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17768 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17773 = newInstance(Class.forName("java.util.Date"));
        setField(term17631, term17631.getClass(), "id", term17632);
        setField(term17631, term17631.getClass(), "token", "WSDrFHxHqO");
        setField(term17646, term17646.getClass(), "id", term17647);
        setField(term17646, term17646.getClass(), "membername", "kbdjWUKDix");
        setField(term17646, term17646.getClass(), "email", "jhXmnsQIUw");
        setField(term17646, term17646.getClass(), "password", "qTRnuuLERk");
        setField(term17646, term17646.getClass(), "enabled", term17685);
        setField(term17646, term17646.getClass(), "age", term17687);
        setField(term17646, term17646.getClass(), "phoneNumber", "ieCQQDUgWu");
        setField(term17646, term17646.getClass(), "country", "tIHHXpuCOh");
        setField(term17646, term17646.getClass(), "birthdate", "oCLpbAHyax");
        setField(term17646, term17646.getClass(), "roles", term17725);
        setBooleanField(term17646, term17646.getClass(), "isUsing2FA", false);
        setField(term17646, term17646.getClass(), "secret", "EuhpauGeVe");
        setIntField(term17754, term17754.getClass(), "year", 2010);
        setShortField(term17754, term17754.getClass(), "month", (short) 5);
        setShortField(term17754, term17754.getClass(), "day", (short) 25);
        setField(term17753, term17753.getClass(), "date", term17754);
        setByteField(term17758, term17758.getClass(), "hour", (byte) 17);
        setByteField(term17758, term17758.getClass(), "minute", (byte) 23);
        setByteField(term17758, term17758.getClass(), "second", (byte) 21);
        setIntField(term17758, term17758.getClass(), "nano", 681441380);
        setField(term17753, term17753.getClass(), "time", term17758);
        setField(term17646, term17646.getClass(), "regDate", term17753);
        setIntField(term17764, term17764.getClass(), "year", 2019);
        setShortField(term17764, term17764.getClass(), "month", (short) 11);
        setShortField(term17764, term17764.getClass(), "day", (short) 2);
        setField(term17763, term17763.getClass(), "date", term17764);
        setByteField(term17768, term17768.getClass(), "hour", (byte) 0);
        setByteField(term17768, term17768.getClass(), "minute", (byte) 49);
        setByteField(term17768, term17768.getClass(), "second", (byte) 45);
        setIntField(term17768, term17768.getClass(), "nano", 193831568);
        setField(term17763, term17763.getClass(), "time", term17768);
        setField(term17646, term17646.getClass(), "modDate", term17763);
        setField(term17631, term17631.getClass(), "user", term17646);
        setLongField(term17773, term17773.getClass(), "fastTime", 1496859828764L);
        setField(term17773, term17773.getClass(), "cdate", null);
        setField(term17631, term17631.getClass(), "expiryDate", term17773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term17631, args);
    }

};


