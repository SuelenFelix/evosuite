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

public class TrackUnitRowDto_isObserved_20895367456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4655;

    public TrackUnitRowDto_isObserved_20895367456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4686 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4688 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4686, term4686.getClass(), "id", 4784595517102746672L);
        setLongField(term4688, term4688.getClass(), "fastTime", 1595517583842L);
        setField(term4688, term4688.getClass(), "cdate", null);
        setField(term4686, term4686.getClass(), "workDay", term4688);
        setFloatField(term4686, term4686.getClass(), "hours", 0.80973893F);
        setBooleanField(term4686, term4686.getClass(), "blocked", true);
        setBooleanField(term4686, term4686.getClass(), "billable", true);
        setField(term4686, term4686.getClass(), "comment", "");
        setField(term4686, term4686.getClass(), "rejectReason", "");
        setBooleanField(term4686, term4686.getClass(), "rejected", false);
        Object term4696 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4698 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4696, term4696.getClass(), "id", -7612550318181586304L);
        setLongField(term4698, term4698.getClass(), "fastTime", 1464421789888L);
        setField(term4698, term4698.getClass(), "cdate", null);
        setField(term4696, term4696.getClass(), "workDay", term4698);
        setFloatField(term4696, term4696.getClass(), "hours", 0.7633268F);
        setBooleanField(term4696, term4696.getClass(), "blocked", false);
        setBooleanField(term4696, term4696.getClass(), "billable", true);
        setField(term4696, term4696.getClass(), "comment", "");
        setField(term4696, term4696.getClass(), "rejectReason", "");
        setBooleanField(term4696, term4696.getClass(), "rejected", false);
        Object term4706 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4708 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4706, term4706.getClass(), "id", -2170847986967241072L);
        setLongField(term4708, term4708.getClass(), "fastTime", 1405279189488L);
        setField(term4708, term4708.getClass(), "cdate", null);
        setField(term4706, term4706.getClass(), "workDay", term4708);
        setFloatField(term4706, term4706.getClass(), "hours", 0.541592F);
        setBooleanField(term4706, term4706.getClass(), "blocked", true);
        setBooleanField(term4706, term4706.getClass(), "billable", false);
        setField(term4706, term4706.getClass(), "comment", "");
        setField(term4706, term4706.getClass(), "rejectReason", "");
        setBooleanField(term4706, term4706.getClass(), "rejected", false);
        Object term4716 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4718 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4716, term4716.getClass(), "id", 4044358158040652353L);
        setLongField(term4718, term4718.getClass(), "fastTime", 1822704644050L);
        setField(term4718, term4718.getClass(), "cdate", null);
        setField(term4716, term4716.getClass(), "workDay", term4718);
        setFloatField(term4716, term4716.getClass(), "hours", 0.13481021F);
        setBooleanField(term4716, term4716.getClass(), "blocked", true);
        setBooleanField(term4716, term4716.getClass(), "billable", true);
        setField(term4716, term4716.getClass(), "comment", "");
        setField(term4716, term4716.getClass(), "rejectReason", "");
        setBooleanField(term4716, term4716.getClass(), "rejected", true);
        Object term4726 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4728 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4726, term4726.getClass(), "id", -4443169559037975007L);
        setLongField(term4728, term4728.getClass(), "fastTime", 1678177615298L);
        setField(term4728, term4728.getClass(), "cdate", null);
        setField(term4726, term4726.getClass(), "workDay", term4728);
        setFloatField(term4726, term4726.getClass(), "hours", 0.996533F);
        setBooleanField(term4726, term4726.getClass(), "blocked", false);
        setBooleanField(term4726, term4726.getClass(), "billable", true);
        setField(term4726, term4726.getClass(), "comment", "");
        setField(term4726, term4726.getClass(), "rejectReason", "");
        setBooleanField(term4726, term4726.getClass(), "rejected", false);
        Object term4736 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4738 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4736, term4736.getClass(), "id", -3842548265506930260L);
        setLongField(term4738, term4738.getClass(), "fastTime", 1666076287186L);
        setField(term4738, term4738.getClass(), "cdate", null);
        setField(term4736, term4736.getClass(), "workDay", term4738);
        setFloatField(term4736, term4736.getClass(), "hours", 0.38000882F);
        setBooleanField(term4736, term4736.getClass(), "blocked", false);
        setBooleanField(term4736, term4736.getClass(), "billable", true);
        setField(term4736, term4736.getClass(), "comment", "");
        setField(term4736, term4736.getClass(), "rejectReason", "");
        setBooleanField(term4736, term4736.getClass(), "rejected", false);
        ArrayList term4684 = new ArrayList();
        ((ArrayList) term4684).add(term4686);
        ((ArrayList) term4684).add(term4696);
        ((ArrayList) term4684).add(term4706);
        ((ArrayList) term4684).add(term4716);
        ((ArrayList) term4684).add(term4726);
        ((ArrayList) term4684).add(term4736);
        term4655 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term4655, term4655.getClass(), "employeeId", 1725571209);
        setIntField(term4655, term4655.getClass(), "projectId", -522618178);
        setField(term4655, term4655.getClass(), "projectName", "PHvxnGHptP");
        setLongField(term4655, term4655.getClass(), "taskId", -6645965768855543712L);
        setField(term4655, term4655.getClass(), "taskName", "TimdotUuNC");
        setBooleanField(term4655, term4655.getClass(), "observed", false);
        setField(term4655, term4655.getClass(), "units", term4684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isObserved", argTypes, term4655, args);
    }

};


