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

public class UserGameOption_getSuccessSlideHold_1481242593131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364749;

    public UserGameOption_getSuccessSlideHold_1481242593131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364749 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term364749, term364749.getClass(), "id", 0L);
        setField(term364749, term364749.getClass(), "user", null);
        setIntField(term364749, term364749.getClass(), "bgInfo", 0);
        setIntField(term364749, term364749.getClass(), "fieldColor", 0);
        setIntField(term364749, term364749.getClass(), "guideSound", 0);
        setIntField(term364749, term364749.getClass(), "soundEffect", 0);
        setIntField(term364749, term364749.getClass(), "guideLine", 0);
        setIntField(term364749, term364749.getClass(), "speed", 0);
        setIntField(term364749, term364749.getClass(), "optionSet", 0);
        setIntField(term364749, term364749.getClass(), "matching", 0);
        setIntField(term364749, term364749.getClass(), "judgePos", 0);
        setIntField(term364749, term364749.getClass(), "rating", 0);
        setIntField(term364749, term364749.getClass(), "judgeCritical", 0);
        setIntField(term364749, term364749.getClass(), "judgeJustice", 0);
        setIntField(term364749, term364749.getClass(), "judgeAttack", 0);
        setIntField(term364749, term364749.getClass(), "headphone", 0);
        setIntField(term364749, term364749.getClass(), "playerLevel", 0);
        setIntField(term364749, term364749.getClass(), "successTap", 0);
        setIntField(term364749, term364749.getClass(), "successExTap", 0);
        setIntField(term364749, term364749.getClass(), "successSlideHold", 0);
        setIntField(term364749, term364749.getClass(), "successAir", 0);
        setIntField(term364749, term364749.getClass(), "successFlick", 0);
        setIntField(term364749, term364749.getClass(), "successSkill", 0);
        setIntField(term364749, term364749.getClass(), "successTapTimbre", 0);
        setIntField(term364749, term364749.getClass(), "privacy", 0);
        setIntField(term364749, term364749.getClass(), "mirrorFumen", 0);
        setIntField(term364749, term364749.getClass(), "selectMusicFilterLv", 0);
        setIntField(term364749, term364749.getClass(), "sortMusicFilterLv", 0);
        setIntField(term364749, term364749.getClass(), "sortMusicGenre", 0);
        setIntField(term364749, term364749.getClass(), "categoryDetail", 0);
        setIntField(term364749, term364749.getClass(), "judgeTimingOffset", 0);
        setIntField(term364749, term364749.getClass(), "playTimingOffset", 0);
        setIntField(term364749, term364749.getClass(), "fieldWallPosition", 0);
        setIntField(term364749, term364749.getClass(), "resultVoiceShort", 0);
        setIntField(term364749, term364749.getClass(), "notesThickness", 0);
        setIntField(term364749, term364749.getClass(), "judgeAppendSe", 0);
        setIntField(term364749, term364749.getClass(), "trackSkip", 0);
        setIntField(term364749, term364749.getClass(), "hardJudge", 0);
        setIntField(term364749, term364749.getClass(), "speed_120", 0);
        setIntField(term364749, term364749.getClass(), "fieldWallPosition_120", 0);
        setIntField(term364749, term364749.getClass(), "playTimingOffset_120", 0);
        setIntField(term364749, term364749.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term364749, term364749.getClass(), "ext1", 0);
        setIntField(term364749, term364749.getClass(), "ext2", 0);
        setIntField(term364749, term364749.getClass(), "ext3", 0);
        setIntField(term364749, term364749.getClass(), "ext4", 0);
        setIntField(term364749, term364749.getClass(), "ext5", 0);
        setIntField(term364749, term364749.getClass(), "ext6", 0);
        setIntField(term364749, term364749.getClass(), "ext7", 0);
        setIntField(term364749, term364749.getClass(), "ext8", 0);
        setIntField(term364749, term364749.getClass(), "ext9", 0);
        setIntField(term364749, term364749.getClass(), "ext10", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessSlideHold", argTypes, term364749, args);
    }

};


