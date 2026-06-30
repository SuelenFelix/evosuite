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

public class UserPlaylog_setPlayedMusicLevel2_695641258212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268020;
     Object term268075;

    public UserPlaylog_setPlayedMusicLevel2_695641258212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268020 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term268020, term268020.getClass(), "id", 0L);
        setField(term268020, term268020.getClass(), "user", null);
        setIntField(term268020, term268020.getClass(), "sortNumber", 0);
        setIntField(term268020, term268020.getClass(), "placeId", 0);
        setField(term268020, term268020.getClass(), "placeName", null);
        setField(term268020, term268020.getClass(), "playDate", null);
        setField(term268020, term268020.getClass(), "userPlayDate", null);
        setIntField(term268020, term268020.getClass(), "musicId", 0);
        setIntField(term268020, term268020.getClass(), "level", 0);
        setIntField(term268020, term268020.getClass(), "playKind", 0);
        setIntField(term268020, term268020.getClass(), "eventId", 0);
        setField(term268020, term268020.getClass(), "eventName", null);
        setIntField(term268020, term268020.getClass(), "eventPoint", 0);
        setIntField(term268020, term268020.getClass(), "playedUserId1", 0);
        setIntField(term268020, term268020.getClass(), "playedUserId2", 0);
        setIntField(term268020, term268020.getClass(), "playedUserId3", 0);
        setField(term268020, term268020.getClass(), "playedUserName1", null);
        setField(term268020, term268020.getClass(), "playedUserName2", null);
        setField(term268020, term268020.getClass(), "playedUserName3", null);
        setIntField(term268020, term268020.getClass(), "playedMusicLevel1", 0);
        setIntField(term268020, term268020.getClass(), "playedMusicLevel2", 0);
        setIntField(term268020, term268020.getClass(), "playedMusicLevel3", 0);
        setIntField(term268020, term268020.getClass(), "cardId1", 0);
        setIntField(term268020, term268020.getClass(), "cardId2", 0);
        setIntField(term268020, term268020.getClass(), "cardId3", 0);
        setIntField(term268020, term268020.getClass(), "cardLevel1", 0);
        setIntField(term268020, term268020.getClass(), "cardLevel2", 0);
        setIntField(term268020, term268020.getClass(), "cardLevel3", 0);
        setIntField(term268020, term268020.getClass(), "cardAttack1", 0);
        setIntField(term268020, term268020.getClass(), "cardAttack2", 0);
        setIntField(term268020, term268020.getClass(), "cardAttack3", 0);
        setIntField(term268020, term268020.getClass(), "bossCharaId", 0);
        setIntField(term268020, term268020.getClass(), "bossLevel", 0);
        setIntField(term268020, term268020.getClass(), "bossAttribute", 0);
        setIntField(term268020, term268020.getClass(), "clearStatus", 0);
        setIntField(term268020, term268020.getClass(), "techScore", 0);
        setIntField(term268020, term268020.getClass(), "techScoreRank", 0);
        setIntField(term268020, term268020.getClass(), "battleScore", 0);
        setIntField(term268020, term268020.getClass(), "battleScoreRank", 0);
        setIntField(term268020, term268020.getClass(), "platinumScore", 0);
        setIntField(term268020, term268020.getClass(), "maxCombo", 0);
        setIntField(term268020, term268020.getClass(), "judgeMiss", 0);
        setIntField(term268020, term268020.getClass(), "judgeHit", 0);
        setIntField(term268020, term268020.getClass(), "judgeBreak", 0);
        setIntField(term268020, term268020.getClass(), "judgeCriticalBreak", 0);
        setIntField(term268020, term268020.getClass(), "rateTap", 0);
        setIntField(term268020, term268020.getClass(), "rateHold", 0);
        setIntField(term268020, term268020.getClass(), "rateFlick", 0);
        setIntField(term268020, term268020.getClass(), "rateSideTap", 0);
        setIntField(term268020, term268020.getClass(), "rateSideHold", 0);
        setIntField(term268020, term268020.getClass(), "bellCount", 0);
        setIntField(term268020, term268020.getClass(), "totalBellCount", 0);
        setIntField(term268020, term268020.getClass(), "damageCount", 0);
        setIntField(term268020, term268020.getClass(), "overDamage", 0);
        setBooleanField(term268020, term268020.getClass(), "isTechNewRecord", false);
        setBooleanField(term268020, term268020.getClass(), "isBattleNewRecord", false);
        setBooleanField(term268020, term268020.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term268020, term268020.getClass(), "isFullCombo", false);
        setBooleanField(term268020, term268020.getClass(), "isFullBell", false);
        setBooleanField(term268020, term268020.getClass(), "isAllBreak", false);
        setIntField(term268020, term268020.getClass(), "playerRating", 0);
        setIntField(term268020, term268020.getClass(), "battlePoint", 0);
        term268075 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268075;
        callMethod(klass, "setPlayedMusicLevel2", argTypes, term268020, args);
    }

};


