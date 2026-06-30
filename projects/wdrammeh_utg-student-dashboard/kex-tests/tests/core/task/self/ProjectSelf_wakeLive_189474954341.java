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

public class ProjectSelf_wakeLive_189474954341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61104;

    public ProjectSelf_wakeLive_189474954341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61104 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term61104, term61104.getClass(), "projectName", null);
        setField(term61104, term61104.getClass(), "type", null);
        setField(term61104, term61104.getClass(), "startDate", null);
        setIntField(term61104, term61104.getClass(), "specifiedDuration", 0);
        setIntField(term61104, term61104.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term61104, term61104.getClass(), "isLive", false);
        setField(term61104, term61104.getClass(), "timer", null);
        setField(term61104, term61104.getClass(), "dateExpectedToComplete", null);
        setField(term61104, term61104.getClass(), "dateCompleted", null);
        setBooleanField(term61104, term61104.getClass(), "eveIsAlerted", false);
        setBooleanField(term61104, term61104.getClass(), "completionIsAlerted", false);
        setField(term61104, term61104.getClass(), "exhibition", null);
        setField(term61104, term61104.getClass(), "terminationButton", null);
        setField(term61104, term61104.getClass(), "completionButton", null);
        setField(term61104, term61104.getClass(), "moreOptions", null);
        setField(term61104, term61104.getClass(), "projectProgression", null);
        setField(term61104, term61104.getClass(), "progressLabelPercentage", null);
        setField(term61104, term61104.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "wakeLive", argTypes, term61104, args);
    }

};


