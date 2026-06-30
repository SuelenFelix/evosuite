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
import java.lang.Integer;

public class UserPlaylog_setPlaceId_1396718412195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267065;
     Object term267120;

    public UserPlaylog_setPlaceId_1396718412195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267065 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term267065, term267065.getClass(), "id", 0L);
        setField(term267065, term267065.getClass(), "user", null);
        setIntField(term267065, term267065.getClass(), "sortNumber", 0);
        setIntField(term267065, term267065.getClass(), "placeId", 0);
        setField(term267065, term267065.getClass(), "placeName", null);
        setField(term267065, term267065.getClass(), "playDate", null);
        setField(term267065, term267065.getClass(), "userPlayDate", null);
        setIntField(term267065, term267065.getClass(), "musicId", 0);
        setIntField(term267065, term267065.getClass(), "level", 0);
        setIntField(term267065, term267065.getClass(), "playKind", 0);
        setIntField(term267065, term267065.getClass(), "eventId", 0);
        setField(term267065, term267065.getClass(), "eventName", null);
        setIntField(term267065, term267065.getClass(), "eventPoint", 0);
        setIntField(term267065, term267065.getClass(), "playedUserId1", 0);
        setIntField(term267065, term267065.getClass(), "playedUserId2", 0);
        setIntField(term267065, term267065.getClass(), "playedUserId3", 0);
        setField(term267065, term267065.getClass(), "playedUserName1", null);
        setField(term267065, term267065.getClass(), "playedUserName2", null);
        setField(term267065, term267065.getClass(), "playedUserName3", null);
        setIntField(term267065, term267065.getClass(), "playedMusicLevel1", 0);
        setIntField(term267065, term267065.getClass(), "playedMusicLevel2", 0);
        setIntField(term267065, term267065.getClass(), "playedMusicLevel3", 0);
        setIntField(term267065, term267065.getClass(), "cardId1", 0);
        setIntField(term267065, term267065.getClass(), "cardId2", 0);
        setIntField(term267065, term267065.getClass(), "cardId3", 0);
        setIntField(term267065, term267065.getClass(), "cardLevel1", 0);
        setIntField(term267065, term267065.getClass(), "cardLevel2", 0);
        setIntField(term267065, term267065.getClass(), "cardLevel3", 0);
        setIntField(term267065, term267065.getClass(), "cardAttack1", 0);
        setIntField(term267065, term267065.getClass(), "cardAttack2", 0);
        setIntField(term267065, term267065.getClass(), "cardAttack3", 0);
        setIntField(term267065, term267065.getClass(), "bossCharaId", 0);
        setIntField(term267065, term267065.getClass(), "bossLevel", 0);
        setIntField(term267065, term267065.getClass(), "bossAttribute", 0);
        setIntField(term267065, term267065.getClass(), "clearStatus", 0);
        setIntField(term267065, term267065.getClass(), "techScore", 0);
        setIntField(term267065, term267065.getClass(), "techScoreRank", 0);
        setIntField(term267065, term267065.getClass(), "battleScore", 0);
        setIntField(term267065, term267065.getClass(), "battleScoreRank", 0);
        setIntField(term267065, term267065.getClass(), "platinumScore", 0);
        setIntField(term267065, term267065.getClass(), "maxCombo", 0);
        setIntField(term267065, term267065.getClass(), "judgeMiss", 0);
        setIntField(term267065, term267065.getClass(), "judgeHit", 0);
        setIntField(term267065, term267065.getClass(), "judgeBreak", 0);
        setIntField(term267065, term267065.getClass(), "judgeCriticalBreak", 0);
        setIntField(term267065, term267065.getClass(), "rateTap", 0);
        setIntField(term267065, term267065.getClass(), "rateHold", 0);
        setIntField(term267065, term267065.getClass(), "rateFlick", 0);
        setIntField(term267065, term267065.getClass(), "rateSideTap", 0);
        setIntField(term267065, term267065.getClass(), "rateSideHold", 0);
        setIntField(term267065, term267065.getClass(), "bellCount", 0);
        setIntField(term267065, term267065.getClass(), "totalBellCount", 0);
        setIntField(term267065, term267065.getClass(), "damageCount", 0);
        setIntField(term267065, term267065.getClass(), "overDamage", 0);
        setBooleanField(term267065, term267065.getClass(), "isTechNewRecord", false);
        setBooleanField(term267065, term267065.getClass(), "isBattleNewRecord", false);
        setBooleanField(term267065, term267065.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term267065, term267065.getClass(), "isFullCombo", false);
        setBooleanField(term267065, term267065.getClass(), "isFullBell", false);
        setBooleanField(term267065, term267065.getClass(), "isAllBreak", false);
        setIntField(term267065, term267065.getClass(), "playerRating", 0);
        setIntField(term267065, term267065.getClass(), "battlePoint", 0);
        term267120 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term267120;
        callMethod(klass, "setPlaceId", argTypes, term267065, args);
    }

};


