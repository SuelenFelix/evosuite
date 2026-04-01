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
import java.lang.Integer;

public class ProjectSelf_setTotalTimeConsumed_117853323235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263713;
     Object term263719;

    public ProjectSelf_setTotalTimeConsumed_117853323235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263713 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term263713, term263713.getClass(), "projectName", null);
        setField(term263713, term263713.getClass(), "type", null);
        setField(term263713, term263713.getClass(), "startDate", null);
        setIntField(term263713, term263713.getClass(), "specifiedDuration", 0);
        setIntField(term263713, term263713.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term263713, term263713.getClass(), "isLive", false);
        setField(term263713, term263713.getClass(), "timer", null);
        setField(term263713, term263713.getClass(), "dateExpectedToComplete", null);
        setField(term263713, term263713.getClass(), "dateCompleted", null);
        setBooleanField(term263713, term263713.getClass(), "eveIsAlerted", false);
        setBooleanField(term263713, term263713.getClass(), "completionIsAlerted", false);
        setField(term263713, term263713.getClass(), "exhibition", null);
        setField(term263713, term263713.getClass(), "terminationButton", null);
        setField(term263713, term263713.getClass(), "completionButton", null);
        setField(term263713, term263713.getClass(), "moreOptions", null);
        setField(term263713, term263713.getClass(), "projectProgression", null);
        setField(term263713, term263713.getClass(), "progressLabelPercentage", null);
        setField(term263713, term263713.getClass(), "projectLayer", null);
        term263719 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term263719;
        callMethod(klass, "setTotalTimeConsumed", argTypes, term263713, args);
    }

};


