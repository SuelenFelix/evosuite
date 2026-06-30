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

public class UserPlaylog_setContinue_359369176206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277647;
     Object term277693;

    public UserPlaylog_setContinue_359369176206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277647 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term277647, term277647.getClass(), "id", 0L);
        setField(term277647, term277647.getClass(), "user", null);
        setIntField(term277647, term277647.getClass(), "orderId", 0);
        setIntField(term277647, term277647.getClass(), "sortNumber", 0);
        setIntField(term277647, term277647.getClass(), "placeId", 0);
        setField(term277647, term277647.getClass(), "playDate", null);
        setField(term277647, term277647.getClass(), "userPlayDate", null);
        setIntField(term277647, term277647.getClass(), "musicId", 0);
        setIntField(term277647, term277647.getClass(), "level", 0);
        setIntField(term277647, term277647.getClass(), "customId", 0);
        setIntField(term277647, term277647.getClass(), "playedUserId1", 0);
        setIntField(term277647, term277647.getClass(), "playedUserId2", 0);
        setIntField(term277647, term277647.getClass(), "playedUserId3", 0);
        setField(term277647, term277647.getClass(), "playedUserName1", null);
        setField(term277647, term277647.getClass(), "playedUserName2", null);
        setField(term277647, term277647.getClass(), "playedUserName3", null);
        setIntField(term277647, term277647.getClass(), "playedMusicLevel1", 0);
        setIntField(term277647, term277647.getClass(), "playedMusicLevel2", 0);
        setIntField(term277647, term277647.getClass(), "playedMusicLevel3", 0);
        setIntField(term277647, term277647.getClass(), "playedCustom1", 0);
        setIntField(term277647, term277647.getClass(), "playedCustom2", 0);
        setIntField(term277647, term277647.getClass(), "playedCustom3", 0);
        setIntField(term277647, term277647.getClass(), "track", 0);
        setIntField(term277647, term277647.getClass(), "score", 0);
        setIntField(term277647, term277647.getClass(), "rank", 0);
        setIntField(term277647, term277647.getClass(), "maxCombo", 0);
        setIntField(term277647, term277647.getClass(), "maxChain", 0);
        setIntField(term277647, term277647.getClass(), "rateTap", 0);
        setIntField(term277647, term277647.getClass(), "rateHold", 0);
        setIntField(term277647, term277647.getClass(), "rateSlide", 0);
        setIntField(term277647, term277647.getClass(), "rateAir", 0);
        setIntField(term277647, term277647.getClass(), "rateFlick", 0);
        setIntField(term277647, term277647.getClass(), "judgeGuilty", 0);
        setIntField(term277647, term277647.getClass(), "judgeAttack", 0);
        setIntField(term277647, term277647.getClass(), "judgeJustice", 0);
        setIntField(term277647, term277647.getClass(), "judgeCritical", 0);
        setIntField(term277647, term277647.getClass(), "eventId", 0);
        setIntField(term277647, term277647.getClass(), "playerRating", 0);
        setBooleanField(term277647, term277647.getClass(), "isNewRecord", false);
        setBooleanField(term277647, term277647.getClass(), "isFullCombo", false);
        setIntField(term277647, term277647.getClass(), "fullChainKind", 0);
        setBooleanField(term277647, term277647.getClass(), "isAllJustice", false);
        setBooleanField(term277647, term277647.getClass(), "isContinue", false);
        setBooleanField(term277647, term277647.getClass(), "isFreeToPlay", false);
        setIntField(term277647, term277647.getClass(), "characterId", 0);
        setIntField(term277647, term277647.getClass(), "skillId", 0);
        setIntField(term277647, term277647.getClass(), "playKind", 0);
        setBooleanField(term277647, term277647.getClass(), "isClear", false);
        setIntField(term277647, term277647.getClass(), "skillLevel", 0);
        setIntField(term277647, term277647.getClass(), "skillEffect", 0);
        setField(term277647, term277647.getClass(), "placeName", null);
        setBooleanField(term277647, term277647.getClass(), "isMaimai", false);
        term277693 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term277693;
        callMethod(klass, "setContinue", argTypes, term277647, args);
    }

};


