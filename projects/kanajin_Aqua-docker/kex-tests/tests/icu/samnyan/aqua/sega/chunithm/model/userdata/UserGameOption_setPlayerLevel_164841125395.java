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

public class UserGameOption_setPlayerLevel_164841125395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74481;
     Object term74505;

    public UserGameOption_setPlayerLevel_164841125395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74481 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term74481, term74481.getClass(), "id", 0L);
        setField(term74481, term74481.getClass(), "user", null);
        setIntField(term74481, term74481.getClass(), "bgInfo", 0);
        setIntField(term74481, term74481.getClass(), "fieldColor", 0);
        setIntField(term74481, term74481.getClass(), "guideSound", 0);
        setIntField(term74481, term74481.getClass(), "soundEffect", 0);
        setIntField(term74481, term74481.getClass(), "guideLine", 0);
        setIntField(term74481, term74481.getClass(), "speed", 0);
        setIntField(term74481, term74481.getClass(), "optionSet", 0);
        setIntField(term74481, term74481.getClass(), "matching", 0);
        setIntField(term74481, term74481.getClass(), "judgePos", 0);
        setIntField(term74481, term74481.getClass(), "rating", 0);
        setIntField(term74481, term74481.getClass(), "judgeJustice", 0);
        setIntField(term74481, term74481.getClass(), "judgeAttack", 0);
        setIntField(term74481, term74481.getClass(), "headphone", 0);
        setIntField(term74481, term74481.getClass(), "playerLevel", 0);
        setIntField(term74481, term74481.getClass(), "successTap", 0);
        setIntField(term74481, term74481.getClass(), "successExTap", 0);
        setIntField(term74481, term74481.getClass(), "successSlideHold", 0);
        setIntField(term74481, term74481.getClass(), "successAir", 0);
        setIntField(term74481, term74481.getClass(), "successFlick", 0);
        setIntField(term74481, term74481.getClass(), "successSkill", 0);
        setIntField(term74481, term74481.getClass(), "successTapTimbre", 0);
        setIntField(term74481, term74481.getClass(), "privacy", 0);
        term74505 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74505;
        callMethod(klass, "setPlayerLevel", argTypes, term74481, args);
    }

};


