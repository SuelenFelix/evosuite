package ru.smartup.timetracker.service.notification.notifier;

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
import static ru.smartup.timetracker.service.notification.notifier.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class NotifierObservable_notifyAllChannels_14547364611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;
     Object term65;
     Object term286;

    public NotifierObservable_notifyAllChannels_14547364611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term56 = new HashMap();
        term55 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable"));
        setField(term55, term55.getClass(), "appNotifiers", term56);
        setField(term55, term55.getClass(), "executorService", null);
        HashMap term139 = new HashMap();
        Set<Object> term382 =  ((Map) term139).keySet();
        HashSet term138 = new HashSet((Collection<? extends Object>) term382);
        Class<? extends Object> term407 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term406 = ((Class) term407).getDeclaredField((String) "MANAGER");
        ((Field) term406).setAccessible(true);
        Object enum0 = ((Field) term406).get((Object) null);
        Float term149 = new Float(0.13238746F);
        Object term68 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term132 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term135 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term144 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term68, term68.getClass(), "id", 568599855);
        setField(term68, term68.getClass(), "firstName", "SzjVpOQTyS");
        setField(term68, term68.getClass(), "middleName", "MjGYSRKTNF");
        setField(term68, term68.getClass(), "lastName", "hRNSzYYIrc");
        setField(term68, term68.getClass(), "email", "RMFIsYGgne");
        setField(term68, term68.getClass(), "passwordHash", "NRdvgJlhkX");
        setIntField(term68, term68.getClass(), "positionId", 1162663216);
        setBooleanField(term68, term68.getClass(), "isArchived", false);
        setIntField(term132, term132.getClass(), "nanos", 244000000);
        setLongField(term132, term132.getClass(), "fastTime", 1345860612000L);
        setField(term132, term132.getClass(), "cdate", null);
        setField(term68, term68.getClass(), "createdDate", term132);
        setIntField(term135, term135.getClass(), "nanos", 369000000);
        setLongField(term135, term135.getClass(), "fastTime", 1480427551000L);
        setField(term135, term135.getClass(), "cdate", null);
        setField(term68, term68.getClass(), "lastModifiedDate", term135);
        setField(term68, term68.getClass(), "employeeRoles", term138);
        setIntField(term144, term144.getClass(), "employeeId", 1484323161);
        setIntField(term144, term144.getClass(), "projectId", 391863371);
        setField(term144, term144.getClass(), "projectRoleId", enum0);
        setField(term144, term144.getClass(), "externalRate", term149);
        setField(term68, term68.getClass(), "employeeProjectRole", term144);
        HashSet term167 = new HashSet();
        Float term171 = new Float(0.2707036F);
        Object term152 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term161 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term164 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term168 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term152, term152.getClass(), "id", -1922583790);
        setField(term152, term152.getClass(), "firstName", "");
        setField(term152, term152.getClass(), "middleName", "");
        setField(term152, term152.getClass(), "lastName", "");
        setField(term152, term152.getClass(), "email", "");
        setField(term152, term152.getClass(), "passwordHash", "");
        setIntField(term152, term152.getClass(), "positionId", -616727354);
        setBooleanField(term152, term152.getClass(), "isArchived", false);
        setIntField(term161, term161.getClass(), "nanos", 830000000);
        setLongField(term161, term161.getClass(), "fastTime", 1610929382000L);
        setField(term161, term161.getClass(), "cdate", null);
        setField(term152, term152.getClass(), "createdDate", term161);
        setIntField(term164, term164.getClass(), "nanos", 837000000);
        setLongField(term164, term164.getClass(), "fastTime", 1606034835000L);
        setField(term164, term164.getClass(), "cdate", null);
        setField(term152, term152.getClass(), "lastModifiedDate", term164);
        setField(term152, term152.getClass(), "employeeRoles", term167);
        setIntField(term168, term168.getClass(), "employeeId", -1955890973);
        setIntField(term168, term168.getClass(), "projectId", -2038273078);
        setField(term168, term168.getClass(), "projectRoleId", enum0);
        setField(term168, term168.getClass(), "externalRate", term171);
        setField(term152, term152.getClass(), "employeeProjectRole", term168);
        Object term174 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        setIntField(term174, term174.getClass(), "id", 1227103734);
        setField(term174, term174.getClass(), "firstName", null);
        setField(term174, term174.getClass(), "middleName", null);
        setField(term174, term174.getClass(), "lastName", null);
        setField(term174, term174.getClass(), "email", null);
        setField(term174, term174.getClass(), "passwordHash", null);
        setIntField(term174, term174.getClass(), "positionId", -1339778481);
        setBooleanField(term174, term174.getClass(), "isArchived", false);
        setField(term174, term174.getClass(), "createdDate", null);
        setField(term174, term174.getClass(), "lastModifiedDate", null);
        setField(term174, term174.getClass(), "employeeRoles", null);
        setField(term174, term174.getClass(), "employeeProjectRole", null);
        term65 = new LinkedList();
        ((LinkedList) term65).add(term68);
        ((LinkedList) term65).add(term152);
        ((LinkedList) term65).add(term174);
        ((LinkedList) term65).add((Object)null);
        ((LinkedList) term65).add((Object)null);
        ((LinkedList) term65).add((Object)null);
        Class<? extends Object> term1046 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term1045 = ((Class) term1046).getDeclaredField((String) "APPROVAL_REQUIRED");
        ((Field) term1045).setAccessible(true);
        Object enum1 = ((Field) term1045).get((Object) null);
        term286 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term322 = newInstance(Class.forName("java.lang.Object"));
        Object term326 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term329 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term286, term286.getClass(), "id", 2442117782898005296L);
        setField(term286, term286.getClass(), "type", enum1);
        setIntField(term286, term286.getClass(), "employeeId", -1007160944);
        setField(term286, term286.getClass(), "text", "xrwlQZdwCp");
        setField(term286, term286.getClass(), "data", term322);
        setBooleanField(term286, term286.getClass(), "read", true);
        setBooleanField(term286, term286.getClass(), "deleted", true);
        setIntField(term286, term286.getClass(), "createdBy", 1135664017);
        setIntField(term326, term326.getClass(), "nanos", 80000000);
        setLongField(term326, term326.getClass(), "fastTime", 1745452162000L);
        setField(term326, term326.getClass(), "cdate", null);
        setField(term286, term286.getClass(), "createdDate", term326);
        setIntField(term329, term329.getClass(), "nanos", 960000000);
        setLongField(term329, term329.getClass(), "fastTime", 1349058953000L);
        setField(term329, term329.getClass(), "cdate", null);
        setField(term286, term286.getClass(), "lastModifiedDate", term329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[2];
        args[0] = term65;
        args[1] = term286;
        callMethod(klass, "notifyAllChannels", argTypes, term55, args);
    }

};


