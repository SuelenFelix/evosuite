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

public class ProjectSelf_getType_173216208815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250388;

    public ProjectSelf_getType_173216208815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250388 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term250388, term250388.getClass(), "projectName", null);
        setField(term250388, term250388.getClass(), "type", null);
        setField(term250388, term250388.getClass(), "startDate", null);
        setIntField(term250388, term250388.getClass(), "specifiedDuration", 0);
        setIntField(term250388, term250388.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term250388, term250388.getClass(), "isLive", false);
        setField(term250388, term250388.getClass(), "timer", null);
        setField(term250388, term250388.getClass(), "dateExpectedToComplete", null);
        setField(term250388, term250388.getClass(), "dateCompleted", null);
        setBooleanField(term250388, term250388.getClass(), "eveIsAlerted", false);
        setBooleanField(term250388, term250388.getClass(), "completionIsAlerted", false);
        setField(term250388, term250388.getClass(), "exhibition", null);
        setField(term250388, term250388.getClass(), "terminationButton", null);
        setField(term250388, term250388.getClass(), "completionButton", null);
        setField(term250388, term250388.getClass(), "moreOptions", null);
        setField(term250388, term250388.getClass(), "projectProgression", null);
        setField(term250388, term250388.getClass(), "progressLabelPercentage", null);
        setField(term250388, term250388.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term250388, args);
    }

};


