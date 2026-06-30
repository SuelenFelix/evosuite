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

public class PlayLog_setCoolCount_1598807962136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356262;
     Object term356293;

    public PlayLog_setCoolCount_1598807962136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356262 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term356262, term356262.getClass(), "id", 0L);
        setField(term356262, term356262.getClass(), "pdId", null);
        setIntField(term356262, term356262.getClass(), "pvId", 0);
        setField(term356262, term356262.getClass(), "difficulty", null);
        setField(term356262, term356262.getClass(), "edition", null);
        setIntField(term356262, term356262.getClass(), "scriptVer", 0);
        setIntField(term356262, term356262.getClass(), "score", 0);
        setField(term356262, term356262.getClass(), "challengeKind", null);
        setIntField(term356262, term356262.getClass(), "challengeResult", 0);
        setField(term356262, term356262.getClass(), "clearResult", null);
        setIntField(term356262, term356262.getClass(), "vp", 0);
        setIntField(term356262, term356262.getClass(), "coolCount", 0);
        setIntField(term356262, term356262.getClass(), "coolPercent", 0);
        setIntField(term356262, term356262.getClass(), "fineCount", 0);
        setIntField(term356262, term356262.getClass(), "finePercent", 0);
        setIntField(term356262, term356262.getClass(), "safeCount", 0);
        setIntField(term356262, term356262.getClass(), "safePercent", 0);
        setIntField(term356262, term356262.getClass(), "sadCount", 0);
        setIntField(term356262, term356262.getClass(), "sadPercent", 0);
        setIntField(term356262, term356262.getClass(), "wrongCount", 0);
        setIntField(term356262, term356262.getClass(), "wrongPercent", 0);
        setIntField(term356262, term356262.getClass(), "maxCombo", 0);
        setIntField(term356262, term356262.getClass(), "chanceTime", 0);
        setIntField(term356262, term356262.getClass(), "holdScore", 0);
        setIntField(term356262, term356262.getClass(), "attainPoint", 0);
        setIntField(term356262, term356262.getClass(), "skinId", 0);
        setIntField(term356262, term356262.getClass(), "buttonSe", 0);
        setIntField(term356262, term356262.getClass(), "buttonSeVol", 0);
        setIntField(term356262, term356262.getClass(), "sliderSe", 0);
        setIntField(term356262, term356262.getClass(), "ChainSlideSe", 0);
        setIntField(term356262, term356262.getClass(), "SliderTouchSe", 0);
        setField(term356262, term356262.getClass(), "modules", null);
        setIntField(term356262, term356262.getClass(), "stageCompletion", 0);
        setIntField(term356262, term356262.getClass(), "slideScore", 0);
        setIntField(term356262, term356262.getClass(), "isVocalChange", 0);
        setField(term356262, term356262.getClass(), "customizeItems", null);
        setField(term356262, term356262.getClass(), "rhythmGameOptions", null);
        setIntField(term356262, term356262.getClass(), "screenShotCount", 0);
        setField(term356262, term356262.getClass(), "dateTime", null);
        term356293 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term356293;
        callMethod(klass, "setCoolCount", argTypes, term356262, args);
    }

};


