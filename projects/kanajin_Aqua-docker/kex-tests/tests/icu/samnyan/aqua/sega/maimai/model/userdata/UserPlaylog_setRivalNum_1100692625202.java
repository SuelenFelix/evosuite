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

public class UserPlaylog_setRivalNum_1100692625202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4003291;
     Object term4003345;

    public UserPlaylog_setRivalNum_1100692625202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4003291 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4003291, term4003291.getClass(), "id", 0L);
        setField(term4003291, term4003291.getClass(), "user", null);
        setIntField(term4003291, term4003291.getClass(), "orderId", 0);
        setLongField(term4003291, term4003291.getClass(), "sortNumber", 0L);
        setIntField(term4003291, term4003291.getClass(), "placeId", 0);
        setField(term4003291, term4003291.getClass(), "placeName", null);
        setField(term4003291, term4003291.getClass(), "country", null);
        setIntField(term4003291, term4003291.getClass(), "regionId", 0);
        setField(term4003291, term4003291.getClass(), "playDate", null);
        setField(term4003291, term4003291.getClass(), "userPlayDate", null);
        setIntField(term4003291, term4003291.getClass(), "musicId", 0);
        setIntField(term4003291, term4003291.getClass(), "level", 0);
        setIntField(term4003291, term4003291.getClass(), "gameMode", 0);
        setIntField(term4003291, term4003291.getClass(), "rivalNum", 0);
        setIntField(term4003291, term4003291.getClass(), "track", 0);
        setIntField(term4003291, term4003291.getClass(), "eventId", 0);
        setBooleanField(term4003291, term4003291.getClass(), "isFreeToPlay", false);
        setIntField(term4003291, term4003291.getClass(), "playerRating", 0);
        setLongField(term4003291, term4003291.getClass(), "playedUserId1", 0L);
        setField(term4003291, term4003291.getClass(), "playedUserName1", null);
        setIntField(term4003291, term4003291.getClass(), "playedMusicLevel1", 0);
        setLongField(term4003291, term4003291.getClass(), "playedUserId2", 0L);
        setField(term4003291, term4003291.getClass(), "playedUserName2", null);
        setIntField(term4003291, term4003291.getClass(), "playedMusicLevel2", 0);
        setLongField(term4003291, term4003291.getClass(), "playedUserId3", 0L);
        setField(term4003291, term4003291.getClass(), "playedUserName3", null);
        setIntField(term4003291, term4003291.getClass(), "playedMusicLevel3", 0);
        setIntField(term4003291, term4003291.getClass(), "achievement", 0);
        setIntField(term4003291, term4003291.getClass(), "score", 0);
        setIntField(term4003291, term4003291.getClass(), "tapScore", 0);
        setIntField(term4003291, term4003291.getClass(), "holdScore", 0);
        setIntField(term4003291, term4003291.getClass(), "slideScore", 0);
        setIntField(term4003291, term4003291.getClass(), "breakScore", 0);
        setIntField(term4003291, term4003291.getClass(), "syncRate", 0);
        setIntField(term4003291, term4003291.getClass(), "vsWin", 0);
        setBooleanField(term4003291, term4003291.getClass(), "isAllPerfect", false);
        setIntField(term4003291, term4003291.getClass(), "fullCombo", 0);
        setIntField(term4003291, term4003291.getClass(), "maxFever", 0);
        setIntField(term4003291, term4003291.getClass(), "maxCombo", 0);
        setIntField(term4003291, term4003291.getClass(), "tapPerfect", 0);
        setIntField(term4003291, term4003291.getClass(), "tapGreat", 0);
        setIntField(term4003291, term4003291.getClass(), "tapGood", 0);
        setIntField(term4003291, term4003291.getClass(), "tapBad", 0);
        setIntField(term4003291, term4003291.getClass(), "holdPerfect", 0);
        setIntField(term4003291, term4003291.getClass(), "holdGreat", 0);
        setIntField(term4003291, term4003291.getClass(), "holdGood", 0);
        setIntField(term4003291, term4003291.getClass(), "holdBad", 0);
        setIntField(term4003291, term4003291.getClass(), "slidePerfect", 0);
        setIntField(term4003291, term4003291.getClass(), "slideGreat", 0);
        setIntField(term4003291, term4003291.getClass(), "slideGood", 0);
        setIntField(term4003291, term4003291.getClass(), "slideBad", 0);
        setIntField(term4003291, term4003291.getClass(), "breakPerfect", 0);
        setIntField(term4003291, term4003291.getClass(), "breakGreat", 0);
        setIntField(term4003291, term4003291.getClass(), "breakGood", 0);
        setIntField(term4003291, term4003291.getClass(), "breakBad", 0);
        setBooleanField(term4003291, term4003291.getClass(), "isTrackSkip", false);
        setBooleanField(term4003291, term4003291.getClass(), "isHighScore", false);
        setBooleanField(term4003291, term4003291.getClass(), "isChallengeTrack", false);
        setIntField(term4003291, term4003291.getClass(), "challengeLife", 0);
        setIntField(term4003291, term4003291.getClass(), "challengeRemain", 0);
        setIntField(term4003291, term4003291.getClass(), "isAllPerfectPlus", 0);
        term4003345 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4003345;
        callMethod(klass, "setRivalNum", argTypes, term4003291, args);
    }

};


