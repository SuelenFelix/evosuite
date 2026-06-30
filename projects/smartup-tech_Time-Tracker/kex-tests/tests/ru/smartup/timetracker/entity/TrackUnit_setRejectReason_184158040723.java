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

public class TrackUnit_setRejectReason_184158040723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84954;

    public TrackUnit_setRejectReason_184158040723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85147 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term85146 = ((Class) term85147).getDeclaredField((String) "REJECTED");
        ((Field) term85146).setAccessible(true);
        Object enum189 = ((Field) term85146).get((Object) null);
        HashMap term85077 = new HashMap();
        Set<Object> term85577 =  ((Map) term85077).keySet();
        HashSet term85076 = new HashSet((Collection<? extends Object>) term85577);
        Class<? extends Object> term85579 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term85578 = ((Class) term85579).getDeclaredField((String) "MANAGER");
        ((Field) term85578).setAccessible(true);
        Object enum190 = ((Field) term85578).get((Object) null);
        Float term85088 = new Float(0.25937343F);
        term84954 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        Object term84956 = newInstance(Class.forName("java.sql.Date"));
        Object term84999 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term85002 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term85006 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term85070 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term85073 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term85082 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term85090 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term85105 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term85108 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term85111 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term85128 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term85131 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term84954, term84954.getClass(), "id", -8085190702504231560L);
        setLongField(term84956, term84956.getClass(), "fastTime", 1538078916394L);
        setField(term84956, term84956.getClass(), "cdate", null);
        setField(term84954, term84954.getClass(), "workDay", term84956);
        setField(term84954, term84954.getClass(), "status", enum189);
        setFloatField(term84954, term84954.getClass(), "hours", 0.80973893F);
        setField(term84954, term84954.getClass(), "comment", "EKpdCBubDE");
        setField(term84954, term84954.getClass(), "rejectReason", "zMsSLTfGhl");
        setFloatField(term84954, term84954.getClass(), "rate", 0.7633268F);
        setBooleanField(term84954, term84954.getClass(), "billable", false);
        setLongField(term84954, term84954.getClass(), "taskId", 1672578078364590450L);
        setIntField(term84954, term84954.getClass(), "employeeId", -1097563716);
        setIntField(term84999, term84999.getClass(), "nanos", 403000000);
        setLongField(term84999, term84999.getClass(), "fastTime", 1879045869000L);
        setField(term84999, term84999.getClass(), "cdate", null);
        setField(term84954, term84954.getClass(), "createdDate", term84999);
        setIntField(term85002, term85002.getClass(), "nanos", 842000000);
        setLongField(term85002, term85002.getClass(), "fastTime", 1426929557000L);
        setField(term85002, term85002.getClass(), "cdate", null);
        setField(term84954, term84954.getClass(), "lastModifiedDate", term85002);
        setBooleanField(term84954, term84954.getClass(), "frozen", false);
        setIntField(term85006, term85006.getClass(), "id", 1572907769);
        setField(term85006, term85006.getClass(), "firstName", "bEmHScVZaQ");
        setField(term85006, term85006.getClass(), "middleName", "TcuXODkzBV");
        setField(term85006, term85006.getClass(), "lastName", "coJPjrBZNe");
        setField(term85006, term85006.getClass(), "email", "vMsWjuPTnO");
        setField(term85006, term85006.getClass(), "passwordHash", "zHvfKaOstO");
        setIntField(term85006, term85006.getClass(), "positionId", 1608016787);
        setBooleanField(term85006, term85006.getClass(), "isArchived", false);
        setIntField(term85070, term85070.getClass(), "nanos", 563000000);
        setLongField(term85070, term85070.getClass(), "fastTime", 1576215751000L);
        setField(term85070, term85070.getClass(), "cdate", null);
        setField(term85006, term85006.getClass(), "createdDate", term85070);
        setIntField(term85073, term85073.getClass(), "nanos", 334000000);
        setLongField(term85073, term85073.getClass(), "fastTime", 1536860044000L);
        setField(term85073, term85073.getClass(), "cdate", null);
        setField(term85006, term85006.getClass(), "lastModifiedDate", term85073);
        setField(term85006, term85006.getClass(), "employeeRoles", term85076);
        setIntField(term85082, term85082.getClass(), "employeeId", -516303035);
        setIntField(term85082, term85082.getClass(), "projectId", -2143043890);
        setField(term85082, term85082.getClass(), "projectRoleId", enum190);
        setField(term85082, term85082.getClass(), "externalRate", term85088);
        setField(term85006, term85006.getClass(), "employeeProjectRole", term85082);
        setField(term84954, term84954.getClass(), "employee", term85006);
        setIntField(term85090, term85090.getClass(), "id", -2138825831);
        setField(term85090, term85090.getClass(), "name", "tOszriqETr");
        setBooleanField(term85090, term85090.getClass(), "isArchived", false);
        setIntField(term85105, term85105.getClass(), "nanos", 876000000);
        setLongField(term85105, term85105.getClass(), "fastTime", 1502026791000L);
        setField(term85105, term85105.getClass(), "cdate", null);
        setField(term85090, term85090.getClass(), "createdDate", term85105);
        setIntField(term85108, term85108.getClass(), "nanos", 335000000);
        setLongField(term85108, term85108.getClass(), "fastTime", 1756475434000L);
        setField(term85108, term85108.getClass(), "cdate", null);
        setField(term85090, term85090.getClass(), "lastModifiedDate", term85108);
        setField(term84954, term84954.getClass(), "project", term85090);
        setLongField(term85111, term85111.getClass(), "id", 4949335493504695457L);
        setField(term85111, term85111.getClass(), "name", "ncSPTkhKjO");
        setIntField(term85111, term85111.getClass(), "projectId", 1454781562);
        setBooleanField(term85111, term85111.getClass(), "billable", false);
        setBooleanField(term85111, term85111.getClass(), "isArchived", false);
        setIntField(term85128, term85128.getClass(), "nanos", 489000000);
        setLongField(term85128, term85128.getClass(), "fastTime", 1867116601000L);
        setField(term85128, term85128.getClass(), "cdate", null);
        setField(term85111, term85111.getClass(), "createdDate", term85128);
        setIntField(term85131, term85131.getClass(), "nanos", 255000000);
        setLongField(term85131, term85131.getClass(), "fastTime", 1796684752000L);
        setField(term85131, term85131.getClass(), "cdate", null);
        setField(term85111, term85111.getClass(), "lastModifiedDate", term85131);
        setField(term84954, term84954.getClass(), "task", term85111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jcWKHRWhyj";
        callMethod(klass, "setRejectReason", argTypes, term84954, args);
    }

};


