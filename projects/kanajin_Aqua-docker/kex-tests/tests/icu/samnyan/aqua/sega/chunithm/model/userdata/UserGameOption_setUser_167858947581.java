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

public class UserGameOption_setUser_167858947581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74119;

    public UserGameOption_setUser_167858947581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74119 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term74119, term74119.getClass(), "id", 0L);
        setField(term74119, term74119.getClass(), "user", null);
        setIntField(term74119, term74119.getClass(), "bgInfo", 0);
        setIntField(term74119, term74119.getClass(), "fieldColor", 0);
        setIntField(term74119, term74119.getClass(), "guideSound", 0);
        setIntField(term74119, term74119.getClass(), "soundEffect", 0);
        setIntField(term74119, term74119.getClass(), "guideLine", 0);
        setIntField(term74119, term74119.getClass(), "speed", 0);
        setIntField(term74119, term74119.getClass(), "optionSet", 0);
        setIntField(term74119, term74119.getClass(), "matching", 0);
        setIntField(term74119, term74119.getClass(), "judgePos", 0);
        setIntField(term74119, term74119.getClass(), "rating", 0);
        setIntField(term74119, term74119.getClass(), "judgeJustice", 0);
        setIntField(term74119, term74119.getClass(), "judgeAttack", 0);
        setIntField(term74119, term74119.getClass(), "headphone", 0);
        setIntField(term74119, term74119.getClass(), "playerLevel", 0);
        setIntField(term74119, term74119.getClass(), "successTap", 0);
        setIntField(term74119, term74119.getClass(), "successExTap", 0);
        setIntField(term74119, term74119.getClass(), "successSlideHold", 0);
        setIntField(term74119, term74119.getClass(), "successAir", 0);
        setIntField(term74119, term74119.getClass(), "successFlick", 0);
        setIntField(term74119, term74119.getClass(), "successSkill", 0);
        setIntField(term74119, term74119.getClass(), "successTapTimbre", 0);
        setIntField(term74119, term74119.getClass(), "privacy", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term74119, args);
    }

};


