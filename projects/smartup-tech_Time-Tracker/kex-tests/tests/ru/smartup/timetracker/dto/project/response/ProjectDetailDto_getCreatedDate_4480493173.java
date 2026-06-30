package ru.smartup.timetracker.dto.project.response;

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
import static ru.smartup.timetracker.dto.project.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Float;

public class ProjectDetailDto_getCreatedDate_4480493173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12995;

    public ProjectDetailDto_getCreatedDate_4480493173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13071 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term13070 = ((Class) term13071).getDeclaredField((String) "EMPLOYEE");
        ((Field) term13070).setAccessible(true);
        Object enum30 = ((Field) term13070).get((Object) null);
        Float term13005 = new Float(0.6436713F);
        Object term12998 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term12998, term12998.getClass(), "id", 454281060);
        setField(term12998, term12998.getClass(), "firstName", "");
        setField(term12998, term12998.getClass(), "middleName", "");
        setField(term12998, term12998.getClass(), "lastName", "");
        setField(term12998, term12998.getClass(), "projectRoleId", enum30);
        setField(term12998, term12998.getClass(), "externalRate", term13005);
        Float term13012 = new Float(0.89057696F);
        Object term13007 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term13007, term13007.getClass(), "id", -1786399638);
        setField(term13007, term13007.getClass(), "firstName", "");
        setField(term13007, term13007.getClass(), "middleName", "");
        setField(term13007, term13007.getClass(), "lastName", "");
        setField(term13007, term13007.getClass(), "projectRoleId", enum30);
        setField(term13007, term13007.getClass(), "externalRate", term13012);
        ArrayList term12996 = new ArrayList();
        ((ArrayList) term12996).add(term12998);
        ((ArrayList) term12996).add(term13007);
        Object term13018 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term13018, term13018.getClass(), "id", -6573104506744284592L);
        setField(term13018, term13018.getClass(), "name", "");
        setBooleanField(term13018, term13018.getClass(), "billable", false);
        setBooleanField(term13018, term13018.getClass(), "isArchived", false);
        Object term13023 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term13023, term13023.getClass(), "id", -4920224193275732920L);
        setField(term13023, term13023.getClass(), "name", "");
        setBooleanField(term13023, term13023.getClass(), "billable", false);
        setBooleanField(term13023, term13023.getClass(), "isArchived", false);
        Object term13028 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term13028, term13028.getClass(), "id", 8428634514691209827L);
        setField(term13028, term13028.getClass(), "name", "");
        setBooleanField(term13028, term13028.getClass(), "billable", true);
        setBooleanField(term13028, term13028.getClass(), "isArchived", true);
        Object term13033 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term13033, term13033.getClass(), "id", -2585684163342970173L);
        setField(term13033, term13033.getClass(), "name", "");
        setBooleanField(term13033, term13033.getClass(), "billable", false);
        setBooleanField(term13033, term13033.getClass(), "isArchived", false);
        Object term13038 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term13038, term13038.getClass(), "id", 8059786003080744426L);
        setField(term13038, term13038.getClass(), "name", "");
        setBooleanField(term13038, term13038.getClass(), "billable", true);
        setBooleanField(term13038, term13038.getClass(), "isArchived", true);
        Object term13043 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term13043, term13043.getClass(), "id", -4365849114644724155L);
        setField(term13043, term13043.getClass(), "name", "");
        setBooleanField(term13043, term13043.getClass(), "billable", true);
        setBooleanField(term13043, term13043.getClass(), "isArchived", false);
        ArrayList term13016 = new ArrayList();
        ((ArrayList) term13016).add(term13018);
        ((ArrayList) term13016).add(term13023);
        ((ArrayList) term13016).add(term13028);
        ((ArrayList) term13016).add(term13033);
        ((ArrayList) term13016).add(term13038);
        ((ArrayList) term13016).add(term13043);
        term12995 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        Object term13050 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term13053 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term12995, term12995.getClass(), "employees", term12996);
        setField(term12995, term12995.getClass(), "tasks", term13016);
        setIntField(term13050, term13050.getClass(), "nanos", 389000000);
        setLongField(term13050, term13050.getClass(), "fastTime", 1429013051000L);
        setField(term13050, term13050.getClass(), "cdate", null);
        setField(term12995, term12995.getClass(), "createdDate", term13050);
        setIntField(term13053, term13053.getClass(), "nanos", 288000000);
        setLongField(term13053, term13053.getClass(), "fastTime", 1495346663000L);
        setField(term13053, term13053.getClass(), "cdate", null);
        setField(term12995, term12995.getClass(), "lastModifiedDate", term13053);
        setIntField(term12995, term12995.getClass(), "id", 2055867847);
        setField(term12995, term12995.getClass(), "name", "gCWtLVKVVe");
        setBooleanField(term12995, term12995.getClass(), "isArchived", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term12995, args);
    }

};


