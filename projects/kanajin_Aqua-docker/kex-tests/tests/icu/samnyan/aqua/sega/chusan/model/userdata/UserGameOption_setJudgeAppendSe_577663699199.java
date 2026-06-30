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

public class UserGameOption_setJudgeAppendSe_577663699199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368353;
     Object term368405;

    public UserGameOption_setJudgeAppendSe_577663699199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368353 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption"));
        setLongField(term368353, term368353.getClass(), "id", 0L);
        setField(term368353, term368353.getClass(), "user", null);
        setIntField(term368353, term368353.getClass(), "bgInfo", 0);
        setIntField(term368353, term368353.getClass(), "fieldColor", 0);
        setIntField(term368353, term368353.getClass(), "guideSound", 0);
        setIntField(term368353, term368353.getClass(), "soundEffect", 0);
        setIntField(term368353, term368353.getClass(), "guideLine", 0);
        setIntField(term368353, term368353.getClass(), "speed", 0);
        setIntField(term368353, term368353.getClass(), "optionSet", 0);
        setIntField(term368353, term368353.getClass(), "matching", 0);
        setIntField(term368353, term368353.getClass(), "judgePos", 0);
        setIntField(term368353, term368353.getClass(), "rating", 0);
        setIntField(term368353, term368353.getClass(), "judgeCritical", 0);
        setIntField(term368353, term368353.getClass(), "judgeJustice", 0);
        setIntField(term368353, term368353.getClass(), "judgeAttack", 0);
        setIntField(term368353, term368353.getClass(), "headphone", 0);
        setIntField(term368353, term368353.getClass(), "playerLevel", 0);
        setIntField(term368353, term368353.getClass(), "successTap", 0);
        setIntField(term368353, term368353.getClass(), "successExTap", 0);
        setIntField(term368353, term368353.getClass(), "successSlideHold", 0);
        setIntField(term368353, term368353.getClass(), "successAir", 0);
        setIntField(term368353, term368353.getClass(), "successFlick", 0);
        setIntField(term368353, term368353.getClass(), "successSkill", 0);
        setIntField(term368353, term368353.getClass(), "successTapTimbre", 0);
        setIntField(term368353, term368353.getClass(), "privacy", 0);
        setIntField(term368353, term368353.getClass(), "mirrorFumen", 0);
        setIntField(term368353, term368353.getClass(), "selectMusicFilterLv", 0);
        setIntField(term368353, term368353.getClass(), "sortMusicFilterLv", 0);
        setIntField(term368353, term368353.getClass(), "sortMusicGenre", 0);
        setIntField(term368353, term368353.getClass(), "categoryDetail", 0);
        setIntField(term368353, term368353.getClass(), "judgeTimingOffset", 0);
        setIntField(term368353, term368353.getClass(), "playTimingOffset", 0);
        setIntField(term368353, term368353.getClass(), "fieldWallPosition", 0);
        setIntField(term368353, term368353.getClass(), "resultVoiceShort", 0);
        setIntField(term368353, term368353.getClass(), "notesThickness", 0);
        setIntField(term368353, term368353.getClass(), "judgeAppendSe", 0);
        setIntField(term368353, term368353.getClass(), "trackSkip", 0);
        setIntField(term368353, term368353.getClass(), "hardJudge", 0);
        setIntField(term368353, term368353.getClass(), "speed_120", 0);
        setIntField(term368353, term368353.getClass(), "fieldWallPosition_120", 0);
        setIntField(term368353, term368353.getClass(), "playTimingOffset_120", 0);
        setIntField(term368353, term368353.getClass(), "judgeTimingOffset_120", 0);
        setIntField(term368353, term368353.getClass(), "ext1", 0);
        setIntField(term368353, term368353.getClass(), "ext2", 0);
        setIntField(term368353, term368353.getClass(), "ext3", 0);
        setIntField(term368353, term368353.getClass(), "ext4", 0);
        setIntField(term368353, term368353.getClass(), "ext5", 0);
        setIntField(term368353, term368353.getClass(), "ext6", 0);
        setIntField(term368353, term368353.getClass(), "ext7", 0);
        setIntField(term368353, term368353.getClass(), "ext8", 0);
        setIntField(term368353, term368353.getClass(), "ext9", 0);
        setIntField(term368353, term368353.getClass(), "ext10", 0);
        term368405 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term368405;
        callMethod(klass, "setJudgeAppendSe", argTypes, term368353, args);
    }

};


