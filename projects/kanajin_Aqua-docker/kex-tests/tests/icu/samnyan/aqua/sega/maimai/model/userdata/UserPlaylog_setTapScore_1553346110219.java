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

public class UserPlaylog_setTapScore_1553346110219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177871;
     Object term177925;

    public UserPlaylog_setTapScore_1553346110219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177871 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term177871, term177871.getClass(), "id", 0L);
        setField(term177871, term177871.getClass(), "user", null);
        setIntField(term177871, term177871.getClass(), "orderId", 0);
        setLongField(term177871, term177871.getClass(), "sortNumber", 0L);
        setIntField(term177871, term177871.getClass(), "placeId", 0);
        setField(term177871, term177871.getClass(), "placeName", null);
        setField(term177871, term177871.getClass(), "country", null);
        setIntField(term177871, term177871.getClass(), "regionId", 0);
        setField(term177871, term177871.getClass(), "playDate", null);
        setField(term177871, term177871.getClass(), "userPlayDate", null);
        setIntField(term177871, term177871.getClass(), "musicId", 0);
        setIntField(term177871, term177871.getClass(), "level", 0);
        setIntField(term177871, term177871.getClass(), "gameMode", 0);
        setIntField(term177871, term177871.getClass(), "rivalNum", 0);
        setIntField(term177871, term177871.getClass(), "track", 0);
        setIntField(term177871, term177871.getClass(), "eventId", 0);
        setBooleanField(term177871, term177871.getClass(), "isFreeToPlay", false);
        setIntField(term177871, term177871.getClass(), "playerRating", 0);
        setLongField(term177871, term177871.getClass(), "playedUserId1", 0L);
        setField(term177871, term177871.getClass(), "playedUserName1", null);
        setIntField(term177871, term177871.getClass(), "playedMusicLevel1", 0);
        setLongField(term177871, term177871.getClass(), "playedUserId2", 0L);
        setField(term177871, term177871.getClass(), "playedUserName2", null);
        setIntField(term177871, term177871.getClass(), "playedMusicLevel2", 0);
        setLongField(term177871, term177871.getClass(), "playedUserId3", 0L);
        setField(term177871, term177871.getClass(), "playedUserName3", null);
        setIntField(term177871, term177871.getClass(), "playedMusicLevel3", 0);
        setIntField(term177871, term177871.getClass(), "achievement", 0);
        setIntField(term177871, term177871.getClass(), "score", 0);
        setIntField(term177871, term177871.getClass(), "tapScore", 0);
        setIntField(term177871, term177871.getClass(), "holdScore", 0);
        setIntField(term177871, term177871.getClass(), "slideScore", 0);
        setIntField(term177871, term177871.getClass(), "breakScore", 0);
        setIntField(term177871, term177871.getClass(), "syncRate", 0);
        setIntField(term177871, term177871.getClass(), "vsWin", 0);
        setBooleanField(term177871, term177871.getClass(), "isAllPerfect", false);
        setIntField(term177871, term177871.getClass(), "fullCombo", 0);
        setIntField(term177871, term177871.getClass(), "maxFever", 0);
        setIntField(term177871, term177871.getClass(), "maxCombo", 0);
        setIntField(term177871, term177871.getClass(), "tapPerfect", 0);
        setIntField(term177871, term177871.getClass(), "tapGreat", 0);
        setIntField(term177871, term177871.getClass(), "tapGood", 0);
        setIntField(term177871, term177871.getClass(), "tapBad", 0);
        setIntField(term177871, term177871.getClass(), "holdPerfect", 0);
        setIntField(term177871, term177871.getClass(), "holdGreat", 0);
        setIntField(term177871, term177871.getClass(), "holdGood", 0);
        setIntField(term177871, term177871.getClass(), "holdBad", 0);
        setIntField(term177871, term177871.getClass(), "slidePerfect", 0);
        setIntField(term177871, term177871.getClass(), "slideGreat", 0);
        setIntField(term177871, term177871.getClass(), "slideGood", 0);
        setIntField(term177871, term177871.getClass(), "slideBad", 0);
        setIntField(term177871, term177871.getClass(), "breakPerfect", 0);
        setIntField(term177871, term177871.getClass(), "breakGreat", 0);
        setIntField(term177871, term177871.getClass(), "breakGood", 0);
        setIntField(term177871, term177871.getClass(), "breakBad", 0);
        setBooleanField(term177871, term177871.getClass(), "isTrackSkip", false);
        setBooleanField(term177871, term177871.getClass(), "isHighScore", false);
        setBooleanField(term177871, term177871.getClass(), "isChallengeTrack", false);
        setIntField(term177871, term177871.getClass(), "challengeLife", 0);
        setIntField(term177871, term177871.getClass(), "challengeRemain", 0);
        setIntField(term177871, term177871.getClass(), "isAllPerfectPlus", 0);
        term177925 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177925;
        callMethod(klass, "setTapScore", argTypes, term177871, args);
    }

};


