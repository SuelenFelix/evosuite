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

public class AssignmentSelf_getModeOfSubmission_123842758245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109663;

    public AssignmentSelf_getModeOfSubmission_123842758245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109663 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109663, term109663.getClass(), "courseName", null);
        setField(term109663, term109663.getClass(), "question", null);
        setBooleanField(term109663, term109663.getClass(), "isGroup", false);
        setBooleanField(term109663, term109663.getClass(), "isOn", false);
        setField(term109663, term109663.getClass(), "modeOfSubmission", null);
        setField(term109663, term109663.getClass(), "startDate", null);
        setField(term109663, term109663.getClass(), "deadLine", null);
        setField(term109663, term109663.getClass(), "dateSubmitted", null);
        setField(term109663, term109663.getClass(), "timer", null);
        setField(term109663, term109663.getClass(), "members", null);
        setBooleanField(term109663, term109663.getClass(), "eveIsAlerted", false);
        setBooleanField(term109663, term109663.getClass(), "submissionIsAlerted", false);
        setField(term109663, term109663.getClass(), "deadlineIndicator", null);
        setField(term109663, term109663.getClass(), "groupLabel", null);
        setField(term109663, term109663.getClass(), "deadlineEditor", null);
        setField(term109663, term109663.getClass(), "assignmentExhibitor", null);
        setField(term109663, term109663.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModeOfSubmission", argTypes, term109663, args);
    }

};


