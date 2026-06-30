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

public class UserPlaylog_getCardLevel1_1979536343155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264861;

    public UserPlaylog_getCardLevel1_1979536343155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264861 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term264861, term264861.getClass(), "id", 0L);
        setField(term264861, term264861.getClass(), "user", null);
        setIntField(term264861, term264861.getClass(), "sortNumber", 0);
        setIntField(term264861, term264861.getClass(), "placeId", 0);
        setField(term264861, term264861.getClass(), "placeName", null);
        setField(term264861, term264861.getClass(), "playDate", null);
        setField(term264861, term264861.getClass(), "userPlayDate", null);
        setIntField(term264861, term264861.getClass(), "musicId", 0);
        setIntField(term264861, term264861.getClass(), "level", 0);
        setIntField(term264861, term264861.getClass(), "playKind", 0);
        setIntField(term264861, term264861.getClass(), "eventId", 0);
        setField(term264861, term264861.getClass(), "eventName", null);
        setIntField(term264861, term264861.getClass(), "eventPoint", 0);
        setIntField(term264861, term264861.getClass(), "playedUserId1", 0);
        setIntField(term264861, term264861.getClass(), "playedUserId2", 0);
        setIntField(term264861, term264861.getClass(), "playedUserId3", 0);
        setField(term264861, term264861.getClass(), "playedUserName1", null);
        setField(term264861, term264861.getClass(), "playedUserName2", null);
        setField(term264861, term264861.getClass(), "playedUserName3", null);
        setIntField(term264861, term264861.getClass(), "playedMusicLevel1", 0);
        setIntField(term264861, term264861.getClass(), "playedMusicLevel2", 0);
        setIntField(term264861, term264861.getClass(), "playedMusicLevel3", 0);
        setIntField(term264861, term264861.getClass(), "cardId1", 0);
        setIntField(term264861, term264861.getClass(), "cardId2", 0);
        setIntField(term264861, term264861.getClass(), "cardId3", 0);
        setIntField(term264861, term264861.getClass(), "cardLevel1", 0);
        setIntField(term264861, term264861.getClass(), "cardLevel2", 0);
        setIntField(term264861, term264861.getClass(), "cardLevel3", 0);
        setIntField(term264861, term264861.getClass(), "cardAttack1", 0);
        setIntField(term264861, term264861.getClass(), "cardAttack2", 0);
        setIntField(term264861, term264861.getClass(), "cardAttack3", 0);
        setIntField(term264861, term264861.getClass(), "bossCharaId", 0);
        setIntField(term264861, term264861.getClass(), "bossLevel", 0);
        setIntField(term264861, term264861.getClass(), "bossAttribute", 0);
        setIntField(term264861, term264861.getClass(), "clearStatus", 0);
        setIntField(term264861, term264861.getClass(), "techScore", 0);
        setIntField(term264861, term264861.getClass(), "techScoreRank", 0);
        setIntField(term264861, term264861.getClass(), "battleScore", 0);
        setIntField(term264861, term264861.getClass(), "battleScoreRank", 0);
        setIntField(term264861, term264861.getClass(), "platinumScore", 0);
        setIntField(term264861, term264861.getClass(), "maxCombo", 0);
        setIntField(term264861, term264861.getClass(), "judgeMiss", 0);
        setIntField(term264861, term264861.getClass(), "judgeHit", 0);
        setIntField(term264861, term264861.getClass(), "judgeBreak", 0);
        setIntField(term264861, term264861.getClass(), "judgeCriticalBreak", 0);
        setIntField(term264861, term264861.getClass(), "rateTap", 0);
        setIntField(term264861, term264861.getClass(), "rateHold", 0);
        setIntField(term264861, term264861.getClass(), "rateFlick", 0);
        setIntField(term264861, term264861.getClass(), "rateSideTap", 0);
        setIntField(term264861, term264861.getClass(), "rateSideHold", 0);
        setIntField(term264861, term264861.getClass(), "bellCount", 0);
        setIntField(term264861, term264861.getClass(), "totalBellCount", 0);
        setIntField(term264861, term264861.getClass(), "damageCount", 0);
        setIntField(term264861, term264861.getClass(), "overDamage", 0);
        setBooleanField(term264861, term264861.getClass(), "isTechNewRecord", false);
        setBooleanField(term264861, term264861.getClass(), "isBattleNewRecord", false);
        setBooleanField(term264861, term264861.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term264861, term264861.getClass(), "isFullCombo", false);
        setBooleanField(term264861, term264861.getClass(), "isFullBell", false);
        setBooleanField(term264861, term264861.getClass(), "isAllBreak", false);
        setIntField(term264861, term264861.getClass(), "playerRating", 0);
        setIntField(term264861, term264861.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardLevel1", argTypes, term264861, args);
    }

};


