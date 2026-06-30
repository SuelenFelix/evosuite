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

public class UserPlaylog_setAllJustice_39868289205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277599;
     Object term277645;

    public UserPlaylog_setAllJustice_39868289205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277599 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term277599, term277599.getClass(), "id", 0L);
        setField(term277599, term277599.getClass(), "user", null);
        setIntField(term277599, term277599.getClass(), "orderId", 0);
        setIntField(term277599, term277599.getClass(), "sortNumber", 0);
        setIntField(term277599, term277599.getClass(), "placeId", 0);
        setField(term277599, term277599.getClass(), "playDate", null);
        setField(term277599, term277599.getClass(), "userPlayDate", null);
        setIntField(term277599, term277599.getClass(), "musicId", 0);
        setIntField(term277599, term277599.getClass(), "level", 0);
        setIntField(term277599, term277599.getClass(), "customId", 0);
        setIntField(term277599, term277599.getClass(), "playedUserId1", 0);
        setIntField(term277599, term277599.getClass(), "playedUserId2", 0);
        setIntField(term277599, term277599.getClass(), "playedUserId3", 0);
        setField(term277599, term277599.getClass(), "playedUserName1", null);
        setField(term277599, term277599.getClass(), "playedUserName2", null);
        setField(term277599, term277599.getClass(), "playedUserName3", null);
        setIntField(term277599, term277599.getClass(), "playedMusicLevel1", 0);
        setIntField(term277599, term277599.getClass(), "playedMusicLevel2", 0);
        setIntField(term277599, term277599.getClass(), "playedMusicLevel3", 0);
        setIntField(term277599, term277599.getClass(), "playedCustom1", 0);
        setIntField(term277599, term277599.getClass(), "playedCustom2", 0);
        setIntField(term277599, term277599.getClass(), "playedCustom3", 0);
        setIntField(term277599, term277599.getClass(), "track", 0);
        setIntField(term277599, term277599.getClass(), "score", 0);
        setIntField(term277599, term277599.getClass(), "rank", 0);
        setIntField(term277599, term277599.getClass(), "maxCombo", 0);
        setIntField(term277599, term277599.getClass(), "maxChain", 0);
        setIntField(term277599, term277599.getClass(), "rateTap", 0);
        setIntField(term277599, term277599.getClass(), "rateHold", 0);
        setIntField(term277599, term277599.getClass(), "rateSlide", 0);
        setIntField(term277599, term277599.getClass(), "rateAir", 0);
        setIntField(term277599, term277599.getClass(), "rateFlick", 0);
        setIntField(term277599, term277599.getClass(), "judgeGuilty", 0);
        setIntField(term277599, term277599.getClass(), "judgeAttack", 0);
        setIntField(term277599, term277599.getClass(), "judgeJustice", 0);
        setIntField(term277599, term277599.getClass(), "judgeCritical", 0);
        setIntField(term277599, term277599.getClass(), "eventId", 0);
        setIntField(term277599, term277599.getClass(), "playerRating", 0);
        setBooleanField(term277599, term277599.getClass(), "isNewRecord", false);
        setBooleanField(term277599, term277599.getClass(), "isFullCombo", false);
        setIntField(term277599, term277599.getClass(), "fullChainKind", 0);
        setBooleanField(term277599, term277599.getClass(), "isAllJustice", false);
        setBooleanField(term277599, term277599.getClass(), "isContinue", false);
        setBooleanField(term277599, term277599.getClass(), "isFreeToPlay", false);
        setIntField(term277599, term277599.getClass(), "characterId", 0);
        setIntField(term277599, term277599.getClass(), "skillId", 0);
        setIntField(term277599, term277599.getClass(), "playKind", 0);
        setBooleanField(term277599, term277599.getClass(), "isClear", false);
        setIntField(term277599, term277599.getClass(), "skillLevel", 0);
        setIntField(term277599, term277599.getClass(), "skillEffect", 0);
        setField(term277599, term277599.getClass(), "placeName", null);
        setBooleanField(term277599, term277599.getClass(), "isMaimai", false);
        term277645 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term277645;
        callMethod(klass, "setAllJustice", argTypes, term277599, args);
    }

};


