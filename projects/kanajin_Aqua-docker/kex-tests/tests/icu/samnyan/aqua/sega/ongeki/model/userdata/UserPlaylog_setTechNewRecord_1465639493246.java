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

public class UserPlaylog_setTechNewRecord_1465639493246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269958;
     Object term270013;

    public UserPlaylog_setTechNewRecord_1465639493246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269958 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term269958, term269958.getClass(), "id", 0L);
        setField(term269958, term269958.getClass(), "user", null);
        setIntField(term269958, term269958.getClass(), "sortNumber", 0);
        setIntField(term269958, term269958.getClass(), "placeId", 0);
        setField(term269958, term269958.getClass(), "placeName", null);
        setField(term269958, term269958.getClass(), "playDate", null);
        setField(term269958, term269958.getClass(), "userPlayDate", null);
        setIntField(term269958, term269958.getClass(), "musicId", 0);
        setIntField(term269958, term269958.getClass(), "level", 0);
        setIntField(term269958, term269958.getClass(), "playKind", 0);
        setIntField(term269958, term269958.getClass(), "eventId", 0);
        setField(term269958, term269958.getClass(), "eventName", null);
        setIntField(term269958, term269958.getClass(), "eventPoint", 0);
        setIntField(term269958, term269958.getClass(), "playedUserId1", 0);
        setIntField(term269958, term269958.getClass(), "playedUserId2", 0);
        setIntField(term269958, term269958.getClass(), "playedUserId3", 0);
        setField(term269958, term269958.getClass(), "playedUserName1", null);
        setField(term269958, term269958.getClass(), "playedUserName2", null);
        setField(term269958, term269958.getClass(), "playedUserName3", null);
        setIntField(term269958, term269958.getClass(), "playedMusicLevel1", 0);
        setIntField(term269958, term269958.getClass(), "playedMusicLevel2", 0);
        setIntField(term269958, term269958.getClass(), "playedMusicLevel3", 0);
        setIntField(term269958, term269958.getClass(), "cardId1", 0);
        setIntField(term269958, term269958.getClass(), "cardId2", 0);
        setIntField(term269958, term269958.getClass(), "cardId3", 0);
        setIntField(term269958, term269958.getClass(), "cardLevel1", 0);
        setIntField(term269958, term269958.getClass(), "cardLevel2", 0);
        setIntField(term269958, term269958.getClass(), "cardLevel3", 0);
        setIntField(term269958, term269958.getClass(), "cardAttack1", 0);
        setIntField(term269958, term269958.getClass(), "cardAttack2", 0);
        setIntField(term269958, term269958.getClass(), "cardAttack3", 0);
        setIntField(term269958, term269958.getClass(), "bossCharaId", 0);
        setIntField(term269958, term269958.getClass(), "bossLevel", 0);
        setIntField(term269958, term269958.getClass(), "bossAttribute", 0);
        setIntField(term269958, term269958.getClass(), "clearStatus", 0);
        setIntField(term269958, term269958.getClass(), "techScore", 0);
        setIntField(term269958, term269958.getClass(), "techScoreRank", 0);
        setIntField(term269958, term269958.getClass(), "battleScore", 0);
        setIntField(term269958, term269958.getClass(), "battleScoreRank", 0);
        setIntField(term269958, term269958.getClass(), "platinumScore", 0);
        setIntField(term269958, term269958.getClass(), "maxCombo", 0);
        setIntField(term269958, term269958.getClass(), "judgeMiss", 0);
        setIntField(term269958, term269958.getClass(), "judgeHit", 0);
        setIntField(term269958, term269958.getClass(), "judgeBreak", 0);
        setIntField(term269958, term269958.getClass(), "judgeCriticalBreak", 0);
        setIntField(term269958, term269958.getClass(), "rateTap", 0);
        setIntField(term269958, term269958.getClass(), "rateHold", 0);
        setIntField(term269958, term269958.getClass(), "rateFlick", 0);
        setIntField(term269958, term269958.getClass(), "rateSideTap", 0);
        setIntField(term269958, term269958.getClass(), "rateSideHold", 0);
        setIntField(term269958, term269958.getClass(), "bellCount", 0);
        setIntField(term269958, term269958.getClass(), "totalBellCount", 0);
        setIntField(term269958, term269958.getClass(), "damageCount", 0);
        setIntField(term269958, term269958.getClass(), "overDamage", 0);
        setBooleanField(term269958, term269958.getClass(), "isTechNewRecord", false);
        setBooleanField(term269958, term269958.getClass(), "isBattleNewRecord", false);
        setBooleanField(term269958, term269958.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term269958, term269958.getClass(), "isFullCombo", false);
        setBooleanField(term269958, term269958.getClass(), "isFullBell", false);
        setBooleanField(term269958, term269958.getClass(), "isAllBreak", false);
        setIntField(term269958, term269958.getClass(), "playerRating", 0);
        setIntField(term269958, term269958.getClass(), "battlePoint", 0);
        term270013 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term270013;
        callMethod(klass, "setTechNewRecord", argTypes, term269958, args);
    }

};


