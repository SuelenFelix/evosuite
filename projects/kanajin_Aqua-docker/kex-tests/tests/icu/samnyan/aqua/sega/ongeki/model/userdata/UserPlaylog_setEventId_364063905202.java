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

public class UserPlaylog_setEventId_364063905202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267458;
     Object term267513;

    public UserPlaylog_setEventId_364063905202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267458 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term267458, term267458.getClass(), "id", 0L);
        setField(term267458, term267458.getClass(), "user", null);
        setIntField(term267458, term267458.getClass(), "sortNumber", 0);
        setIntField(term267458, term267458.getClass(), "placeId", 0);
        setField(term267458, term267458.getClass(), "placeName", null);
        setField(term267458, term267458.getClass(), "playDate", null);
        setField(term267458, term267458.getClass(), "userPlayDate", null);
        setIntField(term267458, term267458.getClass(), "musicId", 0);
        setIntField(term267458, term267458.getClass(), "level", 0);
        setIntField(term267458, term267458.getClass(), "playKind", 0);
        setIntField(term267458, term267458.getClass(), "eventId", 0);
        setField(term267458, term267458.getClass(), "eventName", null);
        setIntField(term267458, term267458.getClass(), "eventPoint", 0);
        setIntField(term267458, term267458.getClass(), "playedUserId1", 0);
        setIntField(term267458, term267458.getClass(), "playedUserId2", 0);
        setIntField(term267458, term267458.getClass(), "playedUserId3", 0);
        setField(term267458, term267458.getClass(), "playedUserName1", null);
        setField(term267458, term267458.getClass(), "playedUserName2", null);
        setField(term267458, term267458.getClass(), "playedUserName3", null);
        setIntField(term267458, term267458.getClass(), "playedMusicLevel1", 0);
        setIntField(term267458, term267458.getClass(), "playedMusicLevel2", 0);
        setIntField(term267458, term267458.getClass(), "playedMusicLevel3", 0);
        setIntField(term267458, term267458.getClass(), "cardId1", 0);
        setIntField(term267458, term267458.getClass(), "cardId2", 0);
        setIntField(term267458, term267458.getClass(), "cardId3", 0);
        setIntField(term267458, term267458.getClass(), "cardLevel1", 0);
        setIntField(term267458, term267458.getClass(), "cardLevel2", 0);
        setIntField(term267458, term267458.getClass(), "cardLevel3", 0);
        setIntField(term267458, term267458.getClass(), "cardAttack1", 0);
        setIntField(term267458, term267458.getClass(), "cardAttack2", 0);
        setIntField(term267458, term267458.getClass(), "cardAttack3", 0);
        setIntField(term267458, term267458.getClass(), "bossCharaId", 0);
        setIntField(term267458, term267458.getClass(), "bossLevel", 0);
        setIntField(term267458, term267458.getClass(), "bossAttribute", 0);
        setIntField(term267458, term267458.getClass(), "clearStatus", 0);
        setIntField(term267458, term267458.getClass(), "techScore", 0);
        setIntField(term267458, term267458.getClass(), "techScoreRank", 0);
        setIntField(term267458, term267458.getClass(), "battleScore", 0);
        setIntField(term267458, term267458.getClass(), "battleScoreRank", 0);
        setIntField(term267458, term267458.getClass(), "platinumScore", 0);
        setIntField(term267458, term267458.getClass(), "maxCombo", 0);
        setIntField(term267458, term267458.getClass(), "judgeMiss", 0);
        setIntField(term267458, term267458.getClass(), "judgeHit", 0);
        setIntField(term267458, term267458.getClass(), "judgeBreak", 0);
        setIntField(term267458, term267458.getClass(), "judgeCriticalBreak", 0);
        setIntField(term267458, term267458.getClass(), "rateTap", 0);
        setIntField(term267458, term267458.getClass(), "rateHold", 0);
        setIntField(term267458, term267458.getClass(), "rateFlick", 0);
        setIntField(term267458, term267458.getClass(), "rateSideTap", 0);
        setIntField(term267458, term267458.getClass(), "rateSideHold", 0);
        setIntField(term267458, term267458.getClass(), "bellCount", 0);
        setIntField(term267458, term267458.getClass(), "totalBellCount", 0);
        setIntField(term267458, term267458.getClass(), "damageCount", 0);
        setIntField(term267458, term267458.getClass(), "overDamage", 0);
        setBooleanField(term267458, term267458.getClass(), "isTechNewRecord", false);
        setBooleanField(term267458, term267458.getClass(), "isBattleNewRecord", false);
        setBooleanField(term267458, term267458.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term267458, term267458.getClass(), "isFullCombo", false);
        setBooleanField(term267458, term267458.getClass(), "isFullBell", false);
        setBooleanField(term267458, term267458.getClass(), "isAllBreak", false);
        setIntField(term267458, term267458.getClass(), "playerRating", 0);
        setIntField(term267458, term267458.getClass(), "battlePoint", 0);
        term267513 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term267513;
        callMethod(klass, "setEventId", argTypes, term267458, args);
    }

};


