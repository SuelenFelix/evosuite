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

public class UserGameOption_getSuccessAir_687773927132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364801;

    public UserGameOption_getSuccessAir_687773927132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364801 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term364801, term364801.getClass(), "id", 0L);
        setField(term364801, term364801.getClass(), "user", null);
        setIntField(term364801, term364801.getClass(), "bgInfo", 0);
        setIntField(term364801, term364801.getClass(), "fieldColor", 0);
        setIntField(term364801, term364801.getClass(), "guideSound", 0);
        setIntField(term364801, term364801.getClass(), "soundEffect", 0);
        setIntField(term364801, term364801.getClass(), "guideLine", 0);
        setIntField(term364801, term364801.getClass(), "speed", 0);
        setIntField(term364801, term364801.getClass(), "optionSet", 0);
        setIntField(term364801, term364801.getClass(), "matching", 0);
        setIntField(term364801, term364801.getClass(), "judgePos", 0);
        setIntField(term364801, term364801.getClass(), "rating", 0);
        setIntField(term364801, term364801.getClass(), "judgeCritical", 0);
        setIntField(term364801, term364801.getClass(), "judgeJustice", 0);
        setIntField(term364801, term364801.getClass(), "judgeAttack", 0);
        setIntField(term364801, term364801.getClass(), "headphone", 0);
        setIntField(term364801, term364801.getClass(), "playerLevel", 0);
        setIntField(term364801, term364801.getClass(), "successTap", 0);
        setIntField(term364801, term364801.getClass(), "successExTap", 0);
        setIntField(term364801, term364801.getClass(), "successSlideHold", 0);
        setIntField(term364801, term364801.getClass(), "successAir", 0);
        setIntField(term364801, term364801.getClass(), "successFlick", 0);
        setIntField(term364801, term364801.getClass(), "successSkill", 0);
        setIntField(term364801, term364801.getClass(), "successTapTimbre", 0);
        setIntField(term364801, term364801.getClass(), "privacy", 0);
        setIntField(term364801, term364801.getClass(), "mirrorFumen", 0);
        setIntField(term364801, term364801.getClass(), "selectMusicFilterLv", 0);
        setIntField(term364801, term364801.getClass(), "sortMusicFilterLv", 0);
        setIntField(term364801, term364801.getClass(), "sortMusicGenre", 0);
        setIntField(term364801, term364801.getClass(), "categoryDetail", 0);
        setIntField(term364801, term364801.getClass(), "judgeTimingOffset", 0);
        setIntField(term364801, term364801.getClass(), "playTimingOffset", 0);
        setIntField(term364801, term364801.getClass(), "fieldWallPosition", 0);
        setIntField(term364801, term364801.getClass(), "resultVoiceShort", 0);
        setIntField(term364801, term364801.getClass(), "notesThickness", 0);
        setIntField(term364801, term364801.getClass(), "judgeAppendSe", 0);
        setIntField(term364801, term364801.getClass(), "trackSkip", 0);
        setIntField(term364801, term364801.getClass(), "hardJudge", 0);
        setIntField(term364801, term364801.getClass(), "speed_120", 0);
        setIntField(term364801, term364801.getClass(), "fieldWallPosition_120", 0);
        setIntField(term364801, term364801.getClass(), "playTimingOffset_120", 0);
        setIntField(term364801, term364801.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term364801, term364801.getClass(), "ext1", 0);
        setIntField(term364801, term364801.getClass(), "ext2", 0);
        setIntField(term364801, term364801.getClass(), "ext3", 0);
        setIntField(term364801, term364801.getClass(), "ext4", 0);
        setIntField(term364801, term364801.getClass(), "ext5", 0);
        setIntField(term364801, term364801.getClass(), "ext6", 0);
        setIntField(term364801, term364801.getClass(), "ext7", 0);
        setIntField(term364801, term364801.getClass(), "ext8", 0);
        setIntField(term364801, term364801.getClass(), "ext9", 0);
        setIntField(term364801, term364801.getClass(), "ext10", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessAir", argTypes, term364801, args);
    }

};


