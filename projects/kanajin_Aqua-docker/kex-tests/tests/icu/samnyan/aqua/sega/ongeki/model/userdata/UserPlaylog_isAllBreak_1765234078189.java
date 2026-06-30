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

public class UserPlaylog_isAllBreak_1765234078189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266731;

    public UserPlaylog_isAllBreak_1765234078189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266731 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term266731, term266731.getClass(), "id", 0L);
        setField(term266731, term266731.getClass(), "user", null);
        setIntField(term266731, term266731.getClass(), "sortNumber", 0);
        setIntField(term266731, term266731.getClass(), "placeId", 0);
        setField(term266731, term266731.getClass(), "placeName", null);
        setField(term266731, term266731.getClass(), "playDate", null);
        setField(term266731, term266731.getClass(), "userPlayDate", null);
        setIntField(term266731, term266731.getClass(), "musicId", 0);
        setIntField(term266731, term266731.getClass(), "level", 0);
        setIntField(term266731, term266731.getClass(), "playKind", 0);
        setIntField(term266731, term266731.getClass(), "eventId", 0);
        setField(term266731, term266731.getClass(), "eventName", null);
        setIntField(term266731, term266731.getClass(), "eventPoint", 0);
        setIntField(term266731, term266731.getClass(), "playedUserId1", 0);
        setIntField(term266731, term266731.getClass(), "playedUserId2", 0);
        setIntField(term266731, term266731.getClass(), "playedUserId3", 0);
        setField(term266731, term266731.getClass(), "playedUserName1", null);
        setField(term266731, term266731.getClass(), "playedUserName2", null);
        setField(term266731, term266731.getClass(), "playedUserName3", null);
        setIntField(term266731, term266731.getClass(), "playedMusicLevel1", 0);
        setIntField(term266731, term266731.getClass(), "playedMusicLevel2", 0);
        setIntField(term266731, term266731.getClass(), "playedMusicLevel3", 0);
        setIntField(term266731, term266731.getClass(), "cardId1", 0);
        setIntField(term266731, term266731.getClass(), "cardId2", 0);
        setIntField(term266731, term266731.getClass(), "cardId3", 0);
        setIntField(term266731, term266731.getClass(), "cardLevel1", 0);
        setIntField(term266731, term266731.getClass(), "cardLevel2", 0);
        setIntField(term266731, term266731.getClass(), "cardLevel3", 0);
        setIntField(term266731, term266731.getClass(), "cardAttack1", 0);
        setIntField(term266731, term266731.getClass(), "cardAttack2", 0);
        setIntField(term266731, term266731.getClass(), "cardAttack3", 0);
        setIntField(term266731, term266731.getClass(), "bossCharaId", 0);
        setIntField(term266731, term266731.getClass(), "bossLevel", 0);
        setIntField(term266731, term266731.getClass(), "bossAttribute", 0);
        setIntField(term266731, term266731.getClass(), "clearStatus", 0);
        setIntField(term266731, term266731.getClass(), "techScore", 0);
        setIntField(term266731, term266731.getClass(), "techScoreRank", 0);
        setIntField(term266731, term266731.getClass(), "battleScore", 0);
        setIntField(term266731, term266731.getClass(), "battleScoreRank", 0);
        setIntField(term266731, term266731.getClass(), "platinumScore", 0);
        setIntField(term266731, term266731.getClass(), "maxCombo", 0);
        setIntField(term266731, term266731.getClass(), "judgeMiss", 0);
        setIntField(term266731, term266731.getClass(), "judgeHit", 0);
        setIntField(term266731, term266731.getClass(), "judgeBreak", 0);
        setIntField(term266731, term266731.getClass(), "judgeCriticalBreak", 0);
        setIntField(term266731, term266731.getClass(), "rateTap", 0);
        setIntField(term266731, term266731.getClass(), "rateHold", 0);
        setIntField(term266731, term266731.getClass(), "rateFlick", 0);
        setIntField(term266731, term266731.getClass(), "rateSideTap", 0);
        setIntField(term266731, term266731.getClass(), "rateSideHold", 0);
        setIntField(term266731, term266731.getClass(), "bellCount", 0);
        setIntField(term266731, term266731.getClass(), "totalBellCount", 0);
        setIntField(term266731, term266731.getClass(), "damageCount", 0);
        setIntField(term266731, term266731.getClass(), "overDamage", 0);
        setBooleanField(term266731, term266731.getClass(), "isTechNewRecord", false);
        setBooleanField(term266731, term266731.getClass(), "isBattleNewRecord", false);
        setBooleanField(term266731, term266731.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term266731, term266731.getClass(), "isFullCombo", false);
        setBooleanField(term266731, term266731.getClass(), "isFullBell", false);
        setBooleanField(term266731, term266731.getClass(), "isAllBreak", false);
        setIntField(term266731, term266731.getClass(), "playerRating", 0);
        setIntField(term266731, term266731.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllBreak", argTypes, term266731, args);
    }

};


