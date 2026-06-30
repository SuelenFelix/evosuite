package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class FreezeRecord_setCreatedDate_3242495216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57548;
     Object term57671;

    public FreezeRecord_setCreatedDate_3242495216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term57625 = new HashMap();
        Set<Object> term57724 =  ((Map) term57625).keySet();
        HashSet term57624 = new HashSet((Collection<? extends Object>) term57724);
        Class<? extends Object> term57726 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term57725 = ((Class) term57726).getDeclaredField((String) "EMPLOYEE");
        ((Field) term57725).setAccessible(true);
        Object enum133 = ((Field) term57725).get((Object) null);
        Float term57636 = new Float(0.022591352F);
        Class<? extends Object> term58067 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term58066 = ((Class) term58067).getDeclaredField((String) "INTERRUPTED");
        ((Field) term58066).setAccessible(true);
        Object enum134 = ((Field) term58066).get((Object) null);
        term57548 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term57550 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57554 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term57618 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term57621 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term57630 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term57665 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term57668 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term57548, term57548.getClass(), "id", 76929641);
        setIntField(term57550, term57550.getClass(), "year", 2015);
        setShortField(term57550, term57550.getClass(), "month", (short) 7);
        setShortField(term57550, term57550.getClass(), "day", (short) 24);
        setField(term57548, term57548.getClass(), "freezeDate", term57550);
        setIntField(term57554, term57554.getClass(), "id", -2003192918);
        setField(term57554, term57554.getClass(), "firstName", "oPxuZbkYio");
        setField(term57554, term57554.getClass(), "middleName", "vKitydDVnM");
        setField(term57554, term57554.getClass(), "lastName", "urCiQnUFBM");
        setField(term57554, term57554.getClass(), "email", "EKjQdtKxAM");
        setField(term57554, term57554.getClass(), "passwordHash", "TXZAIPQJHt");
        setIntField(term57554, term57554.getClass(), "positionId", -1362856620);
        setBooleanField(term57554, term57554.getClass(), "isArchived", true);
        setIntField(term57618, term57618.getClass(), "nanos", 928000000);
        setLongField(term57618, term57618.getClass(), "fastTime", 1765802678000L);
        setField(term57618, term57618.getClass(), "cdate", null);
        setField(term57554, term57554.getClass(), "createdDate", term57618);
        setIntField(term57621, term57621.getClass(), "nanos", 907000000);
        setLongField(term57621, term57621.getClass(), "fastTime", 1598702931000L);
        setField(term57621, term57621.getClass(), "cdate", null);
        setField(term57554, term57554.getClass(), "lastModifiedDate", term57621);
        setField(term57554, term57554.getClass(), "employeeRoles", term57624);
        setIntField(term57630, term57630.getClass(), "employeeId", -1835839814);
        setIntField(term57630, term57630.getClass(), "projectId", -1404350380);
        setField(term57630, term57630.getClass(), "projectRoleId", enum133);
        setField(term57630, term57630.getClass(), "externalRate", term57636);
        setField(term57554, term57554.getClass(), "employeeProjectRole", term57630);
        setField(term57548, term57548.getClass(), "employee", term57554);
        setField(term57548, term57548.getClass(), "status", enum134);
        setField(term57548, term57548.getClass(), "info", "DIbeDHICho");
        setIntField(term57665, term57665.getClass(), "nanos", 965000000);
        setLongField(term57665, term57665.getClass(), "fastTime", 1707075231000L);
        setField(term57665, term57665.getClass(), "cdate", null);
        setField(term57548, term57548.getClass(), "createdDate", term57665);
        setIntField(term57668, term57668.getClass(), "nanos", 8000000);
        setLongField(term57668, term57668.getClass(), "fastTime", 1697606524000L);
        setField(term57668, term57668.getClass(), "cdate", null);
        setField(term57548, term57548.getClass(), "lastModifiedDate", term57668);
        term57671 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term57671, term57671.getClass(), "nanos", 817000000);
        setLongField(term57671, term57671.getClass(), "fastTime", 1684745176000L);
        setField(term57671, term57671.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term57671;
        callMethod(klass, "setCreatedDate", argTypes, term57548, args);
    }

};


