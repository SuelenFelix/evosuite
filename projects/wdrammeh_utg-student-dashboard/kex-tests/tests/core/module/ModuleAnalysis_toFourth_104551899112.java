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
import java.lang.Double;

public class ModuleAnalysis_toFourth_104551899112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9837;
     Object term9838;

    public ModuleAnalysis_toFourth_104551899112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9837 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term9837, term9837.getClass(), "APlusLabel", null);
        setField(term9837, term9837.getClass(), "ANeutralLabel", null);
        setField(term9837, term9837.getClass(), "AMinusLabel", null);
        setField(term9837, term9837.getClass(), "BPlusLabel", null);
        setField(term9837, term9837.getClass(), "BNeutralLabel", null);
        setField(term9837, term9837.getClass(), "BMinusLabel", null);
        setField(term9837, term9837.getClass(), "CPlusLabel", null);
        setField(term9837, term9837.getClass(), "CNeutralLabel", null);
        setField(term9837, term9837.getClass(), "CMinusLabel", null);
        setField(term9837, term9837.getClass(), "DLabel", null);
        setField(term9837, term9837.getClass(), "FLabel", null);
        setField(term9837, term9837.getClass(), "highestScoreLabel", null);
        setField(term9837, term9837.getClass(), "lowestScoreLabel", null);
        setField(term9837, term9837.getClass(), "highestMajorScoreLabel", null);
        setField(term9837, term9837.getClass(), "lowestMajorScoreLabel", null);
        setField(term9837, term9837.getClass(), "highestMinorScoreLabel", null);
        setField(term9837, term9837.getClass(), "lowestMinorScoreLabel", null);
        setField(term9837, term9837.getClass(), "highestDERScoreLabel", null);
        setField(term9837, term9837.getClass(), "lowestDERScoreLabel", null);
        setField(term9837, term9837.getClass(), "highestGERScoreLabel", null);
        setField(term9837, term9837.getClass(), "lowestGERScoreLabel", null);
        setField(term9837, term9837.getClass(), "majorsLabel", null);
        setField(term9837, term9837.getClass(), "minorsLabel", null);
        setField(term9837, term9837.getClass(), "DERsLabel", null);
        setField(term9837, term9837.getClass(), "GERsLabel", null);
        setField(term9837, term9837.getClass(), "unclassifiedListLabel", null);
        setField(term9837, term9837.getClass(), "allModulesLabel", null);
        setField(term9837, term9837.getClass(), "APlusList", null);
        setField(term9837, term9837.getClass(), "ANeutralList", null);
        setField(term9837, term9837.getClass(), "AMinusList", null);
        setField(term9837, term9837.getClass(), "BPlusList", null);
        setField(term9837, term9837.getClass(), "BNeutralList", null);
        setField(term9837, term9837.getClass(), "BMinusList", null);
        setField(term9837, term9837.getClass(), "CPlusList", null);
        setField(term9837, term9837.getClass(), "CNeutralList", null);
        setField(term9837, term9837.getClass(), "CMinusList", null);
        setField(term9837, term9837.getClass(), "DList", null);
        setField(term9837, term9837.getClass(), "FList", null);
        setField(term9837, term9837.getClass(), "majorsList", null);
        setField(term9837, term9837.getClass(), "minorsList", null);
        setField(term9837, term9837.getClass(), "DERList", null);
        setField(term9837, term9837.getClass(), "GERList", null);
        setField(term9837, term9837.getClass(), "unclassifiedList", null);
        setField(term9837, term9837.getClass(), "highestScoreCourse", null);
        setField(term9837, term9837.getClass(), "lowestScoreCourse", null);
        setField(term9837, term9837.getClass(), "highestMajorScoreCourse", null);
        setField(term9837, term9837.getClass(), "lowestMajorScoreCourse", null);
        setField(term9837, term9837.getClass(), "highestMinorScoreCourse", null);
        setField(term9837, term9837.getClass(), "lowestMinorScoreCourse", null);
        setField(term9837, term9837.getClass(), "highestDERScoreCourse", null);
        setField(term9837, term9837.getClass(), "lowestDERScoreCourse", null);
        setField(term9837, term9837.getClass(), "highestGERScoreCourse", null);
        setField(term9837, term9837.getClass(), "lowestGERScoreCourse", null);
        setField(term9837, term9837.getClass(), "cardLayout", null);
        setField(term9837, term9837.getClass(), "modulesBasement", null);
        setField(term9837, term9837.getClass(), "semestersBasement", null);
        setField(term9837, term9837.getClass(), "yearsBasement", null);
        term9838 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9838;
        callMethod(klass, "toFourth", argTypes, term9837, args);
    }

};


