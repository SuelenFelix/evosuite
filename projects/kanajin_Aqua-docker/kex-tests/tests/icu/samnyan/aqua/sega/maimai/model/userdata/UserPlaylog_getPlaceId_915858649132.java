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

public class UserPlaylog_getPlaceId_915858649132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3999495;

    public UserPlaylog_getPlaceId_915858649132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3999495 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term3999495, term3999495.getClass(), "id", 0L);
        setField(term3999495, term3999495.getClass(), "user", null);
        setIntField(term3999495, term3999495.getClass(), "orderId", 0);
        setLongField(term3999495, term3999495.getClass(), "sortNumber", 0L);
        setIntField(term3999495, term3999495.getClass(), "placeId", 0);
        setField(term3999495, term3999495.getClass(), "placeName", null);
        setField(term3999495, term3999495.getClass(), "country", null);
        setIntField(term3999495, term3999495.getClass(), "regionId", 0);
        setField(term3999495, term3999495.getClass(), "playDate", null);
        setField(term3999495, term3999495.getClass(), "userPlayDate", null);
        setIntField(term3999495, term3999495.getClass(), "musicId", 0);
        setIntField(term3999495, term3999495.getClass(), "level", 0);
        setIntField(term3999495, term3999495.getClass(), "gameMode", 0);
        setIntField(term3999495, term3999495.getClass(), "rivalNum", 0);
        setIntField(term3999495, term3999495.getClass(), "track", 0);
        setIntField(term3999495, term3999495.getClass(), "eventId", 0);
        setBooleanField(term3999495, term3999495.getClass(), "isFreeToPlay", false);
        setIntField(term3999495, term3999495.getClass(), "playerRating", 0);
        setLongField(term3999495, term3999495.getClass(), "playedUserId1", 0L);
        setField(term3999495, term3999495.getClass(), "playedUserName1", null);
        setIntField(term3999495, term3999495.getClass(), "playedMusicLevel1", 0);
        setLongField(term3999495, term3999495.getClass(), "playedUserId2", 0L);
        setField(term3999495, term3999495.getClass(), "playedUserName2", null);
        setIntField(term3999495, term3999495.getClass(), "playedMusicLevel2", 0);
        setLongField(term3999495, term3999495.getClass(), "playedUserId3", 0L);
        setField(term3999495, term3999495.getClass(), "playedUserName3", null);
        setIntField(term3999495, term3999495.getClass(), "playedMusicLevel3", 0);
        setIntField(term3999495, term3999495.getClass(), "achievement", 0);
        setIntField(term3999495, term3999495.getClass(), "score", 0);
        setIntField(term3999495, term3999495.getClass(), "tapScore", 0);
        setIntField(term3999495, term3999495.getClass(), "holdScore", 0);
        setIntField(term3999495, term3999495.getClass(), "slideScore", 0);
        setIntField(term3999495, term3999495.getClass(), "breakScore", 0);
        setIntField(term3999495, term3999495.getClass(), "syncRate", 0);
        setIntField(term3999495, term3999495.getClass(), "vsWin", 0);
        setBooleanField(term3999495, term3999495.getClass(), "isAllPerfect", false);
        setIntField(term3999495, term3999495.getClass(), "fullCombo", 0);
        setIntField(term3999495, term3999495.getClass(), "maxFever", 0);
        setIntField(term3999495, term3999495.getClass(), "maxCombo", 0);
        setIntField(term3999495, term3999495.getClass(), "tapPerfect", 0);
        setIntField(term3999495, term3999495.getClass(), "tapGreat", 0);
        setIntField(term3999495, term3999495.getClass(), "tapGood", 0);
        setIntField(term3999495, term3999495.getClass(), "tapBad", 0);
        setIntField(term3999495, term3999495.getClass(), "holdPerfect", 0);
        setIntField(term3999495, term3999495.getClass(), "holdGreat", 0);
        setIntField(term3999495, term3999495.getClass(), "holdGood", 0);
        setIntField(term3999495, term3999495.getClass(), "holdBad", 0);
        setIntField(term3999495, term3999495.getClass(), "slidePerfect", 0);
        setIntField(term3999495, term3999495.getClass(), "slideGreat", 0);
        setIntField(term3999495, term3999495.getClass(), "slideGood", 0);
        setIntField(term3999495, term3999495.getClass(), "slideBad", 0);
        setIntField(term3999495, term3999495.getClass(), "breakPerfect", 0);
        setIntField(term3999495, term3999495.getClass(), "breakGreat", 0);
        setIntField(term3999495, term3999495.getClass(), "breakGood", 0);
        setIntField(term3999495, term3999495.getClass(), "breakBad", 0);
        setBooleanField(term3999495, term3999495.getClass(), "isTrackSkip", false);
        setBooleanField(term3999495, term3999495.getClass(), "isHighScore", false);
        setBooleanField(term3999495, term3999495.getClass(), "isChallengeTrack", false);
        setIntField(term3999495, term3999495.getClass(), "challengeLife", 0);
        setIntField(term3999495, term3999495.getClass(), "challengeRemain", 0);
        setIntField(term3999495, term3999495.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceId", argTypes, term3999495, args);
    }

};


