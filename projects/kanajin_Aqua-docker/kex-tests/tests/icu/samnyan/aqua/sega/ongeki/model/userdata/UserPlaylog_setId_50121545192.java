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
import java.lang.Long;

public class UserPlaylog_setId_50121545192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266896;
     Object term266951;

    public UserPlaylog_setId_50121545192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266896 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term266896, term266896.getClass(), "id", 0L);
        setField(term266896, term266896.getClass(), "user", null);
        setIntField(term266896, term266896.getClass(), "sortNumber", 0);
        setIntField(term266896, term266896.getClass(), "placeId", 0);
        setField(term266896, term266896.getClass(), "placeName", null);
        setField(term266896, term266896.getClass(), "playDate", null);
        setField(term266896, term266896.getClass(), "userPlayDate", null);
        setIntField(term266896, term266896.getClass(), "musicId", 0);
        setIntField(term266896, term266896.getClass(), "level", 0);
        setIntField(term266896, term266896.getClass(), "playKind", 0);
        setIntField(term266896, term266896.getClass(), "eventId", 0);
        setField(term266896, term266896.getClass(), "eventName", null);
        setIntField(term266896, term266896.getClass(), "eventPoint", 0);
        setIntField(term266896, term266896.getClass(), "playedUserId1", 0);
        setIntField(term266896, term266896.getClass(), "playedUserId2", 0);
        setIntField(term266896, term266896.getClass(), "playedUserId3", 0);
        setField(term266896, term266896.getClass(), "playedUserName1", null);
        setField(term266896, term266896.getClass(), "playedUserName2", null);
        setField(term266896, term266896.getClass(), "playedUserName3", null);
        setIntField(term266896, term266896.getClass(), "playedMusicLevel1", 0);
        setIntField(term266896, term266896.getClass(), "playedMusicLevel2", 0);
        setIntField(term266896, term266896.getClass(), "playedMusicLevel3", 0);
        setIntField(term266896, term266896.getClass(), "cardId1", 0);
        setIntField(term266896, term266896.getClass(), "cardId2", 0);
        setIntField(term266896, term266896.getClass(), "cardId3", 0);
        setIntField(term266896, term266896.getClass(), "cardLevel1", 0);
        setIntField(term266896, term266896.getClass(), "cardLevel2", 0);
        setIntField(term266896, term266896.getClass(), "cardLevel3", 0);
        setIntField(term266896, term266896.getClass(), "cardAttack1", 0);
        setIntField(term266896, term266896.getClass(), "cardAttack2", 0);
        setIntField(term266896, term266896.getClass(), "cardAttack3", 0);
        setIntField(term266896, term266896.getClass(), "bossCharaId", 0);
        setIntField(term266896, term266896.getClass(), "bossLevel", 0);
        setIntField(term266896, term266896.getClass(), "bossAttribute", 0);
        setIntField(term266896, term266896.getClass(), "clearStatus", 0);
        setIntField(term266896, term266896.getClass(), "techScore", 0);
        setIntField(term266896, term266896.getClass(), "techScoreRank", 0);
        setIntField(term266896, term266896.getClass(), "battleScore", 0);
        setIntField(term266896, term266896.getClass(), "battleScoreRank", 0);
        setIntField(term266896, term266896.getClass(), "platinumScore", 0);
        setIntField(term266896, term266896.getClass(), "maxCombo", 0);
        setIntField(term266896, term266896.getClass(), "judgeMiss", 0);
        setIntField(term266896, term266896.getClass(), "judgeHit", 0);
        setIntField(term266896, term266896.getClass(), "judgeBreak", 0);
        setIntField(term266896, term266896.getClass(), "judgeCriticalBreak", 0);
        setIntField(term266896, term266896.getClass(), "rateTap", 0);
        setIntField(term266896, term266896.getClass(), "rateHold", 0);
        setIntField(term266896, term266896.getClass(), "rateFlick", 0);
        setIntField(term266896, term266896.getClass(), "rateSideTap", 0);
        setIntField(term266896, term266896.getClass(), "rateSideHold", 0);
        setIntField(term266896, term266896.getClass(), "bellCount", 0);
        setIntField(term266896, term266896.getClass(), "totalBellCount", 0);
        setIntField(term266896, term266896.getClass(), "damageCount", 0);
        setIntField(term266896, term266896.getClass(), "overDamage", 0);
        setBooleanField(term266896, term266896.getClass(), "isTechNewRecord", false);
        setBooleanField(term266896, term266896.getClass(), "isBattleNewRecord", false);
        setBooleanField(term266896, term266896.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term266896, term266896.getClass(), "isFullCombo", false);
        setBooleanField(term266896, term266896.getClass(), "isFullBell", false);
        setBooleanField(term266896, term266896.getClass(), "isAllBreak", false);
        setIntField(term266896, term266896.getClass(), "playerRating", 0);
        setIntField(term266896, term266896.getClass(), "battlePoint", 0);
        term266951 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term266951;
        callMethod(klass, "setId", argTypes, term266896, args);
    }

};


