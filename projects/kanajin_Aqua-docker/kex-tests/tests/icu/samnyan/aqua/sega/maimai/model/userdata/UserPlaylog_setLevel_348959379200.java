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

public class UserPlaylog_setLevel_348959379200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4003179;
     Object term4003233;

    public UserPlaylog_setLevel_348959379200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4003179 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4003179, term4003179.getClass(), "id", 0L);
        setField(term4003179, term4003179.getClass(), "user", null);
        setIntField(term4003179, term4003179.getClass(), "orderId", 0);
        setLongField(term4003179, term4003179.getClass(), "sortNumber", 0L);
        setIntField(term4003179, term4003179.getClass(), "placeId", 0);
        setField(term4003179, term4003179.getClass(), "placeName", null);
        setField(term4003179, term4003179.getClass(), "country", null);
        setIntField(term4003179, term4003179.getClass(), "regionId", 0);
        setField(term4003179, term4003179.getClass(), "playDate", null);
        setField(term4003179, term4003179.getClass(), "userPlayDate", null);
        setIntField(term4003179, term4003179.getClass(), "musicId", 0);
        setIntField(term4003179, term4003179.getClass(), "level", 0);
        setIntField(term4003179, term4003179.getClass(), "gameMode", 0);
        setIntField(term4003179, term4003179.getClass(), "rivalNum", 0);
        setIntField(term4003179, term4003179.getClass(), "track", 0);
        setIntField(term4003179, term4003179.getClass(), "eventId", 0);
        setBooleanField(term4003179, term4003179.getClass(), "isFreeToPlay", false);
        setIntField(term4003179, term4003179.getClass(), "playerRating", 0);
        setLongField(term4003179, term4003179.getClass(), "playedUserId1", 0L);
        setField(term4003179, term4003179.getClass(), "playedUserName1", null);
        setIntField(term4003179, term4003179.getClass(), "playedMusicLevel1", 0);
        setLongField(term4003179, term4003179.getClass(), "playedUserId2", 0L);
        setField(term4003179, term4003179.getClass(), "playedUserName2", null);
        setIntField(term4003179, term4003179.getClass(), "playedMusicLevel2", 0);
        setLongField(term4003179, term4003179.getClass(), "playedUserId3", 0L);
        setField(term4003179, term4003179.getClass(), "playedUserName3", null);
        setIntField(term4003179, term4003179.getClass(), "playedMusicLevel3", 0);
        setIntField(term4003179, term4003179.getClass(), "achievement", 0);
        setIntField(term4003179, term4003179.getClass(), "score", 0);
        setIntField(term4003179, term4003179.getClass(), "tapScore", 0);
        setIntField(term4003179, term4003179.getClass(), "holdScore", 0);
        setIntField(term4003179, term4003179.getClass(), "slideScore", 0);
        setIntField(term4003179, term4003179.getClass(), "breakScore", 0);
        setIntField(term4003179, term4003179.getClass(), "syncRate", 0);
        setIntField(term4003179, term4003179.getClass(), "vsWin", 0);
        setBooleanField(term4003179, term4003179.getClass(), "isAllPerfect", false);
        setIntField(term4003179, term4003179.getClass(), "fullCombo", 0);
        setIntField(term4003179, term4003179.getClass(), "maxFever", 0);
        setIntField(term4003179, term4003179.getClass(), "maxCombo", 0);
        setIntField(term4003179, term4003179.getClass(), "tapPerfect", 0);
        setIntField(term4003179, term4003179.getClass(), "tapGreat", 0);
        setIntField(term4003179, term4003179.getClass(), "tapGood", 0);
        setIntField(term4003179, term4003179.getClass(), "tapBad", 0);
        setIntField(term4003179, term4003179.getClass(), "holdPerfect", 0);
        setIntField(term4003179, term4003179.getClass(), "holdGreat", 0);
        setIntField(term4003179, term4003179.getClass(), "holdGood", 0);
        setIntField(term4003179, term4003179.getClass(), "holdBad", 0);
        setIntField(term4003179, term4003179.getClass(), "slidePerfect", 0);
        setIntField(term4003179, term4003179.getClass(), "slideGreat", 0);
        setIntField(term4003179, term4003179.getClass(), "slideGood", 0);
        setIntField(term4003179, term4003179.getClass(), "slideBad", 0);
        setIntField(term4003179, term4003179.getClass(), "breakPerfect", 0);
        setIntField(term4003179, term4003179.getClass(), "breakGreat", 0);
        setIntField(term4003179, term4003179.getClass(), "breakGood", 0);
        setIntField(term4003179, term4003179.getClass(), "breakBad", 0);
        setBooleanField(term4003179, term4003179.getClass(), "isTrackSkip", false);
        setBooleanField(term4003179, term4003179.getClass(), "isHighScore", false);
        setBooleanField(term4003179, term4003179.getClass(), "isChallengeTrack", false);
        setIntField(term4003179, term4003179.getClass(), "challengeLife", 0);
        setIntField(term4003179, term4003179.getClass(), "challengeRemain", 0);
        setIntField(term4003179, term4003179.getClass(), "isAllPerfectPlus", 0);
        term4003233 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4003233;
        callMethod(klass, "setLevel", argTypes, term4003179, args);
    }

};


