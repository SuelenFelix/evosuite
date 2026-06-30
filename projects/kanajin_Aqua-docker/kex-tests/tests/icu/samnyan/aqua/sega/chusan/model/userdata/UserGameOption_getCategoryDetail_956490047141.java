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

public class UserGameOption_getCategoryDetail_956490047141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365269;

    public UserGameOption_getCategoryDetail_956490047141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365269 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term365269, term365269.getClass(), "id", 0L);
        setField(term365269, term365269.getClass(), "user", null);
        setIntField(term365269, term365269.getClass(), "bgInfo", 0);
        setIntField(term365269, term365269.getClass(), "fieldColor", 0);
        setIntField(term365269, term365269.getClass(), "guideSound", 0);
        setIntField(term365269, term365269.getClass(), "soundEffect", 0);
        setIntField(term365269, term365269.getClass(), "guideLine", 0);
        setIntField(term365269, term365269.getClass(), "speed", 0);
        setIntField(term365269, term365269.getClass(), "optionSet", 0);
        setIntField(term365269, term365269.getClass(), "matching", 0);
        setIntField(term365269, term365269.getClass(), "judgePos", 0);
        setIntField(term365269, term365269.getClass(), "rating", 0);
        setIntField(term365269, term365269.getClass(), "judgeCritical", 0);
        setIntField(term365269, term365269.getClass(), "judgeJustice", 0);
        setIntField(term365269, term365269.getClass(), "judgeAttack", 0);
        setIntField(term365269, term365269.getClass(), "headphone", 0);
        setIntField(term365269, term365269.getClass(), "playerLevel", 0);
        setIntField(term365269, term365269.getClass(), "successTap", 0);
        setIntField(term365269, term365269.getClass(), "successExTap", 0);
        setIntField(term365269, term365269.getClass(), "successSlideHold", 0);
        setIntField(term365269, term365269.getClass(), "successAir", 0);
        setIntField(term365269, term365269.getClass(), "successFlick", 0);
        setIntField(term365269, term365269.getClass(), "successSkill", 0);
        setIntField(term365269, term365269.getClass(), "successTapTimbre", 0);
        setIntField(term365269, term365269.getClass(), "privacy", 0);
        setIntField(term365269, term365269.getClass(), "mirrorFumen", 0);
        setIntField(term365269, term365269.getClass(), "selectMusicFilterLv", 0);
        setIntField(term365269, term365269.getClass(), "sortMusicFilterLv", 0);
        setIntField(term365269, term365269.getClass(), "sortMusicGenre", 0);
        setIntField(term365269, term365269.getClass(), "categoryDetail", 0);
        setIntField(term365269, term365269.getClass(), "judgeTimingOffset", 0);
        setIntField(term365269, term365269.getClass(), "playTimingOffset", 0);
        setIntField(term365269, term365269.getClass(), "fieldWallPosition", 0);
        setIntField(term365269, term365269.getClass(), "resultVoiceShort", 0);
        setIntField(term365269, term365269.getClass(), "notesThickness", 0);
        setIntField(term365269, term365269.getClass(), "judgeAppendSe", 0);
        setIntField(term365269, term365269.getClass(), "trackSkip", 0);
        setIntField(term365269, term365269.getClass(), "hardJudge", 0);
        setIntField(term365269, term365269.getClass(), "speed_120", 0);
        setIntField(term365269, term365269.getClass(), "fieldWallPosition_120", 0);
        setIntField(term365269, term365269.getClass(), "playTimingOffset_120", 0);
        setIntField(term365269, term365269.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term365269, term365269.getClass(), "ext1", 0);
        setIntField(term365269, term365269.getClass(), "ext2", 0);
        setIntField(term365269, term365269.getClass(), "ext3", 0);
        setIntField(term365269, term365269.getClass(), "ext4", 0);
        setIntField(term365269, term365269.getClass(), "ext5", 0);
        setIntField(term365269, term365269.getClass(), "ext6", 0);
        setIntField(term365269, term365269.getClass(), "ext7", 0);
        setIntField(term365269, term365269.getClass(), "ext8", 0);
        setIntField(term365269, term365269.getClass(), "ext9", 0);
        setIntField(term365269, term365269.getClass(), "ext10", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryDetail", argTypes, term365269, args);
    }

};


