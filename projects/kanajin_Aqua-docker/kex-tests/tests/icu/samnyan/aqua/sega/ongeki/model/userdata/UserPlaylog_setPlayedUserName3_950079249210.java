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

public class UserPlaylog_setPlayedUserName3_950079249210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267908;

    public UserPlaylog_setPlayedUserName3_950079249210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267908 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term267908, term267908.getClass(), "id", 0L);
        setField(term267908, term267908.getClass(), "user", null);
        setIntField(term267908, term267908.getClass(), "sortNumber", 0);
        setIntField(term267908, term267908.getClass(), "placeId", 0);
        setField(term267908, term267908.getClass(), "placeName", null);
        setField(term267908, term267908.getClass(), "playDate", null);
        setField(term267908, term267908.getClass(), "userPlayDate", null);
        setIntField(term267908, term267908.getClass(), "musicId", 0);
        setIntField(term267908, term267908.getClass(), "level", 0);
        setIntField(term267908, term267908.getClass(), "playKind", 0);
        setIntField(term267908, term267908.getClass(), "eventId", 0);
        setField(term267908, term267908.getClass(), "eventName", null);
        setIntField(term267908, term267908.getClass(), "eventPoint", 0);
        setIntField(term267908, term267908.getClass(), "playedUserId1", 0);
        setIntField(term267908, term267908.getClass(), "playedUserId2", 0);
        setIntField(term267908, term267908.getClass(), "playedUserId3", 0);
        setField(term267908, term267908.getClass(), "playedUserName1", null);
        setField(term267908, term267908.getClass(), "playedUserName2", null);
        setField(term267908, term267908.getClass(), "playedUserName3", null);
        setIntField(term267908, term267908.getClass(), "playedMusicLevel1", 0);
        setIntField(term267908, term267908.getClass(), "playedMusicLevel2", 0);
        setIntField(term267908, term267908.getClass(), "playedMusicLevel3", 0);
        setIntField(term267908, term267908.getClass(), "cardId1", 0);
        setIntField(term267908, term267908.getClass(), "cardId2", 0);
        setIntField(term267908, term267908.getClass(), "cardId3", 0);
        setIntField(term267908, term267908.getClass(), "cardLevel1", 0);
        setIntField(term267908, term267908.getClass(), "cardLevel2", 0);
        setIntField(term267908, term267908.getClass(), "cardLevel3", 0);
        setIntField(term267908, term267908.getClass(), "cardAttack1", 0);
        setIntField(term267908, term267908.getClass(), "cardAttack2", 0);
        setIntField(term267908, term267908.getClass(), "cardAttack3", 0);
        setIntField(term267908, term267908.getClass(), "bossCharaId", 0);
        setIntField(term267908, term267908.getClass(), "bossLevel", 0);
        setIntField(term267908, term267908.getClass(), "bossAttribute", 0);
        setIntField(term267908, term267908.getClass(), "clearStatus", 0);
        setIntField(term267908, term267908.getClass(), "techScore", 0);
        setIntField(term267908, term267908.getClass(), "techScoreRank", 0);
        setIntField(term267908, term267908.getClass(), "battleScore", 0);
        setIntField(term267908, term267908.getClass(), "battleScoreRank", 0);
        setIntField(term267908, term267908.getClass(), "platinumScore", 0);
        setIntField(term267908, term267908.getClass(), "maxCombo", 0);
        setIntField(term267908, term267908.getClass(), "judgeMiss", 0);
        setIntField(term267908, term267908.getClass(), "judgeHit", 0);
        setIntField(term267908, term267908.getClass(), "judgeBreak", 0);
        setIntField(term267908, term267908.getClass(), "judgeCriticalBreak", 0);
        setIntField(term267908, term267908.getClass(), "rateTap", 0);
        setIntField(term267908, term267908.getClass(), "rateHold", 0);
        setIntField(term267908, term267908.getClass(), "rateFlick", 0);
        setIntField(term267908, term267908.getClass(), "rateSideTap", 0);
        setIntField(term267908, term267908.getClass(), "rateSideHold", 0);
        setIntField(term267908, term267908.getClass(), "bellCount", 0);
        setIntField(term267908, term267908.getClass(), "totalBellCount", 0);
        setIntField(term267908, term267908.getClass(), "damageCount", 0);
        setIntField(term267908, term267908.getClass(), "overDamage", 0);
        setBooleanField(term267908, term267908.getClass(), "isTechNewRecord", false);
        setBooleanField(term267908, term267908.getClass(), "isBattleNewRecord", false);
        setBooleanField(term267908, term267908.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term267908, term267908.getClass(), "isFullCombo", false);
        setBooleanField(term267908, term267908.getClass(), "isFullBell", false);
        setBooleanField(term267908, term267908.getClass(), "isAllBreak", false);
        setIntField(term267908, term267908.getClass(), "playerRating", 0);
        setIntField(term267908, term267908.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName3", argTypes, term267908, args);
    }

};


