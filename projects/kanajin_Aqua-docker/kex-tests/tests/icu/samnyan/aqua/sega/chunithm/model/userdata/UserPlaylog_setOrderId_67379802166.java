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

public class UserPlaylog_setOrderId_67379802166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275737;
     Object term275783;

    public UserPlaylog_setOrderId_67379802166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275737 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term275737, term275737.getClass(), "id", 0L);
        setField(term275737, term275737.getClass(), "user", null);
        setIntField(term275737, term275737.getClass(), "orderId", 0);
        setIntField(term275737, term275737.getClass(), "sortNumber", 0);
        setIntField(term275737, term275737.getClass(), "placeId", 0);
        setField(term275737, term275737.getClass(), "playDate", null);
        setField(term275737, term275737.getClass(), "userPlayDate", null);
        setIntField(term275737, term275737.getClass(), "musicId", 0);
        setIntField(term275737, term275737.getClass(), "level", 0);
        setIntField(term275737, term275737.getClass(), "customId", 0);
        setIntField(term275737, term275737.getClass(), "playedUserId1", 0);
        setIntField(term275737, term275737.getClass(), "playedUserId2", 0);
        setIntField(term275737, term275737.getClass(), "playedUserId3", 0);
        setField(term275737, term275737.getClass(), "playedUserName1", null);
        setField(term275737, term275737.getClass(), "playedUserName2", null);
        setField(term275737, term275737.getClass(), "playedUserName3", null);
        setIntField(term275737, term275737.getClass(), "playedMusicLevel1", 0);
        setIntField(term275737, term275737.getClass(), "playedMusicLevel2", 0);
        setIntField(term275737, term275737.getClass(), "playedMusicLevel3", 0);
        setIntField(term275737, term275737.getClass(), "playedCustom1", 0);
        setIntField(term275737, term275737.getClass(), "playedCustom2", 0);
        setIntField(term275737, term275737.getClass(), "playedCustom3", 0);
        setIntField(term275737, term275737.getClass(), "track", 0);
        setIntField(term275737, term275737.getClass(), "score", 0);
        setIntField(term275737, term275737.getClass(), "rank", 0);
        setIntField(term275737, term275737.getClass(), "maxCombo", 0);
        setIntField(term275737, term275737.getClass(), "maxChain", 0);
        setIntField(term275737, term275737.getClass(), "rateTap", 0);
        setIntField(term275737, term275737.getClass(), "rateHold", 0);
        setIntField(term275737, term275737.getClass(), "rateSlide", 0);
        setIntField(term275737, term275737.getClass(), "rateAir", 0);
        setIntField(term275737, term275737.getClass(), "rateFlick", 0);
        setIntField(term275737, term275737.getClass(), "judgeGuilty", 0);
        setIntField(term275737, term275737.getClass(), "judgeAttack", 0);
        setIntField(term275737, term275737.getClass(), "judgeJustice", 0);
        setIntField(term275737, term275737.getClass(), "judgeCritical", 0);
        setIntField(term275737, term275737.getClass(), "eventId", 0);
        setIntField(term275737, term275737.getClass(), "playerRating", 0);
        setBooleanField(term275737, term275737.getClass(), "isNewRecord", false);
        setBooleanField(term275737, term275737.getClass(), "isFullCombo", false);
        setIntField(term275737, term275737.getClass(), "fullChainKind", 0);
        setBooleanField(term275737, term275737.getClass(), "isAllJustice", false);
        setBooleanField(term275737, term275737.getClass(), "isContinue", false);
        setBooleanField(term275737, term275737.getClass(), "isFreeToPlay", false);
        setIntField(term275737, term275737.getClass(), "characterId", 0);
        setIntField(term275737, term275737.getClass(), "skillId", 0);
        setIntField(term275737, term275737.getClass(), "playKind", 0);
        setBooleanField(term275737, term275737.getClass(), "isClear", false);
        setIntField(term275737, term275737.getClass(), "skillLevel", 0);
        setIntField(term275737, term275737.getClass(), "skillEffect", 0);
        setField(term275737, term275737.getClass(), "placeName", null);
        setBooleanField(term275737, term275737.getClass(), "isMaimai", false);
        term275783 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term275783;
        callMethod(klass, "setOrderId", argTypes, term275737, args);
    }

};


