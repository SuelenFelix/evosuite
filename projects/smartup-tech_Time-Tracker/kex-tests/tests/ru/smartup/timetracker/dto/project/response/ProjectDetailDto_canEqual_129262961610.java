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

public class ProjectDetailDto_canEqual_129262961610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17181;
     Object term17264;

    public ProjectDetailDto_canEqual_129262961610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17266 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term17265 = ((Class) term17266).getDeclaredField((String) "MANAGER");
        ((Field) term17265).setAccessible(true);
        Object enum40 = ((Field) term17265).get((Object) null);
        Float term17191 = new Float(0.51208574F);
        Object term17184 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term17184, term17184.getClass(), "id", 1090617576);
        setField(term17184, term17184.getClass(), "firstName", "");
        setField(term17184, term17184.getClass(), "middleName", "");
        setField(term17184, term17184.getClass(), "lastName", "");
        setField(term17184, term17184.getClass(), "projectRoleId", enum40);
        setField(term17184, term17184.getClass(), "externalRate", term17191);
        Class<? extends Object> term17604 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term17603 = ((Class) term17604).getDeclaredField((String) "EMPLOYEE");
        ((Field) term17603).setAccessible(true);
        Object enum41 = ((Field) term17603).get((Object) null);
        Float term17200 = new Float(0.28528106F);
        Object term17193 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term17193, term17193.getClass(), "id", -1547384488);
        setField(term17193, term17193.getClass(), "firstName", "");
        setField(term17193, term17193.getClass(), "middleName", "");
        setField(term17193, term17193.getClass(), "lastName", "");
        setField(term17193, term17193.getClass(), "projectRoleId", enum41);
        setField(term17193, term17193.getClass(), "externalRate", term17200);
        Float term17207 = new Float(0.30827713F);
        Object term17202 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term17202, term17202.getClass(), "id", 1442160736);
        setField(term17202, term17202.getClass(), "firstName", "");
        setField(term17202, term17202.getClass(), "middleName", "");
        setField(term17202, term17202.getClass(), "lastName", "");
        setField(term17202, term17202.getClass(), "projectRoleId", enum41);
        setField(term17202, term17202.getClass(), "externalRate", term17207);
        Float term17214 = new Float(0.63008493F);
        Object term17209 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term17209, term17209.getClass(), "id", 1114000454);
        setField(term17209, term17209.getClass(), "firstName", "");
        setField(term17209, term17209.getClass(), "middleName", "");
        setField(term17209, term17209.getClass(), "lastName", "");
        setField(term17209, term17209.getClass(), "projectRoleId", enum40);
        setField(term17209, term17209.getClass(), "externalRate", term17214);
        Float term17221 = new Float(0.97831506F);
        Object term17216 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term17216, term17216.getClass(), "id", -556405712);
        setField(term17216, term17216.getClass(), "firstName", "");
        setField(term17216, term17216.getClass(), "middleName", "");
        setField(term17216, term17216.getClass(), "lastName", "");
        setField(term17216, term17216.getClass(), "projectRoleId", enum40);
        setField(term17216, term17216.getClass(), "externalRate", term17221);
        ArrayList term17182 = new ArrayList();
        ((ArrayList) term17182).add(term17184);
        ((ArrayList) term17182).add(term17193);
        ((ArrayList) term17182).add(term17202);
        ((ArrayList) term17182).add(term17209);
        ((ArrayList) term17182).add(term17216);
        Object term17227 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term17227, term17227.getClass(), "id", -2850532706972744550L);
        setField(term17227, term17227.getClass(), "name", "");
        setBooleanField(term17227, term17227.getClass(), "billable", true);
        setBooleanField(term17227, term17227.getClass(), "isArchived", false);
        Object term17232 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term17232, term17232.getClass(), "id", -2644215923136513282L);
        setField(term17232, term17232.getClass(), "name", "");
        setBooleanField(term17232, term17232.getClass(), "billable", false);
        setBooleanField(term17232, term17232.getClass(), "isArchived", true);
        Object term17237 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term17237, term17237.getClass(), "id", -1468719814009985452L);
        setField(term17237, term17237.getClass(), "name", "");
        setBooleanField(term17237, term17237.getClass(), "billable", true);
        setBooleanField(term17237, term17237.getClass(), "isArchived", true);
        ArrayList term17225 = new ArrayList();
        ((ArrayList) term17225).add(term17227);
        ((ArrayList) term17225).add(term17232);
        ((ArrayList) term17225).add(term17237);
        term17181 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        Object term17244 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term17247 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term17181, term17181.getClass(), "employees", term17182);
        setField(term17181, term17181.getClass(), "tasks", term17225);
        setIntField(term17244, term17244.getClass(), "nanos", 394000000);
        setLongField(term17244, term17244.getClass(), "fastTime", 1538068116000L);
        setField(term17244, term17244.getClass(), "cdate", null);
        setField(term17181, term17181.getClass(), "createdDate", term17244);
        setIntField(term17247, term17247.getClass(), "nanos", 937000000);
        setLongField(term17247, term17247.getClass(), "fastTime", 1744079265000L);
        setField(term17247, term17247.getClass(), "cdate", null);
        setField(term17181, term17181.getClass(), "lastModifiedDate", term17247);
        setIntField(term17181, term17181.getClass(), "id", -1772434990);
        setField(term17181, term17181.getClass(), "name", "beAMpkroCQ");
        setBooleanField(term17181, term17181.getClass(), "isArchived", false);
        term17264 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17264;
        callMethod(klass, "canEqual", argTypes, term17181, args);
    }

};


