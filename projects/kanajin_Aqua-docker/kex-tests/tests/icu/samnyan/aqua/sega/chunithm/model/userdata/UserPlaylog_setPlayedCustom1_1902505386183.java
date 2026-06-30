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

public class UserPlaylog_setPlayedCustom1_1902505386183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276543;
     Object term276589;

    public UserPlaylog_setPlayedCustom1_1902505386183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276543 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term276543, term276543.getClass(), "id", 0L);
        setField(term276543, term276543.getClass(), "user", null);
        setIntField(term276543, term276543.getClass(), "orderId", 0);
        setIntField(term276543, term276543.getClass(), "sortNumber", 0);
        setIntField(term276543, term276543.getClass(), "placeId", 0);
        setField(term276543, term276543.getClass(), "playDate", null);
        setField(term276543, term276543.getClass(), "userPlayDate", null);
        setIntField(term276543, term276543.getClass(), "musicId", 0);
        setIntField(term276543, term276543.getClass(), "level", 0);
        setIntField(term276543, term276543.getClass(), "customId", 0);
        setIntField(term276543, term276543.getClass(), "playedUserId1", 0);
        setIntField(term276543, term276543.getClass(), "playedUserId2", 0);
        setIntField(term276543, term276543.getClass(), "playedUserId3", 0);
        setField(term276543, term276543.getClass(), "playedUserName1", null);
        setField(term276543, term276543.getClass(), "playedUserName2", null);
        setField(term276543, term276543.getClass(), "playedUserName3", null);
        setIntField(term276543, term276543.getClass(), "playedMusicLevel1", 0);
        setIntField(term276543, term276543.getClass(), "playedMusicLevel2", 0);
        setIntField(term276543, term276543.getClass(), "playedMusicLevel3", 0);
        setIntField(term276543, term276543.getClass(), "playedCustom1", 0);
        setIntField(term276543, term276543.getClass(), "playedCustom2", 0);
        setIntField(term276543, term276543.getClass(), "playedCustom3", 0);
        setIntField(term276543, term276543.getClass(), "track", 0);
        setIntField(term276543, term276543.getClass(), "score", 0);
        setIntField(term276543, term276543.getClass(), "rank", 0);
        setIntField(term276543, term276543.getClass(), "maxCombo", 0);
        setIntField(term276543, term276543.getClass(), "maxChain", 0);
        setIntField(term276543, term276543.getClass(), "rateTap", 0);
        setIntField(term276543, term276543.getClass(), "rateHold", 0);
        setIntField(term276543, term276543.getClass(), "rateSlide", 0);
        setIntField(term276543, term276543.getClass(), "rateAir", 0);
        setIntField(term276543, term276543.getClass(), "rateFlick", 0);
        setIntField(term276543, term276543.getClass(), "judgeGuilty", 0);
        setIntField(term276543, term276543.getClass(), "judgeAttack", 0);
        setIntField(term276543, term276543.getClass(), "judgeJustice", 0);
        setIntField(term276543, term276543.getClass(), "judgeCritical", 0);
        setIntField(term276543, term276543.getClass(), "eventId", 0);
        setIntField(term276543, term276543.getClass(), "playerRating", 0);
        setBooleanField(term276543, term276543.getClass(), "isNewRecord", false);
        setBooleanField(term276543, term276543.getClass(), "isFullCombo", false);
        setIntField(term276543, term276543.getClass(), "fullChainKind", 0);
        setBooleanField(term276543, term276543.getClass(), "isAllJustice", false);
        setBooleanField(term276543, term276543.getClass(), "isContinue", false);
        setBooleanField(term276543, term276543.getClass(), "isFreeToPlay", false);
        setIntField(term276543, term276543.getClass(), "characterId", 0);
        setIntField(term276543, term276543.getClass(), "skillId", 0);
        setIntField(term276543, term276543.getClass(), "playKind", 0);
        setBooleanField(term276543, term276543.getClass(), "isClear", false);
        setIntField(term276543, term276543.getClass(), "skillLevel", 0);
        setIntField(term276543, term276543.getClass(), "skillEffect", 0);
        setField(term276543, term276543.getClass(), "placeName", null);
        setBooleanField(term276543, term276543.getClass(), "isMaimai", false);
        term276589 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276589;
        callMethod(klass, "setPlayedCustom1", argTypes, term276543, args);
    }

};


