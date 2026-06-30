package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserPlaylog_getJudgeJustice_1561813543146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274815;

    public UserPlaylog_getJudgeJustice_1561813543146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274815 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term274815, term274815.getClass(), "id", 0L);
        setField(term274815, term274815.getClass(), "user", null);
        setIntField(term274815, term274815.getClass(), "orderId", 0);
        setIntField(term274815, term274815.getClass(), "sortNumber", 0);
        setIntField(term274815, term274815.getClass(), "placeId", 0);
        setField(term274815, term274815.getClass(), "playDate", null);
        setField(term274815, term274815.getClass(), "userPlayDate", null);
        setIntField(term274815, term274815.getClass(), "musicId", 0);
        setIntField(term274815, term274815.getClass(), "level", 0);
        setIntField(term274815, term274815.getClass(), "customId", 0);
        setIntField(term274815, term274815.getClass(), "playedUserId1", 0);
        setIntField(term274815, term274815.getClass(), "playedUserId2", 0);
        setIntField(term274815, term274815.getClass(), "playedUserId3", 0);
        setField(term274815, term274815.getClass(), "playedUserName1", null);
        setField(term274815, term274815.getClass(), "playedUserName2", null);
        setField(term274815, term274815.getClass(), "playedUserName3", null);
        setIntField(term274815, term274815.getClass(), "playedMusicLevel1", 0);
        setIntField(term274815, term274815.getClass(), "playedMusicLevel2", 0);
        setIntField(term274815, term274815.getClass(), "playedMusicLevel3", 0);
        setIntField(term274815, term274815.getClass(), "playedCustom1", 0);
        setIntField(term274815, term274815.getClass(), "playedCustom2", 0);
        setIntField(term274815, term274815.getClass(), "playedCustom3", 0);
        setIntField(term274815, term274815.getClass(), "track", 0);
        setIntField(term274815, term274815.getClass(), "score", 0);
        setIntField(term274815, term274815.getClass(), "rank", 0);
        setIntField(term274815, term274815.getClass(), "maxCombo", 0);
        setIntField(term274815, term274815.getClass(), "maxChain", 0);
        setIntField(term274815, term274815.getClass(), "rateTap", 0);
        setIntField(term274815, term274815.getClass(), "rateHold", 0);
        setIntField(term274815, term274815.getClass(), "rateSlide", 0);
        setIntField(term274815, term274815.getClass(), "rateAir", 0);
        setIntField(term274815, term274815.getClass(), "rateFlick", 0);
        setIntField(term274815, term274815.getClass(), "judgeGuilty", 0);
        setIntField(term274815, term274815.getClass(), "judgeAttack", 0);
        setIntField(term274815, term274815.getClass(), "judgeJustice", 0);
        setIntField(term274815, term274815.getClass(), "judgeCritical", 0);
        setIntField(term274815, term274815.getClass(), "eventId", 0);
        setIntField(term274815, term274815.getClass(), "playerRating", 0);
        setBooleanField(term274815, term274815.getClass(), "isNewRecord", false);
        setBooleanField(term274815, term274815.getClass(), "isFullCombo", false);
        setIntField(term274815, term274815.getClass(), "fullChainKind", 0);
        setBooleanField(term274815, term274815.getClass(), "isAllJustice", false);
        setBooleanField(term274815, term274815.getClass(), "isContinue", false);
        setBooleanField(term274815, term274815.getClass(), "isFreeToPlay", false);
        setIntField(term274815, term274815.getClass(), "characterId", 0);
        setIntField(term274815, term274815.getClass(), "skillId", 0);
        setIntField(term274815, term274815.getClass(), "playKind", 0);
        setBooleanField(term274815, term274815.getClass(), "isClear", false);
        setIntField(term274815, term274815.getClass(), "skillLevel", 0);
        setIntField(term274815, term274815.getClass(), "skillEffect", 0);
        setField(term274815, term274815.getClass(), "placeName", null);
        setBooleanField(term274815, term274815.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeJustice", argTypes, term274815, args);
    }

};


