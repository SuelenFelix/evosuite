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
import java.lang.Boolean;

public class UserPlaylog_setFullCombo_246126487249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270129;
     Object term270184;

    public UserPlaylog_setFullCombo_246126487249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270129 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term270129, term270129.getClass(), "id", 0L);
        setField(term270129, term270129.getClass(), "user", null);
        setIntField(term270129, term270129.getClass(), "sortNumber", 0);
        setIntField(term270129, term270129.getClass(), "placeId", 0);
        setField(term270129, term270129.getClass(), "placeName", null);
        setField(term270129, term270129.getClass(), "playDate", null);
        setField(term270129, term270129.getClass(), "userPlayDate", null);
        setIntField(term270129, term270129.getClass(), "musicId", 0);
        setIntField(term270129, term270129.getClass(), "level", 0);
        setIntField(term270129, term270129.getClass(), "playKind", 0);
        setIntField(term270129, term270129.getClass(), "eventId", 0);
        setField(term270129, term270129.getClass(), "eventName", null);
        setIntField(term270129, term270129.getClass(), "eventPoint", 0);
        setIntField(term270129, term270129.getClass(), "playedUserId1", 0);
        setIntField(term270129, term270129.getClass(), "playedUserId2", 0);
        setIntField(term270129, term270129.getClass(), "playedUserId3", 0);
        setField(term270129, term270129.getClass(), "playedUserName1", null);
        setField(term270129, term270129.getClass(), "playedUserName2", null);
        setField(term270129, term270129.getClass(), "playedUserName3", null);
        setIntField(term270129, term270129.getClass(), "playedMusicLevel1", 0);
        setIntField(term270129, term270129.getClass(), "playedMusicLevel2", 0);
        setIntField(term270129, term270129.getClass(), "playedMusicLevel3", 0);
        setIntField(term270129, term270129.getClass(), "cardId1", 0);
        setIntField(term270129, term270129.getClass(), "cardId2", 0);
        setIntField(term270129, term270129.getClass(), "cardId3", 0);
        setIntField(term270129, term270129.getClass(), "cardLevel1", 0);
        setIntField(term270129, term270129.getClass(), "cardLevel2", 0);
        setIntField(term270129, term270129.getClass(), "cardLevel3", 0);
        setIntField(term270129, term270129.getClass(), "cardAttack1", 0);
        setIntField(term270129, term270129.getClass(), "cardAttack2", 0);
        setIntField(term270129, term270129.getClass(), "cardAttack3", 0);
        setIntField(term270129, term270129.getClass(), "bossCharaId", 0);
        setIntField(term270129, term270129.getClass(), "bossLevel", 0);
        setIntField(term270129, term270129.getClass(), "bossAttribute", 0);
        setIntField(term270129, term270129.getClass(), "clearStatus", 0);
        setIntField(term270129, term270129.getClass(), "techScore", 0);
        setIntField(term270129, term270129.getClass(), "techScoreRank", 0);
        setIntField(term270129, term270129.getClass(), "battleScore", 0);
        setIntField(term270129, term270129.getClass(), "battleScoreRank", 0);
        setIntField(term270129, term270129.getClass(), "platinumScore", 0);
        setIntField(term270129, term270129.getClass(), "maxCombo", 0);
        setIntField(term270129, term270129.getClass(), "judgeMiss", 0);
        setIntField(term270129, term270129.getClass(), "judgeHit", 0);
        setIntField(term270129, term270129.getClass(), "judgeBreak", 0);
        setIntField(term270129, term270129.getClass(), "judgeCriticalBreak", 0);
        setIntField(term270129, term270129.getClass(), "rateTap", 0);
        setIntField(term270129, term270129.getClass(), "rateHold", 0);
        setIntField(term270129, term270129.getClass(), "rateFlick", 0);
        setIntField(term270129, term270129.getClass(), "rateSideTap", 0);
        setIntField(term270129, term270129.getClass(), "rateSideHold", 0);
        setIntField(term270129, term270129.getClass(), "bellCount", 0);
        setIntField(term270129, term270129.getClass(), "totalBellCount", 0);
        setIntField(term270129, term270129.getClass(), "damageCount", 0);
        setIntField(term270129, term270129.getClass(), "overDamage", 0);
        setBooleanField(term270129, term270129.getClass(), "isTechNewRecord", false);
        setBooleanField(term270129, term270129.getClass(), "isBattleNewRecord", false);
        setBooleanField(term270129, term270129.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term270129, term270129.getClass(), "isFullCombo", false);
        setBooleanField(term270129, term270129.getClass(), "isFullBell", false);
        setBooleanField(term270129, term270129.getClass(), "isAllBreak", false);
        setIntField(term270129, term270129.getClass(), "playerRating", 0);
        setIntField(term270129, term270129.getClass(), "battlePoint", 0);
        term270184 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term270184;
        callMethod(klass, "setFullCombo", argTypes, term270129, args);
    }

};


