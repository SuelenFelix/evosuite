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

public class PlayLog_getSlideScore_1248322615119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355723;

    public PlayLog_getSlideScore_1248322615119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355723 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term355723, term355723.getClass(), "id", 0L);
        setField(term355723, term355723.getClass(), "pdId", null);
        setIntField(term355723, term355723.getClass(), "pvId", 0);
        setField(term355723, term355723.getClass(), "difficulty", null);
        setField(term355723, term355723.getClass(), "edition", null);
        setIntField(term355723, term355723.getClass(), "scriptVer", 0);
        setIntField(term355723, term355723.getClass(), "score", 0);
        setField(term355723, term355723.getClass(), "challengeKind", null);
        setIntField(term355723, term355723.getClass(), "challengeResult", 0);
        setField(term355723, term355723.getClass(), "clearResult", null);
        setIntField(term355723, term355723.getClass(), "vp", 0);
        setIntField(term355723, term355723.getClass(), "coolCount", 0);
        setIntField(term355723, term355723.getClass(), "coolPercent", 0);
        setIntField(term355723, term355723.getClass(), "fineCount", 0);
        setIntField(term355723, term355723.getClass(), "finePercent", 0);
        setIntField(term355723, term355723.getClass(), "safeCount", 0);
        setIntField(term355723, term355723.getClass(), "safePercent", 0);
        setIntField(term355723, term355723.getClass(), "sadCount", 0);
        setIntField(term355723, term355723.getClass(), "sadPercent", 0);
        setIntField(term355723, term355723.getClass(), "wrongCount", 0);
        setIntField(term355723, term355723.getClass(), "wrongPercent", 0);
        setIntField(term355723, term355723.getClass(), "maxCombo", 0);
        setIntField(term355723, term355723.getClass(), "chanceTime", 0);
        setIntField(term355723, term355723.getClass(), "holdScore", 0);
        setIntField(term355723, term355723.getClass(), "attainPoint", 0);
        setIntField(term355723, term355723.getClass(), "skinId", 0);
        setIntField(term355723, term355723.getClass(), "buttonSe", 0);
        setIntField(term355723, term355723.getClass(), "buttonSeVol", 0);
        setIntField(term355723, term355723.getClass(), "sliderSe", 0);
        setIntField(term355723, term355723.getClass(), "ChainSlideSe", 0);
        setIntField(term355723, term355723.getClass(), "SliderTouchSe", 0);
        setField(term355723, term355723.getClass(), "modules", null);
        setIntField(term355723, term355723.getClass(), "stageCompletion", 0);
        setIntField(term355723, term355723.getClass(), "slideScore", 0);
        setIntField(term355723, term355723.getClass(), "isVocalChange", 0);
        setField(term355723, term355723.getClass(), "customizeItems", null);
        setField(term355723, term355723.getClass(), "rhythmGameOptions", null);
        setIntField(term355723, term355723.getClass(), "screenShotCount", 0);
        setField(term355723, term355723.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlideScore", argTypes, term355723, args);
    }

};


