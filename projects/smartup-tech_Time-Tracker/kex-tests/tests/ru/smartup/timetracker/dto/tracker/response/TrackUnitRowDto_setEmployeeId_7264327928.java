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
import java.lang.Integer;

public class TrackUnitRowDto_setEmployeeId_7264327928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4841;
     Object term4934;

    public TrackUnitRowDto_setEmployeeId_7264327928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4872 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4874 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4872, term4872.getClass(), "id", -2644215923136513282L);
        setLongField(term4874, term4874.getClass(), "fastTime", 1819191638549L);
        setField(term4874, term4874.getClass(), "cdate", null);
        setField(term4872, term4872.getClass(), "workDay", term4874);
        setFloatField(term4872, term4872.getClass(), "hours", 0.478669F);
        setBooleanField(term4872, term4872.getClass(), "blocked", false);
        setBooleanField(term4872, term4872.getClass(), "billable", false);
        setField(term4872, term4872.getClass(), "comment", "");
        setField(term4872, term4872.getClass(), "rejectReason", "");
        setBooleanField(term4872, term4872.getClass(), "rejected", true);
        Object term4882 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4884 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4882, term4882.getClass(), "id", -1468719814009985452L);
        setLongField(term4884, term4884.getClass(), "fastTime", 1400691778698L);
        setField(term4884, term4884.getClass(), "cdate", null);
        setField(term4882, term4882.getClass(), "workDay", term4884);
        setFloatField(term4882, term4882.getClass(), "hours", 0.75592405F);
        setBooleanField(term4882, term4882.getClass(), "blocked", false);
        setBooleanField(term4882, term4882.getClass(), "billable", false);
        setField(term4882, term4882.getClass(), "comment", "");
        setField(term4882, term4882.getClass(), "rejectReason", "");
        setBooleanField(term4882, term4882.getClass(), "rejected", false);
        Object term4892 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4894 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4892, term4892.getClass(), "id", -7738503207562305297L);
        setLongField(term4894, term4894.getClass(), "fastTime", 1741444563811L);
        setField(term4894, term4894.getClass(), "cdate", null);
        setField(term4892, term4892.getClass(), "workDay", term4894);
        setFloatField(term4892, term4892.getClass(), "hours", 0.068145275F);
        setBooleanField(term4892, term4892.getClass(), "blocked", true);
        setBooleanField(term4892, term4892.getClass(), "billable", false);
        setField(term4892, term4892.getClass(), "comment", "");
        setField(term4892, term4892.getClass(), "rejectReason", "");
        setBooleanField(term4892, term4892.getClass(), "rejected", false);
        Object term4902 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4904 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4902, term4902.getClass(), "id", 3825396310311739952L);
        setLongField(term4904, term4904.getClass(), "fastTime", 1761994701322L);
        setField(term4904, term4904.getClass(), "cdate", null);
        setField(term4902, term4902.getClass(), "workDay", term4904);
        setFloatField(term4902, term4902.getClass(), "hours", 0.10667074F);
        setBooleanField(term4902, term4902.getClass(), "blocked", true);
        setBooleanField(term4902, term4902.getClass(), "billable", true);
        setField(term4902, term4902.getClass(), "comment", "");
        setField(term4902, term4902.getClass(), "rejectReason", "");
        setBooleanField(term4902, term4902.getClass(), "rejected", false);
        Object term4912 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4914 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4912, term4912.getClass(), "id", -3838084482494604218L);
        setLongField(term4914, term4914.getClass(), "fastTime", 1695425269458L);
        setField(term4914, term4914.getClass(), "cdate", null);
        setField(term4912, term4912.getClass(), "workDay", term4914);
        setFloatField(term4912, term4912.getClass(), "hours", 0.9571234F);
        setBooleanField(term4912, term4912.getClass(), "blocked", true);
        setBooleanField(term4912, term4912.getClass(), "billable", true);
        setField(term4912, term4912.getClass(), "comment", "");
        setField(term4912, term4912.getClass(), "rejectReason", "");
        setBooleanField(term4912, term4912.getClass(), "rejected", false);
        Object term4922 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4924 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4922, term4922.getClass(), "id", 3892018155439224435L);
        setLongField(term4924, term4924.getClass(), "fastTime", 1362780563394L);
        setField(term4924, term4924.getClass(), "cdate", null);
        setField(term4922, term4922.getClass(), "workDay", term4924);
        setFloatField(term4922, term4922.getClass(), "hours", 0.114929974F);
        setBooleanField(term4922, term4922.getClass(), "blocked", false);
        setBooleanField(term4922, term4922.getClass(), "billable", true);
        setField(term4922, term4922.getClass(), "comment", "");
        setField(term4922, term4922.getClass(), "rejectReason", "");
        setBooleanField(term4922, term4922.getClass(), "rejected", false);
        ArrayList term4870 = new ArrayList();
        ((ArrayList) term4870).add(term4872);
        ((ArrayList) term4870).add(term4882);
        ((ArrayList) term4870).add(term4892);
        ((ArrayList) term4870).add(term4902);
        ((ArrayList) term4870).add(term4912);
        ((ArrayList) term4870).add(term4922);
        term4841 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term4841, term4841.getClass(), "employeeId", 1585847225);
        setIntField(term4841, term4841.getClass(), "projectId", 597278769);
        setField(term4841, term4841.getClass(), "projectName", "xBsXSDjXYK");
        setLongField(term4841, term4841.getClass(), "taskId", -2850532706972744550L);
        setField(term4841, term4841.getClass(), "taskName", "sEnIVFtZuQ");
        setBooleanField(term4841, term4841.getClass(), "observed", false);
        setField(term4841, term4841.getClass(), "units", term4870);
        term4934 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4934;
        callMethod(klass, "setEmployeeId", argTypes, term4841, args);
    }

};


