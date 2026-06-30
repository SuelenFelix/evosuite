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

public class UserGameOption_getExt7_1227271224160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366257;

    public UserGameOption_getExt7_1227271224160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366257 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term366257, term366257.getClass(), "id", 0L);
        setField(term366257, term366257.getClass(), "user", null);
        setIntField(term366257, term366257.getClass(), "bgInfo", 0);
        setIntField(term366257, term366257.getClass(), "fieldColor", 0);
        setIntField(term366257, term366257.getClass(), "guideSound", 0);
        setIntField(term366257, term366257.getClass(), "soundEffect", 0);
        setIntField(term366257, term366257.getClass(), "guideLine", 0);
        setIntField(term366257, term366257.getClass(), "speed", 0);
        setIntField(term366257, term366257.getClass(), "optionSet", 0);
        setIntField(term366257, term366257.getClass(), "matching", 0);
        setIntField(term366257, term366257.getClass(), "judgePos", 0);
        setIntField(term366257, term366257.getClass(), "rating", 0);
        setIntField(term366257, term366257.getClass(), "judgeCritical", 0);
        setIntField(term366257, term366257.getClass(), "judgeJustice", 0);
        setIntField(term366257, term366257.getClass(), "judgeAttack", 0);
        setIntField(term366257, term366257.getClass(), "headphone", 0);
        setIntField(term366257, term366257.getClass(), "playerLevel", 0);
        setIntField(term366257, term366257.getClass(), "successTap", 0);
        setIntField(term366257, term366257.getClass(), "successExTap", 0);
        setIntField(term366257, term366257.getClass(), "successSlideHold", 0);
        setIntField(term366257, term366257.getClass(), "successAir", 0);
        setIntField(term366257, term366257.getClass(), "successFlick", 0);
        setIntField(term366257, term366257.getClass(), "successSkill", 0);
        setIntField(term366257, term366257.getClass(), "successTapTimbre", 0);
        setIntField(term366257, term366257.getClass(), "privacy", 0);
        setIntField(term366257, term366257.getClass(), "mirrorFumen", 0);
        setIntField(term366257, term366257.getClass(), "selectMusicFilterLv", 0);
        setIntField(term366257, term366257.getClass(), "sortMusicFilterLv", 0);
        setIntField(term366257, term366257.getClass(), "sortMusicGenre", 0);
        setIntField(term366257, term366257.getClass(), "categoryDetail", 0);
        setIntField(term366257, term366257.getClass(), "judgeTimingOffset", 0);
        setIntField(term366257, term366257.getClass(), "playTimingOffset", 0);
        setIntField(term366257, term366257.getClass(), "fieldWallPosition", 0);
        setIntField(term366257, term366257.getClass(), "resultVoiceShort", 0);
        setIntField(term366257, term366257.getClass(), "notesThickness", 0);
        setIntField(term366257, term366257.getClass(), "judgeAppendSe", 0);
        setIntField(term366257, term366257.getClass(), "trackSkip", 0);
        setIntField(term366257, term366257.getClass(), "hardJudge", 0);
        setIntField(term366257, term366257.getClass(), "speed_120", 0);
        setIntField(term366257, term366257.getClass(), "fieldWallPosition_120", 0);
        setIntField(term366257, term366257.getClass(), "playTimingOffset_120", 0);
        setIntField(term366257, term366257.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term366257, term366257.getClass(), "ext1", 0);
        setIntField(term366257, term366257.getClass(), "ext2", 0);
        setIntField(term366257, term366257.getClass(), "ext3", 0);
        setIntField(term366257, term366257.getClass(), "ext4", 0);
        setIntField(term366257, term366257.getClass(), "ext5", 0);
        setIntField(term366257, term366257.getClass(), "ext6", 0);
        setIntField(term366257, term366257.getClass(), "ext7", 0);
        setIntField(term366257, term366257.getClass(), "ext8", 0);
        setIntField(term366257, term366257.getClass(), "ext9", 0);
        setIntField(term366257, term366257.getClass(), "ext10", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt7", argTypes, term366257, args);
    }

};


