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

public class ProjectDetailDto_setCreatedDate_20353731217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15544;
     Object term15663;

    public ProjectDetailDto_setCreatedDate_20353731217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15667 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term15666 = ((Class) term15667).getDeclaredField((String) "MANAGER");
        ((Field) term15666).setAccessible(true);
        Object enum36 = ((Field) term15666).get((Object) null);
        Float term15554 = new Float(0.478669F);
        Object term15547 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term15547, term15547.getClass(), "id", 1540719661);
        setField(term15547, term15547.getClass(), "firstName", "");
        setField(term15547, term15547.getClass(), "middleName", "");
        setField(term15547, term15547.getClass(), "lastName", "");
        setField(term15547, term15547.getClass(), "projectRoleId", enum36);
        setField(term15547, term15547.getClass(), "externalRate", term15554);
        Class<? extends Object> term16005 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term16004 = ((Class) term16005).getDeclaredField((String) "MANAGER");
        ((Field) term16004).setAccessible(true);
        Object enum37 = ((Field) term16004).get((Object) null);
        Float term15563 = new Float(0.75592405F);
        Object term15556 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term15556, term15556.getClass(), "id", 1265463001);
        setField(term15556, term15556.getClass(), "firstName", "");
        setField(term15556, term15556.getClass(), "middleName", "");
        setField(term15556, term15556.getClass(), "lastName", "");
        setField(term15556, term15556.getClass(), "projectRoleId", enum37);
        setField(term15556, term15556.getClass(), "externalRate", term15563);
        Float term15570 = new Float(0.068145275F);
        Object term15565 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term15565, term15565.getClass(), "id", 335112684);
        setField(term15565, term15565.getClass(), "firstName", "");
        setField(term15565, term15565.getClass(), "middleName", "");
        setField(term15565, term15565.getClass(), "lastName", "");
        setField(term15565, term15565.getClass(), "projectRoleId", enum36);
        setField(term15565, term15565.getClass(), "externalRate", term15570);
        Float term15577 = new Float(0.10667074F);
        Object term15572 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term15572, term15572.getClass(), "id", 1551099402);
        setField(term15572, term15572.getClass(), "firstName", "");
        setField(term15572, term15572.getClass(), "middleName", "");
        setField(term15572, term15572.getClass(), "lastName", "");
        setField(term15572, term15572.getClass(), "projectRoleId", enum36);
        setField(term15572, term15572.getClass(), "externalRate", term15577);
        Float term15584 = new Float(0.9571234F);
        Object term15579 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term15579, term15579.getClass(), "id", -2027534003);
        setField(term15579, term15579.getClass(), "firstName", "");
        setField(term15579, term15579.getClass(), "middleName", "");
        setField(term15579, term15579.getClass(), "lastName", "");
        setField(term15579, term15579.getClass(), "projectRoleId", enum37);
        setField(term15579, term15579.getClass(), "externalRate", term15584);
        Float term15591 = new Float(0.114929974F);
        Object term15586 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term15586, term15586.getClass(), "id", 1063420942);
        setField(term15586, term15586.getClass(), "firstName", "");
        setField(term15586, term15586.getClass(), "middleName", "");
        setField(term15586, term15586.getClass(), "lastName", "");
        setField(term15586, term15586.getClass(), "projectRoleId", enum36);
        setField(term15586, term15586.getClass(), "externalRate", term15591);
        Float term15598 = new Float(0.30926234F);
        Object term15593 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term15593, term15593.getClass(), "id", 1375330971);
        setField(term15593, term15593.getClass(), "firstName", "");
        setField(term15593, term15593.getClass(), "middleName", "");
        setField(term15593, term15593.getClass(), "lastName", "");
        setField(term15593, term15593.getClass(), "projectRoleId", enum36);
        setField(term15593, term15593.getClass(), "externalRate", term15598);
        Float term15605 = new Float(0.37161416F);
        Object term15600 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term15600, term15600.getClass(), "id", -478195677);
        setField(term15600, term15600.getClass(), "firstName", "");
        setField(term15600, term15600.getClass(), "middleName", "");
        setField(term15600, term15600.getClass(), "lastName", "");
        setField(term15600, term15600.getClass(), "projectRoleId", enum36);
        setField(term15600, term15600.getClass(), "externalRate", term15605);
        ArrayList term15545 = new ArrayList();
        ((ArrayList) term15545).add(term15547);
        ((ArrayList) term15545).add(term15556);
        ((ArrayList) term15545).add(term15565);
        ((ArrayList) term15545).add(term15572);
        ((ArrayList) term15545).add(term15579);
        ((ArrayList) term15545).add(term15586);
        ((ArrayList) term15545).add(term15593);
        ((ArrayList) term15545).add(term15600);
        Object term15611 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term15611, term15611.getClass(), "id", 1439298019805881866L);
        setField(term15611, term15611.getClass(), "name", "");
        setBooleanField(term15611, term15611.getClass(), "billable", true);
        setBooleanField(term15611, term15611.getClass(), "isArchived", true);
        Object term15616 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term15616, term15616.getClass(), "id", -8708192233349544946L);
        setField(term15616, term15616.getClass(), "name", "");
        setBooleanField(term15616, term15616.getClass(), "billable", false);
        setBooleanField(term15616, term15616.getClass(), "isArchived", false);
        Object term15621 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term15621, term15621.getClass(), "id", 5907001541142728739L);
        setField(term15621, term15621.getClass(), "name", "");
        setBooleanField(term15621, term15621.getClass(), "billable", true);
        setBooleanField(term15621, term15621.getClass(), "isArchived", true);
        Object term15626 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term15626, term15626.getClass(), "id", 4178434741742309755L);
        setField(term15626, term15626.getClass(), "name", "");
        setBooleanField(term15626, term15626.getClass(), "billable", true);
        setBooleanField(term15626, term15626.getClass(), "isArchived", false);
        Object term15631 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term15631, term15631.getClass(), "id", -2068172595987555756L);
        setField(term15631, term15631.getClass(), "name", "");
        setBooleanField(term15631, term15631.getClass(), "billable", true);
        setBooleanField(term15631, term15631.getClass(), "isArchived", true);
        Object term15636 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term15636, term15636.getClass(), "id", -6292278961887936280L);
        setField(term15636, term15636.getClass(), "name", "");
        setBooleanField(term15636, term15636.getClass(), "billable", true);
        setBooleanField(term15636, term15636.getClass(), "isArchived", false);
        ArrayList term15609 = new ArrayList();
        ((ArrayList) term15609).add(term15611);
        ((ArrayList) term15609).add(term15616);
        ((ArrayList) term15609).add(term15621);
        ((ArrayList) term15609).add(term15626);
        ((ArrayList) term15609).add(term15631);
        ((ArrayList) term15609).add(term15636);
        term15544 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        Object term15643 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term15646 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term15544, term15544.getClass(), "employees", term15545);
        setField(term15544, term15544.getClass(), "tasks", term15609);
        setIntField(term15643, term15643.getClass(), "nanos", 457000000);
        setLongField(term15643, term15643.getClass(), "fastTime", 1706067372000L);
        setField(term15643, term15643.getClass(), "cdate", null);
        setField(term15544, term15544.getClass(), "createdDate", term15643);
        setIntField(term15646, term15646.getClass(), "nanos", 992000000);
        setLongField(term15646, term15646.getClass(), "fastTime", 1863620294000L);
        setField(term15646, term15646.getClass(), "cdate", null);
        setField(term15544, term15544.getClass(), "lastModifiedDate", term15646);
        setIntField(term15544, term15544.getClass(), "id", 972867650);
        setField(term15544, term15544.getClass(), "name", "AHbZyFOmlo");
        setBooleanField(term15544, term15544.getClass(), "isArchived", true);
        term15663 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term15663, term15663.getClass(), "nanos", 364000000);
        setLongField(term15663, term15663.getClass(), "fastTime", 1882628084000L);
        setField(term15663, term15663.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term15663;
        callMethod(klass, "setCreatedDate", argTypes, term15544, args);
    }

};


