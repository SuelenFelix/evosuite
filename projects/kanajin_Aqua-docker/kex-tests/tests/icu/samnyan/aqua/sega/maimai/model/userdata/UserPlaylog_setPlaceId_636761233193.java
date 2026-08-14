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

public class UserPlaylog_setPlaceId_636761233193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4002795;
     Object term4002849;

    public UserPlaylog_setPlaceId_636761233193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4002795 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4002795, term4002795.getClass(), "id", 0L);
        setField(term4002795, term4002795.getClass(), "user", null);
        setIntField(term4002795, term4002795.getClass(), "orderId", 0);
        setLongField(term4002795, term4002795.getClass(), "sortNumber", 0L);
        setIntField(term4002795, term4002795.getClass(), "placeId", 0);
        setField(term4002795, term4002795.getClass(), "placeName", null);
        setField(term4002795, term4002795.getClass(), "country", null);
        setIntField(term4002795, term4002795.getClass(), "regionId", 0);
        setField(term4002795, term4002795.getClass(), "playDate", null);
        setField(term4002795, term4002795.getClass(), "userPlayDate", null);
        setIntField(term4002795, term4002795.getClass(), "musicId", 0);
        setIntField(term4002795, term4002795.getClass(), "level", 0);
        setIntField(term4002795, term4002795.getClass(), "gameMode", 0);
        setIntField(term4002795, term4002795.getClass(), "rivalNum", 0);
        setIntField(term4002795, term4002795.getClass(), "track", 0);
        setIntField(term4002795, term4002795.getClass(), "eventId", 0);
        setBooleanField(term4002795, term4002795.getClass(), "isFreeToPlay", false);
        setIntField(term4002795, term4002795.getClass(), "playerRating", 0);
        setLongField(term4002795, term4002795.getClass(), "playedUserId1", 0L);
        setField(term4002795, term4002795.getClass(), "playedUserName1", null);
        setIntField(term4002795, term4002795.getClass(), "playedMusicLevel1", 0);
        setLongField(term4002795, term4002795.getClass(), "playedUserId2", 0L);
        setField(term4002795, term4002795.getClass(), "playedUserName2", null);
        setIntField(term4002795, term4002795.getClass(), "playedMusicLevel2", 0);
        setLongField(term4002795, term4002795.getClass(), "playedUserId3", 0L);
        setField(term4002795, term4002795.getClass(), "playedUserName3", null);
        setIntField(term4002795, term4002795.getClass(), "playedMusicLevel3", 0);
        setIntField(term4002795, term4002795.getClass(), "achievement", 0);
        setIntField(term4002795, term4002795.getClass(), "score", 0);
        setIntField(term4002795, term4002795.getClass(), "tapScore", 0);
        setIntField(term4002795, term4002795.getClass(), "holdScore", 0);
        setIntField(term4002795, term4002795.getClass(), "slideScore", 0);
        setIntField(term4002795, term4002795.getClass(), "breakScore", 0);
        setIntField(term4002795, term4002795.getClass(), "syncRate", 0);
        setIntField(term4002795, term4002795.getClass(), "vsWin", 0);
        setBooleanField(term4002795, term4002795.getClass(), "isAllPerfect", false);
        setIntField(term4002795, term4002795.getClass(), "fullCombo", 0);
        setIntField(term4002795, term4002795.getClass(), "maxFever", 0);
        setIntField(term4002795, term4002795.getClass(), "maxCombo", 0);
        setIntField(term4002795, term4002795.getClass(), "tapPerfect", 0);
        setIntField(term4002795, term4002795.getClass(), "tapGreat", 0);
        setIntField(term4002795, term4002795.getClass(), "tapGood", 0);
        setIntField(term4002795, term4002795.getClass(), "tapBad", 0);
        setIntField(term4002795, term4002795.getClass(), "holdPerfect", 0);
        setIntField(term4002795, term4002795.getClass(), "holdGreat", 0);
        setIntField(term4002795, term4002795.getClass(), "holdGood", 0);
        setIntField(term4002795, term4002795.getClass(), "holdBad", 0);
        setIntField(term4002795, term4002795.getClass(), "slidePerfect", 0);
        setIntField(term4002795, term4002795.getClass(), "slideGreat", 0);
        setIntField(term4002795, term4002795.getClass(), "slideGood", 0);
        setIntField(term4002795, term4002795.getClass(), "slideBad", 0);
        setIntField(term4002795, term4002795.getClass(), "breakPerfect", 0);
        setIntField(term4002795, term4002795.getClass(), "breakGreat", 0);
        setIntField(term4002795, term4002795.getClass(), "breakGood", 0);
        setIntField(term4002795, term4002795.getClass(), "breakBad", 0);
        setBooleanField(term4002795, term4002795.getClass(), "isTrackSkip", false);
        setBooleanField(term4002795, term4002795.getClass(), "isHighScore", false);
        setBooleanField(term4002795, term4002795.getClass(), "isChallengeTrack", false);
        setIntField(term4002795, term4002795.getClass(), "challengeLife", 0);
        setIntField(term4002795, term4002795.getClass(), "challengeRemain", 0);
        setIntField(term4002795, term4002795.getClass(), "isAllPerfectPlus", 0);
        term4002849 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4002849;
        callMethod(klass, "setPlaceId", argTypes, term4002795, args);
    }

};


