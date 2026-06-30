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

public class UserGameOption_setJudgePos_846229393174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367003;
     Object term367055;

    public UserGameOption_setJudgePos_846229393174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367003 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term367003, term367003.getClass(), "id", 0L);
        setField(term367003, term367003.getClass(), "user", null);
        setIntField(term367003, term367003.getClass(), "bgInfo", 0);
        setIntField(term367003, term367003.getClass(), "fieldColor", 0);
        setIntField(term367003, term367003.getClass(), "guideSound", 0);
        setIntField(term367003, term367003.getClass(), "soundEffect", 0);
        setIntField(term367003, term367003.getClass(), "guideLine", 0);
        setIntField(term367003, term367003.getClass(), "speed", 0);
        setIntField(term367003, term367003.getClass(), "optionSet", 0);
        setIntField(term367003, term367003.getClass(), "matching", 0);
        setIntField(term367003, term367003.getClass(), "judgePos", 0);
        setIntField(term367003, term367003.getClass(), "rating", 0);
        setIntField(term367003, term367003.getClass(), "judgeCritical", 0);
        setIntField(term367003, term367003.getClass(), "judgeJustice", 0);
        setIntField(term367003, term367003.getClass(), "judgeAttack", 0);
        setIntField(term367003, term367003.getClass(), "headphone", 0);
        setIntField(term367003, term367003.getClass(), "playerLevel", 0);
        setIntField(term367003, term367003.getClass(), "successTap", 0);
        setIntField(term367003, term367003.getClass(), "successExTap", 0);
        setIntField(term367003, term367003.getClass(), "successSlideHold", 0);
        setIntField(term367003, term367003.getClass(), "successAir", 0);
        setIntField(term367003, term367003.getClass(), "successFlick", 0);
        setIntField(term367003, term367003.getClass(), "successSkill", 0);
        setIntField(term367003, term367003.getClass(), "successTapTimbre", 0);
        setIntField(term367003, term367003.getClass(), "privacy", 0);
        setIntField(term367003, term367003.getClass(), "mirrorFumen", 0);
        setIntField(term367003, term367003.getClass(), "selectMusicFilterLv", 0);
        setIntField(term367003, term367003.getClass(), "sortMusicFilterLv", 0);
        setIntField(term367003, term367003.getClass(), "sortMusicGenre", 0);
        setIntField(term367003, term367003.getClass(), "categoryDetail", 0);
        setIntField(term367003, term367003.getClass(), "judgeTimingOffset", 0);
        setIntField(term367003, term367003.getClass(), "playTimingOffset", 0);
        setIntField(term367003, term367003.getClass(), "fieldWallPosition", 0);
        setIntField(term367003, term367003.getClass(), "resultVoiceShort", 0);
        setIntField(term367003, term367003.getClass(), "notesThickness", 0);
        setIntField(term367003, term367003.getClass(), "judgeAppendSe", 0);
        setIntField(term367003, term367003.getClass(), "trackSkip", 0);
        setIntField(term367003, term367003.getClass(), "hardJudge", 0);
        setIntField(term367003, term367003.getClass(), "speed_120", 0);
        setIntField(term367003, term367003.getClass(), "fieldWallPosition_120", 0);
        setIntField(term367003, term367003.getClass(), "playTimingOffset_120", 0);
        setIntField(term367003, term367003.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term367003, term367003.getClass(), "ext1", 0);
        setIntField(term367003, term367003.getClass(), "ext2", 0);
        setIntField(term367003, term367003.getClass(), "ext3", 0);
        setIntField(term367003, term367003.getClass(), "ext4", 0);
        setIntField(term367003, term367003.getClass(), "ext5", 0);
        setIntField(term367003, term367003.getClass(), "ext6", 0);
        setIntField(term367003, term367003.getClass(), "ext7", 0);
        setIntField(term367003, term367003.getClass(), "ext8", 0);
        setIntField(term367003, term367003.getClass(), "ext9", 0);
        setIntField(term367003, term367003.getClass(), "ext10", 0);
        term367055 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term367055;
        callMethod(klass, "setJudgePos", argTypes, term367003, args);
    }

};


