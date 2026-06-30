package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserPlaylog_getPlaceId_155901470133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263651;

    public UserPlaylog_getPlaceId_155901470133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263651 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term263651, term263651.getClass(), "id", 0L);
        setField(term263651, term263651.getClass(), "user", null);
        setIntField(term263651, term263651.getClass(), "sortNumber", 0);
        setIntField(term263651, term263651.getClass(), "placeId", 0);
        setField(term263651, term263651.getClass(), "placeName", null);
        setField(term263651, term263651.getClass(), "playDate", null);
        setField(term263651, term263651.getClass(), "userPlayDate", null);
        setIntField(term263651, term263651.getClass(), "musicId", 0);
        setIntField(term263651, term263651.getClass(), "level", 0);
        setIntField(term263651, term263651.getClass(), "playKind", 0);
        setIntField(term263651, term263651.getClass(), "eventId", 0);
        setField(term263651, term263651.getClass(), "eventName", null);
        setIntField(term263651, term263651.getClass(), "eventPoint", 0);
        setIntField(term263651, term263651.getClass(), "playedUserId1", 0);
        setIntField(term263651, term263651.getClass(), "playedUserId2", 0);
        setIntField(term263651, term263651.getClass(), "playedUserId3", 0);
        setField(term263651, term263651.getClass(), "playedUserName1", null);
        setField(term263651, term263651.getClass(), "playedUserName2", null);
        setField(term263651, term263651.getClass(), "playedUserName3", null);
        setIntField(term263651, term263651.getClass(), "playedMusicLevel1", 0);
        setIntField(term263651, term263651.getClass(), "playedMusicLevel2", 0);
        setIntField(term263651, term263651.getClass(), "playedMusicLevel3", 0);
        setIntField(term263651, term263651.getClass(), "cardId1", 0);
        setIntField(term263651, term263651.getClass(), "cardId2", 0);
        setIntField(term263651, term263651.getClass(), "cardId3", 0);
        setIntField(term263651, term263651.getClass(), "cardLevel1", 0);
        setIntField(term263651, term263651.getClass(), "cardLevel2", 0);
        setIntField(term263651, term263651.getClass(), "cardLevel3", 0);
        setIntField(term263651, term263651.getClass(), "cardAttack1", 0);
        setIntField(term263651, term263651.getClass(), "cardAttack2", 0);
        setIntField(term263651, term263651.getClass(), "cardAttack3", 0);
        setIntField(term263651, term263651.getClass(), "bossCharaId", 0);
        setIntField(term263651, term263651.getClass(), "bossLevel", 0);
        setIntField(term263651, term263651.getClass(), "bossAttribute", 0);
        setIntField(term263651, term263651.getClass(), "clearStatus", 0);
        setIntField(term263651, term263651.getClass(), "techScore", 0);
        setIntField(term263651, term263651.getClass(), "techScoreRank", 0);
        setIntField(term263651, term263651.getClass(), "battleScore", 0);
        setIntField(term263651, term263651.getClass(), "battleScoreRank", 0);
        setIntField(term263651, term263651.getClass(), "platinumScore", 0);
        setIntField(term263651, term263651.getClass(), "maxCombo", 0);
        setIntField(term263651, term263651.getClass(), "judgeMiss", 0);
        setIntField(term263651, term263651.getClass(), "judgeHit", 0);
        setIntField(term263651, term263651.getClass(), "judgeBreak", 0);
        setIntField(term263651, term263651.getClass(), "judgeCriticalBreak", 0);
        setIntField(term263651, term263651.getClass(), "rateTap", 0);
        setIntField(term263651, term263651.getClass(), "rateHold", 0);
        setIntField(term263651, term263651.getClass(), "rateFlick", 0);
        setIntField(term263651, term263651.getClass(), "rateSideTap", 0);
        setIntField(term263651, term263651.getClass(), "rateSideHold", 0);
        setIntField(term263651, term263651.getClass(), "bellCount", 0);
        setIntField(term263651, term263651.getClass(), "totalBellCount", 0);
        setIntField(term263651, term263651.getClass(), "damageCount", 0);
        setIntField(term263651, term263651.getClass(), "overDamage", 0);
        setBooleanField(term263651, term263651.getClass(), "isTechNewRecord", false);
        setBooleanField(term263651, term263651.getClass(), "isBattleNewRecord", false);
        setBooleanField(term263651, term263651.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term263651, term263651.getClass(), "isFullCombo", false);
        setBooleanField(term263651, term263651.getClass(), "isFullBell", false);
        setBooleanField(term263651, term263651.getClass(), "isAllBreak", false);
        setIntField(term263651, term263651.getClass(), "playerRating", 0);
        setIntField(term263651, term263651.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceId", argTypes, term263651, args);
    }

};


