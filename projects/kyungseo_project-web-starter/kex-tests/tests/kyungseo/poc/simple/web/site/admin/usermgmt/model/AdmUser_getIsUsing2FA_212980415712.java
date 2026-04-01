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

public class AdmUser_getIsUsing2FA_212980415712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2391;

    public AdmUser_getIsUsing2FA_212980415712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2392 = new Long(-7278883608542636188L);
        Integer term2430 = new Integer(2055867847);
        Boolean term2468 = new Boolean(true);
        Long term2473 = new Long(-1539859611880912454L);
        ArrayList term2475 = new ArrayList();
        ((ArrayList) term2475).add((Object)null);
        ((ArrayList) term2475).add((Object)null);
        ((ArrayList) term2475).add((Object)null);
        ((ArrayList) term2475).add((Object)null);
        ((ArrayList) term2475).add((Object)null);
        ArrayList term2478 = new ArrayList();
        ((ArrayList) term2478).add((Object)null);
        ((ArrayList) term2478).add((Object)null);
        ((ArrayList) term2478).add((Object)null);
        Object term2472 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term2472, term2472.getClass(), "id", term2473);
        setField(term2472, term2472.getClass(), "users", term2475);
        setField(term2472, term2472.getClass(), "privileges", term2478);
        setField(term2472, term2472.getClass(), "name", "");
        Long term2483 = new Long(-948292411727204525L);
        ArrayList term2485 = new ArrayList();
        ((ArrayList) term2485).add((Object)null);
        ArrayList term2488 = new ArrayList();
        ((ArrayList) term2488).add((Object)null);
        ((ArrayList) term2488).add((Object)null);
        ((ArrayList) term2488).add((Object)null);
        ((ArrayList) term2488).add((Object)null);
        ((ArrayList) term2488).add((Object)null);
        Object term2482 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term2482, term2482.getClass(), "id", term2483);
        setField(term2482, term2482.getClass(), "users", term2485);
        setField(term2482, term2482.getClass(), "privileges", term2488);
        setField(term2482, term2482.getClass(), "name", "");
        Long term2493 = new Long(4502292577098212311L);
        ArrayList term2495 = new ArrayList();
        ((ArrayList) term2495).add((Object)null);
        ArrayList term2498 = new ArrayList();
        ((ArrayList) term2498).add((Object)null);
        Object term2492 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term2492, term2492.getClass(), "id", term2493);
        setField(term2492, term2492.getClass(), "users", term2495);
        setField(term2492, term2492.getClass(), "privileges", term2498);
        setField(term2492, term2492.getClass(), "name", "");
        Long term2503 = new Long(4616440478358528406L);
        ArrayList term2505 = new ArrayList();
        ((ArrayList) term2505).add((Object)null);
        ((ArrayList) term2505).add((Object)null);
        ((ArrayList) term2505).add((Object)null);
        ArrayList term2508 = new ArrayList();
        ((ArrayList) term2508).add((Object)null);
        ((ArrayList) term2508).add((Object)null);
        ((ArrayList) term2508).add((Object)null);
        ((ArrayList) term2508).add((Object)null);
        ((ArrayList) term2508).add((Object)null);
        ((ArrayList) term2508).add((Object)null);
        Object term2502 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term2502, term2502.getClass(), "id", term2503);
        setField(term2502, term2502.getClass(), "users", term2505);
        setField(term2502, term2502.getClass(), "privileges", term2508);
        setField(term2502, term2502.getClass(), "name", "");
        ArrayList term2470 = new ArrayList();
        ((ArrayList) term2470).add(term2472);
        ((ArrayList) term2470).add(term2482);
        ((ArrayList) term2470).add(term2492);
        ((ArrayList) term2470).add(term2482);
        ((ArrayList) term2470).add(term2502);
        Boolean term2514 = new Boolean(true);
        term2391 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term2528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2533 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2539 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2543 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2391, term2391.getClass(), "id", term2392);
        setField(term2391, term2391.getClass(), "membername", "wwAwLLcLPp");
        setField(term2391, term2391.getClass(), "email", "nHpMKOmlpQ");
        setField(term2391, term2391.getClass(), "password", "fKhrQsJToZ");
        setField(term2391, term2391.getClass(), "age", term2430);
        setField(term2391, term2391.getClass(), "phoneNumber", "wsysQLGFnl");
        setField(term2391, term2391.getClass(), "country", "ckQLZGFjMX");
        setField(term2391, term2391.getClass(), "birthdate", "qphdrqUtNx");
        setField(term2391, term2391.getClass(), "enabled", term2468);
        setField(term2391, term2391.getClass(), "roles", term2470);
        setField(term2391, term2391.getClass(), "isUsing2FA", term2514);
        setField(term2391, term2391.getClass(), "secret", "XtiurrVYKw");
        setIntField(term2529, term2529.getClass(), "year", 2028);
        setShortField(term2529, term2529.getClass(), "month", (short) 4);
        setShortField(term2529, term2529.getClass(), "day", (short) 11);
        setField(term2528, term2528.getClass(), "date", term2529);
        setByteField(term2533, term2533.getClass(), "hour", (byte) 4);
        setByteField(term2533, term2533.getClass(), "minute", (byte) 45);
        setByteField(term2533, term2533.getClass(), "second", (byte) 2);
        setIntField(term2533, term2533.getClass(), "nano", 374177968);
        setField(term2528, term2528.getClass(), "time", term2533);
        setField(term2391, term2391.getClass(), "regDate", term2528);
        setIntField(term2539, term2539.getClass(), "year", 2021);
        setShortField(term2539, term2539.getClass(), "month", (short) 4);
        setShortField(term2539, term2539.getClass(), "day", (short) 22);
        setField(term2538, term2538.getClass(), "date", term2539);
        setByteField(term2543, term2543.getClass(), "hour", (byte) 17);
        setByteField(term2543, term2543.getClass(), "minute", (byte) 6);
        setByteField(term2543, term2543.getClass(), "second", (byte) 33);
        setIntField(term2543, term2543.getClass(), "nano", 21410850);
        setField(term2538, term2538.getClass(), "time", term2543);
        setField(term2391, term2391.getClass(), "modDate", term2538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsUsing2FA", argTypes, term2391, args);
    }

};


