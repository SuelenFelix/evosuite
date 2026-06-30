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

public class SubmittedWorkDaysTableDto_hashCode_435435978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21979;

    public SubmittedWorkDaysTableDto_hashCode_435435978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21980 = new ArrayList();
        ArrayList term21990 = new ArrayList();
        ((ArrayList) term21990).add((Object)null);
        ((ArrayList) term21990).add((Object)null);
        ((ArrayList) term21990).add((Object)null);
        ArrayList term21993 = new ArrayList();
        Object term21986 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term21986, term21986.getClass(), "employeeId", -1274456137);
        setField(term21986, term21986.getClass(), "firstName", "");
        setField(term21986, term21986.getClass(), "lastName", "");
        setField(term21986, term21986.getClass(), "summaryTrackUnits", term21990);
        setField(term21986, term21986.getClass(), "projectTrackUnits", term21993);
        ArrayList term22000 = new ArrayList();
        ((ArrayList) term22000).add((Object)null);
        ArrayList term22003 = new ArrayList();
        ((ArrayList) term22003).add((Object)null);
        ((ArrayList) term22003).add((Object)null);
        ((ArrayList) term22003).add((Object)null);
        Object term21996 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term21996, term21996.getClass(), "employeeId", 1041916673);
        setField(term21996, term21996.getClass(), "firstName", "");
        setField(term21996, term21996.getClass(), "lastName", "");
        setField(term21996, term21996.getClass(), "summaryTrackUnits", term22000);
        setField(term21996, term21996.getClass(), "projectTrackUnits", term22003);
        ArrayList term22010 = new ArrayList();
        ((ArrayList) term22010).add((Object)null);
        ((ArrayList) term22010).add((Object)null);
        ((ArrayList) term22010).add((Object)null);
        ((ArrayList) term22010).add((Object)null);
        ((ArrayList) term22010).add((Object)null);
        ArrayList term22013 = new ArrayList();
        ((ArrayList) term22013).add((Object)null);
        ((ArrayList) term22013).add((Object)null);
        ((ArrayList) term22013).add((Object)null);
        ((ArrayList) term22013).add((Object)null);
        ((ArrayList) term22013).add((Object)null);
        ((ArrayList) term22013).add((Object)null);
        ((ArrayList) term22013).add((Object)null);
        ((ArrayList) term22013).add((Object)null);
        ((ArrayList) term22013).add((Object)null);
        Object term22006 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term22006, term22006.getClass(), "employeeId", -2066804303);
        setField(term22006, term22006.getClass(), "firstName", "");
        setField(term22006, term22006.getClass(), "lastName", "");
        setField(term22006, term22006.getClass(), "summaryTrackUnits", term22010);
        setField(term22006, term22006.getClass(), "projectTrackUnits", term22013);
        ArrayList term22020 = new ArrayList();
        ((ArrayList) term22020).add((Object)null);
        ((ArrayList) term22020).add((Object)null);
        ArrayList term22023 = new ArrayList();
        Object term22016 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term22016, term22016.getClass(), "employeeId", -506958186);
        setField(term22016, term22016.getClass(), "firstName", "");
        setField(term22016, term22016.getClass(), "lastName", "");
        setField(term22016, term22016.getClass(), "summaryTrackUnits", term22020);
        setField(term22016, term22016.getClass(), "projectTrackUnits", term22023);
        ArrayList term22030 = new ArrayList();
        ((ArrayList) term22030).add((Object)null);
        ((ArrayList) term22030).add((Object)null);
        ((ArrayList) term22030).add((Object)null);
        ArrayList term22033 = new ArrayList();
        Object term22026 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term22026, term22026.getClass(), "employeeId", -507387516);
        setField(term22026, term22026.getClass(), "firstName", "");
        setField(term22026, term22026.getClass(), "lastName", "");
        setField(term22026, term22026.getClass(), "summaryTrackUnits", term22030);
        setField(term22026, term22026.getClass(), "projectTrackUnits", term22033);
        ArrayList term21984 = new ArrayList();
        ((ArrayList) term21984).add(term21986);
        ((ArrayList) term21984).add(term21996);
        ((ArrayList) term21984).add(term22006);
        ((ArrayList) term21984).add(term22016);
        ((ArrayList) term21984).add(term22026);
        term21979 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto"));
        setField(term21979, term21979.getClass(), "days", term21980);
        setField(term21979, term21979.getClass(), "data", term21984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term21979, args);
    }

};


