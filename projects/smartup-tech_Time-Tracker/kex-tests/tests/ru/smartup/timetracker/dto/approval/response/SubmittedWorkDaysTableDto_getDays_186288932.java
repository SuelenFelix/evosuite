package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class SubmittedWorkDaysTableDto_getDays_186288932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17166;

    public SubmittedWorkDaysTableDto_getDays_186288932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17167 = new ArrayList();
        ArrayList term17177 = new ArrayList();
        ((ArrayList) term17177).add((Object)null);
        ((ArrayList) term17177).add((Object)null);
        ((ArrayList) term17177).add((Object)null);
        ((ArrayList) term17177).add((Object)null);
        ((ArrayList) term17177).add((Object)null);
        ((ArrayList) term17177).add((Object)null);
        ((ArrayList) term17177).add((Object)null);
        ((ArrayList) term17177).add((Object)null);
        ArrayList term17180 = new ArrayList();
        ((ArrayList) term17180).add((Object)null);
        ((ArrayList) term17180).add((Object)null);
        ((ArrayList) term17180).add((Object)null);
        ((ArrayList) term17180).add((Object)null);
        ((ArrayList) term17180).add((Object)null);
        ((ArrayList) term17180).add((Object)null);
        Object term17173 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term17173, term17173.getClass(), "employeeId", 941650513);
        setField(term17173, term17173.getClass(), "firstName", "");
        setField(term17173, term17173.getClass(), "lastName", "");
        setField(term17173, term17173.getClass(), "summaryTrackUnits", term17177);
        setField(term17173, term17173.getClass(), "projectTrackUnits", term17180);
        ArrayList term17187 = new ArrayList();
        ((ArrayList) term17187).add((Object)null);
        ((ArrayList) term17187).add((Object)null);
        ((ArrayList) term17187).add((Object)null);
        ((ArrayList) term17187).add((Object)null);
        ((ArrayList) term17187).add((Object)null);
        ArrayList term17190 = new ArrayList();
        ((ArrayList) term17190).add((Object)null);
        ((ArrayList) term17190).add((Object)null);
        ((ArrayList) term17190).add((Object)null);
        Object term17183 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term17183, term17183.getClass(), "employeeId", -1888585309);
        setField(term17183, term17183.getClass(), "firstName", "");
        setField(term17183, term17183.getClass(), "lastName", "");
        setField(term17183, term17183.getClass(), "summaryTrackUnits", term17187);
        setField(term17183, term17183.getClass(), "projectTrackUnits", term17190);
        ArrayList term17171 = new ArrayList();
        ((ArrayList) term17171).add(term17173);
        ((ArrayList) term17171).add(term17183);
        term17166 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto"));
        setField(term17166, term17166.getClass(), "days", term17167);
        setField(term17166, term17166.getClass(), "data", term17171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDays", argTypes, term17166, args);
    }

};


