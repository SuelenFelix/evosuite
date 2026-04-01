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

public class ModuleAnalysis_attachActiveOnFocus_75096264137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27711;

    public ModuleAnalysis_attachActiveOnFocus_75096264137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27711 = newInstance(Class.forName("core.module.ModuleAnalysis"));
        setField(term27711, term27711.getClass(), "APlusLabel", null);
        setField(term27711, term27711.getClass(), "ANeutralLabel", null);
        setField(term27711, term27711.getClass(), "AMinusLabel", null);
        setField(term27711, term27711.getClass(), "BPlusLabel", null);
        setField(term27711, term27711.getClass(), "BNeutralLabel", null);
        setField(term27711, term27711.getClass(), "BMinusLabel", null);
        setField(term27711, term27711.getClass(), "CPlusLabel", null);
        setField(term27711, term27711.getClass(), "CNeutralLabel", null);
        setField(term27711, term27711.getClass(), "CMinusLabel", null);
        setField(term27711, term27711.getClass(), "DLabel", null);
        setField(term27711, term27711.getClass(), "FLabel", null);
        setField(term27711, term27711.getClass(), "highestScoreLabel", null);
        setField(term27711, term27711.getClass(), "lowestScoreLabel", null);
        setField(term27711, term27711.getClass(), "highestMajorScoreLabel", null);
        setField(term27711, term27711.getClass(), "lowestMajorScoreLabel", null);
        setField(term27711, term27711.getClass(), "highestMinorScoreLabel", null);
        setField(term27711, term27711.getClass(), "lowestMinorScoreLabel", null);
        setField(term27711, term27711.getClass(), "highestDERScoreLabel", null);
        setField(term27711, term27711.getClass(), "lowestDERScoreLabel", null);
        setField(term27711, term27711.getClass(), "highestGERScoreLabel", null);
        setField(term27711, term27711.getClass(), "lowestGERScoreLabel", null);
        setField(term27711, term27711.getClass(), "majorsLabel", null);
        setField(term27711, term27711.getClass(), "minorsLabel", null);
        setField(term27711, term27711.getClass(), "DERsLabel", null);
        setField(term27711, term27711.getClass(), "GERsLabel", null);
        setField(term27711, term27711.getClass(), "unclassifiedListLabel", null);
        setField(term27711, term27711.getClass(), "allModulesLabel", null);
        setField(term27711, term27711.getClass(), "APlusList", null);
        setField(term27711, term27711.getClass(), "ANeutralList", null);
        setField(term27711, term27711.getClass(), "AMinusList", null);
        setField(term27711, term27711.getClass(), "BPlusList", null);
        setField(term27711, term27711.getClass(), "BNeutralList", null);
        setField(term27711, term27711.getClass(), "BMinusList", null);
        setField(term27711, term27711.getClass(), "CPlusList", null);
        setField(term27711, term27711.getClass(), "CNeutralList", null);
        setField(term27711, term27711.getClass(), "CMinusList", null);
        setField(term27711, term27711.getClass(), "DList", null);
        setField(term27711, term27711.getClass(), "FList", null);
        setField(term27711, term27711.getClass(), "majorsList", null);
        setField(term27711, term27711.getClass(), "minorsList", null);
        setField(term27711, term27711.getClass(), "DERList", null);
        setField(term27711, term27711.getClass(), "GERList", null);
        setField(term27711, term27711.getClass(), "unclassifiedList", null);
        setField(term27711, term27711.getClass(), "highestScoreCourse", null);
        setField(term27711, term27711.getClass(), "lowestScoreCourse", null);
        setField(term27711, term27711.getClass(), "highestMajorScoreCourse", null);
        setField(term27711, term27711.getClass(), "lowestMajorScoreCourse", null);
        setField(term27711, term27711.getClass(), "highestMinorScoreCourse", null);
        setField(term27711, term27711.getClass(), "lowestMinorScoreCourse", null);
        setField(term27711, term27711.getClass(), "highestDERScoreCourse", null);
        setField(term27711, term27711.getClass(), "lowestDERScoreCourse", null);
        setField(term27711, term27711.getClass(), "highestGERScoreCourse", null);
        setField(term27711, term27711.getClass(), "lowestGERScoreCourse", null);
        setField(term27711, term27711.getClass(), "cardLayout", null);
        setField(term27711, term27711.getClass(), "modulesBasement", null);
        setField(term27711, term27711.getClass(), "semestersBasement", null);
        setField(term27711, term27711.getClass(), "yearsBasement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("proto.KLabel");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "attachActiveOnFocus", argTypes, term27711, args);
    }

};


