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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class SubmittedWorkDaysTableUnitDto_init_3190835561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27113;
     Object term27139;
     Object term27142;

    public SubmittedWorkDaysTableUnitDto_init_3190835561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27113 = new Integer(-1945706126);
        term27139 = new LinkedList();
        ArrayList term27172 = new ArrayList();
        ((ArrayList) term27172).add((Object)null);
        ((ArrayList) term27172).add((Object)null);
        ((ArrayList) term27172).add((Object)null);
        ((ArrayList) term27172).add((Object)null);
        ((ArrayList) term27172).add((Object)null);
        ((ArrayList) term27172).add((Object)null);
        ((ArrayList) term27172).add((Object)null);
        Object term27145 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27145, term27145.getClass(), "projectId", 1152356969);
        setField(term27145, term27145.getClass(), "projectName", "yevIIoVYHq");
        setLongField(term27145, term27145.getClass(), "taskId", 468487103823886117L);
        setField(term27145, term27145.getClass(), "taskName", "UuYWMTqWTV");
        setField(term27145, term27145.getClass(), "trackUnits", term27172);
        ArrayList term27182 = new ArrayList();
        ((ArrayList) term27182).add((Object)null);
        ((ArrayList) term27182).add((Object)null);
        ((ArrayList) term27182).add((Object)null);
        Object term27177 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27177, term27177.getClass(), "projectId", -1667990367);
        setField(term27177, term27177.getClass(), "projectName", "");
        setLongField(term27177, term27177.getClass(), "taskId", 4341016500855678917L);
        setField(term27177, term27177.getClass(), "taskName", "");
        setField(term27177, term27177.getClass(), "trackUnits", term27182);
        Object term27186 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27186, term27186.getClass(), "projectId", -1214628358);
        setField(term27186, term27186.getClass(), "projectName", null);
        setLongField(term27186, term27186.getClass(), "taskId", 6636235983121346803L);
        setField(term27186, term27186.getClass(), "taskName", null);
        setField(term27186, term27186.getClass(), "trackUnits", null);
        term27142 = new LinkedList();
        ((LinkedList) term27142).add(term27145);
        ((LinkedList) term27142).add(term27177);
        ((LinkedList) term27142).add(term27186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("java.util.List");
        Object[] args = new Object[5];
        args[0] = term27113;
        args[1] = "mKaHyMybrK";
        args[2] = "AyrEXuGrEj";
        args[3] = term27139;
        args[4] = term27142;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


