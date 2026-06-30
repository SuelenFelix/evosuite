package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ModuleAnalysis_newSingletonLabel_178243694625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27697;

    public ModuleAnalysis_newSingletonLabel_178243694625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27697 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27697, term27697.getClass(), "APlusLabel", null);
        setField(term27697, term27697.getClass(), "ANeutralLabel", null);
        setField(term27697, term27697.getClass(), "AMinusLabel", null);
        setField(term27697, term27697.getClass(), "BPlusLabel", null);
        setField(term27697, term27697.getClass(), "BNeutralLabel", null);
        setField(term27697, term27697.getClass(), "BMinusLabel", null);
        setField(term27697, term27697.getClass(), "CPlusLabel", null);
        setField(term27697, term27697.getClass(), "CNeutralLabel", null);
        setField(term27697, term27697.getClass(), "CMinusLabel", null);
        setField(term27697, term27697.getClass(), "DLabel", null);
        setField(term27697, term27697.getClass(), "FLabel", null);
        setField(term27697, term27697.getClass(), "highestScoreLabel", null);
        setField(term27697, term27697.getClass(), "lowestScoreLabel", null);
        setField(term27697, term27697.getClass(), "highestMajorScoreLabel", null);
        setField(term27697, term27697.getClass(), "lowestMajorScoreLabel", null);
        setField(term27697, term27697.getClass(), "highestMinorScoreLabel", null);
        setField(term27697, term27697.getClass(), "lowestMinorScoreLabel", null);
        setField(term27697, term27697.getClass(), "highestDERScoreLabel", null);
        setField(term27697, term27697.getClass(), "lowestDERScoreLabel", null);
        setField(term27697, term27697.getClass(), "highestGERScoreLabel", null);
        setField(term27697, term27697.getClass(), "lowestGERScoreLabel", null);
        setField(term27697, term27697.getClass(), "majorsLabel", null);
        setField(term27697, term27697.getClass(), "minorsLabel", null);
        setField(term27697, term27697.getClass(), "DERsLabel", null);
        setField(term27697, term27697.getClass(), "GERsLabel", null);
        setField(term27697, term27697.getClass(), "unclassifiedListLabel", null);
        setField(term27697, term27697.getClass(), "allModulesLabel", null);
        setField(term27697, term27697.getClass(), "APlusList", null);
        setField(term27697, term27697.getClass(), "ANeutralList", null);
        setField(term27697, term27697.getClass(), "AMinusList", null);
        setField(term27697, term27697.getClass(), "BPlusList", null);
        setField(term27697, term27697.getClass(), "BNeutralList", null);
        setField(term27697, term27697.getClass(), "BMinusList", null);
        setField(term27697, term27697.getClass(), "CPlusList", null);
        setField(term27697, term27697.getClass(), "CNeutralList", null);
        setField(term27697, term27697.getClass(), "CMinusList", null);
        setField(term27697, term27697.getClass(), "DList", null);
        setField(term27697, term27697.getClass(), "FList", null);
        setField(term27697, term27697.getClass(), "majorsList", null);
        setField(term27697, term27697.getClass(), "minorsList", null);
        setField(term27697, term27697.getClass(), "DERList", null);
        setField(term27697, term27697.getClass(), "GERList", null);
        setField(term27697, term27697.getClass(), "unclassifiedList", null);
        setField(term27697, term27697.getClass(), "highestScoreCourse", null);
        setField(term27697, term27697.getClass(), "lowestScoreCourse", null);
        setField(term27697, term27697.getClass(), "highestMajorScoreCourse", null);
        setField(term27697, term27697.getClass(), "lowestMajorScoreCourse", null);
        setField(term27697, term27697.getClass(), "highestMinorScoreCourse", null);
        setField(term27697, term27697.getClass(), "lowestMinorScoreCourse", null);
        setField(term27697, term27697.getClass(), "highestDERScoreCourse", null);
        setField(term27697, term27697.getClass(), "lowestDERScoreCourse", null);
        setField(term27697, term27697.getClass(), "highestGERScoreCourse", null);
        setField(term27697, term27697.getClass(), "lowestGERScoreCourse", null);
        setField(term27697, term27697.getClass(), "cardLayout", null);
        setField(term27697, term27697.getClass(), "modulesBasement", null);
        setField(term27697, term27697.getClass(), "semestersBasement", null);
        setField(term27697, term27697.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Runnable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newSingletonLabel", argTypes, term27697, args);
    }

};


