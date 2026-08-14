package ru.smartup.timetracker.service.freeze;

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
import static ru.smartup.timetracker.service.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Float;

public class CRUDFreezeService_save_18859664680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6722;

    public CRUDFreezeService_save_18859664680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6799 = new HashMap();
        Set<Object> term6893 =  ((Map) term6799).keySet();
        HashSet term6798 = new HashSet((Collection<? extends Object>) term6893);
        Class<? extends Object> term6895 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term6894 = ((Class) term6895).getDeclaredField((String) "MANAGER");
        ((Field) term6894).setAccessible(true);
        Object enum13 = ((Field) term6894).get((Object) null);
        Float term6810 = new Float(0.80973893F);
        Class<? extends Object> term7233 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term7232 = ((Class) term7233).getDeclaredField((String) "COMPLETED");
        ((Field) term7232).setAccessible(true);
        Object enum14 = ((Field) term7232).get((Object) null);
        term6722 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term6724 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6728 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term6792 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6795 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6804 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term6837 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6840 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term6722, term6722.getClass(), "id", 1743224434);
        setIntField(term6724, term6724.getClass(), "year", 2028);
        setShortField(term6724, term6724.getClass(), "month", (short) 5);
        setShortField(term6724, term6724.getClass(), "day", (short) 29);
        setField(term6722, term6722.getClass(), "freezeDate", term6724);
        setIntField(term6728, term6728.getClass(), "id", 842904495);
        setField(term6728, term6728.getClass(), "firstName", "SPtPatHeOm");
        setField(term6728, term6728.getClass(), "middleName", "ywmcuThdfL");
        setField(term6728, term6728.getClass(), "lastName", "GBOEuByOfr");
        setField(term6728, term6728.getClass(), "email", "NHbOFFjyVK");
        setField(term6728, term6728.getClass(), "passwordHash", "zaloBqlrSo");
        setIntField(term6728, term6728.getClass(), "positionId", 1008080511);
        setBooleanField(term6728, term6728.getClass(), "isArchived", true);
        setIntField(term6792, term6792.getClass(), "nanos", 412000000);
        setLongField(term6792, term6792.getClass(), "fastTime", 1368058638000L);
        setField(term6792, term6792.getClass(), "cdate", null);
        setField(term6728, term6728.getClass(), "createdDate", term6792);
        setIntField(term6795, term6795.getClass(), "nanos", 512000000);
        setLongField(term6795, term6795.getClass(), "fastTime", 1836071279000L);
        setField(term6795, term6795.getClass(), "cdate", null);
        setField(term6728, term6728.getClass(), "lastModifiedDate", term6795);
        setField(term6728, term6728.getClass(), "employeeRoles", term6798);
        setIntField(term6804, term6804.getClass(), "employeeId", 1935707624);
        setIntField(term6804, term6804.getClass(), "projectId", 1507074215);
        setField(term6804, term6804.getClass(), "projectRoleId", enum13);
        setField(term6804, term6804.getClass(), "externalRate", term6810);
        setField(term6728, term6728.getClass(), "employeeProjectRole", term6804);
        setField(term6722, term6722.getClass(), "employee", term6728);
        setField(term6722, term6722.getClass(), "status", enum14);
        setField(term6722, term6722.getClass(), "info", "vvoLrMGCoN");
        setIntField(term6837, term6837.getClass(), "nanos", 745000000);
        setLongField(term6837, term6837.getClass(), "fastTime", 1426386667000L);
        setField(term6837, term6837.getClass(), "cdate", null);
        setField(term6722, term6722.getClass(), "createdDate", term6837);
        setIntField(term6840, term6840.getClass(), "nanos", 42000000);
        setLongField(term6840, term6840.getClass(), "fastTime", 1755540749000L);
        setField(term6840, term6840.getClass(), "cdate", null);
        setField(term6722, term6722.getClass(), "lastModifiedDate", term6840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Object[] args = new Object[1];
        args[0] = term6722;
        callMethod(klass, "save", argTypes, null, args);
    }

};


