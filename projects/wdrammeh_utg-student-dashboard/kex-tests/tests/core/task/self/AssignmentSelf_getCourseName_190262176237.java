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

public class AssignmentSelf_getCourseName_190262176237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23642;

    public AssignmentSelf_getCourseName_190262176237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23642 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term23642, term23642.getClass(), "courseName", null);
        setField(term23642, term23642.getClass(), "question", null);
        setBooleanField(term23642, term23642.getClass(), "isGroup", false);
        setBooleanField(term23642, term23642.getClass(), "isOn", false);
        setField(term23642, term23642.getClass(), "modeOfSubmission", null);
        setField(term23642, term23642.getClass(), "startDate", null);
        setField(term23642, term23642.getClass(), "deadLine", null);
        setField(term23642, term23642.getClass(), "dateSubmitted", null);
        setField(term23642, term23642.getClass(), "timer", null);
        setField(term23642, term23642.getClass(), "members", null);
        setBooleanField(term23642, term23642.getClass(), "eveIsAlerted", false);
        setBooleanField(term23642, term23642.getClass(), "submissionIsAlerted", false);
        setField(term23642, term23642.getClass(), "deadlineIndicator", null);
        setField(term23642, term23642.getClass(), "groupLabel", null);
        setField(term23642, term23642.getClass(), "deadlineEditor", null);
        setField(term23642, term23642.getClass(), "assignmentExhibitor", null);
        setField(term23642, term23642.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseName", argTypes, term23642, args);
    }

};


