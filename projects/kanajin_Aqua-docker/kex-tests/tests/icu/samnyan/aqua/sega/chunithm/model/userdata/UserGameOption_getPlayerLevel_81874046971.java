package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserGameOption_getPlayerLevel_81874046971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73877;

    public UserGameOption_getPlayerLevel_81874046971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73877 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term73877, term73877.getClass(), "id", 0L);
        setField(term73877, term73877.getClass(), "user", null);
        setIntField(term73877, term73877.getClass(), "bgInfo", 0);
        setIntField(term73877, term73877.getClass(), "fieldColor", 0);
        setIntField(term73877, term73877.getClass(), "guideSound", 0);
        setIntField(term73877, term73877.getClass(), "soundEffect", 0);
        setIntField(term73877, term73877.getClass(), "guideLine", 0);
        setIntField(term73877, term73877.getClass(), "speed", 0);
        setIntField(term73877, term73877.getClass(), "optionSet", 0);
        setIntField(term73877, term73877.getClass(), "matching", 0);
        setIntField(term73877, term73877.getClass(), "judgePos", 0);
        setIntField(term73877, term73877.getClass(), "rating", 0);
        setIntField(term73877, term73877.getClass(), "judgeJustice", 0);
        setIntField(term73877, term73877.getClass(), "judgeAttack", 0);
        setIntField(term73877, term73877.getClass(), "headphone", 0);
        setIntField(term73877, term73877.getClass(), "playerLevel", 0);
        setIntField(term73877, term73877.getClass(), "successTap", 0);
        setIntField(term73877, term73877.getClass(), "successExTap", 0);
        setIntField(term73877, term73877.getClass(), "successSlideHold", 0);
        setIntField(term73877, term73877.getClass(), "successAir", 0);
        setIntField(term73877, term73877.getClass(), "successFlick", 0);
        setIntField(term73877, term73877.getClass(), "successSkill", 0);
        setIntField(term73877, term73877.getClass(), "successTapTimbre", 0);
        setIntField(term73877, term73877.getClass(), "privacy", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerLevel", argTypes, term73877, args);
    }

};


