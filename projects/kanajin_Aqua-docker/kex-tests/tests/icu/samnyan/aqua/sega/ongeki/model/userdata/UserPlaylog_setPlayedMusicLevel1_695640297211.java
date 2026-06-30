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
import java.lang.Integer;

public class UserPlaylog_setPlayedMusicLevel1_695640297211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267963;
     Object term268018;

    public UserPlaylog_setPlayedMusicLevel1_695640297211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267963 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term267963, term267963.getClass(), "id", 0L);
        setField(term267963, term267963.getClass(), "user", null);
        setIntField(term267963, term267963.getClass(), "sortNumber", 0);
        setIntField(term267963, term267963.getClass(), "placeId", 0);
        setField(term267963, term267963.getClass(), "placeName", null);
        setField(term267963, term267963.getClass(), "playDate", null);
        setField(term267963, term267963.getClass(), "userPlayDate", null);
        setIntField(term267963, term267963.getClass(), "musicId", 0);
        setIntField(term267963, term267963.getClass(), "level", 0);
        setIntField(term267963, term267963.getClass(), "playKind", 0);
        setIntField(term267963, term267963.getClass(), "eventId", 0);
        setField(term267963, term267963.getClass(), "eventName", null);
        setIntField(term267963, term267963.getClass(), "eventPoint", 0);
        setIntField(term267963, term267963.getClass(), "playedUserId1", 0);
        setIntField(term267963, term267963.getClass(), "playedUserId2", 0);
        setIntField(term267963, term267963.getClass(), "playedUserId3", 0);
        setField(term267963, term267963.getClass(), "playedUserName1", null);
        setField(term267963, term267963.getClass(), "playedUserName2", null);
        setField(term267963, term267963.getClass(), "playedUserName3", null);
        setIntField(term267963, term267963.getClass(), "playedMusicLevel1", 0);
        setIntField(term267963, term267963.getClass(), "playedMusicLevel2", 0);
        setIntField(term267963, term267963.getClass(), "playedMusicLevel3", 0);
        setIntField(term267963, term267963.getClass(), "cardId1", 0);
        setIntField(term267963, term267963.getClass(), "cardId2", 0);
        setIntField(term267963, term267963.getClass(), "cardId3", 0);
        setIntField(term267963, term267963.getClass(), "cardLevel1", 0);
        setIntField(term267963, term267963.getClass(), "cardLevel2", 0);
        setIntField(term267963, term267963.getClass(), "cardLevel3", 0);
        setIntField(term267963, term267963.getClass(), "cardAttack1", 0);
        setIntField(term267963, term267963.getClass(), "cardAttack2", 0);
        setIntField(term267963, term267963.getClass(), "cardAttack3", 0);
        setIntField(term267963, term267963.getClass(), "bossCharaId", 0);
        setIntField(term267963, term267963.getClass(), "bossLevel", 0);
        setIntField(term267963, term267963.getClass(), "bossAttribute", 0);
        setIntField(term267963, term267963.getClass(), "clearStatus", 0);
        setIntField(term267963, term267963.getClass(), "techScore", 0);
        setIntField(term267963, term267963.getClass(), "techScoreRank", 0);
        setIntField(term267963, term267963.getClass(), "battleScore", 0);
        setIntField(term267963, term267963.getClass(), "battleScoreRank", 0);
        setIntField(term267963, term267963.getClass(), "platinumScore", 0);
        setIntField(term267963, term267963.getClass(), "maxCombo", 0);
        setIntField(term267963, term267963.getClass(), "judgeMiss", 0);
        setIntField(term267963, term267963.getClass(), "judgeHit", 0);
        setIntField(term267963, term267963.getClass(), "judgeBreak", 0);
        setIntField(term267963, term267963.getClass(), "judgeCriticalBreak", 0);
        setIntField(term267963, term267963.getClass(), "rateTap", 0);
        setIntField(term267963, term267963.getClass(), "rateHold", 0);
        setIntField(term267963, term267963.getClass(), "rateFlick", 0);
        setIntField(term267963, term267963.getClass(), "rateSideTap", 0);
        setIntField(term267963, term267963.getClass(), "rateSideHold", 0);
        setIntField(term267963, term267963.getClass(), "bellCount", 0);
        setIntField(term267963, term267963.getClass(), "totalBellCount", 0);
        setIntField(term267963, term267963.getClass(), "damageCount", 0);
        setIntField(term267963, term267963.getClass(), "overDamage", 0);
        setBooleanField(term267963, term267963.getClass(), "isTechNewRecord", false);
        setBooleanField(term267963, term267963.getClass(), "isBattleNewRecord", false);
        setBooleanField(term267963, term267963.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term267963, term267963.getClass(), "isFullCombo", false);
        setBooleanField(term267963, term267963.getClass(), "isFullBell", false);
        setBooleanField(term267963, term267963.getClass(), "isAllBreak", false);
        setIntField(term267963, term267963.getClass(), "playerRating", 0);
        setIntField(term267963, term267963.getClass(), "battlePoint", 0);
        term268018 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268018;
        callMethod(klass, "setPlayedMusicLevel1", argTypes, term267963, args);
    }

};


