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

public class PasswordResetToken_setUser_14562895447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14657;
     Object term14793;

    public PasswordResetToken_setUser_14562895447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14658 = new Long(-7185067999629587082L);
        Long term14673 = new Long(8819168165968601827L);
        Boolean term14711 = new Boolean(true);
        Integer term14713 = new Integer(-146054762);
        Long term14754 = new Long(-5212780037221633520L);
        Object term14753 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14753, term14753.getClass(), "id", term14754);
        setField(term14753, term14753.getClass(), "users", null);
        setField(term14753, term14753.getClass(), "privileges", null);
        setField(term14753, term14753.getClass(), "name", null);
        ArrayList term14751 = new ArrayList();
        ((ArrayList) term14751).add(term14753);
        term14657 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term14672 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term14771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14776 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14791 = newInstance(Class.forName("java.util.Date"));
        setField(term14657, term14657.getClass(), "id", term14658);
        setField(term14657, term14657.getClass(), "token", "ZLOixiOrLS");
        setField(term14672, term14672.getClass(), "id", term14673);
        setField(term14672, term14672.getClass(), "membername", "jyRmrZMyEy");
        setField(term14672, term14672.getClass(), "email", "EMhKuKuvTr");
        setField(term14672, term14672.getClass(), "password", "hjuOnNVIUc");
        setField(term14672, term14672.getClass(), "enabled", term14711);
        setField(term14672, term14672.getClass(), "age", term14713);
        setField(term14672, term14672.getClass(), "phoneNumber", "MTxeYrMCEJ");
        setField(term14672, term14672.getClass(), "country", "SbPIlRKXLL");
        setField(term14672, term14672.getClass(), "birthdate", "TGjqGBrVob");
        setField(term14672, term14672.getClass(), "roles", term14751);
        setBooleanField(term14672, term14672.getClass(), "isUsing2FA", false);
        setField(term14672, term14672.getClass(), "secret", "NiLxAEvTVO");
        setIntField(term14772, term14772.getClass(), "year", 2027);
        setShortField(term14772, term14772.getClass(), "month", (short) 10);
        setShortField(term14772, term14772.getClass(), "day", (short) 4);
        setField(term14771, term14771.getClass(), "date", term14772);
        setByteField(term14776, term14776.getClass(), "hour", (byte) 18);
        setByteField(term14776, term14776.getClass(), "minute", (byte) 14);
        setByteField(term14776, term14776.getClass(), "second", (byte) 14);
        setIntField(term14776, term14776.getClass(), "nano", 221363683);
        setField(term14771, term14771.getClass(), "time", term14776);
        setField(term14672, term14672.getClass(), "regDate", term14771);
        setIntField(term14782, term14782.getClass(), "year", 2014);
        setShortField(term14782, term14782.getClass(), "month", (short) 9);
        setShortField(term14782, term14782.getClass(), "day", (short) 21);
        setField(term14781, term14781.getClass(), "date", term14782);
        setByteField(term14786, term14786.getClass(), "hour", (byte) 13);
        setByteField(term14786, term14786.getClass(), "minute", (byte) 30);
        setByteField(term14786, term14786.getClass(), "second", (byte) 57);
        setIntField(term14786, term14786.getClass(), "nano", 749136236);
        setField(term14781, term14781.getClass(), "time", term14786);
        setField(term14672, term14672.getClass(), "modDate", term14781);
        setField(term14657, term14657.getClass(), "user", term14672);
        setLongField(term14791, term14791.getClass(), "fastTime", 1668569229825L);
        setField(term14791, term14791.getClass(), "cdate", null);
        setField(term14657, term14657.getClass(), "expiryDate", term14791);
        Long term14794 = new Long(7170045607484390400L);
        Boolean term14832 = new Boolean(false);
        Integer term14834 = new Integer(877649659);
        Long term14875 = new Long(8650489888932702486L);
        ArrayList term14877 = new ArrayList();
        ArrayList term14880 = new ArrayList();
        ((ArrayList) term14880).add((Object)null);
        ((ArrayList) term14880).add((Object)null);
        Object term14874 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14874, term14874.getClass(), "id", term14875);
        setField(term14874, term14874.getClass(), "users", term14877);
        setField(term14874, term14874.getClass(), "privileges", term14880);
        setField(term14874, term14874.getClass(), "name", "");
        Long term14885 = new Long(2142335215837283347L);
        ArrayList term14887 = new ArrayList();
        ((ArrayList) term14887).add((Object)null);
        ((ArrayList) term14887).add((Object)null);
        ((ArrayList) term14887).add((Object)null);
        ((ArrayList) term14887).add((Object)null);
        ((ArrayList) term14887).add((Object)null);
        ((ArrayList) term14887).add((Object)null);
        ArrayList term14890 = new ArrayList();
        ((ArrayList) term14890).add((Object)null);
        ((ArrayList) term14890).add((Object)null);
        ((ArrayList) term14890).add((Object)null);
        ((ArrayList) term14890).add((Object)null);
        Object term14884 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14884, term14884.getClass(), "id", term14885);
        setField(term14884, term14884.getClass(), "users", term14887);
        setField(term14884, term14884.getClass(), "privileges", term14890);
        setField(term14884, term14884.getClass(), "name", "");
        ArrayList term14872 = new ArrayList();
        ((ArrayList) term14872).add(term14874);
        ((ArrayList) term14872).add(term14884);
        term14793 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term14909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14914 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14919 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14920 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14924 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14793, term14793.getClass(), "id", term14794);
        setField(term14793, term14793.getClass(), "membername", "SffiObxUZK");
        setField(term14793, term14793.getClass(), "email", "uzPbXEJVpP");
        setField(term14793, term14793.getClass(), "password", "vDorZRqjUi");
        setField(term14793, term14793.getClass(), "enabled", term14832);
        setField(term14793, term14793.getClass(), "age", term14834);
        setField(term14793, term14793.getClass(), "phoneNumber", "pTjttMNuyX");
        setField(term14793, term14793.getClass(), "country", "fFPyzrPhJi");
        setField(term14793, term14793.getClass(), "birthdate", "tiYwzLkwHD");
        setField(term14793, term14793.getClass(), "roles", term14872);
        setBooleanField(term14793, term14793.getClass(), "isUsing2FA", false);
        setField(term14793, term14793.getClass(), "secret", "iVSQwPmTaa");
        setIntField(term14910, term14910.getClass(), "year", 2017);
        setShortField(term14910, term14910.getClass(), "month", (short) 10);
        setShortField(term14910, term14910.getClass(), "day", (short) 2);
        setField(term14909, term14909.getClass(), "date", term14910);
        setByteField(term14914, term14914.getClass(), "hour", (byte) 4);
        setByteField(term14914, term14914.getClass(), "minute", (byte) 40);
        setByteField(term14914, term14914.getClass(), "second", (byte) 56);
        setIntField(term14914, term14914.getClass(), "nano", 701221907);
        setField(term14909, term14909.getClass(), "time", term14914);
        setField(term14793, term14793.getClass(), "regDate", term14909);
        setIntField(term14920, term14920.getClass(), "year", 2017);
        setShortField(term14920, term14920.getClass(), "month", (short) 8);
        setShortField(term14920, term14920.getClass(), "day", (short) 6);
        setField(term14919, term14919.getClass(), "date", term14920);
        setByteField(term14924, term14924.getClass(), "hour", (byte) 8);
        setByteField(term14924, term14924.getClass(), "minute", (byte) 40);
        setByteField(term14924, term14924.getClass(), "second", (byte) 43);
        setIntField(term14924, term14924.getClass(), "nano", 384847912);
        setField(term14919, term14919.getClass(), "time", term14924);
        setField(term14793, term14793.getClass(), "modDate", term14919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Object[] args = new Object[1];
        args[0] = term14793;
        callMethod(klass, "setUser", argTypes, term14657, args);
    }

};


