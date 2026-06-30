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

public class UserPlaylog_isFreeToPlay_1559313774155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275229;

    public UserPlaylog_isFreeToPlay_1559313774155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275229 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term275229, term275229.getClass(), "id", 0L);
        setField(term275229, term275229.getClass(), "user", null);
        setIntField(term275229, term275229.getClass(), "orderId", 0);
        setIntField(term275229, term275229.getClass(), "sortNumber", 0);
        setIntField(term275229, term275229.getClass(), "placeId", 0);
        setField(term275229, term275229.getClass(), "playDate", null);
        setField(term275229, term275229.getClass(), "userPlayDate", null);
        setIntField(term275229, term275229.getClass(), "musicId", 0);
        setIntField(term275229, term275229.getClass(), "level", 0);
        setIntField(term275229, term275229.getClass(), "customId", 0);
        setIntField(term275229, term275229.getClass(), "playedUserId1", 0);
        setIntField(term275229, term275229.getClass(), "playedUserId2", 0);
        setIntField(term275229, term275229.getClass(), "playedUserId3", 0);
        setField(term275229, term275229.getClass(), "playedUserName1", null);
        setField(term275229, term275229.getClass(), "playedUserName2", null);
        setField(term275229, term275229.getClass(), "playedUserName3", null);
        setIntField(term275229, term275229.getClass(), "playedMusicLevel1", 0);
        setIntField(term275229, term275229.getClass(), "playedMusicLevel2", 0);
        setIntField(term275229, term275229.getClass(), "playedMusicLevel3", 0);
        setIntField(term275229, term275229.getClass(), "playedCustom1", 0);
        setIntField(term275229, term275229.getClass(), "playedCustom2", 0);
        setIntField(term275229, term275229.getClass(), "playedCustom3", 0);
        setIntField(term275229, term275229.getClass(), "track", 0);
        setIntField(term275229, term275229.getClass(), "score", 0);
        setIntField(term275229, term275229.getClass(), "rank", 0);
        setIntField(term275229, term275229.getClass(), "maxCombo", 0);
        setIntField(term275229, term275229.getClass(), "maxChain", 0);
        setIntField(term275229, term275229.getClass(), "rateTap", 0);
        setIntField(term275229, term275229.getClass(), "rateHold", 0);
        setIntField(term275229, term275229.getClass(), "rateSlide", 0);
        setIntField(term275229, term275229.getClass(), "rateAir", 0);
        setIntField(term275229, term275229.getClass(), "rateFlick", 0);
        setIntField(term275229, term275229.getClass(), "judgeGuilty", 0);
        setIntField(term275229, term275229.getClass(), "judgeAttack", 0);
        setIntField(term275229, term275229.getClass(), "judgeJustice", 0);
        setIntField(term275229, term275229.getClass(), "judgeCritical", 0);
        setIntField(term275229, term275229.getClass(), "eventId", 0);
        setIntField(term275229, term275229.getClass(), "playerRating", 0);
        setBooleanField(term275229, term275229.getClass(), "isNewRecord", false);
        setBooleanField(term275229, term275229.getClass(), "isFullCombo", false);
        setIntField(term275229, term275229.getClass(), "fullChainKind", 0);
        setBooleanField(term275229, term275229.getClass(), "isAllJustice", false);
        setBooleanField(term275229, term275229.getClass(), "isContinue", false);
        setBooleanField(term275229, term275229.getClass(), "isFreeToPlay", false);
        setIntField(term275229, term275229.getClass(), "characterId", 0);
        setIntField(term275229, term275229.getClass(), "skillId", 0);
        setIntField(term275229, term275229.getClass(), "playKind", 0);
        setBooleanField(term275229, term275229.getClass(), "isClear", false);
        setIntField(term275229, term275229.getClass(), "skillLevel", 0);
        setIntField(term275229, term275229.getClass(), "skillEffect", 0);
        setField(term275229, term275229.getClass(), "placeName", null);
        setBooleanField(term275229, term275229.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFreeToPlay", argTypes, term275229, args);
    }

};


