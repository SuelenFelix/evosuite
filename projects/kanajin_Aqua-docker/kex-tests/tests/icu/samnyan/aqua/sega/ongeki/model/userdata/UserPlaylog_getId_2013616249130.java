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

public class UserPlaylog_getId_2013616249130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263486;

    public UserPlaylog_getId_2013616249130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263486 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        setLongField(term263486, term263486.getClass(), "id", 0L);
        setField(term263486, term263486.getClass(), "user", null);
        setIntField(term263486, term263486.getClass(), "sortNumber", 0);
        setIntField(term263486, term263486.getClass(), "placeId", 0);
        setField(term263486, term263486.getClass(), "placeName", null);
        setField(term263486, term263486.getClass(), "playDate", null);
        setField(term263486, term263486.getClass(), "userPlayDate", null);
        setIntField(term263486, term263486.getClass(), "musicId", 0);
        setIntField(term263486, term263486.getClass(), "level", 0);
        setIntField(term263486, term263486.getClass(), "playKind", 0);
        setIntField(term263486, term263486.getClass(), "eventId", 0);
        setField(term263486, term263486.getClass(), "eventName", null);
        setIntField(term263486, term263486.getClass(), "eventPoint", 0);
        setIntField(term263486, term263486.getClass(), "playedUserId1", 0);
        setIntField(term263486, term263486.getClass(), "playedUserId2", 0);
        setIntField(term263486, term263486.getClass(), "playedUserId3", 0);
        setField(term263486, term263486.getClass(), "playedUserName1", null);
        setField(term263486, term263486.getClass(), "playedUserName2", null);
        setField(term263486, term263486.getClass(), "playedUserName3", null);
        setIntField(term263486, term263486.getClass(), "playedMusicLevel1", 0);
        setIntField(term263486, term263486.getClass(), "playedMusicLevel2", 0);
        setIntField(term263486, term263486.getClass(), "playedMusicLevel3", 0);
        setIntField(term263486, term263486.getClass(), "cardId1", 0);
        setIntField(term263486, term263486.getClass(), "cardId2", 0);
        setIntField(term263486, term263486.getClass(), "cardId3", 0);
        setIntField(term263486, term263486.getClass(), "cardLevel1", 0);
        setIntField(term263486, term263486.getClass(), "cardLevel2", 0);
        setIntField(term263486, term263486.getClass(), "cardLevel3", 0);
        setIntField(term263486, term263486.getClass(), "cardAttack1", 0);
        setIntField(term263486, term263486.getClass(), "cardAttack2", 0);
        setIntField(term263486, term263486.getClass(), "cardAttack3", 0);
        setIntField(term263486, term263486.getClass(), "bossCharaId", 0);
        setIntField(term263486, term263486.getClass(), "bossLevel", 0);
        setIntField(term263486, term263486.getClass(), "bossAttribute", 0);
        setIntField(term263486, term263486.getClass(), "clearStatus", 0);
        setIntField(term263486, term263486.getClass(), "techScore", 0);
        setIntField(term263486, term263486.getClass(), "techScoreRank", 0);
        setIntField(term263486, term263486.getClass(), "battleScore", 0);
        setIntField(term263486, term263486.getClass(), "battleScoreRank", 0);
        setIntField(term263486, term263486.getClass(), "platinumScore", 0);
        setIntField(term263486, term263486.getClass(), "maxCombo", 0);
        setIntField(term263486, term263486.getClass(), "judgeMiss", 0);
        setIntField(term263486, term263486.getClass(), "judgeHit", 0);
        setIntField(term263486, term263486.getClass(), "judgeBreak", 0);
        setIntField(term263486, term263486.getClass(), "judgeCriticalBreak", 0);
        setIntField(term263486, term263486.getClass(), "rateTap", 0);
        setIntField(term263486, term263486.getClass(), "rateHold", 0);
        setIntField(term263486, term263486.getClass(), "rateFlick", 0);
        setIntField(term263486, term263486.getClass(), "rateSideTap", 0);
        setIntField(term263486, term263486.getClass(), "rateSideHold", 0);
        setIntField(term263486, term263486.getClass(), "bellCount", 0);
        setIntField(term263486, term263486.getClass(), "totalBellCount", 0);
        setIntField(term263486, term263486.getClass(), "damageCount", 0);
        setIntField(term263486, term263486.getClass(), "overDamage", 0);
        setBooleanField(term263486, term263486.getClass(), "isTechNewRecord", false);
        setBooleanField(term263486, term263486.getClass(), "isBattleNewRecord", false);
        setBooleanField(term263486, term263486.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term263486, term263486.getClass(), "isFullCombo", false);
        setBooleanField(term263486, term263486.getClass(), "isFullBell", false);
        setBooleanField(term263486, term263486.getClass(), "isAllBreak", false);
        setIntField(term263486, term263486.getClass(), "playerRating", 0);
        setIntField(term263486, term263486.getClass(), "battlePoint", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term263486, args);
    }

};


