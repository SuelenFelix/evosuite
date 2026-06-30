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

public class AdmUser_AdmUserBuilder_enabled_3649924309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8661;
     Object term8808;

    public AdmUser_AdmUserBuilder_enabled_3649924309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8662 = new Long(1377567570761089535L);
        Integer term8700 = new Integer(1384592638);
        Boolean term8738 = new Boolean(true);
        Long term8743 = new Long(-8531377551015443915L);
        ArrayList term8745 = new ArrayList();
        ((ArrayList) term8745).add((Object)null);
        ((ArrayList) term8745).add((Object)null);
        ((ArrayList) term8745).add((Object)null);
        ((ArrayList) term8745).add((Object)null);
        ((ArrayList) term8745).add((Object)null);
        ArrayList term8748 = new ArrayList();
        ((ArrayList) term8748).add((Object)null);
        Object term8742 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8742, term8742.getClass(), "id", term8743);
        setField(term8742, term8742.getClass(), "users", term8745);
        setField(term8742, term8742.getClass(), "privileges", term8748);
        setField(term8742, term8742.getClass(), "name", "");
        Long term8753 = new Long(3447455321955655601L);
        ArrayList term8755 = new ArrayList();
        ((ArrayList) term8755).add((Object)null);
        ((ArrayList) term8755).add((Object)null);
        ((ArrayList) term8755).add((Object)null);
        ((ArrayList) term8755).add((Object)null);
        ((ArrayList) term8755).add((Object)null);
        ((ArrayList) term8755).add((Object)null);
        ((ArrayList) term8755).add((Object)null);
        ((ArrayList) term8755).add((Object)null);
        ArrayList term8758 = new ArrayList();
        ((ArrayList) term8758).add((Object)null);
        ((ArrayList) term8758).add((Object)null);
        ((ArrayList) term8758).add((Object)null);
        ((ArrayList) term8758).add((Object)null);
        ((ArrayList) term8758).add((Object)null);
        ((ArrayList) term8758).add((Object)null);
        ((ArrayList) term8758).add((Object)null);
        ((ArrayList) term8758).add((Object)null);
        ((ArrayList) term8758).add((Object)null);
        Object term8752 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8752, term8752.getClass(), "id", term8753);
        setField(term8752, term8752.getClass(), "users", term8755);
        setField(term8752, term8752.getClass(), "privileges", term8758);
        setField(term8752, term8752.getClass(), "name", "");
        Long term8763 = new Long(-7574091101944828886L);
        ArrayList term8765 = new ArrayList();
        ((ArrayList) term8765).add((Object)null);
        ((ArrayList) term8765).add((Object)null);
        ArrayList term8768 = new ArrayList();
        ((ArrayList) term8768).add((Object)null);
        ((ArrayList) term8768).add((Object)null);
        ((ArrayList) term8768).add((Object)null);
        ((ArrayList) term8768).add((Object)null);
        ((ArrayList) term8768).add((Object)null);
        ((ArrayList) term8768).add((Object)null);
        ((ArrayList) term8768).add((Object)null);
        ((ArrayList) term8768).add((Object)null);
        ((ArrayList) term8768).add((Object)null);
        Object term8762 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8762, term8762.getClass(), "id", term8763);
        setField(term8762, term8762.getClass(), "users", term8765);
        setField(term8762, term8762.getClass(), "privileges", term8768);
        setField(term8762, term8762.getClass(), "name", "");
        ArrayList term8740 = new ArrayList();
        ((ArrayList) term8740).add(term8742);
        ((ArrayList) term8740).add(term8752);
        ((ArrayList) term8740).add(term8762);
        Boolean term8774 = new Boolean(false);
        term8661 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder"));
        Object term8788 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8789 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8793 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8798 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8799 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8803 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8661, term8661.getClass(), "id", term8662);
        setField(term8661, term8661.getClass(), "membername", "LBPwnVMEpP");
        setField(term8661, term8661.getClass(), "email", "cwALzyQVjH");
        setField(term8661, term8661.getClass(), "password", "jlYNjpdkoz");
        setField(term8661, term8661.getClass(), "age", term8700);
        setField(term8661, term8661.getClass(), "phoneNumber", "DZAGnhJkeU");
        setField(term8661, term8661.getClass(), "country", "xQuVexkiVz");
        setField(term8661, term8661.getClass(), "birthdate", "LqNgPziYtv");
        setField(term8661, term8661.getClass(), "enabled", term8738);
        setField(term8661, term8661.getClass(), "roles", term8740);
        setField(term8661, term8661.getClass(), "isUsing2FA", term8774);
        setField(term8661, term8661.getClass(), "secret", "mTSMXFkWRr");
        setIntField(term8789, term8789.getClass(), "year", 2023);
        setShortField(term8789, term8789.getClass(), "month", (short) 12);
        setShortField(term8789, term8789.getClass(), "day", (short) 3);
        setField(term8788, term8788.getClass(), "date", term8789);
        setByteField(term8793, term8793.getClass(), "hour", (byte) 14);
        setByteField(term8793, term8793.getClass(), "minute", (byte) 6);
        setByteField(term8793, term8793.getClass(), "second", (byte) 20);
        setIntField(term8793, term8793.getClass(), "nano", 660325634);
        setField(term8788, term8788.getClass(), "time", term8793);
        setField(term8661, term8661.getClass(), "regDate", term8788);
        setIntField(term8799, term8799.getClass(), "year", 2019);
        setShortField(term8799, term8799.getClass(), "month", (short) 2);
        setShortField(term8799, term8799.getClass(), "day", (short) 13);
        setField(term8798, term8798.getClass(), "date", term8799);
        setByteField(term8803, term8803.getClass(), "hour", (byte) 5);
        setByteField(term8803, term8803.getClass(), "minute", (byte) 59);
        setByteField(term8803, term8803.getClass(), "second", (byte) 42);
        setIntField(term8803, term8803.getClass(), "nano", 720385556);
        setField(term8798, term8798.getClass(), "time", term8803);
        setField(term8661, term8661.getClass(), "modDate", term8798);
        term8808 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term8808;
        callMethod(klass, "enabled", argTypes, term8661, args);
    }

};


