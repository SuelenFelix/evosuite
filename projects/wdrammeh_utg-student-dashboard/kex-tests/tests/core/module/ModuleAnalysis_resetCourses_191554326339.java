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

public class ModuleAnalysis_resetCourses_191554326339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27713;

    public ModuleAnalysis_resetCourses_191554326339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27713 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27713, term27713.getClass(), "APlusLabel", null);
        setField(term27713, term27713.getClass(), "ANeutralLabel", null);
        setField(term27713, term27713.getClass(), "AMinusLabel", null);
        setField(term27713, term27713.getClass(), "BPlusLabel", null);
        setField(term27713, term27713.getClass(), "BNeutralLabel", null);
        setField(term27713, term27713.getClass(), "BMinusLabel", null);
        setField(term27713, term27713.getClass(), "CPlusLabel", null);
        setField(term27713, term27713.getClass(), "CNeutralLabel", null);
        setField(term27713, term27713.getClass(), "CMinusLabel", null);
        setField(term27713, term27713.getClass(), "DLabel", null);
        setField(term27713, term27713.getClass(), "FLabel", null);
        setField(term27713, term27713.getClass(), "highestScoreLabel", null);
        setField(term27713, term27713.getClass(), "lowestScoreLabel", null);
        setField(term27713, term27713.getClass(), "highestMajorScoreLabel", null);
        setField(term27713, term27713.getClass(), "lowestMajorScoreLabel", null);
        setField(term27713, term27713.getClass(), "highestMinorScoreLabel", null);
        setField(term27713, term27713.getClass(), "lowestMinorScoreLabel", null);
        setField(term27713, term27713.getClass(), "highestDERScoreLabel", null);
        setField(term27713, term27713.getClass(), "lowestDERScoreLabel", null);
        setField(term27713, term27713.getClass(), "highestGERScoreLabel", null);
        setField(term27713, term27713.getClass(), "lowestGERScoreLabel", null);
        setField(term27713, term27713.getClass(), "majorsLabel", null);
        setField(term27713, term27713.getClass(), "minorsLabel", null);
        setField(term27713, term27713.getClass(), "DERsLabel", null);
        setField(term27713, term27713.getClass(), "GERsLabel", null);
        setField(term27713, term27713.getClass(), "unclassifiedListLabel", null);
        setField(term27713, term27713.getClass(), "allModulesLabel", null);
        setField(term27713, term27713.getClass(), "APlusList", null);
        setField(term27713, term27713.getClass(), "ANeutralList", null);
        setField(term27713, term27713.getClass(), "AMinusList", null);
        setField(term27713, term27713.getClass(), "BPlusList", null);
        setField(term27713, term27713.getClass(), "BNeutralList", null);
        setField(term27713, term27713.getClass(), "BMinusList", null);
        setField(term27713, term27713.getClass(), "CPlusList", null);
        setField(term27713, term27713.getClass(), "CNeutralList", null);
        setField(term27713, term27713.getClass(), "CMinusList", null);
        setField(term27713, term27713.getClass(), "DList", null);
        setField(term27713, term27713.getClass(), "FList", null);
        setField(term27713, term27713.getClass(), "majorsList", null);
        setField(term27713, term27713.getClass(), "minorsList", null);
        setField(term27713, term27713.getClass(), "DERList", null);
        setField(term27713, term27713.getClass(), "GERList", null);
        setField(term27713, term27713.getClass(), "unclassifiedList", null);
        setField(term27713, term27713.getClass(), "highestScoreCourse", null);
        setField(term27713, term27713.getClass(), "lowestScoreCourse", null);
        setField(term27713, term27713.getClass(), "highestMajorScoreCourse", null);
        setField(term27713, term27713.getClass(), "lowestMajorScoreCourse", null);
        setField(term27713, term27713.getClass(), "highestMinorScoreCourse", null);
        setField(term27713, term27713.getClass(), "lowestMinorScoreCourse", null);
        setField(term27713, term27713.getClass(), "highestDERScoreCourse", null);
        setField(term27713, term27713.getClass(), "lowestDERScoreCourse", null);
        setField(term27713, term27713.getClass(), "highestGERScoreCourse", null);
        setField(term27713, term27713.getClass(), "lowestGERScoreCourse", null);
        setField(term27713, term27713.getClass(), "cardLayout", null);
        setField(term27713, term27713.getClass(), "modulesBasement", null);
        setField(term27713, term27713.getClass(), "semestersBasement", null);
        setField(term27713, term27713.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetCourses", argTypes, term27713, args);
    }

};


