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

public class UserPlaylog_setCardLevel3_1065154643219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268419;
     Object term268474;

    public UserPlaylog_setCardLevel3_1065154643219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268419 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term268419, term268419.getClass(), "id", 0L);
        setField(term268419, term268419.getClass(), "user", null);
        setIntField(term268419, term268419.getClass(), "sortNumber", 0);
        setIntField(term268419, term268419.getClass(), "placeId", 0);
        setField(term268419, term268419.getClass(), "placeName", null);
        setField(term268419, term268419.getClass(), "playDate", null);
        setField(term268419, term268419.getClass(), "userPlayDate", null);
        setIntField(term268419, term268419.getClass(), "musicId", 0);
        setIntField(term268419, term268419.getClass(), "level", 0);
        setIntField(term268419, term268419.getClass(), "playKind", 0);
        setIntField(term268419, term268419.getClass(), "eventId", 0);
        setField(term268419, term268419.getClass(), "eventName", null);
        setIntField(term268419, term268419.getClass(), "eventPoint", 0);
        setIntField(term268419, term268419.getClass(), "playedUserId1", 0);
        setIntField(term268419, term268419.getClass(), "playedUserId2", 0);
        setIntField(term268419, term268419.getClass(), "playedUserId3", 0);
        setField(term268419, term268419.getClass(), "playedUserName1", null);
        setField(term268419, term268419.getClass(), "playedUserName2", null);
        setField(term268419, term268419.getClass(), "playedUserName3", null);
        setIntField(term268419, term268419.getClass(), "playedMusicLevel1", 0);
        setIntField(term268419, term268419.getClass(), "playedMusicLevel2", 0);
        setIntField(term268419, term268419.getClass(), "playedMusicLevel3", 0);
        setIntField(term268419, term268419.getClass(), "cardId1", 0);
        setIntField(term268419, term268419.getClass(), "cardId2", 0);
        setIntField(term268419, term268419.getClass(), "cardId3", 0);
        setIntField(term268419, term268419.getClass(), "cardLevel1", 0);
        setIntField(term268419, term268419.getClass(), "cardLevel2", 0);
        setIntField(term268419, term268419.getClass(), "cardLevel3", 0);
        setIntField(term268419, term268419.getClass(), "cardAttack1", 0);
        setIntField(term268419, term268419.getClass(), "cardAttack2", 0);
        setIntField(term268419, term268419.getClass(), "cardAttack3", 0);
        setIntField(term268419, term268419.getClass(), "bossCharaId", 0);
        setIntField(term268419, term268419.getClass(), "bossLevel", 0);
        setIntField(term268419, term268419.getClass(), "bossAttribute", 0);
        setIntField(term268419, term268419.getClass(), "clearStatus", 0);
        setIntField(term268419, term268419.getClass(), "techScore", 0);
        setIntField(term268419, term268419.getClass(), "techScoreRank", 0);
        setIntField(term268419, term268419.getClass(), "battleScore", 0);
        setIntField(term268419, term268419.getClass(), "battleScoreRank", 0);
        setIntField(term268419, term268419.getClass(), "platinumScore", 0);
        setIntField(term268419, term268419.getClass(), "maxCombo", 0);
        setIntField(term268419, term268419.getClass(), "judgeMiss", 0);
        setIntField(term268419, term268419.getClass(), "judgeHit", 0);
        setIntField(term268419, term268419.getClass(), "judgeBreak", 0);
        setIntField(term268419, term268419.getClass(), "judgeCriticalBreak", 0);
        setIntField(term268419, term268419.getClass(), "rateTap", 0);
        setIntField(term268419, term268419.getClass(), "rateHold", 0);
        setIntField(term268419, term268419.getClass(), "rateFlick", 0);
        setIntField(term268419, term268419.getClass(), "rateSideTap", 0);
        setIntField(term268419, term268419.getClass(), "rateSideHold", 0);
        setIntField(term268419, term268419.getClass(), "bellCount", 0);
        setIntField(term268419, term268419.getClass(), "totalBellCount", 0);
        setIntField(term268419, term268419.getClass(), "damageCount", 0);
        setIntField(term268419, term268419.getClass(), "overDamage", 0);
        setBooleanField(term268419, term268419.getClass(), "isTechNewRecord", false);
        setBooleanField(term268419, term268419.getClass(), "isBattleNewRecord", false);
        setBooleanField(term268419, term268419.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term268419, term268419.getClass(), "isFullCombo", false);
        setBooleanField(term268419, term268419.getClass(), "isFullBell", false);
        setBooleanField(term268419, term268419.getClass(), "isAllBreak", false);
        setIntField(term268419, term268419.getClass(), "playerRating", 0);
        setIntField(term268419, term268419.getClass(), "battlePoint", 0);
        term268474 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268474;
        callMethod(klass, "setCardLevel3", argTypes, term268419, args);
    }

};


