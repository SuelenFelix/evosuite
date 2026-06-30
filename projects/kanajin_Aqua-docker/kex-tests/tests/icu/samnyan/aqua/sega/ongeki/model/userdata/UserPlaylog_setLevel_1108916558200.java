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

public class UserPlaylog_setLevel_1108916558200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267344;
     Object term267399;

    public UserPlaylog_setLevel_1108916558200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267344 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term267344, term267344.getClass(), "id", 0L);
        setField(term267344, term267344.getClass(), "user", null);
        setIntField(term267344, term267344.getClass(), "sortNumber", 0);
        setIntField(term267344, term267344.getClass(), "placeId", 0);
        setField(term267344, term267344.getClass(), "placeName", null);
        setField(term267344, term267344.getClass(), "playDate", null);
        setField(term267344, term267344.getClass(), "userPlayDate", null);
        setIntField(term267344, term267344.getClass(), "musicId", 0);
        setIntField(term267344, term267344.getClass(), "level", 0);
        setIntField(term267344, term267344.getClass(), "playKind", 0);
        setIntField(term267344, term267344.getClass(), "eventId", 0);
        setField(term267344, term267344.getClass(), "eventName", null);
        setIntField(term267344, term267344.getClass(), "eventPoint", 0);
        setIntField(term267344, term267344.getClass(), "playedUserId1", 0);
        setIntField(term267344, term267344.getClass(), "playedUserId2", 0);
        setIntField(term267344, term267344.getClass(), "playedUserId3", 0);
        setField(term267344, term267344.getClass(), "playedUserName1", null);
        setField(term267344, term267344.getClass(), "playedUserName2", null);
        setField(term267344, term267344.getClass(), "playedUserName3", null);
        setIntField(term267344, term267344.getClass(), "playedMusicLevel1", 0);
        setIntField(term267344, term267344.getClass(), "playedMusicLevel2", 0);
        setIntField(term267344, term267344.getClass(), "playedMusicLevel3", 0);
        setIntField(term267344, term267344.getClass(), "cardId1", 0);
        setIntField(term267344, term267344.getClass(), "cardId2", 0);
        setIntField(term267344, term267344.getClass(), "cardId3", 0);
        setIntField(term267344, term267344.getClass(), "cardLevel1", 0);
        setIntField(term267344, term267344.getClass(), "cardLevel2", 0);
        setIntField(term267344, term267344.getClass(), "cardLevel3", 0);
        setIntField(term267344, term267344.getClass(), "cardAttack1", 0);
        setIntField(term267344, term267344.getClass(), "cardAttack2", 0);
        setIntField(term267344, term267344.getClass(), "cardAttack3", 0);
        setIntField(term267344, term267344.getClass(), "bossCharaId", 0);
        setIntField(term267344, term267344.getClass(), "bossLevel", 0);
        setIntField(term267344, term267344.getClass(), "bossAttribute", 0);
        setIntField(term267344, term267344.getClass(), "clearStatus", 0);
        setIntField(term267344, term267344.getClass(), "techScore", 0);
        setIntField(term267344, term267344.getClass(), "techScoreRank", 0);
        setIntField(term267344, term267344.getClass(), "battleScore", 0);
        setIntField(term267344, term267344.getClass(), "battleScoreRank", 0);
        setIntField(term267344, term267344.getClass(), "platinumScore", 0);
        setIntField(term267344, term267344.getClass(), "maxCombo", 0);
        setIntField(term267344, term267344.getClass(), "judgeMiss", 0);
        setIntField(term267344, term267344.getClass(), "judgeHit", 0);
        setIntField(term267344, term267344.getClass(), "judgeBreak", 0);
        setIntField(term267344, term267344.getClass(), "judgeCriticalBreak", 0);
        setIntField(term267344, term267344.getClass(), "rateTap", 0);
        setIntField(term267344, term267344.getClass(), "rateHold", 0);
        setIntField(term267344, term267344.getClass(), "rateFlick", 0);
        setIntField(term267344, term267344.getClass(), "rateSideTap", 0);
        setIntField(term267344, term267344.getClass(), "rateSideHold", 0);
        setIntField(term267344, term267344.getClass(), "bellCount", 0);
        setIntField(term267344, term267344.getClass(), "totalBellCount", 0);
        setIntField(term267344, term267344.getClass(), "damageCount", 0);
        setIntField(term267344, term267344.getClass(), "overDamage", 0);
        setBooleanField(term267344, term267344.getClass(), "isTechNewRecord", false);
        setBooleanField(term267344, term267344.getClass(), "isBattleNewRecord", false);
        setBooleanField(term267344, term267344.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term267344, term267344.getClass(), "isFullCombo", false);
        setBooleanField(term267344, term267344.getClass(), "isFullBell", false);
        setBooleanField(term267344, term267344.getClass(), "isAllBreak", false);
        setIntField(term267344, term267344.getClass(), "playerRating", 0);
        setIntField(term267344, term267344.getClass(), "battlePoint", 0);
        term267399 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term267399;
        callMethod(klass, "setLevel", argTypes, term267344, args);
    }

};


