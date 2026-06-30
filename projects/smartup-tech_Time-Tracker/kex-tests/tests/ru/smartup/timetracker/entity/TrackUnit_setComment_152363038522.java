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

public class TrackUnit_setComment_152363038522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83962;

    public TrackUnit_setComment_152363038522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84155 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term84154 = ((Class) term84155).getDeclaredField((String) "REJECTED");
        ((Field) term84154).setAccessible(true);
        Object enum187 = ((Field) term84154).get((Object) null);
        HashMap term84085 = new HashMap();
        Set<Object> term84585 =  ((Map) term84085).keySet();
        HashSet term84084 = new HashSet((Collection<? extends Object>) term84585);
        Class<? extends Object> term84587 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term84586 = ((Class) term84587).getDeclaredField((String) "MANAGER");
        ((Field) term84586).setAccessible(true);
        Object enum188 = ((Field) term84586).get((Object) null);
        Float term84096 = new Float(0.3357792F);
        term83962 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term83964 = newInstance(Class.forName("java.sql.Date"));
        Object term84007 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term84010 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term84014 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term84078 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term84081 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term84090 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term84098 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term84113 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term84116 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term84119 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term84136 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term84139 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term83962, term83962.getClass(), "id", 3133860696238261492L);
        setLongField(term83964, term83964.getClass(), "fastTime", 1804998087131L);
        setField(term83964, term83964.getClass(), "cdate", null);
        setField(term83962, term83962.getClass(), "workDay", term83964);
        setField(term83962, term83962.getClass(), "status", enum187);
        setFloatField(term83962, term83962.getClass(), "hours", 0.96323884F);
        setField(term83962, term83962.getClass(), "comment", "xeyjTOCOJb");
        setField(term83962, term83962.getClass(), "rejectReason", "DGRqjjdhzy");
        setFloatField(term83962, term83962.getClass(), "rate", 0.43692183F);
        setBooleanField(term83962, term83962.getClass(), "billable", false);
        setLongField(term83962, term83962.getClass(), "taskId", 7247160664318067468L);
        setIntField(term83962, term83962.getClass(), "employeeId", 1964967720);
        setIntField(term84007, term84007.getClass(), "nanos", 861000000);
        setLongField(term84007, term84007.getClass(), "fastTime", 1640233811000L);
        setField(term84007, term84007.getClass(), "cdate", null);
        setField(term83962, term83962.getClass(), "createdDate", term84007);
        setIntField(term84010, term84010.getClass(), "nanos", 121000000);
        setLongField(term84010, term84010.getClass(), "fastTime", 1585759633000L);
        setField(term84010, term84010.getClass(), "cdate", null);
        setField(term83962, term83962.getClass(), "lastModifiedDate", term84010);
        setBooleanField(term83962, term83962.getClass(), "frozen", true);
        setIntField(term84014, term84014.getClass(), "id", 1351900243);
        setField(term84014, term84014.getClass(), "firstName", "lQFkjJUPAR");
        setField(term84014, term84014.getClass(), "middleName", "BsuVlGUUjV");
        setField(term84014, term84014.getClass(), "lastName", "bHHjfDCntT");
        setField(term84014, term84014.getClass(), "email", "sEphiduvkv");
        setField(term84014, term84014.getClass(), "passwordHash", "PbLgCSAHce");
        setIntField(term84014, term84014.getClass(), "positionId", -330897705);
        setBooleanField(term84014, term84014.getClass(), "isArchived", false);
        setIntField(term84078, term84078.getClass(), "nanos", 430000000);
        setLongField(term84078, term84078.getClass(), "fastTime", 1340580173000L);
        setField(term84078, term84078.getClass(), "cdate", null);
        setField(term84014, term84014.getClass(), "createdDate", term84078);
        setIntField(term84081, term84081.getClass(), "nanos", 840000000);
        setLongField(term84081, term84081.getClass(), "fastTime", 1644262852000L);
        setField(term84081, term84081.getClass(), "cdate", null);
        setField(term84014, term84014.getClass(), "lastModifiedDate", term84081);
        setField(term84014, term84014.getClass(), "employeeRoles", term84084);
        setIntField(term84090, term84090.getClass(), "employeeId", 1065595802);
        setIntField(term84090, term84090.getClass(), "projectId", 21031843);
        setField(term84090, term84090.getClass(), "projectRoleId", enum188);
        setField(term84090, term84090.getClass(), "externalRate", term84096);
        setField(term84014, term84014.getClass(), "employeeProjectRole", term84090);
        setField(term83962, term83962.getClass(), "employee", term84014);
        setIntField(term84098, term84098.getClass(), "id", -380787857);
        setField(term84098, term84098.getClass(), "name", "NWldOLAbqk");
        setBooleanField(term84098, term84098.getClass(), "isArchived", false);
        setIntField(term84113, term84113.getClass(), "nanos", 937000000);
        setLongField(term84113, term84113.getClass(), "fastTime", 1479632670000L);
        setField(term84113, term84113.getClass(), "cdate", null);
        setField(term84098, term84098.getClass(), "createdDate", term84113);
        setIntField(term84116, term84116.getClass(), "nanos", 668000000);
        setLongField(term84116, term84116.getClass(), "fastTime", 1476956500000L);
        setField(term84116, term84116.getClass(), "cdate", null);
        setField(term84098, term84098.getClass(), "lastModifiedDate", term84116);
        setField(term83962, term83962.getClass(), "project", term84098);
        setLongField(term84119, term84119.getClass(), "id", 2135754395358000892L);
        setField(term84119, term84119.getClass(), "name", "qnYaYSpDwO");
        setIntField(term84119, term84119.getClass(), "projectId", 319853052);
        setBooleanField(term84119, term84119.getClass(), "billable", true);
        setBooleanField(term84119, term84119.getClass(), "isArchived", false);
        setIntField(term84136, term84136.getClass(), "nanos", 666000000);
        setLongField(term84136, term84136.getClass(), "fastTime", 1730028404000L);
        setField(term84136, term84136.getClass(), "cdate", null);
        setField(term84119, term84119.getClass(), "createdDate", term84136);
        setIntField(term84139, term84139.getClass(), "nanos", 749000000);
        setLongField(term84139, term84139.getClass(), "fastTime", 1644588349000L);
        setField(term84139, term84139.getClass(), "cdate", null);
        setField(term84119, term84119.getClass(), "lastModifiedDate", term84139);
        setField(term83962, term83962.getClass(), "task", term84119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dgbFDCdHtj";
        callMethod(klass, "setComment", argTypes, term83962, args);
    }

};


