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

public class PlayLog_canEqual_206878355165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357209;

    public PlayLog_canEqual_206878355165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357209 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term357209, term357209.getClass(), "id", 0L);
        setField(term357209, term357209.getClass(), "pdId", null);
        setIntField(term357209, term357209.getClass(), "pvId", 0);
        setField(term357209, term357209.getClass(), "difficulty", null);
        setField(term357209, term357209.getClass(), "edition", null);
        setIntField(term357209, term357209.getClass(), "scriptVer", 0);
        setIntField(term357209, term357209.getClass(), "score", 0);
        setField(term357209, term357209.getClass(), "challengeKind", null);
        setIntField(term357209, term357209.getClass(), "challengeResult", 0);
        setField(term357209, term357209.getClass(), "clearResult", null);
        setIntField(term357209, term357209.getClass(), "vp", 0);
        setIntField(term357209, term357209.getClass(), "coolCount", 0);
        setIntField(term357209, term357209.getClass(), "coolPercent", 0);
        setIntField(term357209, term357209.getClass(), "fineCount", 0);
        setIntField(term357209, term357209.getClass(), "finePercent", 0);
        setIntField(term357209, term357209.getClass(), "safeCount", 0);
        setIntField(term357209, term357209.getClass(), "safePercent", 0);
        setIntField(term357209, term357209.getClass(), "sadCount", 0);
        setIntField(term357209, term357209.getClass(), "sadPercent", 0);
        setIntField(term357209, term357209.getClass(), "wrongCount", 0);
        setIntField(term357209, term357209.getClass(), "wrongPercent", 0);
        setIntField(term357209, term357209.getClass(), "maxCombo", 0);
        setIntField(term357209, term357209.getClass(), "chanceTime", 0);
        setIntField(term357209, term357209.getClass(), "holdScore", 0);
        setIntField(term357209, term357209.getClass(), "attainPoint", 0);
        setIntField(term357209, term357209.getClass(), "skinId", 0);
        setIntField(term357209, term357209.getClass(), "buttonSe", 0);
        setIntField(term357209, term357209.getClass(), "buttonSeVol", 0);
        setIntField(term357209, term357209.getClass(), "sliderSe", 0);
        setIntField(term357209, term357209.getClass(), "ChainSlideSe", 0);
        setIntField(term357209, term357209.getClass(), "SliderTouchSe", 0);
        setField(term357209, term357209.getClass(), "modules", null);
        setIntField(term357209, term357209.getClass(), "stageCompletion", 0);
        setIntField(term357209, term357209.getClass(), "slideScore", 0);
        setIntField(term357209, term357209.getClass(), "isVocalChange", 0);
        setField(term357209, term357209.getClass(), "customizeItems", null);
        setField(term357209, term357209.getClass(), "rhythmGameOptions", null);
        setIntField(term357209, term357209.getClass(), "screenShotCount", 0);
        setField(term357209, term357209.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term357209, args);
    }

};


