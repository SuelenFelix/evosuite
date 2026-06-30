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

public class UserPlaylog_getTechScore_1631414788165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265411;

    public UserPlaylog_getTechScore_1631414788165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265411 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term265411, term265411.getClass(), "id", 0L);
        setField(term265411, term265411.getClass(), "user", null);
        setIntField(term265411, term265411.getClass(), "sortNumber", 0);
        setIntField(term265411, term265411.getClass(), "placeId", 0);
        setField(term265411, term265411.getClass(), "placeName", null);
        setField(term265411, term265411.getClass(), "playDate", null);
        setField(term265411, term265411.getClass(), "userPlayDate", null);
        setIntField(term265411, term265411.getClass(), "musicId", 0);
        setIntField(term265411, term265411.getClass(), "level", 0);
        setIntField(term265411, term265411.getClass(), "playKind", 0);
        setIntField(term265411, term265411.getClass(), "eventId", 0);
        setField(term265411, term265411.getClass(), "eventName", null);
        setIntField(term265411, term265411.getClass(), "eventPoint", 0);
        setIntField(term265411, term265411.getClass(), "playedUserId1", 0);
        setIntField(term265411, term265411.getClass(), "playedUserId2", 0);
        setIntField(term265411, term265411.getClass(), "playedUserId3", 0);
        setField(term265411, term265411.getClass(), "playedUserName1", null);
        setField(term265411, term265411.getClass(), "playedUserName2", null);
        setField(term265411, term265411.getClass(), "playedUserName3", null);
        setIntField(term265411, term265411.getClass(), "playedMusicLevel1", 0);
        setIntField(term265411, term265411.getClass(), "playedMusicLevel2", 0);
        setIntField(term265411, term265411.getClass(), "playedMusicLevel3", 0);
        setIntField(term265411, term265411.getClass(), "cardId1", 0);
        setIntField(term265411, term265411.getClass(), "cardId2", 0);
        setIntField(term265411, term265411.getClass(), "cardId3", 0);
        setIntField(term265411, term265411.getClass(), "cardLevel1", 0);
        setIntField(term265411, term265411.getClass(), "cardLevel2", 0);
        setIntField(term265411, term265411.getClass(), "cardLevel3", 0);
        setIntField(term265411, term265411.getClass(), "cardAttack1", 0);
        setIntField(term265411, term265411.getClass(), "cardAttack2", 0);
        setIntField(term265411, term265411.getClass(), "cardAttack3", 0);
        setIntField(term265411, term265411.getClass(), "bossCharaId", 0);
        setIntField(term265411, term265411.getClass(), "bossLevel", 0);
        setIntField(term265411, term265411.getClass(), "bossAttribute", 0);
        setIntField(term265411, term265411.getClass(), "clearStatus", 0);
        setIntField(term265411, term265411.getClass(), "techScore", 0);
        setIntField(term265411, term265411.getClass(), "techScoreRank", 0);
        setIntField(term265411, term265411.getClass(), "battleScore", 0);
        setIntField(term265411, term265411.getClass(), "battleScoreRank", 0);
        setIntField(term265411, term265411.getClass(), "platinumScore", 0);
        setIntField(term265411, term265411.getClass(), "maxCombo", 0);
        setIntField(term265411, term265411.getClass(), "judgeMiss", 0);
        setIntField(term265411, term265411.getClass(), "judgeHit", 0);
        setIntField(term265411, term265411.getClass(), "judgeBreak", 0);
        setIntField(term265411, term265411.getClass(), "judgeCriticalBreak", 0);
        setIntField(term265411, term265411.getClass(), "rateTap", 0);
        setIntField(term265411, term265411.getClass(), "rateHold", 0);
        setIntField(term265411, term265411.getClass(), "rateFlick", 0);
        setIntField(term265411, term265411.getClass(), "rateSideTap", 0);
        setIntField(term265411, term265411.getClass(), "rateSideHold", 0);
        setIntField(term265411, term265411.getClass(), "bellCount", 0);
        setIntField(term265411, term265411.getClass(), "totalBellCount", 0);
        setIntField(term265411, term265411.getClass(), "damageCount", 0);
        setIntField(term265411, term265411.getClass(), "overDamage", 0);
        setBooleanField(term265411, term265411.getClass(), "isTechNewRecord", false);
        setBooleanField(term265411, term265411.getClass(), "isBattleNewRecord", false);
        setBooleanField(term265411, term265411.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term265411, term265411.getClass(), "isFullCombo", false);
        setBooleanField(term265411, term265411.getClass(), "isFullBell", false);
        setBooleanField(term265411, term265411.getClass(), "isAllBreak", false);
        setIntField(term265411, term265411.getClass(), "playerRating", 0);
        setIntField(term265411, term265411.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTechScore", argTypes, term265411, args);
    }

};


