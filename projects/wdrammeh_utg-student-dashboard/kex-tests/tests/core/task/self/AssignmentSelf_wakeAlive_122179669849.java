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

public class AssignmentSelf_wakeAlive_122179669849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23702;

    public AssignmentSelf_wakeAlive_122179669849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23702 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term23702, term23702.getClass(), "courseName", null);
        setField(term23702, term23702.getClass(), "question", null);
        setBooleanField(term23702, term23702.getClass(), "isGroup", false);
        setBooleanField(term23702, term23702.getClass(), "isOn", false);
        setField(term23702, term23702.getClass(), "modeOfSubmission", null);
        setField(term23702, term23702.getClass(), "startDate", null);
        setField(term23702, term23702.getClass(), "deadLine", null);
        setField(term23702, term23702.getClass(), "dateSubmitted", null);
        setField(term23702, term23702.getClass(), "timer", null);
        setField(term23702, term23702.getClass(), "members", null);
        setBooleanField(term23702, term23702.getClass(), "eveIsAlerted", false);
        setBooleanField(term23702, term23702.getClass(), "submissionIsAlerted", false);
        setField(term23702, term23702.getClass(), "deadlineIndicator", null);
        setField(term23702, term23702.getClass(), "groupLabel", null);
        setField(term23702, term23702.getClass(), "deadlineEditor", null);
        setField(term23702, term23702.getClass(), "assignmentExhibitor", null);
        setField(term23702, term23702.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "wakeAlive", argTypes, term23702, args);
    }

};


