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

public class UserGameOption_equals_982931510216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369271;

    public UserGameOption_equals_982931510216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369271 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term369271, term369271.getClass(), "id", 0L);
        setField(term369271, term369271.getClass(), "user", null);
        setIntField(term369271, term369271.getClass(), "bgInfo", 0);
        setIntField(term369271, term369271.getClass(), "fieldColor", 0);
        setIntField(term369271, term369271.getClass(), "guideSound", 0);
        setIntField(term369271, term369271.getClass(), "soundEffect", 0);
        setIntField(term369271, term369271.getClass(), "guideLine", 0);
        setIntField(term369271, term369271.getClass(), "speed", 0);
        setIntField(term369271, term369271.getClass(), "optionSet", 0);
        setIntField(term369271, term369271.getClass(), "matching", 0);
        setIntField(term369271, term369271.getClass(), "judgePos", 0);
        setIntField(term369271, term369271.getClass(), "rating", 0);
        setIntField(term369271, term369271.getClass(), "judgeCritical", 0);
        setIntField(term369271, term369271.getClass(), "judgeJustice", 0);
        setIntField(term369271, term369271.getClass(), "judgeAttack", 0);
        setIntField(term369271, term369271.getClass(), "headphone", 0);
        setIntField(term369271, term369271.getClass(), "playerLevel", 0);
        setIntField(term369271, term369271.getClass(), "successTap", 0);
        setIntField(term369271, term369271.getClass(), "successExTap", 0);
        setIntField(term369271, term369271.getClass(), "successSlideHold", 0);
        setIntField(term369271, term369271.getClass(), "successAir", 0);
        setIntField(term369271, term369271.getClass(), "successFlick", 0);
        setIntField(term369271, term369271.getClass(), "successSkill", 0);
        setIntField(term369271, term369271.getClass(), "successTapTimbre", 0);
        setIntField(term369271, term369271.getClass(), "privacy", 0);
        setIntField(term369271, term369271.getClass(), "mirrorFumen", 0);
        setIntField(term369271, term369271.getClass(), "selectMusicFilterLv", 0);
        setIntField(term369271, term369271.getClass(), "sortMusicFilterLv", 0);
        setIntField(term369271, term369271.getClass(), "sortMusicGenre", 0);
        setIntField(term369271, term369271.getClass(), "categoryDetail", 0);
        setIntField(term369271, term369271.getClass(), "judgeTimingOffset", 0);
        setIntField(term369271, term369271.getClass(), "playTimingOffset", 0);
        setIntField(term369271, term369271.getClass(), "fieldWallPosition", 0);
        setIntField(term369271, term369271.getClass(), "resultVoiceShort", 0);
        setIntField(term369271, term369271.getClass(), "notesThickness", 0);
        setIntField(term369271, term369271.getClass(), "judgeAppendSe", 0);
        setIntField(term369271, term369271.getClass(), "trackSkip", 0);
        setIntField(term369271, term369271.getClass(), "hardJudge", 0);
        setIntField(term369271, term369271.getClass(), "speed_120", 0);
        setIntField(term369271, term369271.getClass(), "fieldWallPosition_120", 0);
        setIntField(term369271, term369271.getClass(), "playTimingOffset_120", 0);
        setIntField(term369271, term369271.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term369271, term369271.getClass(), "ext1", 0);
        setIntField(term369271, term369271.getClass(), "ext2", 0);
        setIntField(term369271, term369271.getClass(), "ext3", 0);
        setIntField(term369271, term369271.getClass(), "ext4", 0);
        setIntField(term369271, term369271.getClass(), "ext5", 0);
        setIntField(term369271, term369271.getClass(), "ext6", 0);
        setIntField(term369271, term369271.getClass(), "ext7", 0);
        setIntField(term369271, term369271.getClass(), "ext8", 0);
        setIntField(term369271, term369271.getClass(), "ext9", 0);
        setIntField(term369271, term369271.getClass(), "ext10", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term369271, args);
    }

};


