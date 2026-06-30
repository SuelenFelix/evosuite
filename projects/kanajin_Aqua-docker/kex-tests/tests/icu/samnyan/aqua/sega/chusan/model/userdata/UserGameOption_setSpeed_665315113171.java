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

public class UserGameOption_setSpeed_665315113171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366841;
     Object term366893;

    public UserGameOption_setSpeed_665315113171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366841 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term366841, term366841.getClass(), "id", 0L);
        setField(term366841, term366841.getClass(), "user", null);
        setIntField(term366841, term366841.getClass(), "bgInfo", 0);
        setIntField(term366841, term366841.getClass(), "fieldColor", 0);
        setIntField(term366841, term366841.getClass(), "guideSound", 0);
        setIntField(term366841, term366841.getClass(), "soundEffect", 0);
        setIntField(term366841, term366841.getClass(), "guideLine", 0);
        setIntField(term366841, term366841.getClass(), "speed", 0);
        setIntField(term366841, term366841.getClass(), "optionSet", 0);
        setIntField(term366841, term366841.getClass(), "matching", 0);
        setIntField(term366841, term366841.getClass(), "judgePos", 0);
        setIntField(term366841, term366841.getClass(), "rating", 0);
        setIntField(term366841, term366841.getClass(), "judgeCritical", 0);
        setIntField(term366841, term366841.getClass(), "judgeJustice", 0);
        setIntField(term366841, term366841.getClass(), "judgeAttack", 0);
        setIntField(term366841, term366841.getClass(), "headphone", 0);
        setIntField(term366841, term366841.getClass(), "playerLevel", 0);
        setIntField(term366841, term366841.getClass(), "successTap", 0);
        setIntField(term366841, term366841.getClass(), "successExTap", 0);
        setIntField(term366841, term366841.getClass(), "successSlideHold", 0);
        setIntField(term366841, term366841.getClass(), "successAir", 0);
        setIntField(term366841, term366841.getClass(), "successFlick", 0);
        setIntField(term366841, term366841.getClass(), "successSkill", 0);
        setIntField(term366841, term366841.getClass(), "successTapTimbre", 0);
        setIntField(term366841, term366841.getClass(), "privacy", 0);
        setIntField(term366841, term366841.getClass(), "mirrorFumen", 0);
        setIntField(term366841, term366841.getClass(), "selectMusicFilterLv", 0);
        setIntField(term366841, term366841.getClass(), "sortMusicFilterLv", 0);
        setIntField(term366841, term366841.getClass(), "sortMusicGenre", 0);
        setIntField(term366841, term366841.getClass(), "categoryDetail", 0);
        setIntField(term366841, term366841.getClass(), "judgeTimingOffset", 0);
        setIntField(term366841, term366841.getClass(), "playTimingOffset", 0);
        setIntField(term366841, term366841.getClass(), "fieldWallPosition", 0);
        setIntField(term366841, term366841.getClass(), "resultVoiceShort", 0);
        setIntField(term366841, term366841.getClass(), "notesThickness", 0);
        setIntField(term366841, term366841.getClass(), "judgeAppendSe", 0);
        setIntField(term366841, term366841.getClass(), "trackSkip", 0);
        setIntField(term366841, term366841.getClass(), "hardJudge", 0);
        setIntField(term366841, term366841.getClass(), "speed_120", 0);
        setIntField(term366841, term366841.getClass(), "fieldWallPosition_120", 0);
        setIntField(term366841, term366841.getClass(), "playTimingOffset_120", 0);
        setIntField(term366841, term366841.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term366841, term366841.getClass(), "ext1", 0);
        setIntField(term366841, term366841.getClass(), "ext2", 0);
        setIntField(term366841, term366841.getClass(), "ext3", 0);
        setIntField(term366841, term366841.getClass(), "ext4", 0);
        setIntField(term366841, term366841.getClass(), "ext5", 0);
        setIntField(term366841, term366841.getClass(), "ext6", 0);
        setIntField(term366841, term366841.getClass(), "ext7", 0);
        setIntField(term366841, term366841.getClass(), "ext8", 0);
        setIntField(term366841, term366841.getClass(), "ext9", 0);
        setIntField(term366841, term366841.getClass(), "ext10", 0);
        term366893 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term366893;
        callMethod(klass, "setSpeed", argTypes, term366841, args);
    }

};


