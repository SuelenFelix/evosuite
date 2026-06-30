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

public class AssignmentSelf_getDeadLine_129157988840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23657;

    public AssignmentSelf_getDeadLine_129157988840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23657 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term23657, term23657.getClass(), "courseName", null);
        setField(term23657, term23657.getClass(), "question", null);
        setBooleanField(term23657, term23657.getClass(), "isGroup", false);
        setBooleanField(term23657, term23657.getClass(), "isOn", false);
        setField(term23657, term23657.getClass(), "modeOfSubmission", null);
        setField(term23657, term23657.getClass(), "startDate", null);
        setField(term23657, term23657.getClass(), "deadLine", null);
        setField(term23657, term23657.getClass(), "dateSubmitted", null);
        setField(term23657, term23657.getClass(), "timer", null);
        setField(term23657, term23657.getClass(), "members", null);
        setBooleanField(term23657, term23657.getClass(), "eveIsAlerted", false);
        setBooleanField(term23657, term23657.getClass(), "submissionIsAlerted", false);
        setField(term23657, term23657.getClass(), "deadlineIndicator", null);
        setField(term23657, term23657.getClass(), "groupLabel", null);
        setField(term23657, term23657.getClass(), "deadlineEditor", null);
        setField(term23657, term23657.getClass(), "assignmentExhibitor", null);
        setField(term23657, term23657.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeadLine", argTypes, term23657, args);
    }

};


