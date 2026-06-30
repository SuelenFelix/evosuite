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

public class UserPlaylog_getCardAttack1_2042452903158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265026;

    public UserPlaylog_getCardAttack1_2042452903158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265026 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term265026, term265026.getClass(), "id", 0L);
        setField(term265026, term265026.getClass(), "user", null);
        setIntField(term265026, term265026.getClass(), "sortNumber", 0);
        setIntField(term265026, term265026.getClass(), "placeId", 0);
        setField(term265026, term265026.getClass(), "placeName", null);
        setField(term265026, term265026.getClass(), "playDate", null);
        setField(term265026, term265026.getClass(), "userPlayDate", null);
        setIntField(term265026, term265026.getClass(), "musicId", 0);
        setIntField(term265026, term265026.getClass(), "level", 0);
        setIntField(term265026, term265026.getClass(), "playKind", 0);
        setIntField(term265026, term265026.getClass(), "eventId", 0);
        setField(term265026, term265026.getClass(), "eventName", null);
        setIntField(term265026, term265026.getClass(), "eventPoint", 0);
        setIntField(term265026, term265026.getClass(), "playedUserId1", 0);
        setIntField(term265026, term265026.getClass(), "playedUserId2", 0);
        setIntField(term265026, term265026.getClass(), "playedUserId3", 0);
        setField(term265026, term265026.getClass(), "playedUserName1", null);
        setField(term265026, term265026.getClass(), "playedUserName2", null);
        setField(term265026, term265026.getClass(), "playedUserName3", null);
        setIntField(term265026, term265026.getClass(), "playedMusicLevel1", 0);
        setIntField(term265026, term265026.getClass(), "playedMusicLevel2", 0);
        setIntField(term265026, term265026.getClass(), "playedMusicLevel3", 0);
        setIntField(term265026, term265026.getClass(), "cardId1", 0);
        setIntField(term265026, term265026.getClass(), "cardId2", 0);
        setIntField(term265026, term265026.getClass(), "cardId3", 0);
        setIntField(term265026, term265026.getClass(), "cardLevel1", 0);
        setIntField(term265026, term265026.getClass(), "cardLevel2", 0);
        setIntField(term265026, term265026.getClass(), "cardLevel3", 0);
        setIntField(term265026, term265026.getClass(), "cardAttack1", 0);
        setIntField(term265026, term265026.getClass(), "cardAttack2", 0);
        setIntField(term265026, term265026.getClass(), "cardAttack3", 0);
        setIntField(term265026, term265026.getClass(), "bossCharaId", 0);
        setIntField(term265026, term265026.getClass(), "bossLevel", 0);
        setIntField(term265026, term265026.getClass(), "bossAttribute", 0);
        setIntField(term265026, term265026.getClass(), "clearStatus", 0);
        setIntField(term265026, term265026.getClass(), "techScore", 0);
        setIntField(term265026, term265026.getClass(), "techScoreRank", 0);
        setIntField(term265026, term265026.getClass(), "battleScore", 0);
        setIntField(term265026, term265026.getClass(), "battleScoreRank", 0);
        setIntField(term265026, term265026.getClass(), "platinumScore", 0);
        setIntField(term265026, term265026.getClass(), "maxCombo", 0);
        setIntField(term265026, term265026.getClass(), "judgeMiss", 0);
        setIntField(term265026, term265026.getClass(), "judgeHit", 0);
        setIntField(term265026, term265026.getClass(), "judgeBreak", 0);
        setIntField(term265026, term265026.getClass(), "judgeCriticalBreak", 0);
        setIntField(term265026, term265026.getClass(), "rateTap", 0);
        setIntField(term265026, term265026.getClass(), "rateHold", 0);
        setIntField(term265026, term265026.getClass(), "rateFlick", 0);
        setIntField(term265026, term265026.getClass(), "rateSideTap", 0);
        setIntField(term265026, term265026.getClass(), "rateSideHold", 0);
        setIntField(term265026, term265026.getClass(), "bellCount", 0);
        setIntField(term265026, term265026.getClass(), "totalBellCount", 0);
        setIntField(term265026, term265026.getClass(), "damageCount", 0);
        setIntField(term265026, term265026.getClass(), "overDamage", 0);
        setBooleanField(term265026, term265026.getClass(), "isTechNewRecord", false);
        setBooleanField(term265026, term265026.getClass(), "isBattleNewRecord", false);
        setBooleanField(term265026, term265026.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term265026, term265026.getClass(), "isFullCombo", false);
        setBooleanField(term265026, term265026.getClass(), "isFullBell", false);
        setBooleanField(term265026, term265026.getClass(), "isAllBreak", false);
        setIntField(term265026, term265026.getClass(), "playerRating", 0);
        setIntField(term265026, term265026.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardAttack1", argTypes, term265026, args);
    }

};


