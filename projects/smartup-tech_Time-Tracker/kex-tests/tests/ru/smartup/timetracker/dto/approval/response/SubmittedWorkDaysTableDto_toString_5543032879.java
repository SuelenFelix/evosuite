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

public class SubmittedWorkDaysTableDto_toString_5543032879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22038;

    public SubmittedWorkDaysTableDto_toString_5543032879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22039 = new ArrayList();
        ArrayList term22049 = new ArrayList();
        ((ArrayList) term22049).add((Object)null);
        ((ArrayList) term22049).add((Object)null);
        ((ArrayList) term22049).add((Object)null);
        ((ArrayList) term22049).add((Object)null);
        ((ArrayList) term22049).add((Object)null);
        ((ArrayList) term22049).add((Object)null);
        ((ArrayList) term22049).add((Object)null);
        ((ArrayList) term22049).add((Object)null);
        ((ArrayList) term22049).add((Object)null);
        ArrayList term22052 = new ArrayList();
        ((ArrayList) term22052).add((Object)null);
        ((ArrayList) term22052).add((Object)null);
        ((ArrayList) term22052).add((Object)null);
        ((ArrayList) term22052).add((Object)null);
        ((ArrayList) term22052).add((Object)null);
        ((ArrayList) term22052).add((Object)null);
        Object term22045 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term22045, term22045.getClass(), "employeeId", -1970452551);
        setField(term22045, term22045.getClass(), "firstName", "");
        setField(term22045, term22045.getClass(), "lastName", "");
        setField(term22045, term22045.getClass(), "summaryTrackUnits", term22049);
        setField(term22045, term22045.getClass(), "projectTrackUnits", term22052);
        ArrayList term22059 = new ArrayList();
        ((ArrayList) term22059).add((Object)null);
        ((ArrayList) term22059).add((Object)null);
        ((ArrayList) term22059).add((Object)null);
        ((ArrayList) term22059).add((Object)null);
        ((ArrayList) term22059).add((Object)null);
        ((ArrayList) term22059).add((Object)null);
        ((ArrayList) term22059).add((Object)null);
        ((ArrayList) term22059).add((Object)null);
        ArrayList term22062 = new ArrayList();
        ((ArrayList) term22062).add((Object)null);
        ((ArrayList) term22062).add((Object)null);
        Object term22055 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term22055, term22055.getClass(), "employeeId", -1899301124);
        setField(term22055, term22055.getClass(), "firstName", "");
        setField(term22055, term22055.getClass(), "lastName", "");
        setField(term22055, term22055.getClass(), "summaryTrackUnits", term22059);
        setField(term22055, term22055.getClass(), "projectTrackUnits", term22062);
        ArrayList term22043 = new ArrayList();
        ((ArrayList) term22043).add(term22045);
        ((ArrayList) term22043).add(term22055);
        term22038 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto"));
        setField(term22038, term22038.getClass(), "days", term22039);
        setField(term22038, term22038.getClass(), "data", term22043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term22038, args);
    }

};


