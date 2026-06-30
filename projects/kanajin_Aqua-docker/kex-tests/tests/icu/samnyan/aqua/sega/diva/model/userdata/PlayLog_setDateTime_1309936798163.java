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

public class PlayLog_setDateTime_1309936798163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357147;

    public PlayLog_setDateTime_1309936798163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357147 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term357147, term357147.getClass(), "id", 0L);
        setField(term357147, term357147.getClass(), "pdId", null);
        setIntField(term357147, term357147.getClass(), "pvId", 0);
        setField(term357147, term357147.getClass(), "difficulty", null);
        setField(term357147, term357147.getClass(), "edition", null);
        setIntField(term357147, term357147.getClass(), "scriptVer", 0);
        setIntField(term357147, term357147.getClass(), "score", 0);
        setField(term357147, term357147.getClass(), "challengeKind", null);
        setIntField(term357147, term357147.getClass(), "challengeResult", 0);
        setField(term357147, term357147.getClass(), "clearResult", null);
        setIntField(term357147, term357147.getClass(), "vp", 0);
        setIntField(term357147, term357147.getClass(), "coolCount", 0);
        setIntField(term357147, term357147.getClass(), "coolPercent", 0);
        setIntField(term357147, term357147.getClass(), "fineCount", 0);
        setIntField(term357147, term357147.getClass(), "finePercent", 0);
        setIntField(term357147, term357147.getClass(), "safeCount", 0);
        setIntField(term357147, term357147.getClass(), "safePercent", 0);
        setIntField(term357147, term357147.getClass(), "sadCount", 0);
        setIntField(term357147, term357147.getClass(), "sadPercent", 0);
        setIntField(term357147, term357147.getClass(), "wrongCount", 0);
        setIntField(term357147, term357147.getClass(), "wrongPercent", 0);
        setIntField(term357147, term357147.getClass(), "maxCombo", 0);
        setIntField(term357147, term357147.getClass(), "chanceTime", 0);
        setIntField(term357147, term357147.getClass(), "holdScore", 0);
        setIntField(term357147, term357147.getClass(), "attainPoint", 0);
        setIntField(term357147, term357147.getClass(), "skinId", 0);
        setIntField(term357147, term357147.getClass(), "buttonSe", 0);
        setIntField(term357147, term357147.getClass(), "buttonSeVol", 0);
        setIntField(term357147, term357147.getClass(), "sliderSe", 0);
        setIntField(term357147, term357147.getClass(), "ChainSlideSe", 0);
        setIntField(term357147, term357147.getClass(), "SliderTouchSe", 0);
        setField(term357147, term357147.getClass(), "modules", null);
        setIntField(term357147, term357147.getClass(), "stageCompletion", 0);
        setIntField(term357147, term357147.getClass(), "slideScore", 0);
        setIntField(term357147, term357147.getClass(), "isVocalChange", 0);
        setField(term357147, term357147.getClass(), "customizeItems", null);
        setField(term357147, term357147.getClass(), "rhythmGameOptions", null);
        setIntField(term357147, term357147.getClass(), "screenShotCount", 0);
        setField(term357147, term357147.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDateTime", argTypes, term357147, args);
    }

};


