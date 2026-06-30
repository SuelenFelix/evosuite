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
import java.lang.Long;

public class UserPlaylog_setId_769800924164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275643;
     Object term275689;

    public UserPlaylog_setId_769800924164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275643 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term275643, term275643.getClass(), "id", 0L);
        setField(term275643, term275643.getClass(), "user", null);
        setIntField(term275643, term275643.getClass(), "orderId", 0);
        setIntField(term275643, term275643.getClass(), "sortNumber", 0);
        setIntField(term275643, term275643.getClass(), "placeId", 0);
        setField(term275643, term275643.getClass(), "playDate", null);
        setField(term275643, term275643.getClass(), "userPlayDate", null);
        setIntField(term275643, term275643.getClass(), "musicId", 0);
        setIntField(term275643, term275643.getClass(), "level", 0);
        setIntField(term275643, term275643.getClass(), "customId", 0);
        setIntField(term275643, term275643.getClass(), "playedUserId1", 0);
        setIntField(term275643, term275643.getClass(), "playedUserId2", 0);
        setIntField(term275643, term275643.getClass(), "playedUserId3", 0);
        setField(term275643, term275643.getClass(), "playedUserName1", null);
        setField(term275643, term275643.getClass(), "playedUserName2", null);
        setField(term275643, term275643.getClass(), "playedUserName3", null);
        setIntField(term275643, term275643.getClass(), "playedMusicLevel1", 0);
        setIntField(term275643, term275643.getClass(), "playedMusicLevel2", 0);
        setIntField(term275643, term275643.getClass(), "playedMusicLevel3", 0);
        setIntField(term275643, term275643.getClass(), "playedCustom1", 0);
        setIntField(term275643, term275643.getClass(), "playedCustom2", 0);
        setIntField(term275643, term275643.getClass(), "playedCustom3", 0);
        setIntField(term275643, term275643.getClass(), "track", 0);
        setIntField(term275643, term275643.getClass(), "score", 0);
        setIntField(term275643, term275643.getClass(), "rank", 0);
        setIntField(term275643, term275643.getClass(), "maxCombo", 0);
        setIntField(term275643, term275643.getClass(), "maxChain", 0);
        setIntField(term275643, term275643.getClass(), "rateTap", 0);
        setIntField(term275643, term275643.getClass(), "rateHold", 0);
        setIntField(term275643, term275643.getClass(), "rateSlide", 0);
        setIntField(term275643, term275643.getClass(), "rateAir", 0);
        setIntField(term275643, term275643.getClass(), "rateFlick", 0);
        setIntField(term275643, term275643.getClass(), "judgeGuilty", 0);
        setIntField(term275643, term275643.getClass(), "judgeAttack", 0);
        setIntField(term275643, term275643.getClass(), "judgeJustice", 0);
        setIntField(term275643, term275643.getClass(), "judgeCritical", 0);
        setIntField(term275643, term275643.getClass(), "eventId", 0);
        setIntField(term275643, term275643.getClass(), "playerRating", 0);
        setBooleanField(term275643, term275643.getClass(), "isNewRecord", false);
        setBooleanField(term275643, term275643.getClass(), "isFullCombo", false);
        setIntField(term275643, term275643.getClass(), "fullChainKind", 0);
        setBooleanField(term275643, term275643.getClass(), "isAllJustice", false);
        setBooleanField(term275643, term275643.getClass(), "isContinue", false);
        setBooleanField(term275643, term275643.getClass(), "isFreeToPlay", false);
        setIntField(term275643, term275643.getClass(), "characterId", 0);
        setIntField(term275643, term275643.getClass(), "skillId", 0);
        setIntField(term275643, term275643.getClass(), "playKind", 0);
        setBooleanField(term275643, term275643.getClass(), "isClear", false);
        setIntField(term275643, term275643.getClass(), "skillLevel", 0);
        setIntField(term275643, term275643.getClass(), "skillEffect", 0);
        setField(term275643, term275643.getClass(), "placeName", null);
        setBooleanField(term275643, term275643.getClass(), "isMaimai", false);
        term275689 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term275689;
        callMethod(klass, "setId", argTypes, term275643, args);
    }

};


