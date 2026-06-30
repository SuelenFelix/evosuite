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

public class UserPlaylog_canEqual_482732919255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270469;

    public UserPlaylog_canEqual_482732919255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270469 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term270469, term270469.getClass(), "id", 0L);
        setField(term270469, term270469.getClass(), "user", null);
        setIntField(term270469, term270469.getClass(), "sortNumber", 0);
        setIntField(term270469, term270469.getClass(), "placeId", 0);
        setField(term270469, term270469.getClass(), "placeName", null);
        setField(term270469, term270469.getClass(), "playDate", null);
        setField(term270469, term270469.getClass(), "userPlayDate", null);
        setIntField(term270469, term270469.getClass(), "musicId", 0);
        setIntField(term270469, term270469.getClass(), "level", 0);
        setIntField(term270469, term270469.getClass(), "playKind", 0);
        setIntField(term270469, term270469.getClass(), "eventId", 0);
        setField(term270469, term270469.getClass(), "eventName", null);
        setIntField(term270469, term270469.getClass(), "eventPoint", 0);
        setIntField(term270469, term270469.getClass(), "playedUserId1", 0);
        setIntField(term270469, term270469.getClass(), "playedUserId2", 0);
        setIntField(term270469, term270469.getClass(), "playedUserId3", 0);
        setField(term270469, term270469.getClass(), "playedUserName1", null);
        setField(term270469, term270469.getClass(), "playedUserName2", null);
        setField(term270469, term270469.getClass(), "playedUserName3", null);
        setIntField(term270469, term270469.getClass(), "playedMusicLevel1", 0);
        setIntField(term270469, term270469.getClass(), "playedMusicLevel2", 0);
        setIntField(term270469, term270469.getClass(), "playedMusicLevel3", 0);
        setIntField(term270469, term270469.getClass(), "cardId1", 0);
        setIntField(term270469, term270469.getClass(), "cardId2", 0);
        setIntField(term270469, term270469.getClass(), "cardId3", 0);
        setIntField(term270469, term270469.getClass(), "cardLevel1", 0);
        setIntField(term270469, term270469.getClass(), "cardLevel2", 0);
        setIntField(term270469, term270469.getClass(), "cardLevel3", 0);
        setIntField(term270469, term270469.getClass(), "cardAttack1", 0);
        setIntField(term270469, term270469.getClass(), "cardAttack2", 0);
        setIntField(term270469, term270469.getClass(), "cardAttack3", 0);
        setIntField(term270469, term270469.getClass(), "bossCharaId", 0);
        setIntField(term270469, term270469.getClass(), "bossLevel", 0);
        setIntField(term270469, term270469.getClass(), "bossAttribute", 0);
        setIntField(term270469, term270469.getClass(), "clearStatus", 0);
        setIntField(term270469, term270469.getClass(), "techScore", 0);
        setIntField(term270469, term270469.getClass(), "techScoreRank", 0);
        setIntField(term270469, term270469.getClass(), "battleScore", 0);
        setIntField(term270469, term270469.getClass(), "battleScoreRank", 0);
        setIntField(term270469, term270469.getClass(), "platinumScore", 0);
        setIntField(term270469, term270469.getClass(), "maxCombo", 0);
        setIntField(term270469, term270469.getClass(), "judgeMiss", 0);
        setIntField(term270469, term270469.getClass(), "judgeHit", 0);
        setIntField(term270469, term270469.getClass(), "judgeBreak", 0);
        setIntField(term270469, term270469.getClass(), "judgeCriticalBreak", 0);
        setIntField(term270469, term270469.getClass(), "rateTap", 0);
        setIntField(term270469, term270469.getClass(), "rateHold", 0);
        setIntField(term270469, term270469.getClass(), "rateFlick", 0);
        setIntField(term270469, term270469.getClass(), "rateSideTap", 0);
        setIntField(term270469, term270469.getClass(), "rateSideHold", 0);
        setIntField(term270469, term270469.getClass(), "bellCount", 0);
        setIntField(term270469, term270469.getClass(), "totalBellCount", 0);
        setIntField(term270469, term270469.getClass(), "damageCount", 0);
        setIntField(term270469, term270469.getClass(), "overDamage", 0);
        setBooleanField(term270469, term270469.getClass(), "isTechNewRecord", false);
        setBooleanField(term270469, term270469.getClass(), "isBattleNewRecord", false);
        setBooleanField(term270469, term270469.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term270469, term270469.getClass(), "isFullCombo", false);
        setBooleanField(term270469, term270469.getClass(), "isFullBell", false);
        setBooleanField(term270469, term270469.getClass(), "isAllBreak", false);
        setIntField(term270469, term270469.getClass(), "playerRating", 0);
        setIntField(term270469, term270469.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term270469, args);
    }

};


