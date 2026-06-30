package core.task.self;

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
import static core.task.self.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProjectSelf_getDaysTaken_100092332531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54564;

    public ProjectSelf_getDaysTaken_100092332531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54564 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term54564, term54564.getClass(), "projectName", null);
        setField(term54564, term54564.getClass(), "type", null);
        setField(term54564, term54564.getClass(), "startDate", null);
        setIntField(term54564, term54564.getClass(), "specifiedDuration", 0);
        setIntField(term54564, term54564.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term54564, term54564.getClass(), "isLive", false);
        setField(term54564, term54564.getClass(), "timer", null);
        setField(term54564, term54564.getClass(), "dateExpectedToComplete", null);
        setField(term54564, term54564.getClass(), "dateCompleted", null);
        setBooleanField(term54564, term54564.getClass(), "eveIsAlerted", false);
        setBooleanField(term54564, term54564.getClass(), "completionIsAlerted", false);
        setField(term54564, term54564.getClass(), "exhibition", null);
        setField(term54564, term54564.getClass(), "terminationButton", null);
        setField(term54564, term54564.getClass(), "completionButton", null);
        setField(term54564, term54564.getClass(), "moreOptions", null);
        setField(term54564, term54564.getClass(), "projectProgression", null);
        setField(term54564, term54564.getClass(), "progressLabelPercentage", null);
        setField(term54564, term54564.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDaysTaken", argTypes, term54564, args);
    }

};


