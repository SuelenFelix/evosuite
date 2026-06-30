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
import java.lang.Boolean;

public class UserPlaylog_setOverDamageNewRecord_1948211496248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270072;
     Object term270127;

    public UserPlaylog_setOverDamageNewRecord_1948211496248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270072 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term270072, term270072.getClass(), "id", 0L);
        setField(term270072, term270072.getClass(), "user", null);
        setIntField(term270072, term270072.getClass(), "sortNumber", 0);
        setIntField(term270072, term270072.getClass(), "placeId", 0);
        setField(term270072, term270072.getClass(), "placeName", null);
        setField(term270072, term270072.getClass(), "playDate", null);
        setField(term270072, term270072.getClass(), "userPlayDate", null);
        setIntField(term270072, term270072.getClass(), "musicId", 0);
        setIntField(term270072, term270072.getClass(), "level", 0);
        setIntField(term270072, term270072.getClass(), "playKind", 0);
        setIntField(term270072, term270072.getClass(), "eventId", 0);
        setField(term270072, term270072.getClass(), "eventName", null);
        setIntField(term270072, term270072.getClass(), "eventPoint", 0);
        setIntField(term270072, term270072.getClass(), "playedUserId1", 0);
        setIntField(term270072, term270072.getClass(), "playedUserId2", 0);
        setIntField(term270072, term270072.getClass(), "playedUserId3", 0);
        setField(term270072, term270072.getClass(), "playedUserName1", null);
        setField(term270072, term270072.getClass(), "playedUserName2", null);
        setField(term270072, term270072.getClass(), "playedUserName3", null);
        setIntField(term270072, term270072.getClass(), "playedMusicLevel1", 0);
        setIntField(term270072, term270072.getClass(), "playedMusicLevel2", 0);
        setIntField(term270072, term270072.getClass(), "playedMusicLevel3", 0);
        setIntField(term270072, term270072.getClass(), "cardId1", 0);
        setIntField(term270072, term270072.getClass(), "cardId2", 0);
        setIntField(term270072, term270072.getClass(), "cardId3", 0);
        setIntField(term270072, term270072.getClass(), "cardLevel1", 0);
        setIntField(term270072, term270072.getClass(), "cardLevel2", 0);
        setIntField(term270072, term270072.getClass(), "cardLevel3", 0);
        setIntField(term270072, term270072.getClass(), "cardAttack1", 0);
        setIntField(term270072, term270072.getClass(), "cardAttack2", 0);
        setIntField(term270072, term270072.getClass(), "cardAttack3", 0);
        setIntField(term270072, term270072.getClass(), "bossCharaId", 0);
        setIntField(term270072, term270072.getClass(), "bossLevel", 0);
        setIntField(term270072, term270072.getClass(), "bossAttribute", 0);
        setIntField(term270072, term270072.getClass(), "clearStatus", 0);
        setIntField(term270072, term270072.getClass(), "techScore", 0);
        setIntField(term270072, term270072.getClass(), "techScoreRank", 0);
        setIntField(term270072, term270072.getClass(), "battleScore", 0);
        setIntField(term270072, term270072.getClass(), "battleScoreRank", 0);
        setIntField(term270072, term270072.getClass(), "platinumScore", 0);
        setIntField(term270072, term270072.getClass(), "maxCombo", 0);
        setIntField(term270072, term270072.getClass(), "judgeMiss", 0);
        setIntField(term270072, term270072.getClass(), "judgeHit", 0);
        setIntField(term270072, term270072.getClass(), "judgeBreak", 0);
        setIntField(term270072, term270072.getClass(), "judgeCriticalBreak", 0);
        setIntField(term270072, term270072.getClass(), "rateTap", 0);
        setIntField(term270072, term270072.getClass(), "rateHold", 0);
        setIntField(term270072, term270072.getClass(), "rateFlick", 0);
        setIntField(term270072, term270072.getClass(), "rateSideTap", 0);
        setIntField(term270072, term270072.getClass(), "rateSideHold", 0);
        setIntField(term270072, term270072.getClass(), "bellCount", 0);
        setIntField(term270072, term270072.getClass(), "totalBellCount", 0);
        setIntField(term270072, term270072.getClass(), "damageCount", 0);
        setIntField(term270072, term270072.getClass(), "overDamage", 0);
        setBooleanField(term270072, term270072.getClass(), "isTechNewRecord", false);
        setBooleanField(term270072, term270072.getClass(), "isBattleNewRecord", false);
        setBooleanField(term270072, term270072.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term270072, term270072.getClass(), "isFullCombo", false);
        setBooleanField(term270072, term270072.getClass(), "isFullBell", false);
        setBooleanField(term270072, term270072.getClass(), "isAllBreak", false);
        setIntField(term270072, term270072.getClass(), "playerRating", 0);
        setIntField(term270072, term270072.getClass(), "battlePoint", 0);
        term270127 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term270127;
        callMethod(klass, "setOverDamageNewRecord", argTypes, term270072, args);
    }

};


