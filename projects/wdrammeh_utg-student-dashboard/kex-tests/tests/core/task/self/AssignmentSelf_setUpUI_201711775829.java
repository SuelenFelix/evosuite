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

public class AssignmentSelf_setUpUI_201711775829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109579;

    public AssignmentSelf_setUpUI_201711775829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109579 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109579, term109579.getClass(), "courseName", null);
        setField(term109579, term109579.getClass(), "question", null);
        setBooleanField(term109579, term109579.getClass(), "isGroup", false);
        setBooleanField(term109579, term109579.getClass(), "isOn", false);
        setField(term109579, term109579.getClass(), "modeOfSubmission", null);
        setField(term109579, term109579.getClass(), "startDate", null);
        setField(term109579, term109579.getClass(), "deadLine", null);
        setField(term109579, term109579.getClass(), "dateSubmitted", null);
        setField(term109579, term109579.getClass(), "timer", null);
        setField(term109579, term109579.getClass(), "members", null);
        setBooleanField(term109579, term109579.getClass(), "eveIsAlerted", false);
        setBooleanField(term109579, term109579.getClass(), "submissionIsAlerted", false);
        setField(term109579, term109579.getClass(), "deadlineIndicator", null);
        setField(term109579, term109579.getClass(), "groupLabel", null);
        setField(term109579, term109579.getClass(), "deadlineEditor", null);
        setField(term109579, term109579.getClass(), "assignmentExhibitor", null);
        setField(term109579, term109579.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUpUI", argTypes, term109579, args);
    }

};


