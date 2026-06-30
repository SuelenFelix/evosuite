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
import java.lang.Integer;

public class UserGameOption_setBgInfo_1526266521166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366571;
     Object term366623;

    public UserGameOption_setBgInfo_1526266521166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366571 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term366571, term366571.getClass(), "id", 0L);
        setField(term366571, term366571.getClass(), "user", null);
        setIntField(term366571, term366571.getClass(), "bgInfo", 0);
        setIntField(term366571, term366571.getClass(), "fieldColor", 0);
        setIntField(term366571, term366571.getClass(), "guideSound", 0);
        setIntField(term366571, term366571.getClass(), "soundEffect", 0);
        setIntField(term366571, term366571.getClass(), "guideLine", 0);
        setIntField(term366571, term366571.getClass(), "speed", 0);
        setIntField(term366571, term366571.getClass(), "optionSet", 0);
        setIntField(term366571, term366571.getClass(), "matching", 0);
        setIntField(term366571, term366571.getClass(), "judgePos", 0);
        setIntField(term366571, term366571.getClass(), "rating", 0);
        setIntField(term366571, term366571.getClass(), "judgeCritical", 0);
        setIntField(term366571, term366571.getClass(), "judgeJustice", 0);
        setIntField(term366571, term366571.getClass(), "judgeAttack", 0);
        setIntField(term366571, term366571.getClass(), "headphone", 0);
        setIntField(term366571, term366571.getClass(), "playerLevel", 0);
        setIntField(term366571, term366571.getClass(), "successTap", 0);
        setIntField(term366571, term366571.getClass(), "successExTap", 0);
        setIntField(term366571, term366571.getClass(), "successSlideHold", 0);
        setIntField(term366571, term366571.getClass(), "successAir", 0);
        setIntField(term366571, term366571.getClass(), "successFlick", 0);
        setIntField(term366571, term366571.getClass(), "successSkill", 0);
        setIntField(term366571, term366571.getClass(), "successTapTimbre", 0);
        setIntField(term366571, term366571.getClass(), "privacy", 0);
        setIntField(term366571, term366571.getClass(), "mirrorFumen", 0);
        setIntField(term366571, term366571.getClass(), "selectMusicFilterLv", 0);
        setIntField(term366571, term366571.getClass(), "sortMusicFilterLv", 0);
        setIntField(term366571, term366571.getClass(), "sortMusicGenre", 0);
        setIntField(term366571, term366571.getClass(), "categoryDetail", 0);
        setIntField(term366571, term366571.getClass(), "judgeTimingOffset", 0);
        setIntField(term366571, term366571.getClass(), "playTimingOffset", 0);
        setIntField(term366571, term366571.getClass(), "fieldWallPosition", 0);
        setIntField(term366571, term366571.getClass(), "resultVoiceShort", 0);
        setIntField(term366571, term366571.getClass(), "notesThickness", 0);
        setIntField(term366571, term366571.getClass(), "judgeAppendSe", 0);
        setIntField(term366571, term366571.getClass(), "trackSkip", 0);
        setIntField(term366571, term366571.getClass(), "hardJudge", 0);
        setIntField(term366571, term366571.getClass(), "speed_120", 0);
        setIntField(term366571, term366571.getClass(), "fieldWallPosition_120", 0);
        setIntField(term366571, term366571.getClass(), "playTimingOffset_120", 0);
        setIntField(term366571, term366571.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term366571, term366571.getClass(), "ext1", 0);
        setIntField(term366571, term366571.getClass(), "ext2", 0);
        setIntField(term366571, term366571.getClass(), "ext3", 0);
        setIntField(term366571, term366571.getClass(), "ext4", 0);
        setIntField(term366571, term366571.getClass(), "ext5", 0);
        setIntField(term366571, term366571.getClass(), "ext6", 0);
        setIntField(term366571, term366571.getClass(), "ext7", 0);
        setIntField(term366571, term366571.getClass(), "ext8", 0);
        setIntField(term366571, term366571.getClass(), "ext9", 0);
        setIntField(term366571, term366571.getClass(), "ext10", 0);
        term366623 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term366623;
        callMethod(klass, "setBgInfo", argTypes, term366571, args);
    }

};


