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

public class TrackUnitRowDto_getEmployeeId_1879469861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4220;

    public TrackUnitRowDto_getEmployeeId_1879469861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4251 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4253 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4251, term4251.getClass(), "id", 8059786003080744426L);
        setLongField(term4253, term4253.getClass(), "fastTime", 1804998087131L);
        setField(term4253, term4253.getClass(), "cdate", null);
        setField(term4251, term4251.getClass(), "workDay", term4253);
        setFloatField(term4251, term4251.getClass(), "hours", 0.7031006F);
        setBooleanField(term4251, term4251.getClass(), "blocked", false);
        setBooleanField(term4251, term4251.getClass(), "billable", false);
        setField(term4251, term4251.getClass(), "comment", "");
        setField(term4251, term4251.getClass(), "rejectReason", "");
        setBooleanField(term4251, term4251.getClass(), "rejected", false);
        Object term4261 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4263 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4261, term4261.getClass(), "id", -4365849114644724155L);
        setLongField(term4263, term4263.getClass(), "fastTime", 1538078916394L);
        setField(term4263, term4263.getClass(), "cdate", null);
        setField(term4261, term4261.getClass(), "workDay", term4263);
        setFloatField(term4261, term4261.getClass(), "hours", 0.9431611F);
        setBooleanField(term4261, term4261.getClass(), "blocked", true);
        setBooleanField(term4261, term4261.getClass(), "billable", false);
        setField(term4261, term4261.getClass(), "comment", "");
        setField(term4261, term4261.getClass(), "rejectReason", "");
        setBooleanField(term4261, term4261.getClass(), "rejected", false);
        Object term4271 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4273 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4271, term4271.getClass(), "id", 2486810210675247493L);
        setLongField(term4273, term4273.getClass(), "fastTime", 1744090065937L);
        setField(term4273, term4273.getClass(), "cdate", null);
        setField(term4271, term4271.getClass(), "workDay", term4273);
        setFloatField(term4271, term4271.getClass(), "hours", 0.95272815F);
        setBooleanField(term4271, term4271.getClass(), "blocked", true);
        setBooleanField(term4271, term4271.getClass(), "billable", false);
        setField(term4271, term4271.getClass(), "comment", "");
        setField(term4271, term4271.getClass(), "rejectReason", "");
        setBooleanField(term4271, term4271.getClass(), "rejected", false);
        Object term4281 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4283 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4281, term4281.getClass(), "id", 7009926388951271268L);
        setLongField(term4283, term4283.getClass(), "fastTime", 1347400561385L);
        setField(term4283, term4283.getClass(), "cdate", null);
        setField(term4281, term4281.getClass(), "workDay", term4283);
        setFloatField(term4281, term4281.getClass(), "hours", 0.7254646F);
        setBooleanField(term4281, term4281.getClass(), "blocked", true);
        setBooleanField(term4281, term4281.getClass(), "billable", false);
        setField(term4281, term4281.getClass(), "comment", "");
        setField(term4281, term4281.getClass(), "rejectReason", "");
        setBooleanField(term4281, term4281.getClass(), "rejected", true);
        Object term4291 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4293 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4291, term4291.getClass(), "id", -7672528020740371001L);
        setLongField(term4293, term4293.getClass(), "fastTime", 1502158153899L);
        setField(term4293, term4293.getClass(), "cdate", null);
        setField(term4291, term4291.getClass(), "workDay", term4293);
        setFloatField(term4291, term4291.getClass(), "hours", 0.9828442F);
        setBooleanField(term4291, term4291.getClass(), "blocked", false);
        setBooleanField(term4291, term4291.getClass(), "billable", true);
        setField(term4291, term4291.getClass(), "comment", "");
        setField(term4291, term4291.getClass(), "rejectReason", "");
        setBooleanField(term4291, term4291.getClass(), "rejected", false);
        ArrayList term4249 = new ArrayList();
        ((ArrayList) term4249).add(term4251);
        ((ArrayList) term4249).add(term4261);
        ((ArrayList) term4249).add(term4271);
        ((ArrayList) term4249).add(term4281);
        ((ArrayList) term4249).add(term4291);
        term4220 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term4220, term4220.getClass(), "employeeId", 568599855);
        setIntField(term4220, term4220.getClass(), "projectId", 1162663216);
        setField(term4220, term4220.getClass(), "projectName", "gGSMzuGICf");
        setLongField(term4220, term4220.getClass(), "taskId", -2585684163342970173L);
        setField(term4220, term4220.getClass(), "taskName", "hxCBltsObl");
        setBooleanField(term4220, term4220.getClass(), "observed", false);
        setField(term4220, term4220.getClass(), "units", term4249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term4220, args);
    }

};


