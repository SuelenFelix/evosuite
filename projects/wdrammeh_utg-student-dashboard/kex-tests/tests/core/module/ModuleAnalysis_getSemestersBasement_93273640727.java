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

public class ModuleAnalysis_getSemestersBasement_93273640727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27699;

    public ModuleAnalysis_getSemestersBasement_93273640727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27699 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27699, term27699.getClass(), "APlusLabel", null);
        setField(term27699, term27699.getClass(), "ANeutralLabel", null);
        setField(term27699, term27699.getClass(), "AMinusLabel", null);
        setField(term27699, term27699.getClass(), "BPlusLabel", null);
        setField(term27699, term27699.getClass(), "BNeutralLabel", null);
        setField(term27699, term27699.getClass(), "BMinusLabel", null);
        setField(term27699, term27699.getClass(), "CPlusLabel", null);
        setField(term27699, term27699.getClass(), "CNeutralLabel", null);
        setField(term27699, term27699.getClass(), "CMinusLabel", null);
        setField(term27699, term27699.getClass(), "DLabel", null);
        setField(term27699, term27699.getClass(), "FLabel", null);
        setField(term27699, term27699.getClass(), "highestScoreLabel", null);
        setField(term27699, term27699.getClass(), "lowestScoreLabel", null);
        setField(term27699, term27699.getClass(), "highestMajorScoreLabel", null);
        setField(term27699, term27699.getClass(), "lowestMajorScoreLabel", null);
        setField(term27699, term27699.getClass(), "highestMinorScoreLabel", null);
        setField(term27699, term27699.getClass(), "lowestMinorScoreLabel", null);
        setField(term27699, term27699.getClass(), "highestDERScoreLabel", null);
        setField(term27699, term27699.getClass(), "lowestDERScoreLabel", null);
        setField(term27699, term27699.getClass(), "highestGERScoreLabel", null);
        setField(term27699, term27699.getClass(), "lowestGERScoreLabel", null);
        setField(term27699, term27699.getClass(), "majorsLabel", null);
        setField(term27699, term27699.getClass(), "minorsLabel", null);
        setField(term27699, term27699.getClass(), "DERsLabel", null);
        setField(term27699, term27699.getClass(), "GERsLabel", null);
        setField(term27699, term27699.getClass(), "unclassifiedListLabel", null);
        setField(term27699, term27699.getClass(), "allModulesLabel", null);
        setField(term27699, term27699.getClass(), "APlusList", null);
        setField(term27699, term27699.getClass(), "ANeutralList", null);
        setField(term27699, term27699.getClass(), "AMinusList", null);
        setField(term27699, term27699.getClass(), "BPlusList", null);
        setField(term27699, term27699.getClass(), "BNeutralList", null);
        setField(term27699, term27699.getClass(), "BMinusList", null);
        setField(term27699, term27699.getClass(), "CPlusList", null);
        setField(term27699, term27699.getClass(), "CNeutralList", null);
        setField(term27699, term27699.getClass(), "CMinusList", null);
        setField(term27699, term27699.getClass(), "DList", null);
        setField(term27699, term27699.getClass(), "FList", null);
        setField(term27699, term27699.getClass(), "majorsList", null);
        setField(term27699, term27699.getClass(), "minorsList", null);
        setField(term27699, term27699.getClass(), "DERList", null);
        setField(term27699, term27699.getClass(), "GERList", null);
        setField(term27699, term27699.getClass(), "unclassifiedList", null);
        setField(term27699, term27699.getClass(), "highestScoreCourse", null);
        setField(term27699, term27699.getClass(), "lowestScoreCourse", null);
        setField(term27699, term27699.getClass(), "highestMajorScoreCourse", null);
        setField(term27699, term27699.getClass(), "lowestMajorScoreCourse", null);
        setField(term27699, term27699.getClass(), "highestMinorScoreCourse", null);
        setField(term27699, term27699.getClass(), "lowestMinorScoreCourse", null);
        setField(term27699, term27699.getClass(), "highestDERScoreCourse", null);
        setField(term27699, term27699.getClass(), "lowestDERScoreCourse", null);
        setField(term27699, term27699.getClass(), "highestGERScoreCourse", null);
        setField(term27699, term27699.getClass(), "lowestGERScoreCourse", null);
        setField(term27699, term27699.getClass(), "cardLayout", null);
        setField(term27699, term27699.getClass(), "modulesBasement", null);
        setField(term27699, term27699.getClass(), "semestersBasement", null);
        setField(term27699, term27699.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSemestersBasement", argTypes, term27699, args);
    }

};


