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

public class ModuleAnalysis_completeModulesBasement_71331569126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27698;

    public ModuleAnalysis_completeModulesBasement_71331569126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27698 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27698, term27698.getClass(), "APlusLabel", null);
        setField(term27698, term27698.getClass(), "ANeutralLabel", null);
        setField(term27698, term27698.getClass(), "AMinusLabel", null);
        setField(term27698, term27698.getClass(), "BPlusLabel", null);
        setField(term27698, term27698.getClass(), "BNeutralLabel", null);
        setField(term27698, term27698.getClass(), "BMinusLabel", null);
        setField(term27698, term27698.getClass(), "CPlusLabel", null);
        setField(term27698, term27698.getClass(), "CNeutralLabel", null);
        setField(term27698, term27698.getClass(), "CMinusLabel", null);
        setField(term27698, term27698.getClass(), "DLabel", null);
        setField(term27698, term27698.getClass(), "FLabel", null);
        setField(term27698, term27698.getClass(), "highestScoreLabel", null);
        setField(term27698, term27698.getClass(), "lowestScoreLabel", null);
        setField(term27698, term27698.getClass(), "highestMajorScoreLabel", null);
        setField(term27698, term27698.getClass(), "lowestMajorScoreLabel", null);
        setField(term27698, term27698.getClass(), "highestMinorScoreLabel", null);
        setField(term27698, term27698.getClass(), "lowestMinorScoreLabel", null);
        setField(term27698, term27698.getClass(), "highestDERScoreLabel", null);
        setField(term27698, term27698.getClass(), "lowestDERScoreLabel", null);
        setField(term27698, term27698.getClass(), "highestGERScoreLabel", null);
        setField(term27698, term27698.getClass(), "lowestGERScoreLabel", null);
        setField(term27698, term27698.getClass(), "majorsLabel", null);
        setField(term27698, term27698.getClass(), "minorsLabel", null);
        setField(term27698, term27698.getClass(), "DERsLabel", null);
        setField(term27698, term27698.getClass(), "GERsLabel", null);
        setField(term27698, term27698.getClass(), "unclassifiedListLabel", null);
        setField(term27698, term27698.getClass(), "allModulesLabel", null);
        setField(term27698, term27698.getClass(), "APlusList", null);
        setField(term27698, term27698.getClass(), "ANeutralList", null);
        setField(term27698, term27698.getClass(), "AMinusList", null);
        setField(term27698, term27698.getClass(), "BPlusList", null);
        setField(term27698, term27698.getClass(), "BNeutralList", null);
        setField(term27698, term27698.getClass(), "BMinusList", null);
        setField(term27698, term27698.getClass(), "CPlusList", null);
        setField(term27698, term27698.getClass(), "CNeutralList", null);
        setField(term27698, term27698.getClass(), "CMinusList", null);
        setField(term27698, term27698.getClass(), "DList", null);
        setField(term27698, term27698.getClass(), "FList", null);
        setField(term27698, term27698.getClass(), "majorsList", null);
        setField(term27698, term27698.getClass(), "minorsList", null);
        setField(term27698, term27698.getClass(), "DERList", null);
        setField(term27698, term27698.getClass(), "GERList", null);
        setField(term27698, term27698.getClass(), "unclassifiedList", null);
        setField(term27698, term27698.getClass(), "highestScoreCourse", null);
        setField(term27698, term27698.getClass(), "lowestScoreCourse", null);
        setField(term27698, term27698.getClass(), "highestMajorScoreCourse", null);
        setField(term27698, term27698.getClass(), "lowestMajorScoreCourse", null);
        setField(term27698, term27698.getClass(), "highestMinorScoreCourse", null);
        setField(term27698, term27698.getClass(), "lowestMinorScoreCourse", null);
        setField(term27698, term27698.getClass(), "highestDERScoreCourse", null);
        setField(term27698, term27698.getClass(), "lowestDERScoreCourse", null);
        setField(term27698, term27698.getClass(), "highestGERScoreCourse", null);
        setField(term27698, term27698.getClass(), "lowestGERScoreCourse", null);
        setField(term27698, term27698.getClass(), "cardLayout", null);
        setField(term27698, term27698.getClass(), "modulesBasement", null);
        setField(term27698, term27698.getClass(), "semestersBasement", null);
        setField(term27698, term27698.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "completeModulesBasement", argTypes, term27698, args);
    }

};


