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

public class UserGameOption_setSelectMusicFilterLv_2082024411190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367867;
     Object term367919;

    public UserGameOption_setSelectMusicFilterLv_2082024411190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367867 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term367867, term367867.getClass(), "id", 0L);
        setField(term367867, term367867.getClass(), "user", null);
        setIntField(term367867, term367867.getClass(), "bgInfo", 0);
        setIntField(term367867, term367867.getClass(), "fieldColor", 0);
        setIntField(term367867, term367867.getClass(), "guideSound", 0);
        setIntField(term367867, term367867.getClass(), "soundEffect", 0);
        setIntField(term367867, term367867.getClass(), "guideLine", 0);
        setIntField(term367867, term367867.getClass(), "speed", 0);
        setIntField(term367867, term367867.getClass(), "optionSet", 0);
        setIntField(term367867, term367867.getClass(), "matching", 0);
        setIntField(term367867, term367867.getClass(), "judgePos", 0);
        setIntField(term367867, term367867.getClass(), "rating", 0);
        setIntField(term367867, term367867.getClass(), "judgeCritical", 0);
        setIntField(term367867, term367867.getClass(), "judgeJustice", 0);
        setIntField(term367867, term367867.getClass(), "judgeAttack", 0);
        setIntField(term367867, term367867.getClass(), "headphone", 0);
        setIntField(term367867, term367867.getClass(), "playerLevel", 0);
        setIntField(term367867, term367867.getClass(), "successTap", 0);
        setIntField(term367867, term367867.getClass(), "successExTap", 0);
        setIntField(term367867, term367867.getClass(), "successSlideHold", 0);
        setIntField(term367867, term367867.getClass(), "successAir", 0);
        setIntField(term367867, term367867.getClass(), "successFlick", 0);
        setIntField(term367867, term367867.getClass(), "successSkill", 0);
        setIntField(term367867, term367867.getClass(), "successTapTimbre", 0);
        setIntField(term367867, term367867.getClass(), "privacy", 0);
        setIntField(term367867, term367867.getClass(), "mirrorFumen", 0);
        setIntField(term367867, term367867.getClass(), "selectMusicFilterLv", 0);
        setIntField(term367867, term367867.getClass(), "sortMusicFilterLv", 0);
        setIntField(term367867, term367867.getClass(), "sortMusicGenre", 0);
        setIntField(term367867, term367867.getClass(), "categoryDetail", 0);
        setIntField(term367867, term367867.getClass(), "judgeTimingOffset", 0);
        setIntField(term367867, term367867.getClass(), "playTimingOffset", 0);
        setIntField(term367867, term367867.getClass(), "fieldWallPosition", 0);
        setIntField(term367867, term367867.getClass(), "resultVoiceShort", 0);
        setIntField(term367867, term367867.getClass(), "notesThickness", 0);
        setIntField(term367867, term367867.getClass(), "judgeAppendSe", 0);
        setIntField(term367867, term367867.getClass(), "trackSkip", 0);
        setIntField(term367867, term367867.getClass(), "hardJudge", 0);
        setIntField(term367867, term367867.getClass(), "speed_120", 0);
        setIntField(term367867, term367867.getClass(), "fieldWallPosition_120", 0);
        setIntField(term367867, term367867.getClass(), "playTimingOffset_120", 0);
        setIntField(term367867, term367867.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term367867, term367867.getClass(), "ext1", 0);
        setIntField(term367867, term367867.getClass(), "ext2", 0);
        setIntField(term367867, term367867.getClass(), "ext3", 0);
        setIntField(term367867, term367867.getClass(), "ext4", 0);
        setIntField(term367867, term367867.getClass(), "ext5", 0);
        setIntField(term367867, term367867.getClass(), "ext6", 0);
        setIntField(term367867, term367867.getClass(), "ext7", 0);
        setIntField(term367867, term367867.getClass(), "ext8", 0);
        setIntField(term367867, term367867.getClass(), "ext9", 0);
        setIntField(term367867, term367867.getClass(), "ext10", 0);
        term367919 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term367919;
        callMethod(klass, "setSelectMusicFilterLv", argTypes, term367867, args);
    }

};


