package ru.smartup.timetracker.pojo.notice;

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
import static ru.smartup.timetracker.pojo.notice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NoticeNumberEmployeesHours_getSumHours_108005932014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18275;

    public NoticeNumberEmployeesHours_getSumHours_108005932014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18275 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours"));
        setIntField(term18275, term18275.getClass(), "projectId", 0);
        setLongField(term18275, term18275.getClass(), "numberEmployees", 0L);
        setDoubleField(term18275, term18275.getClass(), "sumHours", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeNumberEmployeesHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumHours", argTypes, term18275, args);
    }

};


