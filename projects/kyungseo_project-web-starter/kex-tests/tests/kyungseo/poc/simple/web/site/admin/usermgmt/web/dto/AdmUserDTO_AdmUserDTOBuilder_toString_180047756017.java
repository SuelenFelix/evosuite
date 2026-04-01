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

public class AdmUserDTO_AdmUserDTOBuilder_toString_180047756017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4041;

    public AdmUserDTO_AdmUserDTOBuilder_toString_180047756017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4042 = new Long(-4867941246533901410L);
        Boolean term4080 = new Boolean(true);
        Integer term4082 = new Integer(1551099402);
        Boolean term4120 = new Boolean(true);
        Long term4137 = new Long(1044883697493326351L);
        ArrayList term4139 = new ArrayList();
        ((ArrayList) term4139).add((Object)null);
        ArrayList term4142 = new ArrayList();
        ((ArrayList) term4142).add((Object)null);
        ((ArrayList) term4142).add((Object)null);
        ((ArrayList) term4142).add((Object)null);
        ((ArrayList) term4142).add((Object)null);
        ((ArrayList) term4142).add((Object)null);
        Object term4136 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term4136, term4136.getClass(), "id", term4137);
        setField(term4136, term4136.getClass(), "users", term4139);
        setField(term4136, term4136.getClass(), "privileges", term4142);
        setField(term4136, term4136.getClass(), "name", "");
        Long term4147 = new Long(1860789353508856614L);
        ArrayList term4149 = new ArrayList();
        ((ArrayList) term4149).add((Object)null);
        ((ArrayList) term4149).add((Object)null);
        ((ArrayList) term4149).add((Object)null);
        ((ArrayList) term4149).add((Object)null);
        ((ArrayList) term4149).add((Object)null);
        ((ArrayList) term4149).add((Object)null);
        ((ArrayList) term4149).add((Object)null);
        ((ArrayList) term4149).add((Object)null);
        ArrayList term4152 = new ArrayList();
        ((ArrayList) term4152).add((Object)null);
        ((ArrayList) term4152).add((Object)null);
        ((ArrayList) term4152).add((Object)null);
        Object term4146 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term4146, term4146.getClass(), "id", term4147);
        setField(term4146, term4146.getClass(), "users", term4149);
        setField(term4146, term4146.getClass(), "privileges", term4152);
        setField(term4146, term4146.getClass(), "name", "");
        ArrayList term4134 = new ArrayList();
        ((ArrayList) term4134).add(term4136);
        ((ArrayList) term4134).add(term4146);
        term4041 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder"));
        Object term4158 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4159 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4163 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4168 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4169 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4173 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4041, term4041.getClass(), "id", term4042);
        setField(term4041, term4041.getClass(), "membername", "SibzENsyyy");
        setField(term4041, term4041.getClass(), "email", "mrqGHotaef");
        setField(term4041, term4041.getClass(), "password", "UbZGBpQZQW");
        setField(term4041, term4041.getClass(), "enabled", term4080);
        setField(term4041, term4041.getClass(), "age", term4082);
        setField(term4041, term4041.getClass(), "phoneNumber", "SvGTualQPa");
        setField(term4041, term4041.getClass(), "country", "mdxcgZwsaP");
        setField(term4041, term4041.getClass(), "birthdate", "XildIRoZHG");
        setField(term4041, term4041.getClass(), "isUsing2FA", term4120);
        setField(term4041, term4041.getClass(), "secret", "lEcrFlxJXH");
        setField(term4041, term4041.getClass(), "roles", term4134);
        setIntField(term4159, term4159.getClass(), "year", 2020);
        setShortField(term4159, term4159.getClass(), "month", (short) 5);
        setShortField(term4159, term4159.getClass(), "day", (short) 12);
        setField(term4158, term4158.getClass(), "date", term4159);
        setByteField(term4163, term4163.getClass(), "hour", (byte) 22);
        setByteField(term4163, term4163.getClass(), "minute", (byte) 7);
        setByteField(term4163, term4163.getClass(), "second", (byte) 49);
        setIntField(term4163, term4163.getClass(), "nano", 677355362);
        setField(term4158, term4158.getClass(), "time", term4163);
        setField(term4041, term4041.getClass(), "regDate", term4158);
        setIntField(term4169, term4169.getClass(), "year", 2010);
        setShortField(term4169, term4169.getClass(), "month", (short) 11);
        setShortField(term4169, term4169.getClass(), "day", (short) 1);
        setField(term4168, term4168.getClass(), "date", term4169);
        setByteField(term4173, term4173.getClass(), "hour", (byte) 5);
        setByteField(term4173, term4173.getClass(), "minute", (byte) 32);
        setByteField(term4173, term4173.getClass(), "second", (byte) 8);
        setIntField(term4173, term4173.getClass(), "nano", 918832231);
        setField(term4168, term4168.getClass(), "time", term4173);
        setField(term4041, term4041.getClass(), "modDate", term4168);
        setField(term4041, term4041.getClass(), "date", "utCuuVCKqE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4041, args);
    }

};


