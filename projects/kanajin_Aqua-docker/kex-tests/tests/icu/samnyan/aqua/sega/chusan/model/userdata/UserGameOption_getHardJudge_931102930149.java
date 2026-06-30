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

public class UserGameOption_getHardJudge_931102930149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365685;

    public UserGameOption_getHardJudge_931102930149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365685 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term365685, term365685.getClass(), "id", 0L);
        setField(term365685, term365685.getClass(), "user", null);
        setIntField(term365685, term365685.getClass(), "bgInfo", 0);
        setIntField(term365685, term365685.getClass(), "fieldColor", 0);
        setIntField(term365685, term365685.getClass(), "guideSound", 0);
        setIntField(term365685, term365685.getClass(), "soundEffect", 0);
        setIntField(term365685, term365685.getClass(), "guideLine", 0);
        setIntField(term365685, term365685.getClass(), "speed", 0);
        setIntField(term365685, term365685.getClass(), "optionSet", 0);
        setIntField(term365685, term365685.getClass(), "matching", 0);
        setIntField(term365685, term365685.getClass(), "judgePos", 0);
        setIntField(term365685, term365685.getClass(), "rating", 0);
        setIntField(term365685, term365685.getClass(), "judgeCritical", 0);
        setIntField(term365685, term365685.getClass(), "judgeJustice", 0);
        setIntField(term365685, term365685.getClass(), "judgeAttack", 0);
        setIntField(term365685, term365685.getClass(), "headphone", 0);
        setIntField(term365685, term365685.getClass(), "playerLevel", 0);
        setIntField(term365685, term365685.getClass(), "successTap", 0);
        setIntField(term365685, term365685.getClass(), "successExTap", 0);
        setIntField(term365685, term365685.getClass(), "successSlideHold", 0);
        setIntField(term365685, term365685.getClass(), "successAir", 0);
        setIntField(term365685, term365685.getClass(), "successFlick", 0);
        setIntField(term365685, term365685.getClass(), "successSkill", 0);
        setIntField(term365685, term365685.getClass(), "successTapTimbre", 0);
        setIntField(term365685, term365685.getClass(), "privacy", 0);
        setIntField(term365685, term365685.getClass(), "mirrorFumen", 0);
        setIntField(term365685, term365685.getClass(), "selectMusicFilterLv", 0);
        setIntField(term365685, term365685.getClass(), "sortMusicFilterLv", 0);
        setIntField(term365685, term365685.getClass(), "sortMusicGenre", 0);
        setIntField(term365685, term365685.getClass(), "categoryDetail", 0);
        setIntField(term365685, term365685.getClass(), "judgeTimingOffset", 0);
        setIntField(term365685, term365685.getClass(), "playTimingOffset", 0);
        setIntField(term365685, term365685.getClass(), "fieldWallPosition", 0);
        setIntField(term365685, term365685.getClass(), "resultVoiceShort", 0);
        setIntField(term365685, term365685.getClass(), "notesThickness", 0);
        setIntField(term365685, term365685.getClass(), "judgeAppendSe", 0);
        setIntField(term365685, term365685.getClass(), "trackSkip", 0);
        setIntField(term365685, term365685.getClass(), "hardJudge", 0);
        setIntField(term365685, term365685.getClass(), "speed_120", 0);
        setIntField(term365685, term365685.getClass(), "fieldWallPosition_120", 0);
        setIntField(term365685, term365685.getClass(), "playTimingOffset_120", 0);
        setIntField(term365685, term365685.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term365685, term365685.getClass(), "ext1", 0);
        setIntField(term365685, term365685.getClass(), "ext2", 0);
        setIntField(term365685, term365685.getClass(), "ext3", 0);
        setIntField(term365685, term365685.getClass(), "ext4", 0);
        setIntField(term365685, term365685.getClass(), "ext5", 0);
        setIntField(term365685, term365685.getClass(), "ext6", 0);
        setIntField(term365685, term365685.getClass(), "ext7", 0);
        setIntField(term365685, term365685.getClass(), "ext8", 0);
        setIntField(term365685, term365685.getClass(), "ext9", 0);
        setIntField(term365685, term365685.getClass(), "ext10", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHardJudge", argTypes, term365685, args);
    }

};


