package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserGameOption_setUser_1358879783165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366519;

    public UserGameOption_setUser_1358879783165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366519 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term366519, term366519.getClass(), "id", 0L);
        setField(term366519, term366519.getClass(), "user", null);
        setIntField(term366519, term366519.getClass(), "bgInfo", 0);
        setIntField(term366519, term366519.getClass(), "fieldColor", 0);
        setIntField(term366519, term366519.getClass(), "guideSound", 0);
        setIntField(term366519, term366519.getClass(), "soundEffect", 0);
        setIntField(term366519, term366519.getClass(), "guideLine", 0);
        setIntField(term366519, term366519.getClass(), "speed", 0);
        setIntField(term366519, term366519.getClass(), "optionSet", 0);
        setIntField(term366519, term366519.getClass(), "matching", 0);
        setIntField(term366519, term366519.getClass(), "judgePos", 0);
        setIntField(term366519, term366519.getClass(), "rating", 0);
        setIntField(term366519, term366519.getClass(), "judgeCritical", 0);
        setIntField(term366519, term366519.getClass(), "judgeJustice", 0);
        setIntField(term366519, term366519.getClass(), "judgeAttack", 0);
        setIntField(term366519, term366519.getClass(), "headphone", 0);
        setIntField(term366519, term366519.getClass(), "playerLevel", 0);
        setIntField(term366519, term366519.getClass(), "successTap", 0);
        setIntField(term366519, term366519.getClass(), "successExTap", 0);
        setIntField(term366519, term366519.getClass(), "successSlideHold", 0);
        setIntField(term366519, term366519.getClass(), "successAir", 0);
        setIntField(term366519, term366519.getClass(), "successFlick", 0);
        setIntField(term366519, term366519.getClass(), "successSkill", 0);
        setIntField(term366519, term366519.getClass(), "successTapTimbre", 0);
        setIntField(term366519, term366519.getClass(), "privacy", 0);
        setIntField(term366519, term366519.getClass(), "mirrorFumen", 0);
        setIntField(term366519, term366519.getClass(), "selectMusicFilterLv", 0);
        setIntField(term366519, term366519.getClass(), "sortMusicFilterLv", 0);
        setIntField(term366519, term366519.getClass(), "sortMusicGenre", 0);
        setIntField(term366519, term366519.getClass(), "categoryDetail", 0);
        setIntField(term366519, term366519.getClass(), "judgeTimingOffset", 0);
        setIntField(term366519, term366519.getClass(), "playTimingOffset", 0);
        setIntField(term366519, term366519.getClass(), "fieldWallPosition", 0);
        setIntField(term366519, term366519.getClass(), "resultVoiceShort", 0);
        setIntField(term366519, term366519.getClass(), "notesThickness", 0);
        setIntField(term366519, term366519.getClass(), "judgeAppendSe", 0);
        setIntField(term366519, term366519.getClass(), "trackSkip", 0);
        setIntField(term366519, term366519.getClass(), "hardJudge", 0);
        setIntField(term366519, term366519.getClass(), "speed_120", 0);
        setIntField(term366519, term366519.getClass(), "fieldWallPosition_120", 0);
        setIntField(term366519, term366519.getClass(), "playTimingOffset_120", 0);
        setIntField(term366519, term366519.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term366519, term366519.getClass(), "ext1", 0);
        setIntField(term366519, term366519.getClass(), "ext2", 0);
        setIntField(term366519, term366519.getClass(), "ext3", 0);
        setIntField(term366519, term366519.getClass(), "ext4", 0);
        setIntField(term366519, term366519.getClass(), "ext5", 0);
        setIntField(term366519, term366519.getClass(), "ext6", 0);
        setIntField(term366519, term366519.getClass(), "ext7", 0);
        setIntField(term366519, term366519.getClass(), "ext8", 0);
        setIntField(term366519, term366519.getClass(), "ext9", 0);
        setIntField(term366519, term366519.getClass(), "ext10", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term366519, args);
    }

};


