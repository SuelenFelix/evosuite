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

public class UserPlaylog_getCardId3_2081314088154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264806;

    public UserPlaylog_getCardId3_2081314088154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264806 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term264806, term264806.getClass(), "id", 0L);
        setField(term264806, term264806.getClass(), "user", null);
        setIntField(term264806, term264806.getClass(), "sortNumber", 0);
        setIntField(term264806, term264806.getClass(), "placeId", 0);
        setField(term264806, term264806.getClass(), "placeName", null);
        setField(term264806, term264806.getClass(), "playDate", null);
        setField(term264806, term264806.getClass(), "userPlayDate", null);
        setIntField(term264806, term264806.getClass(), "musicId", 0);
        setIntField(term264806, term264806.getClass(), "level", 0);
        setIntField(term264806, term264806.getClass(), "playKind", 0);
        setIntField(term264806, term264806.getClass(), "eventId", 0);
        setField(term264806, term264806.getClass(), "eventName", null);
        setIntField(term264806, term264806.getClass(), "eventPoint", 0);
        setIntField(term264806, term264806.getClass(), "playedUserId1", 0);
        setIntField(term264806, term264806.getClass(), "playedUserId2", 0);
        setIntField(term264806, term264806.getClass(), "playedUserId3", 0);
        setField(term264806, term264806.getClass(), "playedUserName1", null);
        setField(term264806, term264806.getClass(), "playedUserName2", null);
        setField(term264806, term264806.getClass(), "playedUserName3", null);
        setIntField(term264806, term264806.getClass(), "playedMusicLevel1", 0);
        setIntField(term264806, term264806.getClass(), "playedMusicLevel2", 0);
        setIntField(term264806, term264806.getClass(), "playedMusicLevel3", 0);
        setIntField(term264806, term264806.getClass(), "cardId1", 0);
        setIntField(term264806, term264806.getClass(), "cardId2", 0);
        setIntField(term264806, term264806.getClass(), "cardId3", 0);
        setIntField(term264806, term264806.getClass(), "cardLevel1", 0);
        setIntField(term264806, term264806.getClass(), "cardLevel2", 0);
        setIntField(term264806, term264806.getClass(), "cardLevel3", 0);
        setIntField(term264806, term264806.getClass(), "cardAttack1", 0);
        setIntField(term264806, term264806.getClass(), "cardAttack2", 0);
        setIntField(term264806, term264806.getClass(), "cardAttack3", 0);
        setIntField(term264806, term264806.getClass(), "bossCharaId", 0);
        setIntField(term264806, term264806.getClass(), "bossLevel", 0);
        setIntField(term264806, term264806.getClass(), "bossAttribute", 0);
        setIntField(term264806, term264806.getClass(), "clearStatus", 0);
        setIntField(term264806, term264806.getClass(), "techScore", 0);
        setIntField(term264806, term264806.getClass(), "techScoreRank", 0);
        setIntField(term264806, term264806.getClass(), "battleScore", 0);
        setIntField(term264806, term264806.getClass(), "battleScoreRank", 0);
        setIntField(term264806, term264806.getClass(), "platinumScore", 0);
        setIntField(term264806, term264806.getClass(), "maxCombo", 0);
        setIntField(term264806, term264806.getClass(), "judgeMiss", 0);
        setIntField(term264806, term264806.getClass(), "judgeHit", 0);
        setIntField(term264806, term264806.getClass(), "judgeBreak", 0);
        setIntField(term264806, term264806.getClass(), "judgeCriticalBreak", 0);
        setIntField(term264806, term264806.getClass(), "rateTap", 0);
        setIntField(term264806, term264806.getClass(), "rateHold", 0);
        setIntField(term264806, term264806.getClass(), "rateFlick", 0);
        setIntField(term264806, term264806.getClass(), "rateSideTap", 0);
        setIntField(term264806, term264806.getClass(), "rateSideHold", 0);
        setIntField(term264806, term264806.getClass(), "bellCount", 0);
        setIntField(term264806, term264806.getClass(), "totalBellCount", 0);
        setIntField(term264806, term264806.getClass(), "damageCount", 0);
        setIntField(term264806, term264806.getClass(), "overDamage", 0);
        setBooleanField(term264806, term264806.getClass(), "isTechNewRecord", false);
        setBooleanField(term264806, term264806.getClass(), "isBattleNewRecord", false);
        setBooleanField(term264806, term264806.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term264806, term264806.getClass(), "isFullCombo", false);
        setBooleanField(term264806, term264806.getClass(), "isFullBell", false);
        setBooleanField(term264806, term264806.getClass(), "isAllBreak", false);
        setIntField(term264806, term264806.getClass(), "playerRating", 0);
        setIntField(term264806, term264806.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId3", argTypes, term264806, args);
    }

};


