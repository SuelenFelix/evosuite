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

public class UserPlaylog_getPlayDate_1112266739135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263761;

    public UserPlaylog_getPlayDate_1112266739135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263761 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term263761, term263761.getClass(), "id", 0L);
        setField(term263761, term263761.getClass(), "user", null);
        setIntField(term263761, term263761.getClass(), "sortNumber", 0);
        setIntField(term263761, term263761.getClass(), "placeId", 0);
        setField(term263761, term263761.getClass(), "placeName", null);
        setField(term263761, term263761.getClass(), "playDate", null);
        setField(term263761, term263761.getClass(), "userPlayDate", null);
        setIntField(term263761, term263761.getClass(), "musicId", 0);
        setIntField(term263761, term263761.getClass(), "level", 0);
        setIntField(term263761, term263761.getClass(), "playKind", 0);
        setIntField(term263761, term263761.getClass(), "eventId", 0);
        setField(term263761, term263761.getClass(), "eventName", null);
        setIntField(term263761, term263761.getClass(), "eventPoint", 0);
        setIntField(term263761, term263761.getClass(), "playedUserId1", 0);
        setIntField(term263761, term263761.getClass(), "playedUserId2", 0);
        setIntField(term263761, term263761.getClass(), "playedUserId3", 0);
        setField(term263761, term263761.getClass(), "playedUserName1", null);
        setField(term263761, term263761.getClass(), "playedUserName2", null);
        setField(term263761, term263761.getClass(), "playedUserName3", null);
        setIntField(term263761, term263761.getClass(), "playedMusicLevel1", 0);
        setIntField(term263761, term263761.getClass(), "playedMusicLevel2", 0);
        setIntField(term263761, term263761.getClass(), "playedMusicLevel3", 0);
        setIntField(term263761, term263761.getClass(), "cardId1", 0);
        setIntField(term263761, term263761.getClass(), "cardId2", 0);
        setIntField(term263761, term263761.getClass(), "cardId3", 0);
        setIntField(term263761, term263761.getClass(), "cardLevel1", 0);
        setIntField(term263761, term263761.getClass(), "cardLevel2", 0);
        setIntField(term263761, term263761.getClass(), "cardLevel3", 0);
        setIntField(term263761, term263761.getClass(), "cardAttack1", 0);
        setIntField(term263761, term263761.getClass(), "cardAttack2", 0);
        setIntField(term263761, term263761.getClass(), "cardAttack3", 0);
        setIntField(term263761, term263761.getClass(), "bossCharaId", 0);
        setIntField(term263761, term263761.getClass(), "bossLevel", 0);
        setIntField(term263761, term263761.getClass(), "bossAttribute", 0);
        setIntField(term263761, term263761.getClass(), "clearStatus", 0);
        setIntField(term263761, term263761.getClass(), "techScore", 0);
        setIntField(term263761, term263761.getClass(), "techScoreRank", 0);
        setIntField(term263761, term263761.getClass(), "battleScore", 0);
        setIntField(term263761, term263761.getClass(), "battleScoreRank", 0);
        setIntField(term263761, term263761.getClass(), "platinumScore", 0);
        setIntField(term263761, term263761.getClass(), "maxCombo", 0);
        setIntField(term263761, term263761.getClass(), "judgeMiss", 0);
        setIntField(term263761, term263761.getClass(), "judgeHit", 0);
        setIntField(term263761, term263761.getClass(), "judgeBreak", 0);
        setIntField(term263761, term263761.getClass(), "judgeCriticalBreak", 0);
        setIntField(term263761, term263761.getClass(), "rateTap", 0);
        setIntField(term263761, term263761.getClass(), "rateHold", 0);
        setIntField(term263761, term263761.getClass(), "rateFlick", 0);
        setIntField(term263761, term263761.getClass(), "rateSideTap", 0);
        setIntField(term263761, term263761.getClass(), "rateSideHold", 0);
        setIntField(term263761, term263761.getClass(), "bellCount", 0);
        setIntField(term263761, term263761.getClass(), "totalBellCount", 0);
        setIntField(term263761, term263761.getClass(), "damageCount", 0);
        setIntField(term263761, term263761.getClass(), "overDamage", 0);
        setBooleanField(term263761, term263761.getClass(), "isTechNewRecord", false);
        setBooleanField(term263761, term263761.getClass(), "isBattleNewRecord", false);
        setBooleanField(term263761, term263761.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term263761, term263761.getClass(), "isFullCombo", false);
        setBooleanField(term263761, term263761.getClass(), "isFullBell", false);
        setBooleanField(term263761, term263761.getClass(), "isAllBreak", false);
        setIntField(term263761, term263761.getClass(), "playerRating", 0);
        setIntField(term263761, term263761.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayDate", argTypes, term263761, args);
    }

};


