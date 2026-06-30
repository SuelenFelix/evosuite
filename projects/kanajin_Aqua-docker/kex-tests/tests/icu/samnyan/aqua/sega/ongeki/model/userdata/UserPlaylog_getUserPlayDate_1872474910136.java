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

public class UserPlaylog_getUserPlayDate_1872474910136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263816;

    public UserPlaylog_getUserPlayDate_1872474910136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263816 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term263816, term263816.getClass(), "id", 0L);
        setField(term263816, term263816.getClass(), "user", null);
        setIntField(term263816, term263816.getClass(), "sortNumber", 0);
        setIntField(term263816, term263816.getClass(), "placeId", 0);
        setField(term263816, term263816.getClass(), "placeName", null);
        setField(term263816, term263816.getClass(), "playDate", null);
        setField(term263816, term263816.getClass(), "userPlayDate", null);
        setIntField(term263816, term263816.getClass(), "musicId", 0);
        setIntField(term263816, term263816.getClass(), "level", 0);
        setIntField(term263816, term263816.getClass(), "playKind", 0);
        setIntField(term263816, term263816.getClass(), "eventId", 0);
        setField(term263816, term263816.getClass(), "eventName", null);
        setIntField(term263816, term263816.getClass(), "eventPoint", 0);
        setIntField(term263816, term263816.getClass(), "playedUserId1", 0);
        setIntField(term263816, term263816.getClass(), "playedUserId2", 0);
        setIntField(term263816, term263816.getClass(), "playedUserId3", 0);
        setField(term263816, term263816.getClass(), "playedUserName1", null);
        setField(term263816, term263816.getClass(), "playedUserName2", null);
        setField(term263816, term263816.getClass(), "playedUserName3", null);
        setIntField(term263816, term263816.getClass(), "playedMusicLevel1", 0);
        setIntField(term263816, term263816.getClass(), "playedMusicLevel2", 0);
        setIntField(term263816, term263816.getClass(), "playedMusicLevel3", 0);
        setIntField(term263816, term263816.getClass(), "cardId1", 0);
        setIntField(term263816, term263816.getClass(), "cardId2", 0);
        setIntField(term263816, term263816.getClass(), "cardId3", 0);
        setIntField(term263816, term263816.getClass(), "cardLevel1", 0);
        setIntField(term263816, term263816.getClass(), "cardLevel2", 0);
        setIntField(term263816, term263816.getClass(), "cardLevel3", 0);
        setIntField(term263816, term263816.getClass(), "cardAttack1", 0);
        setIntField(term263816, term263816.getClass(), "cardAttack2", 0);
        setIntField(term263816, term263816.getClass(), "cardAttack3", 0);
        setIntField(term263816, term263816.getClass(), "bossCharaId", 0);
        setIntField(term263816, term263816.getClass(), "bossLevel", 0);
        setIntField(term263816, term263816.getClass(), "bossAttribute", 0);
        setIntField(term263816, term263816.getClass(), "clearStatus", 0);
        setIntField(term263816, term263816.getClass(), "techScore", 0);
        setIntField(term263816, term263816.getClass(), "techScoreRank", 0);
        setIntField(term263816, term263816.getClass(), "battleScore", 0);
        setIntField(term263816, term263816.getClass(), "battleScoreRank", 0);
        setIntField(term263816, term263816.getClass(), "platinumScore", 0);
        setIntField(term263816, term263816.getClass(), "maxCombo", 0);
        setIntField(term263816, term263816.getClass(), "judgeMiss", 0);
        setIntField(term263816, term263816.getClass(), "judgeHit", 0);
        setIntField(term263816, term263816.getClass(), "judgeBreak", 0);
        setIntField(term263816, term263816.getClass(), "judgeCriticalBreak", 0);
        setIntField(term263816, term263816.getClass(), "rateTap", 0);
        setIntField(term263816, term263816.getClass(), "rateHold", 0);
        setIntField(term263816, term263816.getClass(), "rateFlick", 0);
        setIntField(term263816, term263816.getClass(), "rateSideTap", 0);
        setIntField(term263816, term263816.getClass(), "rateSideHold", 0);
        setIntField(term263816, term263816.getClass(), "bellCount", 0);
        setIntField(term263816, term263816.getClass(), "totalBellCount", 0);
        setIntField(term263816, term263816.getClass(), "damageCount", 0);
        setIntField(term263816, term263816.getClass(), "overDamage", 0);
        setBooleanField(term263816, term263816.getClass(), "isTechNewRecord", false);
        setBooleanField(term263816, term263816.getClass(), "isBattleNewRecord", false);
        setBooleanField(term263816, term263816.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term263816, term263816.getClass(), "isFullCombo", false);
        setBooleanField(term263816, term263816.getClass(), "isFullBell", false);
        setBooleanField(term263816, term263816.getClass(), "isAllBreak", false);
        setIntField(term263816, term263816.getClass(), "playerRating", 0);
        setIntField(term263816, term263816.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPlayDate", argTypes, term263816, args);
    }

};


