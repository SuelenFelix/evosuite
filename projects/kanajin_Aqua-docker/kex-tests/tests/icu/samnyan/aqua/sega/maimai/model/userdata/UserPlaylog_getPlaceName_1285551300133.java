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

public class UserPlaylog_getPlaceName_1285551300133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3999549;

    public UserPlaylog_getPlaceName_1285551300133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3999549 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term3999549, term3999549.getClass(), "id", 0L);
        setField(term3999549, term3999549.getClass(), "user", null);
        setIntField(term3999549, term3999549.getClass(), "orderId", 0);
        setLongField(term3999549, term3999549.getClass(), "sortNumber", 0L);
        setIntField(term3999549, term3999549.getClass(), "placeId", 0);
        setField(term3999549, term3999549.getClass(), "placeName", null);
        setField(term3999549, term3999549.getClass(), "country", null);
        setIntField(term3999549, term3999549.getClass(), "regionId", 0);
        setField(term3999549, term3999549.getClass(), "playDate", null);
        setField(term3999549, term3999549.getClass(), "userPlayDate", null);
        setIntField(term3999549, term3999549.getClass(), "musicId", 0);
        setIntField(term3999549, term3999549.getClass(), "level", 0);
        setIntField(term3999549, term3999549.getClass(), "gameMode", 0);
        setIntField(term3999549, term3999549.getClass(), "rivalNum", 0);
        setIntField(term3999549, term3999549.getClass(), "track", 0);
        setIntField(term3999549, term3999549.getClass(), "eventId", 0);
        setBooleanField(term3999549, term3999549.getClass(), "isFreeToPlay", false);
        setIntField(term3999549, term3999549.getClass(), "playerRating", 0);
        setLongField(term3999549, term3999549.getClass(), "playedUserId1", 0L);
        setField(term3999549, term3999549.getClass(), "playedUserName1", null);
        setIntField(term3999549, term3999549.getClass(), "playedMusicLevel1", 0);
        setLongField(term3999549, term3999549.getClass(), "playedUserId2", 0L);
        setField(term3999549, term3999549.getClass(), "playedUserName2", null);
        setIntField(term3999549, term3999549.getClass(), "playedMusicLevel2", 0);
        setLongField(term3999549, term3999549.getClass(), "playedUserId3", 0L);
        setField(term3999549, term3999549.getClass(), "playedUserName3", null);
        setIntField(term3999549, term3999549.getClass(), "playedMusicLevel3", 0);
        setIntField(term3999549, term3999549.getClass(), "achievement", 0);
        setIntField(term3999549, term3999549.getClass(), "score", 0);
        setIntField(term3999549, term3999549.getClass(), "tapScore", 0);
        setIntField(term3999549, term3999549.getClass(), "holdScore", 0);
        setIntField(term3999549, term3999549.getClass(), "slideScore", 0);
        setIntField(term3999549, term3999549.getClass(), "breakScore", 0);
        setIntField(term3999549, term3999549.getClass(), "syncRate", 0);
        setIntField(term3999549, term3999549.getClass(), "vsWin", 0);
        setBooleanField(term3999549, term3999549.getClass(), "isAllPerfect", false);
        setIntField(term3999549, term3999549.getClass(), "fullCombo", 0);
        setIntField(term3999549, term3999549.getClass(), "maxFever", 0);
        setIntField(term3999549, term3999549.getClass(), "maxCombo", 0);
        setIntField(term3999549, term3999549.getClass(), "tapPerfect", 0);
        setIntField(term3999549, term3999549.getClass(), "tapGreat", 0);
        setIntField(term3999549, term3999549.getClass(), "tapGood", 0);
        setIntField(term3999549, term3999549.getClass(), "tapBad", 0);
        setIntField(term3999549, term3999549.getClass(), "holdPerfect", 0);
        setIntField(term3999549, term3999549.getClass(), "holdGreat", 0);
        setIntField(term3999549, term3999549.getClass(), "holdGood", 0);
        setIntField(term3999549, term3999549.getClass(), "holdBad", 0);
        setIntField(term3999549, term3999549.getClass(), "slidePerfect", 0);
        setIntField(term3999549, term3999549.getClass(), "slideGreat", 0);
        setIntField(term3999549, term3999549.getClass(), "slideGood", 0);
        setIntField(term3999549, term3999549.getClass(), "slideBad", 0);
        setIntField(term3999549, term3999549.getClass(), "breakPerfect", 0);
        setIntField(term3999549, term3999549.getClass(), "breakGreat", 0);
        setIntField(term3999549, term3999549.getClass(), "breakGood", 0);
        setIntField(term3999549, term3999549.getClass(), "breakBad", 0);
        setBooleanField(term3999549, term3999549.getClass(), "isTrackSkip", false);
        setBooleanField(term3999549, term3999549.getClass(), "isHighScore", false);
        setBooleanField(term3999549, term3999549.getClass(), "isChallengeTrack", false);
        setIntField(term3999549, term3999549.getClass(), "challengeLife", 0);
        setIntField(term3999549, term3999549.getClass(), "challengeRemain", 0);
        setIntField(term3999549, term3999549.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceName", argTypes, term3999549, args);
    }

};


