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

public class UserGameOption_setSortMusicGenre_1375758640192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367975;
     Object term368027;

    public UserGameOption_setSortMusicGenre_1375758640192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367975 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term367975, term367975.getClass(), "id", 0L);
        setField(term367975, term367975.getClass(), "user", null);
        setIntField(term367975, term367975.getClass(), "bgInfo", 0);
        setIntField(term367975, term367975.getClass(), "fieldColor", 0);
        setIntField(term367975, term367975.getClass(), "guideSound", 0);
        setIntField(term367975, term367975.getClass(), "soundEffect", 0);
        setIntField(term367975, term367975.getClass(), "guideLine", 0);
        setIntField(term367975, term367975.getClass(), "speed", 0);
        setIntField(term367975, term367975.getClass(), "optionSet", 0);
        setIntField(term367975, term367975.getClass(), "matching", 0);
        setIntField(term367975, term367975.getClass(), "judgePos", 0);
        setIntField(term367975, term367975.getClass(), "rating", 0);
        setIntField(term367975, term367975.getClass(), "judgeCritical", 0);
        setIntField(term367975, term367975.getClass(), "judgeJustice", 0);
        setIntField(term367975, term367975.getClass(), "judgeAttack", 0);
        setIntField(term367975, term367975.getClass(), "headphone", 0);
        setIntField(term367975, term367975.getClass(), "playerLevel", 0);
        setIntField(term367975, term367975.getClass(), "successTap", 0);
        setIntField(term367975, term367975.getClass(), "successExTap", 0);
        setIntField(term367975, term367975.getClass(), "successSlideHold", 0);
        setIntField(term367975, term367975.getClass(), "successAir", 0);
        setIntField(term367975, term367975.getClass(), "successFlick", 0);
        setIntField(term367975, term367975.getClass(), "successSkill", 0);
        setIntField(term367975, term367975.getClass(), "successTapTimbre", 0);
        setIntField(term367975, term367975.getClass(), "privacy", 0);
        setIntField(term367975, term367975.getClass(), "mirrorFumen", 0);
        setIntField(term367975, term367975.getClass(), "selectMusicFilterLv", 0);
        setIntField(term367975, term367975.getClass(), "sortMusicFilterLv", 0);
        setIntField(term367975, term367975.getClass(), "sortMusicGenre", 0);
        setIntField(term367975, term367975.getClass(), "categoryDetail", 0);
        setIntField(term367975, term367975.getClass(), "judgeTimingOffset", 0);
        setIntField(term367975, term367975.getClass(), "playTimingOffset", 0);
        setIntField(term367975, term367975.getClass(), "fieldWallPosition", 0);
        setIntField(term367975, term367975.getClass(), "resultVoiceShort", 0);
        setIntField(term367975, term367975.getClass(), "notesThickness", 0);
        setIntField(term367975, term367975.getClass(), "judgeAppendSe", 0);
        setIntField(term367975, term367975.getClass(), "trackSkip", 0);
        setIntField(term367975, term367975.getClass(), "hardJudge", 0);
        setIntField(term367975, term367975.getClass(), "speed_120", 0);
        setIntField(term367975, term367975.getClass(), "fieldWallPosition_120", 0);
        setIntField(term367975, term367975.getClass(), "playTimingOffset_120", 0);
        setIntField(term367975, term367975.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term367975, term367975.getClass(), "ext1", 0);
        setIntField(term367975, term367975.getClass(), "ext2", 0);
        setIntField(term367975, term367975.getClass(), "ext3", 0);
        setIntField(term367975, term367975.getClass(), "ext4", 0);
        setIntField(term367975, term367975.getClass(), "ext5", 0);
        setIntField(term367975, term367975.getClass(), "ext6", 0);
        setIntField(term367975, term367975.getClass(), "ext7", 0);
        setIntField(term367975, term367975.getClass(), "ext8", 0);
        setIntField(term367975, term367975.getClass(), "ext9", 0);
        setIntField(term367975, term367975.getClass(), "ext10", 0);
        term368027 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term368027;
        callMethod(klass, "setSortMusicGenre", argTypes, term367975, args);
    }

};


