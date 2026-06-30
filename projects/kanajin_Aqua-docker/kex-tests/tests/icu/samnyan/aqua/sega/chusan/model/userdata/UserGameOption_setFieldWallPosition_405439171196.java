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

public class UserGameOption_setFieldWallPosition_405439171196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368191;
     Object term368243;

    public UserGameOption_setFieldWallPosition_405439171196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368191 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term368191, term368191.getClass(), "id", 0L);
        setField(term368191, term368191.getClass(), "user", null);
        setIntField(term368191, term368191.getClass(), "bgInfo", 0);
        setIntField(term368191, term368191.getClass(), "fieldColor", 0);
        setIntField(term368191, term368191.getClass(), "guideSound", 0);
        setIntField(term368191, term368191.getClass(), "soundEffect", 0);
        setIntField(term368191, term368191.getClass(), "guideLine", 0);
        setIntField(term368191, term368191.getClass(), "speed", 0);
        setIntField(term368191, term368191.getClass(), "optionSet", 0);
        setIntField(term368191, term368191.getClass(), "matching", 0);
        setIntField(term368191, term368191.getClass(), "judgePos", 0);
        setIntField(term368191, term368191.getClass(), "rating", 0);
        setIntField(term368191, term368191.getClass(), "judgeCritical", 0);
        setIntField(term368191, term368191.getClass(), "judgeJustice", 0);
        setIntField(term368191, term368191.getClass(), "judgeAttack", 0);
        setIntField(term368191, term368191.getClass(), "headphone", 0);
        setIntField(term368191, term368191.getClass(), "playerLevel", 0);
        setIntField(term368191, term368191.getClass(), "successTap", 0);
        setIntField(term368191, term368191.getClass(), "successExTap", 0);
        setIntField(term368191, term368191.getClass(), "successSlideHold", 0);
        setIntField(term368191, term368191.getClass(), "successAir", 0);
        setIntField(term368191, term368191.getClass(), "successFlick", 0);
        setIntField(term368191, term368191.getClass(), "successSkill", 0);
        setIntField(term368191, term368191.getClass(), "successTapTimbre", 0);
        setIntField(term368191, term368191.getClass(), "privacy", 0);
        setIntField(term368191, term368191.getClass(), "mirrorFumen", 0);
        setIntField(term368191, term368191.getClass(), "selectMusicFilterLv", 0);
        setIntField(term368191, term368191.getClass(), "sortMusicFilterLv", 0);
        setIntField(term368191, term368191.getClass(), "sortMusicGenre", 0);
        setIntField(term368191, term368191.getClass(), "categoryDetail", 0);
        setIntField(term368191, term368191.getClass(), "judgeTimingOffset", 0);
        setIntField(term368191, term368191.getClass(), "playTimingOffset", 0);
        setIntField(term368191, term368191.getClass(), "fieldWallPosition", 0);
        setIntField(term368191, term368191.getClass(), "resultVoiceShort", 0);
        setIntField(term368191, term368191.getClass(), "notesThickness", 0);
        setIntField(term368191, term368191.getClass(), "judgeAppendSe", 0);
        setIntField(term368191, term368191.getClass(), "trackSkip", 0);
        setIntField(term368191, term368191.getClass(), "hardJudge", 0);
        setIntField(term368191, term368191.getClass(), "speed_120", 0);
        setIntField(term368191, term368191.getClass(), "fieldWallPosition_120", 0);
        setIntField(term368191, term368191.getClass(), "playTimingOffset_120", 0);
        setIntField(term368191, term368191.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term368191, term368191.getClass(), "ext1", 0);
        setIntField(term368191, term368191.getClass(), "ext2", 0);
        setIntField(term368191, term368191.getClass(), "ext3", 0);
        setIntField(term368191, term368191.getClass(), "ext4", 0);
        setIntField(term368191, term368191.getClass(), "ext5", 0);
        setIntField(term368191, term368191.getClass(), "ext6", 0);
        setIntField(term368191, term368191.getClass(), "ext7", 0);
        setIntField(term368191, term368191.getClass(), "ext8", 0);
        setIntField(term368191, term368191.getClass(), "ext9", 0);
        setIntField(term368191, term368191.getClass(), "ext10", 0);
        term368243 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term368243;
        callMethod(klass, "setFieldWallPosition", argTypes, term368191, args);
    }

};


