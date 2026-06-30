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

public class ProjectDetailDto_getTasks_7929289732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12240;

    public ProjectDetailDto_getTasks_7929289732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12307 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term12306 = ((Class) term12307).getDeclaredField((String) "MANAGER");
        ((Field) term12306).setAccessible(true);
        Object enum28 = ((Field) term12306).get((Object) null);
        Float term12250 = new Float(0.9828442F);
        Object term12243 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term12243, term12243.getClass(), "id", -1016503459);
        setField(term12243, term12243.getClass(), "firstName", "");
        setField(term12243, term12243.getClass(), "middleName", "");
        setField(term12243, term12243.getClass(), "lastName", "");
        setField(term12243, term12243.getClass(), "projectRoleId", enum28);
        setField(term12243, term12243.getClass(), "externalRate", term12250);
        Float term12257 = new Float(0.9472605F);
        Object term12252 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term12252, term12252.getClass(), "id", -1968847291);
        setField(term12252, term12252.getClass(), "firstName", "");
        setField(term12252, term12252.getClass(), "middleName", "");
        setField(term12252, term12252.getClass(), "lastName", "");
        setField(term12252, term12252.getClass(), "projectRoleId", enum28);
        setField(term12252, term12252.getClass(), "externalRate", term12257);
        Class<? extends Object> term12645 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term12644 = ((Class) term12645).getDeclaredField((String) "EMPLOYEE");
        ((Field) term12644).setAccessible(true);
        Object enum29 = ((Field) term12644).get((Object) null);
        Float term12266 = new Float(0.27797186F);
        Object term12259 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term12259, term12259.getClass(), "id", 579005622);
        setField(term12259, term12259.getClass(), "firstName", "");
        setField(term12259, term12259.getClass(), "middleName", "");
        setField(term12259, term12259.getClass(), "lastName", "");
        setField(term12259, term12259.getClass(), "projectRoleId", enum29);
        setField(term12259, term12259.getClass(), "externalRate", term12266);
        Float term12273 = new Float(0.7467328F);
        Object term12268 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term12268, term12268.getClass(), "id", -14890619);
        setField(term12268, term12268.getClass(), "firstName", "");
        setField(term12268, term12268.getClass(), "middleName", "");
        setField(term12268, term12268.getClass(), "lastName", "");
        setField(term12268, term12268.getClass(), "projectRoleId", enum28);
        setField(term12268, term12268.getClass(), "externalRate", term12273);
        ArrayList term12241 = new ArrayList();
        ((ArrayList) term12241).add(term12243);
        ((ArrayList) term12241).add(term12252);
        ((ArrayList) term12241).add(term12259);
        ((ArrayList) term12241).add(term12268);
        Object term12279 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term12279, term12279.getClass(), "id", 5127676408959197577L);
        setField(term12279, term12279.getClass(), "name", "");
        setBooleanField(term12279, term12279.getClass(), "billable", false);
        setBooleanField(term12279, term12279.getClass(), "isArchived", false);
        ArrayList term12277 = new ArrayList();
        ((ArrayList) term12277).add(term12279);
        term12240 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        Object term12286 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term12289 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term12240, term12240.getClass(), "employees", term12241);
        setField(term12240, term12240.getClass(), "tasks", term12277);
        setIntField(term12286, term12286.getClass(), "nanos", 302000000);
        setLongField(term12286, term12286.getClass(), "fastTime", 1442628765000L);
        setField(term12286, term12286.getClass(), "cdate", null);
        setField(term12240, term12240.getClass(), "createdDate", term12286);
        setIntField(term12289, term12289.getClass(), "nanos", 18000000);
        setLongField(term12289, term12289.getClass(), "fastTime", 1515879330000L);
        setField(term12289, term12289.getClass(), "cdate", null);
        setField(term12240, term12240.getClass(), "lastModifiedDate", term12289);
        setIntField(term12240, term12240.getClass(), "id", 1632125673);
        setField(term12240, term12240.getClass(), "name", "hCWPJQKpdc");
        setBooleanField(term12240, term12240.getClass(), "isArchived", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTasks", argTypes, term12240, args);
    }

};


