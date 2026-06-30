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

public class PlayLog_setCustomizeItems_1116998608160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357052;

    public PlayLog_setCustomizeItems_1116998608160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357052 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term357052, term357052.getClass(), "id", 0L);
        setField(term357052, term357052.getClass(), "pdId", null);
        setIntField(term357052, term357052.getClass(), "pvId", 0);
        setField(term357052, term357052.getClass(), "difficulty", null);
        setField(term357052, term357052.getClass(), "edition", null);
        setIntField(term357052, term357052.getClass(), "scriptVer", 0);
        setIntField(term357052, term357052.getClass(), "score", 0);
        setField(term357052, term357052.getClass(), "challengeKind", null);
        setIntField(term357052, term357052.getClass(), "challengeResult", 0);
        setField(term357052, term357052.getClass(), "clearResult", null);
        setIntField(term357052, term357052.getClass(), "vp", 0);
        setIntField(term357052, term357052.getClass(), "coolCount", 0);
        setIntField(term357052, term357052.getClass(), "coolPercent", 0);
        setIntField(term357052, term357052.getClass(), "fineCount", 0);
        setIntField(term357052, term357052.getClass(), "finePercent", 0);
        setIntField(term357052, term357052.getClass(), "safeCount", 0);
        setIntField(term357052, term357052.getClass(), "safePercent", 0);
        setIntField(term357052, term357052.getClass(), "sadCount", 0);
        setIntField(term357052, term357052.getClass(), "sadPercent", 0);
        setIntField(term357052, term357052.getClass(), "wrongCount", 0);
        setIntField(term357052, term357052.getClass(), "wrongPercent", 0);
        setIntField(term357052, term357052.getClass(), "maxCombo", 0);
        setIntField(term357052, term357052.getClass(), "chanceTime", 0);
        setIntField(term357052, term357052.getClass(), "holdScore", 0);
        setIntField(term357052, term357052.getClass(), "attainPoint", 0);
        setIntField(term357052, term357052.getClass(), "skinId", 0);
        setIntField(term357052, term357052.getClass(), "buttonSe", 0);
        setIntField(term357052, term357052.getClass(), "buttonSeVol", 0);
        setIntField(term357052, term357052.getClass(), "sliderSe", 0);
        setIntField(term357052, term357052.getClass(), "ChainSlideSe", 0);
        setIntField(term357052, term357052.getClass(), "SliderTouchSe", 0);
        setField(term357052, term357052.getClass(), "modules", null);
        setIntField(term357052, term357052.getClass(), "stageCompletion", 0);
        setIntField(term357052, term357052.getClass(), "slideScore", 0);
        setIntField(term357052, term357052.getClass(), "isVocalChange", 0);
        setField(term357052, term357052.getClass(), "customizeItems", null);
        setField(term357052, term357052.getClass(), "rhythmGameOptions", null);
        setIntField(term357052, term357052.getClass(), "screenShotCount", 0);
        setField(term357052, term357052.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCustomizeItems", argTypes, term357052, args);
    }

};


