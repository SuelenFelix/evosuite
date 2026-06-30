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

public class UserPlaylog_getUserPlayDate_475354113125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458636;

    public UserPlaylog_getUserPlayDate_475354113125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458636 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term458636, term458636.getClass(), "id", 0L);
        setField(term458636, term458636.getClass(), "user", null);
        setField(term458636, term458636.getClass(), "romVersion", null);
        setIntField(term458636, term458636.getClass(), "orderId", 0);
        setIntField(term458636, term458636.getClass(), "sortNumber", 0);
        setIntField(term458636, term458636.getClass(), "placeId", 0);
        setField(term458636, term458636.getClass(), "playDate", null);
        setField(term458636, term458636.getClass(), "userPlayDate", null);
        setIntField(term458636, term458636.getClass(), "musicId", 0);
        setIntField(term458636, term458636.getClass(), "level", 0);
        setIntField(term458636, term458636.getClass(), "customId", 0);
        setIntField(term458636, term458636.getClass(), "playedUserId1", 0);
        setIntField(term458636, term458636.getClass(), "playedUserId2", 0);
        setIntField(term458636, term458636.getClass(), "playedUserId3", 0);
        setField(term458636, term458636.getClass(), "playedUserName1", null);
        setField(term458636, term458636.getClass(), "playedUserName2", null);
        setField(term458636, term458636.getClass(), "playedUserName3", null);
        setIntField(term458636, term458636.getClass(), "playedMusicLevel1", 0);
        setIntField(term458636, term458636.getClass(), "playedMusicLevel2", 0);
        setIntField(term458636, term458636.getClass(), "playedMusicLevel3", 0);
        setIntField(term458636, term458636.getClass(), "playedCustom1", 0);
        setIntField(term458636, term458636.getClass(), "playedCustom2", 0);
        setIntField(term458636, term458636.getClass(), "playedCustom3", 0);
        setIntField(term458636, term458636.getClass(), "track", 0);
        setIntField(term458636, term458636.getClass(), "score", 0);
        setIntField(term458636, term458636.getClass(), "rank", 0);
        setIntField(term458636, term458636.getClass(), "maxCombo", 0);
        setIntField(term458636, term458636.getClass(), "maxChain", 0);
        setIntField(term458636, term458636.getClass(), "rateTap", 0);
        setIntField(term458636, term458636.getClass(), "rateHold", 0);
        setIntField(term458636, term458636.getClass(), "rateSlide", 0);
        setIntField(term458636, term458636.getClass(), "rateAir", 0);
        setIntField(term458636, term458636.getClass(), "rateFlick", 0);
        setIntField(term458636, term458636.getClass(), "judgeGuilty", 0);
        setIntField(term458636, term458636.getClass(), "judgeAttack", 0);
        setIntField(term458636, term458636.getClass(), "judgeJustice", 0);
        setIntField(term458636, term458636.getClass(), "judgeCritical", 0);
        setIntField(term458636, term458636.getClass(), "judgeHeaven", 0);
        setIntField(term458636, term458636.getClass(), "eventId", 0);
        setIntField(term458636, term458636.getClass(), "playerRating", 0);
        setBooleanField(term458636, term458636.getClass(), "isNewRecord", false);
        setBooleanField(term458636, term458636.getClass(), "isFullCombo", false);
        setIntField(term458636, term458636.getClass(), "fullChainKind", 0);
        setBooleanField(term458636, term458636.getClass(), "isAllJustice", false);
        setBooleanField(term458636, term458636.getClass(), "isContinue", false);
        setBooleanField(term458636, term458636.getClass(), "isFreeToPlay", false);
        setIntField(term458636, term458636.getClass(), "characterId", 0);
        setIntField(term458636, term458636.getClass(), "charaIllustId", 0);
        setIntField(term458636, term458636.getClass(), "skillId", 0);
        setIntField(term458636, term458636.getClass(), "playKind", 0);
        setBooleanField(term458636, term458636.getClass(), "isClear", false);
        setIntField(term458636, term458636.getClass(), "skillLevel", 0);
        setIntField(term458636, term458636.getClass(), "skillEffect", 0);
        setField(term458636, term458636.getClass(), "placeName", null);
        setIntField(term458636, term458636.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPlayDate", argTypes, term458636, args);
    }

};


