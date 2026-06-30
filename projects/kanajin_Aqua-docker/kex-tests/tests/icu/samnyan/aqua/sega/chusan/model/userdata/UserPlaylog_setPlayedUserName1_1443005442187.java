package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserPlaylog_setPlayedUserName1_1443005442187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461632;

    public UserPlaylog_setPlayedUserName1_1443005442187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461632 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term461632, term461632.getClass(), "id", 0L);
        setField(term461632, term461632.getClass(), "user", null);
        setField(term461632, term461632.getClass(), "romVersion", null);
        setIntField(term461632, term461632.getClass(), "orderId", 0);
        setIntField(term461632, term461632.getClass(), "sortNumber", 0);
        setIntField(term461632, term461632.getClass(), "placeId", 0);
        setField(term461632, term461632.getClass(), "playDate", null);
        setField(term461632, term461632.getClass(), "userPlayDate", null);
        setIntField(term461632, term461632.getClass(), "musicId", 0);
        setIntField(term461632, term461632.getClass(), "level", 0);
        setIntField(term461632, term461632.getClass(), "customId", 0);
        setIntField(term461632, term461632.getClass(), "playedUserId1", 0);
        setIntField(term461632, term461632.getClass(), "playedUserId2", 0);
        setIntField(term461632, term461632.getClass(), "playedUserId3", 0);
        setField(term461632, term461632.getClass(), "playedUserName1", null);
        setField(term461632, term461632.getClass(), "playedUserName2", null);
        setField(term461632, term461632.getClass(), "playedUserName3", null);
        setIntField(term461632, term461632.getClass(), "playedMusicLevel1", 0);
        setIntField(term461632, term461632.getClass(), "playedMusicLevel2", 0);
        setIntField(term461632, term461632.getClass(), "playedMusicLevel3", 0);
        setIntField(term461632, term461632.getClass(), "playedCustom1", 0);
        setIntField(term461632, term461632.getClass(), "playedCustom2", 0);
        setIntField(term461632, term461632.getClass(), "playedCustom3", 0);
        setIntField(term461632, term461632.getClass(), "track", 0);
        setIntField(term461632, term461632.getClass(), "score", 0);
        setIntField(term461632, term461632.getClass(), "rank", 0);
        setIntField(term461632, term461632.getClass(), "maxCombo", 0);
        setIntField(term461632, term461632.getClass(), "maxChain", 0);
        setIntField(term461632, term461632.getClass(), "rateTap", 0);
        setIntField(term461632, term461632.getClass(), "rateHold", 0);
        setIntField(term461632, term461632.getClass(), "rateSlide", 0);
        setIntField(term461632, term461632.getClass(), "rateAir", 0);
        setIntField(term461632, term461632.getClass(), "rateFlick", 0);
        setIntField(term461632, term461632.getClass(), "judgeGuilty", 0);
        setIntField(term461632, term461632.getClass(), "judgeAttack", 0);
        setIntField(term461632, term461632.getClass(), "judgeJustice", 0);
        setIntField(term461632, term461632.getClass(), "judgeCritical", 0);
        setIntField(term461632, term461632.getClass(), "judgeHeaven", 0);
        setIntField(term461632, term461632.getClass(), "eventId", 0);
        setIntField(term461632, term461632.getClass(), "playerRating", 0);
        setBooleanField(term461632, term461632.getClass(), "isNewRecord", false);
        setBooleanField(term461632, term461632.getClass(), "isFullCombo", false);
        setIntField(term461632, term461632.getClass(), "fullChainKind", 0);
        setBooleanField(term461632, term461632.getClass(), "isAllJustice", false);
        setBooleanField(term461632, term461632.getClass(), "isContinue", false);
        setBooleanField(term461632, term461632.getClass(), "isFreeToPlay", false);
        setIntField(term461632, term461632.getClass(), "characterId", 0);
        setIntField(term461632, term461632.getClass(), "charaIllustId", 0);
        setIntField(term461632, term461632.getClass(), "skillId", 0);
        setIntField(term461632, term461632.getClass(), "playKind", 0);
        setBooleanField(term461632, term461632.getClass(), "isClear", false);
        setIntField(term461632, term461632.getClass(), "skillLevel", 0);
        setIntField(term461632, term461632.getClass(), "skillEffect", 0);
        setField(term461632, term461632.getClass(), "placeName", null);
        setIntField(term461632, term461632.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName1", argTypes, term461632, args);
    }

};


