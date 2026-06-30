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

public class UserPlaylog_getTotalBellCount_398590196181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266291;

    public UserPlaylog_getTotalBellCount_398590196181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266291 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term266291, term266291.getClass(), "id", 0L);
        setField(term266291, term266291.getClass(), "user", null);
        setIntField(term266291, term266291.getClass(), "sortNumber", 0);
        setIntField(term266291, term266291.getClass(), "placeId", 0);
        setField(term266291, term266291.getClass(), "placeName", null);
        setField(term266291, term266291.getClass(), "playDate", null);
        setField(term266291, term266291.getClass(), "userPlayDate", null);
        setIntField(term266291, term266291.getClass(), "musicId", 0);
        setIntField(term266291, term266291.getClass(), "level", 0);
        setIntField(term266291, term266291.getClass(), "playKind", 0);
        setIntField(term266291, term266291.getClass(), "eventId", 0);
        setField(term266291, term266291.getClass(), "eventName", null);
        setIntField(term266291, term266291.getClass(), "eventPoint", 0);
        setIntField(term266291, term266291.getClass(), "playedUserId1", 0);
        setIntField(term266291, term266291.getClass(), "playedUserId2", 0);
        setIntField(term266291, term266291.getClass(), "playedUserId3", 0);
        setField(term266291, term266291.getClass(), "playedUserName1", null);
        setField(term266291, term266291.getClass(), "playedUserName2", null);
        setField(term266291, term266291.getClass(), "playedUserName3", null);
        setIntField(term266291, term266291.getClass(), "playedMusicLevel1", 0);
        setIntField(term266291, term266291.getClass(), "playedMusicLevel2", 0);
        setIntField(term266291, term266291.getClass(), "playedMusicLevel3", 0);
        setIntField(term266291, term266291.getClass(), "cardId1", 0);
        setIntField(term266291, term266291.getClass(), "cardId2", 0);
        setIntField(term266291, term266291.getClass(), "cardId3", 0);
        setIntField(term266291, term266291.getClass(), "cardLevel1", 0);
        setIntField(term266291, term266291.getClass(), "cardLevel2", 0);
        setIntField(term266291, term266291.getClass(), "cardLevel3", 0);
        setIntField(term266291, term266291.getClass(), "cardAttack1", 0);
        setIntField(term266291, term266291.getClass(), "cardAttack2", 0);
        setIntField(term266291, term266291.getClass(), "cardAttack3", 0);
        setIntField(term266291, term266291.getClass(), "bossCharaId", 0);
        setIntField(term266291, term266291.getClass(), "bossLevel", 0);
        setIntField(term266291, term266291.getClass(), "bossAttribute", 0);
        setIntField(term266291, term266291.getClass(), "clearStatus", 0);
        setIntField(term266291, term266291.getClass(), "techScore", 0);
        setIntField(term266291, term266291.getClass(), "techScoreRank", 0);
        setIntField(term266291, term266291.getClass(), "battleScore", 0);
        setIntField(term266291, term266291.getClass(), "battleScoreRank", 0);
        setIntField(term266291, term266291.getClass(), "platinumScore", 0);
        setIntField(term266291, term266291.getClass(), "maxCombo", 0);
        setIntField(term266291, term266291.getClass(), "judgeMiss", 0);
        setIntField(term266291, term266291.getClass(), "judgeHit", 0);
        setIntField(term266291, term266291.getClass(), "judgeBreak", 0);
        setIntField(term266291, term266291.getClass(), "judgeCriticalBreak", 0);
        setIntField(term266291, term266291.getClass(), "rateTap", 0);
        setIntField(term266291, term266291.getClass(), "rateHold", 0);
        setIntField(term266291, term266291.getClass(), "rateFlick", 0);
        setIntField(term266291, term266291.getClass(), "rateSideTap", 0);
        setIntField(term266291, term266291.getClass(), "rateSideHold", 0);
        setIntField(term266291, term266291.getClass(), "bellCount", 0);
        setIntField(term266291, term266291.getClass(), "totalBellCount", 0);
        setIntField(term266291, term266291.getClass(), "damageCount", 0);
        setIntField(term266291, term266291.getClass(), "overDamage", 0);
        setBooleanField(term266291, term266291.getClass(), "isTechNewRecord", false);
        setBooleanField(term266291, term266291.getClass(), "isBattleNewRecord", false);
        setBooleanField(term266291, term266291.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term266291, term266291.getClass(), "isFullCombo", false);
        setBooleanField(term266291, term266291.getClass(), "isFullBell", false);
        setBooleanField(term266291, term266291.getClass(), "isAllBreak", false);
        setIntField(term266291, term266291.getClass(), "playerRating", 0);
        setIntField(term266291, term266291.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBellCount", argTypes, term266291, args);
    }

};


