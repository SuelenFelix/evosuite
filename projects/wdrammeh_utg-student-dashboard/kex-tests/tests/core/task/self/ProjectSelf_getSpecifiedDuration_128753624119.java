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

public class ProjectSelf_getSpecifiedDuration_128753624119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252982;

    public ProjectSelf_getSpecifiedDuration_128753624119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252982 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term252982, term252982.getClass(), "projectName", null);
        setField(term252982, term252982.getClass(), "type", null);
        setField(term252982, term252982.getClass(), "startDate", null);
        setIntField(term252982, term252982.getClass(), "specifiedDuration", 0);
        setIntField(term252982, term252982.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term252982, term252982.getClass(), "isLive", false);
        setField(term252982, term252982.getClass(), "timer", null);
        setField(term252982, term252982.getClass(), "dateExpectedToComplete", null);
        setField(term252982, term252982.getClass(), "dateCompleted", null);
        setBooleanField(term252982, term252982.getClass(), "eveIsAlerted", false);
        setBooleanField(term252982, term252982.getClass(), "completionIsAlerted", false);
        setField(term252982, term252982.getClass(), "exhibition", null);
        setField(term252982, term252982.getClass(), "terminationButton", null);
        setField(term252982, term252982.getClass(), "completionButton", null);
        setField(term252982, term252982.getClass(), "moreOptions", null);
        setField(term252982, term252982.getClass(), "projectProgression", null);
        setField(term252982, term252982.getClass(), "progressLabelPercentage", null);
        setField(term252982, term252982.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpecifiedDuration", argTypes, term252982, args);
    }

};


