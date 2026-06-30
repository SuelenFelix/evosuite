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

public class UserPlaylog_hashCode_1735582223256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270524;

    public UserPlaylog_hashCode_1735582223256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270524 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term270524, term270524.getClass(), "id", 0L);
        setField(term270524, term270524.getClass(), "user", null);
        setIntField(term270524, term270524.getClass(), "sortNumber", 0);
        setIntField(term270524, term270524.getClass(), "placeId", 0);
        setField(term270524, term270524.getClass(), "placeName", null);
        setField(term270524, term270524.getClass(), "playDate", null);
        setField(term270524, term270524.getClass(), "userPlayDate", null);
        setIntField(term270524, term270524.getClass(), "musicId", 0);
        setIntField(term270524, term270524.getClass(), "level", 0);
        setIntField(term270524, term270524.getClass(), "playKind", 0);
        setIntField(term270524, term270524.getClass(), "eventId", 0);
        setField(term270524, term270524.getClass(), "eventName", null);
        setIntField(term270524, term270524.getClass(), "eventPoint", 0);
        setIntField(term270524, term270524.getClass(), "playedUserId1", 0);
        setIntField(term270524, term270524.getClass(), "playedUserId2", 0);
        setIntField(term270524, term270524.getClass(), "playedUserId3", 0);
        setField(term270524, term270524.getClass(), "playedUserName1", null);
        setField(term270524, term270524.getClass(), "playedUserName2", null);
        setField(term270524, term270524.getClass(), "playedUserName3", null);
        setIntField(term270524, term270524.getClass(), "playedMusicLevel1", 0);
        setIntField(term270524, term270524.getClass(), "playedMusicLevel2", 0);
        setIntField(term270524, term270524.getClass(), "playedMusicLevel3", 0);
        setIntField(term270524, term270524.getClass(), "cardId1", 0);
        setIntField(term270524, term270524.getClass(), "cardId2", 0);
        setIntField(term270524, term270524.getClass(), "cardId3", 0);
        setIntField(term270524, term270524.getClass(), "cardLevel1", 0);
        setIntField(term270524, term270524.getClass(), "cardLevel2", 0);
        setIntField(term270524, term270524.getClass(), "cardLevel3", 0);
        setIntField(term270524, term270524.getClass(), "cardAttack1", 0);
        setIntField(term270524, term270524.getClass(), "cardAttack2", 0);
        setIntField(term270524, term270524.getClass(), "cardAttack3", 0);
        setIntField(term270524, term270524.getClass(), "bossCharaId", 0);
        setIntField(term270524, term270524.getClass(), "bossLevel", 0);
        setIntField(term270524, term270524.getClass(), "bossAttribute", 0);
        setIntField(term270524, term270524.getClass(), "clearStatus", 0);
        setIntField(term270524, term270524.getClass(), "techScore", 0);
        setIntField(term270524, term270524.getClass(), "techScoreRank", 0);
        setIntField(term270524, term270524.getClass(), "battleScore", 0);
        setIntField(term270524, term270524.getClass(), "battleScoreRank", 0);
        setIntField(term270524, term270524.getClass(), "platinumScore", 0);
        setIntField(term270524, term270524.getClass(), "maxCombo", 0);
        setIntField(term270524, term270524.getClass(), "judgeMiss", 0);
        setIntField(term270524, term270524.getClass(), "judgeHit", 0);
        setIntField(term270524, term270524.getClass(), "judgeBreak", 0);
        setIntField(term270524, term270524.getClass(), "judgeCriticalBreak", 0);
        setIntField(term270524, term270524.getClass(), "rateTap", 0);
        setIntField(term270524, term270524.getClass(), "rateHold", 0);
        setIntField(term270524, term270524.getClass(), "rateFlick", 0);
        setIntField(term270524, term270524.getClass(), "rateSideTap", 0);
        setIntField(term270524, term270524.getClass(), "rateSideHold", 0);
        setIntField(term270524, term270524.getClass(), "bellCount", 0);
        setIntField(term270524, term270524.getClass(), "totalBellCount", 0);
        setIntField(term270524, term270524.getClass(), "damageCount", 0);
        setIntField(term270524, term270524.getClass(), "overDamage", 0);
        setBooleanField(term270524, term270524.getClass(), "isTechNewRecord", false);
        setBooleanField(term270524, term270524.getClass(), "isBattleNewRecord", false);
        setBooleanField(term270524, term270524.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term270524, term270524.getClass(), "isFullCombo", false);
        setBooleanField(term270524, term270524.getClass(), "isFullBell", false);
        setBooleanField(term270524, term270524.getClass(), "isAllBreak", false);
        setIntField(term270524, term270524.getClass(), "playerRating", 0);
        setIntField(term270524, term270524.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term270524, args);
    }

};


