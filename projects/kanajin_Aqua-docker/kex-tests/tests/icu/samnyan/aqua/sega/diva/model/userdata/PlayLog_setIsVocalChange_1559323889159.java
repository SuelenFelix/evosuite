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
import java.lang.Integer;

public class PlayLog_setIsVocalChange_1559323889159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357019;
     Object term357050;

    public PlayLog_setIsVocalChange_1559323889159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357019 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term357019, term357019.getClass(), "id", 0L);
        setField(term357019, term357019.getClass(), "pdId", null);
        setIntField(term357019, term357019.getClass(), "pvId", 0);
        setField(term357019, term357019.getClass(), "difficulty", null);
        setField(term357019, term357019.getClass(), "edition", null);
        setIntField(term357019, term357019.getClass(), "scriptVer", 0);
        setIntField(term357019, term357019.getClass(), "score", 0);
        setField(term357019, term357019.getClass(), "challengeKind", null);
        setIntField(term357019, term357019.getClass(), "challengeResult", 0);
        setField(term357019, term357019.getClass(), "clearResult", null);
        setIntField(term357019, term357019.getClass(), "vp", 0);
        setIntField(term357019, term357019.getClass(), "coolCount", 0);
        setIntField(term357019, term357019.getClass(), "coolPercent", 0);
        setIntField(term357019, term357019.getClass(), "fineCount", 0);
        setIntField(term357019, term357019.getClass(), "finePercent", 0);
        setIntField(term357019, term357019.getClass(), "safeCount", 0);
        setIntField(term357019, term357019.getClass(), "safePercent", 0);
        setIntField(term357019, term357019.getClass(), "sadCount", 0);
        setIntField(term357019, term357019.getClass(), "sadPercent", 0);
        setIntField(term357019, term357019.getClass(), "wrongCount", 0);
        setIntField(term357019, term357019.getClass(), "wrongPercent", 0);
        setIntField(term357019, term357019.getClass(), "maxCombo", 0);
        setIntField(term357019, term357019.getClass(), "chanceTime", 0);
        setIntField(term357019, term357019.getClass(), "holdScore", 0);
        setIntField(term357019, term357019.getClass(), "attainPoint", 0);
        setIntField(term357019, term357019.getClass(), "skinId", 0);
        setIntField(term357019, term357019.getClass(), "buttonSe", 0);
        setIntField(term357019, term357019.getClass(), "buttonSeVol", 0);
        setIntField(term357019, term357019.getClass(), "sliderSe", 0);
        setIntField(term357019, term357019.getClass(), "ChainSlideSe", 0);
        setIntField(term357019, term357019.getClass(), "SliderTouchSe", 0);
        setField(term357019, term357019.getClass(), "modules", null);
        setIntField(term357019, term357019.getClass(), "stageCompletion", 0);
        setIntField(term357019, term357019.getClass(), "slideScore", 0);
        setIntField(term357019, term357019.getClass(), "isVocalChange", 0);
        setField(term357019, term357019.getClass(), "customizeItems", null);
        setField(term357019, term357019.getClass(), "rhythmGameOptions", null);
        setIntField(term357019, term357019.getClass(), "screenShotCount", 0);
        setField(term357019, term357019.getClass(), "dateTime", null);
        term357050 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term357050;
        callMethod(klass, "setIsVocalChange", argTypes, term357019, args);
    }

};


