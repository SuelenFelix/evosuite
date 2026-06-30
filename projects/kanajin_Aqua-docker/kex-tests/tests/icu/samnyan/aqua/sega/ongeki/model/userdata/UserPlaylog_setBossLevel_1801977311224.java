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

public class UserPlaylog_setBossLevel_1801977311224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268704;
     Object term268759;

    public UserPlaylog_setBossLevel_1801977311224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268704 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term268704, term268704.getClass(), "id", 0L);
        setField(term268704, term268704.getClass(), "user", null);
        setIntField(term268704, term268704.getClass(), "sortNumber", 0);
        setIntField(term268704, term268704.getClass(), "placeId", 0);
        setField(term268704, term268704.getClass(), "placeName", null);
        setField(term268704, term268704.getClass(), "playDate", null);
        setField(term268704, term268704.getClass(), "userPlayDate", null);
        setIntField(term268704, term268704.getClass(), "musicId", 0);
        setIntField(term268704, term268704.getClass(), "level", 0);
        setIntField(term268704, term268704.getClass(), "playKind", 0);
        setIntField(term268704, term268704.getClass(), "eventId", 0);
        setField(term268704, term268704.getClass(), "eventName", null);
        setIntField(term268704, term268704.getClass(), "eventPoint", 0);
        setIntField(term268704, term268704.getClass(), "playedUserId1", 0);
        setIntField(term268704, term268704.getClass(), "playedUserId2", 0);
        setIntField(term268704, term268704.getClass(), "playedUserId3", 0);
        setField(term268704, term268704.getClass(), "playedUserName1", null);
        setField(term268704, term268704.getClass(), "playedUserName2", null);
        setField(term268704, term268704.getClass(), "playedUserName3", null);
        setIntField(term268704, term268704.getClass(), "playedMusicLevel1", 0);
        setIntField(term268704, term268704.getClass(), "playedMusicLevel2", 0);
        setIntField(term268704, term268704.getClass(), "playedMusicLevel3", 0);
        setIntField(term268704, term268704.getClass(), "cardId1", 0);
        setIntField(term268704, term268704.getClass(), "cardId2", 0);
        setIntField(term268704, term268704.getClass(), "cardId3", 0);
        setIntField(term268704, term268704.getClass(), "cardLevel1", 0);
        setIntField(term268704, term268704.getClass(), "cardLevel2", 0);
        setIntField(term268704, term268704.getClass(), "cardLevel3", 0);
        setIntField(term268704, term268704.getClass(), "cardAttack1", 0);
        setIntField(term268704, term268704.getClass(), "cardAttack2", 0);
        setIntField(term268704, term268704.getClass(), "cardAttack3", 0);
        setIntField(term268704, term268704.getClass(), "bossCharaId", 0);
        setIntField(term268704, term268704.getClass(), "bossLevel", 0);
        setIntField(term268704, term268704.getClass(), "bossAttribute", 0);
        setIntField(term268704, term268704.getClass(), "clearStatus", 0);
        setIntField(term268704, term268704.getClass(), "techScore", 0);
        setIntField(term268704, term268704.getClass(), "techScoreRank", 0);
        setIntField(term268704, term268704.getClass(), "battleScore", 0);
        setIntField(term268704, term268704.getClass(), "battleScoreRank", 0);
        setIntField(term268704, term268704.getClass(), "platinumScore", 0);
        setIntField(term268704, term268704.getClass(), "maxCombo", 0);
        setIntField(term268704, term268704.getClass(), "judgeMiss", 0);
        setIntField(term268704, term268704.getClass(), "judgeHit", 0);
        setIntField(term268704, term268704.getClass(), "judgeBreak", 0);
        setIntField(term268704, term268704.getClass(), "judgeCriticalBreak", 0);
        setIntField(term268704, term268704.getClass(), "rateTap", 0);
        setIntField(term268704, term268704.getClass(), "rateHold", 0);
        setIntField(term268704, term268704.getClass(), "rateFlick", 0);
        setIntField(term268704, term268704.getClass(), "rateSideTap", 0);
        setIntField(term268704, term268704.getClass(), "rateSideHold", 0);
        setIntField(term268704, term268704.getClass(), "bellCount", 0);
        setIntField(term268704, term268704.getClass(), "totalBellCount", 0);
        setIntField(term268704, term268704.getClass(), "damageCount", 0);
        setIntField(term268704, term268704.getClass(), "overDamage", 0);
        setBooleanField(term268704, term268704.getClass(), "isTechNewRecord", false);
        setBooleanField(term268704, term268704.getClass(), "isBattleNewRecord", false);
        setBooleanField(term268704, term268704.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term268704, term268704.getClass(), "isFullCombo", false);
        setBooleanField(term268704, term268704.getClass(), "isFullBell", false);
        setBooleanField(term268704, term268704.getClass(), "isAllBreak", false);
        setIntField(term268704, term268704.getClass(), "playerRating", 0);
        setIntField(term268704, term268704.getClass(), "battlePoint", 0);
        term268759 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268759;
        callMethod(klass, "setBossLevel", argTypes, term268704, args);
    }

};


