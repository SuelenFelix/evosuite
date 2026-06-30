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

public class UserGameOption_getExt4_1227274107157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366101;

    public UserGameOption_getExt4_1227274107157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366101 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term366101, term366101.getClass(), "id", 0L);
        setField(term366101, term366101.getClass(), "user", null);
        setIntField(term366101, term366101.getClass(), "bgInfo", 0);
        setIntField(term366101, term366101.getClass(), "fieldColor", 0);
        setIntField(term366101, term366101.getClass(), "guideSound", 0);
        setIntField(term366101, term366101.getClass(), "soundEffect", 0);
        setIntField(term366101, term366101.getClass(), "guideLine", 0);
        setIntField(term366101, term366101.getClass(), "speed", 0);
        setIntField(term366101, term366101.getClass(), "optionSet", 0);
        setIntField(term366101, term366101.getClass(), "matching", 0);
        setIntField(term366101, term366101.getClass(), "judgePos", 0);
        setIntField(term366101, term366101.getClass(), "rating", 0);
        setIntField(term366101, term366101.getClass(), "judgeCritical", 0);
        setIntField(term366101, term366101.getClass(), "judgeJustice", 0);
        setIntField(term366101, term366101.getClass(), "judgeAttack", 0);
        setIntField(term366101, term366101.getClass(), "headphone", 0);
        setIntField(term366101, term366101.getClass(), "playerLevel", 0);
        setIntField(term366101, term366101.getClass(), "successTap", 0);
        setIntField(term366101, term366101.getClass(), "successExTap", 0);
        setIntField(term366101, term366101.getClass(), "successSlideHold", 0);
        setIntField(term366101, term366101.getClass(), "successAir", 0);
        setIntField(term366101, term366101.getClass(), "successFlick", 0);
        setIntField(term366101, term366101.getClass(), "successSkill", 0);
        setIntField(term366101, term366101.getClass(), "successTapTimbre", 0);
        setIntField(term366101, term366101.getClass(), "privacy", 0);
        setIntField(term366101, term366101.getClass(), "mirrorFumen", 0);
        setIntField(term366101, term366101.getClass(), "selectMusicFilterLv", 0);
        setIntField(term366101, term366101.getClass(), "sortMusicFilterLv", 0);
        setIntField(term366101, term366101.getClass(), "sortMusicGenre", 0);
        setIntField(term366101, term366101.getClass(), "categoryDetail", 0);
        setIntField(term366101, term366101.getClass(), "judgeTimingOffset", 0);
        setIntField(term366101, term366101.getClass(), "playTimingOffset", 0);
        setIntField(term366101, term366101.getClass(), "fieldWallPosition", 0);
        setIntField(term366101, term366101.getClass(), "resultVoiceShort", 0);
        setIntField(term366101, term366101.getClass(), "notesThickness", 0);
        setIntField(term366101, term366101.getClass(), "judgeAppendSe", 0);
        setIntField(term366101, term366101.getClass(), "trackSkip", 0);
        setIntField(term366101, term366101.getClass(), "hardJudge", 0);
        setIntField(term366101, term366101.getClass(), "speed_120", 0);
        setIntField(term366101, term366101.getClass(), "fieldWallPosition_120", 0);
        setIntField(term366101, term366101.getClass(), "playTimingOffset_120", 0);
        setIntField(term366101, term366101.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term366101, term366101.getClass(), "ext1", 0);
        setIntField(term366101, term366101.getClass(), "ext2", 0);
        setIntField(term366101, term366101.getClass(), "ext3", 0);
        setIntField(term366101, term366101.getClass(), "ext4", 0);
        setIntField(term366101, term366101.getClass(), "ext5", 0);
        setIntField(term366101, term366101.getClass(), "ext6", 0);
        setIntField(term366101, term366101.getClass(), "ext7", 0);
        setIntField(term366101, term366101.getClass(), "ext8", 0);
        setIntField(term366101, term366101.getClass(), "ext9", 0);
        setIntField(term366101, term366101.getClass(), "ext10", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt4", argTypes, term366101, args);
    }

};


