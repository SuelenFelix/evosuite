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

public class AdmUserDTO_getMembername_6479704442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4495;

    public AdmUserDTO_getMembername_6479704442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4496 = new Long(6906379511067694917L);
        Boolean term4534 = new Boolean(false);
        Integer term4536 = new Integer(972867650);
        Boolean term4574 = new Boolean(true);
        Long term4591 = new Long(-9204303423581447271L);
        ArrayList term4593 = new ArrayList();
        ((ArrayList) term4593).add((Object)null);
        ((ArrayList) term4593).add((Object)null);
        ((ArrayList) term4593).add((Object)null);
        ((ArrayList) term4593).add((Object)null);
        ((ArrayList) term4593).add((Object)null);
        ((ArrayList) term4593).add((Object)null);
        ArrayList term4596 = new ArrayList();
        Object term4590 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term4590, term4590.getClass(), "id", term4591);
        setField(term4590, term4590.getClass(), "users", term4593);
        setField(term4590, term4590.getClass(), "privileges", term4596);
        setField(term4590, term4590.getClass(), "name", "");
        Long term4601 = new Long(-2986201902216133814L);
        ArrayList term4603 = new ArrayList();
        ((ArrayList) term4603).add((Object)null);
        ((ArrayList) term4603).add((Object)null);
        ((ArrayList) term4603).add((Object)null);
        ((ArrayList) term4603).add((Object)null);
        ((ArrayList) term4603).add((Object)null);
        ((ArrayList) term4603).add((Object)null);
        ArrayList term4606 = new ArrayList();
        ((ArrayList) term4606).add((Object)null);
        ((ArrayList) term4606).add((Object)null);
        ((ArrayList) term4606).add((Object)null);
        ((ArrayList) term4606).add((Object)null);
        ((ArrayList) term4606).add((Object)null);
        ((ArrayList) term4606).add((Object)null);
        ((ArrayList) term4606).add((Object)null);
        ((ArrayList) term4606).add((Object)null);
        ((ArrayList) term4606).add((Object)null);
        Object term4600 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term4600, term4600.getClass(), "id", term4601);
        setField(term4600, term4600.getClass(), "users", term4603);
        setField(term4600, term4600.getClass(), "privileges", term4606);
        setField(term4600, term4600.getClass(), "name", "");
        ArrayList term4588 = new ArrayList();
        ((ArrayList) term4588).add(term4590);
        ((ArrayList) term4588).add(term4600);
        term4495 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term4612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4627 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4495, term4495.getClass(), "id", term4496);
        setField(term4495, term4495.getClass(), "membername", "BkIxsyPkGy");
        setField(term4495, term4495.getClass(), "email", "mrMGwoRgVY");
        setField(term4495, term4495.getClass(), "password", "mxVLTgCwki");
        setField(term4495, term4495.getClass(), "enabled", term4534);
        setField(term4495, term4495.getClass(), "age", term4536);
        setField(term4495, term4495.getClass(), "phoneNumber", "wCurppnDSA");
        setField(term4495, term4495.getClass(), "country", "JydxSNTMYt");
        setField(term4495, term4495.getClass(), "birthdate", "KpurAcrHYT");
        setField(term4495, term4495.getClass(), "isUsing2FA", term4574);
        setField(term4495, term4495.getClass(), "secret", "QjvDwgKJGz");
        setField(term4495, term4495.getClass(), "roles", term4588);
        setIntField(term4613, term4613.getClass(), "year", 2010);
        setShortField(term4613, term4613.getClass(), "month", (short) 2);
        setShortField(term4613, term4613.getClass(), "day", (short) 28);
        setField(term4612, term4612.getClass(), "date", term4613);
        setByteField(term4617, term4617.getClass(), "hour", (byte) 2);
        setByteField(term4617, term4617.getClass(), "minute", (byte) 54);
        setByteField(term4617, term4617.getClass(), "second", (byte) 48);
        setIntField(term4617, term4617.getClass(), "nano", 930628940);
        setField(term4612, term4612.getClass(), "time", term4617);
        setField(term4495, term4495.getClass(), "regDate", term4612);
        setIntField(term4623, term4623.getClass(), "year", 2022);
        setShortField(term4623, term4623.getClass(), "month", (short) 3);
        setShortField(term4623, term4623.getClass(), "day", (short) 11);
        setField(term4622, term4622.getClass(), "date", term4623);
        setByteField(term4627, term4627.getClass(), "hour", (byte) 7);
        setByteField(term4627, term4627.getClass(), "minute", (byte) 12);
        setByteField(term4627, term4627.getClass(), "second", (byte) 56);
        setIntField(term4627, term4627.getClass(), "nano", 884158779);
        setField(term4622, term4622.getClass(), "time", term4627);
        setField(term4495, term4495.getClass(), "modDate", term4622);
        setField(term4495, term4495.getClass(), "date", "nDCcyhiTnS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMembername", argTypes, term4495, args);
    }

};


