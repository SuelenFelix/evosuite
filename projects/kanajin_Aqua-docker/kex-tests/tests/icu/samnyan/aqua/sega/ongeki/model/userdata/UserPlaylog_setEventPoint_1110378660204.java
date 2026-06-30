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

public class UserPlaylog_setEventPoint_1110378660204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267570;
     Object term267625;

    public UserPlaylog_setEventPoint_1110378660204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267570 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term267570, term267570.getClass(), "id", 0L);
        setField(term267570, term267570.getClass(), "user", null);
        setIntField(term267570, term267570.getClass(), "sortNumber", 0);
        setIntField(term267570, term267570.getClass(), "placeId", 0);
        setField(term267570, term267570.getClass(), "placeName", null);
        setField(term267570, term267570.getClass(), "playDate", null);
        setField(term267570, term267570.getClass(), "userPlayDate", null);
        setIntField(term267570, term267570.getClass(), "musicId", 0);
        setIntField(term267570, term267570.getClass(), "level", 0);
        setIntField(term267570, term267570.getClass(), "playKind", 0);
        setIntField(term267570, term267570.getClass(), "eventId", 0);
        setField(term267570, term267570.getClass(), "eventName", null);
        setIntField(term267570, term267570.getClass(), "eventPoint", 0);
        setIntField(term267570, term267570.getClass(), "playedUserId1", 0);
        setIntField(term267570, term267570.getClass(), "playedUserId2", 0);
        setIntField(term267570, term267570.getClass(), "playedUserId3", 0);
        setField(term267570, term267570.getClass(), "playedUserName1", null);
        setField(term267570, term267570.getClass(), "playedUserName2", null);
        setField(term267570, term267570.getClass(), "playedUserName3", null);
        setIntField(term267570, term267570.getClass(), "playedMusicLevel1", 0);
        setIntField(term267570, term267570.getClass(), "playedMusicLevel2", 0);
        setIntField(term267570, term267570.getClass(), "playedMusicLevel3", 0);
        setIntField(term267570, term267570.getClass(), "cardId1", 0);
        setIntField(term267570, term267570.getClass(), "cardId2", 0);
        setIntField(term267570, term267570.getClass(), "cardId3", 0);
        setIntField(term267570, term267570.getClass(), "cardLevel1", 0);
        setIntField(term267570, term267570.getClass(), "cardLevel2", 0);
        setIntField(term267570, term267570.getClass(), "cardLevel3", 0);
        setIntField(term267570, term267570.getClass(), "cardAttack1", 0);
        setIntField(term267570, term267570.getClass(), "cardAttack2", 0);
        setIntField(term267570, term267570.getClass(), "cardAttack3", 0);
        setIntField(term267570, term267570.getClass(), "bossCharaId", 0);
        setIntField(term267570, term267570.getClass(), "bossLevel", 0);
        setIntField(term267570, term267570.getClass(), "bossAttribute", 0);
        setIntField(term267570, term267570.getClass(), "clearStatus", 0);
        setIntField(term267570, term267570.getClass(), "techScore", 0);
        setIntField(term267570, term267570.getClass(), "techScoreRank", 0);
        setIntField(term267570, term267570.getClass(), "battleScore", 0);
        setIntField(term267570, term267570.getClass(), "battleScoreRank", 0);
        setIntField(term267570, term267570.getClass(), "platinumScore", 0);
        setIntField(term267570, term267570.getClass(), "maxCombo", 0);
        setIntField(term267570, term267570.getClass(), "judgeMiss", 0);
        setIntField(term267570, term267570.getClass(), "judgeHit", 0);
        setIntField(term267570, term267570.getClass(), "judgeBreak", 0);
        setIntField(term267570, term267570.getClass(), "judgeCriticalBreak", 0);
        setIntField(term267570, term267570.getClass(), "rateTap", 0);
        setIntField(term267570, term267570.getClass(), "rateHold", 0);
        setIntField(term267570, term267570.getClass(), "rateFlick", 0);
        setIntField(term267570, term267570.getClass(), "rateSideTap", 0);
        setIntField(term267570, term267570.getClass(), "rateSideHold", 0);
        setIntField(term267570, term267570.getClass(), "bellCount", 0);
        setIntField(term267570, term267570.getClass(), "totalBellCount", 0);
        setIntField(term267570, term267570.getClass(), "damageCount", 0);
        setIntField(term267570, term267570.getClass(), "overDamage", 0);
        setBooleanField(term267570, term267570.getClass(), "isTechNewRecord", false);
        setBooleanField(term267570, term267570.getClass(), "isBattleNewRecord", false);
        setBooleanField(term267570, term267570.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term267570, term267570.getClass(), "isFullCombo", false);
        setBooleanField(term267570, term267570.getClass(), "isFullBell", false);
        setBooleanField(term267570, term267570.getClass(), "isAllBreak", false);
        setIntField(term267570, term267570.getClass(), "playerRating", 0);
        setIntField(term267570, term267570.getClass(), "battlePoint", 0);
        term267625 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term267625;
        callMethod(klass, "setEventPoint", argTypes, term267570, args);
    }

};


