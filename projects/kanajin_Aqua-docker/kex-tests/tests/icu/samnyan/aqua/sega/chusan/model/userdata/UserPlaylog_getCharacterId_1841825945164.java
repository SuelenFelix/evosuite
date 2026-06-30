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

public class UserPlaylog_getCharacterId_1841825945164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460508;

    public UserPlaylog_getCharacterId_1841825945164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460508 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term460508, term460508.getClass(), "id", 0L);
        setField(term460508, term460508.getClass(), "user", null);
        setField(term460508, term460508.getClass(), "romVersion", null);
        setIntField(term460508, term460508.getClass(), "orderId", 0);
        setIntField(term460508, term460508.getClass(), "sortNumber", 0);
        setIntField(term460508, term460508.getClass(), "placeId", 0);
        setField(term460508, term460508.getClass(), "playDate", null);
        setField(term460508, term460508.getClass(), "userPlayDate", null);
        setIntField(term460508, term460508.getClass(), "musicId", 0);
        setIntField(term460508, term460508.getClass(), "level", 0);
        setIntField(term460508, term460508.getClass(), "customId", 0);
        setIntField(term460508, term460508.getClass(), "playedUserId1", 0);
        setIntField(term460508, term460508.getClass(), "playedUserId2", 0);
        setIntField(term460508, term460508.getClass(), "playedUserId3", 0);
        setField(term460508, term460508.getClass(), "playedUserName1", null);
        setField(term460508, term460508.getClass(), "playedUserName2", null);
        setField(term460508, term460508.getClass(), "playedUserName3", null);
        setIntField(term460508, term460508.getClass(), "playedMusicLevel1", 0);
        setIntField(term460508, term460508.getClass(), "playedMusicLevel2", 0);
        setIntField(term460508, term460508.getClass(), "playedMusicLevel3", 0);
        setIntField(term460508, term460508.getClass(), "playedCustom1", 0);
        setIntField(term460508, term460508.getClass(), "playedCustom2", 0);
        setIntField(term460508, term460508.getClass(), "playedCustom3", 0);
        setIntField(term460508, term460508.getClass(), "track", 0);
        setIntField(term460508, term460508.getClass(), "score", 0);
        setIntField(term460508, term460508.getClass(), "rank", 0);
        setIntField(term460508, term460508.getClass(), "maxCombo", 0);
        setIntField(term460508, term460508.getClass(), "maxChain", 0);
        setIntField(term460508, term460508.getClass(), "rateTap", 0);
        setIntField(term460508, term460508.getClass(), "rateHold", 0);
        setIntField(term460508, term460508.getClass(), "rateSlide", 0);
        setIntField(term460508, term460508.getClass(), "rateAir", 0);
        setIntField(term460508, term460508.getClass(), "rateFlick", 0);
        setIntField(term460508, term460508.getClass(), "judgeGuilty", 0);
        setIntField(term460508, term460508.getClass(), "judgeAttack", 0);
        setIntField(term460508, term460508.getClass(), "judgeJustice", 0);
        setIntField(term460508, term460508.getClass(), "judgeCritical", 0);
        setIntField(term460508, term460508.getClass(), "judgeHeaven", 0);
        setIntField(term460508, term460508.getClass(), "eventId", 0);
        setIntField(term460508, term460508.getClass(), "playerRating", 0);
        setBooleanField(term460508, term460508.getClass(), "isNewRecord", false);
        setBooleanField(term460508, term460508.getClass(), "isFullCombo", false);
        setIntField(term460508, term460508.getClass(), "fullChainKind", 0);
        setBooleanField(term460508, term460508.getClass(), "isAllJustice", false);
        setBooleanField(term460508, term460508.getClass(), "isContinue", false);
        setBooleanField(term460508, term460508.getClass(), "isFreeToPlay", false);
        setIntField(term460508, term460508.getClass(), "characterId", 0);
        setIntField(term460508, term460508.getClass(), "charaIllustId", 0);
        setIntField(term460508, term460508.getClass(), "skillId", 0);
        setIntField(term460508, term460508.getClass(), "playKind", 0);
        setBooleanField(term460508, term460508.getClass(), "isClear", false);
        setIntField(term460508, term460508.getClass(), "skillLevel", 0);
        setIntField(term460508, term460508.getClass(), "skillEffect", 0);
        setField(term460508, term460508.getClass(), "placeName", null);
        setIntField(term460508, term460508.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term460508, args);
    }

};


