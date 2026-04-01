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

public class NewLocationToken_getId_13678610813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11128;

    public NewLocationToken_getId_13678610813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11129 = new Long(-4987344934532917085L);
        Long term11144 = new Long(4832511106024339541L);
        Long term11160 = new Long(7840243516767232066L);
        Boolean term11198 = new Boolean(false);
        Integer term11200 = new Integer(1507074215);
        ArrayList term11238 = new ArrayList();
        ((ArrayList) term11238).add((Object)null);
        ((ArrayList) term11238).add((Object)null);
        term11128 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken"));
        Object term11143 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term11159 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term11255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11260 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11270 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11128, term11128.getClass(), "id", term11129);
        setField(term11128, term11128.getClass(), "token", "XTOiucaEva");
        setField(term11143, term11143.getClass(), "id", term11144);
        setField(term11143, term11143.getClass(), "country", "JMekRNxFMU");
        setBooleanField(term11143, term11143.getClass(), "enabled", false);
        setField(term11159, term11159.getClass(), "id", term11160);
        setField(term11159, term11159.getClass(), "membername", "LBNEEquiet");
        setField(term11159, term11159.getClass(), "email", "cBMdxJirJj");
        setField(term11159, term11159.getClass(), "password", "kVnxgkemHF");
        setField(term11159, term11159.getClass(), "enabled", term11198);
        setField(term11159, term11159.getClass(), "age", term11200);
        setField(term11159, term11159.getClass(), "phoneNumber", "JUQnEoujef");
        setField(term11159, term11159.getClass(), "country", "riXARUiigm");
        setField(term11159, term11159.getClass(), "birthdate", "RbXhBDZbRT");
        setField(term11159, term11159.getClass(), "roles", term11238);
        setBooleanField(term11159, term11159.getClass(), "isUsing2FA", true);
        setField(term11159, term11159.getClass(), "secret", "xwBoTnuoQg");
        setIntField(term11256, term11256.getClass(), "year", 2012);
        setShortField(term11256, term11256.getClass(), "month", (short) 12);
        setShortField(term11256, term11256.getClass(), "day", (short) 5);
        setField(term11255, term11255.getClass(), "date", term11256);
        setByteField(term11260, term11260.getClass(), "hour", (byte) 23);
        setByteField(term11260, term11260.getClass(), "minute", (byte) 26);
        setByteField(term11260, term11260.getClass(), "second", (byte) 26);
        setIntField(term11260, term11260.getClass(), "nano", 226998623);
        setField(term11255, term11255.getClass(), "time", term11260);
        setField(term11159, term11159.getClass(), "regDate", term11255);
        setIntField(term11266, term11266.getClass(), "year", 2020);
        setShortField(term11266, term11266.getClass(), "month", (short) 4);
        setShortField(term11266, term11266.getClass(), "day", (short) 20);
        setField(term11265, term11265.getClass(), "date", term11266);
        setByteField(term11270, term11270.getClass(), "hour", (byte) 6);
        setByteField(term11270, term11270.getClass(), "minute", (byte) 10);
        setByteField(term11270, term11270.getClass(), "second", (byte) 52);
        setIntField(term11270, term11270.getClass(), "nano", 872227966);
        setField(term11265, term11265.getClass(), "time", term11270);
        setField(term11159, term11159.getClass(), "modDate", term11265);
        setField(term11143, term11143.getClass(), "user", term11159);
        setField(term11128, term11128.getClass(), "userLocation", term11143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term11128, args);
    }

};


