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
import java.lang.Long;

public class UserGameOption_setId_354085583164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366465;
     Object term366517;

    public UserGameOption_setId_354085583164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366465 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term366465, term366465.getClass(), "id", 0L);
        setField(term366465, term366465.getClass(), "user", null);
        setIntField(term366465, term366465.getClass(), "bgInfo", 0);
        setIntField(term366465, term366465.getClass(), "fieldColor", 0);
        setIntField(term366465, term366465.getClass(), "guideSound", 0);
        setIntField(term366465, term366465.getClass(), "soundEffect", 0);
        setIntField(term366465, term366465.getClass(), "guideLine", 0);
        setIntField(term366465, term366465.getClass(), "speed", 0);
        setIntField(term366465, term366465.getClass(), "optionSet", 0);
        setIntField(term366465, term366465.getClass(), "matching", 0);
        setIntField(term366465, term366465.getClass(), "judgePos", 0);
        setIntField(term366465, term366465.getClass(), "rating", 0);
        setIntField(term366465, term366465.getClass(), "judgeCritical", 0);
        setIntField(term366465, term366465.getClass(), "judgeJustice", 0);
        setIntField(term366465, term366465.getClass(), "judgeAttack", 0);
        setIntField(term366465, term366465.getClass(), "headphone", 0);
        setIntField(term366465, term366465.getClass(), "playerLevel", 0);
        setIntField(term366465, term366465.getClass(), "successTap", 0);
        setIntField(term366465, term366465.getClass(), "successExTap", 0);
        setIntField(term366465, term366465.getClass(), "successSlideHold", 0);
        setIntField(term366465, term366465.getClass(), "successAir", 0);
        setIntField(term366465, term366465.getClass(), "successFlick", 0);
        setIntField(term366465, term366465.getClass(), "successSkill", 0);
        setIntField(term366465, term366465.getClass(), "successTapTimbre", 0);
        setIntField(term366465, term366465.getClass(), "privacy", 0);
        setIntField(term366465, term366465.getClass(), "mirrorFumen", 0);
        setIntField(term366465, term366465.getClass(), "selectMusicFilterLv", 0);
        setIntField(term366465, term366465.getClass(), "sortMusicFilterLv", 0);
        setIntField(term366465, term366465.getClass(), "sortMusicGenre", 0);
        setIntField(term366465, term366465.getClass(), "categoryDetail", 0);
        setIntField(term366465, term366465.getClass(), "judgeTimingOffset", 0);
        setIntField(term366465, term366465.getClass(), "playTimingOffset", 0);
        setIntField(term366465, term366465.getClass(), "fieldWallPosition", 0);
        setIntField(term366465, term366465.getClass(), "resultVoiceShort", 0);
        setIntField(term366465, term366465.getClass(), "notesThickness", 0);
        setIntField(term366465, term366465.getClass(), "judgeAppendSe", 0);
        setIntField(term366465, term366465.getClass(), "trackSkip", 0);
        setIntField(term366465, term366465.getClass(), "hardJudge", 0);
        setIntField(term366465, term366465.getClass(), "speed_120", 0);
        setIntField(term366465, term366465.getClass(), "fieldWallPosition_120", 0);
        setIntField(term366465, term366465.getClass(), "playTimingOffset_120", 0);
        setIntField(term366465, term366465.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term366465, term366465.getClass(), "ext1", 0);
        setIntField(term366465, term366465.getClass(), "ext2", 0);
        setIntField(term366465, term366465.getClass(), "ext3", 0);
        setIntField(term366465, term366465.getClass(), "ext4", 0);
        setIntField(term366465, term366465.getClass(), "ext5", 0);
        setIntField(term366465, term366465.getClass(), "ext6", 0);
        setIntField(term366465, term366465.getClass(), "ext7", 0);
        setIntField(term366465, term366465.getClass(), "ext8", 0);
        setIntField(term366465, term366465.getClass(), "ext9", 0);
        setIntField(term366465, term366465.getClass(), "ext10", 0);
        term366517 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term366517;
        callMethod(klass, "setId", argTypes, term366465, args);
    }

};


