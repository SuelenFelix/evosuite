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

public class JwtUserDevice_setIsRefreshActive_105765305917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26334;
     Object term26565;

    public JwtUserDevice_setIsRefreshActive_105765305917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26335 = new Long(3524743556565317852L);
        Long term26338 = new Long(-6550059544186211121L);
        Boolean term26376 = new Boolean(false);
        Integer term26378 = new Integer(1059930704);
        Long term26419 = new Long(-3035941748055157425L);
        Object term26418 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term26418, term26418.getClass(), "id", term26419);
        setField(term26418, term26418.getClass(), "users", null);
        setField(term26418, term26418.getClass(), "privileges", null);
        setField(term26418, term26418.getClass(), "name", null);
        ArrayList term26416 = new ArrayList();
        ((ArrayList) term26416).add(term26418);
        Long term26481 = new Long(-935483464256316780L);
        Long term26496 = new Long(8155420036739278471L);
        Long term26499 = new Long(5690319333104320494L);
        Boolean term26504 = new Boolean(false);
        Integer term26506 = new Integer(868908117);
        ArrayList term26511 = new ArrayList();
        ((ArrayList) term26511).add((Object)null);
        Long term26543 = new Long(5083842693203849201L);
        Long term26547 = new Long(-7658308085805400095L);
        Boolean term26549 = new Boolean(true);
        Long term26551 = new Long(293702982753277786L);
        Boolean term26556 = new Boolean(false);
        Long term26558 = new Long(7809414208372445190L);
        Boolean term26563 = new Boolean(false);
        term26334 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term26337 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term26436 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26437 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26441 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26446 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26447 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26451 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26480 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term26495 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term26498 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term26516 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26542 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term26546 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term26553 = newInstance(Class.forName("java.time.Instant"));
        Object term26560 = newInstance(Class.forName("java.time.Instant"));
        setField(term26334, term26334.getClass(), "id", term26335);
        setField(term26337, term26337.getClass(), "id", term26338);
        setField(term26337, term26337.getClass(), "membername", "EcvJGrLPRz");
        setField(term26337, term26337.getClass(), "email", "XtIfJsUuvC");
        setField(term26337, term26337.getClass(), "password", "WhLgjfGIGf");
        setField(term26337, term26337.getClass(), "enabled", term26376);
        setField(term26337, term26337.getClass(), "age", term26378);
        setField(term26337, term26337.getClass(), "phoneNumber", "EhUQbbAhWQ");
        setField(term26337, term26337.getClass(), "country", "iIlZyBWPsg");
        setField(term26337, term26337.getClass(), "birthdate", "KmeTSoiLRD");
        setField(term26337, term26337.getClass(), "roles", term26416);
        setBooleanField(term26337, term26337.getClass(), "isUsing2FA", false);
        setField(term26337, term26337.getClass(), "secret", "WRULWkXFGh");
        setIntField(term26437, term26437.getClass(), "year", 2011);
        setShortField(term26437, term26437.getClass(), "month", (short) 11);
        setShortField(term26437, term26437.getClass(), "day", (short) 11);
        setField(term26436, term26436.getClass(), "date", term26437);
        setByteField(term26441, term26441.getClass(), "hour", (byte) 9);
        setByteField(term26441, term26441.getClass(), "minute", (byte) 8);
        setByteField(term26441, term26441.getClass(), "second", (byte) 12);
        setIntField(term26441, term26441.getClass(), "nano", 285984981);
        setField(term26436, term26436.getClass(), "time", term26441);
        setField(term26337, term26337.getClass(), "regDate", term26436);
        setIntField(term26447, term26447.getClass(), "year", 2027);
        setShortField(term26447, term26447.getClass(), "month", (short) 10);
        setShortField(term26447, term26447.getClass(), "day", (short) 17);
        setField(term26446, term26446.getClass(), "date", term26447);
        setByteField(term26451, term26451.getClass(), "hour", (byte) 3);
        setByteField(term26451, term26451.getClass(), "minute", (byte) 39);
        setByteField(term26451, term26451.getClass(), "second", (byte) 47);
        setIntField(term26451, term26451.getClass(), "nano", 565585874);
        setField(term26446, term26446.getClass(), "time", term26451);
        setField(term26337, term26337.getClass(), "modDate", term26446);
        setField(term26334, term26334.getClass(), "user", term26337);
        setField(term26334, term26334.getClass(), "deviceType", "IwTUeBbyTY");
        setField(term26334, term26334.getClass(), "deviceId", "CXCVrIiZYr");
        setField(term26480, term26480.getClass(), "id", term26481);
        setField(term26480, term26480.getClass(), "token", "wwoCovcSVQ");
        setField(term26495, term26495.getClass(), "id", term26496);
        setField(term26498, term26498.getClass(), "id", term26499);
        setField(term26498, term26498.getClass(), "membername", "");
        setField(term26498, term26498.getClass(), "email", "");
        setField(term26498, term26498.getClass(), "password", "");
        setField(term26498, term26498.getClass(), "enabled", term26504);
        setField(term26498, term26498.getClass(), "age", term26506);
        setField(term26498, term26498.getClass(), "phoneNumber", "");
        setField(term26498, term26498.getClass(), "country", "");
        setField(term26498, term26498.getClass(), "birthdate", "");
        setField(term26498, term26498.getClass(), "roles", term26511);
        setBooleanField(term26498, term26498.getClass(), "isUsing2FA", true);
        setField(term26498, term26498.getClass(), "secret", "");
        setField(term26516, term26516.getClass(), "date", null);
        setField(term26516, term26516.getClass(), "time", null);
        setField(term26498, term26498.getClass(), "regDate", term26516);
        setField(term26517, term26517.getClass(), "date", null);
        setField(term26517, term26517.getClass(), "time", null);
        setField(term26498, term26498.getClass(), "modDate", term26517);
        setField(term26495, term26495.getClass(), "user", term26498);
        setField(term26495, term26495.getClass(), "deviceType", "dcLAJDPSlV");
        setField(term26495, term26495.getClass(), "deviceId", "quGlCgteaW");
        setField(term26542, term26542.getClass(), "id", term26543);
        setField(term26542, term26542.getClass(), "token", "");
        setField(term26546, term26546.getClass(), "id", term26547);
        setField(term26546, term26546.getClass(), "user", null);
        setField(term26546, term26546.getClass(), "deviceType", null);
        setField(term26546, term26546.getClass(), "deviceId", null);
        setField(term26546, term26546.getClass(), "refreshToken", null);
        setField(term26546, term26546.getClass(), "isRefreshActive", term26549);
        setField(term26542, term26542.getClass(), "userDevice", term26546);
        setField(term26542, term26542.getClass(), "refreshCount", term26551);
        setLongField(term26553, term26553.getClass(), "seconds", 1589746751L);
        setIntField(term26553, term26553.getClass(), "nanos", 309000000);
        setField(term26542, term26542.getClass(), "expiryDate", term26553);
        setField(term26495, term26495.getClass(), "refreshToken", term26542);
        setField(term26495, term26495.getClass(), "isRefreshActive", term26556);
        setField(term26480, term26480.getClass(), "userDevice", term26495);
        setField(term26480, term26480.getClass(), "refreshCount", term26558);
        setLongField(term26560, term26560.getClass(), "seconds", 1291280367L);
        setIntField(term26560, term26560.getClass(), "nanos", 982000000);
        setField(term26480, term26480.getClass(), "expiryDate", term26560);
        setField(term26334, term26334.getClass(), "refreshToken", term26480);
        setField(term26334, term26334.getClass(), "isRefreshActive", term26563);
        term26565 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term26565;
        callMethod(klass, "setIsRefreshActive", argTypes, term26334, args);
    }

};


