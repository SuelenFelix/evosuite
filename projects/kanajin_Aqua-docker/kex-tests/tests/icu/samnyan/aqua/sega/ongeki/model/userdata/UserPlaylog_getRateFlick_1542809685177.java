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

public class UserPlaylog_getRateFlick_1542809685177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266071;

    public UserPlaylog_getRateFlick_1542809685177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266071 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term266071, term266071.getClass(), "id", 0L);
        setField(term266071, term266071.getClass(), "user", null);
        setIntField(term266071, term266071.getClass(), "sortNumber", 0);
        setIntField(term266071, term266071.getClass(), "placeId", 0);
        setField(term266071, term266071.getClass(), "placeName", null);
        setField(term266071, term266071.getClass(), "playDate", null);
        setField(term266071, term266071.getClass(), "userPlayDate", null);
        setIntField(term266071, term266071.getClass(), "musicId", 0);
        setIntField(term266071, term266071.getClass(), "level", 0);
        setIntField(term266071, term266071.getClass(), "playKind", 0);
        setIntField(term266071, term266071.getClass(), "eventId", 0);
        setField(term266071, term266071.getClass(), "eventName", null);
        setIntField(term266071, term266071.getClass(), "eventPoint", 0);
        setIntField(term266071, term266071.getClass(), "playedUserId1", 0);
        setIntField(term266071, term266071.getClass(), "playedUserId2", 0);
        setIntField(term266071, term266071.getClass(), "playedUserId3", 0);
        setField(term266071, term266071.getClass(), "playedUserName1", null);
        setField(term266071, term266071.getClass(), "playedUserName2", null);
        setField(term266071, term266071.getClass(), "playedUserName3", null);
        setIntField(term266071, term266071.getClass(), "playedMusicLevel1", 0);
        setIntField(term266071, term266071.getClass(), "playedMusicLevel2", 0);
        setIntField(term266071, term266071.getClass(), "playedMusicLevel3", 0);
        setIntField(term266071, term266071.getClass(), "cardId1", 0);
        setIntField(term266071, term266071.getClass(), "cardId2", 0);
        setIntField(term266071, term266071.getClass(), "cardId3", 0);
        setIntField(term266071, term266071.getClass(), "cardLevel1", 0);
        setIntField(term266071, term266071.getClass(), "cardLevel2", 0);
        setIntField(term266071, term266071.getClass(), "cardLevel3", 0);
        setIntField(term266071, term266071.getClass(), "cardAttack1", 0);
        setIntField(term266071, term266071.getClass(), "cardAttack2", 0);
        setIntField(term266071, term266071.getClass(), "cardAttack3", 0);
        setIntField(term266071, term266071.getClass(), "bossCharaId", 0);
        setIntField(term266071, term266071.getClass(), "bossLevel", 0);
        setIntField(term266071, term266071.getClass(), "bossAttribute", 0);
        setIntField(term266071, term266071.getClass(), "clearStatus", 0);
        setIntField(term266071, term266071.getClass(), "techScore", 0);
        setIntField(term266071, term266071.getClass(), "techScoreRank", 0);
        setIntField(term266071, term266071.getClass(), "battleScore", 0);
        setIntField(term266071, term266071.getClass(), "battleScoreRank", 0);
        setIntField(term266071, term266071.getClass(), "platinumScore", 0);
        setIntField(term266071, term266071.getClass(), "maxCombo", 0);
        setIntField(term266071, term266071.getClass(), "judgeMiss", 0);
        setIntField(term266071, term266071.getClass(), "judgeHit", 0);
        setIntField(term266071, term266071.getClass(), "judgeBreak", 0);
        setIntField(term266071, term266071.getClass(), "judgeCriticalBreak", 0);
        setIntField(term266071, term266071.getClass(), "rateTap", 0);
        setIntField(term266071, term266071.getClass(), "rateHold", 0);
        setIntField(term266071, term266071.getClass(), "rateFlick", 0);
        setIntField(term266071, term266071.getClass(), "rateSideTap", 0);
        setIntField(term266071, term266071.getClass(), "rateSideHold", 0);
        setIntField(term266071, term266071.getClass(), "bellCount", 0);
        setIntField(term266071, term266071.getClass(), "totalBellCount", 0);
        setIntField(term266071, term266071.getClass(), "damageCount", 0);
        setIntField(term266071, term266071.getClass(), "overDamage", 0);
        setBooleanField(term266071, term266071.getClass(), "isTechNewRecord", false);
        setBooleanField(term266071, term266071.getClass(), "isBattleNewRecord", false);
        setBooleanField(term266071, term266071.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term266071, term266071.getClass(), "isFullCombo", false);
        setBooleanField(term266071, term266071.getClass(), "isFullBell", false);
        setBooleanField(term266071, term266071.getClass(), "isAllBreak", false);
        setIntField(term266071, term266071.getClass(), "playerRating", 0);
        setIntField(term266071, term266071.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateFlick", argTypes, term266071, args);
    }

};


