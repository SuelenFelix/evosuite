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
     Object term49277;
     Object term49283;

    public ProjectSelf_setLive_10366226523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49277 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term49277, term49277.getClass(), "projectName", null);
        setField(term49277, term49277.getClass(), "type", null);
        setField(term49277, term49277.getClass(), "startDate", null);
        setIntField(term49277, term49277.getClass(), "specifiedDuration", 0);
        setIntField(term49277, term49277.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term49277, term49277.getClass(), "isLive", false);
        setField(term49277, term49277.getClass(), "timer", null);
        setField(term49277, term49277.getClass(), "dateExpectedToComplete", null);
        setField(term49277, term49277.getClass(), "dateCompleted", null);
        setBooleanField(term49277, term49277.getClass(), "eveIsAlerted", false);
        setBooleanField(term49277, term49277.getClass(), "completionIsAlerted", false);
        setField(term49277, term49277.getClass(), "exhibition", null);
        setField(term49277, term49277.getClass(), "terminationButton", null);
        setField(term49277, term49277.getClass(), "completionButton", null);
        setField(term49277, term49277.getClass(), "moreOptions", null);
        setField(term49277, term49277.getClass(), "projectProgression", null);
        setField(term49277, term49277.getClass(), "progressLabelPercentage", null);
        setField(term49277, term49277.getClass(), "projectLayer", null);
        term49283 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term49283;
        callMethod(klass, "setLive", argTypes, term49277, args);
    }

};


