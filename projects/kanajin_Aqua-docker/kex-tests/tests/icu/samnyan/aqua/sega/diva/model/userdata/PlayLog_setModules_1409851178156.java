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

public class PlayLog_setModules_1409851178156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356922;

    public PlayLog_setModules_1409851178156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356922 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term356922, term356922.getClass(), "id", 0L);
        setField(term356922, term356922.getClass(), "pdId", null);
        setIntField(term356922, term356922.getClass(), "pvId", 0);
        setField(term356922, term356922.getClass(), "difficulty", null);
        setField(term356922, term356922.getClass(), "edition", null);
        setIntField(term356922, term356922.getClass(), "scriptVer", 0);
        setIntField(term356922, term356922.getClass(), "score", 0);
        setField(term356922, term356922.getClass(), "challengeKind", null);
        setIntField(term356922, term356922.getClass(), "challengeResult", 0);
        setField(term356922, term356922.getClass(), "clearResult", null);
        setIntField(term356922, term356922.getClass(), "vp", 0);
        setIntField(term356922, term356922.getClass(), "coolCount", 0);
        setIntField(term356922, term356922.getClass(), "coolPercent", 0);
        setIntField(term356922, term356922.getClass(), "fineCount", 0);
        setIntField(term356922, term356922.getClass(), "finePercent", 0);
        setIntField(term356922, term356922.getClass(), "safeCount", 0);
        setIntField(term356922, term356922.getClass(), "safePercent", 0);
        setIntField(term356922, term356922.getClass(), "sadCount", 0);
        setIntField(term356922, term356922.getClass(), "sadPercent", 0);
        setIntField(term356922, term356922.getClass(), "wrongCount", 0);
        setIntField(term356922, term356922.getClass(), "wrongPercent", 0);
        setIntField(term356922, term356922.getClass(), "maxCombo", 0);
        setIntField(term356922, term356922.getClass(), "chanceTime", 0);
        setIntField(term356922, term356922.getClass(), "holdScore", 0);
        setIntField(term356922, term356922.getClass(), "attainPoint", 0);
        setIntField(term356922, term356922.getClass(), "skinId", 0);
        setIntField(term356922, term356922.getClass(), "buttonSe", 0);
        setIntField(term356922, term356922.getClass(), "buttonSeVol", 0);
        setIntField(term356922, term356922.getClass(), "sliderSe", 0);
        setIntField(term356922, term356922.getClass(), "ChainSlideSe", 0);
        setIntField(term356922, term356922.getClass(), "SliderTouchSe", 0);
        setField(term356922, term356922.getClass(), "modules", null);
        setIntField(term356922, term356922.getClass(), "stageCompletion", 0);
        setIntField(term356922, term356922.getClass(), "slideScore", 0);
        setIntField(term356922, term356922.getClass(), "isVocalChange", 0);
        setField(term356922, term356922.getClass(), "customizeItems", null);
        setField(term356922, term356922.getClass(), "rhythmGameOptions", null);
        setIntField(term356922, term356922.getClass(), "screenShotCount", 0);
        setField(term356922, term356922.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setModules", argTypes, term356922, args);
    }

};


