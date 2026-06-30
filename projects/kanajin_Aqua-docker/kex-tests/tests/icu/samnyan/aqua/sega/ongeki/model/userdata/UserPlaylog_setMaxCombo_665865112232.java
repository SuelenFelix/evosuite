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

public class UserPlaylog_setMaxCombo_665865112232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269160;
     Object term269215;

    public UserPlaylog_setMaxCombo_665865112232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269160 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term269160, term269160.getClass(), "id", 0L);
        setField(term269160, term269160.getClass(), "user", null);
        setIntField(term269160, term269160.getClass(), "sortNumber", 0);
        setIntField(term269160, term269160.getClass(), "placeId", 0);
        setField(term269160, term269160.getClass(), "placeName", null);
        setField(term269160, term269160.getClass(), "playDate", null);
        setField(term269160, term269160.getClass(), "userPlayDate", null);
        setIntField(term269160, term269160.getClass(), "musicId", 0);
        setIntField(term269160, term269160.getClass(), "level", 0);
        setIntField(term269160, term269160.getClass(), "playKind", 0);
        setIntField(term269160, term269160.getClass(), "eventId", 0);
        setField(term269160, term269160.getClass(), "eventName", null);
        setIntField(term269160, term269160.getClass(), "eventPoint", 0);
        setIntField(term269160, term269160.getClass(), "playedUserId1", 0);
        setIntField(term269160, term269160.getClass(), "playedUserId2", 0);
        setIntField(term269160, term269160.getClass(), "playedUserId3", 0);
        setField(term269160, term269160.getClass(), "playedUserName1", null);
        setField(term269160, term269160.getClass(), "playedUserName2", null);
        setField(term269160, term269160.getClass(), "playedUserName3", null);
        setIntField(term269160, term269160.getClass(), "playedMusicLevel1", 0);
        setIntField(term269160, term269160.getClass(), "playedMusicLevel2", 0);
        setIntField(term269160, term269160.getClass(), "playedMusicLevel3", 0);
        setIntField(term269160, term269160.getClass(), "cardId1", 0);
        setIntField(term269160, term269160.getClass(), "cardId2", 0);
        setIntField(term269160, term269160.getClass(), "cardId3", 0);
        setIntField(term269160, term269160.getClass(), "cardLevel1", 0);
        setIntField(term269160, term269160.getClass(), "cardLevel2", 0);
        setIntField(term269160, term269160.getClass(), "cardLevel3", 0);
        setIntField(term269160, term269160.getClass(), "cardAttack1", 0);
        setIntField(term269160, term269160.getClass(), "cardAttack2", 0);
        setIntField(term269160, term269160.getClass(), "cardAttack3", 0);
        setIntField(term269160, term269160.getClass(), "bossCharaId", 0);
        setIntField(term269160, term269160.getClass(), "bossLevel", 0);
        setIntField(term269160, term269160.getClass(), "bossAttribute", 0);
        setIntField(term269160, term269160.getClass(), "clearStatus", 0);
        setIntField(term269160, term269160.getClass(), "techScore", 0);
        setIntField(term269160, term269160.getClass(), "techScoreRank", 0);
        setIntField(term269160, term269160.getClass(), "battleScore", 0);
        setIntField(term269160, term269160.getClass(), "battleScoreRank", 0);
        setIntField(term269160, term269160.getClass(), "platinumScore", 0);
        setIntField(term269160, term269160.getClass(), "maxCombo", 0);
        setIntField(term269160, term269160.getClass(), "judgeMiss", 0);
        setIntField(term269160, term269160.getClass(), "judgeHit", 0);
        setIntField(term269160, term269160.getClass(), "judgeBreak", 0);
        setIntField(term269160, term269160.getClass(), "judgeCriticalBreak", 0);
        setIntField(term269160, term269160.getClass(), "rateTap", 0);
        setIntField(term269160, term269160.getClass(), "rateHold", 0);
        setIntField(term269160, term269160.getClass(), "rateFlick", 0);
        setIntField(term269160, term269160.getClass(), "rateSideTap", 0);
        setIntField(term269160, term269160.getClass(), "rateSideHold", 0);
        setIntField(term269160, term269160.getClass(), "bellCount", 0);
        setIntField(term269160, term269160.getClass(), "totalBellCount", 0);
        setIntField(term269160, term269160.getClass(), "damageCount", 0);
        setIntField(term269160, term269160.getClass(), "overDamage", 0);
        setBooleanField(term269160, term269160.getClass(), "isTechNewRecord", false);
        setBooleanField(term269160, term269160.getClass(), "isBattleNewRecord", false);
        setBooleanField(term269160, term269160.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term269160, term269160.getClass(), "isFullCombo", false);
        setBooleanField(term269160, term269160.getClass(), "isFullBell", false);
        setBooleanField(term269160, term269160.getClass(), "isAllBreak", false);
        setIntField(term269160, term269160.getClass(), "playerRating", 0);
        setIntField(term269160, term269160.getClass(), "battlePoint", 0);
        term269215 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term269215;
        callMethod(klass, "setMaxCombo", argTypes, term269160, args);
    }

};


