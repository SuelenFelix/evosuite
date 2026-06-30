package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserPlaylog_setPlayedMusicLevel1_1206240386190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461776;
     Object term461824;

    public UserPlaylog_setPlayedMusicLevel1_1206240386190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461776 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term461776, term461776.getClass(), "id", 0L);
        setField(term461776, term461776.getClass(), "user", null);
        setField(term461776, term461776.getClass(), "romVersion", null);
        setIntField(term461776, term461776.getClass(), "orderId", 0);
        setIntField(term461776, term461776.getClass(), "sortNumber", 0);
        setIntField(term461776, term461776.getClass(), "placeId", 0);
        setField(term461776, term461776.getClass(), "playDate", null);
        setField(term461776, term461776.getClass(), "userPlayDate", null);
        setIntField(term461776, term461776.getClass(), "musicId", 0);
        setIntField(term461776, term461776.getClass(), "level", 0);
        setIntField(term461776, term461776.getClass(), "customId", 0);
        setIntField(term461776, term461776.getClass(), "playedUserId1", 0);
        setIntField(term461776, term461776.getClass(), "playedUserId2", 0);
        setIntField(term461776, term461776.getClass(), "playedUserId3", 0);
        setField(term461776, term461776.getClass(), "playedUserName1", null);
        setField(term461776, term461776.getClass(), "playedUserName2", null);
        setField(term461776, term461776.getClass(), "playedUserName3", null);
        setIntField(term461776, term461776.getClass(), "playedMusicLevel1", 0);
        setIntField(term461776, term461776.getClass(), "playedMusicLevel2", 0);
        setIntField(term461776, term461776.getClass(), "playedMusicLevel3", 0);
        setIntField(term461776, term461776.getClass(), "playedCustom1", 0);
        setIntField(term461776, term461776.getClass(), "playedCustom2", 0);
        setIntField(term461776, term461776.getClass(), "playedCustom3", 0);
        setIntField(term461776, term461776.getClass(), "track", 0);
        setIntField(term461776, term461776.getClass(), "score", 0);
        setIntField(term461776, term461776.getClass(), "rank", 0);
        setIntField(term461776, term461776.getClass(), "maxCombo", 0);
        setIntField(term461776, term461776.getClass(), "maxChain", 0);
        setIntField(term461776, term461776.getClass(), "rateTap", 0);
        setIntField(term461776, term461776.getClass(), "rateHold", 0);
        setIntField(term461776, term461776.getClass(), "rateSlide", 0);
        setIntField(term461776, term461776.getClass(), "rateAir", 0);
        setIntField(term461776, term461776.getClass(), "rateFlick", 0);
        setIntField(term461776, term461776.getClass(), "judgeGuilty", 0);
        setIntField(term461776, term461776.getClass(), "judgeAttack", 0);
        setIntField(term461776, term461776.getClass(), "judgeJustice", 0);
        setIntField(term461776, term461776.getClass(), "judgeCritical", 0);
        setIntField(term461776, term461776.getClass(), "judgeHeaven", 0);
        setIntField(term461776, term461776.getClass(), "eventId", 0);
        setIntField(term461776, term461776.getClass(), "playerRating", 0);
        setBooleanField(term461776, term461776.getClass(), "isNewRecord", false);
        setBooleanField(term461776, term461776.getClass(), "isFullCombo", false);
        setIntField(term461776, term461776.getClass(), "fullChainKind", 0);
        setBooleanField(term461776, term461776.getClass(), "isAllJustice", false);
        setBooleanField(term461776, term461776.getClass(), "isContinue", false);
        setBooleanField(term461776, term461776.getClass(), "isFreeToPlay", false);
        setIntField(term461776, term461776.getClass(), "characterId", 0);
        setIntField(term461776, term461776.getClass(), "charaIllustId", 0);
        setIntField(term461776, term461776.getClass(), "skillId", 0);
        setIntField(term461776, term461776.getClass(), "playKind", 0);
        setBooleanField(term461776, term461776.getClass(), "isClear", false);
        setIntField(term461776, term461776.getClass(), "skillLevel", 0);
        setIntField(term461776, term461776.getClass(), "skillEffect", 0);
        setField(term461776, term461776.getClass(), "placeName", null);
        setIntField(term461776, term461776.getClass(), "commonId", 0);
        term461824 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term461824;
        callMethod(klass, "setPlayedMusicLevel1", argTypes, term461776, args);
    }

};


