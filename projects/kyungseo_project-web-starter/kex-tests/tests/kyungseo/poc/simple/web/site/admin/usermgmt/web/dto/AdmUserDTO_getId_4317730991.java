package kyungseo.poc.simple.web.site.admin.usermgmt.web.dto;

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
import static kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class AdmUserDTO_getId_4317730991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4286;

    public AdmUserDTO_getId_4317730991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4287 = new Long(-4714000263923324167L);
        Boolean term4325 = new Boolean(true);
        Integer term4327 = new Integer(-478195677);
        Boolean term4365 = new Boolean(true);
        ArrayList term4379 = new ArrayList();
        term4286 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term4383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4384 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4388 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4393 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4394 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4398 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4286, term4286.getClass(), "id", term4287);
        setField(term4286, term4286.getClass(), "membername", "zSfoqzJbPT");
        setField(term4286, term4286.getClass(), "email", "QUymMnsCIj");
        setField(term4286, term4286.getClass(), "password", "ikTtOgdVYS");
        setField(term4286, term4286.getClass(), "enabled", term4325);
        setField(term4286, term4286.getClass(), "age", term4327);
        setField(term4286, term4286.getClass(), "phoneNumber", "JptuwlirlS");
        setField(term4286, term4286.getClass(), "country", "TKOMaGswbU");
        setField(term4286, term4286.getClass(), "birthdate", "YcTbglHiUq");
        setField(term4286, term4286.getClass(), "isUsing2FA", term4365);
        setField(term4286, term4286.getClass(), "secret", "TiUqHrjoEU");
        setField(term4286, term4286.getClass(), "roles", term4379);
        setIntField(term4384, term4384.getClass(), "year", 2026);
        setShortField(term4384, term4384.getClass(), "month", (short) 2);
        setShortField(term4384, term4384.getClass(), "day", (short) 5);
        setField(term4383, term4383.getClass(), "date", term4384);
        setByteField(term4388, term4388.getClass(), "hour", (byte) 1);
        setByteField(term4388, term4388.getClass(), "minute", (byte) 38);
        setByteField(term4388, term4388.getClass(), "second", (byte) 15);
        setIntField(term4388, term4388.getClass(), "nano", 167345230);
        setField(term4383, term4383.getClass(), "time", term4388);
        setField(term4286, term4286.getClass(), "regDate", term4383);
        setIntField(term4394, term4394.getClass(), "year", 2029);
        setShortField(term4394, term4394.getClass(), "month", (short) 6);
        setShortField(term4394, term4394.getClass(), "day", (short) 4);
        setField(term4393, term4393.getClass(), "date", term4394);
        setByteField(term4398, term4398.getClass(), "hour", (byte) 22);
        setByteField(term4398, term4398.getClass(), "minute", (byte) 1);
        setByteField(term4398, term4398.getClass(), "second", (byte) 38);
        setIntField(term4398, term4398.getClass(), "nano", 329228491);
        setField(term4393, term4393.getClass(), "time", term4398);
        setField(term4286, term4286.getClass(), "modDate", term4393);
        setField(term4286, term4286.getClass(), "date", "eoEvZbdLjL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4286, args);
    }

};


