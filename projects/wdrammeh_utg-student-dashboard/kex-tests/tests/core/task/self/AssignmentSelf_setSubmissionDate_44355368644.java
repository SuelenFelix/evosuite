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

public class AssignmentSelf_setSubmissionDate_44355368644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109658;

    public AssignmentSelf_setSubmissionDate_44355368644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109658 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109658, term109658.getClass(), "courseName", null);
        setField(term109658, term109658.getClass(), "question", null);
        setBooleanField(term109658, term109658.getClass(), "isGroup", false);
        setBooleanField(term109658, term109658.getClass(), "isOn", false);
        setField(term109658, term109658.getClass(), "modeOfSubmission", null);
        setField(term109658, term109658.getClass(), "startDate", null);
        setField(term109658, term109658.getClass(), "deadLine", null);
        setField(term109658, term109658.getClass(), "dateSubmitted", null);
        setField(term109658, term109658.getClass(), "timer", null);
        setField(term109658, term109658.getClass(), "members", null);
        setBooleanField(term109658, term109658.getClass(), "eveIsAlerted", false);
        setBooleanField(term109658, term109658.getClass(), "submissionIsAlerted", false);
        setField(term109658, term109658.getClass(), "deadlineIndicator", null);
        setField(term109658, term109658.getClass(), "groupLabel", null);
        setField(term109658, term109658.getClass(), "deadlineEditor", null);
        setField(term109658, term109658.getClass(), "assignmentExhibitor", null);
        setField(term109658, term109658.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSubmissionDate", argTypes, term109658, args);
    }

};


