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

public class UserPlaylog_setSortNumber_1291584555194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267008;
     Object term267063;

    public UserPlaylog_setSortNumber_1291584555194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267008 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term267008, term267008.getClass(), "id", 0L);
        setField(term267008, term267008.getClass(), "user", null);
        setIntField(term267008, term267008.getClass(), "sortNumber", 0);
        setIntField(term267008, term267008.getClass(), "placeId", 0);
        setField(term267008, term267008.getClass(), "placeName", null);
        setField(term267008, term267008.getClass(), "playDate", null);
        setField(term267008, term267008.getClass(), "userPlayDate", null);
        setIntField(term267008, term267008.getClass(), "musicId", 0);
        setIntField(term267008, term267008.getClass(), "level", 0);
        setIntField(term267008, term267008.getClass(), "playKind", 0);
        setIntField(term267008, term267008.getClass(), "eventId", 0);
        setField(term267008, term267008.getClass(), "eventName", null);
        setIntField(term267008, term267008.getClass(), "eventPoint", 0);
        setIntField(term267008, term267008.getClass(), "playedUserId1", 0);
        setIntField(term267008, term267008.getClass(), "playedUserId2", 0);
        setIntField(term267008, term267008.getClass(), "playedUserId3", 0);
        setField(term267008, term267008.getClass(), "playedUserName1", null);
        setField(term267008, term267008.getClass(), "playedUserName2", null);
        setField(term267008, term267008.getClass(), "playedUserName3", null);
        setIntField(term267008, term267008.getClass(), "playedMusicLevel1", 0);
        setIntField(term267008, term267008.getClass(), "playedMusicLevel2", 0);
        setIntField(term267008, term267008.getClass(), "playedMusicLevel3", 0);
        setIntField(term267008, term267008.getClass(), "cardId1", 0);
        setIntField(term267008, term267008.getClass(), "cardId2", 0);
        setIntField(term267008, term267008.getClass(), "cardId3", 0);
        setIntField(term267008, term267008.getClass(), "cardLevel1", 0);
        setIntField(term267008, term267008.getClass(), "cardLevel2", 0);
        setIntField(term267008, term267008.getClass(), "cardLevel3", 0);
        setIntField(term267008, term267008.getClass(), "cardAttack1", 0);
        setIntField(term267008, term267008.getClass(), "cardAttack2", 0);
        setIntField(term267008, term267008.getClass(), "cardAttack3", 0);
        setIntField(term267008, term267008.getClass(), "bossCharaId", 0);
        setIntField(term267008, term267008.getClass(), "bossLevel", 0);
        setIntField(term267008, term267008.getClass(), "bossAttribute", 0);
        setIntField(term267008, term267008.getClass(), "clearStatus", 0);
        setIntField(term267008, term267008.getClass(), "techScore", 0);
        setIntField(term267008, term267008.getClass(), "techScoreRank", 0);
        setIntField(term267008, term267008.getClass(), "battleScore", 0);
        setIntField(term267008, term267008.getClass(), "battleScoreRank", 0);
        setIntField(term267008, term267008.getClass(), "platinumScore", 0);
        setIntField(term267008, term267008.getClass(), "maxCombo", 0);
        setIntField(term267008, term267008.getClass(), "judgeMiss", 0);
        setIntField(term267008, term267008.getClass(), "judgeHit", 0);
        setIntField(term267008, term267008.getClass(), "judgeBreak", 0);
        setIntField(term267008, term267008.getClass(), "judgeCriticalBreak", 0);
        setIntField(term267008, term267008.getClass(), "rateTap", 0);
        setIntField(term267008, term267008.getClass(), "rateHold", 0);
        setIntField(term267008, term267008.getClass(), "rateFlick", 0);
        setIntField(term267008, term267008.getClass(), "rateSideTap", 0);
        setIntField(term267008, term267008.getClass(), "rateSideHold", 0);
        setIntField(term267008, term267008.getClass(), "bellCount", 0);
        setIntField(term267008, term267008.getClass(), "totalBellCount", 0);
        setIntField(term267008, term267008.getClass(), "damageCount", 0);
        setIntField(term267008, term267008.getClass(), "overDamage", 0);
        setBooleanField(term267008, term267008.getClass(), "isTechNewRecord", false);
        setBooleanField(term267008, term267008.getClass(), "isBattleNewRecord", false);
        setBooleanField(term267008, term267008.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term267008, term267008.getClass(), "isFullCombo", false);
        setBooleanField(term267008, term267008.getClass(), "isFullBell", false);
        setBooleanField(term267008, term267008.getClass(), "isAllBreak", false);
        setIntField(term267008, term267008.getClass(), "playerRating", 0);
        setIntField(term267008, term267008.getClass(), "battlePoint", 0);
        term267063 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term267063;
        callMethod(klass, "setSortNumber", argTypes, term267008, args);
    }

};


