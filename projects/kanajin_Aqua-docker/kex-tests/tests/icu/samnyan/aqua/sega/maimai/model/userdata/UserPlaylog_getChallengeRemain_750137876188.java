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

public class UserPlaylog_getChallengeRemain_750137876188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176155;

    public UserPlaylog_getChallengeRemain_750137876188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176155 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176155, term176155.getClass(), "id", 0L);
        setField(term176155, term176155.getClass(), "user", null);
        setIntField(term176155, term176155.getClass(), "orderId", 0);
        setLongField(term176155, term176155.getClass(), "sortNumber", 0L);
        setIntField(term176155, term176155.getClass(), "placeId", 0);
        setField(term176155, term176155.getClass(), "placeName", null);
        setField(term176155, term176155.getClass(), "country", null);
        setIntField(term176155, term176155.getClass(), "regionId", 0);
        setField(term176155, term176155.getClass(), "playDate", null);
        setField(term176155, term176155.getClass(), "userPlayDate", null);
        setIntField(term176155, term176155.getClass(), "musicId", 0);
        setIntField(term176155, term176155.getClass(), "level", 0);
        setIntField(term176155, term176155.getClass(), "gameMode", 0);
        setIntField(term176155, term176155.getClass(), "rivalNum", 0);
        setIntField(term176155, term176155.getClass(), "track", 0);
        setIntField(term176155, term176155.getClass(), "eventId", 0);
        setBooleanField(term176155, term176155.getClass(), "isFreeToPlay", false);
        setIntField(term176155, term176155.getClass(), "playerRating", 0);
        setLongField(term176155, term176155.getClass(), "playedUserId1", 0L);
        setField(term176155, term176155.getClass(), "playedUserName1", null);
        setIntField(term176155, term176155.getClass(), "playedMusicLevel1", 0);
        setLongField(term176155, term176155.getClass(), "playedUserId2", 0L);
        setField(term176155, term176155.getClass(), "playedUserName2", null);
        setIntField(term176155, term176155.getClass(), "playedMusicLevel2", 0);
        setLongField(term176155, term176155.getClass(), "playedUserId3", 0L);
        setField(term176155, term176155.getClass(), "playedUserName3", null);
        setIntField(term176155, term176155.getClass(), "playedMusicLevel3", 0);
        setIntField(term176155, term176155.getClass(), "achievement", 0);
        setIntField(term176155, term176155.getClass(), "score", 0);
        setIntField(term176155, term176155.getClass(), "tapScore", 0);
        setIntField(term176155, term176155.getClass(), "holdScore", 0);
        setIntField(term176155, term176155.getClass(), "slideScore", 0);
        setIntField(term176155, term176155.getClass(), "breakScore", 0);
        setIntField(term176155, term176155.getClass(), "syncRate", 0);
        setIntField(term176155, term176155.getClass(), "vsWin", 0);
        setBooleanField(term176155, term176155.getClass(), "isAllPerfect", false);
        setIntField(term176155, term176155.getClass(), "fullCombo", 0);
        setIntField(term176155, term176155.getClass(), "maxFever", 0);
        setIntField(term176155, term176155.getClass(), "maxCombo", 0);
        setIntField(term176155, term176155.getClass(), "tapPerfect", 0);
        setIntField(term176155, term176155.getClass(), "tapGreat", 0);
        setIntField(term176155, term176155.getClass(), "tapGood", 0);
        setIntField(term176155, term176155.getClass(), "tapBad", 0);
        setIntField(term176155, term176155.getClass(), "holdPerfect", 0);
        setIntField(term176155, term176155.getClass(), "holdGreat", 0);
        setIntField(term176155, term176155.getClass(), "holdGood", 0);
        setIntField(term176155, term176155.getClass(), "holdBad", 0);
        setIntField(term176155, term176155.getClass(), "slidePerfect", 0);
        setIntField(term176155, term176155.getClass(), "slideGreat", 0);
        setIntField(term176155, term176155.getClass(), "slideGood", 0);
        setIntField(term176155, term176155.getClass(), "slideBad", 0);
        setIntField(term176155, term176155.getClass(), "breakPerfect", 0);
        setIntField(term176155, term176155.getClass(), "breakGreat", 0);
        setIntField(term176155, term176155.getClass(), "breakGood", 0);
        setIntField(term176155, term176155.getClass(), "breakBad", 0);
        setBooleanField(term176155, term176155.getClass(), "isTrackSkip", false);
        setBooleanField(term176155, term176155.getClass(), "isHighScore", false);
        setBooleanField(term176155, term176155.getClass(), "isChallengeTrack", false);
        setIntField(term176155, term176155.getClass(), "challengeLife", 0);
        setIntField(term176155, term176155.getClass(), "challengeRemain", 0);
        setIntField(term176155, term176155.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChallengeRemain", argTypes, term176155, args);
    }

};


