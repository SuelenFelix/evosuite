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
import java.lang.Boolean;

public class UserPlaylog_setBattleNewRecord_1270821731247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270015;
     Object term270070;

    public UserPlaylog_setBattleNewRecord_1270821731247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270015 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term270015, term270015.getClass(), "id", 0L);
        setField(term270015, term270015.getClass(), "user", null);
        setIntField(term270015, term270015.getClass(), "sortNumber", 0);
        setIntField(term270015, term270015.getClass(), "placeId", 0);
        setField(term270015, term270015.getClass(), "placeName", null);
        setField(term270015, term270015.getClass(), "playDate", null);
        setField(term270015, term270015.getClass(), "userPlayDate", null);
        setIntField(term270015, term270015.getClass(), "musicId", 0);
        setIntField(term270015, term270015.getClass(), "level", 0);
        setIntField(term270015, term270015.getClass(), "playKind", 0);
        setIntField(term270015, term270015.getClass(), "eventId", 0);
        setField(term270015, term270015.getClass(), "eventName", null);
        setIntField(term270015, term270015.getClass(), "eventPoint", 0);
        setIntField(term270015, term270015.getClass(), "playedUserId1", 0);
        setIntField(term270015, term270015.getClass(), "playedUserId2", 0);
        setIntField(term270015, term270015.getClass(), "playedUserId3", 0);
        setField(term270015, term270015.getClass(), "playedUserName1", null);
        setField(term270015, term270015.getClass(), "playedUserName2", null);
        setField(term270015, term270015.getClass(), "playedUserName3", null);
        setIntField(term270015, term270015.getClass(), "playedMusicLevel1", 0);
        setIntField(term270015, term270015.getClass(), "playedMusicLevel2", 0);
        setIntField(term270015, term270015.getClass(), "playedMusicLevel3", 0);
        setIntField(term270015, term270015.getClass(), "cardId1", 0);
        setIntField(term270015, term270015.getClass(), "cardId2", 0);
        setIntField(term270015, term270015.getClass(), "cardId3", 0);
        setIntField(term270015, term270015.getClass(), "cardLevel1", 0);
        setIntField(term270015, term270015.getClass(), "cardLevel2", 0);
        setIntField(term270015, term270015.getClass(), "cardLevel3", 0);
        setIntField(term270015, term270015.getClass(), "cardAttack1", 0);
        setIntField(term270015, term270015.getClass(), "cardAttack2", 0);
        setIntField(term270015, term270015.getClass(), "cardAttack3", 0);
        setIntField(term270015, term270015.getClass(), "bossCharaId", 0);
        setIntField(term270015, term270015.getClass(), "bossLevel", 0);
        setIntField(term270015, term270015.getClass(), "bossAttribute", 0);
        setIntField(term270015, term270015.getClass(), "clearStatus", 0);
        setIntField(term270015, term270015.getClass(), "techScore", 0);
        setIntField(term270015, term270015.getClass(), "techScoreRank", 0);
        setIntField(term270015, term270015.getClass(), "battleScore", 0);
        setIntField(term270015, term270015.getClass(), "battleScoreRank", 0);
        setIntField(term270015, term270015.getClass(), "platinumScore", 0);
        setIntField(term270015, term270015.getClass(), "maxCombo", 0);
        setIntField(term270015, term270015.getClass(), "judgeMiss", 0);
        setIntField(term270015, term270015.getClass(), "judgeHit", 0);
        setIntField(term270015, term270015.getClass(), "judgeBreak", 0);
        setIntField(term270015, term270015.getClass(), "judgeCriticalBreak", 0);
        setIntField(term270015, term270015.getClass(), "rateTap", 0);
        setIntField(term270015, term270015.getClass(), "rateHold", 0);
        setIntField(term270015, term270015.getClass(), "rateFlick", 0);
        setIntField(term270015, term270015.getClass(), "rateSideTap", 0);
        setIntField(term270015, term270015.getClass(), "rateSideHold", 0);
        setIntField(term270015, term270015.getClass(), "bellCount", 0);
        setIntField(term270015, term270015.getClass(), "totalBellCount", 0);
        setIntField(term270015, term270015.getClass(), "damageCount", 0);
        setIntField(term270015, term270015.getClass(), "overDamage", 0);
        setBooleanField(term270015, term270015.getClass(), "isTechNewRecord", false);
        setBooleanField(term270015, term270015.getClass(), "isBattleNewRecord", false);
        setBooleanField(term270015, term270015.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term270015, term270015.getClass(), "isFullCombo", false);
        setBooleanField(term270015, term270015.getClass(), "isFullBell", false);
        setBooleanField(term270015, term270015.getClass(), "isAllBreak", false);
        setIntField(term270015, term270015.getClass(), "playerRating", 0);
        setIntField(term270015, term270015.getClass(), "battlePoint", 0);
        term270070 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term270070;
        callMethod(klass, "setBattleNewRecord", argTypes, term270015, args);
    }

};


