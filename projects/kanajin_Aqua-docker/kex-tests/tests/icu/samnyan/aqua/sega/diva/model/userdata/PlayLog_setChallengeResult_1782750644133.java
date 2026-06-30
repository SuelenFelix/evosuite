package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PlayLog_setChallengeResult_1782750644133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356165;
     Object term356196;

    public PlayLog_setChallengeResult_1782750644133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356165 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term356165, term356165.getClass(), "id", 0L);
        setField(term356165, term356165.getClass(), "pdId", null);
        setIntField(term356165, term356165.getClass(), "pvId", 0);
        setField(term356165, term356165.getClass(), "difficulty", null);
        setField(term356165, term356165.getClass(), "edition", null);
        setIntField(term356165, term356165.getClass(), "scriptVer", 0);
        setIntField(term356165, term356165.getClass(), "score", 0);
        setField(term356165, term356165.getClass(), "challengeKind", null);
        setIntField(term356165, term356165.getClass(), "challengeResult", 0);
        setField(term356165, term356165.getClass(), "clearResult", null);
        setIntField(term356165, term356165.getClass(), "vp", 0);
        setIntField(term356165, term356165.getClass(), "coolCount", 0);
        setIntField(term356165, term356165.getClass(), "coolPercent", 0);
        setIntField(term356165, term356165.getClass(), "fineCount", 0);
        setIntField(term356165, term356165.getClass(), "finePercent", 0);
        setIntField(term356165, term356165.getClass(), "safeCount", 0);
        setIntField(term356165, term356165.getClass(), "safePercent", 0);
        setIntField(term356165, term356165.getClass(), "sadCount", 0);
        setIntField(term356165, term356165.getClass(), "sadPercent", 0);
        setIntField(term356165, term356165.getClass(), "wrongCount", 0);
        setIntField(term356165, term356165.getClass(), "wrongPercent", 0);
        setIntField(term356165, term356165.getClass(), "maxCombo", 0);
        setIntField(term356165, term356165.getClass(), "chanceTime", 0);
        setIntField(term356165, term356165.getClass(), "holdScore", 0);
        setIntField(term356165, term356165.getClass(), "attainPoint", 0);
        setIntField(term356165, term356165.getClass(), "skinId", 0);
        setIntField(term356165, term356165.getClass(), "buttonSe", 0);
        setIntField(term356165, term356165.getClass(), "buttonSeVol", 0);
        setIntField(term356165, term356165.getClass(), "sliderSe", 0);
        setIntField(term356165, term356165.getClass(), "ChainSlideSe", 0);
        setIntField(term356165, term356165.getClass(), "SliderTouchSe", 0);
        setField(term356165, term356165.getClass(), "modules", null);
        setIntField(term356165, term356165.getClass(), "stageCompletion", 0);
        setIntField(term356165, term356165.getClass(), "slideScore", 0);
        setIntField(term356165, term356165.getClass(), "isVocalChange", 0);
        setField(term356165, term356165.getClass(), "customizeItems", null);
        setField(term356165, term356165.getClass(), "rhythmGameOptions", null);
        setIntField(term356165, term356165.getClass(), "screenShotCount", 0);
        setField(term356165, term356165.getClass(), "dateTime", null);
        term356196 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term356196;
        callMethod(klass, "setChallengeResult", argTypes, term356165, args);
    }

};


