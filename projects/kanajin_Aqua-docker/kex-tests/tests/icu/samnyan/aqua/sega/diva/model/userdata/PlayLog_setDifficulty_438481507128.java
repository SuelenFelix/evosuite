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

public class PlayLog_setDifficulty_438481507128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356006;

    public PlayLog_setDifficulty_438481507128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356006 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term356006, term356006.getClass(), "id", 0L);
        setField(term356006, term356006.getClass(), "pdId", null);
        setIntField(term356006, term356006.getClass(), "pvId", 0);
        setField(term356006, term356006.getClass(), "difficulty", null);
        setField(term356006, term356006.getClass(), "edition", null);
        setIntField(term356006, term356006.getClass(), "scriptVer", 0);
        setIntField(term356006, term356006.getClass(), "score", 0);
        setField(term356006, term356006.getClass(), "challengeKind", null);
        setIntField(term356006, term356006.getClass(), "challengeResult", 0);
        setField(term356006, term356006.getClass(), "clearResult", null);
        setIntField(term356006, term356006.getClass(), "vp", 0);
        setIntField(term356006, term356006.getClass(), "coolCount", 0);
        setIntField(term356006, term356006.getClass(), "coolPercent", 0);
        setIntField(term356006, term356006.getClass(), "fineCount", 0);
        setIntField(term356006, term356006.getClass(), "finePercent", 0);
        setIntField(term356006, term356006.getClass(), "safeCount", 0);
        setIntField(term356006, term356006.getClass(), "safePercent", 0);
        setIntField(term356006, term356006.getClass(), "sadCount", 0);
        setIntField(term356006, term356006.getClass(), "sadPercent", 0);
        setIntField(term356006, term356006.getClass(), "wrongCount", 0);
        setIntField(term356006, term356006.getClass(), "wrongPercent", 0);
        setIntField(term356006, term356006.getClass(), "maxCombo", 0);
        setIntField(term356006, term356006.getClass(), "chanceTime", 0);
        setIntField(term356006, term356006.getClass(), "holdScore", 0);
        setIntField(term356006, term356006.getClass(), "attainPoint", 0);
        setIntField(term356006, term356006.getClass(), "skinId", 0);
        setIntField(term356006, term356006.getClass(), "buttonSe", 0);
        setIntField(term356006, term356006.getClass(), "buttonSeVol", 0);
        setIntField(term356006, term356006.getClass(), "sliderSe", 0);
        setIntField(term356006, term356006.getClass(), "ChainSlideSe", 0);
        setIntField(term356006, term356006.getClass(), "SliderTouchSe", 0);
        setField(term356006, term356006.getClass(), "modules", null);
        setIntField(term356006, term356006.getClass(), "stageCompletion", 0);
        setIntField(term356006, term356006.getClass(), "slideScore", 0);
        setIntField(term356006, term356006.getClass(), "isVocalChange", 0);
        setField(term356006, term356006.getClass(), "customizeItems", null);
        setField(term356006, term356006.getClass(), "rhythmGameOptions", null);
        setIntField(term356006, term356006.getClass(), "screenShotCount", 0);
        setField(term356006, term356006.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDifficulty", argTypes, term356006, args);
    }

};


