package ru.smartup.timetracker.utils;

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
import static ru.smartup.timetracker.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.util.HashSet;
import java.lang.Float;
import java.lang.String;

public class FreezeDateUtils_getFreezeRecordWithMinDate_9190651085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1710;
     Object term1728;

    public FreezeDateUtils_getFreezeRecordWithMinDate_9190651085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1710 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term1711 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term1712 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1722 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1712, term1712.getClass(), "totalSeconds", -36000);
        setField(term1712, term1712.getClass(), "id", "-10:00");
        setField(term1711, term1711.getClass(), "timeZone", term1712);
        setByteField(term1722, term1722.getClass(), "hour", (byte) 17);
        setByteField(term1722, term1722.getClass(), "minute", (byte) 25);
        setByteField(term1722, term1722.getClass(), "second", (byte) 50);
        setIntField(term1722, term1722.getClass(), "nano", 456917183);
        setField(term1711, term1711.getClass(), "fixedTimeFreeze", term1722);
        setIntField(term1711, term1711.getClass(), "dayToUnfreeze", 1725571209);
        setField(term1710, term1710.getClass(), "freezeProperties", term1711);
        HashSet term1752 = new HashSet();
        Float term1756 = new Float(0.2707036F);
        Class<? extends Object> term1787 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term1786 = ((Class) term1787).getDeclaredField((String) "INTERRUPTED");
        ((Field) term1786).setAccessible(true);
        Object enum2 = ((Field) term1786).get((Object) null);
        Object term1731 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        Object term1733 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1737 = newInstance(Class.forName("ru.smartup.timetracker.entity.Employee"));
        Object term1746 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1749 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1753 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        Object term1773 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1776 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term1731, term1731.getClass(), "id", -522618178);
        setIntField(term1733, term1733.getClass(), "year", 2021);
        setShortField(term1733, term1733.getClass(), "month", (short) 1);
        setShortField(term1733, term1733.getClass(), "day", (short) 18);
        setField(term1731, term1731.getClass(), "freezeDate", term1733);
        setIntField(term1737, term1737.getClass(), "id", 1134449235);
        setField(term1737, term1737.getClass(), "firstName", "");
        setField(term1737, term1737.getClass(), "middleName", "");
        setField(term1737, term1737.getClass(), "lastName", "");
        setField(term1737, term1737.getClass(), "email", "");
        setField(term1737, term1737.getClass(), "passwordHash", "");
        setIntField(term1737, term1737.getClass(), "positionId", -883034806);
        setBooleanField(term1737, term1737.getClass(), "isArchived", false);
        setIntField(term1746, term1746.getClass(), "nanos", 302000000);
        setLongField(term1746, term1746.getClass(), "fastTime", 1442628765000L);
        setField(term1746, term1746.getClass(), "cdate", null);
        setField(term1737, term1737.getClass(), "createdDate", term1746);
        setIntField(term1749, term1749.getClass(), "nanos", 18000000);
        setLongField(term1749, term1749.getClass(), "fastTime", 1515879330000L);
        setField(term1749, term1749.getClass(), "cdate", null);
        setField(term1737, term1737.getClass(), "lastModifiedDate", term1749);
        setField(term1737, term1737.getClass(), "employeeRoles", term1752);
        setIntField(term1753, term1753.getClass(), "employeeId", 1585847225);
        setIntField(term1753, term1753.getClass(), "projectId", 597278769);
        setField(term1753, term1753.getClass(), "projectRoleId", null);
        setField(term1753, term1753.getClass(), "externalRate", term1756);
        setField(term1737, term1737.getClass(), "employeeProjectRole", term1753);
        setField(term1731, term1731.getClass(), "employee", term1737);
        setField(term1731, term1731.getClass(), "status", enum2);
        setField(term1731, term1731.getClass(), "info", "oVcInYnLWB");
        setIntField(term1773, term1773.getClass(), "nanos", 389000000);
        setLongField(term1773, term1773.getClass(), "fastTime", 1429013051000L);
        setField(term1773, term1773.getClass(), "cdate", null);
        setField(term1731, term1731.getClass(), "createdDate", term1773);
        setIntField(term1776, term1776.getClass(), "nanos", 288000000);
        setLongField(term1776, term1776.getClass(), "fastTime", 1495346663000L);
        setField(term1776, term1776.getClass(), "cdate", null);
        setField(term1731, term1731.getClass(), "lastModifiedDate", term1776);
        term1728 = new LinkedList();
        ((LinkedList) term1728).add(term1731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1728;
        callMethod(klass, "getFreezeRecordWithMinDate", argTypes, term1710, args);
    }

};


