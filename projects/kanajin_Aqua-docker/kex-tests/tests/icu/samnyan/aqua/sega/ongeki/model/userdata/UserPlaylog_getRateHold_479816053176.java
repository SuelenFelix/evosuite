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

public class UserPlaylog_getRateHold_479816053176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266016;

    public UserPlaylog_getRateHold_479816053176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266016 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term266016, term266016.getClass(), "id", 0L);
        setField(term266016, term266016.getClass(), "user", null);
        setIntField(term266016, term266016.getClass(), "sortNumber", 0);
        setIntField(term266016, term266016.getClass(), "placeId", 0);
        setField(term266016, term266016.getClass(), "placeName", null);
        setField(term266016, term266016.getClass(), "playDate", null);
        setField(term266016, term266016.getClass(), "userPlayDate", null);
        setIntField(term266016, term266016.getClass(), "musicId", 0);
        setIntField(term266016, term266016.getClass(), "level", 0);
        setIntField(term266016, term266016.getClass(), "playKind", 0);
        setIntField(term266016, term266016.getClass(), "eventId", 0);
        setField(term266016, term266016.getClass(), "eventName", null);
        setIntField(term266016, term266016.getClass(), "eventPoint", 0);
        setIntField(term266016, term266016.getClass(), "playedUserId1", 0);
        setIntField(term266016, term266016.getClass(), "playedUserId2", 0);
        setIntField(term266016, term266016.getClass(), "playedUserId3", 0);
        setField(term266016, term266016.getClass(), "playedUserName1", null);
        setField(term266016, term266016.getClass(), "playedUserName2", null);
        setField(term266016, term266016.getClass(), "playedUserName3", null);
        setIntField(term266016, term266016.getClass(), "playedMusicLevel1", 0);
        setIntField(term266016, term266016.getClass(), "playedMusicLevel2", 0);
        setIntField(term266016, term266016.getClass(), "playedMusicLevel3", 0);
        setIntField(term266016, term266016.getClass(), "cardId1", 0);
        setIntField(term266016, term266016.getClass(), "cardId2", 0);
        setIntField(term266016, term266016.getClass(), "cardId3", 0);
        setIntField(term266016, term266016.getClass(), "cardLevel1", 0);
        setIntField(term266016, term266016.getClass(), "cardLevel2", 0);
        setIntField(term266016, term266016.getClass(), "cardLevel3", 0);
        setIntField(term266016, term266016.getClass(), "cardAttack1", 0);
        setIntField(term266016, term266016.getClass(), "cardAttack2", 0);
        setIntField(term266016, term266016.getClass(), "cardAttack3", 0);
        setIntField(term266016, term266016.getClass(), "bossCharaId", 0);
        setIntField(term266016, term266016.getClass(), "bossLevel", 0);
        setIntField(term266016, term266016.getClass(), "bossAttribute", 0);
        setIntField(term266016, term266016.getClass(), "clearStatus", 0);
        setIntField(term266016, term266016.getClass(), "techScore", 0);
        setIntField(term266016, term266016.getClass(), "techScoreRank", 0);
        setIntField(term266016, term266016.getClass(), "battleScore", 0);
        setIntField(term266016, term266016.getClass(), "battleScoreRank", 0);
        setIntField(term266016, term266016.getClass(), "platinumScore", 0);
        setIntField(term266016, term266016.getClass(), "maxCombo", 0);
        setIntField(term266016, term266016.getClass(), "judgeMiss", 0);
        setIntField(term266016, term266016.getClass(), "judgeHit", 0);
        setIntField(term266016, term266016.getClass(), "judgeBreak", 0);
        setIntField(term266016, term266016.getClass(), "judgeCriticalBreak", 0);
        setIntField(term266016, term266016.getClass(), "rateTap", 0);
        setIntField(term266016, term266016.getClass(), "rateHold", 0);
        setIntField(term266016, term266016.getClass(), "rateFlick", 0);
        setIntField(term266016, term266016.getClass(), "rateSideTap", 0);
        setIntField(term266016, term266016.getClass(), "rateSideHold", 0);
        setIntField(term266016, term266016.getClass(), "bellCount", 0);
        setIntField(term266016, term266016.getClass(), "totalBellCount", 0);
        setIntField(term266016, term266016.getClass(), "damageCount", 0);
        setIntField(term266016, term266016.getClass(), "overDamage", 0);
        setBooleanField(term266016, term266016.getClass(), "isTechNewRecord", false);
        setBooleanField(term266016, term266016.getClass(), "isBattleNewRecord", false);
        setBooleanField(term266016, term266016.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term266016, term266016.getClass(), "isFullCombo", false);
        setBooleanField(term266016, term266016.getClass(), "isFullBell", false);
        setBooleanField(term266016, term266016.getClass(), "isAllBreak", false);
        setIntField(term266016, term266016.getClass(), "playerRating", 0);
        setIntField(term266016, term266016.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateHold", argTypes, term266016, args);
    }

};


