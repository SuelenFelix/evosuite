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
import java.lang.Integer;
import java.lang.Long;
import java.util.LinkedList;
import java.lang.Object;

public class SubmittedWorkDaysTableProjectUnitDto_init_124676451916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45127;
     Object term45141;
     Object term45155;

    public SubmittedWorkDaysTableProjectUnitDto_init_124676451916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45127 = new Integer(-2066804303);
        term45141 = new Long(3452833434644634217L);
        Object term45158 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term45160 = newInstance(Class.forName("java.util.Date"));
        setLongField(term45158, term45158.getClass(), "trackUnitId", -8603648071751666348L);
        setLongField(term45160, term45160.getClass(), "fastTime", 1713891155263L);
        setField(term45160, term45160.getClass(), "cdate", null);
        setField(term45158, term45158.getClass(), "date", term45160);
        setFloatField(term45158, term45158.getClass(), "hours", 0.49902177F);
        Object term45164 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term45166 = newInstance(Class.forName("java.util.Date"));
        setLongField(term45164, term45164.getClass(), "trackUnitId", -7884871963229073324L);
        setLongField(term45166, term45166.getClass(), "fastTime", 1663413767651L);
        setField(term45166, term45166.getClass(), "cdate", null);
        setField(term45164, term45164.getClass(), "date", term45166);
        setFloatField(term45164, term45164.getClass(), "hours", 0.26487374F);
        Object term45170 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        setLongField(term45170, term45170.getClass(), "trackUnitId", -8649738738252714180L);
        setField(term45170, term45170.getClass(), "date", null);
        setFloatField(term45170, term45170.getClass(), "hours", 0.22767627F);
        term45155 = new LinkedList();
        ((LinkedList) term45155).add(term45158);
        ((LinkedList) term45155).add(term45164);
        ((LinkedList) term45155).add(term45170);
        ((LinkedList) term45155).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = long.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.List");
        Object[] args = new Object[5];
        args[0] = term45127;
        args[1] = "XtiurrVYKw";
        args[2] = term45141;
        args[3] = "rsumfoDNHa";
        args[4] = term45155;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


