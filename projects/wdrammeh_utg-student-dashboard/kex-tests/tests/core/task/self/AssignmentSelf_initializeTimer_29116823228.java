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

public class AssignmentSelf_initializeTimer_29116823228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23591;
     Object term23596;

    public AssignmentSelf_initializeTimer_29116823228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23591 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term23591, term23591.getClass(), "courseName", null);
        setField(term23591, term23591.getClass(), "question", null);
        setBooleanField(term23591, term23591.getClass(), "isGroup", false);
        setBooleanField(term23591, term23591.getClass(), "isOn", false);
        setField(term23591, term23591.getClass(), "modeOfSubmission", null);
        setField(term23591, term23591.getClass(), "startDate", null);
        setField(term23591, term23591.getClass(), "deadLine", null);
        setField(term23591, term23591.getClass(), "dateSubmitted", null);
        setField(term23591, term23591.getClass(), "timer", null);
        setField(term23591, term23591.getClass(), "members", null);
        setBooleanField(term23591, term23591.getClass(), "eveIsAlerted", false);
        setBooleanField(term23591, term23591.getClass(), "submissionIsAlerted", false);
        setField(term23591, term23591.getClass(), "deadlineIndicator", null);
        setField(term23591, term23591.getClass(), "groupLabel", null);
        setField(term23591, term23591.getClass(), "deadlineEditor", null);
        setField(term23591, term23591.getClass(), "assignmentExhibitor", null);
        setField(term23591, term23591.getClass(), "assignmentPanel", null);
        term23596 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23596;
        callMethod(klass, "initializeTimer", argTypes, term23591, args);
    }

};


