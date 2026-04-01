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

public class AssignmentSelf_setDeadLine_29476255241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109643;

    public AssignmentSelf_setDeadLine_29476255241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109643 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109643, term109643.getClass(), "courseName", null);
        setField(term109643, term109643.getClass(), "question", null);
        setBooleanField(term109643, term109643.getClass(), "isGroup", false);
        setBooleanField(term109643, term109643.getClass(), "isOn", false);
        setField(term109643, term109643.getClass(), "modeOfSubmission", null);
        setField(term109643, term109643.getClass(), "startDate", null);
        setField(term109643, term109643.getClass(), "deadLine", null);
        setField(term109643, term109643.getClass(), "dateSubmitted", null);
        setField(term109643, term109643.getClass(), "timer", null);
        setField(term109643, term109643.getClass(), "members", null);
        setBooleanField(term109643, term109643.getClass(), "eveIsAlerted", false);
        setBooleanField(term109643, term109643.getClass(), "submissionIsAlerted", false);
        setField(term109643, term109643.getClass(), "deadlineIndicator", null);
        setField(term109643, term109643.getClass(), "groupLabel", null);
        setField(term109643, term109643.getClass(), "deadlineEditor", null);
        setField(term109643, term109643.getClass(), "assignmentExhibitor", null);
        setField(term109643, term109643.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDeadLine", argTypes, term109643, args);
    }

};


