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

public class UserPlaylog_setEventName_257528694203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267515;

    public UserPlaylog_setEventName_257528694203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267515 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term267515, term267515.getClass(), "id", 0L);
        setField(term267515, term267515.getClass(), "user", null);
        setIntField(term267515, term267515.getClass(), "sortNumber", 0);
        setIntField(term267515, term267515.getClass(), "placeId", 0);
        setField(term267515, term267515.getClass(), "placeName", null);
        setField(term267515, term267515.getClass(), "playDate", null);
        setField(term267515, term267515.getClass(), "userPlayDate", null);
        setIntField(term267515, term267515.getClass(), "musicId", 0);
        setIntField(term267515, term267515.getClass(), "level", 0);
        setIntField(term267515, term267515.getClass(), "playKind", 0);
        setIntField(term267515, term267515.getClass(), "eventId", 0);
        setField(term267515, term267515.getClass(), "eventName", null);
        setIntField(term267515, term267515.getClass(), "eventPoint", 0);
        setIntField(term267515, term267515.getClass(), "playedUserId1", 0);
        setIntField(term267515, term267515.getClass(), "playedUserId2", 0);
        setIntField(term267515, term267515.getClass(), "playedUserId3", 0);
        setField(term267515, term267515.getClass(), "playedUserName1", null);
        setField(term267515, term267515.getClass(), "playedUserName2", null);
        setField(term267515, term267515.getClass(), "playedUserName3", null);
        setIntField(term267515, term267515.getClass(), "playedMusicLevel1", 0);
        setIntField(term267515, term267515.getClass(), "playedMusicLevel2", 0);
        setIntField(term267515, term267515.getClass(), "playedMusicLevel3", 0);
        setIntField(term267515, term267515.getClass(), "cardId1", 0);
        setIntField(term267515, term267515.getClass(), "cardId2", 0);
        setIntField(term267515, term267515.getClass(), "cardId3", 0);
        setIntField(term267515, term267515.getClass(), "cardLevel1", 0);
        setIntField(term267515, term267515.getClass(), "cardLevel2", 0);
        setIntField(term267515, term267515.getClass(), "cardLevel3", 0);
        setIntField(term267515, term267515.getClass(), "cardAttack1", 0);
        setIntField(term267515, term267515.getClass(), "cardAttack2", 0);
        setIntField(term267515, term267515.getClass(), "cardAttack3", 0);
        setIntField(term267515, term267515.getClass(), "bossCharaId", 0);
        setIntField(term267515, term267515.getClass(), "bossLevel", 0);
        setIntField(term267515, term267515.getClass(), "bossAttribute", 0);
        setIntField(term267515, term267515.getClass(), "clearStatus", 0);
        setIntField(term267515, term267515.getClass(), "techScore", 0);
        setIntField(term267515, term267515.getClass(), "techScoreRank", 0);
        setIntField(term267515, term267515.getClass(), "battleScore", 0);
        setIntField(term267515, term267515.getClass(), "battleScoreRank", 0);
        setIntField(term267515, term267515.getClass(), "platinumScore", 0);
        setIntField(term267515, term267515.getClass(), "maxCombo", 0);
        setIntField(term267515, term267515.getClass(), "judgeMiss", 0);
        setIntField(term267515, term267515.getClass(), "judgeHit", 0);
        setIntField(term267515, term267515.getClass(), "judgeBreak", 0);
        setIntField(term267515, term267515.getClass(), "judgeCriticalBreak", 0);
        setIntField(term267515, term267515.getClass(), "rateTap", 0);
        setIntField(term267515, term267515.getClass(), "rateHold", 0);
        setIntField(term267515, term267515.getClass(), "rateFlick", 0);
        setIntField(term267515, term267515.getClass(), "rateSideTap", 0);
        setIntField(term267515, term267515.getClass(), "rateSideHold", 0);
        setIntField(term267515, term267515.getClass(), "bellCount", 0);
        setIntField(term267515, term267515.getClass(), "totalBellCount", 0);
        setIntField(term267515, term267515.getClass(), "damageCount", 0);
        setIntField(term267515, term267515.getClass(), "overDamage", 0);
        setBooleanField(term267515, term267515.getClass(), "isTechNewRecord", false);
        setBooleanField(term267515, term267515.getClass(), "isBattleNewRecord", false);
        setBooleanField(term267515, term267515.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term267515, term267515.getClass(), "isFullCombo", false);
        setBooleanField(term267515, term267515.getClass(), "isFullBell", false);
        setBooleanField(term267515, term267515.getClass(), "isAllBreak", false);
        setIntField(term267515, term267515.getClass(), "playerRating", 0);
        setIntField(term267515, term267515.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEventName", argTypes, term267515, args);
    }

};


