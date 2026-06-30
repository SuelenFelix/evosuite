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

public class PlayLog_getClearResult_59784354995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354979;

    public PlayLog_getClearResult_59784354995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354979 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term354979, term354979.getClass(), "id", 0L);
        setField(term354979, term354979.getClass(), "pdId", null);
        setIntField(term354979, term354979.getClass(), "pvId", 0);
        setField(term354979, term354979.getClass(), "difficulty", null);
        setField(term354979, term354979.getClass(), "edition", null);
        setIntField(term354979, term354979.getClass(), "scriptVer", 0);
        setIntField(term354979, term354979.getClass(), "score", 0);
        setField(term354979, term354979.getClass(), "challengeKind", null);
        setIntField(term354979, term354979.getClass(), "challengeResult", 0);
        setField(term354979, term354979.getClass(), "clearResult", null);
        setIntField(term354979, term354979.getClass(), "vp", 0);
        setIntField(term354979, term354979.getClass(), "coolCount", 0);
        setIntField(term354979, term354979.getClass(), "coolPercent", 0);
        setIntField(term354979, term354979.getClass(), "fineCount", 0);
        setIntField(term354979, term354979.getClass(), "finePercent", 0);
        setIntField(term354979, term354979.getClass(), "safeCount", 0);
        setIntField(term354979, term354979.getClass(), "safePercent", 0);
        setIntField(term354979, term354979.getClass(), "sadCount", 0);
        setIntField(term354979, term354979.getClass(), "sadPercent", 0);
        setIntField(term354979, term354979.getClass(), "wrongCount", 0);
        setIntField(term354979, term354979.getClass(), "wrongPercent", 0);
        setIntField(term354979, term354979.getClass(), "maxCombo", 0);
        setIntField(term354979, term354979.getClass(), "chanceTime", 0);
        setIntField(term354979, term354979.getClass(), "holdScore", 0);
        setIntField(term354979, term354979.getClass(), "attainPoint", 0);
        setIntField(term354979, term354979.getClass(), "skinId", 0);
        setIntField(term354979, term354979.getClass(), "buttonSe", 0);
        setIntField(term354979, term354979.getClass(), "buttonSeVol", 0);
        setIntField(term354979, term354979.getClass(), "sliderSe", 0);
        setIntField(term354979, term354979.getClass(), "ChainSlideSe", 0);
        setIntField(term354979, term354979.getClass(), "SliderTouchSe", 0);
        setField(term354979, term354979.getClass(), "modules", null);
        setIntField(term354979, term354979.getClass(), "stageCompletion", 0);
        setIntField(term354979, term354979.getClass(), "slideScore", 0);
        setIntField(term354979, term354979.getClass(), "isVocalChange", 0);
        setField(term354979, term354979.getClass(), "customizeItems", null);
        setField(term354979, term354979.getClass(), "rhythmGameOptions", null);
        setIntField(term354979, term354979.getClass(), "screenShotCount", 0);
        setField(term354979, term354979.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClearResult", argTypes, term354979, args);
    }

};


