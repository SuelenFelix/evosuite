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

public class UserPlaylog_getTapGreat_323463163168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175073;

    public UserPlaylog_getTapGreat_323463163168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175073 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term175073, term175073.getClass(), "id", 0L);
        setField(term175073, term175073.getClass(), "user", null);
        setIntField(term175073, term175073.getClass(), "orderId", 0);
        setLongField(term175073, term175073.getClass(), "sortNumber", 0L);
        setIntField(term175073, term175073.getClass(), "placeId", 0);
        setField(term175073, term175073.getClass(), "placeName", null);
        setField(term175073, term175073.getClass(), "country", null);
        setIntField(term175073, term175073.getClass(), "regionId", 0);
        setField(term175073, term175073.getClass(), "playDate", null);
        setField(term175073, term175073.getClass(), "userPlayDate", null);
        setIntField(term175073, term175073.getClass(), "musicId", 0);
        setIntField(term175073, term175073.getClass(), "level", 0);
        setIntField(term175073, term175073.getClass(), "gameMode", 0);
        setIntField(term175073, term175073.getClass(), "rivalNum", 0);
        setIntField(term175073, term175073.getClass(), "track", 0);
        setIntField(term175073, term175073.getClass(), "eventId", 0);
        setBooleanField(term175073, term175073.getClass(), "isFreeToPlay", false);
        setIntField(term175073, term175073.getClass(), "playerRating", 0);
        setLongField(term175073, term175073.getClass(), "playedUserId1", 0L);
        setField(term175073, term175073.getClass(), "playedUserName1", null);
        setIntField(term175073, term175073.getClass(), "playedMusicLevel1", 0);
        setLongField(term175073, term175073.getClass(), "playedUserId2", 0L);
        setField(term175073, term175073.getClass(), "playedUserName2", null);
        setIntField(term175073, term175073.getClass(), "playedMusicLevel2", 0);
        setLongField(term175073, term175073.getClass(), "playedUserId3", 0L);
        setField(term175073, term175073.getClass(), "playedUserName3", null);
        setIntField(term175073, term175073.getClass(), "playedMusicLevel3", 0);
        setIntField(term175073, term175073.getClass(), "achievement", 0);
        setIntField(term175073, term175073.getClass(), "score", 0);
        setIntField(term175073, term175073.getClass(), "tapScore", 0);
        setIntField(term175073, term175073.getClass(), "holdScore", 0);
        setIntField(term175073, term175073.getClass(), "slideScore", 0);
        setIntField(term175073, term175073.getClass(), "breakScore", 0);
        setIntField(term175073, term175073.getClass(), "syncRate", 0);
        setIntField(term175073, term175073.getClass(), "vsWin", 0);
        setBooleanField(term175073, term175073.getClass(), "isAllPerfect", false);
        setIntField(term175073, term175073.getClass(), "fullCombo", 0);
        setIntField(term175073, term175073.getClass(), "maxFever", 0);
        setIntField(term175073, term175073.getClass(), "maxCombo", 0);
        setIntField(term175073, term175073.getClass(), "tapPerfect", 0);
        setIntField(term175073, term175073.getClass(), "tapGreat", 0);
        setIntField(term175073, term175073.getClass(), "tapGood", 0);
        setIntField(term175073, term175073.getClass(), "tapBad", 0);
        setIntField(term175073, term175073.getClass(), "holdPerfect", 0);
        setIntField(term175073, term175073.getClass(), "holdGreat", 0);
        setIntField(term175073, term175073.getClass(), "holdGood", 0);
        setIntField(term175073, term175073.getClass(), "holdBad", 0);
        setIntField(term175073, term175073.getClass(), "slidePerfect", 0);
        setIntField(term175073, term175073.getClass(), "slideGreat", 0);
        setIntField(term175073, term175073.getClass(), "slideGood", 0);
        setIntField(term175073, term175073.getClass(), "slideBad", 0);
        setIntField(term175073, term175073.getClass(), "breakPerfect", 0);
        setIntField(term175073, term175073.getClass(), "breakGreat", 0);
        setIntField(term175073, term175073.getClass(), "breakGood", 0);
        setIntField(term175073, term175073.getClass(), "breakBad", 0);
        setBooleanField(term175073, term175073.getClass(), "isTrackSkip", false);
        setBooleanField(term175073, term175073.getClass(), "isHighScore", false);
        setBooleanField(term175073, term175073.getClass(), "isChallengeTrack", false);
        setIntField(term175073, term175073.getClass(), "challengeLife", 0);
        setIntField(term175073, term175073.getClass(), "challengeRemain", 0);
        setIntField(term175073, term175073.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTapGreat", argTypes, term175073, args);
    }

};


