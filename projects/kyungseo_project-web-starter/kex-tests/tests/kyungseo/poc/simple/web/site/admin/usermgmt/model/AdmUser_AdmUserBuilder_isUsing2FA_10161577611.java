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

public class AdmUser_AdmUserBuilder_isUsing2FA_10161577611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8881;
     Object term9018;

    public AdmUser_AdmUserBuilder_isUsing2FA_10161577611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8882 = new Long(-955253666696787757L);
        Integer term8920 = new Integer(-1885090354);
        Boolean term8958 = new Boolean(false);
        Long term8963 = new Long(-99017747847004910L);
        ArrayList term8965 = new ArrayList();
        ArrayList term8968 = new ArrayList();
        ((ArrayList) term8968).add((Object)null);
        ((ArrayList) term8968).add((Object)null);
        ((ArrayList) term8968).add((Object)null);
        ((ArrayList) term8968).add((Object)null);
        ((ArrayList) term8968).add((Object)null);
        Object term8962 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8962, term8962.getClass(), "id", term8963);
        setField(term8962, term8962.getClass(), "users", term8965);
        setField(term8962, term8962.getClass(), "privileges", term8968);
        setField(term8962, term8962.getClass(), "name", "");
        Long term8973 = new Long(-7830820957252387854L);
        ArrayList term8975 = new ArrayList();
        ((ArrayList) term8975).add((Object)null);
        ((ArrayList) term8975).add((Object)null);
        ArrayList term8978 = new ArrayList();
        ((ArrayList) term8978).add((Object)null);
        ((ArrayList) term8978).add((Object)null);
        ((ArrayList) term8978).add((Object)null);
        ((ArrayList) term8978).add((Object)null);
        ((ArrayList) term8978).add((Object)null);
        ((ArrayList) term8978).add((Object)null);
        ((ArrayList) term8978).add((Object)null);
        Object term8972 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8972, term8972.getClass(), "id", term8973);
        setField(term8972, term8972.getClass(), "users", term8975);
        setField(term8972, term8972.getClass(), "privileges", term8978);
        setField(term8972, term8972.getClass(), "name", "");
        ArrayList term8960 = new ArrayList();
        ((ArrayList) term8960).add(term8962);
        ((ArrayList) term8960).add(term8972);
        Boolean term8984 = new Boolean(false);
        term8881 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder"));
        Object term8998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9003 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9013 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8881, term8881.getClass(), "id", term8882);
        setField(term8881, term8881.getClass(), "membername", "aJUGPodUIW");
        setField(term8881, term8881.getClass(), "email", "NpjPDfnDRd");
        setField(term8881, term8881.getClass(), "password", "SWMYovqYdk");
        setField(term8881, term8881.getClass(), "age", term8920);
        setField(term8881, term8881.getClass(), "phoneNumber", "TQuvAoQcBe");
        setField(term8881, term8881.getClass(), "country", "nGYLfZrtWO");
        setField(term8881, term8881.getClass(), "birthdate", "DBufEhhBCQ");
        setField(term8881, term8881.getClass(), "enabled", term8958);
        setField(term8881, term8881.getClass(), "roles", term8960);
        setField(term8881, term8881.getClass(), "isUsing2FA", term8984);
        setField(term8881, term8881.getClass(), "secret", "GAxMzRqmXU");
        setIntField(term8999, term8999.getClass(), "year", 2017);
        setShortField(term8999, term8999.getClass(), "month", (short) 5);
        setShortField(term8999, term8999.getClass(), "day", (short) 2);
        setField(term8998, term8998.getClass(), "date", term8999);
        setByteField(term9003, term9003.getClass(), "hour", (byte) 7);
        setByteField(term9003, term9003.getClass(), "minute", (byte) 24);
        setByteField(term9003, term9003.getClass(), "second", (byte) 51);
        setIntField(term9003, term9003.getClass(), "nano", 706502334);
        setField(term8998, term8998.getClass(), "time", term9003);
        setField(term8881, term8881.getClass(), "regDate", term8998);
        setIntField(term9009, term9009.getClass(), "year", 2026);
        setShortField(term9009, term9009.getClass(), "month", (short) 11);
        setShortField(term9009, term9009.getClass(), "day", (short) 1);
        setField(term9008, term9008.getClass(), "date", term9009);
        setByteField(term9013, term9013.getClass(), "hour", (byte) 9);
        setByteField(term9013, term9013.getClass(), "minute", (byte) 4);
        setByteField(term9013, term9013.getClass(), "second", (byte) 25);
        setIntField(term9013, term9013.getClass(), "nano", 272299951);
        setField(term9008, term9008.getClass(), "time", term9013);
        setField(term8881, term8881.getClass(), "modDate", term9008);
        term9018 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term9018;
        callMethod(klass, "isUsing2FA", argTypes, term8881, args);
    }

};


