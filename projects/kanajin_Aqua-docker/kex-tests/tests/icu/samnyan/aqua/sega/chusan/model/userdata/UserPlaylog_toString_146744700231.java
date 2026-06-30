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

public class UserPlaylog_toString_146744700231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463818;

    public UserPlaylog_toString_146744700231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463818 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term463818, term463818.getClass(), "id", 0L);
        setField(term463818, term463818.getClass(), "user", null);
        setField(term463818, term463818.getClass(), "romVersion", null);
        setIntField(term463818, term463818.getClass(), "orderId", 0);
        setIntField(term463818, term463818.getClass(), "sortNumber", 0);
        setIntField(term463818, term463818.getClass(), "placeId", 0);
        setField(term463818, term463818.getClass(), "playDate", null);
        setField(term463818, term463818.getClass(), "userPlayDate", null);
        setIntField(term463818, term463818.getClass(), "musicId", 0);
        setIntField(term463818, term463818.getClass(), "level", 0);
        setIntField(term463818, term463818.getClass(), "customId", 0);
        setIntField(term463818, term463818.getClass(), "playedUserId1", 0);
        setIntField(term463818, term463818.getClass(), "playedUserId2", 0);
        setIntField(term463818, term463818.getClass(), "playedUserId3", 0);
        setField(term463818, term463818.getClass(), "playedUserName1", null);
        setField(term463818, term463818.getClass(), "playedUserName2", null);
        setField(term463818, term463818.getClass(), "playedUserName3", null);
        setIntField(term463818, term463818.getClass(), "playedMusicLevel1", 0);
        setIntField(term463818, term463818.getClass(), "playedMusicLevel2", 0);
        setIntField(term463818, term463818.getClass(), "playedMusicLevel3", 0);
        setIntField(term463818, term463818.getClass(), "playedCustom1", 0);
        setIntField(term463818, term463818.getClass(), "playedCustom2", 0);
        setIntField(term463818, term463818.getClass(), "playedCustom3", 0);
        setIntField(term463818, term463818.getClass(), "track", 0);
        setIntField(term463818, term463818.getClass(), "score", 0);
        setIntField(term463818, term463818.getClass(), "rank", 0);
        setIntField(term463818, term463818.getClass(), "maxCombo", 0);
        setIntField(term463818, term463818.getClass(), "maxChain", 0);
        setIntField(term463818, term463818.getClass(), "rateTap", 0);
        setIntField(term463818, term463818.getClass(), "rateHold", 0);
        setIntField(term463818, term463818.getClass(), "rateSlide", 0);
        setIntField(term463818, term463818.getClass(), "rateAir", 0);
        setIntField(term463818, term463818.getClass(), "rateFlick", 0);
        setIntField(term463818, term463818.getClass(), "judgeGuilty", 0);
        setIntField(term463818, term463818.getClass(), "judgeAttack", 0);
        setIntField(term463818, term463818.getClass(), "judgeJustice", 0);
        setIntField(term463818, term463818.getClass(), "judgeCritical", 0);
        setIntField(term463818, term463818.getClass(), "judgeHeaven", 0);
        setIntField(term463818, term463818.getClass(), "eventId", 0);
        setIntField(term463818, term463818.getClass(), "playerRating", 0);
        setBooleanField(term463818, term463818.getClass(), "isNewRecord", false);
        setBooleanField(term463818, term463818.getClass(), "isFullCombo", false);
        setIntField(term463818, term463818.getClass(), "fullChainKind", 0);
        setBooleanField(term463818, term463818.getClass(), "isAllJustice", false);
        setBooleanField(term463818, term463818.getClass(), "isContinue", false);
        setBooleanField(term463818, term463818.getClass(), "isFreeToPlay", false);
        setIntField(term463818, term463818.getClass(), "characterId", 0);
        setIntField(term463818, term463818.getClass(), "charaIllustId", 0);
        setIntField(term463818, term463818.getClass(), "skillId", 0);
        setIntField(term463818, term463818.getClass(), "playKind", 0);
        setBooleanField(term463818, term463818.getClass(), "isClear", false);
        setIntField(term463818, term463818.getClass(), "skillLevel", 0);
        setIntField(term463818, term463818.getClass(), "skillEffect", 0);
        setField(term463818, term463818.getClass(), "placeName", null);
        setIntField(term463818, term463818.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term463818, args);
    }

};


