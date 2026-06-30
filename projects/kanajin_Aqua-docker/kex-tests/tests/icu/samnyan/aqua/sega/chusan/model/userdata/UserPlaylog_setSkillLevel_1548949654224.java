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

public class UserPlaylog_setSkillLevel_1548949654224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463476;
     Object term463524;

    public UserPlaylog_setSkillLevel_1548949654224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463476 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term463476, term463476.getClass(), "id", 0L);
        setField(term463476, term463476.getClass(), "user", null);
        setField(term463476, term463476.getClass(), "romVersion", null);
        setIntField(term463476, term463476.getClass(), "orderId", 0);
        setIntField(term463476, term463476.getClass(), "sortNumber", 0);
        setIntField(term463476, term463476.getClass(), "placeId", 0);
        setField(term463476, term463476.getClass(), "playDate", null);
        setField(term463476, term463476.getClass(), "userPlayDate", null);
        setIntField(term463476, term463476.getClass(), "musicId", 0);
        setIntField(term463476, term463476.getClass(), "level", 0);
        setIntField(term463476, term463476.getClass(), "customId", 0);
        setIntField(term463476, term463476.getClass(), "playedUserId1", 0);
        setIntField(term463476, term463476.getClass(), "playedUserId2", 0);
        setIntField(term463476, term463476.getClass(), "playedUserId3", 0);
        setField(term463476, term463476.getClass(), "playedUserName1", null);
        setField(term463476, term463476.getClass(), "playedUserName2", null);
        setField(term463476, term463476.getClass(), "playedUserName3", null);
        setIntField(term463476, term463476.getClass(), "playedMusicLevel1", 0);
        setIntField(term463476, term463476.getClass(), "playedMusicLevel2", 0);
        setIntField(term463476, term463476.getClass(), "playedMusicLevel3", 0);
        setIntField(term463476, term463476.getClass(), "playedCustom1", 0);
        setIntField(term463476, term463476.getClass(), "playedCustom2", 0);
        setIntField(term463476, term463476.getClass(), "playedCustom3", 0);
        setIntField(term463476, term463476.getClass(), "track", 0);
        setIntField(term463476, term463476.getClass(), "score", 0);
        setIntField(term463476, term463476.getClass(), "rank", 0);
        setIntField(term463476, term463476.getClass(), "maxCombo", 0);
        setIntField(term463476, term463476.getClass(), "maxChain", 0);
        setIntField(term463476, term463476.getClass(), "rateTap", 0);
        setIntField(term463476, term463476.getClass(), "rateHold", 0);
        setIntField(term463476, term463476.getClass(), "rateSlide", 0);
        setIntField(term463476, term463476.getClass(), "rateAir", 0);
        setIntField(term463476, term463476.getClass(), "rateFlick", 0);
        setIntField(term463476, term463476.getClass(), "judgeGuilty", 0);
        setIntField(term463476, term463476.getClass(), "judgeAttack", 0);
        setIntField(term463476, term463476.getClass(), "judgeJustice", 0);
        setIntField(term463476, term463476.getClass(), "judgeCritical", 0);
        setIntField(term463476, term463476.getClass(), "judgeHeaven", 0);
        setIntField(term463476, term463476.getClass(), "eventId", 0);
        setIntField(term463476, term463476.getClass(), "playerRating", 0);
        setBooleanField(term463476, term463476.getClass(), "isNewRecord", false);
        setBooleanField(term463476, term463476.getClass(), "isFullCombo", false);
        setIntField(term463476, term463476.getClass(), "fullChainKind", 0);
        setBooleanField(term463476, term463476.getClass(), "isAllJustice", false);
        setBooleanField(term463476, term463476.getClass(), "isContinue", false);
        setBooleanField(term463476, term463476.getClass(), "isFreeToPlay", false);
        setIntField(term463476, term463476.getClass(), "characterId", 0);
        setIntField(term463476, term463476.getClass(), "charaIllustId", 0);
        setIntField(term463476, term463476.getClass(), "skillId", 0);
        setIntField(term463476, term463476.getClass(), "playKind", 0);
        setBooleanField(term463476, term463476.getClass(), "isClear", false);
        setIntField(term463476, term463476.getClass(), "skillLevel", 0);
        setIntField(term463476, term463476.getClass(), "skillEffect", 0);
        setField(term463476, term463476.getClass(), "placeName", null);
        setIntField(term463476, term463476.getClass(), "commonId", 0);
        term463524 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term463524;
        callMethod(klass, "setSkillLevel", argTypes, term463476, args);
    }

};


