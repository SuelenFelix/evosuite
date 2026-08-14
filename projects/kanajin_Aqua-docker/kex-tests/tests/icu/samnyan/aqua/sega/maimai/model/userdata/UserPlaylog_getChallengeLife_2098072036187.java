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

public class UserPlaylog_getChallengeLife_2098072036187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176101;

    public UserPlaylog_getChallengeLife_2098072036187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176101 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176101, term176101.getClass(), "id", 0L);
        setField(term176101, term176101.getClass(), "user", null);
        setIntField(term176101, term176101.getClass(), "orderId", 0);
        setLongField(term176101, term176101.getClass(), "sortNumber", 0L);
        setIntField(term176101, term176101.getClass(), "placeId", 0);
        setField(term176101, term176101.getClass(), "placeName", null);
        setField(term176101, term176101.getClass(), "country", null);
        setIntField(term176101, term176101.getClass(), "regionId", 0);
        setField(term176101, term176101.getClass(), "playDate", null);
        setField(term176101, term176101.getClass(), "userPlayDate", null);
        setIntField(term176101, term176101.getClass(), "musicId", 0);
        setIntField(term176101, term176101.getClass(), "level", 0);
        setIntField(term176101, term176101.getClass(), "gameMode", 0);
        setIntField(term176101, term176101.getClass(), "rivalNum", 0);
        setIntField(term176101, term176101.getClass(), "track", 0);
        setIntField(term176101, term176101.getClass(), "eventId", 0);
        setBooleanField(term176101, term176101.getClass(), "isFreeToPlay", false);
        setIntField(term176101, term176101.getClass(), "playerRating", 0);
        setLongField(term176101, term176101.getClass(), "playedUserId1", 0L);
        setField(term176101, term176101.getClass(), "playedUserName1", null);
        setIntField(term176101, term176101.getClass(), "playedMusicLevel1", 0);
        setLongField(term176101, term176101.getClass(), "playedUserId2", 0L);
        setField(term176101, term176101.getClass(), "playedUserName2", null);
        setIntField(term176101, term176101.getClass(), "playedMusicLevel2", 0);
        setLongField(term176101, term176101.getClass(), "playedUserId3", 0L);
        setField(term176101, term176101.getClass(), "playedUserName3", null);
        setIntField(term176101, term176101.getClass(), "playedMusicLevel3", 0);
        setIntField(term176101, term176101.getClass(), "achievement", 0);
        setIntField(term176101, term176101.getClass(), "score", 0);
        setIntField(term176101, term176101.getClass(), "tapScore", 0);
        setIntField(term176101, term176101.getClass(), "holdScore", 0);
        setIntField(term176101, term176101.getClass(), "slideScore", 0);
        setIntField(term176101, term176101.getClass(), "breakScore", 0);
        setIntField(term176101, term176101.getClass(), "syncRate", 0);
        setIntField(term176101, term176101.getClass(), "vsWin", 0);
        setBooleanField(term176101, term176101.getClass(), "isAllPerfect", false);
        setIntField(term176101, term176101.getClass(), "fullCombo", 0);
        setIntField(term176101, term176101.getClass(), "maxFever", 0);
        setIntField(term176101, term176101.getClass(), "maxCombo", 0);
        setIntField(term176101, term176101.getClass(), "tapPerfect", 0);
        setIntField(term176101, term176101.getClass(), "tapGreat", 0);
        setIntField(term176101, term176101.getClass(), "tapGood", 0);
        setIntField(term176101, term176101.getClass(), "tapBad", 0);
        setIntField(term176101, term176101.getClass(), "holdPerfect", 0);
        setIntField(term176101, term176101.getClass(), "holdGreat", 0);
        setIntField(term176101, term176101.getClass(), "holdGood", 0);
        setIntField(term176101, term176101.getClass(), "holdBad", 0);
        setIntField(term176101, term176101.getClass(), "slidePerfect", 0);
        setIntField(term176101, term176101.getClass(), "slideGreat", 0);
        setIntField(term176101, term176101.getClass(), "slideGood", 0);
        setIntField(term176101, term176101.getClass(), "slideBad", 0);
        setIntField(term176101, term176101.getClass(), "breakPerfect", 0);
        setIntField(term176101, term176101.getClass(), "breakGreat", 0);
        setIntField(term176101, term176101.getClass(), "breakGood", 0);
        setIntField(term176101, term176101.getClass(), "breakBad", 0);
        setBooleanField(term176101, term176101.getClass(), "isTrackSkip", false);
        setBooleanField(term176101, term176101.getClass(), "isHighScore", false);
        setBooleanField(term176101, term176101.getClass(), "isChallengeTrack", false);
        setIntField(term176101, term176101.getClass(), "challengeLife", 0);
        setIntField(term176101, term176101.getClass(), "challengeRemain", 0);
        setIntField(term176101, term176101.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChallengeLife", argTypes, term176101, args);
    }

};


