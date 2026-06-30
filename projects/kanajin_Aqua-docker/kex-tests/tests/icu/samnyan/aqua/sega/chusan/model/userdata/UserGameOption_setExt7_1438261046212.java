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

public class UserGameOption_setExt7_1438261046212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369055;
     Object term369107;

    public UserGameOption_setExt7_1438261046212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369055 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term369055, term369055.getClass(), "id", 0L);
        setField(term369055, term369055.getClass(), "user", null);
        setIntField(term369055, term369055.getClass(), "bgInfo", 0);
        setIntField(term369055, term369055.getClass(), "fieldColor", 0);
        setIntField(term369055, term369055.getClass(), "guideSound", 0);
        setIntField(term369055, term369055.getClass(), "soundEffect", 0);
        setIntField(term369055, term369055.getClass(), "guideLine", 0);
        setIntField(term369055, term369055.getClass(), "speed", 0);
        setIntField(term369055, term369055.getClass(), "optionSet", 0);
        setIntField(term369055, term369055.getClass(), "matching", 0);
        setIntField(term369055, term369055.getClass(), "judgePos", 0);
        setIntField(term369055, term369055.getClass(), "rating", 0);
        setIntField(term369055, term369055.getClass(), "judgeCritical", 0);
        setIntField(term369055, term369055.getClass(), "judgeJustice", 0);
        setIntField(term369055, term369055.getClass(), "judgeAttack", 0);
        setIntField(term369055, term369055.getClass(), "headphone", 0);
        setIntField(term369055, term369055.getClass(), "playerLevel", 0);
        setIntField(term369055, term369055.getClass(), "successTap", 0);
        setIntField(term369055, term369055.getClass(), "successExTap", 0);
        setIntField(term369055, term369055.getClass(), "successSlideHold", 0);
        setIntField(term369055, term369055.getClass(), "successAir", 0);
        setIntField(term369055, term369055.getClass(), "successFlick", 0);
        setIntField(term369055, term369055.getClass(), "successSkill", 0);
        setIntField(term369055, term369055.getClass(), "successTapTimbre", 0);
        setIntField(term369055, term369055.getClass(), "privacy", 0);
        setIntField(term369055, term369055.getClass(), "mirrorFumen", 0);
        setIntField(term369055, term369055.getClass(), "selectMusicFilterLv", 0);
        setIntField(term369055, term369055.getClass(), "sortMusicFilterLv", 0);
        setIntField(term369055, term369055.getClass(), "sortMusicGenre", 0);
        setIntField(term369055, term369055.getClass(), "categoryDetail", 0);
        setIntField(term369055, term369055.getClass(), "judgeTimingOffset", 0);
        setIntField(term369055, term369055.getClass(), "playTimingOffset", 0);
        setIntField(term369055, term369055.getClass(), "fieldWallPosition", 0);
        setIntField(term369055, term369055.getClass(), "resultVoiceShort", 0);
        setIntField(term369055, term369055.getClass(), "notesThickness", 0);
        setIntField(term369055, term369055.getClass(), "judgeAppendSe", 0);
        setIntField(term369055, term369055.getClass(), "trackSkip", 0);
        setIntField(term369055, term369055.getClass(), "hardJudge", 0);
        setIntField(term369055, term369055.getClass(), "speed_120", 0);
        setIntField(term369055, term369055.getClass(), "fieldWallPosition_120", 0);
        setIntField(term369055, term369055.getClass(), "playTimingOffset_120", 0);
        setIntField(term369055, term369055.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term369055, term369055.getClass(), "ext1", 0);
        setIntField(term369055, term369055.getClass(), "ext2", 0);
        setIntField(term369055, term369055.getClass(), "ext3", 0);
        setIntField(term369055, term369055.getClass(), "ext4", 0);
        setIntField(term369055, term369055.getClass(), "ext5", 0);
        setIntField(term369055, term369055.getClass(), "ext6", 0);
        setIntField(term369055, term369055.getClass(), "ext7", 0);
        setIntField(term369055, term369055.getClass(), "ext8", 0);
        setIntField(term369055, term369055.getClass(), "ext9", 0);
        setIntField(term369055, term369055.getClass(), "ext10", 0);
        term369107 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term369107;
        callMethod(klass, "setExt7", argTypes, term369055, args);
    }

};


