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

public class TrackUnit_toString_172755505437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98785;

    public TrackUnit_toString_172755505437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term98966 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term98965 = ((Class) term98966).getDeclaredField((String) "APPROVED");
        ((Field) term98965).setAccessible(true);
        Object enum217 = ((Field) term98965).get((Object) null);
        HashMap term98908 = new HashMap();
        Set<Object> term99396 =  ((Map) term98908).keySet();
        HashSet term98907 = new HashSet((Collection<? extends Object>) term99396);
        Class<? extends Object> term99398 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term99397 = ((Class) term99398).getDeclaredField((String) "MANAGER");
        ((Field) term99397).setAccessible(true);
        Object enum218 = ((Field) term99397).get((Object) null);
        Float term98919 = new Float(0.37164736F);
        term98785 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term98787 = newInstance(Class.forName("java.sql.Date"));
        Object term98830 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term98833 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term98837 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term98901 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term98904 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term98913 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term98921 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term98936 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term98939 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term98942 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term98959 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term98962 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term98785, term98785.getClass(), "id", 8034714140377562739L);
        setLongField(term98787, term98787.getClass(), "fastTime", 1488725902101L);
        setField(term98787, term98787.getClass(), "cdate", null);
        setField(term98785, term98785.getClass(), "workDay", term98787);
        setField(term98785, term98785.getClass(), "status", enum217);
        setFloatField(term98785, term98785.getClass(), "hours", 0.07802445F);
        setField(term98785, term98785.getClass(), "comment", "TGiJfagfky");
        setField(term98785, term98785.getClass(), "rejectReason", "BJklinBmhN");
        setFloatField(term98785, term98785.getClass(), "rate", 0.36114347F);
        setBooleanField(term98785, term98785.getClass(), "billable", true);
        setLongField(term98785, term98785.getClass(), "taskId", -2924531382671518368L);
        setIntField(term98785, term98785.getClass(), "employeeId", -255317272);
        setIntField(term98830, term98830.getClass(), "nanos", 738000000);
        setLongField(term98830, term98830.getClass(), "fastTime", 1380258059000L);
        setField(term98830, term98830.getClass(), "cdate", null);
        setField(term98785, term98785.getClass(), "createdDate", term98830);
        setIntField(term98833, term98833.getClass(), "nanos", 342000000);
        setLongField(term98833, term98833.getClass(), "fastTime", 1670936106000L);
        setField(term98833, term98833.getClass(), "cdate", null);
        setField(term98785, term98785.getClass(), "lastModifiedDate", term98833);
        setBooleanField(term98785, term98785.getClass(), "frozen", true);
        setIntField(term98837, term98837.getClass(), "id", -706253892);
        setField(term98837, term98837.getClass(), "firstName", "IOddzvEWcl");
        setField(term98837, term98837.getClass(), "middleName", "bIrtpkYJWT");
        setField(term98837, term98837.getClass(), "lastName", "VuLLXpvPpZ");
        setField(term98837, term98837.getClass(), "email", "UEdzEKEEEV");
        setField(term98837, term98837.getClass(), "passwordHash", "BcENaQFYSd");
        setIntField(term98837, term98837.getClass(), "positionId", -1341439819);
        setBooleanField(term98837, term98837.getClass(), "isArchived", false);
        setIntField(term98901, term98901.getClass(), "nanos", 8000000);
        setLongField(term98901, term98901.getClass(), "fastTime", 1634309853000L);
        setField(term98901, term98901.getClass(), "cdate", null);
        setField(term98837, term98837.getClass(), "createdDate", term98901);
        setIntField(term98904, term98904.getClass(), "nanos", 108000000);
        setLongField(term98904, term98904.getClass(), "fastTime", 1661057334000L);
        setField(term98904, term98904.getClass(), "cdate", null);
        setField(term98837, term98837.getClass(), "lastModifiedDate", term98904);
        setField(term98837, term98837.getClass(), "employeeRoles", term98907);
        setIntField(term98913, term98913.getClass(), "employeeId", -728760750);
        setIntField(term98913, term98913.getClass(), "projectId", -1617383807);
        setField(term98913, term98913.getClass(), "projectRoleId", enum218);
        setField(term98913, term98913.getClass(), "externalRate", term98919);
        setField(term98837, term98837.getClass(), "employeeProjectRole", term98913);
        setField(term98785, term98785.getClass(), "employee", term98837);
        setIntField(term98921, term98921.getClass(), "id", -1244386281);
        setField(term98921, term98921.getClass(), "name", "POPYycoDBy");
        setBooleanField(term98921, term98921.getClass(), "isArchived", true);
        setIntField(term98936, term98936.getClass(), "nanos", 805000000);
        setLongField(term98936, term98936.getClass(), "fastTime", 1825761692000L);
        setField(term98936, term98936.getClass(), "cdate", null);
        setField(term98921, term98921.getClass(), "createdDate", term98936);
        setIntField(term98939, term98939.getClass(), "nanos", 797000000);
        setLongField(term98939, term98939.getClass(), "fastTime", 1625177635000L);
        setField(term98939, term98939.getClass(), "cdate", null);
        setField(term98921, term98921.getClass(), "lastModifiedDate", term98939);
        setField(term98785, term98785.getClass(), "project", term98921);
        setLongField(term98942, term98942.getClass(), "id", -3948863953565024517L);
        setField(term98942, term98942.getClass(), "name", "LuWMOXdAPA");
        setIntField(term98942, term98942.getClass(), "projectId", -885788574);
        setBooleanField(term98942, term98942.getClass(), "billable", false);
        setBooleanField(term98942, term98942.getClass(), "isArchived", false);
        setIntField(term98959, term98959.getClass(), "nanos", 203000000);
        setLongField(term98959, term98959.getClass(), "fastTime", 1314605759000L);
        setField(term98959, term98959.getClass(), "cdate", null);
        setField(term98942, term98942.getClass(), "createdDate", term98959);
        setIntField(term98962, term98962.getClass(), "nanos", 141000000);
        setLongField(term98962, term98962.getClass(), "fastTime", 1370458429000L);
        setField(term98962, term98962.getClass(), "cdate", null);
        setField(term98942, term98942.getClass(), "lastModifiedDate", term98962);
        setField(term98785, term98785.getClass(), "task", term98942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term98785, args);
    }

};


