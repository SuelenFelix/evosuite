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

public class ProjectSelf_getProjectName_83427258613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249091;

    public ProjectSelf_getProjectName_83427258613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249091 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term249091, term249091.getClass(), "projectName", null);
        setField(term249091, term249091.getClass(), "type", null);
        setField(term249091, term249091.getClass(), "startDate", null);
        setIntField(term249091, term249091.getClass(), "specifiedDuration", 0);
        setIntField(term249091, term249091.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term249091, term249091.getClass(), "isLive", false);
        setField(term249091, term249091.getClass(), "timer", null);
        setField(term249091, term249091.getClass(), "dateExpectedToComplete", null);
        setField(term249091, term249091.getClass(), "dateCompleted", null);
        setBooleanField(term249091, term249091.getClass(), "eveIsAlerted", false);
        setBooleanField(term249091, term249091.getClass(), "completionIsAlerted", false);
        setField(term249091, term249091.getClass(), "exhibition", null);
        setField(term249091, term249091.getClass(), "terminationButton", null);
        setField(term249091, term249091.getClass(), "completionButton", null);
        setField(term249091, term249091.getClass(), "moreOptions", null);
        setField(term249091, term249091.getClass(), "projectProgression", null);
        setField(term249091, term249091.getClass(), "progressLabelPercentage", null);
        setField(term249091, term249091.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectName", argTypes, term249091, args);
    }

};


