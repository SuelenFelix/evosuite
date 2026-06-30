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

public class AdmUserDTO_AdmUserDTOBuilder_email_12761566803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;

    public AdmUserDTO_AdmUserDTOBuilder_email_12761566803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term544 = new Long(-5892135042702373494L);
        Boolean term582 = new Boolean(false);
        Integer term584 = new Integer(1725571209);
        Boolean term622 = new Boolean(true);
        Long term639 = new Long(5262507301787091109L);
        ArrayList term641 = new ArrayList();
        ((ArrayList) term641).add((Object)null);
        ((ArrayList) term641).add((Object)null);
        ((ArrayList) term641).add((Object)null);
        ((ArrayList) term641).add((Object)null);
        ArrayList term644 = new ArrayList();
        ((ArrayList) term644).add((Object)null);
        Object term638 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term638, term638.getClass(), "id", term639);
        setField(term638, term638.getClass(), "users", term641);
        setField(term638, term638.getClass(), "privileges", term644);
        setField(term638, term638.getClass(), "name", "");
        Long term649 = new Long(-2170847986967241072L);
        ArrayList term651 = new ArrayList();
        ArrayList term654 = new ArrayList();
        ((ArrayList) term654).add((Object)null);
        ((ArrayList) term654).add((Object)null);
        ((ArrayList) term654).add((Object)null);
        ((ArrayList) term654).add((Object)null);
        ((ArrayList) term654).add((Object)null);
        ((ArrayList) term654).add((Object)null);
        Object term648 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term648, term648.getClass(), "id", term649);
        setField(term648, term648.getClass(), "users", term651);
        setField(term648, term648.getClass(), "privileges", term654);
        setField(term648, term648.getClass(), "name", "");
        Long term659 = new Long(-6292278961887936280L);
        ArrayList term661 = new ArrayList();
        ((ArrayList) term661).add((Object)null);
        ((ArrayList) term661).add((Object)null);
        ((ArrayList) term661).add((Object)null);
        ((ArrayList) term661).add((Object)null);
        ((ArrayList) term661).add((Object)null);
        ((ArrayList) term661).add((Object)null);
        ((ArrayList) term661).add((Object)null);
        ((ArrayList) term661).add((Object)null);
        ((ArrayList) term661).add((Object)null);
        ArrayList term664 = new ArrayList();
        ((ArrayList) term664).add((Object)null);
        ((ArrayList) term664).add((Object)null);
        ((ArrayList) term664).add((Object)null);
        ((ArrayList) term664).add((Object)null);
        ((ArrayList) term664).add((Object)null);
        ((ArrayList) term664).add((Object)null);
        ((ArrayList) term664).add((Object)null);
        Object term658 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term658, term658.getClass(), "id", term659);
        setField(term658, term658.getClass(), "users", term661);
        setField(term658, term658.getClass(), "privileges", term664);
        setField(term658, term658.getClass(), "name", "");
        ArrayList term636 = new ArrayList();
        ((ArrayList) term636).add(term638);
        ((ArrayList) term636).add(term648);
        ((ArrayList) term636).add(term658);
        term543 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder"));
        Object term670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term675 = newInstance(Class.forName("java.time.LocalTime"));
        Object term680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term681 = newInstance(Class.forName("java.time.LocalDate"));
        Object term685 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term543, term543.getClass(), "id", term544);
        setField(term543, term543.getClass(), "membername", "JqXGgAhZPl");
        setField(term543, term543.getClass(), "email", "jiKYgYHqIS");
        setField(term543, term543.getClass(), "password", "DfISiziTgG");
        setField(term543, term543.getClass(), "enabled", term582);
        setField(term543, term543.getClass(), "age", term584);
        setField(term543, term543.getClass(), "phoneNumber", "XqgfKFvPSD");
        setField(term543, term543.getClass(), "country", "JiVRgTZvKc");
        setField(term543, term543.getClass(), "birthdate", "XPKmummaqg");
        setField(term543, term543.getClass(), "isUsing2FA", term622);
        setField(term543, term543.getClass(), "secret", "BKLfkLiZTH");
        setField(term543, term543.getClass(), "roles", term636);
        setIntField(term671, term671.getClass(), "year", 2016);
        setShortField(term671, term671.getClass(), "month", (short) 6);
        setShortField(term671, term671.getClass(), "day", (short) 15);
        setField(term670, term670.getClass(), "date", term671);
        setByteField(term675, term675.getClass(), "hour", (byte) 21);
        setByteField(term675, term675.getClass(), "minute", (byte) 23);
        setByteField(term675, term675.getClass(), "second", (byte) 23);
        setIntField(term675, term675.getClass(), "nano", 433372070);
        setField(term670, term670.getClass(), "time", term675);
        setField(term543, term543.getClass(), "regDate", term670);
        setIntField(term681, term681.getClass(), "year", 2012);
        setShortField(term681, term681.getClass(), "month", (short) 8);
        setShortField(term681, term681.getClass(), "day", (short) 25);
        setField(term680, term680.getClass(), "date", term681);
        setByteField(term685, term685.getClass(), "hour", (byte) 19);
        setByteField(term685, term685.getClass(), "minute", (byte) 49);
        setByteField(term685, term685.getClass(), "second", (byte) 8);
        setIntField(term685, term685.getClass(), "nano", 912685024);
        setField(term680, term680.getClass(), "time", term685);
        setField(term543, term543.getClass(), "modDate", term680);
        setField(term543, term543.getClass(), "date", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UfQtPRyWRC";
        callMethod(klass, "email", argTypes, term543, args);
    }

};


