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

public class UserPlaylog_getPlayedUserId2_1033666439144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264256;

    public UserPlaylog_getPlayedUserId2_1033666439144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264256 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term264256, term264256.getClass(), "id", 0L);
        setField(term264256, term264256.getClass(), "user", null);
        setIntField(term264256, term264256.getClass(), "sortNumber", 0);
        setIntField(term264256, term264256.getClass(), "placeId", 0);
        setField(term264256, term264256.getClass(), "placeName", null);
        setField(term264256, term264256.getClass(), "playDate", null);
        setField(term264256, term264256.getClass(), "userPlayDate", null);
        setIntField(term264256, term264256.getClass(), "musicId", 0);
        setIntField(term264256, term264256.getClass(), "level", 0);
        setIntField(term264256, term264256.getClass(), "playKind", 0);
        setIntField(term264256, term264256.getClass(), "eventId", 0);
        setField(term264256, term264256.getClass(), "eventName", null);
        setIntField(term264256, term264256.getClass(), "eventPoint", 0);
        setIntField(term264256, term264256.getClass(), "playedUserId1", 0);
        setIntField(term264256, term264256.getClass(), "playedUserId2", 0);
        setIntField(term264256, term264256.getClass(), "playedUserId3", 0);
        setField(term264256, term264256.getClass(), "playedUserName1", null);
        setField(term264256, term264256.getClass(), "playedUserName2", null);
        setField(term264256, term264256.getClass(), "playedUserName3", null);
        setIntField(term264256, term264256.getClass(), "playedMusicLevel1", 0);
        setIntField(term264256, term264256.getClass(), "playedMusicLevel2", 0);
        setIntField(term264256, term264256.getClass(), "playedMusicLevel3", 0);
        setIntField(term264256, term264256.getClass(), "cardId1", 0);
        setIntField(term264256, term264256.getClass(), "cardId2", 0);
        setIntField(term264256, term264256.getClass(), "cardId3", 0);
        setIntField(term264256, term264256.getClass(), "cardLevel1", 0);
        setIntField(term264256, term264256.getClass(), "cardLevel2", 0);
        setIntField(term264256, term264256.getClass(), "cardLevel3", 0);
        setIntField(term264256, term264256.getClass(), "cardAttack1", 0);
        setIntField(term264256, term264256.getClass(), "cardAttack2", 0);
        setIntField(term264256, term264256.getClass(), "cardAttack3", 0);
        setIntField(term264256, term264256.getClass(), "bossCharaId", 0);
        setIntField(term264256, term264256.getClass(), "bossLevel", 0);
        setIntField(term264256, term264256.getClass(), "bossAttribute", 0);
        setIntField(term264256, term264256.getClass(), "clearStatus", 0);
        setIntField(term264256, term264256.getClass(), "techScore", 0);
        setIntField(term264256, term264256.getClass(), "techScoreRank", 0);
        setIntField(term264256, term264256.getClass(), "battleScore", 0);
        setIntField(term264256, term264256.getClass(), "battleScoreRank", 0);
        setIntField(term264256, term264256.getClass(), "platinumScore", 0);
        setIntField(term264256, term264256.getClass(), "maxCombo", 0);
        setIntField(term264256, term264256.getClass(), "judgeMiss", 0);
        setIntField(term264256, term264256.getClass(), "judgeHit", 0);
        setIntField(term264256, term264256.getClass(), "judgeBreak", 0);
        setIntField(term264256, term264256.getClass(), "judgeCriticalBreak", 0);
        setIntField(term264256, term264256.getClass(), "rateTap", 0);
        setIntField(term264256, term264256.getClass(), "rateHold", 0);
        setIntField(term264256, term264256.getClass(), "rateFlick", 0);
        setIntField(term264256, term264256.getClass(), "rateSideTap", 0);
        setIntField(term264256, term264256.getClass(), "rateSideHold", 0);
        setIntField(term264256, term264256.getClass(), "bellCount", 0);
        setIntField(term264256, term264256.getClass(), "totalBellCount", 0);
        setIntField(term264256, term264256.getClass(), "damageCount", 0);
        setIntField(term264256, term264256.getClass(), "overDamage", 0);
        setBooleanField(term264256, term264256.getClass(), "isTechNewRecord", false);
        setBooleanField(term264256, term264256.getClass(), "isBattleNewRecord", false);
        setBooleanField(term264256, term264256.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term264256, term264256.getClass(), "isFullCombo", false);
        setBooleanField(term264256, term264256.getClass(), "isFullBell", false);
        setBooleanField(term264256, term264256.getClass(), "isAllBreak", false);
        setIntField(term264256, term264256.getClass(), "playerRating", 0);
        setIntField(term264256, term264256.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserId2", argTypes, term264256, args);
    }

};


