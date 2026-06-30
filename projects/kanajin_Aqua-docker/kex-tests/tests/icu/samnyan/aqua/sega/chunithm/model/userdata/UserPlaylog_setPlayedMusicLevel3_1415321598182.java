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

public class UserPlaylog_setPlayedMusicLevel3_1415321598182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276495;
     Object term276541;

    public UserPlaylog_setPlayedMusicLevel3_1415321598182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276495 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term276495, term276495.getClass(), "id", 0L);
        setField(term276495, term276495.getClass(), "user", null);
        setIntField(term276495, term276495.getClass(), "orderId", 0);
        setIntField(term276495, term276495.getClass(), "sortNumber", 0);
        setIntField(term276495, term276495.getClass(), "placeId", 0);
        setField(term276495, term276495.getClass(), "playDate", null);
        setField(term276495, term276495.getClass(), "userPlayDate", null);
        setIntField(term276495, term276495.getClass(), "musicId", 0);
        setIntField(term276495, term276495.getClass(), "level", 0);
        setIntField(term276495, term276495.getClass(), "customId", 0);
        setIntField(term276495, term276495.getClass(), "playedUserId1", 0);
        setIntField(term276495, term276495.getClass(), "playedUserId2", 0);
        setIntField(term276495, term276495.getClass(), "playedUserId3", 0);
        setField(term276495, term276495.getClass(), "playedUserName1", null);
        setField(term276495, term276495.getClass(), "playedUserName2", null);
        setField(term276495, term276495.getClass(), "playedUserName3", null);
        setIntField(term276495, term276495.getClass(), "playedMusicLevel1", 0);
        setIntField(term276495, term276495.getClass(), "playedMusicLevel2", 0);
        setIntField(term276495, term276495.getClass(), "playedMusicLevel3", 0);
        setIntField(term276495, term276495.getClass(), "playedCustom1", 0);
        setIntField(term276495, term276495.getClass(), "playedCustom2", 0);
        setIntField(term276495, term276495.getClass(), "playedCustom3", 0);
        setIntField(term276495, term276495.getClass(), "track", 0);
        setIntField(term276495, term276495.getClass(), "score", 0);
        setIntField(term276495, term276495.getClass(), "rank", 0);
        setIntField(term276495, term276495.getClass(), "maxCombo", 0);
        setIntField(term276495, term276495.getClass(), "maxChain", 0);
        setIntField(term276495, term276495.getClass(), "rateTap", 0);
        setIntField(term276495, term276495.getClass(), "rateHold", 0);
        setIntField(term276495, term276495.getClass(), "rateSlide", 0);
        setIntField(term276495, term276495.getClass(), "rateAir", 0);
        setIntField(term276495, term276495.getClass(), "rateFlick", 0);
        setIntField(term276495, term276495.getClass(), "judgeGuilty", 0);
        setIntField(term276495, term276495.getClass(), "judgeAttack", 0);
        setIntField(term276495, term276495.getClass(), "judgeJustice", 0);
        setIntField(term276495, term276495.getClass(), "judgeCritical", 0);
        setIntField(term276495, term276495.getClass(), "eventId", 0);
        setIntField(term276495, term276495.getClass(), "playerRating", 0);
        setBooleanField(term276495, term276495.getClass(), "isNewRecord", false);
        setBooleanField(term276495, term276495.getClass(), "isFullCombo", false);
        setIntField(term276495, term276495.getClass(), "fullChainKind", 0);
        setBooleanField(term276495, term276495.getClass(), "isAllJustice", false);
        setBooleanField(term276495, term276495.getClass(), "isContinue", false);
        setBooleanField(term276495, term276495.getClass(), "isFreeToPlay", false);
        setIntField(term276495, term276495.getClass(), "characterId", 0);
        setIntField(term276495, term276495.getClass(), "skillId", 0);
        setIntField(term276495, term276495.getClass(), "playKind", 0);
        setBooleanField(term276495, term276495.getClass(), "isClear", false);
        setIntField(term276495, term276495.getClass(), "skillLevel", 0);
        setIntField(term276495, term276495.getClass(), "skillEffect", 0);
        setField(term276495, term276495.getClass(), "placeName", null);
        setBooleanField(term276495, term276495.getClass(), "isMaimai", false);
        term276541 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276541;
        callMethod(klass, "setPlayedMusicLevel3", argTypes, term276495, args);
    }

};


