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

public class PlayLog_getButtonSe_1187784006112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355506;

    public PlayLog_getButtonSe_1187784006112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355506 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term355506, term355506.getClass(), "id", 0L);
        setField(term355506, term355506.getClass(), "pdId", null);
        setIntField(term355506, term355506.getClass(), "pvId", 0);
        setField(term355506, term355506.getClass(), "difficulty", null);
        setField(term355506, term355506.getClass(), "edition", null);
        setIntField(term355506, term355506.getClass(), "scriptVer", 0);
        setIntField(term355506, term355506.getClass(), "score", 0);
        setField(term355506, term355506.getClass(), "challengeKind", null);
        setIntField(term355506, term355506.getClass(), "challengeResult", 0);
        setField(term355506, term355506.getClass(), "clearResult", null);
        setIntField(term355506, term355506.getClass(), "vp", 0);
        setIntField(term355506, term355506.getClass(), "coolCount", 0);
        setIntField(term355506, term355506.getClass(), "coolPercent", 0);
        setIntField(term355506, term355506.getClass(), "fineCount", 0);
        setIntField(term355506, term355506.getClass(), "finePercent", 0);
        setIntField(term355506, term355506.getClass(), "safeCount", 0);
        setIntField(term355506, term355506.getClass(), "safePercent", 0);
        setIntField(term355506, term355506.getClass(), "sadCount", 0);
        setIntField(term355506, term355506.getClass(), "sadPercent", 0);
        setIntField(term355506, term355506.getClass(), "wrongCount", 0);
        setIntField(term355506, term355506.getClass(), "wrongPercent", 0);
        setIntField(term355506, term355506.getClass(), "maxCombo", 0);
        setIntField(term355506, term355506.getClass(), "chanceTime", 0);
        setIntField(term355506, term355506.getClass(), "holdScore", 0);
        setIntField(term355506, term355506.getClass(), "attainPoint", 0);
        setIntField(term355506, term355506.getClass(), "skinId", 0);
        setIntField(term355506, term355506.getClass(), "buttonSe", 0);
        setIntField(term355506, term355506.getClass(), "buttonSeVol", 0);
        setIntField(term355506, term355506.getClass(), "sliderSe", 0);
        setIntField(term355506, term355506.getClass(), "ChainSlideSe", 0);
        setIntField(term355506, term355506.getClass(), "SliderTouchSe", 0);
        setField(term355506, term355506.getClass(), "modules", null);
        setIntField(term355506, term355506.getClass(), "stageCompletion", 0);
        setIntField(term355506, term355506.getClass(), "slideScore", 0);
        setIntField(term355506, term355506.getClass(), "isVocalChange", 0);
        setField(term355506, term355506.getClass(), "customizeItems", null);
        setField(term355506, term355506.getClass(), "rhythmGameOptions", null);
        setIntField(term355506, term355506.getClass(), "screenShotCount", 0);
        setField(term355506, term355506.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getButtonSe", argTypes, term355506, args);
    }

};


