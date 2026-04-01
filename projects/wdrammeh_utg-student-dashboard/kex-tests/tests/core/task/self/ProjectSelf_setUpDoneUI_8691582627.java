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

public class ProjectSelf_setUpDoneUI_8691582627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245281;

    public ProjectSelf_setUpDoneUI_8691582627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245281 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term245281, term245281.getClass(), "projectName", null);
        setField(term245281, term245281.getClass(), "type", null);
        setField(term245281, term245281.getClass(), "startDate", null);
        setIntField(term245281, term245281.getClass(), "specifiedDuration", 0);
        setIntField(term245281, term245281.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term245281, term245281.getClass(), "isLive", false);
        setField(term245281, term245281.getClass(), "timer", null);
        setField(term245281, term245281.getClass(), "dateExpectedToComplete", null);
        setField(term245281, term245281.getClass(), "dateCompleted", null);
        setBooleanField(term245281, term245281.getClass(), "eveIsAlerted", false);
        setBooleanField(term245281, term245281.getClass(), "completionIsAlerted", false);
        setField(term245281, term245281.getClass(), "exhibition", null);
        setField(term245281, term245281.getClass(), "terminationButton", null);
        setField(term245281, term245281.getClass(), "completionButton", null);
        setField(term245281, term245281.getClass(), "moreOptions", null);
        setField(term245281, term245281.getClass(), "projectProgression", null);
        setField(term245281, term245281.getClass(), "progressLabelPercentage", null);
        setField(term245281, term245281.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUpDoneUI", argTypes, term245281, args);
    }

};


