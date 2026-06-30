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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Float;

public class TrackUnit_setProject_26641951432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93865;
     Object term94045;

    public TrackUnit_setProject_26641951432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94067 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term94066 = ((Class) term94067).getDeclaredField((String) "REJECTED");
        ((Field) term94066).setAccessible(true);
        Object enum207 = ((Field) term94066).get((Object) null);
        HashMap term93988 = new HashMap();
        Set<Object> term94497 =  ((Map) term93988).keySet();
        HashSet term93987 = new HashSet((Collection<? extends Object>) term94497);
        Class<? extends Object> term94499 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term94498 = ((Class) term94499).getDeclaredField((String) "MANAGER");
        ((Field) term94498).setAccessible(true);
        Object enum208 = ((Field) term94498).get((Object) null);
        Float term93999 = new Float(0.791695F);
        term93865 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term93867 = newInstance(Class.forName("java.sql.Date"));
        Object term93910 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term93913 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term93917 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term93981 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term93984 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term93993 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term94001 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term94016 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term94019 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term94022 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term94039 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term94042 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term93865, term93865.getClass(), "id", 3620247240684476031L);
        setLongField(term93867, term93867.getClass(), "fastTime", 1691868468367L);
        setField(term93867, term93867.getClass(), "cdate", null);
        setField(term93865, term93865.getClass(), "workDay", term93867);
        setField(term93865, term93865.getClass(), "status", enum207);
        setFloatField(term93865, term93865.getClass(), "hours", 0.28528106F);
        setField(term93865, term93865.getClass(), "comment", "gbbYBYyfvr");
        setField(term93865, term93865.getClass(), "rejectReason", "SrWMUlbtWV");
        setFloatField(term93865, term93865.getClass(), "rate", 0.30827713F);
        setBooleanField(term93865, term93865.getClass(), "billable", true);
        setLongField(term93865, term93865.getClass(), "taskId", 8313800941204938919L);
        setIntField(term93865, term93865.getClass(), "employeeId", -1973791064);
        setIntField(term93910, term93910.getClass(), "nanos", 969000000);
        setLongField(term93910, term93910.getClass(), "fastTime", 1691467111000L);
        setField(term93910, term93910.getClass(), "cdate", null);
        setField(term93865, term93865.getClass(), "createdDate", term93910);
        setIntField(term93913, term93913.getClass(), "nanos", 516000000);
        setLongField(term93913, term93913.getClass(), "fastTime", 1788823006000L);
        setField(term93913, term93913.getClass(), "cdate", null);
        setField(term93865, term93865.getClass(), "lastModifiedDate", term93913);
        setBooleanField(term93865, term93865.getClass(), "frozen", false);
        setIntField(term93917, term93917.getClass(), "id", -2072158633);
        setField(term93917, term93917.getClass(), "firstName", "VePIumgrrU");
        setField(term93917, term93917.getClass(), "middleName", "DPwIqlszZo");
        setField(term93917, term93917.getClass(), "lastName", "mNgDshwZNc");
        setField(term93917, term93917.getClass(), "email", "pDqgDbJoFw");
        setField(term93917, term93917.getClass(), "passwordHash", "iVOvTzOxwt");
        setIntField(term93917, term93917.getClass(), "positionId", -355469363);
        setBooleanField(term93917, term93917.getClass(), "isArchived", true);
        setIntField(term93981, term93981.getClass(), "nanos", 297000000);
        setLongField(term93981, term93981.getClass(), "fastTime", 1329055660000L);
        setField(term93981, term93981.getClass(), "cdate", null);
        setField(term93917, term93917.getClass(), "createdDate", term93981);
        setIntField(term93984, term93984.getClass(), "nanos", 200000000);
        setLongField(term93984, term93984.getClass(), "fastTime", 1673661545000L);
        setField(term93984, term93984.getClass(), "cdate", null);
        setField(term93917, term93917.getClass(), "lastModifiedDate", term93984);
        setField(term93917, term93917.getClass(), "employeeRoles", term93987);
        setIntField(term93993, term93993.getClass(), "employeeId", 1465188553);
        setIntField(term93993, term93993.getClass(), "projectId", 1633913667);
        setField(term93993, term93993.getClass(), "projectRoleId", enum208);
        setField(term93993, term93993.getClass(), "externalRate", term93999);
        setField(term93917, term93917.getClass(), "employeeProjectRole", term93993);
        setField(term93865, term93865.getClass(), "employee", term93917);
        setIntField(term94001, term94001.getClass(), "id", 1292332296);
        setField(term94001, term94001.getClass(), "name", "BjZQdecXvB");
        setBooleanField(term94001, term94001.getClass(), "isArchived", false);
        setIntField(term94016, term94016.getClass(), "nanos", 391000000);
        setLongField(term94016, term94016.getClass(), "fastTime", 1733881348000L);
        setField(term94016, term94016.getClass(), "cdate", null);
        setField(term94001, term94001.getClass(), "createdDate", term94016);
        setIntField(term94019, term94019.getClass(), "nanos", 47000000);
        setLongField(term94019, term94019.getClass(), "fastTime", 1393165124000L);
        setField(term94019, term94019.getClass(), "cdate", null);
        setField(term94001, term94001.getClass(), "lastModifiedDate", term94019);
        setField(term93865, term93865.getClass(), "project", term94001);
        setLongField(term94022, term94022.getClass(), "id", -1214968196781083707L);
        setField(term94022, term94022.getClass(), "name", "iUkOOQhEkw");
        setIntField(term94022, term94022.getClass(), "projectId", -1415256843);
        setBooleanField(term94022, term94022.getClass(), "billable", false);
        setBooleanField(term94022, term94022.getClass(), "isArchived", true);
        setIntField(term94039, term94039.getClass(), "nanos", 564000000);
        setLongField(term94039, term94039.getClass(), "fastTime", 1680034679000L);
        setField(term94039, term94039.getClass(), "cdate", null);
        setField(term94022, term94022.getClass(), "createdDate", term94039);
        setIntField(term94042, term94042.getClass(), "nanos", 528000000);
        setLongField(term94042, term94042.getClass(), "fastTime", 1815233078000L);
        setField(term94042, term94042.getClass(), "cdate", null);
        setField(term94022, term94022.getClass(), "lastModifiedDate", term94042);
        setField(term93865, term93865.getClass(), "task", term94022);
        term94045 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term94060 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term94063 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term94045, term94045.getClass(), "id", 612177768);
        setField(term94045, term94045.getClass(), "name", "wmVoFoUVmU");
        setBooleanField(term94045, term94045.getClass(), "isArchived", true);
        setIntField(term94060, term94060.getClass(), "nanos", 660000000);
        setLongField(term94060, term94060.getClass(), "fastTime", 1517687580000L);
        setField(term94060, term94060.getClass(), "cdate", null);
        setField(term94045, term94045.getClass(), "createdDate", term94060);
        setIntField(term94063, term94063.getClass(), "nanos", 565000000);
        setLongField(term94063, term94063.getClass(), "fastTime", 1486149564000L);
        setField(term94063, term94063.getClass(), "cdate", null);
        setField(term94045, term94045.getClass(), "lastModifiedDate", term94063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Project");
        Object[] args = new Object[1];
        args[0] = term94045;
        callMethod(klass, "setProject", argTypes, term93865, args);
    }

};


