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

public class UserPlaylog_setSyncRate_161128402223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178095;
     Object term178149;

    public UserPlaylog_setSyncRate_161128402223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178095 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term178095, term178095.getClass(), "id", 0L);
        setField(term178095, term178095.getClass(), "user", null);
        setIntField(term178095, term178095.getClass(), "orderId", 0);
        setLongField(term178095, term178095.getClass(), "sortNumber", 0L);
        setIntField(term178095, term178095.getClass(), "placeId", 0);
        setField(term178095, term178095.getClass(), "placeName", null);
        setField(term178095, term178095.getClass(), "country", null);
        setIntField(term178095, term178095.getClass(), "regionId", 0);
        setField(term178095, term178095.getClass(), "playDate", null);
        setField(term178095, term178095.getClass(), "userPlayDate", null);
        setIntField(term178095, term178095.getClass(), "musicId", 0);
        setIntField(term178095, term178095.getClass(), "level", 0);
        setIntField(term178095, term178095.getClass(), "gameMode", 0);
        setIntField(term178095, term178095.getClass(), "rivalNum", 0);
        setIntField(term178095, term178095.getClass(), "track", 0);
        setIntField(term178095, term178095.getClass(), "eventId", 0);
        setBooleanField(term178095, term178095.getClass(), "isFreeToPlay", false);
        setIntField(term178095, term178095.getClass(), "playerRating", 0);
        setLongField(term178095, term178095.getClass(), "playedUserId1", 0L);
        setField(term178095, term178095.getClass(), "playedUserName1", null);
        setIntField(term178095, term178095.getClass(), "playedMusicLevel1", 0);
        setLongField(term178095, term178095.getClass(), "playedUserId2", 0L);
        setField(term178095, term178095.getClass(), "playedUserName2", null);
        setIntField(term178095, term178095.getClass(), "playedMusicLevel2", 0);
        setLongField(term178095, term178095.getClass(), "playedUserId3", 0L);
        setField(term178095, term178095.getClass(), "playedUserName3", null);
        setIntField(term178095, term178095.getClass(), "playedMusicLevel3", 0);
        setIntField(term178095, term178095.getClass(), "achievement", 0);
        setIntField(term178095, term178095.getClass(), "score", 0);
        setIntField(term178095, term178095.getClass(), "tapScore", 0);
        setIntField(term178095, term178095.getClass(), "holdScore", 0);
        setIntField(term178095, term178095.getClass(), "slideScore", 0);
        setIntField(term178095, term178095.getClass(), "breakScore", 0);
        setIntField(term178095, term178095.getClass(), "syncRate", 0);
        setIntField(term178095, term178095.getClass(), "vsWin", 0);
        setBooleanField(term178095, term178095.getClass(), "isAllPerfect", false);
        setIntField(term178095, term178095.getClass(), "fullCombo", 0);
        setIntField(term178095, term178095.getClass(), "maxFever", 0);
        setIntField(term178095, term178095.getClass(), "maxCombo", 0);
        setIntField(term178095, term178095.getClass(), "tapPerfect", 0);
        setIntField(term178095, term178095.getClass(), "tapGreat", 0);
        setIntField(term178095, term178095.getClass(), "tapGood", 0);
        setIntField(term178095, term178095.getClass(), "tapBad", 0);
        setIntField(term178095, term178095.getClass(), "holdPerfect", 0);
        setIntField(term178095, term178095.getClass(), "holdGreat", 0);
        setIntField(term178095, term178095.getClass(), "holdGood", 0);
        setIntField(term178095, term178095.getClass(), "holdBad", 0);
        setIntField(term178095, term178095.getClass(), "slidePerfect", 0);
        setIntField(term178095, term178095.getClass(), "slideGreat", 0);
        setIntField(term178095, term178095.getClass(), "slideGood", 0);
        setIntField(term178095, term178095.getClass(), "slideBad", 0);
        setIntField(term178095, term178095.getClass(), "breakPerfect", 0);
        setIntField(term178095, term178095.getClass(), "breakGreat", 0);
        setIntField(term178095, term178095.getClass(), "breakGood", 0);
        setIntField(term178095, term178095.getClass(), "breakBad", 0);
        setBooleanField(term178095, term178095.getClass(), "isTrackSkip", false);
        setBooleanField(term178095, term178095.getClass(), "isHighScore", false);
        setBooleanField(term178095, term178095.getClass(), "isChallengeTrack", false);
        setIntField(term178095, term178095.getClass(), "challengeLife", 0);
        setIntField(term178095, term178095.getClass(), "challengeRemain", 0);
        setIntField(term178095, term178095.getClass(), "isAllPerfectPlus", 0);
        term178149 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term178149;
        callMethod(klass, "setSyncRate", argTypes, term178095, args);
    }

};


