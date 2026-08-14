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
import java.util.LinkedList;

public class SubmittedWorkDaysTableProjectUnitDto_setTrackUnits_136915862111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44736;
     Object term44787;

    public SubmittedWorkDaysTableProjectUnitDto_setTrackUnits_136915862111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44765 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44767 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44765, term44765.getClass(), "trackUnitId", 1084801489398441516L);
        setLongField(term44767, term44767.getClass(), "fastTime", 1426018874434L);
        setField(term44767, term44767.getClass(), "cdate", null);
        setField(term44765, term44765.getClass(), "date", term44767);
        setFloatField(term44765, term44765.getClass(), "hours", 0.5657654F);
        Object term44770 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44772 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44770, term44770.getClass(), "trackUnitId", 6273754186658578034L);
        setLongField(term44772, term44772.getClass(), "fastTime", 1633004775487L);
        setField(term44772, term44772.getClass(), "cdate", null);
        setField(term44770, term44770.getClass(), "date", term44772);
        setFloatField(term44770, term44770.getClass(), "hours", 0.3954653F);
        Object term44775 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44777 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44775, term44775.getClass(), "trackUnitId", 3620247240684476031L);
        setLongField(term44777, term44777.getClass(), "fastTime", 1819191638549L);
        setField(term44777, term44777.getClass(), "cdate", null);
        setField(term44775, term44775.getClass(), "date", term44777);
        setFloatField(term44775, term44775.getClass(), "hours", 0.638206F);
        Object term44780 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44782 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44780, term44780.getClass(), "trackUnitId", 8313800941204938919L);
        setLongField(term44782, term44782.getClass(), "fastTime", 1400691778698L);
        setField(term44782, term44782.getClass(), "cdate", null);
        setField(term44780, term44780.getClass(), "date", term44782);
        setFloatField(term44780, term44780.getClass(), "hours", 0.3034814F);
        ArrayList term44763 = new ArrayList();
        ((ArrayList) term44763).add(term44765);
        ((ArrayList) term44763).add(term44770);
        ((ArrayList) term44763).add(term44775);
        ((ArrayList) term44763).add(term44780);
        term44736 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term44736, term44736.getClass(), "projectId", -1274456137);
        setField(term44736, term44736.getClass(), "projectName", "IlBhdrCvHq");
        setLongField(term44736, term44736.getClass(), "taskId", -900457279156388404L);
        setField(term44736, term44736.getClass(), "taskName", "OirVUQhauU");
        setField(term44736, term44736.getClass(), "trackUnits", term44763);
        Object term44790 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44792 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44790, term44790.getClass(), "trackUnitId", -1214968196781083707L);
        setLongField(term44792, term44792.getClass(), "fastTime", 1741444563811L);
        setField(term44792, term44792.getClass(), "cdate", null);
        setField(term44790, term44790.getClass(), "date", term44792);
        setFloatField(term44790, term44790.getClass(), "hours", 0.18499982F);
        Object term44796 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44798 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44796, term44796.getClass(), "trackUnitId", -1804015692891701666L);
        setLongField(term44798, term44798.getClass(), "fastTime", 1761994701322L);
        setField(term44798, term44798.getClass(), "cdate", null);
        setField(term44796, term44796.getClass(), "date", term44798);
        setFloatField(term44796, term44796.getClass(), "hours", 0.8988424F);
        Object term44802 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        setLongField(term44802, term44802.getClass(), "trackUnitId", -6432617521836576658L);
        setField(term44802, term44802.getClass(), "date", null);
        setFloatField(term44802, term44802.getClass(), "hours", 0.36312395F);
        term44787 = new LinkedList();
        ((LinkedList) term44787).add(term44790);
        ((LinkedList) term44787).add(term44796);
        ((LinkedList) term44787).add(term44802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term44787;
        callMethod(klass, "setTrackUnits", argTypes, term44736, args);
    }

};


