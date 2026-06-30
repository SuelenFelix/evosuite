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

public class NoticeRestController_readNoticesByIds_5998343273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819;
     Object term847;

    public NoticeRestController_readNoticesByIds_5998343273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term834 = new HashMap();
        Set<Object> term885 =  ((Map) term834).keySet();
        HashSet term833 = new HashSet((Collection<? extends Object>) term885);
        HashMap term842 = new HashMap();
        term819 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term819, term819.getClass(), "id", -1955890973);
        setField(term819, term819.getClass(), "email", "uuaPigETmJ");
        setField(term819, term819.getClass(), "employeeRoles", term833);
        setField(term819, term819.getClass(), "projectIdsByProjectRoles", term842);
        HashMap term849 = new HashMap();
        Set<Object> term886 =  ((Map) term849).keySet();
        HashSet term848 = new HashSet((Collection<? extends Object>) term886);
        term847 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.request.NoticeReadDto"));
        setField(term847, term847.getClass(), "noticeIds", term848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.NoticeRestController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        argTypes[1] = Class.forName("ru.smartup.timetracker.dto.notice.request.NoticeReadDto");
        Object[] args = new Object[2];
        args[0] = term819;
        args[1] = term847;
        callMethod(klass, "readNoticesByIds", argTypes, null, args);
    }

};


