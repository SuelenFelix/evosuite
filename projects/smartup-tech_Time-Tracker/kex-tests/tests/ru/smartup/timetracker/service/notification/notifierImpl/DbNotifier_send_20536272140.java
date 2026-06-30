package ru.smartup.timetracker.service.notification.notifierImpl;

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
import static ru.smartup.timetracker.service.notification.notifierImpl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class DbNotifier_send_20536272140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term201;

    public DbNotifier_send_20536272140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifierImpl.DbNotifier"));
        setField(term1, term1.getClass(), "noticeService", null);
        HashMap term76 = new HashMap();
        Set<Object> term297 =  ((Map) term76).keySet();
        HashSet term75 = new HashSet((Collection<? extends Object>) term297);
        Class<? extends Object> term322 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term321 = ((Class) term322).getDeclaredField((String) "MANAGER");
        ((Field) term321).setAccessible(true);
        Object enum0 = ((Field) term321).get((Object) null);
        Float term86 = new Float(0.13238746F);
        Object term5 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term69 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term72 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term81 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term5, term5.getClass(), "id", 568599855);
        setField(term5, term5.getClass(), "firstName", "PAEBtnZtTD");
        setField(term5, term5.getClass(), "middleName", "sjlJAEtRrb");
        setField(term5, term5.getClass(), "lastName", "MuLcgQHgqz");
        setField(term5, term5.getClass(), "email", "xxtlPwDYFs");
        setField(term5, term5.getClass(), "passwordHash", "jJCZpVmanW");
        setIntField(term5, term5.getClass(), "positionId", 1162663216);
        setBooleanField(term5, term5.getClass(), "isArchived", false);
        setIntField(term69, term69.getClass(), "nanos", 244000000);
        setLongField(term69, term69.getClass(), "fastTime", 1345860612000L);
        setField(term69, term69.getClass(), "cdate", null);
        setField(term5, term5.getClass(), "createdDate", term69);
        setIntField(term72, term72.getClass(), "nanos", 369000000);
        setLongField(term72, term72.getClass(), "fastTime", 1480427551000L);
        setField(term72, term72.getClass(), "cdate", null);
        setField(term5, term5.getClass(), "lastModifiedDate", term72);
        setField(term5, term5.getClass(), "employeeRoles", term75);
        setIntField(term81, term81.getClass(), "employeeId", 1484323161);
        setIntField(term81, term81.getClass(), "projectId", 391863371);
        setField(term81, term81.getClass(), "projectRoleId", enum0);
        setField(term81, term81.getClass(), "externalRate", term86);
        setField(term5, term5.getClass(), "employeeProjectRole", term81);
        HashSet term104 = new HashSet();
        Float term108 = new Float(0.2707036F);
        Object term89 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term98 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term101 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term105 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term89, term89.getClass(), "id", -1922583790);
        setField(term89, term89.getClass(), "firstName", "");
        setField(term89, term89.getClass(), "middleName", "");
        setField(term89, term89.getClass(), "lastName", "");
        setField(term89, term89.getClass(), "email", "");
        setField(term89, term89.getClass(), "passwordHash", "");
        setIntField(term89, term89.getClass(), "positionId", -616727354);
        setBooleanField(term89, term89.getClass(), "isArchived", false);
        setIntField(term98, term98.getClass(), "nanos", 830000000);
        setLongField(term98, term98.getClass(), "fastTime", 1610929382000L);
        setField(term98, term98.getClass(), "cdate", null);
        setField(term89, term89.getClass(), "createdDate", term98);
        setIntField(term101, term101.getClass(), "nanos", 837000000);
        setLongField(term101, term101.getClass(), "fastTime", 1606034835000L);
        setField(term101, term101.getClass(), "cdate", null);
        setField(term89, term89.getClass(), "lastModifiedDate", term101);
        setField(term89, term89.getClass(), "employeeRoles", term104);
        setIntField(term105, term105.getClass(), "employeeId", -1955890973);
        setIntField(term105, term105.getClass(), "projectId", -2038273078);
        setField(term105, term105.getClass(), "projectRoleId", enum0);
        setField(term105, term105.getClass(), "externalRate", term108);
        setField(term89, term89.getClass(), "employeeProjectRole", term105);
        Object term111 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term111, term111.getClass(), "id", 1227103734);
        setField(term111, term111.getClass(), "firstName", null);
        setField(term111, term111.getClass(), "middleName", null);
        setField(term111, term111.getClass(), "lastName", null);
        setField(term111, term111.getClass(), "email", null);
        setField(term111, term111.getClass(), "passwordHash", null);
        setIntField(term111, term111.getClass(), "positionId", -1339778481);
        setBooleanField(term111, term111.getClass(), "isArchived", false);
        setField(term111, term111.getClass(), "createdDate", null);
        setField(term111, term111.getClass(), "lastModifiedDate", null);
        setField(term111, term111.getClass(), "employeeRoles", null);
        setField(term111, term111.getClass(), "employeeProjectRole", null);
        term2 = new LinkedList();
        ((LinkedList) term2).add(term5);
        ((LinkedList) term2).add(term89);
        ((LinkedList) term2).add(term111);
        ((LinkedList) term2).add((Object)null);
        ((LinkedList) term2).add((Object)null);
        Class<? extends Object> term961 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term960 = ((Class) term961).getDeclaredField((String) "APPROVAL_REQUIRED");
        ((Field) term960).setAccessible(true);
        Object enum1 = ((Field) term960).get((Object) null);
        term201 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term237 = newInstance(Class.forName("java.lang.Object"));
        Object term241 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term244 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term201, term201.getClass(), "id", 2442117782898005296L);
        setField(term201, term201.getClass(), "type", enum1);
        setIntField(term201, term201.getClass(), "employeeId", -655067527);
        setField(term201, term201.getClass(), "text", "vrQLuWIDJX");
        setField(term201, term201.getClass(), "data", term237);
        setBooleanField(term201, term201.getClass(), "read", true);
        setBooleanField(term201, term201.getClass(), "deleted", true);
        setIntField(term201, term201.getClass(), "createdBy", -6029667);
        setIntField(term241, term241.getClass(), "nanos", 25000000);
        setLongField(term241, term241.getClass(), "fastTime", 1797192828000L);
        setField(term241, term241.getClass(), "cdate", null);
        setField(term201, term201.getClass(), "createdDate", term241);
        setIntField(term244, term244.getClass(), "nanos", 30000000);
        setLongField(term244, term244.getClass(), "fastTime", 1589447121000L);
        setField(term244, term244.getClass(), "cdate", null);
        setField(term201, term201.getClass(), "lastModifiedDate", term244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.notifierImpl.DbNotifier");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term201;
        callMethod(klass, "send", argTypes, term1, args);
    }

};


