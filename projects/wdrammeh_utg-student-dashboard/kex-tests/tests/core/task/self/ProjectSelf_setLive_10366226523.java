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
import java.lang.Boolean;

public class ProjectSelf_setLive_10366226523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255743;
     Object term255749;

    public ProjectSelf_setLive_10366226523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255743 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term255743, term255743.getClass(), "projectName", null);
        setField(term255743, term255743.getClass(), "type", null);
        setField(term255743, term255743.getClass(), "startDate", null);
        setIntField(term255743, term255743.getClass(), "specifiedDuration", 0);
        setIntField(term255743, term255743.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term255743, term255743.getClass(), "isLive", false);
        setField(term255743, term255743.getClass(), "timer", null);
        setField(term255743, term255743.getClass(), "dateExpectedToComplete", null);
        setField(term255743, term255743.getClass(), "dateCompleted", null);
        setBooleanField(term255743, term255743.getClass(), "eveIsAlerted", false);
        setBooleanField(term255743, term255743.getClass(), "completionIsAlerted", false);
        setField(term255743, term255743.getClass(), "exhibition", null);
        setField(term255743, term255743.getClass(), "terminationButton", null);
        setField(term255743, term255743.getClass(), "completionButton", null);
        setField(term255743, term255743.getClass(), "moreOptions", null);
        setField(term255743, term255743.getClass(), "projectProgression", null);
        setField(term255743, term255743.getClass(), "progressLabelPercentage", null);
        setField(term255743, term255743.getClass(), "projectLayer", null);
        term255749 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term255749;
        callMethod(klass, "setLive", argTypes, term255743, args);
    }

};


