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

public class UserPlaylog_setRateTap_189282003237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269445;
     Object term269500;

    public UserPlaylog_setRateTap_189282003237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269445 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term269445, term269445.getClass(), "id", 0L);
        setField(term269445, term269445.getClass(), "user", null);
        setIntField(term269445, term269445.getClass(), "sortNumber", 0);
        setIntField(term269445, term269445.getClass(), "placeId", 0);
        setField(term269445, term269445.getClass(), "placeName", null);
        setField(term269445, term269445.getClass(), "playDate", null);
        setField(term269445, term269445.getClass(), "userPlayDate", null);
        setIntField(term269445, term269445.getClass(), "musicId", 0);
        setIntField(term269445, term269445.getClass(), "level", 0);
        setIntField(term269445, term269445.getClass(), "playKind", 0);
        setIntField(term269445, term269445.getClass(), "eventId", 0);
        setField(term269445, term269445.getClass(), "eventName", null);
        setIntField(term269445, term269445.getClass(), "eventPoint", 0);
        setIntField(term269445, term269445.getClass(), "playedUserId1", 0);
        setIntField(term269445, term269445.getClass(), "playedUserId2", 0);
        setIntField(term269445, term269445.getClass(), "playedUserId3", 0);
        setField(term269445, term269445.getClass(), "playedUserName1", null);
        setField(term269445, term269445.getClass(), "playedUserName2", null);
        setField(term269445, term269445.getClass(), "playedUserName3", null);
        setIntField(term269445, term269445.getClass(), "playedMusicLevel1", 0);
        setIntField(term269445, term269445.getClass(), "playedMusicLevel2", 0);
        setIntField(term269445, term269445.getClass(), "playedMusicLevel3", 0);
        setIntField(term269445, term269445.getClass(), "cardId1", 0);
        setIntField(term269445, term269445.getClass(), "cardId2", 0);
        setIntField(term269445, term269445.getClass(), "cardId3", 0);
        setIntField(term269445, term269445.getClass(), "cardLevel1", 0);
        setIntField(term269445, term269445.getClass(), "cardLevel2", 0);
        setIntField(term269445, term269445.getClass(), "cardLevel3", 0);
        setIntField(term269445, term269445.getClass(), "cardAttack1", 0);
        setIntField(term269445, term269445.getClass(), "cardAttack2", 0);
        setIntField(term269445, term269445.getClass(), "cardAttack3", 0);
        setIntField(term269445, term269445.getClass(), "bossCharaId", 0);
        setIntField(term269445, term269445.getClass(), "bossLevel", 0);
        setIntField(term269445, term269445.getClass(), "bossAttribute", 0);
        setIntField(term269445, term269445.getClass(), "clearStatus", 0);
        setIntField(term269445, term269445.getClass(), "techScore", 0);
        setIntField(term269445, term269445.getClass(), "techScoreRank", 0);
        setIntField(term269445, term269445.getClass(), "battleScore", 0);
        setIntField(term269445, term269445.getClass(), "battleScoreRank", 0);
        setIntField(term269445, term269445.getClass(), "platinumScore", 0);
        setIntField(term269445, term269445.getClass(), "maxCombo", 0);
        setIntField(term269445, term269445.getClass(), "judgeMiss", 0);
        setIntField(term269445, term269445.getClass(), "judgeHit", 0);
        setIntField(term269445, term269445.getClass(), "judgeBreak", 0);
        setIntField(term269445, term269445.getClass(), "judgeCriticalBreak", 0);
        setIntField(term269445, term269445.getClass(), "rateTap", 0);
        setIntField(term269445, term269445.getClass(), "rateHold", 0);
        setIntField(term269445, term269445.getClass(), "rateFlick", 0);
        setIntField(term269445, term269445.getClass(), "rateSideTap", 0);
        setIntField(term269445, term269445.getClass(), "rateSideHold", 0);
        setIntField(term269445, term269445.getClass(), "bellCount", 0);
        setIntField(term269445, term269445.getClass(), "totalBellCount", 0);
        setIntField(term269445, term269445.getClass(), "damageCount", 0);
        setIntField(term269445, term269445.getClass(), "overDamage", 0);
        setBooleanField(term269445, term269445.getClass(), "isTechNewRecord", false);
        setBooleanField(term269445, term269445.getClass(), "isBattleNewRecord", false);
        setBooleanField(term269445, term269445.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term269445, term269445.getClass(), "isFullCombo", false);
        setBooleanField(term269445, term269445.getClass(), "isFullBell", false);
        setBooleanField(term269445, term269445.getClass(), "isAllBreak", false);
        setIntField(term269445, term269445.getClass(), "playerRating", 0);
        setIntField(term269445, term269445.getClass(), "battlePoint", 0);
        term269500 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term269500;
        callMethod(klass, "setRateTap", argTypes, term269445, args);
    }

};


