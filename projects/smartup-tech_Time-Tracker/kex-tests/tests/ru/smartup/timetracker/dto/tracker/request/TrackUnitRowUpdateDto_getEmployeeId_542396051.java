package ru.smartup.timetracker.dto.tracker.request;

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
import static ru.smartup.timetracker.dto.tracker.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TrackUnitRowUpdateDto_getEmployeeId_542396051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566;

    public TrackUnitRowUpdateDto_getEmployeeId_542396051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term572 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term573 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term573, term573.getClass(), "fastTime", 1362780563394L);
        setField(term573, term573.getClass(), "cdate", null);
        setField(term572, term572.getClass(), "workDay", term573);
        setFloatField(term572, term572.getClass(), "hours", 0.7944024F);
        setField(term572, term572.getClass(), "comment", "");
        setBooleanField(term572, term572.getClass(), "billable", false);
        Object term578 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term579 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term579, term579.getClass(), "fastTime", 1853963979281L);
        setField(term579, term579.getClass(), "cdate", null);
        setField(term578, term578.getClass(), "workDay", term579);
        setFloatField(term578, term578.getClass(), "hours", 0.3692338F);
        setField(term578, term578.getClass(), "comment", "");
        setBooleanField(term578, term578.getClass(), "billable", false);
        Object term584 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term585 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term585, term585.getClass(), "fastTime", 1795936337628L);
        setField(term585, term585.getClass(), "cdate", null);
        setField(term584, term584.getClass(), "workDay", term585);
        setFloatField(term584, term584.getClass(), "hours", 0.13906479F);
        setField(term584, term584.getClass(), "comment", "");
        setBooleanField(term584, term584.getClass(), "billable", true);
        Object term590 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term591 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term591, term591.getClass(), "fastTime", 1802995433545L);
        setField(term591, term591.getClass(), "cdate", null);
        setField(term590, term590.getClass(), "workDay", term591);
        setFloatField(term590, term590.getClass(), "hours", 0.6076495F);
        setField(term590, term590.getClass(), "comment", "");
        setBooleanField(term590, term590.getClass(), "billable", true);
        Object term596 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term597 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term597, term597.getClass(), "fastTime", 1843214817357L);
        setField(term597, term597.getClass(), "cdate", null);
        setField(term596, term596.getClass(), "workDay", term597);
        setFloatField(term596, term596.getClass(), "hours", 0.6608425F);
        setField(term596, term596.getClass(), "comment", "");
        setBooleanField(term596, term596.getClass(), "billable", false);
        Object term602 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term603 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term603, term603.getClass(), "fastTime", 1628695316832L);
        setField(term603, term603.getClass(), "cdate", null);
        setField(term602, term602.getClass(), "workDay", term603);
        setFloatField(term602, term602.getClass(), "hours", 0.37773192F);
        setField(term602, term602.getClass(), "comment", "");
        setBooleanField(term602, term602.getClass(), "billable", false);
        Object term608 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term609 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term609, term609.getClass(), "fastTime", 1393200035243L);
        setField(term609, term609.getClass(), "cdate", null);
        setField(term608, term608.getClass(), "workDay", term609);
        setFloatField(term608, term608.getClass(), "hours", 0.24413109F);
        setField(term608, term608.getClass(), "comment", "");
        setBooleanField(term608, term608.getClass(), "billable", true);
        Object term614 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term615 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term615, term615.getClass(), "fastTime", 1762147441299L);
        setField(term615, term615.getClass(), "cdate", null);
        setField(term614, term614.getClass(), "workDay", term615);
        setFloatField(term614, term614.getClass(), "hours", 0.8474802F);
        setField(term614, term614.getClass(), "comment", "");
        setBooleanField(term614, term614.getClass(), "billable", true);
        Object term620 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term621 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term621, term621.getClass(), "fastTime", 1395479491666L);
        setField(term621, term621.getClass(), "cdate", null);
        setField(term620, term620.getClass(), "workDay", term621);
        setFloatField(term620, term620.getClass(), "hours", 0.9985961F);
        setField(term620, term620.getClass(), "comment", "");
        setBooleanField(term620, term620.getClass(), "billable", true);
        ArrayList term570 = new ArrayList();
        ((ArrayList) term570).add(term572);
        ((ArrayList) term570).add(term578);
        ((ArrayList) term570).add(term584);
        ((ArrayList) term570).add(term590);
        ((ArrayList) term570).add(term596);
        ((ArrayList) term570).add(term602);
        ((ArrayList) term570).add(term608);
        ((ArrayList) term570).add(term614);
        ((ArrayList) term570).add(term620);
        term566 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto"));
        setIntField(term566, term566.getClass(), "employeeId", -1339778481);
        setLongField(term566, term566.getClass(), "taskId", 2442117782898005296L);
        setBooleanField(term566, term566.getClass(), "observed", true);
        setField(term566, term566.getClass(), "units", term570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term566, args);
    }

};


