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

public class UserGameOption_setJudgeCritical_1833932454176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367111;
     Object term367163;

    public UserGameOption_setJudgeCritical_1833932454176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367111 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term367111, term367111.getClass(), "id", 0L);
        setField(term367111, term367111.getClass(), "user", null);
        setIntField(term367111, term367111.getClass(), "bgInfo", 0);
        setIntField(term367111, term367111.getClass(), "fieldColor", 0);
        setIntField(term367111, term367111.getClass(), "guideSound", 0);
        setIntField(term367111, term367111.getClass(), "soundEffect", 0);
        setIntField(term367111, term367111.getClass(), "guideLine", 0);
        setIntField(term367111, term367111.getClass(), "speed", 0);
        setIntField(term367111, term367111.getClass(), "optionSet", 0);
        setIntField(term367111, term367111.getClass(), "matching", 0);
        setIntField(term367111, term367111.getClass(), "judgePos", 0);
        setIntField(term367111, term367111.getClass(), "rating", 0);
        setIntField(term367111, term367111.getClass(), "judgeCritical", 0);
        setIntField(term367111, term367111.getClass(), "judgeJustice", 0);
        setIntField(term367111, term367111.getClass(), "judgeAttack", 0);
        setIntField(term367111, term367111.getClass(), "headphone", 0);
        setIntField(term367111, term367111.getClass(), "playerLevel", 0);
        setIntField(term367111, term367111.getClass(), "successTap", 0);
        setIntField(term367111, term367111.getClass(), "successExTap", 0);
        setIntField(term367111, term367111.getClass(), "successSlideHold", 0);
        setIntField(term367111, term367111.getClass(), "successAir", 0);
        setIntField(term367111, term367111.getClass(), "successFlick", 0);
        setIntField(term367111, term367111.getClass(), "successSkill", 0);
        setIntField(term367111, term367111.getClass(), "successTapTimbre", 0);
        setIntField(term367111, term367111.getClass(), "privacy", 0);
        setIntField(term367111, term367111.getClass(), "mirrorFumen", 0);
        setIntField(term367111, term367111.getClass(), "selectMusicFilterLv", 0);
        setIntField(term367111, term367111.getClass(), "sortMusicFilterLv", 0);
        setIntField(term367111, term367111.getClass(), "sortMusicGenre", 0);
        setIntField(term367111, term367111.getClass(), "categoryDetail", 0);
        setIntField(term367111, term367111.getClass(), "judgeTimingOffset", 0);
        setIntField(term367111, term367111.getClass(), "playTimingOffset", 0);
        setIntField(term367111, term367111.getClass(), "fieldWallPosition", 0);
        setIntField(term367111, term367111.getClass(), "resultVoiceShort", 0);
        setIntField(term367111, term367111.getClass(), "notesThickness", 0);
        setIntField(term367111, term367111.getClass(), "judgeAppendSe", 0);
        setIntField(term367111, term367111.getClass(), "trackSkip", 0);
        setIntField(term367111, term367111.getClass(), "hardJudge", 0);
        setIntField(term367111, term367111.getClass(), "speed_120", 0);
        setIntField(term367111, term367111.getClass(), "fieldWallPosition_120", 0);
        setIntField(term367111, term367111.getClass(), "playTimingOffset_120", 0);
        setIntField(term367111, term367111.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term367111, term367111.getClass(), "ext1", 0);
        setIntField(term367111, term367111.getClass(), "ext2", 0);
        setIntField(term367111, term367111.getClass(), "ext3", 0);
        setIntField(term367111, term367111.getClass(), "ext4", 0);
        setIntField(term367111, term367111.getClass(), "ext5", 0);
        setIntField(term367111, term367111.getClass(), "ext6", 0);
        setIntField(term367111, term367111.getClass(), "ext7", 0);
        setIntField(term367111, term367111.getClass(), "ext8", 0);
        setIntField(term367111, term367111.getClass(), "ext9", 0);
        setIntField(term367111, term367111.getClass(), "ext10", 0);
        term367163 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term367163;
        callMethod(klass, "setJudgeCritical", argTypes, term367111, args);
    }

};


