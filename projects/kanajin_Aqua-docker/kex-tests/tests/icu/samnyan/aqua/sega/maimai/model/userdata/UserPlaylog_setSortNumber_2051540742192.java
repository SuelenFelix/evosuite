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
import java.lang.Long;

public class UserPlaylog_setSortNumber_2051540742192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4002739;
     Object term4002793;

    public UserPlaylog_setSortNumber_2051540742192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4002739 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4002739, term4002739.getClass(), "id", 0L);
        setField(term4002739, term4002739.getClass(), "user", null);
        setIntField(term4002739, term4002739.getClass(), "orderId", 0);
        setLongField(term4002739, term4002739.getClass(), "sortNumber", 0L);
        setIntField(term4002739, term4002739.getClass(), "placeId", 0);
        setField(term4002739, term4002739.getClass(), "placeName", null);
        setField(term4002739, term4002739.getClass(), "country", null);
        setIntField(term4002739, term4002739.getClass(), "regionId", 0);
        setField(term4002739, term4002739.getClass(), "playDate", null);
        setField(term4002739, term4002739.getClass(), "userPlayDate", null);
        setIntField(term4002739, term4002739.getClass(), "musicId", 0);
        setIntField(term4002739, term4002739.getClass(), "level", 0);
        setIntField(term4002739, term4002739.getClass(), "gameMode", 0);
        setIntField(term4002739, term4002739.getClass(), "rivalNum", 0);
        setIntField(term4002739, term4002739.getClass(), "track", 0);
        setIntField(term4002739, term4002739.getClass(), "eventId", 0);
        setBooleanField(term4002739, term4002739.getClass(), "isFreeToPlay", false);
        setIntField(term4002739, term4002739.getClass(), "playerRating", 0);
        setLongField(term4002739, term4002739.getClass(), "playedUserId1", 0L);
        setField(term4002739, term4002739.getClass(), "playedUserName1", null);
        setIntField(term4002739, term4002739.getClass(), "playedMusicLevel1", 0);
        setLongField(term4002739, term4002739.getClass(), "playedUserId2", 0L);
        setField(term4002739, term4002739.getClass(), "playedUserName2", null);
        setIntField(term4002739, term4002739.getClass(), "playedMusicLevel2", 0);
        setLongField(term4002739, term4002739.getClass(), "playedUserId3", 0L);
        setField(term4002739, term4002739.getClass(), "playedUserName3", null);
        setIntField(term4002739, term4002739.getClass(), "playedMusicLevel3", 0);
        setIntField(term4002739, term4002739.getClass(), "achievement", 0);
        setIntField(term4002739, term4002739.getClass(), "score", 0);
        setIntField(term4002739, term4002739.getClass(), "tapScore", 0);
        setIntField(term4002739, term4002739.getClass(), "holdScore", 0);
        setIntField(term4002739, term4002739.getClass(), "slideScore", 0);
        setIntField(term4002739, term4002739.getClass(), "breakScore", 0);
        setIntField(term4002739, term4002739.getClass(), "syncRate", 0);
        setIntField(term4002739, term4002739.getClass(), "vsWin", 0);
        setBooleanField(term4002739, term4002739.getClass(), "isAllPerfect", false);
        setIntField(term4002739, term4002739.getClass(), "fullCombo", 0);
        setIntField(term4002739, term4002739.getClass(), "maxFever", 0);
        setIntField(term4002739, term4002739.getClass(), "maxCombo", 0);
        setIntField(term4002739, term4002739.getClass(), "tapPerfect", 0);
        setIntField(term4002739, term4002739.getClass(), "tapGreat", 0);
        setIntField(term4002739, term4002739.getClass(), "tapGood", 0);
        setIntField(term4002739, term4002739.getClass(), "tapBad", 0);
        setIntField(term4002739, term4002739.getClass(), "holdPerfect", 0);
        setIntField(term4002739, term4002739.getClass(), "holdGreat", 0);
        setIntField(term4002739, term4002739.getClass(), "holdGood", 0);
        setIntField(term4002739, term4002739.getClass(), "holdBad", 0);
        setIntField(term4002739, term4002739.getClass(), "slidePerfect", 0);
        setIntField(term4002739, term4002739.getClass(), "slideGreat", 0);
        setIntField(term4002739, term4002739.getClass(), "slideGood", 0);
        setIntField(term4002739, term4002739.getClass(), "slideBad", 0);
        setIntField(term4002739, term4002739.getClass(), "breakPerfect", 0);
        setIntField(term4002739, term4002739.getClass(), "breakGreat", 0);
        setIntField(term4002739, term4002739.getClass(), "breakGood", 0);
        setIntField(term4002739, term4002739.getClass(), "breakBad", 0);
        setBooleanField(term4002739, term4002739.getClass(), "isTrackSkip", false);
        setBooleanField(term4002739, term4002739.getClass(), "isHighScore", false);
        setBooleanField(term4002739, term4002739.getClass(), "isChallengeTrack", false);
        setIntField(term4002739, term4002739.getClass(), "challengeLife", 0);
        setIntField(term4002739, term4002739.getClass(), "challengeRemain", 0);
        setIntField(term4002739, term4002739.getClass(), "isAllPerfectPlus", 0);
        term4002793 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4002793;
        callMethod(klass, "setSortNumber", argTypes, term4002739, args);
    }

};


