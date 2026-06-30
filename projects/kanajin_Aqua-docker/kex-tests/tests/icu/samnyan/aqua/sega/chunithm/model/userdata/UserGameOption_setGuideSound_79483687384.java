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
import java.lang.Integer;

public class UserGameOption_setGuideSound_79483687384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74195;
     Object term74219;

    public UserGameOption_setGuideSound_79483687384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74195 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term74195, term74195.getClass(), "id", 0L);
        setField(term74195, term74195.getClass(), "user", null);
        setIntField(term74195, term74195.getClass(), "bgInfo", 0);
        setIntField(term74195, term74195.getClass(), "fieldColor", 0);
        setIntField(term74195, term74195.getClass(), "guideSound", 0);
        setIntField(term74195, term74195.getClass(), "soundEffect", 0);
        setIntField(term74195, term74195.getClass(), "guideLine", 0);
        setIntField(term74195, term74195.getClass(), "speed", 0);
        setIntField(term74195, term74195.getClass(), "optionSet", 0);
        setIntField(term74195, term74195.getClass(), "matching", 0);
        setIntField(term74195, term74195.getClass(), "judgePos", 0);
        setIntField(term74195, term74195.getClass(), "rating", 0);
        setIntField(term74195, term74195.getClass(), "judgeJustice", 0);
        setIntField(term74195, term74195.getClass(), "judgeAttack", 0);
        setIntField(term74195, term74195.getClass(), "headphone", 0);
        setIntField(term74195, term74195.getClass(), "playerLevel", 0);
        setIntField(term74195, term74195.getClass(), "successTap", 0);
        setIntField(term74195, term74195.getClass(), "successExTap", 0);
        setIntField(term74195, term74195.getClass(), "successSlideHold", 0);
        setIntField(term74195, term74195.getClass(), "successAir", 0);
        setIntField(term74195, term74195.getClass(), "successFlick", 0);
        setIntField(term74195, term74195.getClass(), "successSkill", 0);
        setIntField(term74195, term74195.getClass(), "successTapTimbre", 0);
        setIntField(term74195, term74195.getClass(), "privacy", 0);
        term74219 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74219;
        callMethod(klass, "setGuideSound", argTypes, term74195, args);
    }

};


