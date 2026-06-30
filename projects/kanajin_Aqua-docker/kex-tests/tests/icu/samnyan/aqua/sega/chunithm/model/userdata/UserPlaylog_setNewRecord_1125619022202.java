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
import java.lang.Boolean;

public class UserPlaylog_setNewRecord_1125619022202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277455;
     Object term277501;

    public UserPlaylog_setNewRecord_1125619022202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277455 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term277455, term277455.getClass(), "id", 0L);
        setField(term277455, term277455.getClass(), "user", null);
        setIntField(term277455, term277455.getClass(), "orderId", 0);
        setIntField(term277455, term277455.getClass(), "sortNumber", 0);
        setIntField(term277455, term277455.getClass(), "placeId", 0);
        setField(term277455, term277455.getClass(), "playDate", null);
        setField(term277455, term277455.getClass(), "userPlayDate", null);
        setIntField(term277455, term277455.getClass(), "musicId", 0);
        setIntField(term277455, term277455.getClass(), "level", 0);
        setIntField(term277455, term277455.getClass(), "customId", 0);
        setIntField(term277455, term277455.getClass(), "playedUserId1", 0);
        setIntField(term277455, term277455.getClass(), "playedUserId2", 0);
        setIntField(term277455, term277455.getClass(), "playedUserId3", 0);
        setField(term277455, term277455.getClass(), "playedUserName1", null);
        setField(term277455, term277455.getClass(), "playedUserName2", null);
        setField(term277455, term277455.getClass(), "playedUserName3", null);
        setIntField(term277455, term277455.getClass(), "playedMusicLevel1", 0);
        setIntField(term277455, term277455.getClass(), "playedMusicLevel2", 0);
        setIntField(term277455, term277455.getClass(), "playedMusicLevel3", 0);
        setIntField(term277455, term277455.getClass(), "playedCustom1", 0);
        setIntField(term277455, term277455.getClass(), "playedCustom2", 0);
        setIntField(term277455, term277455.getClass(), "playedCustom3", 0);
        setIntField(term277455, term277455.getClass(), "track", 0);
        setIntField(term277455, term277455.getClass(), "score", 0);
        setIntField(term277455, term277455.getClass(), "rank", 0);
        setIntField(term277455, term277455.getClass(), "maxCombo", 0);
        setIntField(term277455, term277455.getClass(), "maxChain", 0);
        setIntField(term277455, term277455.getClass(), "rateTap", 0);
        setIntField(term277455, term277455.getClass(), "rateHold", 0);
        setIntField(term277455, term277455.getClass(), "rateSlide", 0);
        setIntField(term277455, term277455.getClass(), "rateAir", 0);
        setIntField(term277455, term277455.getClass(), "rateFlick", 0);
        setIntField(term277455, term277455.getClass(), "judgeGuilty", 0);
        setIntField(term277455, term277455.getClass(), "judgeAttack", 0);
        setIntField(term277455, term277455.getClass(), "judgeJustice", 0);
        setIntField(term277455, term277455.getClass(), "judgeCritical", 0);
        setIntField(term277455, term277455.getClass(), "eventId", 0);
        setIntField(term277455, term277455.getClass(), "playerRating", 0);
        setBooleanField(term277455, term277455.getClass(), "isNewRecord", false);
        setBooleanField(term277455, term277455.getClass(), "isFullCombo", false);
        setIntField(term277455, term277455.getClass(), "fullChainKind", 0);
        setBooleanField(term277455, term277455.getClass(), "isAllJustice", false);
        setBooleanField(term277455, term277455.getClass(), "isContinue", false);
        setBooleanField(term277455, term277455.getClass(), "isFreeToPlay", false);
        setIntField(term277455, term277455.getClass(), "characterId", 0);
        setIntField(term277455, term277455.getClass(), "skillId", 0);
        setIntField(term277455, term277455.getClass(), "playKind", 0);
        setBooleanField(term277455, term277455.getClass(), "isClear", false);
        setIntField(term277455, term277455.getClass(), "skillLevel", 0);
        setIntField(term277455, term277455.getClass(), "skillEffect", 0);
        setField(term277455, term277455.getClass(), "placeName", null);
        setBooleanField(term277455, term277455.getClass(), "isMaimai", false);
        term277501 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term277501;
        callMethod(klass, "setNewRecord", argTypes, term277455, args);
    }

};


