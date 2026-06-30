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

public class UserPlaylog_getCustomId_1196705163121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273665;

    public UserPlaylog_getCustomId_1196705163121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273665 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog"));
        setLongField(term273665, term273665.getClass(), "id", 0L);
        setField(term273665, term273665.getClass(), "user", null);
        setIntField(term273665, term273665.getClass(), "orderId", 0);
        setIntField(term273665, term273665.getClass(), "sortNumber", 0);
        setIntField(term273665, term273665.getClass(), "placeId", 0);
        setField(term273665, term273665.getClass(), "playDate", null);
        setField(term273665, term273665.getClass(), "userPlayDate", null);
        setIntField(term273665, term273665.getClass(), "musicId", 0);
        setIntField(term273665, term273665.getClass(), "level", 0);
        setIntField(term273665, term273665.getClass(), "customId", 0);
        setIntField(term273665, term273665.getClass(), "playedUserId1", 0);
        setIntField(term273665, term273665.getClass(), "playedUserId2", 0);
        setIntField(term273665, term273665.getClass(), "playedUserId3", 0);
        setField(term273665, term273665.getClass(), "playedUserName1", null);
        setField(term273665, term273665.getClass(), "playedUserName2", null);
        setField(term273665, term273665.getClass(), "playedUserName3", null);
        setIntField(term273665, term273665.getClass(), "playedMusicLevel1", 0);
        setIntField(term273665, term273665.getClass(), "playedMusicLevel2", 0);
        setIntField(term273665, term273665.getClass(), "playedMusicLevel3", 0);
        setIntField(term273665, term273665.getClass(), "playedCustom1", 0);
        setIntField(term273665, term273665.getClass(), "playedCustom2", 0);
        setIntField(term273665, term273665.getClass(), "playedCustom3", 0);
        setIntField(term273665, term273665.getClass(), "track", 0);
        setIntField(term273665, term273665.getClass(), "score", 0);
        setIntField(term273665, term273665.getClass(), "rank", 0);
        setIntField(term273665, term273665.getClass(), "maxCombo", 0);
        setIntField(term273665, term273665.getClass(), "maxChain", 0);
        setIntField(term273665, term273665.getClass(), "rateTap", 0);
        setIntField(term273665, term273665.getClass(), "rateHold", 0);
        setIntField(term273665, term273665.getClass(), "rateSlide", 0);
        setIntField(term273665, term273665.getClass(), "rateAir", 0);
        setIntField(term273665, term273665.getClass(), "rateFlick", 0);
        setIntField(term273665, term273665.getClass(), "judgeGuilty", 0);
        setIntField(term273665, term273665.getClass(), "judgeAttack", 0);
        setIntField(term273665, term273665.getClass(), "judgeJustice", 0);
        setIntField(term273665, term273665.getClass(), "judgeCritical", 0);
        setIntField(term273665, term273665.getClass(), "eventId", 0);
        setIntField(term273665, term273665.getClass(), "playerRating", 0);
        setBooleanField(term273665, term273665.getClass(), "isNewRecord", false);
        setBooleanField(term273665, term273665.getClass(), "isFullCombo", false);
        setIntField(term273665, term273665.getClass(), "fullChainKind", 0);
        setBooleanField(term273665, term273665.getClass(), "isAllJustice", false);
        setBooleanField(term273665, term273665.getClass(), "isContinue", false);
        setBooleanField(term273665, term273665.getClass(), "isFreeToPlay", false);
        setIntField(term273665, term273665.getClass(), "characterId", 0);
        setIntField(term273665, term273665.getClass(), "skillId", 0);
        setIntField(term273665, term273665.getClass(), "playKind", 0);
        setBooleanField(term273665, term273665.getClass(), "isClear", false);
        setIntField(term273665, term273665.getClass(), "skillLevel", 0);
        setIntField(term273665, term273665.getClass(), "skillEffect", 0);
        setField(term273665, term273665.getClass(), "placeName", null);
        setBooleanField(term273665, term273665.getClass(), "isMaimai", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomId", argTypes, term273665, args);
    }

};


