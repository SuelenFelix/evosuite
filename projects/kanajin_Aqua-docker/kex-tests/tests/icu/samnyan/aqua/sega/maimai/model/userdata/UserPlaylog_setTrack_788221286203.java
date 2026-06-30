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
import java.lang.Integer;

public class UserPlaylog_setTrack_788221286203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176981;
     Object term177035;

    public UserPlaylog_setTrack_788221286203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176981 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176981, term176981.getClass(), "id", 0L);
        setField(term176981, term176981.getClass(), "user", null);
        setIntField(term176981, term176981.getClass(), "orderId", 0);
        setLongField(term176981, term176981.getClass(), "sortNumber", 0L);
        setIntField(term176981, term176981.getClass(), "placeId", 0);
        setField(term176981, term176981.getClass(), "placeName", null);
        setField(term176981, term176981.getClass(), "country", null);
        setIntField(term176981, term176981.getClass(), "regionId", 0);
        setField(term176981, term176981.getClass(), "playDate", null);
        setField(term176981, term176981.getClass(), "userPlayDate", null);
        setIntField(term176981, term176981.getClass(), "musicId", 0);
        setIntField(term176981, term176981.getClass(), "level", 0);
        setIntField(term176981, term176981.getClass(), "gameMode", 0);
        setIntField(term176981, term176981.getClass(), "rivalNum", 0);
        setIntField(term176981, term176981.getClass(), "track", 0);
        setIntField(term176981, term176981.getClass(), "eventId", 0);
        setBooleanField(term176981, term176981.getClass(), "isFreeToPlay", false);
        setIntField(term176981, term176981.getClass(), "playerRating", 0);
        setLongField(term176981, term176981.getClass(), "playedUserId1", 0L);
        setField(term176981, term176981.getClass(), "playedUserName1", null);
        setIntField(term176981, term176981.getClass(), "playedMusicLevel1", 0);
        setLongField(term176981, term176981.getClass(), "playedUserId2", 0L);
        setField(term176981, term176981.getClass(), "playedUserName2", null);
        setIntField(term176981, term176981.getClass(), "playedMusicLevel2", 0);
        setLongField(term176981, term176981.getClass(), "playedUserId3", 0L);
        setField(term176981, term176981.getClass(), "playedUserName3", null);
        setIntField(term176981, term176981.getClass(), "playedMusicLevel3", 0);
        setIntField(term176981, term176981.getClass(), "achievement", 0);
        setIntField(term176981, term176981.getClass(), "score", 0);
        setIntField(term176981, term176981.getClass(), "tapScore", 0);
        setIntField(term176981, term176981.getClass(), "holdScore", 0);
        setIntField(term176981, term176981.getClass(), "slideScore", 0);
        setIntField(term176981, term176981.getClass(), "breakScore", 0);
        setIntField(term176981, term176981.getClass(), "syncRate", 0);
        setIntField(term176981, term176981.getClass(), "vsWin", 0);
        setBooleanField(term176981, term176981.getClass(), "isAllPerfect", false);
        setIntField(term176981, term176981.getClass(), "fullCombo", 0);
        setIntField(term176981, term176981.getClass(), "maxFever", 0);
        setIntField(term176981, term176981.getClass(), "maxCombo", 0);
        setIntField(term176981, term176981.getClass(), "tapPerfect", 0);
        setIntField(term176981, term176981.getClass(), "tapGreat", 0);
        setIntField(term176981, term176981.getClass(), "tapGood", 0);
        setIntField(term176981, term176981.getClass(), "tapBad", 0);
        setIntField(term176981, term176981.getClass(), "holdPerfect", 0);
        setIntField(term176981, term176981.getClass(), "holdGreat", 0);
        setIntField(term176981, term176981.getClass(), "holdGood", 0);
        setIntField(term176981, term176981.getClass(), "holdBad", 0);
        setIntField(term176981, term176981.getClass(), "slidePerfect", 0);
        setIntField(term176981, term176981.getClass(), "slideGreat", 0);
        setIntField(term176981, term176981.getClass(), "slideGood", 0);
        setIntField(term176981, term176981.getClass(), "slideBad", 0);
        setIntField(term176981, term176981.getClass(), "breakPerfect", 0);
        setIntField(term176981, term176981.getClass(), "breakGreat", 0);
        setIntField(term176981, term176981.getClass(), "breakGood", 0);
        setIntField(term176981, term176981.getClass(), "breakBad", 0);
        setBooleanField(term176981, term176981.getClass(), "isTrackSkip", false);
        setBooleanField(term176981, term176981.getClass(), "isHighScore", false);
        setBooleanField(term176981, term176981.getClass(), "isChallengeTrack", false);
        setIntField(term176981, term176981.getClass(), "challengeLife", 0);
        setIntField(term176981, term176981.getClass(), "challengeRemain", 0);
        setIntField(term176981, term176981.getClass(), "isAllPerfectPlus", 0);
        term177035 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177035;
        callMethod(klass, "setTrack", argTypes, term176981, args);
    }

};


