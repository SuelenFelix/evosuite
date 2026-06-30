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

public class SubmittedWorkDaysTableUnitDto_setSummaryTrackUnits_54169366011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28140;
     Object term28194;

    public SubmittedWorkDaysTableUnitDto_setSummaryTrackUnits_54169366011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28168 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28169 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28169, term28169.getClass(), "fastTime", 1367603522080L);
        setField(term28169, term28169.getClass(), "cdate", null);
        setField(term28168, term28168.getClass(), "date", term28169);
        setFloatField(term28168, term28168.getClass(), "hours", 0.116303444F);
        Object term28172 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28173 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28173, term28173.getClass(), "fastTime", 1414854822554L);
        setField(term28173, term28173.getClass(), "cdate", null);
        setField(term28172, term28172.getClass(), "date", term28173);
        setFloatField(term28172, term28172.getClass(), "hours", 0.34951717F);
        Object term28176 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28177 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28177, term28177.getClass(), "fastTime", 1878671485848L);
        setField(term28177, term28177.getClass(), "cdate", null);
        setField(term28176, term28176.getClass(), "date", term28177);
        setFloatField(term28176, term28176.getClass(), "hours", 0.11878139F);
        Object term28180 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28181 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28181, term28181.getClass(), "fastTime", 1472742328615L);
        setField(term28181, term28181.getClass(), "cdate", null);
        setField(term28180, term28180.getClass(), "date", term28181);
        setFloatField(term28180, term28180.getClass(), "hours", 0.20687163F);
        Object term28184 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28185 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28185, term28185.getClass(), "fastTime", 1761728693407L);
        setField(term28185, term28185.getClass(), "cdate", null);
        setField(term28184, term28184.getClass(), "date", term28185);
        setFloatField(term28184, term28184.getClass(), "hours", 0.04662496F);
        ArrayList term28166 = new ArrayList();
        ((ArrayList) term28166).add(term28168);
        ((ArrayList) term28166).add(term28172);
        ((ArrayList) term28166).add(term28176);
        ((ArrayList) term28166).add(term28180);
        ((ArrayList) term28166).add(term28184);
        ArrayList term28190 = new ArrayList();
        term28140 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term28140, term28140.getClass(), "employeeId", 1460722225);
        setField(term28140, term28140.getClass(), "firstName", "PNoWXrsFic");
        setField(term28140, term28140.getClass(), "lastName", "QZBHZqZope");
        setField(term28140, term28140.getClass(), "summaryTrackUnits", term28166);
        setField(term28140, term28140.getClass(), "projectTrackUnits", term28190);
        Object term28197 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28198 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28198, term28198.getClass(), "fastTime", 1715302849242L);
        setField(term28198, term28198.getClass(), "cdate", null);
        setField(term28197, term28197.getClass(), "date", term28198);
        setFloatField(term28197, term28197.getClass(), "hours", 0.57349455F);
        Object term28202 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28203 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28203, term28203.getClass(), "fastTime", 1562237802749L);
        setField(term28203, term28203.getClass(), "cdate", null);
        setField(term28202, term28202.getClass(), "date", term28203);
        setFloatField(term28202, term28202.getClass(), "hours", 0.17512423F);
        Object term28207 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        setField(term28207, term28207.getClass(), "date", null);
        setFloatField(term28207, term28207.getClass(), "hours", 0.6328098F);
        term28194 = new LinkedList();
        ((LinkedList) term28194).add(term28197);
        ((LinkedList) term28194).add(term28202);
        ((LinkedList) term28194).add(term28207);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term28194;
        callMethod(klass, "setSummaryTrackUnits", argTypes, term28140, args);
    }

};


