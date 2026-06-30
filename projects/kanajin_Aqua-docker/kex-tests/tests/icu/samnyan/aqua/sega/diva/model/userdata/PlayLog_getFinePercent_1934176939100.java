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

public class PlayLog_getFinePercent_1934176939100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355134;

    public PlayLog_getFinePercent_1934176939100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355134 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term355134, term355134.getClass(), "id", 0L);
        setField(term355134, term355134.getClass(), "pdId", null);
        setIntField(term355134, term355134.getClass(), "pvId", 0);
        setField(term355134, term355134.getClass(), "difficulty", null);
        setField(term355134, term355134.getClass(), "edition", null);
        setIntField(term355134, term355134.getClass(), "scriptVer", 0);
        setIntField(term355134, term355134.getClass(), "score", 0);
        setField(term355134, term355134.getClass(), "challengeKind", null);
        setIntField(term355134, term355134.getClass(), "challengeResult", 0);
        setField(term355134, term355134.getClass(), "clearResult", null);
        setIntField(term355134, term355134.getClass(), "vp", 0);
        setIntField(term355134, term355134.getClass(), "coolCount", 0);
        setIntField(term355134, term355134.getClass(), "coolPercent", 0);
        setIntField(term355134, term355134.getClass(), "fineCount", 0);
        setIntField(term355134, term355134.getClass(), "finePercent", 0);
        setIntField(term355134, term355134.getClass(), "safeCount", 0);
        setIntField(term355134, term355134.getClass(), "safePercent", 0);
        setIntField(term355134, term355134.getClass(), "sadCount", 0);
        setIntField(term355134, term355134.getClass(), "sadPercent", 0);
        setIntField(term355134, term355134.getClass(), "wrongCount", 0);
        setIntField(term355134, term355134.getClass(), "wrongPercent", 0);
        setIntField(term355134, term355134.getClass(), "maxCombo", 0);
        setIntField(term355134, term355134.getClass(), "chanceTime", 0);
        setIntField(term355134, term355134.getClass(), "holdScore", 0);
        setIntField(term355134, term355134.getClass(), "attainPoint", 0);
        setIntField(term355134, term355134.getClass(), "skinId", 0);
        setIntField(term355134, term355134.getClass(), "buttonSe", 0);
        setIntField(term355134, term355134.getClass(), "buttonSeVol", 0);
        setIntField(term355134, term355134.getClass(), "sliderSe", 0);
        setIntField(term355134, term355134.getClass(), "ChainSlideSe", 0);
        setIntField(term355134, term355134.getClass(), "SliderTouchSe", 0);
        setField(term355134, term355134.getClass(), "modules", null);
        setIntField(term355134, term355134.getClass(), "stageCompletion", 0);
        setIntField(term355134, term355134.getClass(), "slideScore", 0);
        setIntField(term355134, term355134.getClass(), "isVocalChange", 0);
        setField(term355134, term355134.getClass(), "customizeItems", null);
        setField(term355134, term355134.getClass(), "rhythmGameOptions", null);
        setIntField(term355134, term355134.getClass(), "screenShotCount", 0);
        setField(term355134, term355134.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFinePercent", argTypes, term355134, args);
    }

};


