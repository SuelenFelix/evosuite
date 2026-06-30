package ru.smartup.timetracker.dto.tracker.response;

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
import static ru.smartup.timetracker.dto.tracker.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TrackUnitRowDto_canEqual_136964285816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5661;
     Object term5764;

    public TrackUnitRowDto_canEqual_136964285816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5692 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5694 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5692, term5692.getClass(), "id", -8085190702504231560L);
        setLongField(term5694, term5694.getClass(), "fastTime", 1450865259896L);
        setField(term5694, term5694.getClass(), "cdate", null);
        setField(term5692, term5692.getClass(), "workDay", term5694);
        setFloatField(term5692, term5692.getClass(), "hours", 0.3357792F);
        setBooleanField(term5692, term5692.getClass(), "blocked", false);
        setBooleanField(term5692, term5692.getClass(), "billable", false);
        setField(term5692, term5692.getClass(), "comment", "");
        setField(term5692, term5692.getClass(), "rejectReason", "");
        setBooleanField(term5692, term5692.getClass(), "rejected", true);
        Object term5702 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5704 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5702, term5702.getClass(), "id", 1672578078364590450L);
        setLongField(term5704, term5704.getClass(), "fastTime", 1467783054847L);
        setField(term5704, term5704.getClass(), "cdate", null);
        setField(term5702, term5702.getClass(), "workDay", term5704);
        setFloatField(term5702, term5702.getClass(), "hours", 0.25937343F);
        setBooleanField(term5702, term5702.getClass(), "blocked", true);
        setBooleanField(term5702, term5702.getClass(), "billable", false);
        setField(term5702, term5702.getClass(), "comment", "");
        setField(term5702, term5702.getClass(), "rejectReason", "");
        setBooleanField(term5702, term5702.getClass(), "rejected", true);
        Object term5712 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5714 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5712, term5712.getClass(), "id", 4949335493504695457L);
        setLongField(term5714, term5714.getClass(), "fastTime", 1825608844992L);
        setField(term5714, term5714.getClass(), "cdate", null);
        setField(term5712, term5712.getClass(), "workDay", term5714);
        setFloatField(term5712, term5712.getClass(), "hours", 0.8704517F);
        setBooleanField(term5712, term5712.getClass(), "blocked", true);
        setBooleanField(term5712, term5712.getClass(), "billable", false);
        setField(term5712, term5712.getClass(), "comment", "");
        setField(term5712, term5712.getClass(), "rejectReason", "");
        setBooleanField(term5712, term5712.getClass(), "rejected", false);
        Object term5722 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5724 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5722, term5722.getClass(), "id", -5216789073301458893L);
        setLongField(term5724, term5724.getClass(), "fastTime", 1465782799700L);
        setField(term5724, term5724.getClass(), "cdate", null);
        setField(term5722, term5722.getClass(), "workDay", term5724);
        setFloatField(term5722, term5722.getClass(), "hours", 0.5873228F);
        setBooleanField(term5722, term5722.getClass(), "blocked", false);
        setBooleanField(term5722, term5722.getClass(), "billable", false);
        setField(term5722, term5722.getClass(), "comment", "");
        setField(term5722, term5722.getClass(), "rejectReason", "");
        setBooleanField(term5722, term5722.getClass(), "rejected", false);
        Object term5732 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5734 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5732, term5732.getClass(), "id", -1832940336320585644L);
        setLongField(term5734, term5734.getClass(), "fastTime", 1597421765774L);
        setField(term5734, term5734.getClass(), "cdate", null);
        setField(term5732, term5732.getClass(), "workDay", term5734);
        setFloatField(term5732, term5732.getClass(), "hours", 0.5703112F);
        setBooleanField(term5732, term5732.getClass(), "blocked", false);
        setBooleanField(term5732, term5732.getClass(), "billable", false);
        setField(term5732, term5732.getClass(), "comment", "");
        setField(term5732, term5732.getClass(), "rejectReason", "");
        setBooleanField(term5732, term5732.getClass(), "rejected", true);
        Object term5742 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5744 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5742, term5742.getClass(), "id", -8033714905181142681L);
        setLongField(term5744, term5744.getClass(), "fastTime", 1354735325477L);
        setField(term5744, term5744.getClass(), "cdate", null);
        setField(term5742, term5742.getClass(), "workDay", term5744);
        setFloatField(term5742, term5742.getClass(), "hours", 0.8823181F);
        setBooleanField(term5742, term5742.getClass(), "blocked", true);
        setBooleanField(term5742, term5742.getClass(), "billable", false);
        setField(term5742, term5742.getClass(), "comment", "");
        setField(term5742, term5742.getClass(), "rejectReason", "");
        setBooleanField(term5742, term5742.getClass(), "rejected", true);
        Object term5752 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5754 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5752, term5752.getClass(), "id", -9040825890007374809L);
        setLongField(term5754, term5754.getClass(), "fastTime", 1415426053422L);
        setField(term5754, term5754.getClass(), "cdate", null);
        setField(term5752, term5752.getClass(), "workDay", term5754);
        setFloatField(term5752, term5752.getClass(), "hours", 0.91971004F);
        setBooleanField(term5752, term5752.getClass(), "blocked", true);
        setBooleanField(term5752, term5752.getClass(), "billable", true);
        setField(term5752, term5752.getClass(), "comment", "");
        setField(term5752, term5752.getClass(), "rejectReason", "");
        setBooleanField(term5752, term5752.getClass(), "rejected", true);
        ArrayList term5690 = new ArrayList();
        ((ArrayList) term5690).add(term5692);
        ((ArrayList) term5690).add(term5702);
        ((ArrayList) term5690).add(term5712);
        ((ArrayList) term5690).add(term5722);
        ((ArrayList) term5690).add(term5732);
        ((ArrayList) term5690).add(term5742);
        ((ArrayList) term5690).add(term5752);
        term5661 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term5661, term5661.getClass(), "employeeId", -73683645);
        setIntField(term5661, term5661.getClass(), "projectId", -226514366);
        setField(term5661, term5661.getClass(), "projectName", "OqbwYQfvAe");
        setLongField(term5661, term5661.getClass(), "taskId", 2135754395358000892L);
        setField(term5661, term5661.getClass(), "taskName", "tRxZafjqIx");
        setBooleanField(term5661, term5661.getClass(), "observed", true);
        setField(term5661, term5661.getClass(), "units", term5690);
        term5764 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5764;
        callMethod(klass, "canEqual", argTypes, term5661, args);
    }

};


