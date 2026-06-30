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

public class UserPlaylog_getId_1293936870112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273251;

    public UserPlaylog_getId_1293936870112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273251 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term273251, term273251.getClass(), "id", 0L);
        setField(term273251, term273251.getClass(), "user", null);
        setIntField(term273251, term273251.getClass(), "orderId", 0);
        setIntField(term273251, term273251.getClass(), "sortNumber", 0);
        setIntField(term273251, term273251.getClass(), "placeId", 0);
        setField(term273251, term273251.getClass(), "playDate", null);
        setField(term273251, term273251.getClass(), "userPlayDate", null);
        setIntField(term273251, term273251.getClass(), "musicId", 0);
        setIntField(term273251, term273251.getClass(), "level", 0);
        setIntField(term273251, term273251.getClass(), "customId", 0);
        setIntField(term273251, term273251.getClass(), "playedUserId1", 0);
        setIntField(term273251, term273251.getClass(), "playedUserId2", 0);
        setIntField(term273251, term273251.getClass(), "playedUserId3", 0);
        setField(term273251, term273251.getClass(), "playedUserName1", null);
        setField(term273251, term273251.getClass(), "playedUserName2", null);
        setField(term273251, term273251.getClass(), "playedUserName3", null);
        setIntField(term273251, term273251.getClass(), "playedMusicLevel1", 0);
        setIntField(term273251, term273251.getClass(), "playedMusicLevel2", 0);
        setIntField(term273251, term273251.getClass(), "playedMusicLevel3", 0);
        setIntField(term273251, term273251.getClass(), "playedCustom1", 0);
        setIntField(term273251, term273251.getClass(), "playedCustom2", 0);
        setIntField(term273251, term273251.getClass(), "playedCustom3", 0);
        setIntField(term273251, term273251.getClass(), "track", 0);
        setIntField(term273251, term273251.getClass(), "score", 0);
        setIntField(term273251, term273251.getClass(), "rank", 0);
        setIntField(term273251, term273251.getClass(), "maxCombo", 0);
        setIntField(term273251, term273251.getClass(), "maxChain", 0);
        setIntField(term273251, term273251.getClass(), "rateTap", 0);
        setIntField(term273251, term273251.getClass(), "rateHold", 0);
        setIntField(term273251, term273251.getClass(), "rateSlide", 0);
        setIntField(term273251, term273251.getClass(), "rateAir", 0);
        setIntField(term273251, term273251.getClass(), "rateFlick", 0);
        setIntField(term273251, term273251.getClass(), "judgeGuilty", 0);
        setIntField(term273251, term273251.getClass(), "judgeAttack", 0);
        setIntField(term273251, term273251.getClass(), "judgeJustice", 0);
        setIntField(term273251, term273251.getClass(), "judgeCritical", 0);
        setIntField(term273251, term273251.getClass(), "eventId", 0);
        setIntField(term273251, term273251.getClass(), "playerRating", 0);
        setBooleanField(term273251, term273251.getClass(), "isNewRecord", false);
        setBooleanField(term273251, term273251.getClass(), "isFullCombo", false);
        setIntField(term273251, term273251.getClass(), "fullChainKind", 0);
        setBooleanField(term273251, term273251.getClass(), "isAllJustice", false);
        setBooleanField(term273251, term273251.getClass(), "isContinue", false);
        setBooleanField(term273251, term273251.getClass(), "isFreeToPlay", false);
        setIntField(term273251, term273251.getClass(), "characterId", 0);
        setIntField(term273251, term273251.getClass(), "skillId", 0);
        setIntField(term273251, term273251.getClass(), "playKind", 0);
        setBooleanField(term273251, term273251.getClass(), "isClear", false);
        setIntField(term273251, term273251.getClass(), "skillLevel", 0);
        setIntField(term273251, term273251.getClass(), "skillEffect", 0);
        setField(term273251, term273251.getClass(), "placeName", null);
        setBooleanField(term273251, term273251.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term273251, args);
    }

};


