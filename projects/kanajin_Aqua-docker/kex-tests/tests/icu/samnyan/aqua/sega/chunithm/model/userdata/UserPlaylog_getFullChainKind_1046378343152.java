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

public class UserPlaylog_getFullChainKind_1046378343152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275091;

    public UserPlaylog_getFullChainKind_1046378343152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275091 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term275091, term275091.getClass(), "id", 0L);
        setField(term275091, term275091.getClass(), "user", null);
        setIntField(term275091, term275091.getClass(), "orderId", 0);
        setIntField(term275091, term275091.getClass(), "sortNumber", 0);
        setIntField(term275091, term275091.getClass(), "placeId", 0);
        setField(term275091, term275091.getClass(), "playDate", null);
        setField(term275091, term275091.getClass(), "userPlayDate", null);
        setIntField(term275091, term275091.getClass(), "musicId", 0);
        setIntField(term275091, term275091.getClass(), "level", 0);
        setIntField(term275091, term275091.getClass(), "customId", 0);
        setIntField(term275091, term275091.getClass(), "playedUserId1", 0);
        setIntField(term275091, term275091.getClass(), "playedUserId2", 0);
        setIntField(term275091, term275091.getClass(), "playedUserId3", 0);
        setField(term275091, term275091.getClass(), "playedUserName1", null);
        setField(term275091, term275091.getClass(), "playedUserName2", null);
        setField(term275091, term275091.getClass(), "playedUserName3", null);
        setIntField(term275091, term275091.getClass(), "playedMusicLevel1", 0);
        setIntField(term275091, term275091.getClass(), "playedMusicLevel2", 0);
        setIntField(term275091, term275091.getClass(), "playedMusicLevel3", 0);
        setIntField(term275091, term275091.getClass(), "playedCustom1", 0);
        setIntField(term275091, term275091.getClass(), "playedCustom2", 0);
        setIntField(term275091, term275091.getClass(), "playedCustom3", 0);
        setIntField(term275091, term275091.getClass(), "track", 0);
        setIntField(term275091, term275091.getClass(), "score", 0);
        setIntField(term275091, term275091.getClass(), "rank", 0);
        setIntField(term275091, term275091.getClass(), "maxCombo", 0);
        setIntField(term275091, term275091.getClass(), "maxChain", 0);
        setIntField(term275091, term275091.getClass(), "rateTap", 0);
        setIntField(term275091, term275091.getClass(), "rateHold", 0);
        setIntField(term275091, term275091.getClass(), "rateSlide", 0);
        setIntField(term275091, term275091.getClass(), "rateAir", 0);
        setIntField(term275091, term275091.getClass(), "rateFlick", 0);
        setIntField(term275091, term275091.getClass(), "judgeGuilty", 0);
        setIntField(term275091, term275091.getClass(), "judgeAttack", 0);
        setIntField(term275091, term275091.getClass(), "judgeJustice", 0);
        setIntField(term275091, term275091.getClass(), "judgeCritical", 0);
        setIntField(term275091, term275091.getClass(), "eventId", 0);
        setIntField(term275091, term275091.getClass(), "playerRating", 0);
        setBooleanField(term275091, term275091.getClass(), "isNewRecord", false);
        setBooleanField(term275091, term275091.getClass(), "isFullCombo", false);
        setIntField(term275091, term275091.getClass(), "fullChainKind", 0);
        setBooleanField(term275091, term275091.getClass(), "isAllJustice", false);
        setBooleanField(term275091, term275091.getClass(), "isContinue", false);
        setBooleanField(term275091, term275091.getClass(), "isFreeToPlay", false);
        setIntField(term275091, term275091.getClass(), "characterId", 0);
        setIntField(term275091, term275091.getClass(), "skillId", 0);
        setIntField(term275091, term275091.getClass(), "playKind", 0);
        setBooleanField(term275091, term275091.getClass(), "isClear", false);
        setIntField(term275091, term275091.getClass(), "skillLevel", 0);
        setIntField(term275091, term275091.getClass(), "skillEffect", 0);
        setField(term275091, term275091.getClass(), "placeName", null);
        setBooleanField(term275091, term275091.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullChainKind", argTypes, term275091, args);
    }

};


