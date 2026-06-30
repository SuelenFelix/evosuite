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

public class UserPlaylog_setPlayedUserName1_950081171208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267798;

    public UserPlaylog_setPlayedUserName1_950081171208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267798 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term267798, term267798.getClass(), "id", 0L);
        setField(term267798, term267798.getClass(), "user", null);
        setIntField(term267798, term267798.getClass(), "sortNumber", 0);
        setIntField(term267798, term267798.getClass(), "placeId", 0);
        setField(term267798, term267798.getClass(), "placeName", null);
        setField(term267798, term267798.getClass(), "playDate", null);
        setField(term267798, term267798.getClass(), "userPlayDate", null);
        setIntField(term267798, term267798.getClass(), "musicId", 0);
        setIntField(term267798, term267798.getClass(), "level", 0);
        setIntField(term267798, term267798.getClass(), "playKind", 0);
        setIntField(term267798, term267798.getClass(), "eventId", 0);
        setField(term267798, term267798.getClass(), "eventName", null);
        setIntField(term267798, term267798.getClass(), "eventPoint", 0);
        setIntField(term267798, term267798.getClass(), "playedUserId1", 0);
        setIntField(term267798, term267798.getClass(), "playedUserId2", 0);
        setIntField(term267798, term267798.getClass(), "playedUserId3", 0);
        setField(term267798, term267798.getClass(), "playedUserName1", null);
        setField(term267798, term267798.getClass(), "playedUserName2", null);
        setField(term267798, term267798.getClass(), "playedUserName3", null);
        setIntField(term267798, term267798.getClass(), "playedMusicLevel1", 0);
        setIntField(term267798, term267798.getClass(), "playedMusicLevel2", 0);
        setIntField(term267798, term267798.getClass(), "playedMusicLevel3", 0);
        setIntField(term267798, term267798.getClass(), "cardId1", 0);
        setIntField(term267798, term267798.getClass(), "cardId2", 0);
        setIntField(term267798, term267798.getClass(), "cardId3", 0);
        setIntField(term267798, term267798.getClass(), "cardLevel1", 0);
        setIntField(term267798, term267798.getClass(), "cardLevel2", 0);
        setIntField(term267798, term267798.getClass(), "cardLevel3", 0);
        setIntField(term267798, term267798.getClass(), "cardAttack1", 0);
        setIntField(term267798, term267798.getClass(), "cardAttack2", 0);
        setIntField(term267798, term267798.getClass(), "cardAttack3", 0);
        setIntField(term267798, term267798.getClass(), "bossCharaId", 0);
        setIntField(term267798, term267798.getClass(), "bossLevel", 0);
        setIntField(term267798, term267798.getClass(), "bossAttribute", 0);
        setIntField(term267798, term267798.getClass(), "clearStatus", 0);
        setIntField(term267798, term267798.getClass(), "techScore", 0);
        setIntField(term267798, term267798.getClass(), "techScoreRank", 0);
        setIntField(term267798, term267798.getClass(), "battleScore", 0);
        setIntField(term267798, term267798.getClass(), "battleScoreRank", 0);
        setIntField(term267798, term267798.getClass(), "platinumScore", 0);
        setIntField(term267798, term267798.getClass(), "maxCombo", 0);
        setIntField(term267798, term267798.getClass(), "judgeMiss", 0);
        setIntField(term267798, term267798.getClass(), "judgeHit", 0);
        setIntField(term267798, term267798.getClass(), "judgeBreak", 0);
        setIntField(term267798, term267798.getClass(), "judgeCriticalBreak", 0);
        setIntField(term267798, term267798.getClass(), "rateTap", 0);
        setIntField(term267798, term267798.getClass(), "rateHold", 0);
        setIntField(term267798, term267798.getClass(), "rateFlick", 0);
        setIntField(term267798, term267798.getClass(), "rateSideTap", 0);
        setIntField(term267798, term267798.getClass(), "rateSideHold", 0);
        setIntField(term267798, term267798.getClass(), "bellCount", 0);
        setIntField(term267798, term267798.getClass(), "totalBellCount", 0);
        setIntField(term267798, term267798.getClass(), "damageCount", 0);
        setIntField(term267798, term267798.getClass(), "overDamage", 0);
        setBooleanField(term267798, term267798.getClass(), "isTechNewRecord", false);
        setBooleanField(term267798, term267798.getClass(), "isBattleNewRecord", false);
        setBooleanField(term267798, term267798.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term267798, term267798.getClass(), "isFullCombo", false);
        setBooleanField(term267798, term267798.getClass(), "isFullBell", false);
        setBooleanField(term267798, term267798.getClass(), "isAllBreak", false);
        setIntField(term267798, term267798.getClass(), "playerRating", 0);
        setIntField(term267798, term267798.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName1", argTypes, term267798, args);
    }

};


