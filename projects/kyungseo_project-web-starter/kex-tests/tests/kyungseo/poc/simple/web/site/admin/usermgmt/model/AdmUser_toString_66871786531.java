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

public class AdmUser_toString_66871786531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6393;

    public AdmUser_toString_66871786531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6394 = new Long(6273670659288205855L);
        Integer term6432 = new Integer(1107176718);
        Boolean term6470 = new Boolean(false);
        ArrayList term6472 = new ArrayList();
        Boolean term6476 = new Boolean(true);
        term6393 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term6490 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6491 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6495 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6500 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6501 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6505 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6393, term6393.getClass(), "id", term6394);
        setField(term6393, term6393.getClass(), "membername", "sBmtvFPDso");
        setField(term6393, term6393.getClass(), "email", "qsUIxrLolr");
        setField(term6393, term6393.getClass(), "password", "IlQxArYcgB");
        setField(term6393, term6393.getClass(), "age", term6432);
        setField(term6393, term6393.getClass(), "phoneNumber", "lIgKCvCuoH");
        setField(term6393, term6393.getClass(), "country", "dHuWgRwLOm");
        setField(term6393, term6393.getClass(), "birthdate", "PsTQDxNIld");
        setField(term6393, term6393.getClass(), "enabled", term6470);
        setField(term6393, term6393.getClass(), "roles", term6472);
        setField(term6393, term6393.getClass(), "isUsing2FA", term6476);
        setField(term6393, term6393.getClass(), "secret", "uoBijJjvaj");
        setIntField(term6491, term6491.getClass(), "year", 2011);
        setShortField(term6491, term6491.getClass(), "month", (short) 9);
        setShortField(term6491, term6491.getClass(), "day", (short) 7);
        setField(term6490, term6490.getClass(), "date", term6491);
        setByteField(term6495, term6495.getClass(), "hour", (byte) 0);
        setByteField(term6495, term6495.getClass(), "minute", (byte) 51);
        setByteField(term6495, term6495.getClass(), "second", (byte) 44);
        setIntField(term6495, term6495.getClass(), "nano", 245610060);
        setField(term6490, term6490.getClass(), "time", term6495);
        setField(term6393, term6393.getClass(), "regDate", term6490);
        setIntField(term6501, term6501.getClass(), "year", 2018);
        setShortField(term6501, term6501.getClass(), "month", (short) 1);
        setShortField(term6501, term6501.getClass(), "day", (short) 29);
        setField(term6500, term6500.getClass(), "date", term6501);
        setByteField(term6505, term6505.getClass(), "hour", (byte) 22);
        setByteField(term6505, term6505.getClass(), "minute", (byte) 20);
        setByteField(term6505, term6505.getClass(), "second", (byte) 36);
        setIntField(term6505, term6505.getClass(), "nano", 74678080);
        setField(term6500, term6500.getClass(), "time", term6505);
        setField(term6393, term6393.getClass(), "modDate", term6500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6393, args);
    }

};


