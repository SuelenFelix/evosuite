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

public class UserPlaylog_isHold_1638780738299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483817;

    public UserPlaylog_isHold_1638780738299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term483817 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term483817, term483817.getClass(), "id", 0L);
        setField(term483817, term483817.getClass(), "user", null);
        setIntField(term483817, term483817.getClass(), "orderId", 0);
        setLongField(term483817, term483817.getClass(), "playlogId", 0L);
        setIntField(term483817, term483817.getClass(), "version", 0);
        setIntField(term483817, term483817.getClass(), "placeId", 0);
        setField(term483817, term483817.getClass(), "placeName", null);
        setLongField(term483817, term483817.getClass(), "loginDate", 0L);
        setField(term483817, term483817.getClass(), "playDate", null);
        setField(term483817, term483817.getClass(), "userPlayDate", null);
        setIntField(term483817, term483817.getClass(), "type", 0);
        setIntField(term483817, term483817.getClass(), "musicId", 0);
        setIntField(term483817, term483817.getClass(), "level", 0);
        setIntField(term483817, term483817.getClass(), "trackNo", 0);
        setIntField(term483817, term483817.getClass(), "vsMode", 0);
        setField(term483817, term483817.getClass(), "vsUserName", null);
        setIntField(term483817, term483817.getClass(), "vsStatus", 0);
        setIntField(term483817, term483817.getClass(), "vsUserRating", 0);
        setIntField(term483817, term483817.getClass(), "vsUserAchievement", 0);
        setIntField(term483817, term483817.getClass(), "vsUserGradeRank", 0);
        setIntField(term483817, term483817.getClass(), "vsRank", 0);
        setIntField(term483817, term483817.getClass(), "playerNum", 0);
        setLongField(term483817, term483817.getClass(), "playedUserId1", 0L);
        setField(term483817, term483817.getClass(), "playedUserName1", null);
        setIntField(term483817, term483817.getClass(), "playedMusicLevel1", 0);
        setLongField(term483817, term483817.getClass(), "playedUserId2", 0L);
        setField(term483817, term483817.getClass(), "playedUserName2", null);
        setIntField(term483817, term483817.getClass(), "playedMusicLevel2", 0);
        setLongField(term483817, term483817.getClass(), "playedUserId3", 0L);
        setField(term483817, term483817.getClass(), "playedUserName3", null);
        setIntField(term483817, term483817.getClass(), "playedMusicLevel3", 0);
        setIntField(term483817, term483817.getClass(), "characterId1", 0);
        setIntField(term483817, term483817.getClass(), "characterLevel1", 0);
        setIntField(term483817, term483817.getClass(), "characterAwakening1", 0);
        setIntField(term483817, term483817.getClass(), "characterId2", 0);
        setIntField(term483817, term483817.getClass(), "characterLevel2", 0);
        setIntField(term483817, term483817.getClass(), "characterAwakening2", 0);
        setIntField(term483817, term483817.getClass(), "characterId3", 0);
        setIntField(term483817, term483817.getClass(), "characterLevel3", 0);
        setIntField(term483817, term483817.getClass(), "characterAwakening3", 0);
        setIntField(term483817, term483817.getClass(), "characterId4", 0);
        setIntField(term483817, term483817.getClass(), "characterLevel4", 0);
        setIntField(term483817, term483817.getClass(), "characterAwakening4", 0);
        setIntField(term483817, term483817.getClass(), "characterId5", 0);
        setIntField(term483817, term483817.getClass(), "characterLevel5", 0);
        setIntField(term483817, term483817.getClass(), "characterAwakening5", 0);
        setIntField(term483817, term483817.getClass(), "achievement", 0);
        setIntField(term483817, term483817.getClass(), "deluxscore", 0);
        setIntField(term483817, term483817.getClass(), "scoreRank", 0);
        setIntField(term483817, term483817.getClass(), "maxCombo", 0);
        setIntField(term483817, term483817.getClass(), "totalCombo", 0);
        setIntField(term483817, term483817.getClass(), "maxSync", 0);
        setIntField(term483817, term483817.getClass(), "totalSync", 0);
        setIntField(term483817, term483817.getClass(), "tapCriticalPerfect", 0);
        setIntField(term483817, term483817.getClass(), "tapPerfect", 0);
        setIntField(term483817, term483817.getClass(), "tapGreat", 0);
        setIntField(term483817, term483817.getClass(), "tapGood", 0);
        setIntField(term483817, term483817.getClass(), "tapMiss", 0);
        setIntField(term483817, term483817.getClass(), "holdCriticalPerfect", 0);
        setIntField(term483817, term483817.getClass(), "holdPerfect", 0);
        setIntField(term483817, term483817.getClass(), "holdGreat", 0);
        setIntField(term483817, term483817.getClass(), "holdGood", 0);
        setIntField(term483817, term483817.getClass(), "holdMiss", 0);
        setIntField(term483817, term483817.getClass(), "slideCriticalPerfect", 0);
        setIntField(term483817, term483817.getClass(), "slidePerfect", 0);
        setIntField(term483817, term483817.getClass(), "slideGreat", 0);
        setIntField(term483817, term483817.getClass(), "slideGood", 0);
        setIntField(term483817, term483817.getClass(), "slideMiss", 0);
        setIntField(term483817, term483817.getClass(), "touchCriticalPerfect", 0);
        setIntField(term483817, term483817.getClass(), "touchPerfect", 0);
        setIntField(term483817, term483817.getClass(), "touchGreat", 0);
        setIntField(term483817, term483817.getClass(), "touchGood", 0);
        setIntField(term483817, term483817.getClass(), "touchMiss", 0);
        setIntField(term483817, term483817.getClass(), "breakCriticalPerfect", 0);
        setIntField(term483817, term483817.getClass(), "breakPerfect", 0);
        setIntField(term483817, term483817.getClass(), "breakGreat", 0);
        setIntField(term483817, term483817.getClass(), "breakGood", 0);
        setIntField(term483817, term483817.getClass(), "breakMiss", 0);
        setBooleanField(term483817, term483817.getClass(), "isTap", false);
        setBooleanField(term483817, term483817.getClass(), "isHold", false);
        setBooleanField(term483817, term483817.getClass(), "isSlide", false);
        setBooleanField(term483817, term483817.getClass(), "isTouch", false);
        setBooleanField(term483817, term483817.getClass(), "isBreak", false);
        setBooleanField(term483817, term483817.getClass(), "isCriticalDisp", false);
        setBooleanField(term483817, term483817.getClass(), "isFastLateDisp", false);
        setIntField(term483817, term483817.getClass(), "fastCount", 0);
        setIntField(term483817, term483817.getClass(), "lateCount", 0);
        setBooleanField(term483817, term483817.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term483817, term483817.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term483817, term483817.getClass(), "comboStatus", 0);
        setIntField(term483817, term483817.getClass(), "syncStatus", 0);
        setBooleanField(term483817, term483817.getClass(), "isClear", false);
        setIntField(term483817, term483817.getClass(), "beforeRating", 0);
        setIntField(term483817, term483817.getClass(), "afterRating", 0);
        setIntField(term483817, term483817.getClass(), "beforeGrade", 0);
        setIntField(term483817, term483817.getClass(), "afterGrade", 0);
        setIntField(term483817, term483817.getClass(), "afterGradeRank", 0);
        setIntField(term483817, term483817.getClass(), "beforeDeluxRating", 0);
        setIntField(term483817, term483817.getClass(), "afterDeluxRating", 0);
        setBooleanField(term483817, term483817.getClass(), "isPlayTutorial", false);
        setBooleanField(term483817, term483817.getClass(), "isEventMode", false);
        setBooleanField(term483817, term483817.getClass(), "isFreedomMode", false);
        setIntField(term483817, term483817.getClass(), "playMode", 0);
        setBooleanField(term483817, term483817.getClass(), "isNewFree", false);
        setIntField(term483817, term483817.getClass(), "trialPlayAchievement", 0);
        setIntField(term483817, term483817.getClass(), "extNum1", 0);
        setIntField(term483817, term483817.getClass(), "extNum2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHold", argTypes, term483817, args);
    }

};


