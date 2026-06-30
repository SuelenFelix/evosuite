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

public class JwtRefreshToken_getRefreshCount_57961424910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29588;

    public JwtRefreshToken_getRefreshCount_57961424910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29589 = new Long(3457189632555792192L);
        Long term29604 = new Long(9010920462347251642L);
        Long term29607 = new Long(9164839186810859146L);
        Boolean term29645 = new Boolean(true);
        Integer term29647 = new Integer(-1804322375);
        ArrayList term29685 = new ArrayList();
        ((ArrayList) term29685).add((Object)null);
        ((ArrayList) term29685).add((Object)null);
        Long term29747 = new Long(-4684671918758363337L);
        Long term29762 = new Long(-3816054957330703095L);
        Long term29765 = new Long(-5444968106400021040L);
        Boolean term29767 = new Boolean(false);
        Integer term29769 = new Integer(1595814906);
        Long term29775 = new Long(6773177296493870806L);
        Long term29777 = new Long(7592342194406039680L);
        Boolean term29779 = new Boolean(false);
        Long term29781 = new Long(2743687876169258951L);
        Boolean term29786 = new Boolean(true);
        Long term29788 = new Long(4986949395725716497L);
        term29588 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term29603 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term29606 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term29702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29707 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29717 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29746 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term29761 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term29764 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term29774 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term29783 = newInstance(Class.forName("java.time.Instant"));
        Object term29790 = newInstance(Class.forName("java.time.Instant"));
        setField(term29588, term29588.getClass(), "id", term29589);
        setField(term29588, term29588.getClass(), "token", "JXODZCOpvf");
        setField(term29603, term29603.getClass(), "id", term29604);
        setField(term29606, term29606.getClass(), "id", term29607);
        setField(term29606, term29606.getClass(), "membername", "ycTiGquQOQ");
        setField(term29606, term29606.getClass(), "email", "gtBUZHUXYc");
        setField(term29606, term29606.getClass(), "password", "iFapMdPnGw");
        setField(term29606, term29606.getClass(), "enabled", term29645);
        setField(term29606, term29606.getClass(), "age", term29647);
        setField(term29606, term29606.getClass(), "phoneNumber", "RfWXuIRYLA");
        setField(term29606, term29606.getClass(), "country", "UmDEkQQiuz");
        setField(term29606, term29606.getClass(), "birthdate", "TCXBrRDTcJ");
        setField(term29606, term29606.getClass(), "roles", term29685);
        setBooleanField(term29606, term29606.getClass(), "isUsing2FA", true);
        setField(term29606, term29606.getClass(), "secret", "EfMijZOCRw");
        setIntField(term29703, term29703.getClass(), "year", 2027);
        setShortField(term29703, term29703.getClass(), "month", (short) 1);
        setShortField(term29703, term29703.getClass(), "day", (short) 19);
        setField(term29702, term29702.getClass(), "date", term29703);
        setByteField(term29707, term29707.getClass(), "hour", (byte) 18);
        setByteField(term29707, term29707.getClass(), "minute", (byte) 46);
        setByteField(term29707, term29707.getClass(), "second", (byte) 52);
        setIntField(term29707, term29707.getClass(), "nano", 835577497);
        setField(term29702, term29702.getClass(), "time", term29707);
        setField(term29606, term29606.getClass(), "regDate", term29702);
        setIntField(term29713, term29713.getClass(), "year", 2025);
        setShortField(term29713, term29713.getClass(), "month", (short) 12);
        setShortField(term29713, term29713.getClass(), "day", (short) 28);
        setField(term29712, term29712.getClass(), "date", term29713);
        setByteField(term29717, term29717.getClass(), "hour", (byte) 0);
        setByteField(term29717, term29717.getClass(), "minute", (byte) 36);
        setByteField(term29717, term29717.getClass(), "second", (byte) 46);
        setIntField(term29717, term29717.getClass(), "nano", 197920854);
        setField(term29712, term29712.getClass(), "time", term29717);
        setField(term29606, term29606.getClass(), "modDate", term29712);
        setField(term29603, term29603.getClass(), "user", term29606);
        setField(term29603, term29603.getClass(), "deviceType", "azWfFmeoGN");
        setField(term29603, term29603.getClass(), "deviceId", "HbjtWUINNo");
        setField(term29746, term29746.getClass(), "id", term29747);
        setField(term29746, term29746.getClass(), "token", "HjDczmXwVK");
        setField(term29761, term29761.getClass(), "id", term29762);
        setField(term29764, term29764.getClass(), "id", term29765);
        setField(term29764, term29764.getClass(), "membername", null);
        setField(term29764, term29764.getClass(), "email", null);
        setField(term29764, term29764.getClass(), "password", null);
        setField(term29764, term29764.getClass(), "enabled", term29767);
        setField(term29764, term29764.getClass(), "age", term29769);
        setField(term29764, term29764.getClass(), "phoneNumber", null);
        setField(term29764, term29764.getClass(), "country", null);
        setField(term29764, term29764.getClass(), "birthdate", null);
        setField(term29764, term29764.getClass(), "roles", null);
        setBooleanField(term29764, term29764.getClass(), "isUsing2FA", true);
        setField(term29764, term29764.getClass(), "secret", null);
        setField(term29764, term29764.getClass(), "regDate", null);
        setField(term29764, term29764.getClass(), "modDate", null);
        setField(term29761, term29761.getClass(), "user", term29764);
        setField(term29761, term29761.getClass(), "deviceType", "");
        setField(term29761, term29761.getClass(), "deviceId", "");
        setField(term29774, term29774.getClass(), "id", term29775);
        setField(term29774, term29774.getClass(), "token", null);
        setField(term29774, term29774.getClass(), "userDevice", null);
        setField(term29774, term29774.getClass(), "refreshCount", term29777);
        setField(term29774, term29774.getClass(), "expiryDate", null);
        setField(term29761, term29761.getClass(), "refreshToken", term29774);
        setField(term29761, term29761.getClass(), "isRefreshActive", term29779);
        setField(term29746, term29746.getClass(), "userDevice", term29761);
        setField(term29746, term29746.getClass(), "refreshCount", term29781);
        setLongField(term29783, term29783.getClass(), "seconds", 1416726423L);
        setIntField(term29783, term29783.getClass(), "nanos", 958000000);
        setField(term29746, term29746.getClass(), "expiryDate", term29783);
        setField(term29603, term29603.getClass(), "refreshToken", term29746);
        setField(term29603, term29603.getClass(), "isRefreshActive", term29786);
        setField(term29588, term29588.getClass(), "userDevice", term29603);
        setField(term29588, term29588.getClass(), "refreshCount", term29788);
        setLongField(term29790, term29790.getClass(), "seconds", 1650014053L);
        setIntField(term29790, term29790.getClass(), "nanos", 723000000);
        setField(term29588, term29588.getClass(), "expiryDate", term29790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefreshCount", argTypes, term29588, args);
    }

};


