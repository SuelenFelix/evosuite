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

public class UserPlaylog_setJudgeHit_534699402234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269274;
     Object term269329;

    public UserPlaylog_setJudgeHit_534699402234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269274 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term269274, term269274.getClass(), "id", 0L);
        setField(term269274, term269274.getClass(), "user", null);
        setIntField(term269274, term269274.getClass(), "sortNumber", 0);
        setIntField(term269274, term269274.getClass(), "placeId", 0);
        setField(term269274, term269274.getClass(), "placeName", null);
        setField(term269274, term269274.getClass(), "playDate", null);
        setField(term269274, term269274.getClass(), "userPlayDate", null);
        setIntField(term269274, term269274.getClass(), "musicId", 0);
        setIntField(term269274, term269274.getClass(), "level", 0);
        setIntField(term269274, term269274.getClass(), "playKind", 0);
        setIntField(term269274, term269274.getClass(), "eventId", 0);
        setField(term269274, term269274.getClass(), "eventName", null);
        setIntField(term269274, term269274.getClass(), "eventPoint", 0);
        setIntField(term269274, term269274.getClass(), "playedUserId1", 0);
        setIntField(term269274, term269274.getClass(), "playedUserId2", 0);
        setIntField(term269274, term269274.getClass(), "playedUserId3", 0);
        setField(term269274, term269274.getClass(), "playedUserName1", null);
        setField(term269274, term269274.getClass(), "playedUserName2", null);
        setField(term269274, term269274.getClass(), "playedUserName3", null);
        setIntField(term269274, term269274.getClass(), "playedMusicLevel1", 0);
        setIntField(term269274, term269274.getClass(), "playedMusicLevel2", 0);
        setIntField(term269274, term269274.getClass(), "playedMusicLevel3", 0);
        setIntField(term269274, term269274.getClass(), "cardId1", 0);
        setIntField(term269274, term269274.getClass(), "cardId2", 0);
        setIntField(term269274, term269274.getClass(), "cardId3", 0);
        setIntField(term269274, term269274.getClass(), "cardLevel1", 0);
        setIntField(term269274, term269274.getClass(), "cardLevel2", 0);
        setIntField(term269274, term269274.getClass(), "cardLevel3", 0);
        setIntField(term269274, term269274.getClass(), "cardAttack1", 0);
        setIntField(term269274, term269274.getClass(), "cardAttack2", 0);
        setIntField(term269274, term269274.getClass(), "cardAttack3", 0);
        setIntField(term269274, term269274.getClass(), "bossCharaId", 0);
        setIntField(term269274, term269274.getClass(), "bossLevel", 0);
        setIntField(term269274, term269274.getClass(), "bossAttribute", 0);
        setIntField(term269274, term269274.getClass(), "clearStatus", 0);
        setIntField(term269274, term269274.getClass(), "techScore", 0);
        setIntField(term269274, term269274.getClass(), "techScoreRank", 0);
        setIntField(term269274, term269274.getClass(), "battleScore", 0);
        setIntField(term269274, term269274.getClass(), "battleScoreRank", 0);
        setIntField(term269274, term269274.getClass(), "platinumScore", 0);
        setIntField(term269274, term269274.getClass(), "maxCombo", 0);
        setIntField(term269274, term269274.getClass(), "judgeMiss", 0);
        setIntField(term269274, term269274.getClass(), "judgeHit", 0);
        setIntField(term269274, term269274.getClass(), "judgeBreak", 0);
        setIntField(term269274, term269274.getClass(), "judgeCriticalBreak", 0);
        setIntField(term269274, term269274.getClass(), "rateTap", 0);
        setIntField(term269274, term269274.getClass(), "rateHold", 0);
        setIntField(term269274, term269274.getClass(), "rateFlick", 0);
        setIntField(term269274, term269274.getClass(), "rateSideTap", 0);
        setIntField(term269274, term269274.getClass(), "rateSideHold", 0);
        setIntField(term269274, term269274.getClass(), "bellCount", 0);
        setIntField(term269274, term269274.getClass(), "totalBellCount", 0);
        setIntField(term269274, term269274.getClass(), "damageCount", 0);
        setIntField(term269274, term269274.getClass(), "overDamage", 0);
        setBooleanField(term269274, term269274.getClass(), "isTechNewRecord", false);
        setBooleanField(term269274, term269274.getClass(), "isBattleNewRecord", false);
        setBooleanField(term269274, term269274.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term269274, term269274.getClass(), "isFullCombo", false);
        setBooleanField(term269274, term269274.getClass(), "isFullBell", false);
        setBooleanField(term269274, term269274.getClass(), "isAllBreak", false);
        setIntField(term269274, term269274.getClass(), "playerRating", 0);
        setIntField(term269274, term269274.getClass(), "battlePoint", 0);
        term269329 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term269329;
        callMethod(klass, "setJudgeHit", argTypes, term269274, args);
    }

};


