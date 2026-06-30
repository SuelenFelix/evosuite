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

public class UserPlaylog_setJudgeBreak_609134282235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269331;
     Object term269386;

    public UserPlaylog_setJudgeBreak_609134282235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269331 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term269331, term269331.getClass(), "id", 0L);
        setField(term269331, term269331.getClass(), "user", null);
        setIntField(term269331, term269331.getClass(), "sortNumber", 0);
        setIntField(term269331, term269331.getClass(), "placeId", 0);
        setField(term269331, term269331.getClass(), "placeName", null);
        setField(term269331, term269331.getClass(), "playDate", null);
        setField(term269331, term269331.getClass(), "userPlayDate", null);
        setIntField(term269331, term269331.getClass(), "musicId", 0);
        setIntField(term269331, term269331.getClass(), "level", 0);
        setIntField(term269331, term269331.getClass(), "playKind", 0);
        setIntField(term269331, term269331.getClass(), "eventId", 0);
        setField(term269331, term269331.getClass(), "eventName", null);
        setIntField(term269331, term269331.getClass(), "eventPoint", 0);
        setIntField(term269331, term269331.getClass(), "playedUserId1", 0);
        setIntField(term269331, term269331.getClass(), "playedUserId2", 0);
        setIntField(term269331, term269331.getClass(), "playedUserId3", 0);
        setField(term269331, term269331.getClass(), "playedUserName1", null);
        setField(term269331, term269331.getClass(), "playedUserName2", null);
        setField(term269331, term269331.getClass(), "playedUserName3", null);
        setIntField(term269331, term269331.getClass(), "playedMusicLevel1", 0);
        setIntField(term269331, term269331.getClass(), "playedMusicLevel2", 0);
        setIntField(term269331, term269331.getClass(), "playedMusicLevel3", 0);
        setIntField(term269331, term269331.getClass(), "cardId1", 0);
        setIntField(term269331, term269331.getClass(), "cardId2", 0);
        setIntField(term269331, term269331.getClass(), "cardId3", 0);
        setIntField(term269331, term269331.getClass(), "cardLevel1", 0);
        setIntField(term269331, term269331.getClass(), "cardLevel2", 0);
        setIntField(term269331, term269331.getClass(), "cardLevel3", 0);
        setIntField(term269331, term269331.getClass(), "cardAttack1", 0);
        setIntField(term269331, term269331.getClass(), "cardAttack2", 0);
        setIntField(term269331, term269331.getClass(), "cardAttack3", 0);
        setIntField(term269331, term269331.getClass(), "bossCharaId", 0);
        setIntField(term269331, term269331.getClass(), "bossLevel", 0);
        setIntField(term269331, term269331.getClass(), "bossAttribute", 0);
        setIntField(term269331, term269331.getClass(), "clearStatus", 0);
        setIntField(term269331, term269331.getClass(), "techScore", 0);
        setIntField(term269331, term269331.getClass(), "techScoreRank", 0);
        setIntField(term269331, term269331.getClass(), "battleScore", 0);
        setIntField(term269331, term269331.getClass(), "battleScoreRank", 0);
        setIntField(term269331, term269331.getClass(), "platinumScore", 0);
        setIntField(term269331, term269331.getClass(), "maxCombo", 0);
        setIntField(term269331, term269331.getClass(), "judgeMiss", 0);
        setIntField(term269331, term269331.getClass(), "judgeHit", 0);
        setIntField(term269331, term269331.getClass(), "judgeBreak", 0);
        setIntField(term269331, term269331.getClass(), "judgeCriticalBreak", 0);
        setIntField(term269331, term269331.getClass(), "rateTap", 0);
        setIntField(term269331, term269331.getClass(), "rateHold", 0);
        setIntField(term269331, term269331.getClass(), "rateFlick", 0);
        setIntField(term269331, term269331.getClass(), "rateSideTap", 0);
        setIntField(term269331, term269331.getClass(), "rateSideHold", 0);
        setIntField(term269331, term269331.getClass(), "bellCount", 0);
        setIntField(term269331, term269331.getClass(), "totalBellCount", 0);
        setIntField(term269331, term269331.getClass(), "damageCount", 0);
        setIntField(term269331, term269331.getClass(), "overDamage", 0);
        setBooleanField(term269331, term269331.getClass(), "isTechNewRecord", false);
        setBooleanField(term269331, term269331.getClass(), "isBattleNewRecord", false);
        setBooleanField(term269331, term269331.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term269331, term269331.getClass(), "isFullCombo", false);
        setBooleanField(term269331, term269331.getClass(), "isFullBell", false);
        setBooleanField(term269331, term269331.getClass(), "isAllBreak", false);
        setIntField(term269331, term269331.getClass(), "playerRating", 0);
        setIntField(term269331, term269331.getClass(), "battlePoint", 0);
        term269386 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term269386;
        callMethod(klass, "setJudgeBreak", argTypes, term269331, args);
    }

};


