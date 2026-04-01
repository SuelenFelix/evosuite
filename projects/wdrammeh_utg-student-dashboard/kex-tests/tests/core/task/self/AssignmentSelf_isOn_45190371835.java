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

public class AssignmentSelf_isOn_45190371835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109611;

    public AssignmentSelf_isOn_45190371835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109611 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109611, term109611.getClass(), "courseName", null);
        setField(term109611, term109611.getClass(), "question", null);
        setBooleanField(term109611, term109611.getClass(), "isGroup", false);
        setBooleanField(term109611, term109611.getClass(), "isOn", false);
        setField(term109611, term109611.getClass(), "modeOfSubmission", null);
        setField(term109611, term109611.getClass(), "startDate", null);
        setField(term109611, term109611.getClass(), "deadLine", null);
        setField(term109611, term109611.getClass(), "dateSubmitted", null);
        setField(term109611, term109611.getClass(), "timer", null);
        setField(term109611, term109611.getClass(), "members", null);
        setBooleanField(term109611, term109611.getClass(), "eveIsAlerted", false);
        setBooleanField(term109611, term109611.getClass(), "submissionIsAlerted", false);
        setField(term109611, term109611.getClass(), "deadlineIndicator", null);
        setField(term109611, term109611.getClass(), "groupLabel", null);
        setField(term109611, term109611.getClass(), "deadlineEditor", null);
        setField(term109611, term109611.getClass(), "assignmentExhibitor", null);
        setField(term109611, term109611.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOn", argTypes, term109611, args);
    }

};


