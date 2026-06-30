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

public class UserPlaylog_setCardAttack2_424699780221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268533;
     Object term268588;

    public UserPlaylog_setCardAttack2_424699780221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268533 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term268533, term268533.getClass(), "id", 0L);
        setField(term268533, term268533.getClass(), "user", null);
        setIntField(term268533, term268533.getClass(), "sortNumber", 0);
        setIntField(term268533, term268533.getClass(), "placeId", 0);
        setField(term268533, term268533.getClass(), "placeName", null);
        setField(term268533, term268533.getClass(), "playDate", null);
        setField(term268533, term268533.getClass(), "userPlayDate", null);
        setIntField(term268533, term268533.getClass(), "musicId", 0);
        setIntField(term268533, term268533.getClass(), "level", 0);
        setIntField(term268533, term268533.getClass(), "playKind", 0);
        setIntField(term268533, term268533.getClass(), "eventId", 0);
        setField(term268533, term268533.getClass(), "eventName", null);
        setIntField(term268533, term268533.getClass(), "eventPoint", 0);
        setIntField(term268533, term268533.getClass(), "playedUserId1", 0);
        setIntField(term268533, term268533.getClass(), "playedUserId2", 0);
        setIntField(term268533, term268533.getClass(), "playedUserId3", 0);
        setField(term268533, term268533.getClass(), "playedUserName1", null);
        setField(term268533, term268533.getClass(), "playedUserName2", null);
        setField(term268533, term268533.getClass(), "playedUserName3", null);
        setIntField(term268533, term268533.getClass(), "playedMusicLevel1", 0);
        setIntField(term268533, term268533.getClass(), "playedMusicLevel2", 0);
        setIntField(term268533, term268533.getClass(), "playedMusicLevel3", 0);
        setIntField(term268533, term268533.getClass(), "cardId1", 0);
        setIntField(term268533, term268533.getClass(), "cardId2", 0);
        setIntField(term268533, term268533.getClass(), "cardId3", 0);
        setIntField(term268533, term268533.getClass(), "cardLevel1", 0);
        setIntField(term268533, term268533.getClass(), "cardLevel2", 0);
        setIntField(term268533, term268533.getClass(), "cardLevel3", 0);
        setIntField(term268533, term268533.getClass(), "cardAttack1", 0);
        setIntField(term268533, term268533.getClass(), "cardAttack2", 0);
        setIntField(term268533, term268533.getClass(), "cardAttack3", 0);
        setIntField(term268533, term268533.getClass(), "bossCharaId", 0);
        setIntField(term268533, term268533.getClass(), "bossLevel", 0);
        setIntField(term268533, term268533.getClass(), "bossAttribute", 0);
        setIntField(term268533, term268533.getClass(), "clearStatus", 0);
        setIntField(term268533, term268533.getClass(), "techScore", 0);
        setIntField(term268533, term268533.getClass(), "techScoreRank", 0);
        setIntField(term268533, term268533.getClass(), "battleScore", 0);
        setIntField(term268533, term268533.getClass(), "battleScoreRank", 0);
        setIntField(term268533, term268533.getClass(), "platinumScore", 0);
        setIntField(term268533, term268533.getClass(), "maxCombo", 0);
        setIntField(term268533, term268533.getClass(), "judgeMiss", 0);
        setIntField(term268533, term268533.getClass(), "judgeHit", 0);
        setIntField(term268533, term268533.getClass(), "judgeBreak", 0);
        setIntField(term268533, term268533.getClass(), "judgeCriticalBreak", 0);
        setIntField(term268533, term268533.getClass(), "rateTap", 0);
        setIntField(term268533, term268533.getClass(), "rateHold", 0);
        setIntField(term268533, term268533.getClass(), "rateFlick", 0);
        setIntField(term268533, term268533.getClass(), "rateSideTap", 0);
        setIntField(term268533, term268533.getClass(), "rateSideHold", 0);
        setIntField(term268533, term268533.getClass(), "bellCount", 0);
        setIntField(term268533, term268533.getClass(), "totalBellCount", 0);
        setIntField(term268533, term268533.getClass(), "damageCount", 0);
        setIntField(term268533, term268533.getClass(), "overDamage", 0);
        setBooleanField(term268533, term268533.getClass(), "isTechNewRecord", false);
        setBooleanField(term268533, term268533.getClass(), "isBattleNewRecord", false);
        setBooleanField(term268533, term268533.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term268533, term268533.getClass(), "isFullCombo", false);
        setBooleanField(term268533, term268533.getClass(), "isFullBell", false);
        setBooleanField(term268533, term268533.getClass(), "isAllBreak", false);
        setIntField(term268533, term268533.getClass(), "playerRating", 0);
        setIntField(term268533, term268533.getClass(), "battlePoint", 0);
        term268588 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268588;
        callMethod(klass, "setCardAttack2", argTypes, term268533, args);
    }

};


