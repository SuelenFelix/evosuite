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

public class ModuleAnalysis_getProperValueText_198653125233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27707;

    public ModuleAnalysis_getProperValueText_198653125233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27707 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27707, term27707.getClass(), "APlusLabel", null);
        setField(term27707, term27707.getClass(), "ANeutralLabel", null);
        setField(term27707, term27707.getClass(), "AMinusLabel", null);
        setField(term27707, term27707.getClass(), "BPlusLabel", null);
        setField(term27707, term27707.getClass(), "BNeutralLabel", null);
        setField(term27707, term27707.getClass(), "BMinusLabel", null);
        setField(term27707, term27707.getClass(), "CPlusLabel", null);
        setField(term27707, term27707.getClass(), "CNeutralLabel", null);
        setField(term27707, term27707.getClass(), "CMinusLabel", null);
        setField(term27707, term27707.getClass(), "DLabel", null);
        setField(term27707, term27707.getClass(), "FLabel", null);
        setField(term27707, term27707.getClass(), "highestScoreLabel", null);
        setField(term27707, term27707.getClass(), "lowestScoreLabel", null);
        setField(term27707, term27707.getClass(), "highestMajorScoreLabel", null);
        setField(term27707, term27707.getClass(), "lowestMajorScoreLabel", null);
        setField(term27707, term27707.getClass(), "highestMinorScoreLabel", null);
        setField(term27707, term27707.getClass(), "lowestMinorScoreLabel", null);
        setField(term27707, term27707.getClass(), "highestDERScoreLabel", null);
        setField(term27707, term27707.getClass(), "lowestDERScoreLabel", null);
        setField(term27707, term27707.getClass(), "highestGERScoreLabel", null);
        setField(term27707, term27707.getClass(), "lowestGERScoreLabel", null);
        setField(term27707, term27707.getClass(), "majorsLabel", null);
        setField(term27707, term27707.getClass(), "minorsLabel", null);
        setField(term27707, term27707.getClass(), "DERsLabel", null);
        setField(term27707, term27707.getClass(), "GERsLabel", null);
        setField(term27707, term27707.getClass(), "unclassifiedListLabel", null);
        setField(term27707, term27707.getClass(), "allModulesLabel", null);
        setField(term27707, term27707.getClass(), "APlusList", null);
        setField(term27707, term27707.getClass(), "ANeutralList", null);
        setField(term27707, term27707.getClass(), "AMinusList", null);
        setField(term27707, term27707.getClass(), "BPlusList", null);
        setField(term27707, term27707.getClass(), "BNeutralList", null);
        setField(term27707, term27707.getClass(), "BMinusList", null);
        setField(term27707, term27707.getClass(), "CPlusList", null);
        setField(term27707, term27707.getClass(), "CNeutralList", null);
        setField(term27707, term27707.getClass(), "CMinusList", null);
        setField(term27707, term27707.getClass(), "DList", null);
        setField(term27707, term27707.getClass(), "FList", null);
        setField(term27707, term27707.getClass(), "majorsList", null);
        setField(term27707, term27707.getClass(), "minorsList", null);
        setField(term27707, term27707.getClass(), "DERList", null);
        setField(term27707, term27707.getClass(), "GERList", null);
        setField(term27707, term27707.getClass(), "unclassifiedList", null);
        setField(term27707, term27707.getClass(), "highestScoreCourse", null);
        setField(term27707, term27707.getClass(), "lowestScoreCourse", null);
        setField(term27707, term27707.getClass(), "highestMajorScoreCourse", null);
        setField(term27707, term27707.getClass(), "lowestMajorScoreCourse", null);
        setField(term27707, term27707.getClass(), "highestMinorScoreCourse", null);
        setField(term27707, term27707.getClass(), "lowestMinorScoreCourse", null);
        setField(term27707, term27707.getClass(), "highestDERScoreCourse", null);
        setField(term27707, term27707.getClass(), "lowestDERScoreCourse", null);
        setField(term27707, term27707.getClass(), "highestGERScoreCourse", null);
        setField(term27707, term27707.getClass(), "lowestGERScoreCourse", null);
        setField(term27707, term27707.getClass(), "cardLayout", null);
        setField(term27707, term27707.getClass(), "modulesBasement", null);
        setField(term27707, term27707.getClass(), "semestersBasement", null);
        setField(term27707, term27707.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getProperValueText", argTypes, term27707, args);
    }

};


