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
import java.lang.Integer;

public class TrackUnit_setEmployeeId_60715612627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88864;
     Object term89044;

    public TrackUnit_setEmployeeId_60715612627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89047 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term89046 = ((Class) term89047).getDeclaredField((String) "APPROVED");
        ((Field) term89046).setAccessible(true);
        Object enum197 = ((Field) term89046).get((Object) null);
        HashMap term88987 = new HashMap();
        Set<Object> term89477 =  ((Map) term88987).keySet();
        HashSet term88986 = new HashSet((Collection<? extends Object>) term89477);
        Class<? extends Object> term89479 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term89478 = ((Class) term89479).getDeclaredField((String) "MANAGER");
        ((Field) term89478).setAccessible(true);
        Object enum198 = ((Field) term89478).get((Object) null);
        Float term88998 = new Float(0.8823181F);
        term88864 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term88866 = newInstance(Class.forName("java.sql.Date"));
        Object term88909 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term88912 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term88916 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term88980 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term88983 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term88992 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term89000 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term89015 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term89018 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term89021 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term89038 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term89041 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term88864, term88864.getClass(), "id", 1597484336218508869L);
        setLongField(term88866, term88866.getClass(), "fastTime", 1630952644759L);
        setField(term88866, term88866.getClass(), "cdate", null);
        setField(term88864, term88864.getClass(), "workDay", term88866);
        setField(term88864, term88864.getClass(), "status", enum197);
        setFloatField(term88864, term88864.getClass(), "hours", 0.75592405F);
        setField(term88864, term88864.getClass(), "comment", "PGfCDJTBek");
        setField(term88864, term88864.getClass(), "rejectReason", "ZwjARhAtHC");
        setFloatField(term88864, term88864.getClass(), "rate", 0.068145275F);
        setBooleanField(term88864, term88864.getClass(), "billable", true);
        setLongField(term88864, term88864.getClass(), "taskId", -685023850445639859L);
        setIntField(term88864, term88864.getClass(), "employeeId", 1956590498);
        setIntField(term88909, term88909.getClass(), "nanos", 48000000);
        setLongField(term88909, term88909.getClass(), "fastTime", 1340568659000L);
        setField(term88909, term88909.getClass(), "cdate", null);
        setField(term88864, term88864.getClass(), "createdDate", term88909);
        setIntField(term88912, term88912.getClass(), "nanos", 260000000);
        setLongField(term88912, term88912.getClass(), "fastTime", 1851591644000L);
        setField(term88912, term88912.getClass(), "cdate", null);
        setField(term88864, term88864.getClass(), "lastModifiedDate", term88912);
        setBooleanField(term88864, term88864.getClass(), "frozen", true);
        setIntField(term88916, term88916.getClass(), "id", 1467356494);
        setField(term88916, term88916.getClass(), "firstName", "XXvscsYBWv");
        setField(term88916, term88916.getClass(), "middleName", "uePedtiAfL");
        setField(term88916, term88916.getClass(), "lastName", "AdSHvysxQB");
        setField(term88916, term88916.getClass(), "email", "jlraKkBWFA");
        setField(term88916, term88916.getClass(), "passwordHash", "mRBtFTxVdE");
        setIntField(term88916, term88916.getClass(), "positionId", -26316536);
        setBooleanField(term88916, term88916.getClass(), "isArchived", false);
        setIntField(term88980, term88980.getClass(), "nanos", 882000000);
        setLongField(term88980, term88980.getClass(), "fastTime", 1380463404000L);
        setField(term88980, term88980.getClass(), "cdate", null);
        setField(term88916, term88916.getClass(), "createdDate", term88980);
        setIntField(term88983, term88983.getClass(), "nanos", 851000000);
        setLongField(term88983, term88983.getClass(), "fastTime", 1396818653000L);
        setField(term88983, term88983.getClass(), "cdate", null);
        setField(term88916, term88916.getClass(), "lastModifiedDate", term88983);
        setField(term88916, term88916.getClass(), "employeeRoles", term88986);
        setIntField(term88992, term88992.getClass(), "employeeId", 1716165145);
        setIntField(term88992, term88992.getClass(), "projectId", 1692937831);
        setField(term88992, term88992.getClass(), "projectRoleId", enum198);
        setField(term88992, term88992.getClass(), "externalRate", term88998);
        setField(term88916, term88916.getClass(), "employeeProjectRole", term88992);
        setField(term88864, term88864.getClass(), "employee", term88916);
        setIntField(term89000, term89000.getClass(), "id", -1539747985);
        setField(term89000, term89000.getClass(), "name", "IVacFDAZcj");
        setBooleanField(term89000, term89000.getClass(), "isArchived", false);
        setIntField(term89015, term89015.getClass(), "nanos", 979000000);
        setLongField(term89015, term89015.getClass(), "fastTime", 1284950966000L);
        setField(term89015, term89015.getClass(), "cdate", null);
        setField(term89000, term89000.getClass(), "createdDate", term89015);
        setIntField(term89018, term89018.getClass(), "nanos", 41000000);
        setLongField(term89018, term89018.getClass(), "fastTime", 1765026541000L);
        setField(term89018, term89018.getClass(), "cdate", null);
        setField(term89000, term89000.getClass(), "lastModifiedDate", term89018);
        setField(term88864, term88864.getClass(), "project", term89000);
        setLongField(term89021, term89021.getClass(), "id", -6950146046121430355L);
        setField(term89021, term89021.getClass(), "name", "EEYmuwyVDP");
        setIntField(term89021, term89021.getClass(), "projectId", -1982489643);
        setBooleanField(term89021, term89021.getClass(), "billable", false);
        setBooleanField(term89021, term89021.getClass(), "isArchived", false);
        setIntField(term89038, term89038.getClass(), "nanos", 255000000);
        setLongField(term89038, term89038.getClass(), "fastTime", 1443795878000L);
        setField(term89038, term89038.getClass(), "cdate", null);
        setField(term89021, term89021.getClass(), "createdDate", term89038);
        setIntField(term89041, term89041.getClass(), "nanos", 695000000);
        setLongField(term89041, term89041.getClass(), "fastTime", 1379426634000L);
        setField(term89041, term89041.getClass(), "cdate", null);
        setField(term89021, term89021.getClass(), "lastModifiedDate", term89041);
        setField(term88864, term88864.getClass(), "task", term89021);
        term89044 = new Integer(550892835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term89044;
        callMethod(klass, "setEmployeeId", argTypes, term88864, args);
    }

};


