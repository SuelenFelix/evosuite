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

public class ProjectSelf_setDateCompleted_100632273527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52072;

    public ProjectSelf_setDateCompleted_100632273527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52072 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term52072, term52072.getClass(), "projectName", null);
        setField(term52072, term52072.getClass(), "type", null);
        setField(term52072, term52072.getClass(), "startDate", null);
        setIntField(term52072, term52072.getClass(), "specifiedDuration", 0);
        setIntField(term52072, term52072.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term52072, term52072.getClass(), "isLive", false);
        setField(term52072, term52072.getClass(), "timer", null);
        setField(term52072, term52072.getClass(), "dateExpectedToComplete", null);
        setField(term52072, term52072.getClass(), "dateCompleted", null);
        setBooleanField(term52072, term52072.getClass(), "eveIsAlerted", false);
        setBooleanField(term52072, term52072.getClass(), "completionIsAlerted", false);
        setField(term52072, term52072.getClass(), "exhibition", null);
        setField(term52072, term52072.getClass(), "terminationButton", null);
        setField(term52072, term52072.getClass(), "completionButton", null);
        setField(term52072, term52072.getClass(), "moreOptions", null);
        setField(term52072, term52072.getClass(), "projectProgression", null);
        setField(term52072, term52072.getClass(), "progressLabelPercentage", null);
        setField(term52072, term52072.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDateCompleted", argTypes, term52072, args);
    }

};


