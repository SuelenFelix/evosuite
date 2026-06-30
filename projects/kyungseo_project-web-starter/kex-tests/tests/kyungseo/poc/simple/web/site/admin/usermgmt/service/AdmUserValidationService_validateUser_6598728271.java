package kyungseo.poc.simple.web.site.admin.usermgmt.service;

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
import static kyungseo.poc.simple.web.site.admin.usermgmt.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class AdmUserValidationService_validateUser_6598728271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public AdmUserValidationService_validateUser_6598728271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.service.AdmUserValidationService"));
        Long term3 = new Long(2442117782898005296L);
        Boolean term41 = new Boolean(false);
        Integer term43 = new Integer(568599855);
        Boolean term81 = new Boolean(false);
        Long term98 = new Long(6375119433582206027L);
        ArrayList term100 = new ArrayList();
        ((ArrayList) term100).add((Object)null);
        ((ArrayList) term100).add((Object)null);
        ((ArrayList) term100).add((Object)null);
        ((ArrayList) term100).add((Object)null);
        ArrayList term103 = new ArrayList();
        ((ArrayList) term103).add((Object)null);
        ((ArrayList) term103).add((Object)null);
        ((ArrayList) term103).add((Object)null);
        ((ArrayList) term103).add((Object)null);
        ((ArrayList) term103).add((Object)null);
        Object term97 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term97, term97.getClass(), "id", term98);
        setField(term97, term97.getClass(), "users", term100);
        setField(term97, term97.getClass(), "privileges", term103);
        setField(term97, term97.getClass(), "name", "");
        Long term108 = new Long(6811161968424632369L);
        ArrayList term110 = new ArrayList();
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ArrayList term113 = new ArrayList();
        ((ArrayList) term113).add((Object)null);
        Object term107 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term107, term107.getClass(), "id", term108);
        setField(term107, term107.getClass(), "users", term110);
        setField(term107, term107.getClass(), "privileges", term113);
        setField(term107, term107.getClass(), "name", "");
        Long term118 = new Long(-8400487765614892086L);
        ArrayList term120 = new ArrayList();
        ((ArrayList) term120).add((Object)null);
        ((ArrayList) term120).add((Object)null);
        ((ArrayList) term120).add((Object)null);
        ((ArrayList) term120).add((Object)null);
        ArrayList term123 = new ArrayList();
        ((ArrayList) term123).add((Object)null);
        ((ArrayList) term123).add((Object)null);
        ((ArrayList) term123).add((Object)null);
        Object term117 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term117, term117.getClass(), "id", term118);
        setField(term117, term117.getClass(), "users", term120);
        setField(term117, term117.getClass(), "privileges", term123);
        setField(term117, term117.getClass(), "name", "");
        Long term128 = new Long(2535595959091595249L);
        ArrayList term130 = new ArrayList();
        ((ArrayList) term130).add((Object)null);
        ((ArrayList) term130).add((Object)null);
        ArrayList term133 = new ArrayList();
        ((ArrayList) term133).add((Object)null);
        ((ArrayList) term133).add((Object)null);
        ((ArrayList) term133).add((Object)null);
        ((ArrayList) term133).add((Object)null);
        ((ArrayList) term133).add((Object)null);
        ((ArrayList) term133).add((Object)null);
        ((ArrayList) term133).add((Object)null);
        ((ArrayList) term133).add((Object)null);
        Object term127 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term127, term127.getClass(), "id", term128);
        setField(term127, term127.getClass(), "users", term130);
        setField(term127, term127.getClass(), "privileges", term133);
        setField(term127, term127.getClass(), "name", "");
        Long term138 = new Long(6967924379644551255L);
        ArrayList term140 = new ArrayList();
        ((ArrayList) term140).add((Object)null);
        ArrayList term143 = new ArrayList();
        ((ArrayList) term143).add((Object)null);
        ((ArrayList) term143).add((Object)null);
        ((ArrayList) term143).add((Object)null);
        ((ArrayList) term143).add((Object)null);
        ((ArrayList) term143).add((Object)null);
        ((ArrayList) term143).add((Object)null);
        Object term137 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term137, term137.getClass(), "id", term138);
        setField(term137, term137.getClass(), "users", term140);
        setField(term137, term137.getClass(), "privileges", term143);
        setField(term137, term137.getClass(), "name", "");
        ArrayList term95 = new ArrayList();
        ((ArrayList) term95).add(term97);
        ((ArrayList) term95).add(term107);
        ((ArrayList) term95).add(term117);
        ((ArrayList) term95).add(term127);
        ((ArrayList) term95).add(term137);
        term2 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2, term2.getClass(), "id", term3);
        setField(term2, term2.getClass(), "membername", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "email", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "password", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "enabled", term41);
        setField(term2, term2.getClass(), "age", term43);
        setField(term2, term2.getClass(), "phoneNumber", "xxtlPwDYFs");
        setField(term2, term2.getClass(), "country", "jJCZpVmanW");
        setField(term2, term2.getClass(), "birthdate", "EGtDIRbSSb");
        setField(term2, term2.getClass(), "isUsing2FA", term81);
        setField(term2, term2.getClass(), "secret", "SzjVpOQTyS");
        setField(term2, term2.getClass(), "roles", term95);
        setIntField(term150, term150.getClass(), "year", 2029);
        setShortField(term150, term150.getClass(), "month", (short) 8);
        setShortField(term150, term150.getClass(), "day", (short) 29);
        setField(term149, term149.getClass(), "date", term150);
        setByteField(term154, term154.getClass(), "hour", (byte) 15);
        setByteField(term154, term154.getClass(), "minute", (byte) 50);
        setByteField(term154, term154.getClass(), "second", (byte) 1);
        setIntField(term154, term154.getClass(), "nano", 277971904);
        setField(term149, term149.getClass(), "time", term154);
        setField(term2, term2.getClass(), "regDate", term149);
        setIntField(term160, term160.getClass(), "year", 2022);
        setShortField(term160, term160.getClass(), "month", (short) 11);
        setShortField(term160, term160.getClass(), "day", (short) 16);
        setField(term159, term159.getClass(), "date", term160);
        setByteField(term164, term164.getClass(), "hour", (byte) 15);
        setByteField(term164, term164.getClass(), "minute", (byte) 54);
        setByteField(term164, term164.getClass(), "second", (byte) 2);
        setIntField(term164, term164.getClass(), "nano", 733274103);
        setField(term159, term159.getClass(), "time", term164);
        setField(term2, term2.getClass(), "modDate", term159);
        setField(term2, term2.getClass(), "date", "GzFkzHGYFt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.service.AdmUserValidationService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "validateUser", argTypes, term1, args);
    }

};


