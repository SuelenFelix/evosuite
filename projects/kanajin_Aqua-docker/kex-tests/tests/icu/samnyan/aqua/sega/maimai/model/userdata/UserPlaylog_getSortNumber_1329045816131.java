package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserPlaylog_getSortNumber_1329045816131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173075;

    public UserPlaylog_getSortNumber_1329045816131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173075 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173075, term173075.getClass(), "id", 0L);
        setField(term173075, term173075.getClass(), "user", null);
        setIntField(term173075, term173075.getClass(), "orderId", 0);
        setLongField(term173075, term173075.getClass(), "sortNumber", 0L);
        setIntField(term173075, term173075.getClass(), "placeId", 0);
        setField(term173075, term173075.getClass(), "placeName", null);
        setField(term173075, term173075.getClass(), "country", null);
        setIntField(term173075, term173075.getClass(), "regionId", 0);
        setField(term173075, term173075.getClass(), "playDate", null);
        setField(term173075, term173075.getClass(), "userPlayDate", null);
        setIntField(term173075, term173075.getClass(), "musicId", 0);
        setIntField(term173075, term173075.getClass(), "level", 0);
        setIntField(term173075, term173075.getClass(), "gameMode", 0);
        setIntField(term173075, term173075.getClass(), "rivalNum", 0);
        setIntField(term173075, term173075.getClass(), "track", 0);
        setIntField(term173075, term173075.getClass(), "eventId", 0);
        setBooleanField(term173075, term173075.getClass(), "isFreeToPlay", false);
        setIntField(term173075, term173075.getClass(), "playerRating", 0);
        setLongField(term173075, term173075.getClass(), "playedUserId1", 0L);
        setField(term173075, term173075.getClass(), "playedUserName1", null);
        setIntField(term173075, term173075.getClass(), "playedMusicLevel1", 0);
        setLongField(term173075, term173075.getClass(), "playedUserId2", 0L);
        setField(term173075, term173075.getClass(), "playedUserName2", null);
        setIntField(term173075, term173075.getClass(), "playedMusicLevel2", 0);
        setLongField(term173075, term173075.getClass(), "playedUserId3", 0L);
        setField(term173075, term173075.getClass(), "playedUserName3", null);
        setIntField(term173075, term173075.getClass(), "playedMusicLevel3", 0);
        setIntField(term173075, term173075.getClass(), "achievement", 0);
        setIntField(term173075, term173075.getClass(), "score", 0);
        setIntField(term173075, term173075.getClass(), "tapScore", 0);
        setIntField(term173075, term173075.getClass(), "holdScore", 0);
        setIntField(term173075, term173075.getClass(), "slideScore", 0);
        setIntField(term173075, term173075.getClass(), "breakScore", 0);
        setIntField(term173075, term173075.getClass(), "syncRate", 0);
        setIntField(term173075, term173075.getClass(), "vsWin", 0);
        setBooleanField(term173075, term173075.getClass(), "isAllPerfect", false);
        setIntField(term173075, term173075.getClass(), "fullCombo", 0);
        setIntField(term173075, term173075.getClass(), "maxFever", 0);
        setIntField(term173075, term173075.getClass(), "maxCombo", 0);
        setIntField(term173075, term173075.getClass(), "tapPerfect", 0);
        setIntField(term173075, term173075.getClass(), "tapGreat", 0);
        setIntField(term173075, term173075.getClass(), "tapGood", 0);
        setIntField(term173075, term173075.getClass(), "tapBad", 0);
        setIntField(term173075, term173075.getClass(), "holdPerfect", 0);
        setIntField(term173075, term173075.getClass(), "holdGreat", 0);
        setIntField(term173075, term173075.getClass(), "holdGood", 0);
        setIntField(term173075, term173075.getClass(), "holdBad", 0);
        setIntField(term173075, term173075.getClass(), "slidePerfect", 0);
        setIntField(term173075, term173075.getClass(), "slideGreat", 0);
        setIntField(term173075, term173075.getClass(), "slideGood", 0);
        setIntField(term173075, term173075.getClass(), "slideBad", 0);
        setIntField(term173075, term173075.getClass(), "breakPerfect", 0);
        setIntField(term173075, term173075.getClass(), "breakGreat", 0);
        setIntField(term173075, term173075.getClass(), "breakGood", 0);
        setIntField(term173075, term173075.getClass(), "breakBad", 0);
        setBooleanField(term173075, term173075.getClass(), "isTrackSkip", false);
        setBooleanField(term173075, term173075.getClass(), "isHighScore", false);
        setBooleanField(term173075, term173075.getClass(), "isChallengeTrack", false);
        setIntField(term173075, term173075.getClass(), "challengeLife", 0);
        setIntField(term173075, term173075.getClass(), "challengeRemain", 0);
        setIntField(term173075, term173075.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortNumber", argTypes, term173075, args);
    }

};


