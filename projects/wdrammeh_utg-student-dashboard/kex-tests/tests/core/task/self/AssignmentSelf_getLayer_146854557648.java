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

public class AssignmentSelf_getLayer_146854557648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109678;

    public AssignmentSelf_getLayer_146854557648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109678 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109678, term109678.getClass(), "courseName", null);
        setField(term109678, term109678.getClass(), "question", null);
        setBooleanField(term109678, term109678.getClass(), "isGroup", false);
        setBooleanField(term109678, term109678.getClass(), "isOn", false);
        setField(term109678, term109678.getClass(), "modeOfSubmission", null);
        setField(term109678, term109678.getClass(), "startDate", null);
        setField(term109678, term109678.getClass(), "deadLine", null);
        setField(term109678, term109678.getClass(), "dateSubmitted", null);
        setField(term109678, term109678.getClass(), "timer", null);
        setField(term109678, term109678.getClass(), "members", null);
        setBooleanField(term109678, term109678.getClass(), "eveIsAlerted", false);
        setBooleanField(term109678, term109678.getClass(), "submissionIsAlerted", false);
        setField(term109678, term109678.getClass(), "deadlineIndicator", null);
        setField(term109678, term109678.getClass(), "groupLabel", null);
        setField(term109678, term109678.getClass(), "deadlineEditor", null);
        setField(term109678, term109678.getClass(), "assignmentExhibitor", null);
        setField(term109678, term109678.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLayer", argTypes, term109678, args);
    }

};


