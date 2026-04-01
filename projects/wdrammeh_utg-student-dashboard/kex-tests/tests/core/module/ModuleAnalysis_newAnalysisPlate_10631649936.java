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

public class ModuleAnalysis_newAnalysisPlate_10631649936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27710;

    public ModuleAnalysis_newAnalysisPlate_10631649936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27710 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27710, term27710.getClass(), "APlusLabel", null);
        setField(term27710, term27710.getClass(), "ANeutralLabel", null);
        setField(term27710, term27710.getClass(), "AMinusLabel", null);
        setField(term27710, term27710.getClass(), "BPlusLabel", null);
        setField(term27710, term27710.getClass(), "BNeutralLabel", null);
        setField(term27710, term27710.getClass(), "BMinusLabel", null);
        setField(term27710, term27710.getClass(), "CPlusLabel", null);
        setField(term27710, term27710.getClass(), "CNeutralLabel", null);
        setField(term27710, term27710.getClass(), "CMinusLabel", null);
        setField(term27710, term27710.getClass(), "DLabel", null);
        setField(term27710, term27710.getClass(), "FLabel", null);
        setField(term27710, term27710.getClass(), "highestScoreLabel", null);
        setField(term27710, term27710.getClass(), "lowestScoreLabel", null);
        setField(term27710, term27710.getClass(), "highestMajorScoreLabel", null);
        setField(term27710, term27710.getClass(), "lowestMajorScoreLabel", null);
        setField(term27710, term27710.getClass(), "highestMinorScoreLabel", null);
        setField(term27710, term27710.getClass(), "lowestMinorScoreLabel", null);
        setField(term27710, term27710.getClass(), "highestDERScoreLabel", null);
        setField(term27710, term27710.getClass(), "lowestDERScoreLabel", null);
        setField(term27710, term27710.getClass(), "highestGERScoreLabel", null);
        setField(term27710, term27710.getClass(), "lowestGERScoreLabel", null);
        setField(term27710, term27710.getClass(), "majorsLabel", null);
        setField(term27710, term27710.getClass(), "minorsLabel", null);
        setField(term27710, term27710.getClass(), "DERsLabel", null);
        setField(term27710, term27710.getClass(), "GERsLabel", null);
        setField(term27710, term27710.getClass(), "unclassifiedListLabel", null);
        setField(term27710, term27710.getClass(), "allModulesLabel", null);
        setField(term27710, term27710.getClass(), "APlusList", null);
        setField(term27710, term27710.getClass(), "ANeutralList", null);
        setField(term27710, term27710.getClass(), "AMinusList", null);
        setField(term27710, term27710.getClass(), "BPlusList", null);
        setField(term27710, term27710.getClass(), "BNeutralList", null);
        setField(term27710, term27710.getClass(), "BMinusList", null);
        setField(term27710, term27710.getClass(), "CPlusList", null);
        setField(term27710, term27710.getClass(), "CNeutralList", null);
        setField(term27710, term27710.getClass(), "CMinusList", null);
        setField(term27710, term27710.getClass(), "DList", null);
        setField(term27710, term27710.getClass(), "FList", null);
        setField(term27710, term27710.getClass(), "majorsList", null);
        setField(term27710, term27710.getClass(), "minorsList", null);
        setField(term27710, term27710.getClass(), "DERList", null);
        setField(term27710, term27710.getClass(), "GERList", null);
        setField(term27710, term27710.getClass(), "unclassifiedList", null);
        setField(term27710, term27710.getClass(), "highestScoreCourse", null);
        setField(term27710, term27710.getClass(), "lowestScoreCourse", null);
        setField(term27710, term27710.getClass(), "highestMajorScoreCourse", null);
        setField(term27710, term27710.getClass(), "lowestMajorScoreCourse", null);
        setField(term27710, term27710.getClass(), "highestMinorScoreCourse", null);
        setField(term27710, term27710.getClass(), "lowestMinorScoreCourse", null);
        setField(term27710, term27710.getClass(), "highestDERScoreCourse", null);
        setField(term27710, term27710.getClass(), "lowestDERScoreCourse", null);
        setField(term27710, term27710.getClass(), "highestGERScoreCourse", null);
        setField(term27710, term27710.getClass(), "lowestGERScoreCourse", null);
        setField(term27710, term27710.getClass(), "cardLayout", null);
        setField(term27710, term27710.getClass(), "modulesBasement", null);
        setField(term27710, term27710.getClass(), "semestersBasement", null);
        setField(term27710, term27710.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("proto.KLabel");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "newAnalysisPlate", argTypes, term27710, args);
    }

};


