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

public class ProjectDetailDto_getEmployees_187283421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11460;

    public ProjectDetailDto_getEmployees_187283421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11549 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term11548 = ((Class) term11549).getDeclaredField((String) "EMPLOYEE");
        ((Field) term11548).setAccessible(true);
        Object enum26 = ((Field) term11548).get((Object) null);
        Float term11470 = new Float(0.20144695F);
        Object term11463 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term11463, term11463.getClass(), "id", 1962444399);
        setField(term11463, term11463.getClass(), "firstName", "");
        setField(term11463, term11463.getClass(), "middleName", "");
        setField(term11463, term11463.getClass(), "lastName", "");
        setField(term11463, term11463.getClass(), "projectRoleId", enum26);
        setField(term11463, term11463.getClass(), "externalRate", term11470);
        Class<? extends Object> term11890 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term11889 = ((Class) term11890).getDeclaredField((String) "EMPLOYEE");
        ((Field) term11889).setAccessible(true);
        Object enum27 = ((Field) term11889).get((Object) null);
        Float term11479 = new Float(0.7031006F);
        Object term11472 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term11472, term11472.getClass(), "id", 767834723);
        setField(term11472, term11472.getClass(), "firstName", "");
        setField(term11472, term11472.getClass(), "middleName", "");
        setField(term11472, term11472.getClass(), "lastName", "");
        setField(term11472, term11472.getClass(), "projectRoleId", enum27);
        setField(term11472, term11472.getClass(), "externalRate", term11479);
        Float term11486 = new Float(0.9431611F);
        Object term11481 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term11481, term11481.getClass(), "id", -602026508);
        setField(term11481, term11481.getClass(), "firstName", "");
        setField(term11481, term11481.getClass(), "middleName", "");
        setField(term11481, term11481.getClass(), "lastName", "");
        setField(term11481, term11481.getClass(), "projectRoleId", enum27);
        setField(term11481, term11481.getClass(), "externalRate", term11486);
        Float term11493 = new Float(0.95272815F);
        Object term11488 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term11488, term11488.getClass(), "id", -157887805);
        setField(term11488, term11488.getClass(), "firstName", "");
        setField(term11488, term11488.getClass(), "middleName", "");
        setField(term11488, term11488.getClass(), "lastName", "");
        setField(term11488, term11488.getClass(), "projectRoleId", enum27);
        setField(term11488, term11488.getClass(), "externalRate", term11493);
        Float term11500 = new Float(0.7254646F);
        Object term11495 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term11495, term11495.getClass(), "id", 1876565163);
        setField(term11495, term11495.getClass(), "firstName", "");
        setField(term11495, term11495.getClass(), "middleName", "");
        setField(term11495, term11495.getClass(), "lastName", "");
        setField(term11495, term11495.getClass(), "projectRoleId", enum27);
        setField(term11495, term11495.getClass(), "externalRate", term11500);
        ArrayList term11461 = new ArrayList();
        ((ArrayList) term11461).add(term11463);
        ((ArrayList) term11461).add(term11472);
        ((ArrayList) term11461).add(term11481);
        ((ArrayList) term11461).add(term11488);
        ((ArrayList) term11461).add(term11495);
        Object term11506 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term11506, term11506.getClass(), "id", 2535595959091595249L);
        setField(term11506, term11506.getClass(), "name", "");
        setBooleanField(term11506, term11506.getClass(), "billable", true);
        setBooleanField(term11506, term11506.getClass(), "isArchived", true);
        Object term11511 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term11511, term11511.getClass(), "id", -5476826692763582090L);
        setField(term11511, term11511.getClass(), "name", "");
        setBooleanField(term11511, term11511.getClass(), "billable", false);
        setBooleanField(term11511, term11511.getClass(), "isArchived", true);
        Object term11516 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term11516, term11516.getClass(), "id", -872011222785455006L);
        setField(term11516, term11516.getClass(), "name", "");
        setBooleanField(term11516, term11516.getClass(), "billable", false);
        setBooleanField(term11516, term11516.getClass(), "isArchived", false);
        Object term11521 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term11521, term11521.getClass(), "id", -316468845751588286L);
        setField(term11521, term11521.getClass(), "name", "");
        setBooleanField(term11521, term11521.getClass(), "billable", true);
        setBooleanField(term11521, term11521.getClass(), "isArchived", false);
        ArrayList term11504 = new ArrayList();
        ((ArrayList) term11504).add(term11506);
        ((ArrayList) term11504).add(term11511);
        ((ArrayList) term11504).add(term11516);
        ((ArrayList) term11504).add(term11521);
        term11460 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        Object term11528 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term11531 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term11460, term11460.getClass(), "employees", term11461);
        setField(term11460, term11460.getClass(), "tasks", term11504);
        setIntField(term11528, term11528.getClass(), "nanos", 830000000);
        setLongField(term11528, term11528.getClass(), "fastTime", 1610929382000L);
        setField(term11528, term11528.getClass(), "cdate", null);
        setField(term11460, term11460.getClass(), "createdDate", term11528);
        setIntField(term11531, term11531.getClass(), "nanos", 837000000);
        setLongField(term11531, term11531.getClass(), "fastTime", 1606034835000L);
        setField(term11531, term11531.getClass(), "cdate", null);
        setField(term11460, term11460.getClass(), "lastModifiedDate", term11531);
        setIntField(term11460, term11460.getClass(), "id", -817164822);
        setField(term11460, term11460.getClass(), "name", "sEnIVFtZuQ");
        setBooleanField(term11460, term11460.getClass(), "isArchived", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployees", argTypes, term11460, args);
    }

};


