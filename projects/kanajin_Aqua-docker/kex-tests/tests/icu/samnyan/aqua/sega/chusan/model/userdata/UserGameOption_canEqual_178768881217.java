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

public class UserGameOption_canEqual_178768881217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369323;

    public UserGameOption_canEqual_178768881217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369323 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term369323, term369323.getClass(), "id", 0L);
        setField(term369323, term369323.getClass(), "user", null);
        setIntField(term369323, term369323.getClass(), "bgInfo", 0);
        setIntField(term369323, term369323.getClass(), "fieldColor", 0);
        setIntField(term369323, term369323.getClass(), "guideSound", 0);
        setIntField(term369323, term369323.getClass(), "soundEffect", 0);
        setIntField(term369323, term369323.getClass(), "guideLine", 0);
        setIntField(term369323, term369323.getClass(), "speed", 0);
        setIntField(term369323, term369323.getClass(), "optionSet", 0);
        setIntField(term369323, term369323.getClass(), "matching", 0);
        setIntField(term369323, term369323.getClass(), "judgePos", 0);
        setIntField(term369323, term369323.getClass(), "rating", 0);
        setIntField(term369323, term369323.getClass(), "judgeCritical", 0);
        setIntField(term369323, term369323.getClass(), "judgeJustice", 0);
        setIntField(term369323, term369323.getClass(), "judgeAttack", 0);
        setIntField(term369323, term369323.getClass(), "headphone", 0);
        setIntField(term369323, term369323.getClass(), "playerLevel", 0);
        setIntField(term369323, term369323.getClass(), "successTap", 0);
        setIntField(term369323, term369323.getClass(), "successExTap", 0);
        setIntField(term369323, term369323.getClass(), "successSlideHold", 0);
        setIntField(term369323, term369323.getClass(), "successAir", 0);
        setIntField(term369323, term369323.getClass(), "successFlick", 0);
        setIntField(term369323, term369323.getClass(), "successSkill", 0);
        setIntField(term369323, term369323.getClass(), "successTapTimbre", 0);
        setIntField(term369323, term369323.getClass(), "privacy", 0);
        setIntField(term369323, term369323.getClass(), "mirrorFumen", 0);
        setIntField(term369323, term369323.getClass(), "selectMusicFilterLv", 0);
        setIntField(term369323, term369323.getClass(), "sortMusicFilterLv", 0);
        setIntField(term369323, term369323.getClass(), "sortMusicGenre", 0);
        setIntField(term369323, term369323.getClass(), "categoryDetail", 0);
        setIntField(term369323, term369323.getClass(), "judgeTimingOffset", 0);
        setIntField(term369323, term369323.getClass(), "playTimingOffset", 0);
        setIntField(term369323, term369323.getClass(), "fieldWallPosition", 0);
        setIntField(term369323, term369323.getClass(), "resultVoiceShort", 0);
        setIntField(term369323, term369323.getClass(), "notesThickness", 0);
        setIntField(term369323, term369323.getClass(), "judgeAppendSe", 0);
        setIntField(term369323, term369323.getClass(), "trackSkip", 0);
        setIntField(term369323, term369323.getClass(), "hardJudge", 0);
        setIntField(term369323, term369323.getClass(), "speed_120", 0);
        setIntField(term369323, term369323.getClass(), "fieldWallPosition_120", 0);
        setIntField(term369323, term369323.getClass(), "playTimingOffset_120", 0);
        setIntField(term369323, term369323.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term369323, term369323.getClass(), "ext1", 0);
        setIntField(term369323, term369323.getClass(), "ext2", 0);
        setIntField(term369323, term369323.getClass(), "ext3", 0);
        setIntField(term369323, term369323.getClass(), "ext4", 0);
        setIntField(term369323, term369323.getClass(), "ext5", 0);
        setIntField(term369323, term369323.getClass(), "ext6", 0);
        setIntField(term369323, term369323.getClass(), "ext7", 0);
        setIntField(term369323, term369323.getClass(), "ext8", 0);
        setIntField(term369323, term369323.getClass(), "ext9", 0);
        setIntField(term369323, term369323.getClass(), "ext10", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term369323, args);
    }

};


