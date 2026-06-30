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

public class UserPlaylog_setJudgeMiss_1740399549233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269217;
     Object term269272;

    public UserPlaylog_setJudgeMiss_1740399549233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269217 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term269217, term269217.getClass(), "id", 0L);
        setField(term269217, term269217.getClass(), "user", null);
        setIntField(term269217, term269217.getClass(), "sortNumber", 0);
        setIntField(term269217, term269217.getClass(), "placeId", 0);
        setField(term269217, term269217.getClass(), "placeName", null);
        setField(term269217, term269217.getClass(), "playDate", null);
        setField(term269217, term269217.getClass(), "userPlayDate", null);
        setIntField(term269217, term269217.getClass(), "musicId", 0);
        setIntField(term269217, term269217.getClass(), "level", 0);
        setIntField(term269217, term269217.getClass(), "playKind", 0);
        setIntField(term269217, term269217.getClass(), "eventId", 0);
        setField(term269217, term269217.getClass(), "eventName", null);
        setIntField(term269217, term269217.getClass(), "eventPoint", 0);
        setIntField(term269217, term269217.getClass(), "playedUserId1", 0);
        setIntField(term269217, term269217.getClass(), "playedUserId2", 0);
        setIntField(term269217, term269217.getClass(), "playedUserId3", 0);
        setField(term269217, term269217.getClass(), "playedUserName1", null);
        setField(term269217, term269217.getClass(), "playedUserName2", null);
        setField(term269217, term269217.getClass(), "playedUserName3", null);
        setIntField(term269217, term269217.getClass(), "playedMusicLevel1", 0);
        setIntField(term269217, term269217.getClass(), "playedMusicLevel2", 0);
        setIntField(term269217, term269217.getClass(), "playedMusicLevel3", 0);
        setIntField(term269217, term269217.getClass(), "cardId1", 0);
        setIntField(term269217, term269217.getClass(), "cardId2", 0);
        setIntField(term269217, term269217.getClass(), "cardId3", 0);
        setIntField(term269217, term269217.getClass(), "cardLevel1", 0);
        setIntField(term269217, term269217.getClass(), "cardLevel2", 0);
        setIntField(term269217, term269217.getClass(), "cardLevel3", 0);
        setIntField(term269217, term269217.getClass(), "cardAttack1", 0);
        setIntField(term269217, term269217.getClass(), "cardAttack2", 0);
        setIntField(term269217, term269217.getClass(), "cardAttack3", 0);
        setIntField(term269217, term269217.getClass(), "bossCharaId", 0);
        setIntField(term269217, term269217.getClass(), "bossLevel", 0);
        setIntField(term269217, term269217.getClass(), "bossAttribute", 0);
        setIntField(term269217, term269217.getClass(), "clearStatus", 0);
        setIntField(term269217, term269217.getClass(), "techScore", 0);
        setIntField(term269217, term269217.getClass(), "techScoreRank", 0);
        setIntField(term269217, term269217.getClass(), "battleScore", 0);
        setIntField(term269217, term269217.getClass(), "battleScoreRank", 0);
        setIntField(term269217, term269217.getClass(), "platinumScore", 0);
        setIntField(term269217, term269217.getClass(), "maxCombo", 0);
        setIntField(term269217, term269217.getClass(), "judgeMiss", 0);
        setIntField(term269217, term269217.getClass(), "judgeHit", 0);
        setIntField(term269217, term269217.getClass(), "judgeBreak", 0);
        setIntField(term269217, term269217.getClass(), "judgeCriticalBreak", 0);
        setIntField(term269217, term269217.getClass(), "rateTap", 0);
        setIntField(term269217, term269217.getClass(), "rateHold", 0);
        setIntField(term269217, term269217.getClass(), "rateFlick", 0);
        setIntField(term269217, term269217.getClass(), "rateSideTap", 0);
        setIntField(term269217, term269217.getClass(), "rateSideHold", 0);
        setIntField(term269217, term269217.getClass(), "bellCount", 0);
        setIntField(term269217, term269217.getClass(), "totalBellCount", 0);
        setIntField(term269217, term269217.getClass(), "damageCount", 0);
        setIntField(term269217, term269217.getClass(), "overDamage", 0);
        setBooleanField(term269217, term269217.getClass(), "isTechNewRecord", false);
        setBooleanField(term269217, term269217.getClass(), "isBattleNewRecord", false);
        setBooleanField(term269217, term269217.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term269217, term269217.getClass(), "isFullCombo", false);
        setBooleanField(term269217, term269217.getClass(), "isFullBell", false);
        setBooleanField(term269217, term269217.getClass(), "isAllBreak", false);
        setIntField(term269217, term269217.getClass(), "playerRating", 0);
        setIntField(term269217, term269217.getClass(), "battlePoint", 0);
        term269272 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term269272;
        callMethod(klass, "setJudgeMiss", argTypes, term269217, args);
    }

};


