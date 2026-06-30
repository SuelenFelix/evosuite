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

public class UserPlaylog_getMaxChain_396507292138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274447;

    public UserPlaylog_getMaxChain_396507292138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274447 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term274447, term274447.getClass(), "id", 0L);
        setField(term274447, term274447.getClass(), "user", null);
        setIntField(term274447, term274447.getClass(), "orderId", 0);
        setIntField(term274447, term274447.getClass(), "sortNumber", 0);
        setIntField(term274447, term274447.getClass(), "placeId", 0);
        setField(term274447, term274447.getClass(), "playDate", null);
        setField(term274447, term274447.getClass(), "userPlayDate", null);
        setIntField(term274447, term274447.getClass(), "musicId", 0);
        setIntField(term274447, term274447.getClass(), "level", 0);
        setIntField(term274447, term274447.getClass(), "customId", 0);
        setIntField(term274447, term274447.getClass(), "playedUserId1", 0);
        setIntField(term274447, term274447.getClass(), "playedUserId2", 0);
        setIntField(term274447, term274447.getClass(), "playedUserId3", 0);
        setField(term274447, term274447.getClass(), "playedUserName1", null);
        setField(term274447, term274447.getClass(), "playedUserName2", null);
        setField(term274447, term274447.getClass(), "playedUserName3", null);
        setIntField(term274447, term274447.getClass(), "playedMusicLevel1", 0);
        setIntField(term274447, term274447.getClass(), "playedMusicLevel2", 0);
        setIntField(term274447, term274447.getClass(), "playedMusicLevel3", 0);
        setIntField(term274447, term274447.getClass(), "playedCustom1", 0);
        setIntField(term274447, term274447.getClass(), "playedCustom2", 0);
        setIntField(term274447, term274447.getClass(), "playedCustom3", 0);
        setIntField(term274447, term274447.getClass(), "track", 0);
        setIntField(term274447, term274447.getClass(), "score", 0);
        setIntField(term274447, term274447.getClass(), "rank", 0);
        setIntField(term274447, term274447.getClass(), "maxCombo", 0);
        setIntField(term274447, term274447.getClass(), "maxChain", 0);
        setIntField(term274447, term274447.getClass(), "rateTap", 0);
        setIntField(term274447, term274447.getClass(), "rateHold", 0);
        setIntField(term274447, term274447.getClass(), "rateSlide", 0);
        setIntField(term274447, term274447.getClass(), "rateAir", 0);
        setIntField(term274447, term274447.getClass(), "rateFlick", 0);
        setIntField(term274447, term274447.getClass(), "judgeGuilty", 0);
        setIntField(term274447, term274447.getClass(), "judgeAttack", 0);
        setIntField(term274447, term274447.getClass(), "judgeJustice", 0);
        setIntField(term274447, term274447.getClass(), "judgeCritical", 0);
        setIntField(term274447, term274447.getClass(), "eventId", 0);
        setIntField(term274447, term274447.getClass(), "playerRating", 0);
        setBooleanField(term274447, term274447.getClass(), "isNewRecord", false);
        setBooleanField(term274447, term274447.getClass(), "isFullCombo", false);
        setIntField(term274447, term274447.getClass(), "fullChainKind", 0);
        setBooleanField(term274447, term274447.getClass(), "isAllJustice", false);
        setBooleanField(term274447, term274447.getClass(), "isContinue", false);
        setBooleanField(term274447, term274447.getClass(), "isFreeToPlay", false);
        setIntField(term274447, term274447.getClass(), "characterId", 0);
        setIntField(term274447, term274447.getClass(), "skillId", 0);
        setIntField(term274447, term274447.getClass(), "playKind", 0);
        setBooleanField(term274447, term274447.getClass(), "isClear", false);
        setIntField(term274447, term274447.getClass(), "skillLevel", 0);
        setIntField(term274447, term274447.getClass(), "skillEffect", 0);
        setField(term274447, term274447.getClass(), "placeName", null);
        setBooleanField(term274447, term274447.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxChain", argTypes, term274447, args);
    }

};


