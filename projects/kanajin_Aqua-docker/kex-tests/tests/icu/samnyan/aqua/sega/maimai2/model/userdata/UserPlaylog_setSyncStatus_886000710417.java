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
import java.lang.Integer;

public class UserPlaylog_setSyncStatus_886000710417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495781;
     Object term495881;

    public UserPlaylog_setSyncStatus_886000710417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495781 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term495781, term495781.getClass(), "id", 0L);
        setField(term495781, term495781.getClass(), "user", null);
        setIntField(term495781, term495781.getClass(), "orderId", 0);
        setLongField(term495781, term495781.getClass(), "playlogId", 0L);
        setIntField(term495781, term495781.getClass(), "version", 0);
        setIntField(term495781, term495781.getClass(), "placeId", 0);
        setField(term495781, term495781.getClass(), "placeName", null);
        setLongField(term495781, term495781.getClass(), "loginDate", 0L);
        setField(term495781, term495781.getClass(), "playDate", null);
        setField(term495781, term495781.getClass(), "userPlayDate", null);
        setIntField(term495781, term495781.getClass(), "type", 0);
        setIntField(term495781, term495781.getClass(), "musicId", 0);
        setIntField(term495781, term495781.getClass(), "level", 0);
        setIntField(term495781, term495781.getClass(), "trackNo", 0);
        setIntField(term495781, term495781.getClass(), "vsMode", 0);
        setField(term495781, term495781.getClass(), "vsUserName", null);
        setIntField(term495781, term495781.getClass(), "vsStatus", 0);
        setIntField(term495781, term495781.getClass(), "vsUserRating", 0);
        setIntField(term495781, term495781.getClass(), "vsUserAchievement", 0);
        setIntField(term495781, term495781.getClass(), "vsUserGradeRank", 0);
        setIntField(term495781, term495781.getClass(), "vsRank", 0);
        setIntField(term495781, term495781.getClass(), "playerNum", 0);
        setLongField(term495781, term495781.getClass(), "playedUserId1", 0L);
        setField(term495781, term495781.getClass(), "playedUserName1", null);
        setIntField(term495781, term495781.getClass(), "playedMusicLevel1", 0);
        setLongField(term495781, term495781.getClass(), "playedUserId2", 0L);
        setField(term495781, term495781.getClass(), "playedUserName2", null);
        setIntField(term495781, term495781.getClass(), "playedMusicLevel2", 0);
        setLongField(term495781, term495781.getClass(), "playedUserId3", 0L);
        setField(term495781, term495781.getClass(), "playedUserName3", null);
        setIntField(term495781, term495781.getClass(), "playedMusicLevel3", 0);
        setIntField(term495781, term495781.getClass(), "characterId1", 0);
        setIntField(term495781, term495781.getClass(), "characterLevel1", 0);
        setIntField(term495781, term495781.getClass(), "characterAwakening1", 0);
        setIntField(term495781, term495781.getClass(), "characterId2", 0);
        setIntField(term495781, term495781.getClass(), "characterLevel2", 0);
        setIntField(term495781, term495781.getClass(), "characterAwakening2", 0);
        setIntField(term495781, term495781.getClass(), "characterId3", 0);
        setIntField(term495781, term495781.getClass(), "characterLevel3", 0);
        setIntField(term495781, term495781.getClass(), "characterAwakening3", 0);
        setIntField(term495781, term495781.getClass(), "characterId4", 0);
        setIntField(term495781, term495781.getClass(), "characterLevel4", 0);
        setIntField(term495781, term495781.getClass(), "characterAwakening4", 0);
        setIntField(term495781, term495781.getClass(), "characterId5", 0);
        setIntField(term495781, term495781.getClass(), "characterLevel5", 0);
        setIntField(term495781, term495781.getClass(), "characterAwakening5", 0);
        setIntField(term495781, term495781.getClass(), "achievement", 0);
        setIntField(term495781, term495781.getClass(), "deluxscore", 0);
        setIntField(term495781, term495781.getClass(), "scoreRank", 0);
        setIntField(term495781, term495781.getClass(), "maxCombo", 0);
        setIntField(term495781, term495781.getClass(), "totalCombo", 0);
        setIntField(term495781, term495781.getClass(), "maxSync", 0);
        setIntField(term495781, term495781.getClass(), "totalSync", 0);
        setIntField(term495781, term495781.getClass(), "tapCriticalPerfect", 0);
        setIntField(term495781, term495781.getClass(), "tapPerfect", 0);
        setIntField(term495781, term495781.getClass(), "tapGreat", 0);
        setIntField(term495781, term495781.getClass(), "tapGood", 0);
        setIntField(term495781, term495781.getClass(), "tapMiss", 0);
        setIntField(term495781, term495781.getClass(), "holdCriticalPerfect", 0);
        setIntField(term495781, term495781.getClass(), "holdPerfect", 0);
        setIntField(term495781, term495781.getClass(), "holdGreat", 0);
        setIntField(term495781, term495781.getClass(), "holdGood", 0);
        setIntField(term495781, term495781.getClass(), "holdMiss", 0);
        setIntField(term495781, term495781.getClass(), "slideCriticalPerfect", 0);
        setIntField(term495781, term495781.getClass(), "slidePerfect", 0);
        setIntField(term495781, term495781.getClass(), "slideGreat", 0);
        setIntField(term495781, term495781.getClass(), "slideGood", 0);
        setIntField(term495781, term495781.getClass(), "slideMiss", 0);
        setIntField(term495781, term495781.getClass(), "touchCriticalPerfect", 0);
        setIntField(term495781, term495781.getClass(), "touchPerfect", 0);
        setIntField(term495781, term495781.getClass(), "touchGreat", 0);
        setIntField(term495781, term495781.getClass(), "touchGood", 0);
        setIntField(term495781, term495781.getClass(), "touchMiss", 0);
        setIntField(term495781, term495781.getClass(), "breakCriticalPerfect", 0);
        setIntField(term495781, term495781.getClass(), "breakPerfect", 0);
        setIntField(term495781, term495781.getClass(), "breakGreat", 0);
        setIntField(term495781, term495781.getClass(), "breakGood", 0);
        setIntField(term495781, term495781.getClass(), "breakMiss", 0);
        setBooleanField(term495781, term495781.getClass(), "isTap", false);
        setBooleanField(term495781, term495781.getClass(), "isHold", false);
        setBooleanField(term495781, term495781.getClass(), "isSlide", false);
        setBooleanField(term495781, term495781.getClass(), "isTouch", false);
        setBooleanField(term495781, term495781.getClass(), "isBreak", false);
        setBooleanField(term495781, term495781.getClass(), "isCriticalDisp", false);
        setBooleanField(term495781, term495781.getClass(), "isFastLateDisp", false);
        setIntField(term495781, term495781.getClass(), "fastCount", 0);
        setIntField(term495781, term495781.getClass(), "lateCount", 0);
        setBooleanField(term495781, term495781.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term495781, term495781.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term495781, term495781.getClass(), "comboStatus", 0);
        setIntField(term495781, term495781.getClass(), "syncStatus", 0);
        setBooleanField(term495781, term495781.getClass(), "isClear", false);
        setIntField(term495781, term495781.getClass(), "beforeRating", 0);
        setIntField(term495781, term495781.getClass(), "afterRating", 0);
        setIntField(term495781, term495781.getClass(), "beforeGrade", 0);
        setIntField(term495781, term495781.getClass(), "afterGrade", 0);
        setIntField(term495781, term495781.getClass(), "afterGradeRank", 0);
        setIntField(term495781, term495781.getClass(), "beforeDeluxRating", 0);
        setIntField(term495781, term495781.getClass(), "afterDeluxRating", 0);
        setBooleanField(term495781, term495781.getClass(), "isPlayTutorial", false);
        setBooleanField(term495781, term495781.getClass(), "isEventMode", false);
        setBooleanField(term495781, term495781.getClass(), "isFreedomMode", false);
        setIntField(term495781, term495781.getClass(), "playMode", 0);
        setBooleanField(term495781, term495781.getClass(), "isNewFree", false);
        setIntField(term495781, term495781.getClass(), "trialPlayAchievement", 0);
        setIntField(term495781, term495781.getClass(), "extNum1", 0);
        setIntField(term495781, term495781.getClass(), "extNum2", 0);
        term495881 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term495881;
        callMethod(klass, "setSyncStatus", argTypes, term495781, args);
    }

};


