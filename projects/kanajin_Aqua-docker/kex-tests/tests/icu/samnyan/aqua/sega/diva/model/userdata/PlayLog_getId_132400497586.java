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

public class PlayLog_getId_132400497586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354700;

    public PlayLog_getId_132400497586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354700 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term354700, term354700.getClass(), "id", 0L);
        setField(term354700, term354700.getClass(), "pdId", null);
        setIntField(term354700, term354700.getClass(), "pvId", 0);
        setField(term354700, term354700.getClass(), "difficulty", null);
        setField(term354700, term354700.getClass(), "edition", null);
        setIntField(term354700, term354700.getClass(), "scriptVer", 0);
        setIntField(term354700, term354700.getClass(), "score", 0);
        setField(term354700, term354700.getClass(), "challengeKind", null);
        setIntField(term354700, term354700.getClass(), "challengeResult", 0);
        setField(term354700, term354700.getClass(), "clearResult", null);
        setIntField(term354700, term354700.getClass(), "vp", 0);
        setIntField(term354700, term354700.getClass(), "coolCount", 0);
        setIntField(term354700, term354700.getClass(), "coolPercent", 0);
        setIntField(term354700, term354700.getClass(), "fineCount", 0);
        setIntField(term354700, term354700.getClass(), "finePercent", 0);
        setIntField(term354700, term354700.getClass(), "safeCount", 0);
        setIntField(term354700, term354700.getClass(), "safePercent", 0);
        setIntField(term354700, term354700.getClass(), "sadCount", 0);
        setIntField(term354700, term354700.getClass(), "sadPercent", 0);
        setIntField(term354700, term354700.getClass(), "wrongCount", 0);
        setIntField(term354700, term354700.getClass(), "wrongPercent", 0);
        setIntField(term354700, term354700.getClass(), "maxCombo", 0);
        setIntField(term354700, term354700.getClass(), "chanceTime", 0);
        setIntField(term354700, term354700.getClass(), "holdScore", 0);
        setIntField(term354700, term354700.getClass(), "attainPoint", 0);
        setIntField(term354700, term354700.getClass(), "skinId", 0);
        setIntField(term354700, term354700.getClass(), "buttonSe", 0);
        setIntField(term354700, term354700.getClass(), "buttonSeVol", 0);
        setIntField(term354700, term354700.getClass(), "sliderSe", 0);
        setIntField(term354700, term354700.getClass(), "ChainSlideSe", 0);
        setIntField(term354700, term354700.getClass(), "SliderTouchSe", 0);
        setField(term354700, term354700.getClass(), "modules", null);
        setIntField(term354700, term354700.getClass(), "stageCompletion", 0);
        setIntField(term354700, term354700.getClass(), "slideScore", 0);
        setIntField(term354700, term354700.getClass(), "isVocalChange", 0);
        setField(term354700, term354700.getClass(), "customizeItems", null);
        setField(term354700, term354700.getClass(), "rhythmGameOptions", null);
        setIntField(term354700, term354700.getClass(), "screenShotCount", 0);
        setField(term354700, term354700.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term354700, args);
    }

};


