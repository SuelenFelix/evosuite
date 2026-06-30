package ru.smartup.timetracker.controller;

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
import static ru.smartup.timetracker.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class NoticeRestController_deleteNoticesByIds_12952788295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930;
     Object term958;

    public NoticeRestController_deleteNoticesByIds_12952788295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term945 = new HashMap();
        Set<Object> term1000 =  ((Map) term945).keySet();
        HashSet term944 = new HashSet((Collection<? extends Object>) term1000);
        HashMap term953 = new HashMap();
        term930 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term930, term930.getClass(), "id", 1227103734);
        setField(term930, term930.getClass(), "email", "LQFpaHEwXR");
        setField(term930, term930.getClass(), "employeeRoles", term944);
        setField(term930, term930.getClass(), "projectIdsByProjectRoles", term953);
        HashMap term960 = new HashMap();
        Set<Object> term1001 =  ((Map) term960).keySet();
        HashSet term959 = new HashSet((Collection<? extends Object>) term1001);
        term958 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.request.NoticeDeleteDto"));
        setField(term958, term958.getClass(), "noticeIds", term959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.NoticeRestController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        argTypes[1] = Class.forName("ru.smartup.timetracker.dto.notice.request.NoticeDeleteDto");
        Object[] args = new Object[2];
        args[0] = term930;
        args[1] = term958;
        callMethod(klass, "deleteNoticesByIds", argTypes, null, args);
    }

};


