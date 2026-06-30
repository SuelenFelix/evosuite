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

public class UserPlaylog_isTechNewRecord_1790022471184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266456;

    public UserPlaylog_isTechNewRecord_1790022471184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266456 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term266456, term266456.getClass(), "id", 0L);
        setField(term266456, term266456.getClass(), "user", null);
        setIntField(term266456, term266456.getClass(), "sortNumber", 0);
        setIntField(term266456, term266456.getClass(), "placeId", 0);
        setField(term266456, term266456.getClass(), "placeName", null);
        setField(term266456, term266456.getClass(), "playDate", null);
        setField(term266456, term266456.getClass(), "userPlayDate", null);
        setIntField(term266456, term266456.getClass(), "musicId", 0);
        setIntField(term266456, term266456.getClass(), "level", 0);
        setIntField(term266456, term266456.getClass(), "playKind", 0);
        setIntField(term266456, term266456.getClass(), "eventId", 0);
        setField(term266456, term266456.getClass(), "eventName", null);
        setIntField(term266456, term266456.getClass(), "eventPoint", 0);
        setIntField(term266456, term266456.getClass(), "playedUserId1", 0);
        setIntField(term266456, term266456.getClass(), "playedUserId2", 0);
        setIntField(term266456, term266456.getClass(), "playedUserId3", 0);
        setField(term266456, term266456.getClass(), "playedUserName1", null);
        setField(term266456, term266456.getClass(), "playedUserName2", null);
        setField(term266456, term266456.getClass(), "playedUserName3", null);
        setIntField(term266456, term266456.getClass(), "playedMusicLevel1", 0);
        setIntField(term266456, term266456.getClass(), "playedMusicLevel2", 0);
        setIntField(term266456, term266456.getClass(), "playedMusicLevel3", 0);
        setIntField(term266456, term266456.getClass(), "cardId1", 0);
        setIntField(term266456, term266456.getClass(), "cardId2", 0);
        setIntField(term266456, term266456.getClass(), "cardId3", 0);
        setIntField(term266456, term266456.getClass(), "cardLevel1", 0);
        setIntField(term266456, term266456.getClass(), "cardLevel2", 0);
        setIntField(term266456, term266456.getClass(), "cardLevel3", 0);
        setIntField(term266456, term266456.getClass(), "cardAttack1", 0);
        setIntField(term266456, term266456.getClass(), "cardAttack2", 0);
        setIntField(term266456, term266456.getClass(), "cardAttack3", 0);
        setIntField(term266456, term266456.getClass(), "bossCharaId", 0);
        setIntField(term266456, term266456.getClass(), "bossLevel", 0);
        setIntField(term266456, term266456.getClass(), "bossAttribute", 0);
        setIntField(term266456, term266456.getClass(), "clearStatus", 0);
        setIntField(term266456, term266456.getClass(), "techScore", 0);
        setIntField(term266456, term266456.getClass(), "techScoreRank", 0);
        setIntField(term266456, term266456.getClass(), "battleScore", 0);
        setIntField(term266456, term266456.getClass(), "battleScoreRank", 0);
        setIntField(term266456, term266456.getClass(), "platinumScore", 0);
        setIntField(term266456, term266456.getClass(), "maxCombo", 0);
        setIntField(term266456, term266456.getClass(), "judgeMiss", 0);
        setIntField(term266456, term266456.getClass(), "judgeHit", 0);
        setIntField(term266456, term266456.getClass(), "judgeBreak", 0);
        setIntField(term266456, term266456.getClass(), "judgeCriticalBreak", 0);
        setIntField(term266456, term266456.getClass(), "rateTap", 0);
        setIntField(term266456, term266456.getClass(), "rateHold", 0);
        setIntField(term266456, term266456.getClass(), "rateFlick", 0);
        setIntField(term266456, term266456.getClass(), "rateSideTap", 0);
        setIntField(term266456, term266456.getClass(), "rateSideHold", 0);
        setIntField(term266456, term266456.getClass(), "bellCount", 0);
        setIntField(term266456, term266456.getClass(), "totalBellCount", 0);
        setIntField(term266456, term266456.getClass(), "damageCount", 0);
        setIntField(term266456, term266456.getClass(), "overDamage", 0);
        setBooleanField(term266456, term266456.getClass(), "isTechNewRecord", false);
        setBooleanField(term266456, term266456.getClass(), "isBattleNewRecord", false);
        setBooleanField(term266456, term266456.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term266456, term266456.getClass(), "isFullCombo", false);
        setBooleanField(term266456, term266456.getClass(), "isFullBell", false);
        setBooleanField(term266456, term266456.getClass(), "isAllBreak", false);
        setIntField(term266456, term266456.getClass(), "playerRating", 0);
        setIntField(term266456, term266456.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTechNewRecord", argTypes, term266456, args);
    }

};


