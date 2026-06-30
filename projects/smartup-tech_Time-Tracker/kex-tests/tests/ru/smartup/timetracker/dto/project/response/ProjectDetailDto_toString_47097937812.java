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

public class ProjectDetailDto_toString_47097937812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18723;

    public ProjectDetailDto_toString_47097937812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18794 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term18793 = ((Class) term18794).getDeclaredField((String) "EMPLOYEE");
        ((Field) term18793).setAccessible(true);
        Object enum44 = ((Field) term18793).get((Object) null);
        Float term18733 = new Float(0.06688923F);
        Object term18726 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term18726, term18726.getClass(), "id", 941650513);
        setField(term18726, term18726.getClass(), "firstName", "");
        setField(term18726, term18726.getClass(), "middleName", "");
        setField(term18726, term18726.getClass(), "lastName", "");
        setField(term18726, term18726.getClass(), "projectRoleId", enum44);
        setField(term18726, term18726.getClass(), "externalRate", term18733);
        Float term18740 = new Float(0.22417867F);
        Object term18735 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term18735, term18735.getClass(), "id", 444029505);
        setField(term18735, term18735.getClass(), "firstName", "");
        setField(term18735, term18735.getClass(), "middleName", "");
        setField(term18735, term18735.getClass(), "lastName", "");
        setField(term18735, term18735.getClass(), "projectRoleId", enum44);
        setField(term18735, term18735.getClass(), "externalRate", term18740);
        ArrayList term18724 = new ArrayList();
        ((ArrayList) term18724).add(term18726);
        ((ArrayList) term18724).add(term18735);
        Object term18746 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term18746, term18746.getClass(), "id", 2443640364875054177L);
        setField(term18746, term18746.getClass(), "name", "");
        setBooleanField(term18746, term18746.getClass(), "billable", false);
        setBooleanField(term18746, term18746.getClass(), "isArchived", false);
        Object term18751 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term18751, term18751.getClass(), "id", -1610676979013636850L);
        setField(term18751, term18751.getClass(), "name", "");
        setBooleanField(term18751, term18751.getClass(), "billable", true);
        setBooleanField(term18751, term18751.getClass(), "isArchived", false);
        Object term18756 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term18756, term18756.getClass(), "id", 2062173786000223358L);
        setField(term18756, term18756.getClass(), "name", "");
        setBooleanField(term18756, term18756.getClass(), "billable", false);
        setBooleanField(term18756, term18756.getClass(), "isArchived", false);
        Object term18761 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term18761, term18761.getClass(), "id", -8658027316505137504L);
        setField(term18761, term18761.getClass(), "name", "");
        setBooleanField(term18761, term18761.getClass(), "billable", true);
        setBooleanField(term18761, term18761.getClass(), "isArchived", false);
        Object term18766 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term18766, term18766.getClass(), "id", 414749984815662075L);
        setField(term18766, term18766.getClass(), "name", "");
        setBooleanField(term18766, term18766.getClass(), "billable", false);
        setBooleanField(term18766, term18766.getClass(), "isArchived", true);
        ArrayList term18744 = new ArrayList();
        ((ArrayList) term18744).add(term18746);
        ((ArrayList) term18744).add(term18751);
        ((ArrayList) term18744).add(term18756);
        ((ArrayList) term18744).add(term18761);
        ((ArrayList) term18744).add(term18766);
        term18723 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        Object term18773 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term18776 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term18723, term18723.getClass(), "employees", term18724);
        setField(term18723, term18723.getClass(), "tasks", term18744);
        setIntField(term18773, term18773.getClass(), "nanos", 759000000);
        setLongField(term18773, term18773.getClass(), "fastTime", 1630941844000L);
        setField(term18773, term18773.getClass(), "cdate", null);
        setField(term18723, term18723.getClass(), "createdDate", term18773);
        setIntField(term18776, term18776.getClass(), "nanos", 956000000);
        setLongField(term18776, term18776.getClass(), "fastTime", 1739406992000L);
        setField(term18776, term18776.getClass(), "cdate", null);
        setField(term18723, term18723.getClass(), "lastModifiedDate", term18776);
        setIntField(term18723, term18723.getClass(), "id", -1034506028);
        setField(term18723, term18723.getClass(), "name", "zNdorvdUgu");
        setBooleanField(term18723, term18723.getClass(), "isArchived", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term18723, args);
    }

};


