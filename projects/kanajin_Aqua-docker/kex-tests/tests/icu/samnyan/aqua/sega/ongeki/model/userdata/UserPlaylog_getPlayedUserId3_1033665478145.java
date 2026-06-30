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

public class UserPlaylog_getPlayedUserId3_1033665478145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264311;

    public UserPlaylog_getPlayedUserId3_1033665478145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264311 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term264311, term264311.getClass(), "id", 0L);
        setField(term264311, term264311.getClass(), "user", null);
        setIntField(term264311, term264311.getClass(), "sortNumber", 0);
        setIntField(term264311, term264311.getClass(), "placeId", 0);
        setField(term264311, term264311.getClass(), "placeName", null);
        setField(term264311, term264311.getClass(), "playDate", null);
        setField(term264311, term264311.getClass(), "userPlayDate", null);
        setIntField(term264311, term264311.getClass(), "musicId", 0);
        setIntField(term264311, term264311.getClass(), "level", 0);
        setIntField(term264311, term264311.getClass(), "playKind", 0);
        setIntField(term264311, term264311.getClass(), "eventId", 0);
        setField(term264311, term264311.getClass(), "eventName", null);
        setIntField(term264311, term264311.getClass(), "eventPoint", 0);
        setIntField(term264311, term264311.getClass(), "playedUserId1", 0);
        setIntField(term264311, term264311.getClass(), "playedUserId2", 0);
        setIntField(term264311, term264311.getClass(), "playedUserId3", 0);
        setField(term264311, term264311.getClass(), "playedUserName1", null);
        setField(term264311, term264311.getClass(), "playedUserName2", null);
        setField(term264311, term264311.getClass(), "playedUserName3", null);
        setIntField(term264311, term264311.getClass(), "playedMusicLevel1", 0);
        setIntField(term264311, term264311.getClass(), "playedMusicLevel2", 0);
        setIntField(term264311, term264311.getClass(), "playedMusicLevel3", 0);
        setIntField(term264311, term264311.getClass(), "cardId1", 0);
        setIntField(term264311, term264311.getClass(), "cardId2", 0);
        setIntField(term264311, term264311.getClass(), "cardId3", 0);
        setIntField(term264311, term264311.getClass(), "cardLevel1", 0);
        setIntField(term264311, term264311.getClass(), "cardLevel2", 0);
        setIntField(term264311, term264311.getClass(), "cardLevel3", 0);
        setIntField(term264311, term264311.getClass(), "cardAttack1", 0);
        setIntField(term264311, term264311.getClass(), "cardAttack2", 0);
        setIntField(term264311, term264311.getClass(), "cardAttack3", 0);
        setIntField(term264311, term264311.getClass(), "bossCharaId", 0);
        setIntField(term264311, term264311.getClass(), "bossLevel", 0);
        setIntField(term264311, term264311.getClass(), "bossAttribute", 0);
        setIntField(term264311, term264311.getClass(), "clearStatus", 0);
        setIntField(term264311, term264311.getClass(), "techScore", 0);
        setIntField(term264311, term264311.getClass(), "techScoreRank", 0);
        setIntField(term264311, term264311.getClass(), "battleScore", 0);
        setIntField(term264311, term264311.getClass(), "battleScoreRank", 0);
        setIntField(term264311, term264311.getClass(), "platinumScore", 0);
        setIntField(term264311, term264311.getClass(), "maxCombo", 0);
        setIntField(term264311, term264311.getClass(), "judgeMiss", 0);
        setIntField(term264311, term264311.getClass(), "judgeHit", 0);
        setIntField(term264311, term264311.getClass(), "judgeBreak", 0);
        setIntField(term264311, term264311.getClass(), "judgeCriticalBreak", 0);
        setIntField(term264311, term264311.getClass(), "rateTap", 0);
        setIntField(term264311, term264311.getClass(), "rateHold", 0);
        setIntField(term264311, term264311.getClass(), "rateFlick", 0);
        setIntField(term264311, term264311.getClass(), "rateSideTap", 0);
        setIntField(term264311, term264311.getClass(), "rateSideHold", 0);
        setIntField(term264311, term264311.getClass(), "bellCount", 0);
        setIntField(term264311, term264311.getClass(), "totalBellCount", 0);
        setIntField(term264311, term264311.getClass(), "damageCount", 0);
        setIntField(term264311, term264311.getClass(), "overDamage", 0);
        setBooleanField(term264311, term264311.getClass(), "isTechNewRecord", false);
        setBooleanField(term264311, term264311.getClass(), "isBattleNewRecord", false);
        setBooleanField(term264311, term264311.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term264311, term264311.getClass(), "isFullCombo", false);
        setBooleanField(term264311, term264311.getClass(), "isFullBell", false);
        setBooleanField(term264311, term264311.getClass(), "isAllBreak", false);
        setIntField(term264311, term264311.getClass(), "playerRating", 0);
        setIntField(term264311, term264311.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserId3", argTypes, term264311, args);
    }

};


