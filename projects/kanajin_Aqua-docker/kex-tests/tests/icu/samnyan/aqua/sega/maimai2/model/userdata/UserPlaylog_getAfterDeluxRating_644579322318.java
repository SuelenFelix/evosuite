package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserPlaylog_getAfterDeluxRating_644579322318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485717;

    public UserPlaylog_getAfterDeluxRating_644579322318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term485717 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term485717, term485717.getClass(), "id", 0L);
        setField(term485717, term485717.getClass(), "user", null);
        setIntField(term485717, term485717.getClass(), "orderId", 0);
        setLongField(term485717, term485717.getClass(), "playlogId", 0L);
        setIntField(term485717, term485717.getClass(), "version", 0);
        setIntField(term485717, term485717.getClass(), "placeId", 0);
        setField(term485717, term485717.getClass(), "placeName", null);
        setLongField(term485717, term485717.getClass(), "loginDate", 0L);
        setField(term485717, term485717.getClass(), "playDate", null);
        setField(term485717, term485717.getClass(), "userPlayDate", null);
        setIntField(term485717, term485717.getClass(), "type", 0);
        setIntField(term485717, term485717.getClass(), "musicId", 0);
        setIntField(term485717, term485717.getClass(), "level", 0);
        setIntField(term485717, term485717.getClass(), "trackNo", 0);
        setIntField(term485717, term485717.getClass(), "vsMode", 0);
        setField(term485717, term485717.getClass(), "vsUserName", null);
        setIntField(term485717, term485717.getClass(), "vsStatus", 0);
        setIntField(term485717, term485717.getClass(), "vsUserRating", 0);
        setIntField(term485717, term485717.getClass(), "vsUserAchievement", 0);
        setIntField(term485717, term485717.getClass(), "vsUserGradeRank", 0);
        setIntField(term485717, term485717.getClass(), "vsRank", 0);
        setIntField(term485717, term485717.getClass(), "playerNum", 0);
        setLongField(term485717, term485717.getClass(), "playedUserId1", 0L);
        setField(term485717, term485717.getClass(), "playedUserName1", null);
        setIntField(term485717, term485717.getClass(), "playedMusicLevel1", 0);
        setLongField(term485717, term485717.getClass(), "playedUserId2", 0L);
        setField(term485717, term485717.getClass(), "playedUserName2", null);
        setIntField(term485717, term485717.getClass(), "playedMusicLevel2", 0);
        setLongField(term485717, term485717.getClass(), "playedUserId3", 0L);
        setField(term485717, term485717.getClass(), "playedUserName3", null);
        setIntField(term485717, term485717.getClass(), "playedMusicLevel3", 0);
        setIntField(term485717, term485717.getClass(), "characterId1", 0);
        setIntField(term485717, term485717.getClass(), "characterLevel1", 0);
        setIntField(term485717, term485717.getClass(), "characterAwakening1", 0);
        setIntField(term485717, term485717.getClass(), "characterId2", 0);
        setIntField(term485717, term485717.getClass(), "characterLevel2", 0);
        setIntField(term485717, term485717.getClass(), "characterAwakening2", 0);
        setIntField(term485717, term485717.getClass(), "characterId3", 0);
        setIntField(term485717, term485717.getClass(), "characterLevel3", 0);
        setIntField(term485717, term485717.getClass(), "characterAwakening3", 0);
        setIntField(term485717, term485717.getClass(), "characterId4", 0);
        setIntField(term485717, term485717.getClass(), "characterLevel4", 0);
        setIntField(term485717, term485717.getClass(), "characterAwakening4", 0);
        setIntField(term485717, term485717.getClass(), "characterId5", 0);
        setIntField(term485717, term485717.getClass(), "characterLevel5", 0);
        setIntField(term485717, term485717.getClass(), "characterAwakening5", 0);
        setIntField(term485717, term485717.getClass(), "achievement", 0);
        setIntField(term485717, term485717.getClass(), "deluxscore", 0);
        setIntField(term485717, term485717.getClass(), "scoreRank", 0);
        setIntField(term485717, term485717.getClass(), "maxCombo", 0);
        setIntField(term485717, term485717.getClass(), "totalCombo", 0);
        setIntField(term485717, term485717.getClass(), "maxSync", 0);
        setIntField(term485717, term485717.getClass(), "totalSync", 0);
        setIntField(term485717, term485717.getClass(), "tapCriticalPerfect", 0);
        setIntField(term485717, term485717.getClass(), "tapPerfect", 0);
        setIntField(term485717, term485717.getClass(), "tapGreat", 0);
        setIntField(term485717, term485717.getClass(), "tapGood", 0);
        setIntField(term485717, term485717.getClass(), "tapMiss", 0);
        setIntField(term485717, term485717.getClass(), "holdCriticalPerfect", 0);
        setIntField(term485717, term485717.getClass(), "holdPerfect", 0);
        setIntField(term485717, term485717.getClass(), "holdGreat", 0);
        setIntField(term485717, term485717.getClass(), "holdGood", 0);
        setIntField(term485717, term485717.getClass(), "holdMiss", 0);
        setIntField(term485717, term485717.getClass(), "slideCriticalPerfect", 0);
        setIntField(term485717, term485717.getClass(), "slidePerfect", 0);
        setIntField(term485717, term485717.getClass(), "slideGreat", 0);
        setIntField(term485717, term485717.getClass(), "slideGood", 0);
        setIntField(term485717, term485717.getClass(), "slideMiss", 0);
        setIntField(term485717, term485717.getClass(), "touchCriticalPerfect", 0);
        setIntField(term485717, term485717.getClass(), "touchPerfect", 0);
        setIntField(term485717, term485717.getClass(), "touchGreat", 0);
        setIntField(term485717, term485717.getClass(), "touchGood", 0);
        setIntField(term485717, term485717.getClass(), "touchMiss", 0);
        setIntField(term485717, term485717.getClass(), "breakCriticalPerfect", 0);
        setIntField(term485717, term485717.getClass(), "breakPerfect", 0);
        setIntField(term485717, term485717.getClass(), "breakGreat", 0);
        setIntField(term485717, term485717.getClass(), "breakGood", 0);
        setIntField(term485717, term485717.getClass(), "breakMiss", 0);
        setBooleanField(term485717, term485717.getClass(), "isTap", false);
        setBooleanField(term485717, term485717.getClass(), "isHold", false);
        setBooleanField(term485717, term485717.getClass(), "isSlide", false);
        setBooleanField(term485717, term485717.getClass(), "isTouch", false);
        setBooleanField(term485717, term485717.getClass(), "isBreak", false);
        setBooleanField(term485717, term485717.getClass(), "isCriticalDisp", false);
        setBooleanField(term485717, term485717.getClass(), "isFastLateDisp", false);
        setIntField(term485717, term485717.getClass(), "fastCount", 0);
        setIntField(term485717, term485717.getClass(), "lateCount", 0);
        setBooleanField(term485717, term485717.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term485717, term485717.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term485717, term485717.getClass(), "comboStatus", 0);
        setIntField(term485717, term485717.getClass(), "syncStatus", 0);
        setBooleanField(term485717, term485717.getClass(), "isClear", false);
        setIntField(term485717, term485717.getClass(), "beforeRating", 0);
        setIntField(term485717, term485717.getClass(), "afterRating", 0);
        setIntField(term485717, term485717.getClass(), "beforeGrade", 0);
        setIntField(term485717, term485717.getClass(), "afterGrade", 0);
        setIntField(term485717, term485717.getClass(), "afterGradeRank", 0);
        setIntField(term485717, term485717.getClass(), "beforeDeluxRating", 0);
        setIntField(term485717, term485717.getClass(), "afterDeluxRating", 0);
        setBooleanField(term485717, term485717.getClass(), "isPlayTutorial", false);
        setBooleanField(term485717, term485717.getClass(), "isEventMode", false);
        setBooleanField(term485717, term485717.getClass(), "isFreedomMode", false);
        setIntField(term485717, term485717.getClass(), "playMode", 0);
        setBooleanField(term485717, term485717.getClass(), "isNewFree", false);
        setIntField(term485717, term485717.getClass(), "trialPlayAchievement", 0);
        setIntField(term485717, term485717.getClass(), "extNum1", 0);
        setIntField(term485717, term485717.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAfterDeluxRating", argTypes, term485717, args);
    }

};


