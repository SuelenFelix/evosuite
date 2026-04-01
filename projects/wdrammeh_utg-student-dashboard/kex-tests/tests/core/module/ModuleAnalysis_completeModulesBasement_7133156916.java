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

public class ModuleAnalysis_completeModulesBasement_7133156916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7063;

    public ModuleAnalysis_completeModulesBasement_7133156916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7063 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term7063, term7063.getClass(), "APlusLabel", null);
        setField(term7063, term7063.getClass(), "ANeutralLabel", null);
        setField(term7063, term7063.getClass(), "AMinusLabel", null);
        setField(term7063, term7063.getClass(), "BPlusLabel", null);
        setField(term7063, term7063.getClass(), "BNeutralLabel", null);
        setField(term7063, term7063.getClass(), "BMinusLabel", null);
        setField(term7063, term7063.getClass(), "CPlusLabel", null);
        setField(term7063, term7063.getClass(), "CNeutralLabel", null);
        setField(term7063, term7063.getClass(), "CMinusLabel", null);
        setField(term7063, term7063.getClass(), "DLabel", null);
        setField(term7063, term7063.getClass(), "FLabel", null);
        setField(term7063, term7063.getClass(), "highestScoreLabel", null);
        setField(term7063, term7063.getClass(), "lowestScoreLabel", null);
        setField(term7063, term7063.getClass(), "highestMajorScoreLabel", null);
        setField(term7063, term7063.getClass(), "lowestMajorScoreLabel", null);
        setField(term7063, term7063.getClass(), "highestMinorScoreLabel", null);
        setField(term7063, term7063.getClass(), "lowestMinorScoreLabel", null);
        setField(term7063, term7063.getClass(), "highestDERScoreLabel", null);
        setField(term7063, term7063.getClass(), "lowestDERScoreLabel", null);
        setField(term7063, term7063.getClass(), "highestGERScoreLabel", null);
        setField(term7063, term7063.getClass(), "lowestGERScoreLabel", null);
        setField(term7063, term7063.getClass(), "majorsLabel", null);
        setField(term7063, term7063.getClass(), "minorsLabel", null);
        setField(term7063, term7063.getClass(), "DERsLabel", null);
        setField(term7063, term7063.getClass(), "GERsLabel", null);
        setField(term7063, term7063.getClass(), "unclassifiedListLabel", null);
        setField(term7063, term7063.getClass(), "allModulesLabel", null);
        setField(term7063, term7063.getClass(), "APlusList", null);
        setField(term7063, term7063.getClass(), "ANeutralList", null);
        setField(term7063, term7063.getClass(), "AMinusList", null);
        setField(term7063, term7063.getClass(), "BPlusList", null);
        setField(term7063, term7063.getClass(), "BNeutralList", null);
        setField(term7063, term7063.getClass(), "BMinusList", null);
        setField(term7063, term7063.getClass(), "CPlusList", null);
        setField(term7063, term7063.getClass(), "CNeutralList", null);
        setField(term7063, term7063.getClass(), "CMinusList", null);
        setField(term7063, term7063.getClass(), "DList", null);
        setField(term7063, term7063.getClass(), "FList", null);
        setField(term7063, term7063.getClass(), "majorsList", null);
        setField(term7063, term7063.getClass(), "minorsList", null);
        setField(term7063, term7063.getClass(), "DERList", null);
        setField(term7063, term7063.getClass(), "GERList", null);
        setField(term7063, term7063.getClass(), "unclassifiedList", null);
        setField(term7063, term7063.getClass(), "highestScoreCourse", null);
        setField(term7063, term7063.getClass(), "lowestScoreCourse", null);
        setField(term7063, term7063.getClass(), "highestMajorScoreCourse", null);
        setField(term7063, term7063.getClass(), "lowestMajorScoreCourse", null);
        setField(term7063, term7063.getClass(), "highestMinorScoreCourse", null);
        setField(term7063, term7063.getClass(), "lowestMinorScoreCourse", null);
        setField(term7063, term7063.getClass(), "highestDERScoreCourse", null);
        setField(term7063, term7063.getClass(), "lowestDERScoreCourse", null);
        setField(term7063, term7063.getClass(), "highestGERScoreCourse", null);
        setField(term7063, term7063.getClass(), "lowestGERScoreCourse", null);
        setField(term7063, term7063.getClass(), "cardLayout", null);
        setField(term7063, term7063.getClass(), "modulesBasement", null);
        setField(term7063, term7063.getClass(), "semestersBasement", null);
        setField(term7063, term7063.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "completeModulesBasement", argTypes, term7063, args);
    }

};


