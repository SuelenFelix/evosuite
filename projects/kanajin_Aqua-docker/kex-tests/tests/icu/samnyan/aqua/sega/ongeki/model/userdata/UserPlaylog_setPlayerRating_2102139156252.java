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

public class UserPlaylog_setPlayerRating_2102139156252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270300;
     Object term270355;

    public UserPlaylog_setPlayerRating_2102139156252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270300 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term270300, term270300.getClass(), "id", 0L);
        setField(term270300, term270300.getClass(), "user", null);
        setIntField(term270300, term270300.getClass(), "sortNumber", 0);
        setIntField(term270300, term270300.getClass(), "placeId", 0);
        setField(term270300, term270300.getClass(), "placeName", null);
        setField(term270300, term270300.getClass(), "playDate", null);
        setField(term270300, term270300.getClass(), "userPlayDate", null);
        setIntField(term270300, term270300.getClass(), "musicId", 0);
        setIntField(term270300, term270300.getClass(), "level", 0);
        setIntField(term270300, term270300.getClass(), "playKind", 0);
        setIntField(term270300, term270300.getClass(), "eventId", 0);
        setField(term270300, term270300.getClass(), "eventName", null);
        setIntField(term270300, term270300.getClass(), "eventPoint", 0);
        setIntField(term270300, term270300.getClass(), "playedUserId1", 0);
        setIntField(term270300, term270300.getClass(), "playedUserId2", 0);
        setIntField(term270300, term270300.getClass(), "playedUserId3", 0);
        setField(term270300, term270300.getClass(), "playedUserName1", null);
        setField(term270300, term270300.getClass(), "playedUserName2", null);
        setField(term270300, term270300.getClass(), "playedUserName3", null);
        setIntField(term270300, term270300.getClass(), "playedMusicLevel1", 0);
        setIntField(term270300, term270300.getClass(), "playedMusicLevel2", 0);
        setIntField(term270300, term270300.getClass(), "playedMusicLevel3", 0);
        setIntField(term270300, term270300.getClass(), "cardId1", 0);
        setIntField(term270300, term270300.getClass(), "cardId2", 0);
        setIntField(term270300, term270300.getClass(), "cardId3", 0);
        setIntField(term270300, term270300.getClass(), "cardLevel1", 0);
        setIntField(term270300, term270300.getClass(), "cardLevel2", 0);
        setIntField(term270300, term270300.getClass(), "cardLevel3", 0);
        setIntField(term270300, term270300.getClass(), "cardAttack1", 0);
        setIntField(term270300, term270300.getClass(), "cardAttack2", 0);
        setIntField(term270300, term270300.getClass(), "cardAttack3", 0);
        setIntField(term270300, term270300.getClass(), "bossCharaId", 0);
        setIntField(term270300, term270300.getClass(), "bossLevel", 0);
        setIntField(term270300, term270300.getClass(), "bossAttribute", 0);
        setIntField(term270300, term270300.getClass(), "clearStatus", 0);
        setIntField(term270300, term270300.getClass(), "techScore", 0);
        setIntField(term270300, term270300.getClass(), "techScoreRank", 0);
        setIntField(term270300, term270300.getClass(), "battleScore", 0);
        setIntField(term270300, term270300.getClass(), "battleScoreRank", 0);
        setIntField(term270300, term270300.getClass(), "platinumScore", 0);
        setIntField(term270300, term270300.getClass(), "maxCombo", 0);
        setIntField(term270300, term270300.getClass(), "judgeMiss", 0);
        setIntField(term270300, term270300.getClass(), "judgeHit", 0);
        setIntField(term270300, term270300.getClass(), "judgeBreak", 0);
        setIntField(term270300, term270300.getClass(), "judgeCriticalBreak", 0);
        setIntField(term270300, term270300.getClass(), "rateTap", 0);
        setIntField(term270300, term270300.getClass(), "rateHold", 0);
        setIntField(term270300, term270300.getClass(), "rateFlick", 0);
        setIntField(term270300, term270300.getClass(), "rateSideTap", 0);
        setIntField(term270300, term270300.getClass(), "rateSideHold", 0);
        setIntField(term270300, term270300.getClass(), "bellCount", 0);
        setIntField(term270300, term270300.getClass(), "totalBellCount", 0);
        setIntField(term270300, term270300.getClass(), "damageCount", 0);
        setIntField(term270300, term270300.getClass(), "overDamage", 0);
        setBooleanField(term270300, term270300.getClass(), "isTechNewRecord", false);
        setBooleanField(term270300, term270300.getClass(), "isBattleNewRecord", false);
        setBooleanField(term270300, term270300.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term270300, term270300.getClass(), "isFullCombo", false);
        setBooleanField(term270300, term270300.getClass(), "isFullBell", false);
        setBooleanField(term270300, term270300.getClass(), "isAllBreak", false);
        setIntField(term270300, term270300.getClass(), "playerRating", 0);
        setIntField(term270300, term270300.getClass(), "battlePoint", 0);
        term270355 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term270355;
        callMethod(klass, "setPlayerRating", argTypes, term270300, args);
    }

};


