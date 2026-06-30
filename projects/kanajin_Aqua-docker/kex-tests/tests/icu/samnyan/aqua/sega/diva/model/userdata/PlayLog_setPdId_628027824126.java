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

public class PlayLog_setPdId_628027824126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355942;

    public PlayLog_setPdId_628027824126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355942 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term355942, term355942.getClass(), "id", 0L);
        setField(term355942, term355942.getClass(), "pdId", null);
        setIntField(term355942, term355942.getClass(), "pvId", 0);
        setField(term355942, term355942.getClass(), "difficulty", null);
        setField(term355942, term355942.getClass(), "edition", null);
        setIntField(term355942, term355942.getClass(), "scriptVer", 0);
        setIntField(term355942, term355942.getClass(), "score", 0);
        setField(term355942, term355942.getClass(), "challengeKind", null);
        setIntField(term355942, term355942.getClass(), "challengeResult", 0);
        setField(term355942, term355942.getClass(), "clearResult", null);
        setIntField(term355942, term355942.getClass(), "vp", 0);
        setIntField(term355942, term355942.getClass(), "coolCount", 0);
        setIntField(term355942, term355942.getClass(), "coolPercent", 0);
        setIntField(term355942, term355942.getClass(), "fineCount", 0);
        setIntField(term355942, term355942.getClass(), "finePercent", 0);
        setIntField(term355942, term355942.getClass(), "safeCount", 0);
        setIntField(term355942, term355942.getClass(), "safePercent", 0);
        setIntField(term355942, term355942.getClass(), "sadCount", 0);
        setIntField(term355942, term355942.getClass(), "sadPercent", 0);
        setIntField(term355942, term355942.getClass(), "wrongCount", 0);
        setIntField(term355942, term355942.getClass(), "wrongPercent", 0);
        setIntField(term355942, term355942.getClass(), "maxCombo", 0);
        setIntField(term355942, term355942.getClass(), "chanceTime", 0);
        setIntField(term355942, term355942.getClass(), "holdScore", 0);
        setIntField(term355942, term355942.getClass(), "attainPoint", 0);
        setIntField(term355942, term355942.getClass(), "skinId", 0);
        setIntField(term355942, term355942.getClass(), "buttonSe", 0);
        setIntField(term355942, term355942.getClass(), "buttonSeVol", 0);
        setIntField(term355942, term355942.getClass(), "sliderSe", 0);
        setIntField(term355942, term355942.getClass(), "ChainSlideSe", 0);
        setIntField(term355942, term355942.getClass(), "SliderTouchSe", 0);
        setField(term355942, term355942.getClass(), "modules", null);
        setIntField(term355942, term355942.getClass(), "stageCompletion", 0);
        setIntField(term355942, term355942.getClass(), "slideScore", 0);
        setIntField(term355942, term355942.getClass(), "isVocalChange", 0);
        setField(term355942, term355942.getClass(), "customizeItems", null);
        setField(term355942, term355942.getClass(), "rhythmGameOptions", null);
        setIntField(term355942, term355942.getClass(), "screenShotCount", 0);
        setField(term355942, term355942.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPdId", argTypes, term355942, args);
    }

};


