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

public class UserPlaylog_getTapGood_1910382043169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4001493;

    public UserPlaylog_getTapGood_1910382043169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4001493 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4001493, term4001493.getClass(), "id", 0L);
        setField(term4001493, term4001493.getClass(), "user", null);
        setIntField(term4001493, term4001493.getClass(), "orderId", 0);
        setLongField(term4001493, term4001493.getClass(), "sortNumber", 0L);
        setIntField(term4001493, term4001493.getClass(), "placeId", 0);
        setField(term4001493, term4001493.getClass(), "placeName", null);
        setField(term4001493, term4001493.getClass(), "country", null);
        setIntField(term4001493, term4001493.getClass(), "regionId", 0);
        setField(term4001493, term4001493.getClass(), "playDate", null);
        setField(term4001493, term4001493.getClass(), "userPlayDate", null);
        setIntField(term4001493, term4001493.getClass(), "musicId", 0);
        setIntField(term4001493, term4001493.getClass(), "level", 0);
        setIntField(term4001493, term4001493.getClass(), "gameMode", 0);
        setIntField(term4001493, term4001493.getClass(), "rivalNum", 0);
        setIntField(term4001493, term4001493.getClass(), "track", 0);
        setIntField(term4001493, term4001493.getClass(), "eventId", 0);
        setBooleanField(term4001493, term4001493.getClass(), "isFreeToPlay", false);
        setIntField(term4001493, term4001493.getClass(), "playerRating", 0);
        setLongField(term4001493, term4001493.getClass(), "playedUserId1", 0L);
        setField(term4001493, term4001493.getClass(), "playedUserName1", null);
        setIntField(term4001493, term4001493.getClass(), "playedMusicLevel1", 0);
        setLongField(term4001493, term4001493.getClass(), "playedUserId2", 0L);
        setField(term4001493, term4001493.getClass(), "playedUserName2", null);
        setIntField(term4001493, term4001493.getClass(), "playedMusicLevel2", 0);
        setLongField(term4001493, term4001493.getClass(), "playedUserId3", 0L);
        setField(term4001493, term4001493.getClass(), "playedUserName3", null);
        setIntField(term4001493, term4001493.getClass(), "playedMusicLevel3", 0);
        setIntField(term4001493, term4001493.getClass(), "achievement", 0);
        setIntField(term4001493, term4001493.getClass(), "score", 0);
        setIntField(term4001493, term4001493.getClass(), "tapScore", 0);
        setIntField(term4001493, term4001493.getClass(), "holdScore", 0);
        setIntField(term4001493, term4001493.getClass(), "slideScore", 0);
        setIntField(term4001493, term4001493.getClass(), "breakScore", 0);
        setIntField(term4001493, term4001493.getClass(), "syncRate", 0);
        setIntField(term4001493, term4001493.getClass(), "vsWin", 0);
        setBooleanField(term4001493, term4001493.getClass(), "isAllPerfect", false);
        setIntField(term4001493, term4001493.getClass(), "fullCombo", 0);
        setIntField(term4001493, term4001493.getClass(), "maxFever", 0);
        setIntField(term4001493, term4001493.getClass(), "maxCombo", 0);
        setIntField(term4001493, term4001493.getClass(), "tapPerfect", 0);
        setIntField(term4001493, term4001493.getClass(), "tapGreat", 0);
        setIntField(term4001493, term4001493.getClass(), "tapGood", 0);
        setIntField(term4001493, term4001493.getClass(), "tapBad", 0);
        setIntField(term4001493, term4001493.getClass(), "holdPerfect", 0);
        setIntField(term4001493, term4001493.getClass(), "holdGreat", 0);
        setIntField(term4001493, term4001493.getClass(), "holdGood", 0);
        setIntField(term4001493, term4001493.getClass(), "holdBad", 0);
        setIntField(term4001493, term4001493.getClass(), "slidePerfect", 0);
        setIntField(term4001493, term4001493.getClass(), "slideGreat", 0);
        setIntField(term4001493, term4001493.getClass(), "slideGood", 0);
        setIntField(term4001493, term4001493.getClass(), "slideBad", 0);
        setIntField(term4001493, term4001493.getClass(), "breakPerfect", 0);
        setIntField(term4001493, term4001493.getClass(), "breakGreat", 0);
        setIntField(term4001493, term4001493.getClass(), "breakGood", 0);
        setIntField(term4001493, term4001493.getClass(), "breakBad", 0);
        setBooleanField(term4001493, term4001493.getClass(), "isTrackSkip", false);
        setBooleanField(term4001493, term4001493.getClass(), "isHighScore", false);
        setBooleanField(term4001493, term4001493.getClass(), "isChallengeTrack", false);
        setIntField(term4001493, term4001493.getClass(), "challengeLife", 0);
        setIntField(term4001493, term4001493.getClass(), "challengeRemain", 0);
        setIntField(term4001493, term4001493.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTapGood", argTypes, term4001493, args);
    }

};


