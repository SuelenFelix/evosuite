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

public class UserGameOption_getExt3_1227275068156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366049;

    public UserGameOption_getExt3_1227275068156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366049 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term366049, term366049.getClass(), "id", 0L);
        setField(term366049, term366049.getClass(), "user", null);
        setIntField(term366049, term366049.getClass(), "bgInfo", 0);
        setIntField(term366049, term366049.getClass(), "fieldColor", 0);
        setIntField(term366049, term366049.getClass(), "guideSound", 0);
        setIntField(term366049, term366049.getClass(), "soundEffect", 0);
        setIntField(term366049, term366049.getClass(), "guideLine", 0);
        setIntField(term366049, term366049.getClass(), "speed", 0);
        setIntField(term366049, term366049.getClass(), "optionSet", 0);
        setIntField(term366049, term366049.getClass(), "matching", 0);
        setIntField(term366049, term366049.getClass(), "judgePos", 0);
        setIntField(term366049, term366049.getClass(), "rating", 0);
        setIntField(term366049, term366049.getClass(), "judgeCritical", 0);
        setIntField(term366049, term366049.getClass(), "judgeJustice", 0);
        setIntField(term366049, term366049.getClass(), "judgeAttack", 0);
        setIntField(term366049, term366049.getClass(), "headphone", 0);
        setIntField(term366049, term366049.getClass(), "playerLevel", 0);
        setIntField(term366049, term366049.getClass(), "successTap", 0);
        setIntField(term366049, term366049.getClass(), "successExTap", 0);
        setIntField(term366049, term366049.getClass(), "successSlideHold", 0);
        setIntField(term366049, term366049.getClass(), "successAir", 0);
        setIntField(term366049, term366049.getClass(), "successFlick", 0);
        setIntField(term366049, term366049.getClass(), "successSkill", 0);
        setIntField(term366049, term366049.getClass(), "successTapTimbre", 0);
        setIntField(term366049, term366049.getClass(), "privacy", 0);
        setIntField(term366049, term366049.getClass(), "mirrorFumen", 0);
        setIntField(term366049, term366049.getClass(), "selectMusicFilterLv", 0);
        setIntField(term366049, term366049.getClass(), "sortMusicFilterLv", 0);
        setIntField(term366049, term366049.getClass(), "sortMusicGenre", 0);
        setIntField(term366049, term366049.getClass(), "categoryDetail", 0);
        setIntField(term366049, term366049.getClass(), "judgeTimingOffset", 0);
        setIntField(term366049, term366049.getClass(), "playTimingOffset", 0);
        setIntField(term366049, term366049.getClass(), "fieldWallPosition", 0);
        setIntField(term366049, term366049.getClass(), "resultVoiceShort", 0);
        setIntField(term366049, term366049.getClass(), "notesThickness", 0);
        setIntField(term366049, term366049.getClass(), "judgeAppendSe", 0);
        setIntField(term366049, term366049.getClass(), "trackSkip", 0);
        setIntField(term366049, term366049.getClass(), "hardJudge", 0);
        setIntField(term366049, term366049.getClass(), "speed_120", 0);
        setIntField(term366049, term366049.getClass(), "fieldWallPosition_120", 0);
        setIntField(term366049, term366049.getClass(), "playTimingOffset_120", 0);
        setIntField(term366049, term366049.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term366049, term366049.getClass(), "ext1", 0);
        setIntField(term366049, term366049.getClass(), "ext2", 0);
        setIntField(term366049, term366049.getClass(), "ext3", 0);
        setIntField(term366049, term366049.getClass(), "ext4", 0);
        setIntField(term366049, term366049.getClass(), "ext5", 0);
        setIntField(term366049, term366049.getClass(), "ext6", 0);
        setIntField(term366049, term366049.getClass(), "ext7", 0);
        setIntField(term366049, term366049.getClass(), "ext8", 0);
        setIntField(term366049, term366049.getClass(), "ext9", 0);
        setIntField(term366049, term366049.getClass(), "ext10", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt3", argTypes, term366049, args);
    }

};


