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

public class PlayLog_setSliderSe_337601515153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356823;
     Object term356854;

    public PlayLog_setSliderSe_337601515153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356823 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term356823, term356823.getClass(), "id", 0L);
        setField(term356823, term356823.getClass(), "pdId", null);
        setIntField(term356823, term356823.getClass(), "pvId", 0);
        setField(term356823, term356823.getClass(), "difficulty", null);
        setField(term356823, term356823.getClass(), "edition", null);
        setIntField(term356823, term356823.getClass(), "scriptVer", 0);
        setIntField(term356823, term356823.getClass(), "score", 0);
        setField(term356823, term356823.getClass(), "challengeKind", null);
        setIntField(term356823, term356823.getClass(), "challengeResult", 0);
        setField(term356823, term356823.getClass(), "clearResult", null);
        setIntField(term356823, term356823.getClass(), "vp", 0);
        setIntField(term356823, term356823.getClass(), "coolCount", 0);
        setIntField(term356823, term356823.getClass(), "coolPercent", 0);
        setIntField(term356823, term356823.getClass(), "fineCount", 0);
        setIntField(term356823, term356823.getClass(), "finePercent", 0);
        setIntField(term356823, term356823.getClass(), "safeCount", 0);
        setIntField(term356823, term356823.getClass(), "safePercent", 0);
        setIntField(term356823, term356823.getClass(), "sadCount", 0);
        setIntField(term356823, term356823.getClass(), "sadPercent", 0);
        setIntField(term356823, term356823.getClass(), "wrongCount", 0);
        setIntField(term356823, term356823.getClass(), "wrongPercent", 0);
        setIntField(term356823, term356823.getClass(), "maxCombo", 0);
        setIntField(term356823, term356823.getClass(), "chanceTime", 0);
        setIntField(term356823, term356823.getClass(), "holdScore", 0);
        setIntField(term356823, term356823.getClass(), "attainPoint", 0);
        setIntField(term356823, term356823.getClass(), "skinId", 0);
        setIntField(term356823, term356823.getClass(), "buttonSe", 0);
        setIntField(term356823, term356823.getClass(), "buttonSeVol", 0);
        setIntField(term356823, term356823.getClass(), "sliderSe", 0);
        setIntField(term356823, term356823.getClass(), "ChainSlideSe", 0);
        setIntField(term356823, term356823.getClass(), "SliderTouchSe", 0);
        setField(term356823, term356823.getClass(), "modules", null);
        setIntField(term356823, term356823.getClass(), "stageCompletion", 0);
        setIntField(term356823, term356823.getClass(), "slideScore", 0);
        setIntField(term356823, term356823.getClass(), "isVocalChange", 0);
        setField(term356823, term356823.getClass(), "customizeItems", null);
        setField(term356823, term356823.getClass(), "rhythmGameOptions", null);
        setIntField(term356823, term356823.getClass(), "screenShotCount", 0);
        setField(term356823, term356823.getClass(), "dateTime", null);
        term356854 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term356854;
        callMethod(klass, "setSliderSe", argTypes, term356823, args);
    }

};


