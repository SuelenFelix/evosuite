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

public class UserPlaylog_getRegionId_691736256135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3999657;

    public UserPlaylog_getRegionId_691736256135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3999657 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term3999657, term3999657.getClass(), "id", 0L);
        setField(term3999657, term3999657.getClass(), "user", null);
        setIntField(term3999657, term3999657.getClass(), "orderId", 0);
        setLongField(term3999657, term3999657.getClass(), "sortNumber", 0L);
        setIntField(term3999657, term3999657.getClass(), "placeId", 0);
        setField(term3999657, term3999657.getClass(), "placeName", null);
        setField(term3999657, term3999657.getClass(), "country", null);
        setIntField(term3999657, term3999657.getClass(), "regionId", 0);
        setField(term3999657, term3999657.getClass(), "playDate", null);
        setField(term3999657, term3999657.getClass(), "userPlayDate", null);
        setIntField(term3999657, term3999657.getClass(), "musicId", 0);
        setIntField(term3999657, term3999657.getClass(), "level", 0);
        setIntField(term3999657, term3999657.getClass(), "gameMode", 0);
        setIntField(term3999657, term3999657.getClass(), "rivalNum", 0);
        setIntField(term3999657, term3999657.getClass(), "track", 0);
        setIntField(term3999657, term3999657.getClass(), "eventId", 0);
        setBooleanField(term3999657, term3999657.getClass(), "isFreeToPlay", false);
        setIntField(term3999657, term3999657.getClass(), "playerRating", 0);
        setLongField(term3999657, term3999657.getClass(), "playedUserId1", 0L);
        setField(term3999657, term3999657.getClass(), "playedUserName1", null);
        setIntField(term3999657, term3999657.getClass(), "playedMusicLevel1", 0);
        setLongField(term3999657, term3999657.getClass(), "playedUserId2", 0L);
        setField(term3999657, term3999657.getClass(), "playedUserName2", null);
        setIntField(term3999657, term3999657.getClass(), "playedMusicLevel2", 0);
        setLongField(term3999657, term3999657.getClass(), "playedUserId3", 0L);
        setField(term3999657, term3999657.getClass(), "playedUserName3", null);
        setIntField(term3999657, term3999657.getClass(), "playedMusicLevel3", 0);
        setIntField(term3999657, term3999657.getClass(), "achievement", 0);
        setIntField(term3999657, term3999657.getClass(), "score", 0);
        setIntField(term3999657, term3999657.getClass(), "tapScore", 0);
        setIntField(term3999657, term3999657.getClass(), "holdScore", 0);
        setIntField(term3999657, term3999657.getClass(), "slideScore", 0);
        setIntField(term3999657, term3999657.getClass(), "breakScore", 0);
        setIntField(term3999657, term3999657.getClass(), "syncRate", 0);
        setIntField(term3999657, term3999657.getClass(), "vsWin", 0);
        setBooleanField(term3999657, term3999657.getClass(), "isAllPerfect", false);
        setIntField(term3999657, term3999657.getClass(), "fullCombo", 0);
        setIntField(term3999657, term3999657.getClass(), "maxFever", 0);
        setIntField(term3999657, term3999657.getClass(), "maxCombo", 0);
        setIntField(term3999657, term3999657.getClass(), "tapPerfect", 0);
        setIntField(term3999657, term3999657.getClass(), "tapGreat", 0);
        setIntField(term3999657, term3999657.getClass(), "tapGood", 0);
        setIntField(term3999657, term3999657.getClass(), "tapBad", 0);
        setIntField(term3999657, term3999657.getClass(), "holdPerfect", 0);
        setIntField(term3999657, term3999657.getClass(), "holdGreat", 0);
        setIntField(term3999657, term3999657.getClass(), "holdGood", 0);
        setIntField(term3999657, term3999657.getClass(), "holdBad", 0);
        setIntField(term3999657, term3999657.getClass(), "slidePerfect", 0);
        setIntField(term3999657, term3999657.getClass(), "slideGreat", 0);
        setIntField(term3999657, term3999657.getClass(), "slideGood", 0);
        setIntField(term3999657, term3999657.getClass(), "slideBad", 0);
        setIntField(term3999657, term3999657.getClass(), "breakPerfect", 0);
        setIntField(term3999657, term3999657.getClass(), "breakGreat", 0);
        setIntField(term3999657, term3999657.getClass(), "breakGood", 0);
        setIntField(term3999657, term3999657.getClass(), "breakBad", 0);
        setBooleanField(term3999657, term3999657.getClass(), "isTrackSkip", false);
        setBooleanField(term3999657, term3999657.getClass(), "isHighScore", false);
        setBooleanField(term3999657, term3999657.getClass(), "isChallengeTrack", false);
        setIntField(term3999657, term3999657.getClass(), "challengeLife", 0);
        setIntField(term3999657, term3999657.getClass(), "challengeRemain", 0);
        setIntField(term3999657, term3999657.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegionId", argTypes, term3999657, args);
    }

};


