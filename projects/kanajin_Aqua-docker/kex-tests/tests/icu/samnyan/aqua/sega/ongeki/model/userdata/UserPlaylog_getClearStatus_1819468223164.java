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

public class UserPlaylog_getClearStatus_1819468223164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265356;

    public UserPlaylog_getClearStatus_1819468223164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265356 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term265356, term265356.getClass(), "id", 0L);
        setField(term265356, term265356.getClass(), "user", null);
        setIntField(term265356, term265356.getClass(), "sortNumber", 0);
        setIntField(term265356, term265356.getClass(), "placeId", 0);
        setField(term265356, term265356.getClass(), "placeName", null);
        setField(term265356, term265356.getClass(), "playDate", null);
        setField(term265356, term265356.getClass(), "userPlayDate", null);
        setIntField(term265356, term265356.getClass(), "musicId", 0);
        setIntField(term265356, term265356.getClass(), "level", 0);
        setIntField(term265356, term265356.getClass(), "playKind", 0);
        setIntField(term265356, term265356.getClass(), "eventId", 0);
        setField(term265356, term265356.getClass(), "eventName", null);
        setIntField(term265356, term265356.getClass(), "eventPoint", 0);
        setIntField(term265356, term265356.getClass(), "playedUserId1", 0);
        setIntField(term265356, term265356.getClass(), "playedUserId2", 0);
        setIntField(term265356, term265356.getClass(), "playedUserId3", 0);
        setField(term265356, term265356.getClass(), "playedUserName1", null);
        setField(term265356, term265356.getClass(), "playedUserName2", null);
        setField(term265356, term265356.getClass(), "playedUserName3", null);
        setIntField(term265356, term265356.getClass(), "playedMusicLevel1", 0);
        setIntField(term265356, term265356.getClass(), "playedMusicLevel2", 0);
        setIntField(term265356, term265356.getClass(), "playedMusicLevel3", 0);
        setIntField(term265356, term265356.getClass(), "cardId1", 0);
        setIntField(term265356, term265356.getClass(), "cardId2", 0);
        setIntField(term265356, term265356.getClass(), "cardId3", 0);
        setIntField(term265356, term265356.getClass(), "cardLevel1", 0);
        setIntField(term265356, term265356.getClass(), "cardLevel2", 0);
        setIntField(term265356, term265356.getClass(), "cardLevel3", 0);
        setIntField(term265356, term265356.getClass(), "cardAttack1", 0);
        setIntField(term265356, term265356.getClass(), "cardAttack2", 0);
        setIntField(term265356, term265356.getClass(), "cardAttack3", 0);
        setIntField(term265356, term265356.getClass(), "bossCharaId", 0);
        setIntField(term265356, term265356.getClass(), "bossLevel", 0);
        setIntField(term265356, term265356.getClass(), "bossAttribute", 0);
        setIntField(term265356, term265356.getClass(), "clearStatus", 0);
        setIntField(term265356, term265356.getClass(), "techScore", 0);
        setIntField(term265356, term265356.getClass(), "techScoreRank", 0);
        setIntField(term265356, term265356.getClass(), "battleScore", 0);
        setIntField(term265356, term265356.getClass(), "battleScoreRank", 0);
        setIntField(term265356, term265356.getClass(), "platinumScore", 0);
        setIntField(term265356, term265356.getClass(), "maxCombo", 0);
        setIntField(term265356, term265356.getClass(), "judgeMiss", 0);
        setIntField(term265356, term265356.getClass(), "judgeHit", 0);
        setIntField(term265356, term265356.getClass(), "judgeBreak", 0);
        setIntField(term265356, term265356.getClass(), "judgeCriticalBreak", 0);
        setIntField(term265356, term265356.getClass(), "rateTap", 0);
        setIntField(term265356, term265356.getClass(), "rateHold", 0);
        setIntField(term265356, term265356.getClass(), "rateFlick", 0);
        setIntField(term265356, term265356.getClass(), "rateSideTap", 0);
        setIntField(term265356, term265356.getClass(), "rateSideHold", 0);
        setIntField(term265356, term265356.getClass(), "bellCount", 0);
        setIntField(term265356, term265356.getClass(), "totalBellCount", 0);
        setIntField(term265356, term265356.getClass(), "damageCount", 0);
        setIntField(term265356, term265356.getClass(), "overDamage", 0);
        setBooleanField(term265356, term265356.getClass(), "isTechNewRecord", false);
        setBooleanField(term265356, term265356.getClass(), "isBattleNewRecord", false);
        setBooleanField(term265356, term265356.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term265356, term265356.getClass(), "isFullCombo", false);
        setBooleanField(term265356, term265356.getClass(), "isFullBell", false);
        setBooleanField(term265356, term265356.getClass(), "isAllBreak", false);
        setIntField(term265356, term265356.getClass(), "playerRating", 0);
        setIntField(term265356, term265356.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClearStatus", argTypes, term265356, args);
    }

};


