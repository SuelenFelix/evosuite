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

public class UserPlaylog_setCardId2_661034287215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268191;
     Object term268246;

    public UserPlaylog_setCardId2_661034287215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268191 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term268191, term268191.getClass(), "id", 0L);
        setField(term268191, term268191.getClass(), "user", null);
        setIntField(term268191, term268191.getClass(), "sortNumber", 0);
        setIntField(term268191, term268191.getClass(), "placeId", 0);
        setField(term268191, term268191.getClass(), "placeName", null);
        setField(term268191, term268191.getClass(), "playDate", null);
        setField(term268191, term268191.getClass(), "userPlayDate", null);
        setIntField(term268191, term268191.getClass(), "musicId", 0);
        setIntField(term268191, term268191.getClass(), "level", 0);
        setIntField(term268191, term268191.getClass(), "playKind", 0);
        setIntField(term268191, term268191.getClass(), "eventId", 0);
        setField(term268191, term268191.getClass(), "eventName", null);
        setIntField(term268191, term268191.getClass(), "eventPoint", 0);
        setIntField(term268191, term268191.getClass(), "playedUserId1", 0);
        setIntField(term268191, term268191.getClass(), "playedUserId2", 0);
        setIntField(term268191, term268191.getClass(), "playedUserId3", 0);
        setField(term268191, term268191.getClass(), "playedUserName1", null);
        setField(term268191, term268191.getClass(), "playedUserName2", null);
        setField(term268191, term268191.getClass(), "playedUserName3", null);
        setIntField(term268191, term268191.getClass(), "playedMusicLevel1", 0);
        setIntField(term268191, term268191.getClass(), "playedMusicLevel2", 0);
        setIntField(term268191, term268191.getClass(), "playedMusicLevel3", 0);
        setIntField(term268191, term268191.getClass(), "cardId1", 0);
        setIntField(term268191, term268191.getClass(), "cardId2", 0);
        setIntField(term268191, term268191.getClass(), "cardId3", 0);
        setIntField(term268191, term268191.getClass(), "cardLevel1", 0);
        setIntField(term268191, term268191.getClass(), "cardLevel2", 0);
        setIntField(term268191, term268191.getClass(), "cardLevel3", 0);
        setIntField(term268191, term268191.getClass(), "cardAttack1", 0);
        setIntField(term268191, term268191.getClass(), "cardAttack2", 0);
        setIntField(term268191, term268191.getClass(), "cardAttack3", 0);
        setIntField(term268191, term268191.getClass(), "bossCharaId", 0);
        setIntField(term268191, term268191.getClass(), "bossLevel", 0);
        setIntField(term268191, term268191.getClass(), "bossAttribute", 0);
        setIntField(term268191, term268191.getClass(), "clearStatus", 0);
        setIntField(term268191, term268191.getClass(), "techScore", 0);
        setIntField(term268191, term268191.getClass(), "techScoreRank", 0);
        setIntField(term268191, term268191.getClass(), "battleScore", 0);
        setIntField(term268191, term268191.getClass(), "battleScoreRank", 0);
        setIntField(term268191, term268191.getClass(), "platinumScore", 0);
        setIntField(term268191, term268191.getClass(), "maxCombo", 0);
        setIntField(term268191, term268191.getClass(), "judgeMiss", 0);
        setIntField(term268191, term268191.getClass(), "judgeHit", 0);
        setIntField(term268191, term268191.getClass(), "judgeBreak", 0);
        setIntField(term268191, term268191.getClass(), "judgeCriticalBreak", 0);
        setIntField(term268191, term268191.getClass(), "rateTap", 0);
        setIntField(term268191, term268191.getClass(), "rateHold", 0);
        setIntField(term268191, term268191.getClass(), "rateFlick", 0);
        setIntField(term268191, term268191.getClass(), "rateSideTap", 0);
        setIntField(term268191, term268191.getClass(), "rateSideHold", 0);
        setIntField(term268191, term268191.getClass(), "bellCount", 0);
        setIntField(term268191, term268191.getClass(), "totalBellCount", 0);
        setIntField(term268191, term268191.getClass(), "damageCount", 0);
        setIntField(term268191, term268191.getClass(), "overDamage", 0);
        setBooleanField(term268191, term268191.getClass(), "isTechNewRecord", false);
        setBooleanField(term268191, term268191.getClass(), "isBattleNewRecord", false);
        setBooleanField(term268191, term268191.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term268191, term268191.getClass(), "isFullCombo", false);
        setBooleanField(term268191, term268191.getClass(), "isFullBell", false);
        setBooleanField(term268191, term268191.getClass(), "isAllBreak", false);
        setIntField(term268191, term268191.getClass(), "playerRating", 0);
        setIntField(term268191, term268191.getClass(), "battlePoint", 0);
        term268246 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268246;
        callMethod(klass, "setCardId2", argTypes, term268191, args);
    }

};


