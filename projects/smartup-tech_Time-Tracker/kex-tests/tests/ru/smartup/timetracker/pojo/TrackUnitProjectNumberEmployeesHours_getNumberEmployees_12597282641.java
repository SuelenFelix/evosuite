package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TrackUnitProjectNumberEmployeesHours_getNumberEmployees_12597282641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57103;

    public TrackUnitProjectNumberEmployeesHours_getNumberEmployees_12597282641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57103 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectNumberEmployeesHours"));
        setIntField(term57103, term57103.getClass(), "projectId", 1102721075);
        setLongField(term57103, term57103.getClass(), "numberEmployees", -4598158870068953328L);
        setDoubleField(term57103, term57103.getClass(), "sumHours", 0.3587267442738795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectNumberEmployeesHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberEmployees", argTypes, term57103, args);
    }

};


