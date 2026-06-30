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

public class UserPlaylog_setJudgeJustice_1996272085208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462676;
     Object term462724;

    public UserPlaylog_setJudgeJustice_1996272085208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462676 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term462676, term462676.getClass(), "id", 0L);
        setField(term462676, term462676.getClass(), "user", null);
        setField(term462676, term462676.getClass(), "romVersion", null);
        setIntField(term462676, term462676.getClass(), "orderId", 0);
        setIntField(term462676, term462676.getClass(), "sortNumber", 0);
        setIntField(term462676, term462676.getClass(), "placeId", 0);
        setField(term462676, term462676.getClass(), "playDate", null);
        setField(term462676, term462676.getClass(), "userPlayDate", null);
        setIntField(term462676, term462676.getClass(), "musicId", 0);
        setIntField(term462676, term462676.getClass(), "level", 0);
        setIntField(term462676, term462676.getClass(), "customId", 0);
        setIntField(term462676, term462676.getClass(), "playedUserId1", 0);
        setIntField(term462676, term462676.getClass(), "playedUserId2", 0);
        setIntField(term462676, term462676.getClass(), "playedUserId3", 0);
        setField(term462676, term462676.getClass(), "playedUserName1", null);
        setField(term462676, term462676.getClass(), "playedUserName2", null);
        setField(term462676, term462676.getClass(), "playedUserName3", null);
        setIntField(term462676, term462676.getClass(), "playedMusicLevel1", 0);
        setIntField(term462676, term462676.getClass(), "playedMusicLevel2", 0);
        setIntField(term462676, term462676.getClass(), "playedMusicLevel3", 0);
        setIntField(term462676, term462676.getClass(), "playedCustom1", 0);
        setIntField(term462676, term462676.getClass(), "playedCustom2", 0);
        setIntField(term462676, term462676.getClass(), "playedCustom3", 0);
        setIntField(term462676, term462676.getClass(), "track", 0);
        setIntField(term462676, term462676.getClass(), "score", 0);
        setIntField(term462676, term462676.getClass(), "rank", 0);
        setIntField(term462676, term462676.getClass(), "maxCombo", 0);
        setIntField(term462676, term462676.getClass(), "maxChain", 0);
        setIntField(term462676, term462676.getClass(), "rateTap", 0);
        setIntField(term462676, term462676.getClass(), "rateHold", 0);
        setIntField(term462676, term462676.getClass(), "rateSlide", 0);
        setIntField(term462676, term462676.getClass(), "rateAir", 0);
        setIntField(term462676, term462676.getClass(), "rateFlick", 0);
        setIntField(term462676, term462676.getClass(), "judgeGuilty", 0);
        setIntField(term462676, term462676.getClass(), "judgeAttack", 0);
        setIntField(term462676, term462676.getClass(), "judgeJustice", 0);
        setIntField(term462676, term462676.getClass(), "judgeCritical", 0);
        setIntField(term462676, term462676.getClass(), "judgeHeaven", 0);
        setIntField(term462676, term462676.getClass(), "eventId", 0);
        setIntField(term462676, term462676.getClass(), "playerRating", 0);
        setBooleanField(term462676, term462676.getClass(), "isNewRecord", false);
        setBooleanField(term462676, term462676.getClass(), "isFullCombo", false);
        setIntField(term462676, term462676.getClass(), "fullChainKind", 0);
        setBooleanField(term462676, term462676.getClass(), "isAllJustice", false);
        setBooleanField(term462676, term462676.getClass(), "isContinue", false);
        setBooleanField(term462676, term462676.getClass(), "isFreeToPlay", false);
        setIntField(term462676, term462676.getClass(), "characterId", 0);
        setIntField(term462676, term462676.getClass(), "charaIllustId", 0);
        setIntField(term462676, term462676.getClass(), "skillId", 0);
        setIntField(term462676, term462676.getClass(), "playKind", 0);
        setBooleanField(term462676, term462676.getClass(), "isClear", false);
        setIntField(term462676, term462676.getClass(), "skillLevel", 0);
        setIntField(term462676, term462676.getClass(), "skillEffect", 0);
        setField(term462676, term462676.getClass(), "placeName", null);
        setIntField(term462676, term462676.getClass(), "commonId", 0);
        term462724 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term462724;
        callMethod(klass, "setJudgeJustice", argTypes, term462676, args);
    }

};


