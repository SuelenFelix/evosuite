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
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class User_setEnabled_66941356822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5603;
     Object term5749;

    public User_setEnabled_66941356822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5604 = new Long(5319740127125920367L);
        Boolean term5642 = new Boolean(false);
        Integer term5644 = new Integer(444029505);
        Long term5685 = new Long(6465987664600701876L);
        ArrayList term5687 = new ArrayList();
        ((ArrayList) term5687).add((Object)null);
        ((ArrayList) term5687).add((Object)null);
        ((ArrayList) term5687).add((Object)null);
        ((ArrayList) term5687).add((Object)null);
        ((ArrayList) term5687).add((Object)null);
        ArrayList term5690 = new ArrayList();
        ((ArrayList) term5690).add((Object)null);
        ((ArrayList) term5690).add((Object)null);
        ((ArrayList) term5690).add((Object)null);
        ((ArrayList) term5690).add((Object)null);
        ((ArrayList) term5690).add((Object)null);
        ((ArrayList) term5690).add((Object)null);
        ((ArrayList) term5690).add((Object)null);
        ((ArrayList) term5690).add((Object)null);
        Object term5684 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5684, term5684.getClass(), "id", term5685);
        setField(term5684, term5684.getClass(), "users", term5687);
        setField(term5684, term5684.getClass(), "privileges", term5690);
        setField(term5684, term5684.getClass(), "name", "");
        Long term5695 = new Long(-5871746020807491998L);
        ArrayList term5697 = new ArrayList();
        ((ArrayList) term5697).add((Object)null);
        ((ArrayList) term5697).add((Object)null);
        ((ArrayList) term5697).add((Object)null);
        ((ArrayList) term5697).add((Object)null);
        ((ArrayList) term5697).add((Object)null);
        ((ArrayList) term5697).add((Object)null);
        ((ArrayList) term5697).add((Object)null);
        ((ArrayList) term5697).add((Object)null);
        ArrayList term5700 = new ArrayList();
        ((ArrayList) term5700).add((Object)null);
        ((ArrayList) term5700).add((Object)null);
        ((ArrayList) term5700).add((Object)null);
        Object term5694 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5694, term5694.getClass(), "id", term5695);
        setField(term5694, term5694.getClass(), "users", term5697);
        setField(term5694, term5694.getClass(), "privileges", term5700);
        setField(term5694, term5694.getClass(), "name", "");
        Long term5705 = new Long(146749226579788091L);
        ArrayList term5707 = new ArrayList();
        ((ArrayList) term5707).add((Object)null);
        ((ArrayList) term5707).add((Object)null);
        ((ArrayList) term5707).add((Object)null);
        ((ArrayList) term5707).add((Object)null);
        ((ArrayList) term5707).add((Object)null);
        ((ArrayList) term5707).add((Object)null);
        ArrayList term5710 = new ArrayList();
        ((ArrayList) term5710).add((Object)null);
        ((ArrayList) term5710).add((Object)null);
        ((ArrayList) term5710).add((Object)null);
        ((ArrayList) term5710).add((Object)null);
        ((ArrayList) term5710).add((Object)null);
        ((ArrayList) term5710).add((Object)null);
        ((ArrayList) term5710).add((Object)null);
        ((ArrayList) term5710).add((Object)null);
        Object term5704 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term5704, term5704.getClass(), "id", term5705);
        setField(term5704, term5704.getClass(), "users", term5707);
        setField(term5704, term5704.getClass(), "privileges", term5710);
        setField(term5704, term5704.getClass(), "name", "");
        ArrayList term5682 = new ArrayList();
        ((ArrayList) term5682).add(term5684);
        ((ArrayList) term5682).add(term5694);
        ((ArrayList) term5682).add(term5704);
        term5603 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term5729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5734 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5744 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5603, term5603.getClass(), "id", term5604);
        setField(term5603, term5603.getClass(), "membername", "GuVQjhBxma");
        setField(term5603, term5603.getClass(), "email", "WAVMPPbIfL");
        setField(term5603, term5603.getClass(), "password", "GISHLsgALf");
        setField(term5603, term5603.getClass(), "enabled", term5642);
        setField(term5603, term5603.getClass(), "age", term5644);
        setField(term5603, term5603.getClass(), "phoneNumber", "PVykkUSgBq");
        setField(term5603, term5603.getClass(), "country", "tnKbZaCsuj");
        setField(term5603, term5603.getClass(), "birthdate", "ZFpcYBgLNC");
        setField(term5603, term5603.getClass(), "roles", term5682);
        setBooleanField(term5603, term5603.getClass(), "isUsing2FA", true);
        setField(term5603, term5603.getClass(), "secret", "KoasxTJGpx");
        setIntField(term5730, term5730.getClass(), "year", 2017);
        setShortField(term5730, term5730.getClass(), "month", (short) 8);
        setShortField(term5730, term5730.getClass(), "day", (short) 6);
        setField(term5729, term5729.getClass(), "date", term5730);
        setByteField(term5734, term5734.getClass(), "hour", (byte) 22);
        setByteField(term5734, term5734.getClass(), "minute", (byte) 46);
        setByteField(term5734, term5734.getClass(), "second", (byte) 47);
        setIntField(term5734, term5734.getClass(), "nano", 782967389);
        setField(term5729, term5729.getClass(), "time", term5734);
        setField(term5603, term5603.getClass(), "regDate", term5729);
        setIntField(term5740, term5740.getClass(), "year", 2029);
        setShortField(term5740, term5740.getClass(), "month", (short) 3);
        setShortField(term5740, term5740.getClass(), "day", (short) 3);
        setField(term5739, term5739.getClass(), "date", term5740);
        setByteField(term5744, term5744.getClass(), "hour", (byte) 2);
        setByteField(term5744, term5744.getClass(), "minute", (byte) 29);
        setByteField(term5744, term5744.getClass(), "second", (byte) 54);
        setIntField(term5744, term5744.getClass(), "nano", 846675209);
        setField(term5739, term5739.getClass(), "time", term5744);
        setField(term5603, term5603.getClass(), "modDate", term5739);
        term5749 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term5749;
        callMethod(klass, "setEnabled", argTypes, term5603, args);
    }

};


