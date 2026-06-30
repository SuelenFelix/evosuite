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

public class UserGameOption_setGuideSound_1584340295168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366679;
     Object term366731;

    public UserGameOption_setGuideSound_1584340295168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366679 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term366679, term366679.getClass(), "id", 0L);
        setField(term366679, term366679.getClass(), "user", null);
        setIntField(term366679, term366679.getClass(), "bgInfo", 0);
        setIntField(term366679, term366679.getClass(), "fieldColor", 0);
        setIntField(term366679, term366679.getClass(), "guideSound", 0);
        setIntField(term366679, term366679.getClass(), "soundEffect", 0);
        setIntField(term366679, term366679.getClass(), "guideLine", 0);
        setIntField(term366679, term366679.getClass(), "speed", 0);
        setIntField(term366679, term366679.getClass(), "optionSet", 0);
        setIntField(term366679, term366679.getClass(), "matching", 0);
        setIntField(term366679, term366679.getClass(), "judgePos", 0);
        setIntField(term366679, term366679.getClass(), "rating", 0);
        setIntField(term366679, term366679.getClass(), "judgeCritical", 0);
        setIntField(term366679, term366679.getClass(), "judgeJustice", 0);
        setIntField(term366679, term366679.getClass(), "judgeAttack", 0);
        setIntField(term366679, term366679.getClass(), "headphone", 0);
        setIntField(term366679, term366679.getClass(), "playerLevel", 0);
        setIntField(term366679, term366679.getClass(), "successTap", 0);
        setIntField(term366679, term366679.getClass(), "successExTap", 0);
        setIntField(term366679, term366679.getClass(), "successSlideHold", 0);
        setIntField(term366679, term366679.getClass(), "successAir", 0);
        setIntField(term366679, term366679.getClass(), "successFlick", 0);
        setIntField(term366679, term366679.getClass(), "successSkill", 0);
        setIntField(term366679, term366679.getClass(), "successTapTimbre", 0);
        setIntField(term366679, term366679.getClass(), "privacy", 0);
        setIntField(term366679, term366679.getClass(), "mirrorFumen", 0);
        setIntField(term366679, term366679.getClass(), "selectMusicFilterLv", 0);
        setIntField(term366679, term366679.getClass(), "sortMusicFilterLv", 0);
        setIntField(term366679, term366679.getClass(), "sortMusicGenre", 0);
        setIntField(term366679, term366679.getClass(), "categoryDetail", 0);
        setIntField(term366679, term366679.getClass(), "judgeTimingOffset", 0);
        setIntField(term366679, term366679.getClass(), "playTimingOffset", 0);
        setIntField(term366679, term366679.getClass(), "fieldWallPosition", 0);
        setIntField(term366679, term366679.getClass(), "resultVoiceShort", 0);
        setIntField(term366679, term366679.getClass(), "notesThickness", 0);
        setIntField(term366679, term366679.getClass(), "judgeAppendSe", 0);
        setIntField(term366679, term366679.getClass(), "trackSkip", 0);
        setIntField(term366679, term366679.getClass(), "hardJudge", 0);
        setIntField(term366679, term366679.getClass(), "speed_120", 0);
        setIntField(term366679, term366679.getClass(), "fieldWallPosition_120", 0);
        setIntField(term366679, term366679.getClass(), "playTimingOffset_120", 0);
        setIntField(term366679, term366679.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term366679, term366679.getClass(), "ext1", 0);
        setIntField(term366679, term366679.getClass(), "ext2", 0);
        setIntField(term366679, term366679.getClass(), "ext3", 0);
        setIntField(term366679, term366679.getClass(), "ext4", 0);
        setIntField(term366679, term366679.getClass(), "ext5", 0);
        setIntField(term366679, term366679.getClass(), "ext6", 0);
        setIntField(term366679, term366679.getClass(), "ext7", 0);
        setIntField(term366679, term366679.getClass(), "ext8", 0);
        setIntField(term366679, term366679.getClass(), "ext9", 0);
        setIntField(term366679, term366679.getClass(), "ext10", 0);
        term366731 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term366731;
        callMethod(klass, "setGuideSound", argTypes, term366679, args);
    }

};


