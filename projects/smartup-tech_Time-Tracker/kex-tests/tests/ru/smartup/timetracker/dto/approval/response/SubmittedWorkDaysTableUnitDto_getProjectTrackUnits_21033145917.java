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

public class SubmittedWorkDaysTableUnitDto_getProjectTrackUnits_21033145917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27642;

    public SubmittedWorkDaysTableUnitDto_getProjectTrackUnits_21033145917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27670 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27671 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27671, term27671.getClass(), "fastTime", 1629693899295L);
        setField(term27671, term27671.getClass(), "cdate", null);
        setField(term27670, term27670.getClass(), "date", term27671);
        setFloatField(term27670, term27670.getClass(), "hours", 0.36312395F);
        Object term27674 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27675 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27675, term27675.getClass(), "fastTime", 1826251741593L);
        setField(term27675, term27675.getClass(), "cdate", null);
        setField(term27674, term27674.getClass(), "date", term27675);
        setFloatField(term27674, term27674.getClass(), "hours", 0.26696402F);
        Object term27678 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27679 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27679, term27679.getClass(), "fastTime", 1422779118265L);
        setField(term27679, term27679.getClass(), "cdate", null);
        setField(term27678, term27678.getClass(), "date", term27679);
        setFloatField(term27678, term27678.getClass(), "hours", 0.54856896F);
        ArrayList term27668 = new ArrayList();
        ((ArrayList) term27668).add(term27670);
        ((ArrayList) term27668).add(term27674);
        ((ArrayList) term27668).add(term27678);
        ArrayList term27691 = new ArrayList();
        ((ArrayList) term27691).add((Object)null);
        ((ArrayList) term27691).add((Object)null);
        Object term27686 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27686, term27686.getClass(), "projectId", 982388293);
        setField(term27686, term27686.getClass(), "projectName", "");
        setLongField(term27686, term27686.getClass(), "taskId", 6351887424140565471L);
        setField(term27686, term27686.getClass(), "taskName", "");
        setField(term27686, term27686.getClass(), "trackUnits", term27691);
        ArrayList term27699 = new ArrayList();
        ((ArrayList) term27699).add((Object)null);
        ((ArrayList) term27699).add((Object)null);
        ((ArrayList) term27699).add((Object)null);
        ((ArrayList) term27699).add((Object)null);
        ((ArrayList) term27699).add((Object)null);
        Object term27694 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27694, term27694.getClass(), "projectId", -159494544);
        setField(term27694, term27694.getClass(), "projectName", "");
        setLongField(term27694, term27694.getClass(), "taskId", -7273680182770718108L);
        setField(term27694, term27694.getClass(), "taskName", "");
        setField(term27694, term27694.getClass(), "trackUnits", term27699);
        ArrayList term27707 = new ArrayList();
        ((ArrayList) term27707).add((Object)null);
        ((ArrayList) term27707).add((Object)null);
        ((ArrayList) term27707).add((Object)null);
        ((ArrayList) term27707).add((Object)null);
        ((ArrayList) term27707).add((Object)null);
        ((ArrayList) term27707).add((Object)null);
        ((ArrayList) term27707).add((Object)null);
        ((ArrayList) term27707).add((Object)null);
        ((ArrayList) term27707).add((Object)null);
        Object term27702 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27702, term27702.getClass(), "projectId", -75206835);
        setField(term27702, term27702.getClass(), "projectName", "");
        setLongField(term27702, term27702.getClass(), "taskId", -4003544865306793676L);
        setField(term27702, term27702.getClass(), "taskName", "");
        setField(term27702, term27702.getClass(), "trackUnits", term27707);
        ArrayList term27715 = new ArrayList();
        ((ArrayList) term27715).add((Object)null);
        ((ArrayList) term27715).add((Object)null);
        Object term27710 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27710, term27710.getClass(), "projectId", -1618206977);
        setField(term27710, term27710.getClass(), "projectName", "");
        setLongField(term27710, term27710.getClass(), "taskId", 4012955251407483889L);
        setField(term27710, term27710.getClass(), "taskName", "");
        setField(term27710, term27710.getClass(), "trackUnits", term27715);
        ArrayList term27723 = new ArrayList();
        ((ArrayList) term27723).add((Object)null);
        ((ArrayList) term27723).add((Object)null);
        ((ArrayList) term27723).add((Object)null);
        ((ArrayList) term27723).add((Object)null);
        ((ArrayList) term27723).add((Object)null);
        ((ArrayList) term27723).add((Object)null);
        ((ArrayList) term27723).add((Object)null);
        Object term27718 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27718, term27718.getClass(), "projectId", -1747406163);
        setField(term27718, term27718.getClass(), "projectName", "");
        setLongField(term27718, term27718.getClass(), "taskId", -4058686252500969842L);
        setField(term27718, term27718.getClass(), "taskName", "");
        setField(term27718, term27718.getClass(), "trackUnits", term27723);
        ArrayList term27731 = new ArrayList();
        ((ArrayList) term27731).add((Object)null);
        ((ArrayList) term27731).add((Object)null);
        ((ArrayList) term27731).add((Object)null);
        Object term27726 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27726, term27726.getClass(), "projectId", 388157121);
        setField(term27726, term27726.getClass(), "projectName", "");
        setLongField(term27726, term27726.getClass(), "taskId", 6077991958696417121L);
        setField(term27726, term27726.getClass(), "taskName", "");
        setField(term27726, term27726.getClass(), "trackUnits", term27731);
        ArrayList term27739 = new ArrayList();
        ((ArrayList) term27739).add((Object)null);
        ((ArrayList) term27739).add((Object)null);
        ((ArrayList) term27739).add((Object)null);
        ((ArrayList) term27739).add((Object)null);
        ((ArrayList) term27739).add((Object)null);
        ((ArrayList) term27739).add((Object)null);
        ((ArrayList) term27739).add((Object)null);
        Object term27734 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27734, term27734.getClass(), "projectId", 1684998508);
        setField(term27734, term27734.getClass(), "projectName", "");
        setLongField(term27734, term27734.getClass(), "taskId", -5004803270846838598L);
        setField(term27734, term27734.getClass(), "taskName", "");
        setField(term27734, term27734.getClass(), "trackUnits", term27739);
        ArrayList term27747 = new ArrayList();
        ((ArrayList) term27747).add((Object)null);
        ((ArrayList) term27747).add((Object)null);
        ((ArrayList) term27747).add((Object)null);
        ((ArrayList) term27747).add((Object)null);
        ((ArrayList) term27747).add((Object)null);
        ((ArrayList) term27747).add((Object)null);
        ((ArrayList) term27747).add((Object)null);
        ((ArrayList) term27747).add((Object)null);
        Object term27742 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27742, term27742.getClass(), "projectId", -1476644457);
        setField(term27742, term27742.getClass(), "projectName", "");
        setLongField(term27742, term27742.getClass(), "taskId", -8211859616692114655L);
        setField(term27742, term27742.getClass(), "taskName", "");
        setField(term27742, term27742.getClass(), "trackUnits", term27747);
        ArrayList term27755 = new ArrayList();
        ((ArrayList) term27755).add((Object)null);
        ((ArrayList) term27755).add((Object)null);
        Object term27750 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27750, term27750.getClass(), "projectId", 1270666529);
        setField(term27750, term27750.getClass(), "projectName", "");
        setLongField(term27750, term27750.getClass(), "taskId", 7487838449539103993L);
        setField(term27750, term27750.getClass(), "taskName", "");
        setField(term27750, term27750.getClass(), "trackUnits", term27755);
        ArrayList term27684 = new ArrayList();
        ((ArrayList) term27684).add(term27686);
        ((ArrayList) term27684).add(term27694);
        ((ArrayList) term27684).add(term27702);
        ((ArrayList) term27684).add(term27710);
        ((ArrayList) term27684).add(term27718);
        ((ArrayList) term27684).add(term27726);
        ((ArrayList) term27684).add(term27734);
        ((ArrayList) term27684).add(term27742);
        ((ArrayList) term27684).add(term27750);
        term27642 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term27642, term27642.getClass(), "employeeId", 371943306);
        setField(term27642, term27642.getClass(), "firstName", "FiYYLuailz");
        setField(term27642, term27642.getClass(), "lastName", "XebAeSnCKZ");
        setField(term27642, term27642.getClass(), "summaryTrackUnits", term27668);
        setField(term27642, term27642.getClass(), "projectTrackUnits", term27684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectTrackUnits", argTypes, term27642, args);
    }

};


