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

public class UserPlaylog_setFreeToPlay_566570460207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277695;
     Object term277741;

    public UserPlaylog_setFreeToPlay_566570460207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277695 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term277695, term277695.getClass(), "id", 0L);
        setField(term277695, term277695.getClass(), "user", null);
        setIntField(term277695, term277695.getClass(), "orderId", 0);
        setIntField(term277695, term277695.getClass(), "sortNumber", 0);
        setIntField(term277695, term277695.getClass(), "placeId", 0);
        setField(term277695, term277695.getClass(), "playDate", null);
        setField(term277695, term277695.getClass(), "userPlayDate", null);
        setIntField(term277695, term277695.getClass(), "musicId", 0);
        setIntField(term277695, term277695.getClass(), "level", 0);
        setIntField(term277695, term277695.getClass(), "customId", 0);
        setIntField(term277695, term277695.getClass(), "playedUserId1", 0);
        setIntField(term277695, term277695.getClass(), "playedUserId2", 0);
        setIntField(term277695, term277695.getClass(), "playedUserId3", 0);
        setField(term277695, term277695.getClass(), "playedUserName1", null);
        setField(term277695, term277695.getClass(), "playedUserName2", null);
        setField(term277695, term277695.getClass(), "playedUserName3", null);
        setIntField(term277695, term277695.getClass(), "playedMusicLevel1", 0);
        setIntField(term277695, term277695.getClass(), "playedMusicLevel2", 0);
        setIntField(term277695, term277695.getClass(), "playedMusicLevel3", 0);
        setIntField(term277695, term277695.getClass(), "playedCustom1", 0);
        setIntField(term277695, term277695.getClass(), "playedCustom2", 0);
        setIntField(term277695, term277695.getClass(), "playedCustom3", 0);
        setIntField(term277695, term277695.getClass(), "track", 0);
        setIntField(term277695, term277695.getClass(), "score", 0);
        setIntField(term277695, term277695.getClass(), "rank", 0);
        setIntField(term277695, term277695.getClass(), "maxCombo", 0);
        setIntField(term277695, term277695.getClass(), "maxChain", 0);
        setIntField(term277695, term277695.getClass(), "rateTap", 0);
        setIntField(term277695, term277695.getClass(), "rateHold", 0);
        setIntField(term277695, term277695.getClass(), "rateSlide", 0);
        setIntField(term277695, term277695.getClass(), "rateAir", 0);
        setIntField(term277695, term277695.getClass(), "rateFlick", 0);
        setIntField(term277695, term277695.getClass(), "judgeGuilty", 0);
        setIntField(term277695, term277695.getClass(), "judgeAttack", 0);
        setIntField(term277695, term277695.getClass(), "judgeJustice", 0);
        setIntField(term277695, term277695.getClass(), "judgeCritical", 0);
        setIntField(term277695, term277695.getClass(), "eventId", 0);
        setIntField(term277695, term277695.getClass(), "playerRating", 0);
        setBooleanField(term277695, term277695.getClass(), "isNewRecord", false);
        setBooleanField(term277695, term277695.getClass(), "isFullCombo", false);
        setIntField(term277695, term277695.getClass(), "fullChainKind", 0);
        setBooleanField(term277695, term277695.getClass(), "isAllJustice", false);
        setBooleanField(term277695, term277695.getClass(), "isContinue", false);
        setBooleanField(term277695, term277695.getClass(), "isFreeToPlay", false);
        setIntField(term277695, term277695.getClass(), "characterId", 0);
        setIntField(term277695, term277695.getClass(), "skillId", 0);
        setIntField(term277695, term277695.getClass(), "playKind", 0);
        setBooleanField(term277695, term277695.getClass(), "isClear", false);
        setIntField(term277695, term277695.getClass(), "skillLevel", 0);
        setIntField(term277695, term277695.getClass(), "skillEffect", 0);
        setField(term277695, term277695.getClass(), "placeName", null);
        setBooleanField(term277695, term277695.getClass(), "isMaimai", false);
        term277741 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term277741;
        callMethod(klass, "setFreeToPlay", argTypes, term277695, args);
    }

};


