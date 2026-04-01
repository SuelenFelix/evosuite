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
     Object term261048;

    public ProjectSelf_getDaysTaken_100092332531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261048 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term261048, term261048.getClass(), "projectName", null);
        setField(term261048, term261048.getClass(), "type", null);
        setField(term261048, term261048.getClass(), "startDate", null);
        setIntField(term261048, term261048.getClass(), "specifiedDuration", 0);
        setIntField(term261048, term261048.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term261048, term261048.getClass(), "isLive", false);
        setField(term261048, term261048.getClass(), "timer", null);
        setField(term261048, term261048.getClass(), "dateExpectedToComplete", null);
        setField(term261048, term261048.getClass(), "dateCompleted", null);
        setBooleanField(term261048, term261048.getClass(), "eveIsAlerted", false);
        setBooleanField(term261048, term261048.getClass(), "completionIsAlerted", false);
        setField(term261048, term261048.getClass(), "exhibition", null);
        setField(term261048, term261048.getClass(), "terminationButton", null);
        setField(term261048, term261048.getClass(), "completionButton", null);
        setField(term261048, term261048.getClass(), "moreOptions", null);
        setField(term261048, term261048.getClass(), "projectProgression", null);
        setField(term261048, term261048.getClass(), "progressLabelPercentage", null);
        setField(term261048, term261048.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDaysTaken", argTypes, term261048, args);
    }

};


