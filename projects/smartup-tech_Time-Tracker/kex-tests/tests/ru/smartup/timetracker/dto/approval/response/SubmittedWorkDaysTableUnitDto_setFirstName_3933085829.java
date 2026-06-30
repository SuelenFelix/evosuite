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

public class SubmittedWorkDaysTableUnitDto_setFirstName_3933085829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27892;

    public SubmittedWorkDaysTableUnitDto_setFirstName_3933085829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27920 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27921 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27921, term27921.getClass(), "fastTime", 1460672232175L);
        setField(term27921, term27921.getClass(), "cdate", null);
        setField(term27920, term27920.getClass(), "date", term27921);
        setFloatField(term27920, term27920.getClass(), "hours", 0.57387376F);
        Object term27924 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27925 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27925, term27925.getClass(), "fastTime", 1444328743068L);
        setField(term27925, term27925.getClass(), "cdate", null);
        setField(term27924, term27924.getClass(), "date", term27925);
        setFloatField(term27924, term27924.getClass(), "hours", 0.897776F);
        Object term27928 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27929 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27929, term27929.getClass(), "fastTime", 1483547400964L);
        setField(term27929, term27929.getClass(), "cdate", null);
        setField(term27928, term27928.getClass(), "date", term27929);
        setFloatField(term27928, term27928.getClass(), "hours", 0.5694716F);
        Object term27932 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27933 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27933, term27933.getClass(), "fastTime", 1888800832212L);
        setField(term27933, term27933.getClass(), "cdate", null);
        setField(term27932, term27932.getClass(), "date", term27933);
        setFloatField(term27932, term27932.getClass(), "hours", 0.31070864F);
        Object term27936 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27937 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27937, term27937.getClass(), "fastTime", 1632313305411L);
        setField(term27937, term27937.getClass(), "cdate", null);
        setField(term27936, term27936.getClass(), "date", term27937);
        setFloatField(term27936, term27936.getClass(), "hours", 0.21362513F);
        ArrayList term27918 = new ArrayList();
        ((ArrayList) term27918).add(term27920);
        ((ArrayList) term27918).add(term27924);
        ((ArrayList) term27918).add(term27928);
        ((ArrayList) term27918).add(term27932);
        ((ArrayList) term27918).add(term27936);
        ArrayList term27949 = new ArrayList();
        ((ArrayList) term27949).add((Object)null);
        ((ArrayList) term27949).add((Object)null);
        ((ArrayList) term27949).add((Object)null);
        ((ArrayList) term27949).add((Object)null);
        ((ArrayList) term27949).add((Object)null);
        ((ArrayList) term27949).add((Object)null);
        ((ArrayList) term27949).add((Object)null);
        Object term27944 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27944, term27944.getClass(), "projectId", -1692331299);
        setField(term27944, term27944.getClass(), "projectName", "");
        setLongField(term27944, term27944.getClass(), "taskId", -412186147449928821L);
        setField(term27944, term27944.getClass(), "taskName", "");
        setField(term27944, term27944.getClass(), "trackUnits", term27949);
        ArrayList term27957 = new ArrayList();
        ((ArrayList) term27957).add((Object)null);
        ((ArrayList) term27957).add((Object)null);
        ((ArrayList) term27957).add((Object)null);
        ((ArrayList) term27957).add((Object)null);
        ((ArrayList) term27957).add((Object)null);
        ((ArrayList) term27957).add((Object)null);
        ((ArrayList) term27957).add((Object)null);
        ((ArrayList) term27957).add((Object)null);
        Object term27952 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27952, term27952.getClass(), "projectId", 479531250);
        setField(term27952, term27952.getClass(), "projectName", "");
        setLongField(term27952, term27952.getClass(), "taskId", 5304481534735378567L);
        setField(term27952, term27952.getClass(), "taskName", "");
        setField(term27952, term27952.getClass(), "trackUnits", term27957);
        ArrayList term27965 = new ArrayList();
        ((ArrayList) term27965).add((Object)null);
        ((ArrayList) term27965).add((Object)null);
        ((ArrayList) term27965).add((Object)null);
        Object term27960 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27960, term27960.getClass(), "projectId", 1320570890);
        setField(term27960, term27960.getClass(), "projectName", "");
        setLongField(term27960, term27960.getClass(), "taskId", 4096288569907305445L);
        setField(term27960, term27960.getClass(), "taskName", "");
        setField(term27960, term27960.getClass(), "trackUnits", term27965);
        ArrayList term27973 = new ArrayList();
        ((ArrayList) term27973).add((Object)null);
        ((ArrayList) term27973).add((Object)null);
        Object term27968 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27968, term27968.getClass(), "projectId", -130649791);
        setField(term27968, term27968.getClass(), "projectName", "");
        setLongField(term27968, term27968.getClass(), "taskId", 6940486570215409900L);
        setField(term27968, term27968.getClass(), "taskName", "");
        setField(term27968, term27968.getClass(), "trackUnits", term27973);
        ArrayList term27981 = new ArrayList();
        ((ArrayList) term27981).add((Object)null);
        ((ArrayList) term27981).add((Object)null);
        ((ArrayList) term27981).add((Object)null);
        ((ArrayList) term27981).add((Object)null);
        ((ArrayList) term27981).add((Object)null);
        ((ArrayList) term27981).add((Object)null);
        ((ArrayList) term27981).add((Object)null);
        Object term27976 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27976, term27976.getClass(), "projectId", 534834644);
        setField(term27976, term27976.getClass(), "projectName", "");
        setLongField(term27976, term27976.getClass(), "taskId", -7370364068296402536L);
        setField(term27976, term27976.getClass(), "taskName", "");
        setField(term27976, term27976.getClass(), "trackUnits", term27981);
        ArrayList term27989 = new ArrayList();
        ((ArrayList) term27989).add((Object)null);
        ((ArrayList) term27989).add((Object)null);
        ((ArrayList) term27989).add((Object)null);
        ((ArrayList) term27989).add((Object)null);
        Object term27984 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27984, term27984.getClass(), "projectId", 1959097203);
        setField(term27984, term27984.getClass(), "projectName", "");
        setLongField(term27984, term27984.getClass(), "taskId", -1084263688306617320L);
        setField(term27984, term27984.getClass(), "taskName", "");
        setField(term27984, term27984.getClass(), "trackUnits", term27989);
        ArrayList term27997 = new ArrayList();
        ((ArrayList) term27997).add((Object)null);
        ((ArrayList) term27997).add((Object)null);
        ((ArrayList) term27997).add((Object)null);
        ((ArrayList) term27997).add((Object)null);
        ((ArrayList) term27997).add((Object)null);
        ((ArrayList) term27997).add((Object)null);
        ((ArrayList) term27997).add((Object)null);
        ((ArrayList) term27997).add((Object)null);
        Object term27992 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27992, term27992.getClass(), "projectId", -209654048);
        setField(term27992, term27992.getClass(), "projectName", "");
        setLongField(term27992, term27992.getClass(), "taskId", 1193381106528373019L);
        setField(term27992, term27992.getClass(), "taskName", "");
        setField(term27992, term27992.getClass(), "trackUnits", term27997);
        ArrayList term28005 = new ArrayList();
        ((ArrayList) term28005).add((Object)null);
        ((ArrayList) term28005).add((Object)null);
        ((ArrayList) term28005).add((Object)null);
        ((ArrayList) term28005).add((Object)null);
        ((ArrayList) term28005).add((Object)null);
        ((ArrayList) term28005).add((Object)null);
        ((ArrayList) term28005).add((Object)null);
        ((ArrayList) term28005).add((Object)null);
        ((ArrayList) term28005).add((Object)null);
        Object term28000 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term28000, term28000.getClass(), "projectId", 477625804);
        setField(term28000, term28000.getClass(), "projectName", "");
        setLongField(term28000, term28000.getClass(), "taskId", -1365372122034008688L);
        setField(term28000, term28000.getClass(), "taskName", "");
        setField(term28000, term28000.getClass(), "trackUnits", term28005);
        ArrayList term27942 = new ArrayList();
        ((ArrayList) term27942).add(term27944);
        ((ArrayList) term27942).add(term27952);
        ((ArrayList) term27942).add(term27960);
        ((ArrayList) term27942).add(term27968);
        ((ArrayList) term27942).add(term27976);
        ((ArrayList) term27942).add(term27984);
        ((ArrayList) term27942).add(term27992);
        ((ArrayList) term27942).add(term28000);
        term27892 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term27892, term27892.getClass(), "employeeId", -1111249833);
        setField(term27892, term27892.getClass(), "firstName", "cmuaUiHMVL");
        setField(term27892, term27892.getClass(), "lastName", "xjoSGPWUgu");
        setField(term27892, term27892.getClass(), "summaryTrackUnits", term27918);
        setField(term27892, term27892.getClass(), "projectTrackUnits", term27942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vMsWjuPTnO";
        callMethod(klass, "setFirstName", argTypes, term27892, args);
    }

};


