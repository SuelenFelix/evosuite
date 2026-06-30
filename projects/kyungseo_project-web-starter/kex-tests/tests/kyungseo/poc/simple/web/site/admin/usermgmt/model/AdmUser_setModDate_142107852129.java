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

public class AdmUser_setModDate_142107852129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6156;
     Object term6313;

    public AdmUser_setModDate_142107852129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6157 = new Long(-8692119547314358088L);
        Integer term6195 = new Integer(1072005683);
        Boolean term6233 = new Boolean(true);
        Long term6238 = new Long(-2083524977884307536L);
        ArrayList term6240 = new ArrayList();
        ((ArrayList) term6240).add((Object)null);
        ((ArrayList) term6240).add((Object)null);
        ((ArrayList) term6240).add((Object)null);
        ((ArrayList) term6240).add((Object)null);
        ((ArrayList) term6240).add((Object)null);
        ((ArrayList) term6240).add((Object)null);
        ((ArrayList) term6240).add((Object)null);
        ArrayList term6243 = new ArrayList();
        ((ArrayList) term6243).add((Object)null);
        ((ArrayList) term6243).add((Object)null);
        ((ArrayList) term6243).add((Object)null);
        ((ArrayList) term6243).add((Object)null);
        ((ArrayList) term6243).add((Object)null);
        ((ArrayList) term6243).add((Object)null);
        ((ArrayList) term6243).add((Object)null);
        ((ArrayList) term6243).add((Object)null);
        Object term6237 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term6237, term6237.getClass(), "id", term6238);
        setField(term6237, term6237.getClass(), "users", term6240);
        setField(term6237, term6237.getClass(), "privileges", term6243);
        setField(term6237, term6237.getClass(), "name", "");
        Long term6248 = new Long(-8993073054427011802L);
        ArrayList term6250 = new ArrayList();
        ((ArrayList) term6250).add((Object)null);
        ((ArrayList) term6250).add((Object)null);
        ((ArrayList) term6250).add((Object)null);
        ((ArrayList) term6250).add((Object)null);
        ((ArrayList) term6250).add((Object)null);
        ((ArrayList) term6250).add((Object)null);
        ((ArrayList) term6250).add((Object)null);
        ((ArrayList) term6250).add((Object)null);
        ArrayList term6253 = new ArrayList();
        ((ArrayList) term6253).add((Object)null);
        ((ArrayList) term6253).add((Object)null);
        ((ArrayList) term6253).add((Object)null);
        ((ArrayList) term6253).add((Object)null);
        ((ArrayList) term6253).add((Object)null);
        ((ArrayList) term6253).add((Object)null);
        Object term6247 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term6247, term6247.getClass(), "id", term6248);
        setField(term6247, term6247.getClass(), "users", term6250);
        setField(term6247, term6247.getClass(), "privileges", term6253);
        setField(term6247, term6247.getClass(), "name", "");
        Long term6258 = new Long(6853972830905120647L);
        ArrayList term6260 = new ArrayList();
        ((ArrayList) term6260).add((Object)null);
        ArrayList term6263 = new ArrayList();
        ((ArrayList) term6263).add((Object)null);
        ((ArrayList) term6263).add((Object)null);
        ((ArrayList) term6263).add((Object)null);
        ((ArrayList) term6263).add((Object)null);
        ((ArrayList) term6263).add((Object)null);
        ((ArrayList) term6263).add((Object)null);
        ((ArrayList) term6263).add((Object)null);
        ((ArrayList) term6263).add((Object)null);
        ((ArrayList) term6263).add((Object)null);
        Object term6257 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term6257, term6257.getClass(), "id", term6258);
        setField(term6257, term6257.getClass(), "users", term6260);
        setField(term6257, term6257.getClass(), "privileges", term6263);
        setField(term6257, term6257.getClass(), "name", "");
        Long term6268 = new Long(9062006526792682783L);
        ArrayList term6270 = new ArrayList();
        ((ArrayList) term6270).add((Object)null);
        ArrayList term6273 = new ArrayList();
        ((ArrayList) term6273).add((Object)null);
        ((ArrayList) term6273).add((Object)null);
        ((ArrayList) term6273).add((Object)null);
        ((ArrayList) term6273).add((Object)null);
        ((ArrayList) term6273).add((Object)null);
        ((ArrayList) term6273).add((Object)null);
        ((ArrayList) term6273).add((Object)null);
        ((ArrayList) term6273).add((Object)null);
        Object term6267 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term6267, term6267.getClass(), "id", term6268);
        setField(term6267, term6267.getClass(), "users", term6270);
        setField(term6267, term6267.getClass(), "privileges", term6273);
        setField(term6267, term6267.getClass(), "name", "");
        ArrayList term6235 = new ArrayList();
        ((ArrayList) term6235).add(term6237);
        ((ArrayList) term6235).add(term6247);
        ((ArrayList) term6235).add(term6237);
        ((ArrayList) term6235).add(term6257);
        ((ArrayList) term6235).add(term6267);
        Boolean term6279 = new Boolean(false);
        term6156 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term6293 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6294 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6298 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6308 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6156, term6156.getClass(), "id", term6157);
        setField(term6156, term6156.getClass(), "membername", "KZQwbvujui");
        setField(term6156, term6156.getClass(), "email", "JPUZuGxKlI");
        setField(term6156, term6156.getClass(), "password", "xqIbVsUspl");
        setField(term6156, term6156.getClass(), "age", term6195);
        setField(term6156, term6156.getClass(), "phoneNumber", "GnjLRtJywq");
        setField(term6156, term6156.getClass(), "country", "TDaodpHTRK");
        setField(term6156, term6156.getClass(), "birthdate", "JayazbYDLK");
        setField(term6156, term6156.getClass(), "enabled", term6233);
        setField(term6156, term6156.getClass(), "roles", term6235);
        setField(term6156, term6156.getClass(), "isUsing2FA", term6279);
        setField(term6156, term6156.getClass(), "secret", "crkNabVaWs");
        setIntField(term6294, term6294.getClass(), "year", 2019);
        setShortField(term6294, term6294.getClass(), "month", (short) 8);
        setShortField(term6294, term6294.getClass(), "day", (short) 6);
        setField(term6293, term6293.getClass(), "date", term6294);
        setByteField(term6298, term6298.getClass(), "hour", (byte) 5);
        setByteField(term6298, term6298.getClass(), "minute", (byte) 32);
        setByteField(term6298, term6298.getClass(), "second", (byte) 47);
        setIntField(term6298, term6298.getClass(), "nano", 73220317);
        setField(term6293, term6293.getClass(), "time", term6298);
        setField(term6156, term6156.getClass(), "regDate", term6293);
        setIntField(term6304, term6304.getClass(), "year", 2025);
        setShortField(term6304, term6304.getClass(), "month", (short) 2);
        setShortField(term6304, term6304.getClass(), "day", (short) 23);
        setField(term6303, term6303.getClass(), "date", term6304);
        setByteField(term6308, term6308.getClass(), "hour", (byte) 16);
        setByteField(term6308, term6308.getClass(), "minute", (byte) 39);
        setByteField(term6308, term6308.getClass(), "second", (byte) 42);
        setIntField(term6308, term6308.getClass(), "nano", 342777686);
        setField(term6303, term6303.getClass(), "time", term6308);
        setField(term6156, term6156.getClass(), "modDate", term6303);
        term6313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6318 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6314, term6314.getClass(), "year", 2029);
        setShortField(term6314, term6314.getClass(), "month", (short) 8);
        setShortField(term6314, term6314.getClass(), "day", (short) 14);
        setField(term6313, term6313.getClass(), "date", term6314);
        setByteField(term6318, term6318.getClass(), "hour", (byte) 10);
        setByteField(term6318, term6318.getClass(), "minute", (byte) 28);
        setByteField(term6318, term6318.getClass(), "second", (byte) 23);
        setIntField(term6318, term6318.getClass(), "nano", 676524979);
        setField(term6313, term6313.getClass(), "time", term6318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term6313;
        callMethod(klass, "setModDate", argTypes, term6156, args);
    }

};


