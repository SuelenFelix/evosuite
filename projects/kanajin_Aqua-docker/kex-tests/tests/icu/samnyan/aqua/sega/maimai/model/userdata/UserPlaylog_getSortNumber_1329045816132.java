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

public class UserPlaylog_getSortNumber_1329045816132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173131;

    public UserPlaylog_getSortNumber_1329045816132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173131 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173131, term173131.getClass(), "id", 0L);
        setField(term173131, term173131.getClass(), "user", null);
        setIntField(term173131, term173131.getClass(), "orderId", 0);
        setLongField(term173131, term173131.getClass(), "sortNumber", 0L);
        setIntField(term173131, term173131.getClass(), "placeId", 0);
        setField(term173131, term173131.getClass(), "placeName", null);
        setField(term173131, term173131.getClass(), "country", null);
        setIntField(term173131, term173131.getClass(), "regionId", 0);
        setField(term173131, term173131.getClass(), "playDate", null);
        setField(term173131, term173131.getClass(), "userPlayDate", null);
        setIntField(term173131, term173131.getClass(), "musicId", 0);
        setIntField(term173131, term173131.getClass(), "level", 0);
        setIntField(term173131, term173131.getClass(), "gameMode", 0);
        setIntField(term173131, term173131.getClass(), "rivalNum", 0);
        setIntField(term173131, term173131.getClass(), "track", 0);
        setIntField(term173131, term173131.getClass(), "eventId", 0);
        setBooleanField(term173131, term173131.getClass(), "isFreeToPlay", false);
        setIntField(term173131, term173131.getClass(), "playerRating", 0);
        setLongField(term173131, term173131.getClass(), "playedUserId1", 0L);
        setField(term173131, term173131.getClass(), "playedUserName1", null);
        setIntField(term173131, term173131.getClass(), "playedMusicLevel1", 0);
        setLongField(term173131, term173131.getClass(), "playedUserId2", 0L);
        setField(term173131, term173131.getClass(), "playedUserName2", null);
        setIntField(term173131, term173131.getClass(), "playedMusicLevel2", 0);
        setLongField(term173131, term173131.getClass(), "playedUserId3", 0L);
        setField(term173131, term173131.getClass(), "playedUserName3", null);
        setIntField(term173131, term173131.getClass(), "playedMusicLevel3", 0);
        setIntField(term173131, term173131.getClass(), "achievement", 0);
        setIntField(term173131, term173131.getClass(), "score", 0);
        setIntField(term173131, term173131.getClass(), "tapScore", 0);
        setIntField(term173131, term173131.getClass(), "holdScore", 0);
        setIntField(term173131, term173131.getClass(), "slideScore", 0);
        setIntField(term173131, term173131.getClass(), "breakScore", 0);
        setIntField(term173131, term173131.getClass(), "syncRate", 0);
        setIntField(term173131, term173131.getClass(), "vsWin", 0);
        setBooleanField(term173131, term173131.getClass(), "isAllPerfect", false);
        setIntField(term173131, term173131.getClass(), "fullCombo", 0);
        setIntField(term173131, term173131.getClass(), "maxFever", 0);
        setIntField(term173131, term173131.getClass(), "maxCombo", 0);
        setIntField(term173131, term173131.getClass(), "tapPerfect", 0);
        setIntField(term173131, term173131.getClass(), "tapGreat", 0);
        setIntField(term173131, term173131.getClass(), "tapGood", 0);
        setIntField(term173131, term173131.getClass(), "tapBad", 0);
        setIntField(term173131, term173131.getClass(), "holdPerfect", 0);
        setIntField(term173131, term173131.getClass(), "holdGreat", 0);
        setIntField(term173131, term173131.getClass(), "holdGood", 0);
        setIntField(term173131, term173131.getClass(), "holdBad", 0);
        setIntField(term173131, term173131.getClass(), "slidePerfect", 0);
        setIntField(term173131, term173131.getClass(), "slideGreat", 0);
        setIntField(term173131, term173131.getClass(), "slideGood", 0);
        setIntField(term173131, term173131.getClass(), "slideBad", 0);
        setIntField(term173131, term173131.getClass(), "breakPerfect", 0);
        setIntField(term173131, term173131.getClass(), "breakGreat", 0);
        setIntField(term173131, term173131.getClass(), "breakGood", 0);
        setIntField(term173131, term173131.getClass(), "breakBad", 0);
        setBooleanField(term173131, term173131.getClass(), "isTrackSkip", false);
        setBooleanField(term173131, term173131.getClass(), "isHighScore", false);
        setBooleanField(term173131, term173131.getClass(), "isChallengeTrack", false);
        setIntField(term173131, term173131.getClass(), "challengeLife", 0);
        setIntField(term173131, term173131.getClass(), "challengeRemain", 0);
        setIntField(term173131, term173131.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortNumber", argTypes, term173131, args);
    }

};


