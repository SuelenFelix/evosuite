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

public class UserPlaylog_setTechScoreRank_1820769614228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268932;
     Object term268987;

    public UserPlaylog_setTechScoreRank_1820769614228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268932 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term268932, term268932.getClass(), "id", 0L);
        setField(term268932, term268932.getClass(), "user", null);
        setIntField(term268932, term268932.getClass(), "sortNumber", 0);
        setIntField(term268932, term268932.getClass(), "placeId", 0);
        setField(term268932, term268932.getClass(), "placeName", null);
        setField(term268932, term268932.getClass(), "playDate", null);
        setField(term268932, term268932.getClass(), "userPlayDate", null);
        setIntField(term268932, term268932.getClass(), "musicId", 0);
        setIntField(term268932, term268932.getClass(), "level", 0);
        setIntField(term268932, term268932.getClass(), "playKind", 0);
        setIntField(term268932, term268932.getClass(), "eventId", 0);
        setField(term268932, term268932.getClass(), "eventName", null);
        setIntField(term268932, term268932.getClass(), "eventPoint", 0);
        setIntField(term268932, term268932.getClass(), "playedUserId1", 0);
        setIntField(term268932, term268932.getClass(), "playedUserId2", 0);
        setIntField(term268932, term268932.getClass(), "playedUserId3", 0);
        setField(term268932, term268932.getClass(), "playedUserName1", null);
        setField(term268932, term268932.getClass(), "playedUserName2", null);
        setField(term268932, term268932.getClass(), "playedUserName3", null);
        setIntField(term268932, term268932.getClass(), "playedMusicLevel1", 0);
        setIntField(term268932, term268932.getClass(), "playedMusicLevel2", 0);
        setIntField(term268932, term268932.getClass(), "playedMusicLevel3", 0);
        setIntField(term268932, term268932.getClass(), "cardId1", 0);
        setIntField(term268932, term268932.getClass(), "cardId2", 0);
        setIntField(term268932, term268932.getClass(), "cardId3", 0);
        setIntField(term268932, term268932.getClass(), "cardLevel1", 0);
        setIntField(term268932, term268932.getClass(), "cardLevel2", 0);
        setIntField(term268932, term268932.getClass(), "cardLevel3", 0);
        setIntField(term268932, term268932.getClass(), "cardAttack1", 0);
        setIntField(term268932, term268932.getClass(), "cardAttack2", 0);
        setIntField(term268932, term268932.getClass(), "cardAttack3", 0);
        setIntField(term268932, term268932.getClass(), "bossCharaId", 0);
        setIntField(term268932, term268932.getClass(), "bossLevel", 0);
        setIntField(term268932, term268932.getClass(), "bossAttribute", 0);
        setIntField(term268932, term268932.getClass(), "clearStatus", 0);
        setIntField(term268932, term268932.getClass(), "techScore", 0);
        setIntField(term268932, term268932.getClass(), "techScoreRank", 0);
        setIntField(term268932, term268932.getClass(), "battleScore", 0);
        setIntField(term268932, term268932.getClass(), "battleScoreRank", 0);
        setIntField(term268932, term268932.getClass(), "platinumScore", 0);
        setIntField(term268932, term268932.getClass(), "maxCombo", 0);
        setIntField(term268932, term268932.getClass(), "judgeMiss", 0);
        setIntField(term268932, term268932.getClass(), "judgeHit", 0);
        setIntField(term268932, term268932.getClass(), "judgeBreak", 0);
        setIntField(term268932, term268932.getClass(), "judgeCriticalBreak", 0);
        setIntField(term268932, term268932.getClass(), "rateTap", 0);
        setIntField(term268932, term268932.getClass(), "rateHold", 0);
        setIntField(term268932, term268932.getClass(), "rateFlick", 0);
        setIntField(term268932, term268932.getClass(), "rateSideTap", 0);
        setIntField(term268932, term268932.getClass(), "rateSideHold", 0);
        setIntField(term268932, term268932.getClass(), "bellCount", 0);
        setIntField(term268932, term268932.getClass(), "totalBellCount", 0);
        setIntField(term268932, term268932.getClass(), "damageCount", 0);
        setIntField(term268932, term268932.getClass(), "overDamage", 0);
        setBooleanField(term268932, term268932.getClass(), "isTechNewRecord", false);
        setBooleanField(term268932, term268932.getClass(), "isBattleNewRecord", false);
        setBooleanField(term268932, term268932.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term268932, term268932.getClass(), "isFullCombo", false);
        setBooleanField(term268932, term268932.getClass(), "isFullBell", false);
        setBooleanField(term268932, term268932.getClass(), "isAllBreak", false);
        setIntField(term268932, term268932.getClass(), "playerRating", 0);
        setIntField(term268932, term268932.getClass(), "battlePoint", 0);
        term268987 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268987;
        callMethod(klass, "setTechScoreRank", argTypes, term268932, args);
    }

};


