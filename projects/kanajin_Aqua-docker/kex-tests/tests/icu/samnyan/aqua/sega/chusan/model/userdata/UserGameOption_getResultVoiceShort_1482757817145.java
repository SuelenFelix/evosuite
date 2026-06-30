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

public class UserGameOption_getResultVoiceShort_1482757817145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365477;

    public UserGameOption_getResultVoiceShort_1482757817145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365477 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term365477, term365477.getClass(), "id", 0L);
        setField(term365477, term365477.getClass(), "user", null);
        setIntField(term365477, term365477.getClass(), "bgInfo", 0);
        setIntField(term365477, term365477.getClass(), "fieldColor", 0);
        setIntField(term365477, term365477.getClass(), "guideSound", 0);
        setIntField(term365477, term365477.getClass(), "soundEffect", 0);
        setIntField(term365477, term365477.getClass(), "guideLine", 0);
        setIntField(term365477, term365477.getClass(), "speed", 0);
        setIntField(term365477, term365477.getClass(), "optionSet", 0);
        setIntField(term365477, term365477.getClass(), "matching", 0);
        setIntField(term365477, term365477.getClass(), "judgePos", 0);
        setIntField(term365477, term365477.getClass(), "rating", 0);
        setIntField(term365477, term365477.getClass(), "judgeCritical", 0);
        setIntField(term365477, term365477.getClass(), "judgeJustice", 0);
        setIntField(term365477, term365477.getClass(), "judgeAttack", 0);
        setIntField(term365477, term365477.getClass(), "headphone", 0);
        setIntField(term365477, term365477.getClass(), "playerLevel", 0);
        setIntField(term365477, term365477.getClass(), "successTap", 0);
        setIntField(term365477, term365477.getClass(), "successExTap", 0);
        setIntField(term365477, term365477.getClass(), "successSlideHold", 0);
        setIntField(term365477, term365477.getClass(), "successAir", 0);
        setIntField(term365477, term365477.getClass(), "successFlick", 0);
        setIntField(term365477, term365477.getClass(), "successSkill", 0);
        setIntField(term365477, term365477.getClass(), "successTapTimbre", 0);
        setIntField(term365477, term365477.getClass(), "privacy", 0);
        setIntField(term365477, term365477.getClass(), "mirrorFumen", 0);
        setIntField(term365477, term365477.getClass(), "selectMusicFilterLv", 0);
        setIntField(term365477, term365477.getClass(), "sortMusicFilterLv", 0);
        setIntField(term365477, term365477.getClass(), "sortMusicGenre", 0);
        setIntField(term365477, term365477.getClass(), "categoryDetail", 0);
        setIntField(term365477, term365477.getClass(), "judgeTimingOffset", 0);
        setIntField(term365477, term365477.getClass(), "playTimingOffset", 0);
        setIntField(term365477, term365477.getClass(), "fieldWallPosition", 0);
        setIntField(term365477, term365477.getClass(), "resultVoiceShort", 0);
        setIntField(term365477, term365477.getClass(), "notesThickness", 0);
        setIntField(term365477, term365477.getClass(), "judgeAppendSe", 0);
        setIntField(term365477, term365477.getClass(), "trackSkip", 0);
        setIntField(term365477, term365477.getClass(), "hardJudge", 0);
        setIntField(term365477, term365477.getClass(), "speed_120", 0);
        setIntField(term365477, term365477.getClass(), "fieldWallPosition_120", 0);
        setIntField(term365477, term365477.getClass(), "playTimingOffset_120", 0);
        setIntField(term365477, term365477.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term365477, term365477.getClass(), "ext1", 0);
        setIntField(term365477, term365477.getClass(), "ext2", 0);
        setIntField(term365477, term365477.getClass(), "ext3", 0);
        setIntField(term365477, term365477.getClass(), "ext4", 0);
        setIntField(term365477, term365477.getClass(), "ext5", 0);
        setIntField(term365477, term365477.getClass(), "ext6", 0);
        setIntField(term365477, term365477.getClass(), "ext7", 0);
        setIntField(term365477, term365477.getClass(), "ext8", 0);
        setIntField(term365477, term365477.getClass(), "ext9", 0);
        setIntField(term365477, term365477.getClass(), "ext10", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResultVoiceShort", argTypes, term365477, args);
    }

};


