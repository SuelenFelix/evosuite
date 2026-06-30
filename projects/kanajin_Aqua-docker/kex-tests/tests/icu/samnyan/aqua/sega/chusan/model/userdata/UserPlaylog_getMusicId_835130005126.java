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

public class UserPlaylog_getMusicId_835130005126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458684;

    public UserPlaylog_getMusicId_835130005126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458684 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term458684, term458684.getClass(), "id", 0L);
        setField(term458684, term458684.getClass(), "user", null);
        setField(term458684, term458684.getClass(), "romVersion", null);
        setIntField(term458684, term458684.getClass(), "orderId", 0);
        setIntField(term458684, term458684.getClass(), "sortNumber", 0);
        setIntField(term458684, term458684.getClass(), "placeId", 0);
        setField(term458684, term458684.getClass(), "playDate", null);
        setField(term458684, term458684.getClass(), "userPlayDate", null);
        setIntField(term458684, term458684.getClass(), "musicId", 0);
        setIntField(term458684, term458684.getClass(), "level", 0);
        setIntField(term458684, term458684.getClass(), "customId", 0);
        setIntField(term458684, term458684.getClass(), "playedUserId1", 0);
        setIntField(term458684, term458684.getClass(), "playedUserId2", 0);
        setIntField(term458684, term458684.getClass(), "playedUserId3", 0);
        setField(term458684, term458684.getClass(), "playedUserName1", null);
        setField(term458684, term458684.getClass(), "playedUserName2", null);
        setField(term458684, term458684.getClass(), "playedUserName3", null);
        setIntField(term458684, term458684.getClass(), "playedMusicLevel1", 0);
        setIntField(term458684, term458684.getClass(), "playedMusicLevel2", 0);
        setIntField(term458684, term458684.getClass(), "playedMusicLevel3", 0);
        setIntField(term458684, term458684.getClass(), "playedCustom1", 0);
        setIntField(term458684, term458684.getClass(), "playedCustom2", 0);
        setIntField(term458684, term458684.getClass(), "playedCustom3", 0);
        setIntField(term458684, term458684.getClass(), "track", 0);
        setIntField(term458684, term458684.getClass(), "score", 0);
        setIntField(term458684, term458684.getClass(), "rank", 0);
        setIntField(term458684, term458684.getClass(), "maxCombo", 0);
        setIntField(term458684, term458684.getClass(), "maxChain", 0);
        setIntField(term458684, term458684.getClass(), "rateTap", 0);
        setIntField(term458684, term458684.getClass(), "rateHold", 0);
        setIntField(term458684, term458684.getClass(), "rateSlide", 0);
        setIntField(term458684, term458684.getClass(), "rateAir", 0);
        setIntField(term458684, term458684.getClass(), "rateFlick", 0);
        setIntField(term458684, term458684.getClass(), "judgeGuilty", 0);
        setIntField(term458684, term458684.getClass(), "judgeAttack", 0);
        setIntField(term458684, term458684.getClass(), "judgeJustice", 0);
        setIntField(term458684, term458684.getClass(), "judgeCritical", 0);
        setIntField(term458684, term458684.getClass(), "judgeHeaven", 0);
        setIntField(term458684, term458684.getClass(), "eventId", 0);
        setIntField(term458684, term458684.getClass(), "playerRating", 0);
        setBooleanField(term458684, term458684.getClass(), "isNewRecord", false);
        setBooleanField(term458684, term458684.getClass(), "isFullCombo", false);
        setIntField(term458684, term458684.getClass(), "fullChainKind", 0);
        setBooleanField(term458684, term458684.getClass(), "isAllJustice", false);
        setBooleanField(term458684, term458684.getClass(), "isContinue", false);
        setBooleanField(term458684, term458684.getClass(), "isFreeToPlay", false);
        setIntField(term458684, term458684.getClass(), "characterId", 0);
        setIntField(term458684, term458684.getClass(), "charaIllustId", 0);
        setIntField(term458684, term458684.getClass(), "skillId", 0);
        setIntField(term458684, term458684.getClass(), "playKind", 0);
        setBooleanField(term458684, term458684.getClass(), "isClear", false);
        setIntField(term458684, term458684.getClass(), "skillLevel", 0);
        setIntField(term458684, term458684.getClass(), "skillEffect", 0);
        setField(term458684, term458684.getClass(), "placeName", null);
        setIntField(term458684, term458684.getClass(), "commonId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term458684, args);
    }

};


