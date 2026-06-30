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

public class AdmUser_AdmUserBuilder_phoneNumber_13706854596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7914;

    public AdmUser_AdmUserBuilder_phoneNumber_13706854596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7915 = new Long(-6423955170741487890L);
        Integer term7953 = new Integer(1598895173);
        Boolean term7991 = new Boolean(false);
        ArrayList term7993 = new ArrayList();
        Boolean term7997 = new Boolean(false);
        term7914 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder"));
        Object term8011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8016 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8026 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7914, term7914.getClass(), "id", term7915);
        setField(term7914, term7914.getClass(), "membername", "rgniLaOaiz");
        setField(term7914, term7914.getClass(), "email", "fzQzzdIOMC");
        setField(term7914, term7914.getClass(), "password", "hLVDOhfCKX");
        setField(term7914, term7914.getClass(), "age", term7953);
        setField(term7914, term7914.getClass(), "phoneNumber", "yXLTfzOgfX");
        setField(term7914, term7914.getClass(), "country", "MANlfBKTPY");
        setField(term7914, term7914.getClass(), "birthdate", "mRoEmuCJhW");
        setField(term7914, term7914.getClass(), "enabled", term7991);
        setField(term7914, term7914.getClass(), "roles", term7993);
        setField(term7914, term7914.getClass(), "isUsing2FA", term7997);
        setField(term7914, term7914.getClass(), "secret", "JJUWbMXpyM");
        setIntField(term8012, term8012.getClass(), "year", 2025);
        setShortField(term8012, term8012.getClass(), "month", (short) 4);
        setShortField(term8012, term8012.getClass(), "day", (short) 6);
        setField(term8011, term8011.getClass(), "date", term8012);
        setByteField(term8016, term8016.getClass(), "hour", (byte) 23);
        setByteField(term8016, term8016.getClass(), "minute", (byte) 17);
        setByteField(term8016, term8016.getClass(), "second", (byte) 11);
        setIntField(term8016, term8016.getClass(), "nano", 928165672);
        setField(term8011, term8011.getClass(), "time", term8016);
        setField(term7914, term7914.getClass(), "regDate", term8011);
        setIntField(term8022, term8022.getClass(), "year", 2022);
        setShortField(term8022, term8022.getClass(), "month", (short) 3);
        setShortField(term8022, term8022.getClass(), "day", (short) 20);
        setField(term8021, term8021.getClass(), "date", term8022);
        setByteField(term8026, term8026.getClass(), "hour", (byte) 20);
        setByteField(term8026, term8026.getClass(), "minute", (byte) 31);
        setByteField(term8026, term8026.getClass(), "second", (byte) 56);
        setIntField(term8026, term8026.getClass(), "nano", 682853702);
        setField(term8021, term8021.getClass(), "time", term8026);
        setField(term7914, term7914.getClass(), "modDate", term8021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KDrRQWVXok";
        callMethod(klass, "phoneNumber", argTypes, term7914, args);
    }

};


