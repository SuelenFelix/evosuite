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

public class UserPlaylog_setOverDamage_446370895245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269901;
     Object term269956;

    public UserPlaylog_setOverDamage_446370895245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269901 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term269901, term269901.getClass(), "id", 0L);
        setField(term269901, term269901.getClass(), "user", null);
        setIntField(term269901, term269901.getClass(), "sortNumber", 0);
        setIntField(term269901, term269901.getClass(), "placeId", 0);
        setField(term269901, term269901.getClass(), "placeName", null);
        setField(term269901, term269901.getClass(), "playDate", null);
        setField(term269901, term269901.getClass(), "userPlayDate", null);
        setIntField(term269901, term269901.getClass(), "musicId", 0);
        setIntField(term269901, term269901.getClass(), "level", 0);
        setIntField(term269901, term269901.getClass(), "playKind", 0);
        setIntField(term269901, term269901.getClass(), "eventId", 0);
        setField(term269901, term269901.getClass(), "eventName", null);
        setIntField(term269901, term269901.getClass(), "eventPoint", 0);
        setIntField(term269901, term269901.getClass(), "playedUserId1", 0);
        setIntField(term269901, term269901.getClass(), "playedUserId2", 0);
        setIntField(term269901, term269901.getClass(), "playedUserId3", 0);
        setField(term269901, term269901.getClass(), "playedUserName1", null);
        setField(term269901, term269901.getClass(), "playedUserName2", null);
        setField(term269901, term269901.getClass(), "playedUserName3", null);
        setIntField(term269901, term269901.getClass(), "playedMusicLevel1", 0);
        setIntField(term269901, term269901.getClass(), "playedMusicLevel2", 0);
        setIntField(term269901, term269901.getClass(), "playedMusicLevel3", 0);
        setIntField(term269901, term269901.getClass(), "cardId1", 0);
        setIntField(term269901, term269901.getClass(), "cardId2", 0);
        setIntField(term269901, term269901.getClass(), "cardId3", 0);
        setIntField(term269901, term269901.getClass(), "cardLevel1", 0);
        setIntField(term269901, term269901.getClass(), "cardLevel2", 0);
        setIntField(term269901, term269901.getClass(), "cardLevel3", 0);
        setIntField(term269901, term269901.getClass(), "cardAttack1", 0);
        setIntField(term269901, term269901.getClass(), "cardAttack2", 0);
        setIntField(term269901, term269901.getClass(), "cardAttack3", 0);
        setIntField(term269901, term269901.getClass(), "bossCharaId", 0);
        setIntField(term269901, term269901.getClass(), "bossLevel", 0);
        setIntField(term269901, term269901.getClass(), "bossAttribute", 0);
        setIntField(term269901, term269901.getClass(), "clearStatus", 0);
        setIntField(term269901, term269901.getClass(), "techScore", 0);
        setIntField(term269901, term269901.getClass(), "techScoreRank", 0);
        setIntField(term269901, term269901.getClass(), "battleScore", 0);
        setIntField(term269901, term269901.getClass(), "battleScoreRank", 0);
        setIntField(term269901, term269901.getClass(), "platinumScore", 0);
        setIntField(term269901, term269901.getClass(), "maxCombo", 0);
        setIntField(term269901, term269901.getClass(), "judgeMiss", 0);
        setIntField(term269901, term269901.getClass(), "judgeHit", 0);
        setIntField(term269901, term269901.getClass(), "judgeBreak", 0);
        setIntField(term269901, term269901.getClass(), "judgeCriticalBreak", 0);
        setIntField(term269901, term269901.getClass(), "rateTap", 0);
        setIntField(term269901, term269901.getClass(), "rateHold", 0);
        setIntField(term269901, term269901.getClass(), "rateFlick", 0);
        setIntField(term269901, term269901.getClass(), "rateSideTap", 0);
        setIntField(term269901, term269901.getClass(), "rateSideHold", 0);
        setIntField(term269901, term269901.getClass(), "bellCount", 0);
        setIntField(term269901, term269901.getClass(), "totalBellCount", 0);
        setIntField(term269901, term269901.getClass(), "damageCount", 0);
        setIntField(term269901, term269901.getClass(), "overDamage", 0);
        setBooleanField(term269901, term269901.getClass(), "isTechNewRecord", false);
        setBooleanField(term269901, term269901.getClass(), "isBattleNewRecord", false);
        setBooleanField(term269901, term269901.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term269901, term269901.getClass(), "isFullCombo", false);
        setBooleanField(term269901, term269901.getClass(), "isFullBell", false);
        setBooleanField(term269901, term269901.getClass(), "isAllBreak", false);
        setIntField(term269901, term269901.getClass(), "playerRating", 0);
        setIntField(term269901, term269901.getClass(), "battlePoint", 0);
        term269956 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term269956;
        callMethod(klass, "setOverDamage", argTypes, term269901, args);
    }

};


