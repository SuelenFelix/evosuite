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

public class ModuleAnalysis_getProperValueText_74027227734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27708;

    public ModuleAnalysis_getProperValueText_74027227734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27708 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27708, term27708.getClass(), "APlusLabel", null);
        setField(term27708, term27708.getClass(), "ANeutralLabel", null);
        setField(term27708, term27708.getClass(), "AMinusLabel", null);
        setField(term27708, term27708.getClass(), "BPlusLabel", null);
        setField(term27708, term27708.getClass(), "BNeutralLabel", null);
        setField(term27708, term27708.getClass(), "BMinusLabel", null);
        setField(term27708, term27708.getClass(), "CPlusLabel", null);
        setField(term27708, term27708.getClass(), "CNeutralLabel", null);
        setField(term27708, term27708.getClass(), "CMinusLabel", null);
        setField(term27708, term27708.getClass(), "DLabel", null);
        setField(term27708, term27708.getClass(), "FLabel", null);
        setField(term27708, term27708.getClass(), "highestScoreLabel", null);
        setField(term27708, term27708.getClass(), "lowestScoreLabel", null);
        setField(term27708, term27708.getClass(), "highestMajorScoreLabel", null);
        setField(term27708, term27708.getClass(), "lowestMajorScoreLabel", null);
        setField(term27708, term27708.getClass(), "highestMinorScoreLabel", null);
        setField(term27708, term27708.getClass(), "lowestMinorScoreLabel", null);
        setField(term27708, term27708.getClass(), "highestDERScoreLabel", null);
        setField(term27708, term27708.getClass(), "lowestDERScoreLabel", null);
        setField(term27708, term27708.getClass(), "highestGERScoreLabel", null);
        setField(term27708, term27708.getClass(), "lowestGERScoreLabel", null);
        setField(term27708, term27708.getClass(), "majorsLabel", null);
        setField(term27708, term27708.getClass(), "minorsLabel", null);
        setField(term27708, term27708.getClass(), "DERsLabel", null);
        setField(term27708, term27708.getClass(), "GERsLabel", null);
        setField(term27708, term27708.getClass(), "unclassifiedListLabel", null);
        setField(term27708, term27708.getClass(), "allModulesLabel", null);
        setField(term27708, term27708.getClass(), "APlusList", null);
        setField(term27708, term27708.getClass(), "ANeutralList", null);
        setField(term27708, term27708.getClass(), "AMinusList", null);
        setField(term27708, term27708.getClass(), "BPlusList", null);
        setField(term27708, term27708.getClass(), "BNeutralList", null);
        setField(term27708, term27708.getClass(), "BMinusList", null);
        setField(term27708, term27708.getClass(), "CPlusList", null);
        setField(term27708, term27708.getClass(), "CNeutralList", null);
        setField(term27708, term27708.getClass(), "CMinusList", null);
        setField(term27708, term27708.getClass(), "DList", null);
        setField(term27708, term27708.getClass(), "FList", null);
        setField(term27708, term27708.getClass(), "majorsList", null);
        setField(term27708, term27708.getClass(), "minorsList", null);
        setField(term27708, term27708.getClass(), "DERList", null);
        setField(term27708, term27708.getClass(), "GERList", null);
        setField(term27708, term27708.getClass(), "unclassifiedList", null);
        setField(term27708, term27708.getClass(), "highestScoreCourse", null);
        setField(term27708, term27708.getClass(), "lowestScoreCourse", null);
        setField(term27708, term27708.getClass(), "highestMajorScoreCourse", null);
        setField(term27708, term27708.getClass(), "lowestMajorScoreCourse", null);
        setField(term27708, term27708.getClass(), "highestMinorScoreCourse", null);
        setField(term27708, term27708.getClass(), "lowestMinorScoreCourse", null);
        setField(term27708, term27708.getClass(), "highestDERScoreCourse", null);
        setField(term27708, term27708.getClass(), "lowestDERScoreCourse", null);
        setField(term27708, term27708.getClass(), "highestGERScoreCourse", null);
        setField(term27708, term27708.getClass(), "lowestGERScoreCourse", null);
        setField(term27708, term27708.getClass(), "cardLayout", null);
        setField(term27708, term27708.getClass(), "modulesBasement", null);
        setField(term27708, term27708.getClass(), "semestersBasement", null);
        setField(term27708, term27708.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getProperValueText", argTypes, term27708, args);
    }

};


