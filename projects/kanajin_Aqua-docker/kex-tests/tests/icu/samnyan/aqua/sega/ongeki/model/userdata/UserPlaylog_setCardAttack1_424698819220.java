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

public class UserPlaylog_setCardAttack1_424698819220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268476;
     Object term268531;

    public UserPlaylog_setCardAttack1_424698819220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268476 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term268476, term268476.getClass(), "id", 0L);
        setField(term268476, term268476.getClass(), "user", null);
        setIntField(term268476, term268476.getClass(), "sortNumber", 0);
        setIntField(term268476, term268476.getClass(), "placeId", 0);
        setField(term268476, term268476.getClass(), "placeName", null);
        setField(term268476, term268476.getClass(), "playDate", null);
        setField(term268476, term268476.getClass(), "userPlayDate", null);
        setIntField(term268476, term268476.getClass(), "musicId", 0);
        setIntField(term268476, term268476.getClass(), "level", 0);
        setIntField(term268476, term268476.getClass(), "playKind", 0);
        setIntField(term268476, term268476.getClass(), "eventId", 0);
        setField(term268476, term268476.getClass(), "eventName", null);
        setIntField(term268476, term268476.getClass(), "eventPoint", 0);
        setIntField(term268476, term268476.getClass(), "playedUserId1", 0);
        setIntField(term268476, term268476.getClass(), "playedUserId2", 0);
        setIntField(term268476, term268476.getClass(), "playedUserId3", 0);
        setField(term268476, term268476.getClass(), "playedUserName1", null);
        setField(term268476, term268476.getClass(), "playedUserName2", null);
        setField(term268476, term268476.getClass(), "playedUserName3", null);
        setIntField(term268476, term268476.getClass(), "playedMusicLevel1", 0);
        setIntField(term268476, term268476.getClass(), "playedMusicLevel2", 0);
        setIntField(term268476, term268476.getClass(), "playedMusicLevel3", 0);
        setIntField(term268476, term268476.getClass(), "cardId1", 0);
        setIntField(term268476, term268476.getClass(), "cardId2", 0);
        setIntField(term268476, term268476.getClass(), "cardId3", 0);
        setIntField(term268476, term268476.getClass(), "cardLevel1", 0);
        setIntField(term268476, term268476.getClass(), "cardLevel2", 0);
        setIntField(term268476, term268476.getClass(), "cardLevel3", 0);
        setIntField(term268476, term268476.getClass(), "cardAttack1", 0);
        setIntField(term268476, term268476.getClass(), "cardAttack2", 0);
        setIntField(term268476, term268476.getClass(), "cardAttack3", 0);
        setIntField(term268476, term268476.getClass(), "bossCharaId", 0);
        setIntField(term268476, term268476.getClass(), "bossLevel", 0);
        setIntField(term268476, term268476.getClass(), "bossAttribute", 0);
        setIntField(term268476, term268476.getClass(), "clearStatus", 0);
        setIntField(term268476, term268476.getClass(), "techScore", 0);
        setIntField(term268476, term268476.getClass(), "techScoreRank", 0);
        setIntField(term268476, term268476.getClass(), "battleScore", 0);
        setIntField(term268476, term268476.getClass(), "battleScoreRank", 0);
        setIntField(term268476, term268476.getClass(), "platinumScore", 0);
        setIntField(term268476, term268476.getClass(), "maxCombo", 0);
        setIntField(term268476, term268476.getClass(), "judgeMiss", 0);
        setIntField(term268476, term268476.getClass(), "judgeHit", 0);
        setIntField(term268476, term268476.getClass(), "judgeBreak", 0);
        setIntField(term268476, term268476.getClass(), "judgeCriticalBreak", 0);
        setIntField(term268476, term268476.getClass(), "rateTap", 0);
        setIntField(term268476, term268476.getClass(), "rateHold", 0);
        setIntField(term268476, term268476.getClass(), "rateFlick", 0);
        setIntField(term268476, term268476.getClass(), "rateSideTap", 0);
        setIntField(term268476, term268476.getClass(), "rateSideHold", 0);
        setIntField(term268476, term268476.getClass(), "bellCount", 0);
        setIntField(term268476, term268476.getClass(), "totalBellCount", 0);
        setIntField(term268476, term268476.getClass(), "damageCount", 0);
        setIntField(term268476, term268476.getClass(), "overDamage", 0);
        setBooleanField(term268476, term268476.getClass(), "isTechNewRecord", false);
        setBooleanField(term268476, term268476.getClass(), "isBattleNewRecord", false);
        setBooleanField(term268476, term268476.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term268476, term268476.getClass(), "isFullCombo", false);
        setBooleanField(term268476, term268476.getClass(), "isFullBell", false);
        setBooleanField(term268476, term268476.getClass(), "isAllBreak", false);
        setIntField(term268476, term268476.getClass(), "playerRating", 0);
        setIntField(term268476, term268476.getClass(), "battlePoint", 0);
        term268531 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268531;
        callMethod(klass, "setCardAttack1", argTypes, term268476, args);
    }

};


