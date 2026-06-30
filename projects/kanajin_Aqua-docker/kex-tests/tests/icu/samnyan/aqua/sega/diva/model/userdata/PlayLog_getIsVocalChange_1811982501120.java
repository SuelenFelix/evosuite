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

public class PlayLog_getIsVocalChange_1811982501120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355754;

    public PlayLog_getIsVocalChange_1811982501120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355754 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term355754, term355754.getClass(), "id", 0L);
        setField(term355754, term355754.getClass(), "pdId", null);
        setIntField(term355754, term355754.getClass(), "pvId", 0);
        setField(term355754, term355754.getClass(), "difficulty", null);
        setField(term355754, term355754.getClass(), "edition", null);
        setIntField(term355754, term355754.getClass(), "scriptVer", 0);
        setIntField(term355754, term355754.getClass(), "score", 0);
        setField(term355754, term355754.getClass(), "challengeKind", null);
        setIntField(term355754, term355754.getClass(), "challengeResult", 0);
        setField(term355754, term355754.getClass(), "clearResult", null);
        setIntField(term355754, term355754.getClass(), "vp", 0);
        setIntField(term355754, term355754.getClass(), "coolCount", 0);
        setIntField(term355754, term355754.getClass(), "coolPercent", 0);
        setIntField(term355754, term355754.getClass(), "fineCount", 0);
        setIntField(term355754, term355754.getClass(), "finePercent", 0);
        setIntField(term355754, term355754.getClass(), "safeCount", 0);
        setIntField(term355754, term355754.getClass(), "safePercent", 0);
        setIntField(term355754, term355754.getClass(), "sadCount", 0);
        setIntField(term355754, term355754.getClass(), "sadPercent", 0);
        setIntField(term355754, term355754.getClass(), "wrongCount", 0);
        setIntField(term355754, term355754.getClass(), "wrongPercent", 0);
        setIntField(term355754, term355754.getClass(), "maxCombo", 0);
        setIntField(term355754, term355754.getClass(), "chanceTime", 0);
        setIntField(term355754, term355754.getClass(), "holdScore", 0);
        setIntField(term355754, term355754.getClass(), "attainPoint", 0);
        setIntField(term355754, term355754.getClass(), "skinId", 0);
        setIntField(term355754, term355754.getClass(), "buttonSe", 0);
        setIntField(term355754, term355754.getClass(), "buttonSeVol", 0);
        setIntField(term355754, term355754.getClass(), "sliderSe", 0);
        setIntField(term355754, term355754.getClass(), "ChainSlideSe", 0);
        setIntField(term355754, term355754.getClass(), "SliderTouchSe", 0);
        setField(term355754, term355754.getClass(), "modules", null);
        setIntField(term355754, term355754.getClass(), "stageCompletion", 0);
        setIntField(term355754, term355754.getClass(), "slideScore", 0);
        setIntField(term355754, term355754.getClass(), "isVocalChange", 0);
        setField(term355754, term355754.getClass(), "customizeItems", null);
        setField(term355754, term355754.getClass(), "rhythmGameOptions", null);
        setIntField(term355754, term355754.getClass(), "screenShotCount", 0);
        setField(term355754, term355754.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsVocalChange", argTypes, term355754, args);
    }

};


