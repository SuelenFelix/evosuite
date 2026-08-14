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

public class UserPlaylog_getTapBad_1153732557170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4001547;

    public UserPlaylog_getTapBad_1153732557170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4001547 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4001547, term4001547.getClass(), "id", 0L);
        setField(term4001547, term4001547.getClass(), "user", null);
        setIntField(term4001547, term4001547.getClass(), "orderId", 0);
        setLongField(term4001547, term4001547.getClass(), "sortNumber", 0L);
        setIntField(term4001547, term4001547.getClass(), "placeId", 0);
        setField(term4001547, term4001547.getClass(), "placeName", null);
        setField(term4001547, term4001547.getClass(), "country", null);
        setIntField(term4001547, term4001547.getClass(), "regionId", 0);
        setField(term4001547, term4001547.getClass(), "playDate", null);
        setField(term4001547, term4001547.getClass(), "userPlayDate", null);
        setIntField(term4001547, term4001547.getClass(), "musicId", 0);
        setIntField(term4001547, term4001547.getClass(), "level", 0);
        setIntField(term4001547, term4001547.getClass(), "gameMode", 0);
        setIntField(term4001547, term4001547.getClass(), "rivalNum", 0);
        setIntField(term4001547, term4001547.getClass(), "track", 0);
        setIntField(term4001547, term4001547.getClass(), "eventId", 0);
        setBooleanField(term4001547, term4001547.getClass(), "isFreeToPlay", false);
        setIntField(term4001547, term4001547.getClass(), "playerRating", 0);
        setLongField(term4001547, term4001547.getClass(), "playedUserId1", 0L);
        setField(term4001547, term4001547.getClass(), "playedUserName1", null);
        setIntField(term4001547, term4001547.getClass(), "playedMusicLevel1", 0);
        setLongField(term4001547, term4001547.getClass(), "playedUserId2", 0L);
        setField(term4001547, term4001547.getClass(), "playedUserName2", null);
        setIntField(term4001547, term4001547.getClass(), "playedMusicLevel2", 0);
        setLongField(term4001547, term4001547.getClass(), "playedUserId3", 0L);
        setField(term4001547, term4001547.getClass(), "playedUserName3", null);
        setIntField(term4001547, term4001547.getClass(), "playedMusicLevel3", 0);
        setIntField(term4001547, term4001547.getClass(), "achievement", 0);
        setIntField(term4001547, term4001547.getClass(), "score", 0);
        setIntField(term4001547, term4001547.getClass(), "tapScore", 0);
        setIntField(term4001547, term4001547.getClass(), "holdScore", 0);
        setIntField(term4001547, term4001547.getClass(), "slideScore", 0);
        setIntField(term4001547, term4001547.getClass(), "breakScore", 0);
        setIntField(term4001547, term4001547.getClass(), "syncRate", 0);
        setIntField(term4001547, term4001547.getClass(), "vsWin", 0);
        setBooleanField(term4001547, term4001547.getClass(), "isAllPerfect", false);
        setIntField(term4001547, term4001547.getClass(), "fullCombo", 0);
        setIntField(term4001547, term4001547.getClass(), "maxFever", 0);
        setIntField(term4001547, term4001547.getClass(), "maxCombo", 0);
        setIntField(term4001547, term4001547.getClass(), "tapPerfect", 0);
        setIntField(term4001547, term4001547.getClass(), "tapGreat", 0);
        setIntField(term4001547, term4001547.getClass(), "tapGood", 0);
        setIntField(term4001547, term4001547.getClass(), "tapBad", 0);
        setIntField(term4001547, term4001547.getClass(), "holdPerfect", 0);
        setIntField(term4001547, term4001547.getClass(), "holdGreat", 0);
        setIntField(term4001547, term4001547.getClass(), "holdGood", 0);
        setIntField(term4001547, term4001547.getClass(), "holdBad", 0);
        setIntField(term4001547, term4001547.getClass(), "slidePerfect", 0);
        setIntField(term4001547, term4001547.getClass(), "slideGreat", 0);
        setIntField(term4001547, term4001547.getClass(), "slideGood", 0);
        setIntField(term4001547, term4001547.getClass(), "slideBad", 0);
        setIntField(term4001547, term4001547.getClass(), "breakPerfect", 0);
        setIntField(term4001547, term4001547.getClass(), "breakGreat", 0);
        setIntField(term4001547, term4001547.getClass(), "breakGood", 0);
        setIntField(term4001547, term4001547.getClass(), "breakBad", 0);
        setBooleanField(term4001547, term4001547.getClass(), "isTrackSkip", false);
        setBooleanField(term4001547, term4001547.getClass(), "isHighScore", false);
        setBooleanField(term4001547, term4001547.getClass(), "isChallengeTrack", false);
        setIntField(term4001547, term4001547.getClass(), "challengeLife", 0);
        setIntField(term4001547, term4001547.getClass(), "challengeRemain", 0);
        setIntField(term4001547, term4001547.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTapBad", argTypes, term4001547, args);
    }

};


