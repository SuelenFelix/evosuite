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

public class UserPlaylog_setUser_1643613896193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266953;

    public UserPlaylog_setUser_1643613896193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266953 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term266953, term266953.getClass(), "id", 0L);
        setField(term266953, term266953.getClass(), "user", null);
        setIntField(term266953, term266953.getClass(), "sortNumber", 0);
        setIntField(term266953, term266953.getClass(), "placeId", 0);
        setField(term266953, term266953.getClass(), "placeName", null);
        setField(term266953, term266953.getClass(), "playDate", null);
        setField(term266953, term266953.getClass(), "userPlayDate", null);
        setIntField(term266953, term266953.getClass(), "musicId", 0);
        setIntField(term266953, term266953.getClass(), "level", 0);
        setIntField(term266953, term266953.getClass(), "playKind", 0);
        setIntField(term266953, term266953.getClass(), "eventId", 0);
        setField(term266953, term266953.getClass(), "eventName", null);
        setIntField(term266953, term266953.getClass(), "eventPoint", 0);
        setIntField(term266953, term266953.getClass(), "playedUserId1", 0);
        setIntField(term266953, term266953.getClass(), "playedUserId2", 0);
        setIntField(term266953, term266953.getClass(), "playedUserId3", 0);
        setField(term266953, term266953.getClass(), "playedUserName1", null);
        setField(term266953, term266953.getClass(), "playedUserName2", null);
        setField(term266953, term266953.getClass(), "playedUserName3", null);
        setIntField(term266953, term266953.getClass(), "playedMusicLevel1", 0);
        setIntField(term266953, term266953.getClass(), "playedMusicLevel2", 0);
        setIntField(term266953, term266953.getClass(), "playedMusicLevel3", 0);
        setIntField(term266953, term266953.getClass(), "cardId1", 0);
        setIntField(term266953, term266953.getClass(), "cardId2", 0);
        setIntField(term266953, term266953.getClass(), "cardId3", 0);
        setIntField(term266953, term266953.getClass(), "cardLevel1", 0);
        setIntField(term266953, term266953.getClass(), "cardLevel2", 0);
        setIntField(term266953, term266953.getClass(), "cardLevel3", 0);
        setIntField(term266953, term266953.getClass(), "cardAttack1", 0);
        setIntField(term266953, term266953.getClass(), "cardAttack2", 0);
        setIntField(term266953, term266953.getClass(), "cardAttack3", 0);
        setIntField(term266953, term266953.getClass(), "bossCharaId", 0);
        setIntField(term266953, term266953.getClass(), "bossLevel", 0);
        setIntField(term266953, term266953.getClass(), "bossAttribute", 0);
        setIntField(term266953, term266953.getClass(), "clearStatus", 0);
        setIntField(term266953, term266953.getClass(), "techScore", 0);
        setIntField(term266953, term266953.getClass(), "techScoreRank", 0);
        setIntField(term266953, term266953.getClass(), "battleScore", 0);
        setIntField(term266953, term266953.getClass(), "battleScoreRank", 0);
        setIntField(term266953, term266953.getClass(), "platinumScore", 0);
        setIntField(term266953, term266953.getClass(), "maxCombo", 0);
        setIntField(term266953, term266953.getClass(), "judgeMiss", 0);
        setIntField(term266953, term266953.getClass(), "judgeHit", 0);
        setIntField(term266953, term266953.getClass(), "judgeBreak", 0);
        setIntField(term266953, term266953.getClass(), "judgeCriticalBreak", 0);
        setIntField(term266953, term266953.getClass(), "rateTap", 0);
        setIntField(term266953, term266953.getClass(), "rateHold", 0);
        setIntField(term266953, term266953.getClass(), "rateFlick", 0);
        setIntField(term266953, term266953.getClass(), "rateSideTap", 0);
        setIntField(term266953, term266953.getClass(), "rateSideHold", 0);
        setIntField(term266953, term266953.getClass(), "bellCount", 0);
        setIntField(term266953, term266953.getClass(), "totalBellCount", 0);
        setIntField(term266953, term266953.getClass(), "damageCount", 0);
        setIntField(term266953, term266953.getClass(), "overDamage", 0);
        setBooleanField(term266953, term266953.getClass(), "isTechNewRecord", false);
        setBooleanField(term266953, term266953.getClass(), "isBattleNewRecord", false);
        setBooleanField(term266953, term266953.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term266953, term266953.getClass(), "isFullCombo", false);
        setBooleanField(term266953, term266953.getClass(), "isFullBell", false);
        setBooleanField(term266953, term266953.getClass(), "isAllBreak", false);
        setIntField(term266953, term266953.getClass(), "playerRating", 0);
        setIntField(term266953, term266953.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term266953, args);
    }

};


