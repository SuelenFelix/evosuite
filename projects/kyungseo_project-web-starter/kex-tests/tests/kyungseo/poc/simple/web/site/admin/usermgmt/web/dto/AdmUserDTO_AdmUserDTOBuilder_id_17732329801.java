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

public class AdmUserDTO_AdmUserDTOBuilder_id_17732329801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term180;

    public AdmUserDTO_AdmUserDTOBuilder_id_17732329801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Boolean term40 = new Boolean(false);
        Integer term42 = new Integer(568599855);
        Boolean term80 = new Boolean(false);
        Long term97 = new Long(6375119433582206027L);
        ArrayList term99 = new ArrayList();
        ((ArrayList) term99).add((Object)null);
        ((ArrayList) term99).add((Object)null);
        ((ArrayList) term99).add((Object)null);
        ((ArrayList) term99).add((Object)null);
        ArrayList term102 = new ArrayList();
        ((ArrayList) term102).add((Object)null);
        ((ArrayList) term102).add((Object)null);
        ((ArrayList) term102).add((Object)null);
        ((ArrayList) term102).add((Object)null);
        ((ArrayList) term102).add((Object)null);
        Object term96 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term96, term96.getClass(), "id", term97);
        setField(term96, term96.getClass(), "users", term99);
        setField(term96, term96.getClass(), "privileges", term102);
        setField(term96, term96.getClass(), "name", "");
        Long term107 = new Long(6811161968424632369L);
        ArrayList term109 = new ArrayList();
        ((ArrayList) term109).add((Object)null);
        ((ArrayList) term109).add((Object)null);
        ((ArrayList) term109).add((Object)null);
        ((ArrayList) term109).add((Object)null);
        ((ArrayList) term109).add((Object)null);
        ((ArrayList) term109).add((Object)null);
        ArrayList term112 = new ArrayList();
        ((ArrayList) term112).add((Object)null);
        Object term106 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term106, term106.getClass(), "id", term107);
        setField(term106, term106.getClass(), "users", term109);
        setField(term106, term106.getClass(), "privileges", term112);
        setField(term106, term106.getClass(), "name", "");
        Long term117 = new Long(-8400487765614892086L);
        ArrayList term119 = new ArrayList();
        ((ArrayList) term119).add((Object)null);
        ((ArrayList) term119).add((Object)null);
        ((ArrayList) term119).add((Object)null);
        ((ArrayList) term119).add((Object)null);
        ArrayList term122 = new ArrayList();
        ((ArrayList) term122).add((Object)null);
        ((ArrayList) term122).add((Object)null);
        ((ArrayList) term122).add((Object)null);
        Object term116 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term116, term116.getClass(), "id", term117);
        setField(term116, term116.getClass(), "users", term119);
        setField(term116, term116.getClass(), "privileges", term122);
        setField(term116, term116.getClass(), "name", "");
        Long term127 = new Long(2535595959091595249L);
        ArrayList term129 = new ArrayList();
        ((ArrayList) term129).add((Object)null);
        ((ArrayList) term129).add((Object)null);
        ArrayList term132 = new ArrayList();
        ((ArrayList) term132).add((Object)null);
        ((ArrayList) term132).add((Object)null);
        ((ArrayList) term132).add((Object)null);
        ((ArrayList) term132).add((Object)null);
        ((ArrayList) term132).add((Object)null);
        ((ArrayList) term132).add((Object)null);
        ((ArrayList) term132).add((Object)null);
        ((ArrayList) term132).add((Object)null);
        Object term126 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term126, term126.getClass(), "id", term127);
        setField(term126, term126.getClass(), "users", term129);
        setField(term126, term126.getClass(), "privileges", term132);
        setField(term126, term126.getClass(), "name", "");
        Long term137 = new Long(6967924379644551255L);
        ArrayList term139 = new ArrayList();
        ((ArrayList) term139).add((Object)null);
        ArrayList term142 = new ArrayList();
        ((ArrayList) term142).add((Object)null);
        ((ArrayList) term142).add((Object)null);
        ((ArrayList) term142).add((Object)null);
        ((ArrayList) term142).add((Object)null);
        ((ArrayList) term142).add((Object)null);
        ((ArrayList) term142).add((Object)null);
        Object term136 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term136, term136.getClass(), "id", term137);
        setField(term136, term136.getClass(), "users", term139);
        setField(term136, term136.getClass(), "privileges", term142);
        setField(term136, term136.getClass(), "name", "");
        ArrayList term94 = new ArrayList();
        ((ArrayList) term94).add(term96);
        ((ArrayList) term94).add(term106);
        ((ArrayList) term94).add(term116);
        ((ArrayList) term94).add(term126);
        ((ArrayList) term94).add(term136);
        term1 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder"));
        Object term148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term153 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "membername", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "email", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "password", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "enabled", term40);
        setField(term1, term1.getClass(), "age", term42);
        setField(term1, term1.getClass(), "phoneNumber", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "country", "jJCZpVmanW");
        setField(term1, term1.getClass(), "birthdate", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "isUsing2FA", term80);
        setField(term1, term1.getClass(), "secret", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "roles", term94);
        setIntField(term149, term149.getClass(), "year", 2029);
        setShortField(term149, term149.getClass(), "month", (short) 8);
        setShortField(term149, term149.getClass(), "day", (short) 29);
        setField(term148, term148.getClass(), "date", term149);
        setByteField(term153, term153.getClass(), "hour", (byte) 15);
        setByteField(term153, term153.getClass(), "minute", (byte) 50);
        setByteField(term153, term153.getClass(), "second", (byte) 1);
        setIntField(term153, term153.getClass(), "nano", 277971904);
        setField(term148, term148.getClass(), "time", term153);
        setField(term1, term1.getClass(), "regDate", term148);
        setIntField(term159, term159.getClass(), "year", 2022);
        setShortField(term159, term159.getClass(), "month", (short) 11);
        setShortField(term159, term159.getClass(), "day", (short) 16);
        setField(term158, term158.getClass(), "date", term159);
        setByteField(term163, term163.getClass(), "hour", (byte) 15);
        setByteField(term163, term163.getClass(), "minute", (byte) 54);
        setByteField(term163, term163.getClass(), "second", (byte) 2);
        setIntField(term163, term163.getClass(), "nano", 733274103);
        setField(term158, term158.getClass(), "time", term163);
        setField(term1, term1.getClass(), "modDate", term158);
        setField(term1, term1.getClass(), "date", "GzFkzHGYFt");
        term180 = new Long(-872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term180;
        callMethod(klass, "id", argTypes, term1, args);
    }

};


