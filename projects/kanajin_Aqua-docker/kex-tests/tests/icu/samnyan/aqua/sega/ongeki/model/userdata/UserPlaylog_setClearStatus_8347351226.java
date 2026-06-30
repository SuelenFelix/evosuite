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

public class UserPlaylog_setClearStatus_8347351226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268818;
     Object term268873;

    public UserPlaylog_setClearStatus_8347351226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268818 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term268818, term268818.getClass(), "id", 0L);
        setField(term268818, term268818.getClass(), "user", null);
        setIntField(term268818, term268818.getClass(), "sortNumber", 0);
        setIntField(term268818, term268818.getClass(), "placeId", 0);
        setField(term268818, term268818.getClass(), "placeName", null);
        setField(term268818, term268818.getClass(), "playDate", null);
        setField(term268818, term268818.getClass(), "userPlayDate", null);
        setIntField(term268818, term268818.getClass(), "musicId", 0);
        setIntField(term268818, term268818.getClass(), "level", 0);
        setIntField(term268818, term268818.getClass(), "playKind", 0);
        setIntField(term268818, term268818.getClass(), "eventId", 0);
        setField(term268818, term268818.getClass(), "eventName", null);
        setIntField(term268818, term268818.getClass(), "eventPoint", 0);
        setIntField(term268818, term268818.getClass(), "playedUserId1", 0);
        setIntField(term268818, term268818.getClass(), "playedUserId2", 0);
        setIntField(term268818, term268818.getClass(), "playedUserId3", 0);
        setField(term268818, term268818.getClass(), "playedUserName1", null);
        setField(term268818, term268818.getClass(), "playedUserName2", null);
        setField(term268818, term268818.getClass(), "playedUserName3", null);
        setIntField(term268818, term268818.getClass(), "playedMusicLevel1", 0);
        setIntField(term268818, term268818.getClass(), "playedMusicLevel2", 0);
        setIntField(term268818, term268818.getClass(), "playedMusicLevel3", 0);
        setIntField(term268818, term268818.getClass(), "cardId1", 0);
        setIntField(term268818, term268818.getClass(), "cardId2", 0);
        setIntField(term268818, term268818.getClass(), "cardId3", 0);
        setIntField(term268818, term268818.getClass(), "cardLevel1", 0);
        setIntField(term268818, term268818.getClass(), "cardLevel2", 0);
        setIntField(term268818, term268818.getClass(), "cardLevel3", 0);
        setIntField(term268818, term268818.getClass(), "cardAttack1", 0);
        setIntField(term268818, term268818.getClass(), "cardAttack2", 0);
        setIntField(term268818, term268818.getClass(), "cardAttack3", 0);
        setIntField(term268818, term268818.getClass(), "bossCharaId", 0);
        setIntField(term268818, term268818.getClass(), "bossLevel", 0);
        setIntField(term268818, term268818.getClass(), "bossAttribute", 0);
        setIntField(term268818, term268818.getClass(), "clearStatus", 0);
        setIntField(term268818, term268818.getClass(), "techScore", 0);
        setIntField(term268818, term268818.getClass(), "techScoreRank", 0);
        setIntField(term268818, term268818.getClass(), "battleScore", 0);
        setIntField(term268818, term268818.getClass(), "battleScoreRank", 0);
        setIntField(term268818, term268818.getClass(), "platinumScore", 0);
        setIntField(term268818, term268818.getClass(), "maxCombo", 0);
        setIntField(term268818, term268818.getClass(), "judgeMiss", 0);
        setIntField(term268818, term268818.getClass(), "judgeHit", 0);
        setIntField(term268818, term268818.getClass(), "judgeBreak", 0);
        setIntField(term268818, term268818.getClass(), "judgeCriticalBreak", 0);
        setIntField(term268818, term268818.getClass(), "rateTap", 0);
        setIntField(term268818, term268818.getClass(), "rateHold", 0);
        setIntField(term268818, term268818.getClass(), "rateFlick", 0);
        setIntField(term268818, term268818.getClass(), "rateSideTap", 0);
        setIntField(term268818, term268818.getClass(), "rateSideHold", 0);
        setIntField(term268818, term268818.getClass(), "bellCount", 0);
        setIntField(term268818, term268818.getClass(), "totalBellCount", 0);
        setIntField(term268818, term268818.getClass(), "damageCount", 0);
        setIntField(term268818, term268818.getClass(), "overDamage", 0);
        setBooleanField(term268818, term268818.getClass(), "isTechNewRecord", false);
        setBooleanField(term268818, term268818.getClass(), "isBattleNewRecord", false);
        setBooleanField(term268818, term268818.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term268818, term268818.getClass(), "isFullCombo", false);
        setBooleanField(term268818, term268818.getClass(), "isFullBell", false);
        setBooleanField(term268818, term268818.getClass(), "isAllBreak", false);
        setIntField(term268818, term268818.getClass(), "playerRating", 0);
        setIntField(term268818, term268818.getClass(), "battlePoint", 0);
        term268873 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268873;
        callMethod(klass, "setClearStatus", argTypes, term268818, args);
    }

};


