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

public class UserPlaylog_getPlaceName_525594121134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263706;

    public UserPlaylog_getPlaceName_525594121134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263706 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term263706, term263706.getClass(), "id", 0L);
        setField(term263706, term263706.getClass(), "user", null);
        setIntField(term263706, term263706.getClass(), "sortNumber", 0);
        setIntField(term263706, term263706.getClass(), "placeId", 0);
        setField(term263706, term263706.getClass(), "placeName", null);
        setField(term263706, term263706.getClass(), "playDate", null);
        setField(term263706, term263706.getClass(), "userPlayDate", null);
        setIntField(term263706, term263706.getClass(), "musicId", 0);
        setIntField(term263706, term263706.getClass(), "level", 0);
        setIntField(term263706, term263706.getClass(), "playKind", 0);
        setIntField(term263706, term263706.getClass(), "eventId", 0);
        setField(term263706, term263706.getClass(), "eventName", null);
        setIntField(term263706, term263706.getClass(), "eventPoint", 0);
        setIntField(term263706, term263706.getClass(), "playedUserId1", 0);
        setIntField(term263706, term263706.getClass(), "playedUserId2", 0);
        setIntField(term263706, term263706.getClass(), "playedUserId3", 0);
        setField(term263706, term263706.getClass(), "playedUserName1", null);
        setField(term263706, term263706.getClass(), "playedUserName2", null);
        setField(term263706, term263706.getClass(), "playedUserName3", null);
        setIntField(term263706, term263706.getClass(), "playedMusicLevel1", 0);
        setIntField(term263706, term263706.getClass(), "playedMusicLevel2", 0);
        setIntField(term263706, term263706.getClass(), "playedMusicLevel3", 0);
        setIntField(term263706, term263706.getClass(), "cardId1", 0);
        setIntField(term263706, term263706.getClass(), "cardId2", 0);
        setIntField(term263706, term263706.getClass(), "cardId3", 0);
        setIntField(term263706, term263706.getClass(), "cardLevel1", 0);
        setIntField(term263706, term263706.getClass(), "cardLevel2", 0);
        setIntField(term263706, term263706.getClass(), "cardLevel3", 0);
        setIntField(term263706, term263706.getClass(), "cardAttack1", 0);
        setIntField(term263706, term263706.getClass(), "cardAttack2", 0);
        setIntField(term263706, term263706.getClass(), "cardAttack3", 0);
        setIntField(term263706, term263706.getClass(), "bossCharaId", 0);
        setIntField(term263706, term263706.getClass(), "bossLevel", 0);
        setIntField(term263706, term263706.getClass(), "bossAttribute", 0);
        setIntField(term263706, term263706.getClass(), "clearStatus", 0);
        setIntField(term263706, term263706.getClass(), "techScore", 0);
        setIntField(term263706, term263706.getClass(), "techScoreRank", 0);
        setIntField(term263706, term263706.getClass(), "battleScore", 0);
        setIntField(term263706, term263706.getClass(), "battleScoreRank", 0);
        setIntField(term263706, term263706.getClass(), "platinumScore", 0);
        setIntField(term263706, term263706.getClass(), "maxCombo", 0);
        setIntField(term263706, term263706.getClass(), "judgeMiss", 0);
        setIntField(term263706, term263706.getClass(), "judgeHit", 0);
        setIntField(term263706, term263706.getClass(), "judgeBreak", 0);
        setIntField(term263706, term263706.getClass(), "judgeCriticalBreak", 0);
        setIntField(term263706, term263706.getClass(), "rateTap", 0);
        setIntField(term263706, term263706.getClass(), "rateHold", 0);
        setIntField(term263706, term263706.getClass(), "rateFlick", 0);
        setIntField(term263706, term263706.getClass(), "rateSideTap", 0);
        setIntField(term263706, term263706.getClass(), "rateSideHold", 0);
        setIntField(term263706, term263706.getClass(), "bellCount", 0);
        setIntField(term263706, term263706.getClass(), "totalBellCount", 0);
        setIntField(term263706, term263706.getClass(), "damageCount", 0);
        setIntField(term263706, term263706.getClass(), "overDamage", 0);
        setBooleanField(term263706, term263706.getClass(), "isTechNewRecord", false);
        setBooleanField(term263706, term263706.getClass(), "isBattleNewRecord", false);
        setBooleanField(term263706, term263706.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term263706, term263706.getClass(), "isFullCombo", false);
        setBooleanField(term263706, term263706.getClass(), "isFullBell", false);
        setBooleanField(term263706, term263706.getClass(), "isAllBreak", false);
        setIntField(term263706, term263706.getClass(), "playerRating", 0);
        setIntField(term263706, term263706.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceName", argTypes, term263706, args);
    }

};


