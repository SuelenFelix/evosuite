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

public class UserPlaylog_setPlayedUserId1_110006494205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267627;
     Object term267682;

    public UserPlaylog_setPlayedUserId1_110006494205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267627 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term267627, term267627.getClass(), "id", 0L);
        setField(term267627, term267627.getClass(), "user", null);
        setIntField(term267627, term267627.getClass(), "sortNumber", 0);
        setIntField(term267627, term267627.getClass(), "placeId", 0);
        setField(term267627, term267627.getClass(), "placeName", null);
        setField(term267627, term267627.getClass(), "playDate", null);
        setField(term267627, term267627.getClass(), "userPlayDate", null);
        setIntField(term267627, term267627.getClass(), "musicId", 0);
        setIntField(term267627, term267627.getClass(), "level", 0);
        setIntField(term267627, term267627.getClass(), "playKind", 0);
        setIntField(term267627, term267627.getClass(), "eventId", 0);
        setField(term267627, term267627.getClass(), "eventName", null);
        setIntField(term267627, term267627.getClass(), "eventPoint", 0);
        setIntField(term267627, term267627.getClass(), "playedUserId1", 0);
        setIntField(term267627, term267627.getClass(), "playedUserId2", 0);
        setIntField(term267627, term267627.getClass(), "playedUserId3", 0);
        setField(term267627, term267627.getClass(), "playedUserName1", null);
        setField(term267627, term267627.getClass(), "playedUserName2", null);
        setField(term267627, term267627.getClass(), "playedUserName3", null);
        setIntField(term267627, term267627.getClass(), "playedMusicLevel1", 0);
        setIntField(term267627, term267627.getClass(), "playedMusicLevel2", 0);
        setIntField(term267627, term267627.getClass(), "playedMusicLevel3", 0);
        setIntField(term267627, term267627.getClass(), "cardId1", 0);
        setIntField(term267627, term267627.getClass(), "cardId2", 0);
        setIntField(term267627, term267627.getClass(), "cardId3", 0);
        setIntField(term267627, term267627.getClass(), "cardLevel1", 0);
        setIntField(term267627, term267627.getClass(), "cardLevel2", 0);
        setIntField(term267627, term267627.getClass(), "cardLevel3", 0);
        setIntField(term267627, term267627.getClass(), "cardAttack1", 0);
        setIntField(term267627, term267627.getClass(), "cardAttack2", 0);
        setIntField(term267627, term267627.getClass(), "cardAttack3", 0);
        setIntField(term267627, term267627.getClass(), "bossCharaId", 0);
        setIntField(term267627, term267627.getClass(), "bossLevel", 0);
        setIntField(term267627, term267627.getClass(), "bossAttribute", 0);
        setIntField(term267627, term267627.getClass(), "clearStatus", 0);
        setIntField(term267627, term267627.getClass(), "techScore", 0);
        setIntField(term267627, term267627.getClass(), "techScoreRank", 0);
        setIntField(term267627, term267627.getClass(), "battleScore", 0);
        setIntField(term267627, term267627.getClass(), "battleScoreRank", 0);
        setIntField(term267627, term267627.getClass(), "platinumScore", 0);
        setIntField(term267627, term267627.getClass(), "maxCombo", 0);
        setIntField(term267627, term267627.getClass(), "judgeMiss", 0);
        setIntField(term267627, term267627.getClass(), "judgeHit", 0);
        setIntField(term267627, term267627.getClass(), "judgeBreak", 0);
        setIntField(term267627, term267627.getClass(), "judgeCriticalBreak", 0);
        setIntField(term267627, term267627.getClass(), "rateTap", 0);
        setIntField(term267627, term267627.getClass(), "rateHold", 0);
        setIntField(term267627, term267627.getClass(), "rateFlick", 0);
        setIntField(term267627, term267627.getClass(), "rateSideTap", 0);
        setIntField(term267627, term267627.getClass(), "rateSideHold", 0);
        setIntField(term267627, term267627.getClass(), "bellCount", 0);
        setIntField(term267627, term267627.getClass(), "totalBellCount", 0);
        setIntField(term267627, term267627.getClass(), "damageCount", 0);
        setIntField(term267627, term267627.getClass(), "overDamage", 0);
        setBooleanField(term267627, term267627.getClass(), "isTechNewRecord", false);
        setBooleanField(term267627, term267627.getClass(), "isBattleNewRecord", false);
        setBooleanField(term267627, term267627.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term267627, term267627.getClass(), "isFullCombo", false);
        setBooleanField(term267627, term267627.getClass(), "isFullBell", false);
        setBooleanField(term267627, term267627.getClass(), "isAllBreak", false);
        setIntField(term267627, term267627.getClass(), "playerRating", 0);
        setIntField(term267627, term267627.getClass(), "battlePoint", 0);
        term267682 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term267682;
        callMethod(klass, "setPlayedUserId1", argTypes, term267627, args);
    }

};


