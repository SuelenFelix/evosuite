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

public class AssignmentSelf_setModeOfSubmission_141416488646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109668;

    public AssignmentSelf_setModeOfSubmission_141416488646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109668 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109668, term109668.getClass(), "courseName", null);
        setField(term109668, term109668.getClass(), "question", null);
        setBooleanField(term109668, term109668.getClass(), "isGroup", false);
        setBooleanField(term109668, term109668.getClass(), "isOn", false);
        setField(term109668, term109668.getClass(), "modeOfSubmission", null);
        setField(term109668, term109668.getClass(), "startDate", null);
        setField(term109668, term109668.getClass(), "deadLine", null);
        setField(term109668, term109668.getClass(), "dateSubmitted", null);
        setField(term109668, term109668.getClass(), "timer", null);
        setField(term109668, term109668.getClass(), "members", null);
        setBooleanField(term109668, term109668.getClass(), "eveIsAlerted", false);
        setBooleanField(term109668, term109668.getClass(), "submissionIsAlerted", false);
        setField(term109668, term109668.getClass(), "deadlineIndicator", null);
        setField(term109668, term109668.getClass(), "groupLabel", null);
        setField(term109668, term109668.getClass(), "deadlineEditor", null);
        setField(term109668, term109668.getClass(), "assignmentExhibitor", null);
        setField(term109668, term109668.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setModeOfSubmission", argTypes, term109668, args);
    }

};


