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

public class UserPlaylog_getBossCharaId_1650776249161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265191;

    public UserPlaylog_getBossCharaId_1650776249161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265191 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term265191, term265191.getClass(), "id", 0L);
        setField(term265191, term265191.getClass(), "user", null);
        setIntField(term265191, term265191.getClass(), "sortNumber", 0);
        setIntField(term265191, term265191.getClass(), "placeId", 0);
        setField(term265191, term265191.getClass(), "placeName", null);
        setField(term265191, term265191.getClass(), "playDate", null);
        setField(term265191, term265191.getClass(), "userPlayDate", null);
        setIntField(term265191, term265191.getClass(), "musicId", 0);
        setIntField(term265191, term265191.getClass(), "level", 0);
        setIntField(term265191, term265191.getClass(), "playKind", 0);
        setIntField(term265191, term265191.getClass(), "eventId", 0);
        setField(term265191, term265191.getClass(), "eventName", null);
        setIntField(term265191, term265191.getClass(), "eventPoint", 0);
        setIntField(term265191, term265191.getClass(), "playedUserId1", 0);
        setIntField(term265191, term265191.getClass(), "playedUserId2", 0);
        setIntField(term265191, term265191.getClass(), "playedUserId3", 0);
        setField(term265191, term265191.getClass(), "playedUserName1", null);
        setField(term265191, term265191.getClass(), "playedUserName2", null);
        setField(term265191, term265191.getClass(), "playedUserName3", null);
        setIntField(term265191, term265191.getClass(), "playedMusicLevel1", 0);
        setIntField(term265191, term265191.getClass(), "playedMusicLevel2", 0);
        setIntField(term265191, term265191.getClass(), "playedMusicLevel3", 0);
        setIntField(term265191, term265191.getClass(), "cardId1", 0);
        setIntField(term265191, term265191.getClass(), "cardId2", 0);
        setIntField(term265191, term265191.getClass(), "cardId3", 0);
        setIntField(term265191, term265191.getClass(), "cardLevel1", 0);
        setIntField(term265191, term265191.getClass(), "cardLevel2", 0);
        setIntField(term265191, term265191.getClass(), "cardLevel3", 0);
        setIntField(term265191, term265191.getClass(), "cardAttack1", 0);
        setIntField(term265191, term265191.getClass(), "cardAttack2", 0);
        setIntField(term265191, term265191.getClass(), "cardAttack3", 0);
        setIntField(term265191, term265191.getClass(), "bossCharaId", 0);
        setIntField(term265191, term265191.getClass(), "bossLevel", 0);
        setIntField(term265191, term265191.getClass(), "bossAttribute", 0);
        setIntField(term265191, term265191.getClass(), "clearStatus", 0);
        setIntField(term265191, term265191.getClass(), "techScore", 0);
        setIntField(term265191, term265191.getClass(), "techScoreRank", 0);
        setIntField(term265191, term265191.getClass(), "battleScore", 0);
        setIntField(term265191, term265191.getClass(), "battleScoreRank", 0);
        setIntField(term265191, term265191.getClass(), "platinumScore", 0);
        setIntField(term265191, term265191.getClass(), "maxCombo", 0);
        setIntField(term265191, term265191.getClass(), "judgeMiss", 0);
        setIntField(term265191, term265191.getClass(), "judgeHit", 0);
        setIntField(term265191, term265191.getClass(), "judgeBreak", 0);
        setIntField(term265191, term265191.getClass(), "judgeCriticalBreak", 0);
        setIntField(term265191, term265191.getClass(), "rateTap", 0);
        setIntField(term265191, term265191.getClass(), "rateHold", 0);
        setIntField(term265191, term265191.getClass(), "rateFlick", 0);
        setIntField(term265191, term265191.getClass(), "rateSideTap", 0);
        setIntField(term265191, term265191.getClass(), "rateSideHold", 0);
        setIntField(term265191, term265191.getClass(), "bellCount", 0);
        setIntField(term265191, term265191.getClass(), "totalBellCount", 0);
        setIntField(term265191, term265191.getClass(), "damageCount", 0);
        setIntField(term265191, term265191.getClass(), "overDamage", 0);
        setBooleanField(term265191, term265191.getClass(), "isTechNewRecord", false);
        setBooleanField(term265191, term265191.getClass(), "isBattleNewRecord", false);
        setBooleanField(term265191, term265191.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term265191, term265191.getClass(), "isFullCombo", false);
        setBooleanField(term265191, term265191.getClass(), "isFullBell", false);
        setBooleanField(term265191, term265191.getClass(), "isAllBreak", false);
        setIntField(term265191, term265191.getClass(), "playerRating", 0);
        setIntField(term265191, term265191.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBossCharaId", argTypes, term265191, args);
    }

};


