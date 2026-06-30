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

public class UserPlaylog_setCharacterId_1659396863208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277743;
     Object term277789;

    public UserPlaylog_setCharacterId_1659396863208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277743 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term277743, term277743.getClass(), "id", 0L);
        setField(term277743, term277743.getClass(), "user", null);
        setIntField(term277743, term277743.getClass(), "orderId", 0);
        setIntField(term277743, term277743.getClass(), "sortNumber", 0);
        setIntField(term277743, term277743.getClass(), "placeId", 0);
        setField(term277743, term277743.getClass(), "playDate", null);
        setField(term277743, term277743.getClass(), "userPlayDate", null);
        setIntField(term277743, term277743.getClass(), "musicId", 0);
        setIntField(term277743, term277743.getClass(), "level", 0);
        setIntField(term277743, term277743.getClass(), "customId", 0);
        setIntField(term277743, term277743.getClass(), "playedUserId1", 0);
        setIntField(term277743, term277743.getClass(), "playedUserId2", 0);
        setIntField(term277743, term277743.getClass(), "playedUserId3", 0);
        setField(term277743, term277743.getClass(), "playedUserName1", null);
        setField(term277743, term277743.getClass(), "playedUserName2", null);
        setField(term277743, term277743.getClass(), "playedUserName3", null);
        setIntField(term277743, term277743.getClass(), "playedMusicLevel1", 0);
        setIntField(term277743, term277743.getClass(), "playedMusicLevel2", 0);
        setIntField(term277743, term277743.getClass(), "playedMusicLevel3", 0);
        setIntField(term277743, term277743.getClass(), "playedCustom1", 0);
        setIntField(term277743, term277743.getClass(), "playedCustom2", 0);
        setIntField(term277743, term277743.getClass(), "playedCustom3", 0);
        setIntField(term277743, term277743.getClass(), "track", 0);
        setIntField(term277743, term277743.getClass(), "score", 0);
        setIntField(term277743, term277743.getClass(), "rank", 0);
        setIntField(term277743, term277743.getClass(), "maxCombo", 0);
        setIntField(term277743, term277743.getClass(), "maxChain", 0);
        setIntField(term277743, term277743.getClass(), "rateTap", 0);
        setIntField(term277743, term277743.getClass(), "rateHold", 0);
        setIntField(term277743, term277743.getClass(), "rateSlide", 0);
        setIntField(term277743, term277743.getClass(), "rateAir", 0);
        setIntField(term277743, term277743.getClass(), "rateFlick", 0);
        setIntField(term277743, term277743.getClass(), "judgeGuilty", 0);
        setIntField(term277743, term277743.getClass(), "judgeAttack", 0);
        setIntField(term277743, term277743.getClass(), "judgeJustice", 0);
        setIntField(term277743, term277743.getClass(), "judgeCritical", 0);
        setIntField(term277743, term277743.getClass(), "eventId", 0);
        setIntField(term277743, term277743.getClass(), "playerRating", 0);
        setBooleanField(term277743, term277743.getClass(), "isNewRecord", false);
        setBooleanField(term277743, term277743.getClass(), "isFullCombo", false);
        setIntField(term277743, term277743.getClass(), "fullChainKind", 0);
        setBooleanField(term277743, term277743.getClass(), "isAllJustice", false);
        setBooleanField(term277743, term277743.getClass(), "isContinue", false);
        setBooleanField(term277743, term277743.getClass(), "isFreeToPlay", false);
        setIntField(term277743, term277743.getClass(), "characterId", 0);
        setIntField(term277743, term277743.getClass(), "skillId", 0);
        setIntField(term277743, term277743.getClass(), "playKind", 0);
        setBooleanField(term277743, term277743.getClass(), "isClear", false);
        setIntField(term277743, term277743.getClass(), "skillLevel", 0);
        setIntField(term277743, term277743.getClass(), "skillEffect", 0);
        setField(term277743, term277743.getClass(), "placeName", null);
        setBooleanField(term277743, term277743.getClass(), "isMaimai", false);
        term277789 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277789;
        callMethod(klass, "setCharacterId", argTypes, term277743, args);
    }

};


