package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserPlaylog_setSortNumber_571905176167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275785;
     Object term275831;

    public UserPlaylog_setSortNumber_571905176167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275785 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term275785, term275785.getClass(), "id", 0L);
        setField(term275785, term275785.getClass(), "user", null);
        setIntField(term275785, term275785.getClass(), "orderId", 0);
        setIntField(term275785, term275785.getClass(), "sortNumber", 0);
        setIntField(term275785, term275785.getClass(), "placeId", 0);
        setField(term275785, term275785.getClass(), "playDate", null);
        setField(term275785, term275785.getClass(), "userPlayDate", null);
        setIntField(term275785, term275785.getClass(), "musicId", 0);
        setIntField(term275785, term275785.getClass(), "level", 0);
        setIntField(term275785, term275785.getClass(), "customId", 0);
        setIntField(term275785, term275785.getClass(), "playedUserId1", 0);
        setIntField(term275785, term275785.getClass(), "playedUserId2", 0);
        setIntField(term275785, term275785.getClass(), "playedUserId3", 0);
        setField(term275785, term275785.getClass(), "playedUserName1", null);
        setField(term275785, term275785.getClass(), "playedUserName2", null);
        setField(term275785, term275785.getClass(), "playedUserName3", null);
        setIntField(term275785, term275785.getClass(), "playedMusicLevel1", 0);
        setIntField(term275785, term275785.getClass(), "playedMusicLevel2", 0);
        setIntField(term275785, term275785.getClass(), "playedMusicLevel3", 0);
        setIntField(term275785, term275785.getClass(), "playedCustom1", 0);
        setIntField(term275785, term275785.getClass(), "playedCustom2", 0);
        setIntField(term275785, term275785.getClass(), "playedCustom3", 0);
        setIntField(term275785, term275785.getClass(), "track", 0);
        setIntField(term275785, term275785.getClass(), "score", 0);
        setIntField(term275785, term275785.getClass(), "rank", 0);
        setIntField(term275785, term275785.getClass(), "maxCombo", 0);
        setIntField(term275785, term275785.getClass(), "maxChain", 0);
        setIntField(term275785, term275785.getClass(), "rateTap", 0);
        setIntField(term275785, term275785.getClass(), "rateHold", 0);
        setIntField(term275785, term275785.getClass(), "rateSlide", 0);
        setIntField(term275785, term275785.getClass(), "rateAir", 0);
        setIntField(term275785, term275785.getClass(), "rateFlick", 0);
        setIntField(term275785, term275785.getClass(), "judgeGuilty", 0);
        setIntField(term275785, term275785.getClass(), "judgeAttack", 0);
        setIntField(term275785, term275785.getClass(), "judgeJustice", 0);
        setIntField(term275785, term275785.getClass(), "judgeCritical", 0);
        setIntField(term275785, term275785.getClass(), "eventId", 0);
        setIntField(term275785, term275785.getClass(), "playerRating", 0);
        setBooleanField(term275785, term275785.getClass(), "isNewRecord", false);
        setBooleanField(term275785, term275785.getClass(), "isFullCombo", false);
        setIntField(term275785, term275785.getClass(), "fullChainKind", 0);
        setBooleanField(term275785, term275785.getClass(), "isAllJustice", false);
        setBooleanField(term275785, term275785.getClass(), "isContinue", false);
        setBooleanField(term275785, term275785.getClass(), "isFreeToPlay", false);
        setIntField(term275785, term275785.getClass(), "characterId", 0);
        setIntField(term275785, term275785.getClass(), "skillId", 0);
        setIntField(term275785, term275785.getClass(), "playKind", 0);
        setBooleanField(term275785, term275785.getClass(), "isClear", false);
        setIntField(term275785, term275785.getClass(), "skillLevel", 0);
        setIntField(term275785, term275785.getClass(), "skillEffect", 0);
        setField(term275785, term275785.getClass(), "placeName", null);
        setBooleanField(term275785, term275785.getClass(), "isMaimai", false);
        term275831 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term275831;
        callMethod(klass, "setSortNumber", argTypes, term275785, args);
    }

};


