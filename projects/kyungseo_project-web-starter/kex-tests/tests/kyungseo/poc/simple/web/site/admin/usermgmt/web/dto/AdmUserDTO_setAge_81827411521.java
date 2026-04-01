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

public class AdmUserDTO_setAge_81827411521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9376;
     Object term9535;

    public AdmUserDTO_setAge_81827411521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9377 = new Long(7450734758126089960L);
        Boolean term9415 = new Boolean(true);
        Integer term9417 = new Integer(-461771056);
        Boolean term9455 = new Boolean(true);
        Long term9472 = new Long(1377567570761089535L);
        ArrayList term9474 = new ArrayList();
        ((ArrayList) term9474).add((Object)null);
        ((ArrayList) term9474).add((Object)null);
        ((ArrayList) term9474).add((Object)null);
        ((ArrayList) term9474).add((Object)null);
        ((ArrayList) term9474).add((Object)null);
        ArrayList term9477 = new ArrayList();
        ((ArrayList) term9477).add((Object)null);
        Object term9471 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term9471, term9471.getClass(), "id", term9472);
        setField(term9471, term9471.getClass(), "users", term9474);
        setField(term9471, term9471.getClass(), "privileges", term9477);
        setField(term9471, term9471.getClass(), "name", "");
        Long term9482 = new Long(-9133417318192430290L);
        ArrayList term9484 = new ArrayList();
        ((ArrayList) term9484).add((Object)null);
        ((ArrayList) term9484).add((Object)null);
        ((ArrayList) term9484).add((Object)null);
        ((ArrayList) term9484).add((Object)null);
        ((ArrayList) term9484).add((Object)null);
        ((ArrayList) term9484).add((Object)null);
        ((ArrayList) term9484).add((Object)null);
        ((ArrayList) term9484).add((Object)null);
        ArrayList term9487 = new ArrayList();
        ((ArrayList) term9487).add((Object)null);
        ((ArrayList) term9487).add((Object)null);
        ((ArrayList) term9487).add((Object)null);
        ((ArrayList) term9487).add((Object)null);
        ((ArrayList) term9487).add((Object)null);
        ((ArrayList) term9487).add((Object)null);
        ((ArrayList) term9487).add((Object)null);
        ((ArrayList) term9487).add((Object)null);
        ((ArrayList) term9487).add((Object)null);
        Object term9481 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term9481, term9481.getClass(), "id", term9482);
        setField(term9481, term9481.getClass(), "users", term9484);
        setField(term9481, term9481.getClass(), "privileges", term9487);
        setField(term9481, term9481.getClass(), "name", "");
        Long term9492 = new Long(-6503611645609982617L);
        ArrayList term9494 = new ArrayList();
        ((ArrayList) term9494).add((Object)null);
        ((ArrayList) term9494).add((Object)null);
        ArrayList term9497 = new ArrayList();
        ((ArrayList) term9497).add((Object)null);
        ((ArrayList) term9497).add((Object)null);
        ((ArrayList) term9497).add((Object)null);
        ((ArrayList) term9497).add((Object)null);
        ((ArrayList) term9497).add((Object)null);
        ((ArrayList) term9497).add((Object)null);
        ((ArrayList) term9497).add((Object)null);
        ((ArrayList) term9497).add((Object)null);
        ((ArrayList) term9497).add((Object)null);
        Object term9491 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term9491, term9491.getClass(), "id", term9492);
        setField(term9491, term9491.getClass(), "users", term9494);
        setField(term9491, term9491.getClass(), "privileges", term9497);
        setField(term9491, term9491.getClass(), "name", "");
        ArrayList term9469 = new ArrayList();
        ((ArrayList) term9469).add(term9471);
        ((ArrayList) term9469).add(term9481);
        ((ArrayList) term9469).add(term9491);
        term9376 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term9503 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9508 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9514 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9518 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9376, term9376.getClass(), "id", term9377);
        setField(term9376, term9376.getClass(), "membername", "BRMTHqqoRg");
        setField(term9376, term9376.getClass(), "email", "nOElYZBeyU");
        setField(term9376, term9376.getClass(), "password", "eUXPtGmoNg");
        setField(term9376, term9376.getClass(), "enabled", term9415);
        setField(term9376, term9376.getClass(), "age", term9417);
        setField(term9376, term9376.getClass(), "phoneNumber", "ZjqXyUmAJY");
        setField(term9376, term9376.getClass(), "country", "pjEERkBbYo");
        setField(term9376, term9376.getClass(), "birthdate", "FQPqmjhWog");
        setField(term9376, term9376.getClass(), "isUsing2FA", term9455);
        setField(term9376, term9376.getClass(), "secret", "sYtJsiIiSX");
        setField(term9376, term9376.getClass(), "roles", term9469);
        setIntField(term9504, term9504.getClass(), "year", 2023);
        setShortField(term9504, term9504.getClass(), "month", (short) 12);
        setShortField(term9504, term9504.getClass(), "day", (short) 3);
        setField(term9503, term9503.getClass(), "date", term9504);
        setByteField(term9508, term9508.getClass(), "hour", (byte) 14);
        setByteField(term9508, term9508.getClass(), "minute", (byte) 6);
        setByteField(term9508, term9508.getClass(), "second", (byte) 20);
        setIntField(term9508, term9508.getClass(), "nano", 660325634);
        setField(term9503, term9503.getClass(), "time", term9508);
        setField(term9376, term9376.getClass(), "regDate", term9503);
        setIntField(term9514, term9514.getClass(), "year", 2019);
        setShortField(term9514, term9514.getClass(), "month", (short) 2);
        setShortField(term9514, term9514.getClass(), "day", (short) 13);
        setField(term9513, term9513.getClass(), "date", term9514);
        setByteField(term9518, term9518.getClass(), "hour", (byte) 5);
        setByteField(term9518, term9518.getClass(), "minute", (byte) 59);
        setByteField(term9518, term9518.getClass(), "second", (byte) 42);
        setIntField(term9518, term9518.getClass(), "nano", 720385556);
        setField(term9513, term9513.getClass(), "time", term9518);
        setField(term9376, term9376.getClass(), "modDate", term9513);
        setField(term9376, term9376.getClass(), "date", "FTuOcSieav");
        term9535 = new Integer(1296895584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term9535;
        callMethod(klass, "setAge", argTypes, term9376, args);
    }

};


