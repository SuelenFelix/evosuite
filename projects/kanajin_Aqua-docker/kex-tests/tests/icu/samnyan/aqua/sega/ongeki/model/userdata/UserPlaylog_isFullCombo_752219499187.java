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

public class UserPlaylog_isFullCombo_752219499187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266621;

    public UserPlaylog_isFullCombo_752219499187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266621 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term266621, term266621.getClass(), "id", 0L);
        setField(term266621, term266621.getClass(), "user", null);
        setIntField(term266621, term266621.getClass(), "sortNumber", 0);
        setIntField(term266621, term266621.getClass(), "placeId", 0);
        setField(term266621, term266621.getClass(), "placeName", null);
        setField(term266621, term266621.getClass(), "playDate", null);
        setField(term266621, term266621.getClass(), "userPlayDate", null);
        setIntField(term266621, term266621.getClass(), "musicId", 0);
        setIntField(term266621, term266621.getClass(), "level", 0);
        setIntField(term266621, term266621.getClass(), "playKind", 0);
        setIntField(term266621, term266621.getClass(), "eventId", 0);
        setField(term266621, term266621.getClass(), "eventName", null);
        setIntField(term266621, term266621.getClass(), "eventPoint", 0);
        setIntField(term266621, term266621.getClass(), "playedUserId1", 0);
        setIntField(term266621, term266621.getClass(), "playedUserId2", 0);
        setIntField(term266621, term266621.getClass(), "playedUserId3", 0);
        setField(term266621, term266621.getClass(), "playedUserName1", null);
        setField(term266621, term266621.getClass(), "playedUserName2", null);
        setField(term266621, term266621.getClass(), "playedUserName3", null);
        setIntField(term266621, term266621.getClass(), "playedMusicLevel1", 0);
        setIntField(term266621, term266621.getClass(), "playedMusicLevel2", 0);
        setIntField(term266621, term266621.getClass(), "playedMusicLevel3", 0);
        setIntField(term266621, term266621.getClass(), "cardId1", 0);
        setIntField(term266621, term266621.getClass(), "cardId2", 0);
        setIntField(term266621, term266621.getClass(), "cardId3", 0);
        setIntField(term266621, term266621.getClass(), "cardLevel1", 0);
        setIntField(term266621, term266621.getClass(), "cardLevel2", 0);
        setIntField(term266621, term266621.getClass(), "cardLevel3", 0);
        setIntField(term266621, term266621.getClass(), "cardAttack1", 0);
        setIntField(term266621, term266621.getClass(), "cardAttack2", 0);
        setIntField(term266621, term266621.getClass(), "cardAttack3", 0);
        setIntField(term266621, term266621.getClass(), "bossCharaId", 0);
        setIntField(term266621, term266621.getClass(), "bossLevel", 0);
        setIntField(term266621, term266621.getClass(), "bossAttribute", 0);
        setIntField(term266621, term266621.getClass(), "clearStatus", 0);
        setIntField(term266621, term266621.getClass(), "techScore", 0);
        setIntField(term266621, term266621.getClass(), "techScoreRank", 0);
        setIntField(term266621, term266621.getClass(), "battleScore", 0);
        setIntField(term266621, term266621.getClass(), "battleScoreRank", 0);
        setIntField(term266621, term266621.getClass(), "platinumScore", 0);
        setIntField(term266621, term266621.getClass(), "maxCombo", 0);
        setIntField(term266621, term266621.getClass(), "judgeMiss", 0);
        setIntField(term266621, term266621.getClass(), "judgeHit", 0);
        setIntField(term266621, term266621.getClass(), "judgeBreak", 0);
        setIntField(term266621, term266621.getClass(), "judgeCriticalBreak", 0);
        setIntField(term266621, term266621.getClass(), "rateTap", 0);
        setIntField(term266621, term266621.getClass(), "rateHold", 0);
        setIntField(term266621, term266621.getClass(), "rateFlick", 0);
        setIntField(term266621, term266621.getClass(), "rateSideTap", 0);
        setIntField(term266621, term266621.getClass(), "rateSideHold", 0);
        setIntField(term266621, term266621.getClass(), "bellCount", 0);
        setIntField(term266621, term266621.getClass(), "totalBellCount", 0);
        setIntField(term266621, term266621.getClass(), "damageCount", 0);
        setIntField(term266621, term266621.getClass(), "overDamage", 0);
        setBooleanField(term266621, term266621.getClass(), "isTechNewRecord", false);
        setBooleanField(term266621, term266621.getClass(), "isBattleNewRecord", false);
        setBooleanField(term266621, term266621.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term266621, term266621.getClass(), "isFullCombo", false);
        setBooleanField(term266621, term266621.getClass(), "isFullBell", false);
        setBooleanField(term266621, term266621.getClass(), "isAllBreak", false);
        setIntField(term266621, term266621.getClass(), "playerRating", 0);
        setIntField(term266621, term266621.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFullCombo", argTypes, term266621, args);
    }

};


