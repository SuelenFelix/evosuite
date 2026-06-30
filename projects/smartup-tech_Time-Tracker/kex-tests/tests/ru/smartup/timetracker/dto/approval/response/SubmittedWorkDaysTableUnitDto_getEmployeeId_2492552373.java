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

public class SubmittedWorkDaysTableUnitDto_getEmployeeId_2492552373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27230;

    public SubmittedWorkDaysTableUnitDto_getEmployeeId_2492552373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27258 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27259 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27259, term27259.getClass(), "fastTime", 1387754061454L);
        setField(term27259, term27259.getClass(), "cdate", null);
        setField(term27258, term27258.getClass(), "date", term27259);
        setFloatField(term27258, term27258.getClass(), "hours", 0.22227418F);
        Object term27262 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27263 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27263, term27263.getClass(), "fastTime", 1368680124141L);
        setField(term27263, term27263.getClass(), "cdate", null);
        setField(term27262, term27262.getClass(), "date", term27263);
        setFloatField(term27262, term27262.getClass(), "hours", 0.6853048F);
        Object term27266 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27267 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27267, term27267.getClass(), "fastTime", 1390700341454L);
        setField(term27267, term27267.getClass(), "cdate", null);
        setField(term27266, term27266.getClass(), "date", term27267);
        setFloatField(term27266, term27266.getClass(), "hours", 0.06480974F);
        Object term27270 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27271 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27271, term27271.getClass(), "fastTime", 1325981376062L);
        setField(term27271, term27271.getClass(), "cdate", null);
        setField(term27270, term27270.getClass(), "date", term27271);
        setFloatField(term27270, term27270.getClass(), "hours", 0.92767143F);
        Object term27274 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27275 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27275, term27275.getClass(), "fastTime", 1638331931856L);
        setField(term27275, term27275.getClass(), "cdate", null);
        setField(term27274, term27274.getClass(), "date", term27275);
        setFloatField(term27274, term27274.getClass(), "hours", 0.849079F);
        Object term27278 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27279 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27279, term27279.getClass(), "fastTime", 1891157798466L);
        setField(term27279, term27279.getClass(), "cdate", null);
        setField(term27278, term27278.getClass(), "date", term27279);
        setFloatField(term27278, term27278.getClass(), "hours", 0.4673223F);
        Object term27282 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27283 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27283, term27283.getClass(), "fastTime", 1460978610142L);
        setField(term27283, term27283.getClass(), "cdate", null);
        setField(term27282, term27282.getClass(), "date", term27283);
        setFloatField(term27282, term27282.getClass(), "hours", 0.23129123F);
        ArrayList term27256 = new ArrayList();
        ((ArrayList) term27256).add(term27258);
        ((ArrayList) term27256).add(term27262);
        ((ArrayList) term27256).add(term27266);
        ((ArrayList) term27256).add(term27270);
        ((ArrayList) term27256).add(term27274);
        ((ArrayList) term27256).add(term27278);
        ((ArrayList) term27256).add(term27282);
        ArrayList term27295 = new ArrayList();
        ((ArrayList) term27295).add((Object)null);
        ((ArrayList) term27295).add((Object)null);
        ((ArrayList) term27295).add((Object)null);
        ((ArrayList) term27295).add((Object)null);
        ((ArrayList) term27295).add((Object)null);
        ((ArrayList) term27295).add((Object)null);
        Object term27290 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27290, term27290.getClass(), "projectId", -426764678);
        setField(term27290, term27290.getClass(), "projectName", "");
        setLongField(term27290, term27290.getClass(), "taskId", -9147545274054597570L);
        setField(term27290, term27290.getClass(), "taskName", "");
        setField(term27290, term27290.getClass(), "trackUnits", term27295);
        ArrayList term27303 = new ArrayList();
        ((ArrayList) term27303).add((Object)null);
        ((ArrayList) term27303).add((Object)null);
        ((ArrayList) term27303).add((Object)null);
        ((ArrayList) term27303).add((Object)null);
        Object term27298 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27298, term27298.getClass(), "projectId", -1222614956);
        setField(term27298, term27298.getClass(), "projectName", "");
        setLongField(term27298, term27298.getClass(), "taskId", -3279534582096707294L);
        setField(term27298, term27298.getClass(), "taskName", "");
        setField(term27298, term27298.getClass(), "trackUnits", term27303);
        ArrayList term27311 = new ArrayList();
        ((ArrayList) term27311).add((Object)null);
        Object term27306 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27306, term27306.getClass(), "projectId", -1870495012);
        setField(term27306, term27306.getClass(), "projectName", "");
        setLongField(term27306, term27306.getClass(), "taskId", -432424084523104253L);
        setField(term27306, term27306.getClass(), "taskName", "");
        setField(term27306, term27306.getClass(), "trackUnits", term27311);
        ArrayList term27319 = new ArrayList();
        ((ArrayList) term27319).add((Object)null);
        ((ArrayList) term27319).add((Object)null);
        Object term27314 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27314, term27314.getClass(), "projectId", -1310015129);
        setField(term27314, term27314.getClass(), "projectName", "");
        setLongField(term27314, term27314.getClass(), "taskId", 6150186973473930616L);
        setField(term27314, term27314.getClass(), "taskName", "");
        setField(term27314, term27314.getClass(), "trackUnits", term27319);
        ArrayList term27288 = new ArrayList();
        ((ArrayList) term27288).add(term27290);
        ((ArrayList) term27288).add(term27298);
        ((ArrayList) term27288).add(term27306);
        ((ArrayList) term27288).add(term27314);
        term27230 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term27230, term27230.getClass(), "employeeId", 1102721075);
        setField(term27230, term27230.getClass(), "firstName", "VUkRVwROTl");
        setField(term27230, term27230.getClass(), "lastName", "UDlkdccCRn");
        setField(term27230, term27230.getClass(), "summaryTrackUnits", term27256);
        setField(term27230, term27230.getClass(), "projectTrackUnits", term27288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term27230, args);
    }

};


