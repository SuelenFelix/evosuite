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

public class UserPlaylog_getBreakGreat_1847519647180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4002087;

    public UserPlaylog_getBreakGreat_1847519647180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4002087 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4002087, term4002087.getClass(), "id", 0L);
        setField(term4002087, term4002087.getClass(), "user", null);
        setIntField(term4002087, term4002087.getClass(), "orderId", 0);
        setLongField(term4002087, term4002087.getClass(), "sortNumber", 0L);
        setIntField(term4002087, term4002087.getClass(), "placeId", 0);
        setField(term4002087, term4002087.getClass(), "placeName", null);
        setField(term4002087, term4002087.getClass(), "country", null);
        setIntField(term4002087, term4002087.getClass(), "regionId", 0);
        setField(term4002087, term4002087.getClass(), "playDate", null);
        setField(term4002087, term4002087.getClass(), "userPlayDate", null);
        setIntField(term4002087, term4002087.getClass(), "musicId", 0);
        setIntField(term4002087, term4002087.getClass(), "level", 0);
        setIntField(term4002087, term4002087.getClass(), "gameMode", 0);
        setIntField(term4002087, term4002087.getClass(), "rivalNum", 0);
        setIntField(term4002087, term4002087.getClass(), "track", 0);
        setIntField(term4002087, term4002087.getClass(), "eventId", 0);
        setBooleanField(term4002087, term4002087.getClass(), "isFreeToPlay", false);
        setIntField(term4002087, term4002087.getClass(), "playerRating", 0);
        setLongField(term4002087, term4002087.getClass(), "playedUserId1", 0L);
        setField(term4002087, term4002087.getClass(), "playedUserName1", null);
        setIntField(term4002087, term4002087.getClass(), "playedMusicLevel1", 0);
        setLongField(term4002087, term4002087.getClass(), "playedUserId2", 0L);
        setField(term4002087, term4002087.getClass(), "playedUserName2", null);
        setIntField(term4002087, term4002087.getClass(), "playedMusicLevel2", 0);
        setLongField(term4002087, term4002087.getClass(), "playedUserId3", 0L);
        setField(term4002087, term4002087.getClass(), "playedUserName3", null);
        setIntField(term4002087, term4002087.getClass(), "playedMusicLevel3", 0);
        setIntField(term4002087, term4002087.getClass(), "achievement", 0);
        setIntField(term4002087, term4002087.getClass(), "score", 0);
        setIntField(term4002087, term4002087.getClass(), "tapScore", 0);
        setIntField(term4002087, term4002087.getClass(), "holdScore", 0);
        setIntField(term4002087, term4002087.getClass(), "slideScore", 0);
        setIntField(term4002087, term4002087.getClass(), "breakScore", 0);
        setIntField(term4002087, term4002087.getClass(), "syncRate", 0);
        setIntField(term4002087, term4002087.getClass(), "vsWin", 0);
        setBooleanField(term4002087, term4002087.getClass(), "isAllPerfect", false);
        setIntField(term4002087, term4002087.getClass(), "fullCombo", 0);
        setIntField(term4002087, term4002087.getClass(), "maxFever", 0);
        setIntField(term4002087, term4002087.getClass(), "maxCombo", 0);
        setIntField(term4002087, term4002087.getClass(), "tapPerfect", 0);
        setIntField(term4002087, term4002087.getClass(), "tapGreat", 0);
        setIntField(term4002087, term4002087.getClass(), "tapGood", 0);
        setIntField(term4002087, term4002087.getClass(), "tapBad", 0);
        setIntField(term4002087, term4002087.getClass(), "holdPerfect", 0);
        setIntField(term4002087, term4002087.getClass(), "holdGreat", 0);
        setIntField(term4002087, term4002087.getClass(), "holdGood", 0);
        setIntField(term4002087, term4002087.getClass(), "holdBad", 0);
        setIntField(term4002087, term4002087.getClass(), "slidePerfect", 0);
        setIntField(term4002087, term4002087.getClass(), "slideGreat", 0);
        setIntField(term4002087, term4002087.getClass(), "slideGood", 0);
        setIntField(term4002087, term4002087.getClass(), "slideBad", 0);
        setIntField(term4002087, term4002087.getClass(), "breakPerfect", 0);
        setIntField(term4002087, term4002087.getClass(), "breakGreat", 0);
        setIntField(term4002087, term4002087.getClass(), "breakGood", 0);
        setIntField(term4002087, term4002087.getClass(), "breakBad", 0);
        setBooleanField(term4002087, term4002087.getClass(), "isTrackSkip", false);
        setBooleanField(term4002087, term4002087.getClass(), "isHighScore", false);
        setBooleanField(term4002087, term4002087.getClass(), "isChallengeTrack", false);
        setIntField(term4002087, term4002087.getClass(), "challengeLife", 0);
        setIntField(term4002087, term4002087.getClass(), "challengeRemain", 0);
        setIntField(term4002087, term4002087.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBreakGreat", argTypes, term4002087, args);
    }

};


